package io.agora.rtc.video;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.agora.rtc.internal.DeviceUtils;
import io.agora.rtc.internal.Logging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class VideoCaptureCamera extends VideoCapture implements Camera.PreviewCallback, SurfaceHolder.Callback {
    private boolean isCaptureRunning = false;
    private boolean isCaptureStarted = false;
    private boolean isFaceDetectionStarted = false;
    private boolean isSurfaceReady = false;
    protected Camera mCamera;
    public HandlerThread mCameraRecoverHandlerThread = null;
    private int mCaptureFormat = 17;
    public int mCaptureFps = -1;
    public int mCaptureHeight = -1;
    public ReentrantLock mCaptureLock = new ReentrantLock();
    public int mCaptureWidth = -1;
    private SurfaceTexture mDummySurfaceTexture = null;
    private int mExpectedFrameSize = 0;
    public Handler mHandler = null;
    public boolean mIsAutoFaceFocusEnabled = false;
    private SurfaceHolder mLocalPreview = null;
    private final int mNumCaptureBuffers = 3;
    public Object mObjectLock = new Object();
    private boolean mOwnsBuffers = false;
    protected ReentrantLock mPreviewBufferLock = new ReentrantLock();

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    static int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    public boolean isZoomSupported() {
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (parameters != null) {
            return parameters.isZoomSupported();
        }
        return false;
    }

    private List<Integer> getZoomRatios() {
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (isZoomSupported(parameters)) {
            return parameters.getZoomRatios();
        }
        return null;
    }

    public Camera.Parameters getCameraParameters() {
        try {
            return this.mCamera.getParameters();
        } catch (RuntimeException e2) {
            Logging.e("CAMERA1", "getCameraParameters: Camera.getParameters: ", e2);
            if (this.mCamera != null) {
                this.mCamera.release();
            }
            return null;
        }
    }

    public boolean isFocusSupported() {
        Camera.Parameters parameters = this.mCamera.getParameters();
        boolean z = false;
        if (parameters == null) {
            return false;
        }
        if (parameters.getMaxNumFocusAreas() > 0 && isSupported("auto", parameters.getSupportedFocusModes())) {
            z = true;
        }
        return z;
    }

    public boolean isTorchSupported() {
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (parameters != null) {
            return isSupported("torch", parameters.getSupportedFlashModes());
        }
        return false;
    }

    public int allocate() {
        try {
            this.mCamera = Camera.open(this.mId);
            Camera.CameraInfo cameraInfo = getCameraInfo(this.mId);
            if (cameraInfo == null) {
                this.mCamera.release();
                this.mCamera = null;
                return -2;
            }
            if (VideoCapture.fetchCapability(this.mId, this.mContext) == null) {
                createCapabilities();
            }
            this.mCameraNativeOrientation = cameraInfo.orientation;
            return 0;
        } catch (RuntimeException e2) {
            Logging.e("CAMERA1", "allocate: Camera.open: ", e2);
            return -1;
        }
    }

    public void deallocate() {
        if (this.mCamera != null) {
            this.mNativeVideoCaptureDeviceAndroid = 0;
            stopCapture();
            this.mCaptureLock.lock();
            if (this.mCamera != null) {
                this.mCamera.release();
                this.mCamera = null;
            }
            this.mCaptureLock.unlock();
            if (this.mCameraRecoverHandlerThread != null) {
                this.mCameraRecoverHandlerThread.quit();
                this.mCameraRecoverHandlerThread = null;
                this.mHandler = null;
            }
        }
    }

    public float getMaxZoom() {
        int i;
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (isZoomSupported(parameters)) {
            i = parameters.getMaxZoom();
        } else {
            i = 0;
        }
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null || zoomRatios.size() <= i) {
            return -1.0f;
        }
        return ((float) zoomRatios.get(i).intValue()) / 100.0f;
    }

    public boolean isAutoFaceFocusSupported() {
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (parameters == null || parameters.getMaxNumDetectedFaces() <= 0 || parameters.getMaxNumFocusAreas() <= 0 || !isSupported("auto", parameters.getSupportedFocusModes())) {
            return false;
        }
        return true;
    }

    public boolean isForeground() {
        if (this.mContext != null) {
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) this.mContext.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.processName.equals(this.mContext.getPackageName()) && next.importance == 100) {
                    return true;
                }
            }
        }
        return false;
    }

    public int stopCapture() {
        if (!this.isCaptureStarted) {
            Logging.w("CAMERA1", "already stop capture");
            return 0;
        }
        try {
            if (this.isFaceDetectionStarted) {
                this.mCamera.stopFaceDetection();
                this.mCamera.setFaceDetectionListener(null);
                this.isFaceDetectionStarted = false;
            }
        } catch (RuntimeException e2) {
            Logging.e("CAMERA1", "Failed to stop face detection", e2);
        }
        try {
            this.mCamera.stopPreview();
            this.mPreviewBufferLock.lock();
            this.isCaptureRunning = false;
            this.mPreviewBufferLock.unlock();
            this.mCamera.setErrorCallback(null);
            this.mCamera.setPreviewCallbackWithBuffer(null);
            this.isCaptureStarted = false;
            return 0;
        } catch (RuntimeException e3) {
            Logging.e("CAMERA1", "Failed to stop camera", e3);
            return -1;
        }
    }

    public int createCapabilities() {
        String str;
        Camera.Parameters cameraParameters = getCameraParameters();
        if (cameraParameters != null) {
            String str2 = "\"id\":" + this.mId + ",";
            List<Camera.Size> supportedPreviewSizes = cameraParameters.getSupportedPreviewSizes();
            String str3 = "";
            for (int i = 0; i < supportedPreviewSizes.size(); i++) {
                String str4 = "{\"w\":" + supportedPreviewSizes.get(i).width + ",\"h\":" + supportedPreviewSizes.get(i).height + "}";
                if (i != supportedPreviewSizes.size() - 1) {
                    str3 = str3 + str4 + ",";
                } else {
                    str3 = str3 + str4;
                }
            }
            List<Integer> supportedPreviewFormats = cameraParameters.getSupportedPreviewFormats();
            if (VideoCapture.isEmulator()) {
                supportedPreviewFormats.remove(842094169);
            }
            String str5 = "";
            for (int i2 = 0; i2 < supportedPreviewFormats.size(); i2++) {
                int translateToEngineFormat = translateToEngineFormat(supportedPreviewFormats.get(i2).intValue());
                if (i2 != supportedPreviewFormats.size() - 1) {
                    str5 = str5 + translateToEngineFormat + ",";
                } else {
                    str5 = str5 + translateToEngineFormat;
                }
            }
            List<Integer> supportedPreviewFrameRates = cameraParameters.getSupportedPreviewFrameRates();
            String str6 = "";
            for (int i3 = 0; i3 < supportedPreviewFrameRates.size(); i3++) {
                int intValue = supportedPreviewFrameRates.get(i3).intValue();
                if (i3 != supportedPreviewFrameRates.size() - 1) {
                    str6 = str6 + intValue + ",";
                } else {
                    str6 = str6 + intValue;
                }
            }
            str = "{" + str2 + "\"resolution\":" + "[" + str3 + "]," + "\"format\":" + "[" + str5 + "]," + "\"fps\":" + "[" + str6 + "]}";
        } else {
            str = null;
        }
        cacheCapability(this.mId, this.mContext, str);
        return 0;
    }

    public int setAutoFaceFocus(boolean z) {
        this.mIsAutoFaceFocusEnabled = z;
        return 0;
    }

    static int getSensorOrientation(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return -1;
        }
        return cameraInfo.orientation;
    }

    protected static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (RuntimeException e2) {
            Logging.e("CAMERA1", "getCameraInfo: Camera.getCameraInfo: ", e2);
            return null;
        }
    }

    private boolean isZoomSupported(Camera.Parameters parameters) {
        if (parameters == null) {
            return false;
        }
        if (parameters.isZoomSupported()) {
            return true;
        }
        Logging.w("CAMERA1", "camera zoom is not supported ");
        return false;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mCaptureLock.lock();
        try {
            if (this.mCamera != null) {
                this.mCamera.setPreviewDisplay(null);
            }
        } catch (IOException e2) {
            Logging.e("CAMERA1", "Failed to clear preview surface!", e2);
        }
        this.mCaptureLock.unlock();
    }

    static String getName(int i) {
        String str;
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("camera ");
        sb.append(i);
        sb.append(", facing ");
        if (cameraInfo.facing == 1) {
            str = "front";
        } else {
            str = "back";
        }
        sb.append(str);
        return sb.toString();
    }

    public int setCaptureFormat(int i) {
        Logging.d("CAMERA1", "setCaptureFormat: " + i);
        this.mCaptureFormat = translateToAndroidFormat(i);
        if (this.mCaptureFormat != 0) {
            return 0;
        }
        Logging.e("CAMERA1", "setCaptureFormat failed, unkonwn format: " + i);
        return -1;
    }

    public int setTorchMode(boolean z) {
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (parameters == null) {
            return -2;
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes == null || !supportedFlashModes.contains("torch")) {
            return -1;
        }
        if (z) {
            parameters.setFlashMode("torch");
        } else {
            parameters.setFlashMode("off");
        }
        this.mCamera.setParameters(parameters);
        return 0;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mCaptureLock.lock();
        try {
            if (this.mCamera != null) {
                this.mCamera.stopPreview();
                this.mCamera.setPreviewDisplay(surfaceHolder);
            }
        } catch (IOException e2) {
            Logging.e("CAMERA1", "Failed to set preview surface!", e2);
        } catch (RuntimeException e3) {
            Logging.e("CAMERA1", "Failed to stop preview!", e3);
        }
        this.mCaptureLock.unlock();
    }

    public int setZoom(float f2) {
        int i = (int) ((f2 * 100.0f) + 0.5f);
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= zoomRatios.size()) {
                i2 = 0;
                break;
            } else if (i <= zoomRatios.get(i2).intValue()) {
                break;
            } else {
                i2++;
            }
        }
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (isZoomSupported(parameters)) {
            if (i2 > parameters.getMaxZoom()) {
                Logging.w("CAMERA1", "zoom value is larger than maxZoom value");
                return -1;
            }
            parameters.setZoom(i2);
            this.mCamera.setParameters(parameters);
        }
        return 0;
    }

    private void setAdvancedCameraParameters(Camera.Parameters parameters) {
        if (isSupported("off", parameters.getSupportedFlashModes())) {
            Logging.i("CAMERA1", "AgoraVideo set flash mode = FLASH_MODE_OFF");
            parameters.setFlashMode("off");
        }
        if (isSupported("auto", parameters.getSupportedWhiteBalance())) {
            Logging.i("CAMERA1", "AgoraVideo set white blance = WHITE_BALANCE_AUTO");
            parameters.setWhiteBalance("auto");
        }
        if (isSupported("continuous-video", parameters.getSupportedFocusModes())) {
            Logging.i("CAMERA1", "AgoraVideo set Focus mode = FOCUS_MODE_CONTINUOUS_VIDEO");
            parameters.setFocusMode("continuous-video");
        }
        if (isSupported("auto", parameters.getSupportedAntibanding())) {
            Logging.i("CAMERA1", "AgoraVideo set anti-banding = ANTIBANDING_AUTO");
            parameters.setAntibanding("auto");
        }
        if (isSupported("auto", parameters.getSupportedSceneModes())) {
            Logging.i("CAMERA1", "AgoraVideo set sence mode = " + "auto");
            if (parameters.getSceneMode() != "auto") {
                parameters.setSceneMode("auto");
            }
        }
    }

    private void setDeviceSpecificParameters(Camera.Parameters parameters) {
        String deviceId = DeviceUtils.getDeviceId();
        String cpuName = DeviceUtils.getCpuName();
        String cpuABI = DeviceUtils.getCpuABI();
        int numberOfCPUCores = DeviceUtils.getNumberOfCPUCores();
        int cPUMaxFreqKHz = DeviceUtils.getCPUMaxFreqKHz();
        Logging.i("CAMERA1", "Current Device: " + deviceId);
        Logging.i("CAMERA1", "CPU name: " + cpuName + ", with " + numberOfCPUCores + " cores, arch: " + cpuABI + ", max Freq: " + cPUMaxFreqKHz);
        if (deviceId.contains("xiaomi/mi note")) {
            Logging.i("CAMERA1", "set MiNote config");
            parameters.set("scene-detect", "on");
            parameters.set("xiaomi-still-beautify-values", "i:3");
            parameters.set("skinToneEnhancement", "enable");
            parameters.set("auto-exposure", "center-weighted");
        }
        if (deviceId.contains("oppo/r7c/r7c")) {
            Logging.i("CAMERA1", "set oppo r7c config");
            parameters.set("skinToneEnhancement", 1);
            parameters.set("face-beautify", 100);
            parameters.set("auto-exposure", "center-weighted");
        }
    }

    private static boolean isSupported(String str, List<String> list) {
        if (list == null || list.indexOf(str) < 0) {
            return false;
        }
        return true;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        try {
            this.mPreviewBufferLock.lock();
            if (bArr != null) {
                if (this.isCaptureRunning) {
                    if (bArr.length == this.mExpectedFrameSize && this.mNativeVideoCaptureDeviceAndroid != 0) {
                        ProvideCameraFrame(bArr, this.mExpectedFrameSize, this.mNativeVideoCaptureDeviceAndroid);
                    } else if (this.mNativeVideoCaptureDeviceAndroid == 0) {
                        Logging.w("CAMERA1", "warning mNativeVideoCaptureDeviceAndroid = 0, error");
                    }
                    this.mPreviewBufferLock.unlock();
                    if (camera != null && this.isCaptureRunning) {
                        camera.addCallbackBuffer(bArr);
                    }
                }
            }
        } finally {
            this.mPreviewBufferLock.unlock();
            if (camera != null && this.isCaptureRunning) {
                camera.addCallbackBuffer(bArr);
            }
        }
    }

    private static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    VideoCaptureCamera(Context context, int i, long j) {
        super(context, i, j);
    }

    /* JADX INFO: finally extract failed */
    public int startCapture(int i, int i2, int i3) {
        int i4;
        if (this.mCamera == null) {
            Logging.e("CAMERA1", "startCapture: camera is null!!");
            return -1;
        }
        this.mLocalPreview = ViERenderer.GetLocalRenderer();
        if (this.mLocalPreview != null) {
            if (this.mLocalPreview.getSurface() != null && this.mLocalPreview.getSurface().isValid()) {
                surfaceCreated(this.mLocalPreview);
            }
            this.mLocalPreview.addCallback(this);
        } else {
            this.mCaptureLock.lock();
            try {
                this.mDummySurfaceTexture = new SurfaceTexture(42);
                this.mCamera.setPreviewTexture(this.mDummySurfaceTexture);
            } catch (Exception unused) {
                Logging.e("CAMERA1", "failed to startPreview, invalid surfaceTexture!");
                this.mDummySurfaceTexture = null;
                return -1;
            } finally {
                this.mCaptureLock.unlock();
            }
        }
        this.mCaptureLock.lock();
        this.isCaptureStarted = true;
        this.mCaptureWidth = i;
        this.mCaptureHeight = i2;
        this.mCaptureFps = i3;
        try {
            i4 = tryStartCapture(i, i2, i3);
            this.mCaptureLock.unlock();
        } catch (Throwable th) {
            this.mCaptureLock.unlock();
            throw th;
        }
        return i4;
    }

    private int tryStartCapture(int i, int i2, int i3) {
        if (this.mCamera == null) {
            Logging.e("CAMERA1", "Camera not initialized %d" + this.mId);
            return -1;
        }
        Logging.i("CAMERA1", "tryStartCapture: " + i + "*" + i2 + ", frameRate: " + i3 + ", isCaptureRunning: " + this.isCaptureRunning + ", isSurfaceReady: " + this.isSurfaceReady + ", isCaptureStarted: " + this.isCaptureStarted);
        if (this.isCaptureRunning || !this.isCaptureStarted) {
            Logging.w("CAMERA1", "tryStartCapture return");
            return 0;
        }
        Camera.Parameters parameters = this.mCamera.getParameters();
        parameters.setPreviewSize(i, i2);
        parameters.setPreviewFormat(this.mCaptureFormat);
        parameters.setPreviewFrameRate(i3);
        setAdvancedCameraParameters(parameters);
        setDeviceSpecificParameters(parameters);
        this.mCamera.setParameters(parameters);
        int bitsPerPixel = (((i * i2) * ImageFormat.getBitsPerPixel(this.mCaptureFormat)) / 8) + 4096;
        for (int i4 = 0; i4 < 3; i4++) {
            this.mCamera.addCallbackBuffer(new byte[bitsPerPixel]);
        }
        this.mCamera.setPreviewCallbackWithBuffer(this);
        this.mOwnsBuffers = true;
        this.mCamera.setErrorCallback(new Camera.ErrorCallback() {
            public void onError(int i, Camera camera) {
                if (i == 2) {
                    if (VideoCaptureCamera.this.mCamera != null) {
                        VideoCaptureCamera.this.stopCapture();
                        VideoCaptureCamera.this.mCaptureLock.lock();
                        if (VideoCaptureCamera.this.mCamera != null) {
                            VideoCaptureCamera.this.mCamera.release();
                            VideoCaptureCamera.this.mCamera = null;
                        }
                        VideoCaptureCamera.this.mCaptureLock.unlock();
                    }
                    if (VideoCaptureCamera.this.mCameraRecoverHandlerThread == null) {
                        VideoCaptureCamera.this.mCameraRecoverHandlerThread = new HandlerThread("camera-recover-thread");
                        VideoCaptureCamera.this.mCameraRecoverHandlerThread.start();
                        VideoCaptureCamera.this.mHandler = new Handler(VideoCaptureCamera.this.mCameraRecoverHandlerThread.getLooper());
                    }
                    VideoCaptureCamera.this.mHandler.postDelayed(new Runnable() {
                        public void run() {
                            if (!VideoCaptureCamera.this.isForeground() || VideoCaptureCamera.this.mCamera != null) {
                                VideoCaptureCamera.this.mHandler.postDelayed(this, 2000);
                                return;
                            }
                            VideoCaptureCamera.this.allocate();
                            VideoCaptureCamera.this.startCapture(VideoCaptureCamera.this.mCaptureWidth, VideoCaptureCamera.this.mCaptureHeight, VideoCaptureCamera.this.mCaptureFps);
                        }
                    }, 2000);
                }
            }
        });
        this.mCamera.startPreview();
        if (parameters.getMaxNumDetectedFaces() > 0) {
            this.mCamera.setFaceDetectionListener(new Camera.FaceDetectionListener() {
                private long mLastFocusedTs;

                public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
                    if (faceArr != null && faceArr.length != 0 && camera != null && VideoCaptureCamera.this.mIsAutoFaceFocusEnabled && System.currentTimeMillis() - this.mLastFocusedTs >= 3000 && faceArr[0].score > 50) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new Camera.Area(faceArr[0].rect, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                            if (camera.getParameters().getMaxNumFocusAreas() > 0) {
                                camera.getParameters().setFocusAreas(arrayList);
                            }
                            if (camera.getParameters().getMaxNumMeteringAreas() > 0) {
                                camera.getParameters().setMeteringAreas(arrayList);
                            }
                            camera.autoFocus(new Camera.AutoFocusCallback() {
                                public void onAutoFocus(boolean z, Camera camera) {
                                    if (camera != null) {
                                        try {
                                            camera.cancelAutoFocus();
                                        } catch (RuntimeException e2) {
                                            Logging.w("CAMERA1", "Exception in cancelAutoFocus: " + Log.getStackTraceString(e2));
                                        }
                                    }
                                }
                            });
                            this.mLastFocusedTs = System.currentTimeMillis();
                        } catch (RuntimeException e2) {
                            Logging.w("CAMERA1", "Exception in onFaceDetection callback: " + Log.getStackTraceString(e2));
                        }
                    }
                }
            });
            Logging.i("CAMERA1", "enable face detection");
            this.mCamera.startFaceDetection();
            this.isFaceDetectionStarted = true;
        }
        this.mPreviewBufferLock.lock();
        this.mExpectedFrameSize = bitsPerPixel;
        this.isCaptureRunning = true;
        this.mPreviewBufferLock.unlock();
        Camera.Parameters parameters2 = this.mCamera.getParameters();
        Logging.e("CAMERA1", "Params: " + parameters2.flatten());
        return 0;
    }

    private static Rect calculateTapArea(float f2, float f3, float f4, int i, int i2) {
        int i3 = (int) (((f2 / ((float) i)) * 2000.0f) - 1000.0f);
        int i4 = (int) (((f3 / ((float) i2)) * 2000.0f) - 1000.0f);
        int intValue = Float.valueOf(f4 * 300.0f).intValue() / 2;
        RectF rectF = new RectF((float) clamp(i3 - intValue, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), (float) clamp(i4 - intValue, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), (float) clamp(i3 + intValue, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), (float) clamp(i4 + intValue, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r6 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setFocus(float r4, float r5, int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r3 = this;
            r9 = -1
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f7
            float r0 = (float) r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00f7
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00f7
            float r0 = (float) r7
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            goto L_0x00f7
        L_0x0016:
            int r0 = r3.mCaptureHeight
            int r1 = r3.mCaptureWidth
            switch(r8) {
                case 1: goto L_0x0052;
                case 2: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x006d
        L_0x001e:
            int r8 = r6 * r1
            int r2 = r7 * r0
            if (r8 == r2) goto L_0x006d
            if (r8 <= r2) goto L_0x003b
            int r8 = r2 / r1
            int r0 = r6 - r8
            int r0 = r0 / 2
            float r0 = (float) r0
            float r4 = r4 - r0
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x003a
            int r6 = r6 + r8
            int r6 = r6 / 2
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x006c
        L_0x003a:
            return r9
        L_0x003b:
            int r8 = r8 / r0
            int r0 = r7 - r8
            int r0 = r0 / 2
            float r0 = (float) r0
            float r5 = r5 - r0
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0051
            int r7 = r7 + r8
            int r7 = r7 / 2
            float r7 = (float) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r7 = r8
            goto L_0x006d
        L_0x0051:
            return r9
        L_0x0052:
            int r1 = r1 * r6
            int r0 = r0 * r7
            if (r1 == r0) goto L_0x006d
            if (r1 <= r0) goto L_0x0064
            int r1 = r1 / r7
            int r7 = r1 - r7
            int r7 = r7 / 2
            float r7 = (float) r7
            float r7 = r7 + r5
            r5 = r7
            r7 = r1
            goto L_0x006d
        L_0x0064:
            int r8 = r0 / r6
            int r6 = r8 - r6
            int r6 = r6 / 2
            float r6 = (float) r6
            float r4 = r4 + r6
        L_0x006c:
            r6 = r8
        L_0x006d:
            r8 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Rect r8 = calculateTapArea(r4, r5, r8, r6, r7)
            r9 = 1069547520(0x3fc00000, float:1.5)
            android.graphics.Rect r4 = calculateTapArea(r4, r5, r9, r6, r7)
            android.hardware.Camera r5 = r3.mCamera
            r5.cancelAutoFocus()
            android.hardware.Camera r5 = r3.mCamera
            android.hardware.Camera$Parameters r5 = r5.getParameters()
            int r6 = r5.getMaxNumFocusAreas()
            r7 = 800(0x320, float:1.121E-42)
            if (r6 <= 0) goto L_0x009d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.hardware.Camera$Area r9 = new android.hardware.Camera$Area
            r9.<init>(r8, r7)
            r6.add(r9)
            r5.setFocusAreas(r6)
            goto L_0x00a4
        L_0x009d:
            java.lang.String r6 = "CAMERA1"
            java.lang.String r8 = "focus areas not supported"
            io.agora.rtc.internal.Logging.i(r6, r8)
        L_0x00a4:
            int r6 = r5.getMaxNumMeteringAreas()
            if (r6 <= 0) goto L_0x00bb
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.hardware.Camera$Area r8 = new android.hardware.Camera$Area
            r8.<init>(r4, r7)
            r6.add(r8)
            r5.setMeteringAreas(r6)
            goto L_0x00c2
        L_0x00bb:
            java.lang.String r4 = "CAMERA1"
            java.lang.String r6 = "metering areas not supported"
            io.agora.rtc.internal.Logging.i(r4, r6)
        L_0x00c2:
            java.lang.String r4 = r5.getFocusMode()
            java.lang.String r6 = "macro"
            java.util.List r7 = r5.getSupportedFocusModes()
            boolean r6 = isSupported(r6, r7)
            if (r6 == 0) goto L_0x00e4
            java.lang.String r6 = "macro"
            r5.setFocusMode(r6)
            java.lang.Object r6 = r3.mObjectLock
            monitor-enter(r6)
            android.hardware.Camera r7 = r3.mCamera     // Catch:{ all -> 0x00e1 }
            r7.setParameters(r5)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r6)     // Catch:{ all -> 0x00e1 }
            goto L_0x00eb
        L_0x00e1:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00e1 }
            throw r4
        L_0x00e4:
            java.lang.String r5 = "focus"
            java.lang.String r6 = "FOCUS_MODE_MACRO is not supported"
            io.agora.rtc.internal.Logging.i(r5, r6)
        L_0x00eb:
            android.hardware.Camera r5 = r3.mCamera
            io.agora.rtc.video.VideoCaptureCamera$3 r6 = new io.agora.rtc.video.VideoCaptureCamera$3
            r6.<init>(r4)
            r5.autoFocus(r6)
            r4 = 0
            return r4
        L_0x00f7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.video.VideoCaptureCamera.setFocus(float, float, int, int, int, int, boolean):int");
    }
}
