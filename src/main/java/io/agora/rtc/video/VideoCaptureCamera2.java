package io.agora.rtc.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

@TargetApi(21)
public class VideoCaptureCamera2 extends VideoCapture {
    public static final MeteringRectangle[] ZERO_WEIGHT_3A_REGION;
    public MeteringRectangle[] mAFAERegions = ZERO_WEIGHT_3A_REGION;
    private CameraCaptureSession.CaptureCallback mAfCaptureCallback = new CameraCaptureSession.CaptureCallback() {
        private void process(CaptureResult captureResult) {
            Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num != null) {
                if (4 == num.intValue() || 5 == num.intValue()) {
                    VideoCaptureCamera2.this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    VideoCaptureCamera2.this.startNormalPreview();
                }
            }
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            process(totalCaptureResult);
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            process(captureResult);
        }
    };
    public CameraManager.AvailabilityCallback mAvailabilityCallback = new CameraManager.AvailabilityCallback() {
        public synchronized void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            if (VideoCaptureCamera2.this.mCameraState == CameraState.EVICTED && VideoCaptureCamera2.this.tryOpenCamera() != 0) {
                Logging.e("CAMERA2", "start capture failed");
            }
        }

        public synchronized void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            Logging.e("CAMERA2", "Camera " + str + " unavailable");
        }
    };
    public CameraDevice mCameraDevice;
    public CameraState mCameraState = CameraState.STOPPED;
    private final Object mCameraStateLock = new Object();
    public final CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() {
        private long mLastFocusedTs;

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        private void process(CaptureResult captureResult) {
            Face[] faceArr = (Face[]) captureResult.get(CaptureResult.STATISTICS_FACES);
            if (faceArr == null || faceArr.length <= 0) {
                VideoCaptureCamera2.this.mAFAERegions = VideoCaptureCamera2.ZERO_WEIGHT_3A_REGION;
            } else if (System.currentTimeMillis() - this.mLastFocusedTs >= 3000 && faceArr[0].getScore() > 50) {
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                videoCaptureCamera2.mAFAERegions = new MeteringRectangle[]{new MeteringRectangle(faceArr[0].getBounds(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)};
                VideoCaptureCamera2.this.addRegionsToCaptureRequestBuilder(VideoCaptureCamera2.this.mPreviewBuilder);
                if (VideoCaptureCamera2.this.mCameraState == CameraState.STARTED) {
                    try {
                        VideoCaptureCamera2.this.mCaptureSession.capture(VideoCaptureCamera2.this.mPreviewBuilder.build(), VideoCaptureCamera2.this.mCaptureCallback, null);
                        VideoCaptureCamera2.this.createCaptureRequest();
                        this.mLastFocusedTs = System.currentTimeMillis();
                    } catch (Exception e2) {
                        Logging.e("CAMERA2", "capture: " + e2);
                    }
                }
            }
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            if (VideoCaptureCamera2.this.mIsAutoFaceFocusEnabled) {
                process(totalCaptureResult);
            }
        }
    };
    public byte[] mCaptureData;
    private int mCaptureFormat = 35;
    private int mCaptureFps = -1;
    private int mCaptureHeight = -1;
    public CameraCaptureSession mCaptureSession;
    private int mCaptureWidth = -1;
    private float mCurZoomRatio = 1.0f;
    public int mExpectedFrameSize = 0;
    private int mFaceDetectMode;
    private boolean mFaceDetectSupported;
    private ImageReader mImageReader;
    public boolean mIsAutoFaceFocusEnabled = false;
    private float mLastZoomRatio = -1.0f;
    private Handler mMainHandler = new Handler(this.mContext.getMainLooper());
    private CameraManager mManager;
    private float mMaxZoom = -1.0f;
    public CaptureRequest.Builder mPreviewBuilder;
    private HandlerThread mPreviewThread = null;
    private Rect mSensorRect = null;

    enum CameraState {
        OPENING,
        STARTED,
        EVICTED,
        STOPPED
    }

    class CaptureSessionListener extends CameraCaptureSession.StateCallback {
        private CaptureSessionListener() {
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Logging.e("CAMERA2", "onConfigureFailed");
            if (VideoCaptureCamera2.this.mCameraState != CameraState.EVICTED) {
                VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
            }
            VideoCaptureCamera2.this.onCameraError(VideoCaptureCamera2.this.mNativeVideoCaptureDeviceAndroid, "Camera session configuration error");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            VideoCaptureCamera2.this.mCaptureSession = cameraCaptureSession;
            if (VideoCaptureCamera2.this.createCaptureRequest() != 0) {
                VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
                VideoCaptureCamera2.this.onCameraError(VideoCaptureCamera2.this.mNativeVideoCaptureDeviceAndroid, "Fail to setup capture session");
                return;
            }
            VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STARTED);
        }
    }

    class CrStateListener extends CameraDevice.StateCallback {
        private CrStateListener() {
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            if (VideoCaptureCamera2.this.mCameraState != CameraState.STOPPED) {
                Logging.w("CAMERA2", "camera client is evicted by other application");
                VideoCaptureCamera2.this.onCameraError(VideoCaptureCamera2.this.mNativeVideoCaptureDeviceAndroid, "Camera device evicted by other application");
                Logging.i("CAMERA2", "Camera device enter state: EVICTED");
                if (VideoCaptureCamera2.this.mCameraDevice != null) {
                    VideoCaptureCamera2.this.mCameraDevice.close();
                    VideoCaptureCamera2.this.mCameraDevice = null;
                }
                VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.EVICTED);
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            VideoCaptureCamera2.this.mCameraDevice = cameraDevice;
            if (VideoCaptureCamera2.this.doStartCapture() < 0) {
                if (VideoCaptureCamera2.this.mCameraState != CameraState.EVICTED) {
                    VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
                }
                Logging.e("CAMERA2", "Camera startCapture failed!!");
                VideoCaptureCamera2.this.onCameraError(VideoCaptureCamera2.this.mNativeVideoCaptureDeviceAndroid, "Error configuring camera");
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            if (VideoCaptureCamera2.this.mCameraState != CameraState.EVICTED) {
                if (VideoCaptureCamera2.this.mCameraDevice != null) {
                    VideoCaptureCamera2.this.mCameraDevice.close();
                    VideoCaptureCamera2.this.mCameraDevice = null;
                }
                VideoCaptureCamera2.this.changeCameraStateAndNotify(CameraState.STOPPED);
                Logging.e("CAMERA2", "CameraDevice Error :" + Integer.toString(i));
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                long j = VideoCaptureCamera2.this.mNativeVideoCaptureDeviceAndroid;
                videoCaptureCamera2.onCameraError(j, "Camera device error" + Integer.toString(i));
            }
        }
    }

    class ImageReaderListener implements ImageReader.OnImageAvailableListener {
        private ImageReaderListener() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onImageAvailable(android.media.ImageReader r7) {
            /*
                r6 = this;
                r0 = 0
                android.media.Image r1 = r7.acquireLatestImage()     // Catch:{ IllegalStateException -> 0x00d2 }
                if (r1 != 0) goto L_0x000d
                if (r1 == 0) goto L_0x000c
                r1.close()
            L_0x000c:
                return
            L_0x000d:
                int r0 = r1.getFormat()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r2 = 35
                if (r0 != r2) goto L_0x00a0
                android.media.Image$Plane[] r0 = r1.getPlanes()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r0 = r0.length     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r2 = 3
                if (r0 == r2) goto L_0x001f
                goto L_0x00a0
            L_0x001f:
                int r0 = r7.getWidth()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r2 = r1.getWidth()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                if (r0 != r2) goto L_0x0064
                int r0 = r7.getHeight()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r2 = r1.getHeight()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                if (r0 != r2) goto L_0x0064
                io.agora.rtc.video.VideoCaptureCamera2 r7 = io.agora.rtc.video.VideoCaptureCamera2.this     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                byte[] r7 = r7.mCaptureData     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                io.agora.rtc.video.VideoCaptureCamera2.readImageIntoBuffer(r1, r7)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                io.agora.rtc.video.VideoCaptureCamera2 r7 = io.agora.rtc.video.VideoCaptureCamera2.this     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                long r2 = r7.mNativeVideoCaptureDeviceAndroid     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r4 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L_0x0056
                io.agora.rtc.video.VideoCaptureCamera2 r7 = io.agora.rtc.video.VideoCaptureCamera2.this     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                io.agora.rtc.video.VideoCaptureCamera2 r0 = io.agora.rtc.video.VideoCaptureCamera2.this     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                byte[] r0 = r0.mCaptureData     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                io.agora.rtc.video.VideoCaptureCamera2 r2 = io.agora.rtc.video.VideoCaptureCamera2.this     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r2 = r2.mExpectedFrameSize     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                io.agora.rtc.video.VideoCaptureCamera2 r3 = io.agora.rtc.video.VideoCaptureCamera2.this     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                long r3 = r3.mNativeVideoCaptureDeviceAndroid     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r7.ProvideCameraFrame(r0, r2, r3)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                goto L_0x005d
            L_0x0056:
                java.lang.String r7 = "CAMERA2"
                java.lang.String r0 = "warning mNativeVideoCaptureDeviceAndroid = 0, error"
                io.agora.rtc.internal.Logging.w(r7, r0)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
            L_0x005d:
                if (r1 == 0) goto L_0x0063
                r1.close()
                return
            L_0x0063:
                return
            L_0x0064:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r3 = "ImageReader size "
                r2.<init>(r3)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r3 = r7.getWidth()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r2.append(r3)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r3 = "x"
                r2.append(r3)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r7 = r7.getHeight()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r2.append(r7)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r7 = " did not match Image size: "
                r2.append(r7)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r7 = r1.getWidth()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r2.append(r7)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r7 = "x"
                r2.append(r7)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r7 = r1.getHeight()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r2.append(r7)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r7 = r2.toString()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r0.<init>(r7)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                throw r0     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
            L_0x00a0:
                java.lang.String r7 = "CAMERA2"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r2 = "Unexpected image format: "
                r0.<init>(r2)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r2 = r1.getFormat()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r0.append(r2)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r2 = "or #planes:"
                r0.append(r2)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                android.media.Image$Plane[] r2 = r1.getPlanes()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                int r2 = r2.length     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                r0.append(r2)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                java.lang.String r0 = r0.toString()     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                io.agora.rtc.internal.Logging.e(r7, r0)     // Catch:{ IllegalStateException -> 0x00cc, all -> 0x00ca }
                if (r1 == 0) goto L_0x00c9
                r1.close()
            L_0x00c9:
                return
            L_0x00ca:
                r7 = move-exception
                goto L_0x00e0
            L_0x00cc:
                r7 = move-exception
                r0 = r1
                goto L_0x00d3
            L_0x00cf:
                r7 = move-exception
                r1 = r0
                goto L_0x00e0
            L_0x00d2:
                r7 = move-exception
            L_0x00d3:
                java.lang.String r1 = "CAMERA2"
                java.lang.String r2 = "acquireLastest Image():"
                io.agora.rtc.internal.Logging.e(r1, r2, r7)     // Catch:{ all -> 0x00cf }
                if (r0 == 0) goto L_0x00df
                r0.close()
            L_0x00df:
                return
            L_0x00e0:
                if (r1 == 0) goto L_0x00e5
                r1.close()
            L_0x00e5:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.video.VideoCaptureCamera2.ImageReaderListener.onImageAvailable(android.media.ImageReader):void");
        }
    }

    public void deallocate() {
        this.mManager.unregisterAvailabilityCallback(this.mAvailabilityCallback);
    }

    static {
        MeteringRectangle meteringRectangle = new MeteringRectangle(0, 0, 0, 0, 0);
        ZERO_WEIGHT_3A_REGION = new MeteringRectangle[]{meteringRectangle};
    }

    private int doStopCapture() {
        if (this.mPreviewThread != null) {
            this.mPreviewThread.quitSafely();
            this.mPreviewThread = null;
        }
        try {
            this.mCaptureSession.abortCaptures();
            if (this.mCameraDevice != null) {
                this.mCameraDevice.close();
                this.mCameraDevice = null;
            }
            return 0;
        } catch (CameraAccessException e2) {
            Logging.e("CAMERA2", "abortCaptures: ", e2);
            return -1;
        } catch (IllegalStateException e3) {
            Logging.e("CAMERA2", "abortCaptures: ", e3);
            return -1;
        }
    }

    private boolean isMeteringAreaAFSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w("CAMERA2", "warning cameraCharacteristics is null");
            return false;
        } else if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public float getMaxZoom() {
        if (this.mMaxZoom <= 0.0f) {
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
            if (cameraCharacteristics == null) {
                Logging.w("CAMERA2", "warning cameraCharacteristics is null");
                return -1.0f;
            }
            this.mMaxZoom = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        return this.mMaxZoom;
    }

    public boolean isAutoFaceFocusSupported() {
        if (!isFocusSupported()) {
            return false;
        }
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w("CAMERA2", "warning cameraCharacteristics is null");
            return false;
        } else if (((Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFocusSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w("CAMERA2", "warning cameraCharacteristics is null");
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                if (1 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isTorchSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        boolean z = false;
        if (cameraCharacteristics == null) {
            Logging.w("CAMERA2", "warning cameraCharacteristics is null");
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null) {
            z = bool.booleanValue();
        }
        return z;
    }

    public boolean isZoomSupported() {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w("CAMERA2", "warning cameraCharacteristics is null");
            return false;
        } else if (((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue() > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public int tryOpenCamera() {
        try {
            this.mManager.openCamera(Integer.toString(this.mId), new CrStateListener(), this.mMainHandler);
            return 0;
        } catch (CameraAccessException e2) {
            Logging.e("CAMERA2", "allocate: manager.openCamera: ", e2);
            return -1;
        } catch (IllegalArgumentException e3) {
            Logging.e("CAMERA2", "allocate: manager.openCamera: ", e3);
            return -2;
        } catch (SecurityException e4) {
            Logging.e("CAMERA2", "allocate: manager.openCamera: ", e4);
            return -3;
        } catch (Exception e5) {
            Logging.e("CAMERA2", "unknown error", e5);
            return -4;
        }
    }

    public int createCaptureRequest() {
        try {
            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, null);
            return 0;
        } catch (CameraAccessException e2) {
            Logging.e("CAMERA2", "setRepeatingRequest: ", e2);
            return -1;
        } catch (IllegalArgumentException e3) {
            Logging.e("CAMERA2", "setRepeatingRequest: ", e3);
            return -2;
        } catch (SecurityException e4) {
            Logging.e("CAMERA2", "setRepeatingRequest: ", e4);
            return -3;
        } catch (IllegalStateException e5) {
            Logging.e("CAMERA2", "capture:" + e5);
            return -4;
        }
    }

    public void startNormalPreview() {
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        try {
            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, new Handler(this.mPreviewThread.getLooper()));
        } catch (CameraAccessException e2) {
            Logging.e("CAMERA2", "setRepeatingRequest failed, error message : " + e2.getMessage());
        }
    }

    public int stopCapture() {
        synchronized (this.mCameraStateLock) {
            while (this.mCameraState != CameraState.STARTED && this.mCameraState != CameraState.EVICTED && this.mCameraState != CameraState.STOPPED) {
                try {
                    this.mCameraStateLock.wait();
                } catch (InterruptedException e2) {
                    Logging.e("CAMERA2", "CaptureStartedEvent: ", e2);
                }
            }
            if (this.mCameraState == CameraState.EVICTED) {
                this.mCameraState = CameraState.STOPPED;
            }
            if (this.mCameraState == CameraState.STOPPED) {
                return 0;
            }
            doStopCapture();
            changeCameraStateAndNotify(CameraState.STOPPED);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r0 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (io.agora.rtc.video.VideoCapture.fetchCapability(r8.mId, r8.mContext) != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        createCapabilities(r8.mId, r8.mContext);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r8.mCameraNativeOrientation = ((java.lang.Integer) r0.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        r8.mManager = (android.hardware.camera2.CameraManager) r8.mContext.getSystemService("camera");
        r1 = (int[]) r0.get(android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        r0 = ((java.lang.Integer) r0.get(android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (r1.length <= 1) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r0 <= 0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r8.mFaceDetectSupported = true;
        r2 = r1.length;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (r5 >= r2) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r6 = r6 + r1[r5];
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if ((r6 % 2) == 0) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r8.mFaceDetectMode = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r8.mFaceDetectMode = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        io.agora.rtc.internal.Logging.i("CAMERA2", "allocate() face detection: " + r8.mFaceDetectMode + " " + r0 + " " + r8.mFaceDetectSupported);
        r8.mManager.registerAvailabilityCallback(r8.mAvailabilityCallback, r8.mMainHandler);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = getCameraCharacteristics(r8.mContext, r8.mId);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int allocate() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.mCameraStateLock
            monitor-enter(r0)
            io.agora.rtc.video.VideoCaptureCamera2$CameraState r1 = r8.mCameraState     // Catch:{ all -> 0x00ac }
            io.agora.rtc.video.VideoCaptureCamera2$CameraState r2 = io.agora.rtc.video.VideoCaptureCamera2.CameraState.OPENING     // Catch:{ all -> 0x00ac }
            r3 = -1
            if (r1 != r2) goto L_0x0013
            java.lang.String r1 = "CAMERA2"
            java.lang.String r2 = "allocate() invoked while Camera is busy opening/configuring"
            io.agora.rtc.internal.Logging.e(r1, r2)     // Catch:{ all -> 0x00ac }
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            return r3
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            android.content.Context r0 = r8.mContext
            int r1 = r8.mId
            android.hardware.camera2.CameraCharacteristics r0 = getCameraCharacteristics(r0, r1)
            if (r0 != 0) goto L_0x001f
            return r3
        L_0x001f:
            int r1 = r8.mId
            android.content.Context r2 = r8.mContext
            java.lang.String r1 = io.agora.rtc.video.VideoCapture.fetchCapability(r1, r2)
            if (r1 != 0) goto L_0x0030
            int r1 = r8.mId
            android.content.Context r2 = r8.mContext
            createCapabilities(r1, r2)
        L_0x0030:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.mCameraNativeOrientation = r1
            android.content.Context r1 = r8.mContext
            java.lang.String r2 = "camera"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.camera2.CameraManager r1 = (android.hardware.camera2.CameraManager) r1
            r8.mManager = r1
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES
            java.lang.Object r1 = r0.get(r1)
            int[] r1 = (int[]) r1
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r2 = r1.length
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x007b
            if (r0 <= 0) goto L_0x007b
            r8.mFaceDetectSupported = r4
            int r2 = r1.length
            r5 = 0
            r6 = 0
        L_0x006a:
            if (r5 >= r2) goto L_0x0072
            r7 = r1[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L_0x006a
        L_0x0072:
            r1 = 2
            int r6 = r6 % r1
            if (r6 == 0) goto L_0x0079
            r8.mFaceDetectMode = r4
            goto L_0x007b
        L_0x0079:
            r8.mFaceDetectMode = r1
        L_0x007b:
            java.lang.String r1 = "CAMERA2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "allocate() face detection: "
            r2.<init>(r4)
            int r4 = r8.mFaceDetectMode
            r2.append(r4)
            java.lang.String r4 = " "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            boolean r0 = r8.mFaceDetectSupported
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            io.agora.rtc.internal.Logging.i(r1, r0)
            android.hardware.camera2.CameraManager r0 = r8.mManager
            android.hardware.camera2.CameraManager$AvailabilityCallback r1 = r8.mAvailabilityCallback
            android.os.Handler r2 = r8.mMainHandler
            r0.registerAvailabilityCallback(r1, r2)
            return r3
        L_0x00ac:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ac }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.video.VideoCaptureCamera2.allocate():int");
    }

    public int doStartCapture() {
        this.mExpectedFrameSize = ((this.mCaptureWidth * this.mCaptureHeight) * ImageFormat.getBitsPerPixel(this.mCaptureFormat)) / 8;
        this.mCaptureData = new byte[this.mExpectedFrameSize];
        this.mImageReader = ImageReader.newInstance(this.mCaptureWidth, this.mCaptureHeight, this.mCaptureFormat, 2);
        if (this.mPreviewThread == null) {
            this.mPreviewThread = new HandlerThread("CameraPreview");
            this.mPreviewThread.start();
        }
        Handler handler = new Handler(this.mPreviewThread.getLooper());
        this.mImageReader.setOnImageAvailableListener(new ImageReaderListener(), handler);
        try {
            this.mPreviewBuilder = this.mCameraDevice.createCaptureRequest(1);
            if (this.mPreviewBuilder == null) {
                Logging.e("CAMERA2", "mPreviewBuilder error");
                return -4;
            }
            this.mPreviewBuilder.addTarget(this.mImageReader.getSurface());
            this.mPreviewBuilder.set(CaptureRequest.CONTROL_MODE, 1);
            this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            setFaceDetect(this.mPreviewBuilder, this.mFaceDetectMode);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(this.mImageReader.getSurface());
            try {
                this.mCameraDevice.createCaptureSession(arrayList, new CaptureSessionListener(), null);
                return 0;
            } catch (CameraAccessException e2) {
                Logging.e("CAMERA2", "createCaptureSession :", e2);
                return -1;
            } catch (IllegalArgumentException e3) {
                Logging.e("CAMERA2", "createCaptureSession :", e3);
                return -2;
            } catch (SecurityException e4) {
                Logging.e("CAMERA2", "createCaptureSession :", e4);
                return -3;
            }
        } catch (CameraAccessException e5) {
            Logging.e("CAMERA2", "createCaptureRequest: ", e5);
            return -1;
        } catch (IllegalArgumentException e6) {
            Logging.e("CAMERA2", "createCaptureRequest: ", e6);
            return -2;
        } catch (SecurityException e7) {
            Logging.e("CAMERA2", "createCaptureRequest ", e7);
            return -3;
        }
    }

    public int setAutoFaceFocus(boolean z) {
        this.mIsAutoFaceFocusEnabled = z;
        return 0;
    }

    public void changeCameraStateAndNotify(CameraState cameraState) {
        synchronized (this.mCameraStateLock) {
            this.mCameraState = cameraState;
            this.mCameraStateLock.notifyAll();
        }
    }

    static int getNumberOfCameras(Context context) {
        try {
            return ((CameraManager) context.getSystemService("camera")).getCameraIdList().length;
        } catch (Exception e2) {
            Logging.e("CAMERA2", "getNumberOfCameras: getCameraIdList(): ", e2);
            return 0;
        }
    }

    public int setCaptureFormat(int i) {
        if (translateToAndroidFormat(i) == this.mCaptureFormat) {
            return 0;
        }
        Logging.e("CAMERA2", "For camera2 api, only YUV_420_888 format are supported");
        return -1;
    }

    private Rect cropRegionForZoom(float f2) {
        int width = this.mSensorRect.width() / 2;
        int height = this.mSensorRect.height() / 2;
        int width2 = (int) ((((float) this.mSensorRect.width()) * 0.5f) / f2);
        int height2 = (int) ((((float) this.mSensorRect.height()) * 0.5f) / f2);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }

    public void addRegionsToCaptureRequestBuilder(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, this.mAFAERegions);
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, this.mAFAERegions);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
    }

    public int setTorchMode(boolean z) {
        boolean z2;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
        if (cameraCharacteristics == null) {
            Logging.w("CAMERA2", "warning cameraCharacteristics is null");
            return -1;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        if (z2) {
            Handler handler = new Handler(this.mPreviewThread.getLooper());
            if (z) {
                this.mPreviewBuilder.set(CaptureRequest.FLASH_MODE, 2);
            } else {
                this.mPreviewBuilder.set(CaptureRequest.FLASH_MODE, 0);
            }
            try {
                this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), null, handler);
                return 0;
            } catch (CameraAccessException unused) {
            }
        } else {
            Logging.w("CAMERA2", "flash is not supported");
            return -1;
        }
    }

    public int setZoom(float f2) {
        boolean z;
        if (this.mSensorRect == null) {
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mContext, this.mId);
            if (cameraCharacteristics == null) {
                Logging.w("CAMERA2", "warning cameraCharacteristics is null");
                return -1;
            }
            this.mSensorRect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.mMaxZoom = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        if (Math.abs(this.mMaxZoom - 1.0f) < 0.001f) {
            Logging.w("CAMERA2", "Camera " + this.mId + " does not support camera zoom");
            return -1;
        }
        this.mCurZoomRatio = f2;
        if (this.mCurZoomRatio <= 1.0f || this.mCurZoomRatio > this.mMaxZoom || this.mCurZoomRatio == this.mLastZoomRatio) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return -2;
        }
        this.mPreviewBuilder.set(CaptureRequest.SCALER_CROP_REGION, cropRegionForZoom(this.mCurZoomRatio));
        this.mLastZoomRatio = this.mCurZoomRatio;
        try {
            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mCaptureCallback, new Handler(this.mPreviewThread.getLooper()));
            return 0;
        } catch (CameraAccessException unused) {
            return -3;
        }
    }

    private void setFaceDetect(CaptureRequest.Builder builder, int i) {
        if (this.mFaceDetectSupported) {
            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(i));
        }
    }

    static int getSensorOrientation(int i, Context context) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
        if (cameraCharacteristics == null) {
            return -1;
        }
        return ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    private static CameraCharacteristics getCameraCharacteristics(Context context, int i) {
        try {
            return ((CameraManager) context.getSystemService("camera")).getCameraCharacteristics(Integer.toString(i));
        } catch (CameraAccessException e2) {
            Logging.i("CAMERA2", "getNumberOfCameras: getCameraIdList(): " + e2);
            return null;
        } catch (Exception e3) {
            Logging.i("CAMERA2", "getNumberOfCameras: got exception: " + e3);
            return null;
        }
    }

    static String getName(int i, Context context) {
        String str;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
        if (cameraCharacteristics == null) {
            return null;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
        StringBuilder sb = new StringBuilder("camera2 ");
        sb.append(i);
        sb.append(", facing ");
        if (intValue == 0) {
            str = "front";
        } else {
            str = "back";
        }
        sb.append(str);
        return sb.toString();
    }

    static boolean isLegacyDevice(Context context, int i) {
        try {
            CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
            if (cameraCharacteristics == null || ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() != 2) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            Logging.w("CAMERA2", "this is a legacy camera device");
            return true;
        }
    }

    public static void readImageIntoBuffer(Image image, byte[] bArr) {
        int i;
        int i2;
        byte[] bArr2 = bArr;
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        int i3 = 0;
        for (int i4 = 0; i4 < planes.length; i4++) {
            ByteBuffer buffer = planes[i4].getBuffer();
            int rowStride = planes[i4].getRowStride();
            int pixelStride = planes[i4].getPixelStride();
            if (i4 == 0) {
                i = width;
            } else {
                i = width / 2;
            }
            if (i4 == 0) {
                i2 = height;
            } else {
                i2 = height / 2;
            }
            if (pixelStride == 1 && rowStride == i) {
                int i5 = i * i2;
                buffer.get(bArr2, i3, i5);
                i3 += i5;
            } else {
                byte[] bArr3 = new byte[rowStride];
                int i6 = i3;
                int i7 = 0;
                while (i7 < i2 - 1) {
                    buffer.get(bArr3, 0, rowStride);
                    int i8 = i6;
                    int i9 = 0;
                    while (i9 < i) {
                        bArr2[i8] = bArr3[i9 * pixelStride];
                        i9++;
                        i8++;
                    }
                    i7++;
                    i6 = i8;
                }
                buffer.get(bArr3, 0, Math.min(rowStride, buffer.remaining()));
                int i10 = 0;
                while (i10 < i) {
                    bArr2[i6] = bArr3[i10 * pixelStride];
                    i10++;
                    i6++;
                }
                i3 = i6;
            }
        }
    }

    public static int createCapabilities(int i, Context context) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(context, i);
        if (cameraCharacteristics == null) {
            return -1;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            Logging.e("CAMERA2", "Failed to create capabilities");
            return -1;
        }
        Logging.e("CAMERA2", "dump configuration map:" + streamConfigurationMap.toString());
        ArrayList arrayList = new ArrayList(Arrays.asList(streamConfigurationMap.getOutputSizes(35)));
        String str = "\"id\":" + i + ",";
        String str2 = "";
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str3 = "{\"w\":" + ((Size) arrayList.get(i2)).getWidth() + ",\"h\":" + ((Size) arrayList.get(i2)).getHeight() + "}";
            if (i2 != arrayList.size() - 1) {
                str2 = str2 + str3 + ",";
            } else {
                str2 = str2 + str3;
            }
        }
        String str4 = translateToEngineFormat(35);
        cacheCapability(i, context, "{" + str + "\"resolution\":" + "[" + str2 + "]," + "\"format\":" + "[" + str4 + "]," + "\"fps\":" + "[" + "30" + "]}");
        return 0;
    }

    private static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    VideoCaptureCamera2(Context context, int i, long j) {
        super(context, i, j);
    }

    public int startCapture(int i, int i2, int i3) {
        Logging.d("CAMERA2", "startCapture, w=" + i + ", h=" + i2 + ", fps=" + i3);
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        this.mCaptureFps = i3;
        synchronized (this.mCameraStateLock) {
            while (this.mCameraState != CameraState.STARTED && this.mCameraState != CameraState.EVICTED && this.mCameraState != CameraState.STOPPED) {
                try {
                    this.mCameraStateLock.wait();
                } catch (InterruptedException e2) {
                    Logging.e("CAMERA2", "CaptureStartedEvent: ", e2);
                }
            }
            if (this.mCameraState == CameraState.STARTED) {
                return 0;
            }
            changeCameraStateAndNotify(CameraState.OPENING);
            return tryOpenCamera();
        }
    }

    public int setFocus(float f2, float f3, int i, int i2, int i3, int i4, boolean z) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        int i5 = i;
        int i6 = i2;
        double d11 = (double) f2;
        double d12 = (double) f3;
        int i7 = this.mCaptureHeight;
        int i8 = this.mCaptureWidth;
        switch (i3) {
            case 1:
                if (i8 * i5 > i7 * i6) {
                    double d13 = (double) i5;
                    Double.isNaN(d13);
                    double d14 = (double) i7;
                    Double.isNaN(d14);
                    d7 = (d13 * 1.0d) / d14;
                    double d15 = (double) i8;
                    double d16 = (double) i6;
                    Double.isNaN(d16);
                    Double.isNaN(d15);
                    d6 = (d15 - (d16 / d7)) / 2.0d;
                    d8 = 0.0d;
                } else {
                    double d17 = (double) i6;
                    Double.isNaN(d17);
                    double d18 = (double) i8;
                    Double.isNaN(d18);
                    d7 = (d17 * 1.0d) / d18;
                    double d19 = (double) i7;
                    double d20 = (double) i5;
                    Double.isNaN(d20);
                    Double.isNaN(d19);
                    d8 = (d19 - (d20 / d7)) / 2.0d;
                    d6 = 0.0d;
                }
                Double.isNaN(d11);
                d11 = (d11 / d7) + d8;
                Double.isNaN(d12);
                d12 = (d12 / d7) + d6;
                break;
            case 2:
                if (i8 * i5 > i7 * i6) {
                    double d21 = (double) i6;
                    Double.isNaN(d21);
                    double d22 = (double) i8;
                    Double.isNaN(d22);
                    double d23 = (d21 * 1.0d) / d22;
                    double d24 = (double) i5;
                    double d25 = (double) i7;
                    Double.isNaN(d25);
                    Double.isNaN(d24);
                    d9 = (d24 - (d25 / d23)) / 2.0d;
                    d10 = 0.0d;
                } else {
                    double d26 = (double) i5;
                    Double.isNaN(d26);
                    double d27 = (double) i7;
                    Double.isNaN(d27);
                    double d28 = (d26 * 1.0d) / d27;
                    double d29 = (double) i6;
                    double d30 = (double) i8;
                    Double.isNaN(d30);
                    Double.isNaN(d29);
                    d10 = (d29 - (d30 / d28)) / 2.0d;
                    d9 = 0.0d;
                }
                Double.isNaN(d11);
                d11 -= d9;
                Double.isNaN(d12);
                d12 -= d10;
                break;
        }
        Rect rect = (Rect) this.mPreviewBuilder.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect == null) {
            return -1;
        }
        int width = rect.width();
        int height = rect.height();
        if (i8 * width > i7 * height) {
            double d31 = (double) height;
            Double.isNaN(d31);
            d2 = d11;
            double d32 = (double) i8;
            Double.isNaN(d32);
            d4 = (d31 * 1.0d) / d32;
            double d33 = (double) width;
            double d34 = (double) i7;
            Double.isNaN(d34);
            Double.isNaN(d33);
            d3 = (d33 - (d34 * d4)) / 2.0d;
            d5 = 0.0d;
        } else {
            d2 = d11;
            double d35 = (double) width;
            Double.isNaN(d35);
            double d36 = (double) i7;
            Double.isNaN(d36);
            d4 = (d35 * 1.0d) / d36;
            double d37 = (double) height;
            double d38 = (double) i8;
            Double.isNaN(d38);
            Double.isNaN(d37);
            d5 = (d37 - (d38 * d4)) / 2.0d;
            d3 = 0.0d;
        }
        double d39 = (double) rect.left;
        Double.isNaN(d39);
        double d40 = (d2 * d4) + d3 + d39;
        double d41 = (double) rect.top;
        Double.isNaN(d41);
        double d42 = (d12 * d4) + d5 + d41;
        Rect rect2 = new Rect();
        double d43 = (double) width;
        Double.isNaN(d43);
        double d44 = d43 * 0.05d;
        rect2.left = clamp((int) (d40 - d44), 0, width);
        rect2.right = clamp((int) (d40 + d44), 0, width);
        double d45 = (double) height;
        Double.isNaN(d45);
        double d46 = d45 * 0.05d;
        rect2.top = clamp((int) (d42 - d46), 0, height);
        rect2.bottom = clamp((int) (d42 + d46), 0, height);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)});
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)});
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        this.mPreviewBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        try {
            this.mCaptureSession.setRepeatingRequest(this.mPreviewBuilder.build(), this.mAfCaptureCallback, new Handler(this.mPreviewThread.getLooper()));
            return 0;
        } catch (CameraAccessException unused) {
            return -1;
        }
    }
}
