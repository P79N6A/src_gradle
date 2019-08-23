package com.ss.camera;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.camera.IESCameraInterface;
import com.ss.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
public class Camera2 implements IESCameraInterface {
    private int currentCameraPosition = -1;
    public CameraCaptureSession mCameraCaptureSession;
    private CameraCharacteristics mCameraCharacteristics;
    public CameraDevice mCameraDevice;
    private int mCameraHWLevel = 1;
    public Handler mCameraHandler;
    public CameraListener mCameraListener;
    private CameraManager mCameraManager;
    private int mCameraRotate;
    private CaptureRequest mCaptureRequest;
    public CaptureRequest.Builder mCaptureRequestBuilder;
    private int mDeviceHardwareSupportedLevel = 0;
    int[] mFpsRange = new int[2];
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    public volatile boolean mManualFocusEngaged = false;
    private Size[] mOutputSizes;
    private Surface mPreviewSurface;
    public CameraCaptureSession.CaptureCallback mSessionCaptureCallback = new CameraCaptureSession.CaptureCallback() {
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            LogUtils.e("Camera2", "Manual AF failure: " + captureFailure, new Object[0]);
        }

        public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
            LogUtils.d("Camera2", String.format("onCaptureProgressed: state[AE, AF, AWB] = [%d, %d, %d]", new Object[]{captureResult.get(CaptureResult.CONTROL_AE_STATE), captureResult.get(CaptureResult.CONTROL_AF_STATE), captureResult.get(CaptureResult.CONTROL_AWB_STATE)}), new Object[0]);
        }
    };
    public volatile int mSessionState = 0;
    private CameraDevice.StateCallback mStateCallback = new CameraDevice.StateCallback() {
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            LogUtils.d("Camera2", "StateCallback::onDisconnected...", new Object[0]);
            Camera2.this.mCameraDevice = cameraDevice;
            Camera2.this.close();
            Camera2.this.resetCameraVariables();
        }

        public void onOpened(@NonNull CameraDevice cameraDevice) {
            LogUtils.d("Camera2", "StateCallback::onOpened..., camera = " + cameraDevice, new Object[0]);
            Camera2.this.mSessionState = 1;
            Camera2.this.mCameraDevice = cameraDevice;
            if (Camera2.this.mCameraListener != null) {
                Camera2.this.mCameraListener.onOpenSuccess(2);
            }
        }

        public void onError(@NonNull CameraDevice cameraDevice, int i) {
            if (Camera2.this.mCameraListener != null) {
                Camera2.this.mCameraListener.onOpenFail(2);
                Camera2.this.mCameraListener = null;
            }
            Camera2.this.mCameraDevice = cameraDevice;
            Camera2.this.close();
            Camera2.this.resetCameraVariables();
        }
    };
    private int sHeight;
    private int sWidth;
    private IESCameraInterface.ZoomListener zoomListener;

    public void setZoom(float f2) {
    }

    public void setZoomListener(IESCameraInterface.ZoomListener zoomListener2) {
    }

    public void stopZoom() {
    }

    public int getCameraPosition() {
        return this.currentCameraPosition;
    }

    public int getDeviceHardwareSupportedLevel() {
        return this.mDeviceHardwareSupportedLevel;
    }

    public boolean currentValid() {
        if (this.mCameraDevice != null) {
            return true;
        }
        return false;
    }

    public int[] getPreviewWH() {
        return new int[]{this.sWidth, this.sHeight};
    }

    public int[] initCameraParam() {
        return new int[]{this.sWidth, this.sHeight};
    }

    public boolean isFlipHorizontal() {
        if (this.mCameraManager != null && this.currentCameraPosition == 1) {
            return true;
        }
        return false;
    }

    public void resetCameraVariables() {
        this.mSessionState = 0;
        this.mCameraDevice = null;
        this.mCaptureRequestBuilder = null;
        this.mCameraCaptureSession = null;
        this.mCameraCharacteristics = null;
        this.mCaptureRequest = null;
    }

    public boolean isTorchSupported() {
        try {
            return ((Boolean) this.mCameraManager.getCameraCharacteristics(PushConstants.PUSH_TYPE_NOTIFY).get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
            return false;
        }
    }

    public boolean isVideoStabilizationSupported() {
        if (this.mCameraCharacteristics == null) {
            return false;
        }
        int[] iArr = (int[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    private boolean isMeteringAreaAFSupported() {
        if (this.mCameraCharacteristics == null) {
            try {
                if (((Integer) this.mCameraManager.getCameraCharacteristics(PushConstants.PUSH_TYPE_NOTIFY).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    public void close() {
        LogUtils.d("Camera2", "close...", new Object[0]);
        if (this.mSessionState == 2) {
            this.mSessionState = 0;
            try {
                if (this.mCameraDevice != null) {
                    this.mCameraDevice.close();
                    this.mCameraDevice = null;
                }
                if (this.mPreviewSurface != null) {
                    this.mPreviewSurface.release();
                    this.mPreviewSurface = null;
                }
            } catch (Throwable unused) {
            }
            this.mCameraListener = null;
        }
    }

    public float getMaxZoom() {
        float f2;
        boolean z;
        if (this.mCameraCharacteristics == null) {
            f2 = -1.0f;
        } else {
            f2 = ((Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f3 = f2 / 2.0f;
        if (this.zoomListener != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f3)));
            IESCameraInterface.ZoomListener zoomListener2 = this.zoomListener;
            if (f3 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            zoomListener2.onZoomSupport(2, z, false, f3, arrayList);
        }
        return f3;
    }

    public List<int[]> getSupportedPreviewSizes() {
        ArrayList arrayList = new ArrayList();
        for (Size size : this.mOutputSizes) {
            if (size != null) {
                arrayList.add(new int[]{size.getWidth(), size.getHeight()});
            }
        }
        return arrayList;
    }

    public void cancelAutoFocus() {
        if (this.mSessionState == 1) {
            LogUtils.d("Camera2", "Camera is opening, ignore cancelAutoFocus operation.", new Object[0]);
        } else if (isMeteringAreaAFSupported() && this.mCaptureRequestBuilder != null && this.mCameraDevice != null) {
            this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            this.mCaptureRequest = this.mCaptureRequestBuilder.build();
            try {
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequest, null, this.mCameraHandler);
            } catch (CameraAccessException e2) {
                LogUtils.e("Camera2", "setRepeatingRequest failed, errMsg: " + e2.getMessage(), new Object[0]);
            }
        }
    }

    public void updatePreview() {
        LogUtils.d("Camera2", "updatePreview", new Object[0]);
        if (this.mCameraDevice != null && this.mCaptureRequestBuilder != null) {
            try {
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_MODE, 1);
                this.mCaptureRequest = this.mCaptureRequestBuilder.build();
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequest, this.mSessionCaptureCallback, this.mCameraHandler);
                this.mSessionState = 2;
                LogUtils.d("Camera2", "send capture request...", new Object[0]);
            } catch (CameraAccessException unused) {
                this.mSessionState = 0;
            } catch (IllegalStateException unused2) {
                this.mSessionState = 0;
            }
        }
    }

    public int setCameraPosition(int i) {
        this.currentCameraPosition = i;
        return 0;
    }

    public int setOrientationDegrees(int i) {
        if (this.currentCameraPosition == 1) {
            return ((360 - ((this.mCameraRotate + i) % 360)) + 180) % 360;
        }
        return ((this.mCameraRotate - i) + 360) % 360;
    }

    public void enableTorch(boolean z) {
        int i;
        if (this.mCaptureRequestBuilder != null && this.mCameraCaptureSession != null) {
            try {
                CaptureRequest.Builder builder = this.mCaptureRequestBuilder;
                CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                builder.set(key, Integer.valueOf(i));
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequestBuilder.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    public void init(CameraParams cameraParams) {
        if (cameraParams == null || !cameraParams.isValid()) {
            LogUtils.e("Camera2", "Invalid CameraParams", new Object[0]);
            return;
        }
        this.mCameraHandler = new Handler();
        this.mCameraHWLevel = cameraParams.mCameraHardwareSupportLevel;
        if (this.mCameraManager == null) {
            this.mCameraManager = (CameraManager) cameraParams.mContext.getSystemService("camera");
        }
    }

    private void getBestMatchCameraPreviewSize(Size[] sizeArr) {
        int i;
        int i2;
        if (sizeArr != null) {
            int length = sizeArr.length;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i3 >= length) {
                    i = -1;
                    i2 = -1;
                    break;
                }
                Size size = sizeArr[i3];
                if (size != null) {
                    i2 = size.getWidth();
                    i = size.getHeight();
                    LogUtils.d("Camera2", "Camera preview size = " + i2 + ", " + i, new Object[0]);
                    if (i2 == 1280 && i == 720) {
                        break;
                    }
                    if (Math.abs((i2 * 9) - (i * 16)) < 32 && i5 < i) {
                        i5 = i;
                        i4 = i2;
                    }
                    if (Math.abs((i2 * 3) - (i * 4)) < 32 && i5 < i) {
                        i5 = i;
                        i4 = i2;
                    }
                }
                i3++;
            }
            if (i != -1) {
                this.sWidth = i2;
                this.sHeight = i;
                return;
            }
            this.sWidth = i4;
            this.sHeight = i5;
        }
    }

    public boolean setVideoStabilization(boolean z) {
        if (isVideoStabilizationSupported() && this.mCaptureRequestBuilder != null) {
            this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(z ? 1 : 0));
            this.mCaptureRequest = this.mCaptureRequestBuilder.build();
            try {
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequest, null, this.mCameraHandler);
                return true;
            } catch (CameraAccessException e2) {
                LogUtils.e("Camera2", "setRepeatingRequest failed, errMsg: " + e2.getMessage(), new Object[0]);
            }
        }
        return false;
    }

    public void startZoom(float f2) {
        if (this.mCameraCharacteristics != null && this.mCaptureRequestBuilder != null && this.mCameraCaptureSession != null) {
            float floatValue = ((Float) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
            Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            int width = rect.width() - ((int) (((float) rect.width()) / floatValue));
            int i = (int) ((((float) width) / floatValue) * f2);
            int height = (int) ((((float) (rect.height() - ((int) (((float) rect.height()) / floatValue)))) / floatValue) * f2);
            int i2 = i - (i & 3);
            int i3 = height - (height & 3);
            try {
                this.mCaptureRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i2, i3, rect.width() - i2, rect.height() - i3));
                this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequestBuilder.build(), null, null);
                if (this.zoomListener != null) {
                    this.zoomListener.onChange(2, f2, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean switchFlashMode(int i) {
        if (this.mCaptureRequestBuilder == null || this.mCameraCaptureSession == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
                break;
            case 1:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
                break;
            case 2:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, 2);
                break;
            case 3:
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
                break;
            case 4:
                try {
                    this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 4);
                    this.mCaptureRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.mCameraCaptureSession.setRepeatingRequest(this.mCaptureRequestBuilder.build(), null, this.mCameraHandler);
        return true;
    }

    public void startPreview(@NonNull SurfaceTexture surfaceTexture) {
        boolean z;
        LogUtils.d("Camera2", "startPreview++++, mCameraDevice = " + this.mCameraDevice + ", surfaceTexture = " + surfaceTexture, new Object[0]);
        if (this.mCameraDevice != null && surfaceTexture != null) {
            if (this.mSessionState != 1) {
                LogUtils.d("Camera2", "preview is opening, ignore start operation.", new Object[0]);
                return;
            }
            try {
                LogUtils.d("Camera2", "startPreview setDefaultBufferSize, sWidth = " + this.sWidth + " sHeight = " + this.sHeight, new Object[0]);
                surfaceTexture.setDefaultBufferSize(this.sWidth, this.sHeight);
                this.mCaptureRequestBuilder = this.mCameraDevice.createCaptureRequest(3);
                ArrayList arrayList = new ArrayList();
                this.mPreviewSurface = new Surface(surfaceTexture);
                arrayList.add(this.mPreviewSurface);
                this.mCaptureRequestBuilder.addTarget(this.mPreviewSurface);
                if (this.mCameraCharacteristics != null) {
                    Range[] rangeArr = (Range[]) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    Range range = new Range(Integer.valueOf(this.mFpsRange[0] / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), Integer.valueOf(this.mFpsRange[1] / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                    int length = rangeArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        Range range2 = rangeArr[i];
                        if (((Integer) range2.getLower()).intValue() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE == this.mFpsRange[0] && ((Integer) range2.getUpper()).intValue() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE == this.mFpsRange[1]) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        int length2 = rangeArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            Range range3 = rangeArr[i2];
                            if (((Integer) range3.getLower()).intValue() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE <= this.mFpsRange[0]) {
                                range = new Range(range3.getLower(), range3.getUpper());
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    CaptureRequest.Builder builder = this.mCaptureRequestBuilder;
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                    if (!z) {
                        range = rangeArr[0];
                    }
                    builder.set(key, range);
                }
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_MODE, 1);
                this.mCameraDevice.createCaptureSession(arrayList, new CameraCaptureSession.StateCallback() {
                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        LogUtils.d("Camera2", "onConfigureFailed...", new Object[0]);
                        Camera2.this.mSessionState = 0;
                    }

                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        LogUtils.d("Camera2", "onConfigured...", new Object[0]);
                        Camera2.this.mCameraCaptureSession = cameraCaptureSession;
                        Camera2.this.updatePreview();
                    }
                }, this.mCameraHandler);
            } catch (CameraAccessException unused) {
            }
        }
    }

    public void changeCamera(int i, CameraListener cameraListener) {
        LogUtils.d("Camera2", "changeCamera...", new Object[0]);
        if (this.mSessionState == 1) {
            LogUtils.d("Camera2", "Camera is opening, ignore changeCamera operation.", new Object[0]);
            return;
        }
        close();
        open(i, cameraListener);
    }

    private boolean isHardwareLevelSupported(CameraCharacteristics cameraCharacteristics, int i) {
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue < 0 || intValue > 3) {
            LogUtils.e("Camera2", "Invalid hardware level = " + intValue, new Object[0]);
            return false;
        } else if (Build.VERSION.SDK_INT < 22 && intValue == 2) {
            return false;
        } else {
            this.mDeviceHardwareSupportedLevel = CameraHWLevelAndroid2VE[intValue];
            if (this.mDeviceHardwareSupportedLevel >= i) {
                LogUtils.i("Camera2", "Camera hardware level supported, deviceLevel = " + this.mDeviceHardwareSupportedLevel + ", require = " + this.mCameraHWLevel, new Object[0]);
                return true;
            }
            LogUtils.e("Camera2", "Camera hardware level not supported, deviceLevel = " + this.mDeviceHardwareSupportedLevel + ", require = " + this.mCameraHWLevel, new Object[0]);
            return false;
        }
    }

    public boolean open(int i, CameraListener cameraListener) {
        LogUtils.d("Camera2", "open... position = " + i + " mCameraManager = " + this.mCameraManager, new Object[0]);
        this.mCameraListener = cameraListener;
        try {
            String[] cameraIdList = this.mCameraManager.getCameraIdList();
            if (i >= 0) {
                if (i <= 2) {
                    if (i >= cameraIdList.length) {
                        i = 1;
                    }
                    this.currentCameraPosition = i;
                    String str = cameraIdList[i];
                    this.mCameraCharacteristics = this.mCameraManager.getCameraCharacteristics(str);
                    if (!isHardwareLevelSupported(this.mCameraCharacteristics, this.mCameraHWLevel)) {
                        if (this.mCameraListener != null) {
                            this.mCameraListener.onOpenFail(2);
                        }
                        return false;
                    }
                    this.mCameraRotate = ((Integer) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                    this.mOutputSizes = ((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
                    getBestMatchCameraPreviewSize(this.mOutputSizes);
                    this.mCameraManager.openCamera(str, this.mStateCallback, this.mCameraHandler);
                    return true;
                }
            }
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    if (Camera2.this.mCameraListener != null) {
                        Camera2.this.mCameraListener.onOpenFail(2);
                    }
                }
            });
            return false;
        } catch (Throwable unused) {
            this.mMainHandler.post(new Runnable() {
                public void run() {
                    if (Camera2.this.mCameraListener != null) {
                        Camera2.this.mCameraListener.onOpenFail(2);
                        Camera2.this.mCameraListener = null;
                    }
                }
            });
            this.mSessionState = 0;
            return false;
        }
    }

    private Rect _calculateFocusRect(View view, float[] fArr, int i) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2 = i;
        Rect rect = (Rect) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        LogUtils.d("Camera2", "SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [" + rect.left + ", " + rect.top + ", " + rect.right + ", " + rect.bottom + "]", new Object[0]);
        Size size = (Size) this.mCameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb.append(size.getWidth());
        sb.append(", ");
        sb.append(size.getHeight());
        sb.append("]");
        LogUtils.i("onAreaTouchEvent", sb.toString(), new Object[0]);
        float f7 = fArr[0];
        float f8 = fArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        int i3 = this.sWidth;
        int i4 = this.sHeight;
        if (90 == this.mCameraRotate || 270 == this.mCameraRotate) {
            i3 = this.sHeight;
            i4 = this.sWidth;
        }
        float f9 = 0.0f;
        if (i4 * width >= i3 * height) {
            float f10 = (((float) width) * 1.0f) / ((float) i3);
            f2 = ((((float) i4) * f10) - ((float) height)) / 2.0f;
            f3 = f10;
            f4 = 0.0f;
        } else {
            f3 = (((float) height) * 1.0f) / ((float) i4);
            f4 = ((((float) i3) * f3) - ((float) width)) / 2.0f;
            f2 = 0.0f;
        }
        float f11 = (f7 + f4) / f3;
        float f12 = (f8 + f2) / f3;
        if (90 == i2) {
            f11 = ((float) this.sHeight) - f11;
        } else if (270 == i2) {
            f12 = ((float) this.sWidth) - f12;
        } else {
            float f13 = f11;
            f11 = f12;
            f12 = f13;
        }
        Rect rect2 = (Rect) this.mCaptureRequest.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            LogUtils.w("Camera2", "can't get crop region", new Object[0]);
            rect2 = rect;
        }
        int width2 = rect2.width();
        int height2 = rect2.height();
        if (this.sHeight * width2 > this.sWidth * height2) {
            float f14 = (((float) height2) * 1.0f) / ((float) this.sHeight);
            f9 = (((float) width2) - (((float) this.sWidth) * f14)) / 2.0f;
            f6 = f14;
            f5 = 0.0f;
        } else {
            f6 = (((float) width2) * 1.0f) / ((float) this.sWidth);
            f5 = (((float) height2) - (((float) this.sHeight) * f6)) / 2.0f;
        }
        float f15 = (f11 * f6) + f5 + ((float) rect2.top);
        Rect rect3 = new Rect();
        double d2 = (double) ((f12 * f6) + f9 + ((float) rect2.left));
        double width3 = (double) rect2.width();
        Double.isNaN(width3);
        Double.isNaN(d2);
        rect3.left = CameraUtils.clamp((int) (d2 - (width3 * 0.05d)), 0, rect2.width());
        double width4 = (double) rect2.width();
        Double.isNaN(width4);
        Double.isNaN(d2);
        rect3.right = CameraUtils.clamp((int) (d2 + (width4 * 0.05d)), 0, rect2.width());
        double d3 = (double) f15;
        double height3 = (double) rect2.height();
        Double.isNaN(height3);
        Double.isNaN(d3);
        rect3.top = CameraUtils.clamp((int) (d3 - (height3 * 0.05d)), 0, rect2.height());
        double height4 = (double) rect2.height();
        Double.isNaN(height4);
        Double.isNaN(d3);
        rect3.bottom = CameraUtils.clamp((int) (d3 + (height4 * 0.05d)), 0, rect2.height());
        LogUtils.d("Camera2", "Focus Rect: [left, top, right, bottom] = [" + rect3.left + ", " + rect3.top + ", " + rect3.right + ", " + rect3.bottom + "]", new Object[0]);
        return rect3;
    }

    public boolean setFocusAreas(View view, float[] fArr, int i) {
        LogUtils.d("Camera2", "setFocusAreas...", new Object[0]);
        if (this.mSessionState == 1) {
            LogUtils.d("Camera2", "Camera is opening, ignore setFocusAreas operation.", new Object[0]);
            return false;
        } else if (this.mCaptureRequestBuilder == null || this.mCameraDevice == null || this.mCameraCaptureSession == null) {
            LogUtils.e("Camera2", "Set focus failed, you must open camera first.", new Object[0]);
            return false;
        } else if (this.mManualFocusEngaged) {
            LogUtils.w("Camera2", "Manual focus already engaged", new Object[0]);
            return true;
        } else {
            Rect _calculateFocusRect = _calculateFocusRect(view, fArr, i);
            AnonymousClass6 r8 = new CameraCaptureSession.CaptureCallback() {
                public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    LogUtils.e("Camera2", "Manual AF failure: " + captureFailure, new Object[0]);
                    Camera2.this.mManualFocusEngaged = false;
                }

                public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num != null) {
                        LogUtils.d("Camera2", "afState = " + num, new Object[0]);
                        if (4 == num.intValue() || 5 == num.intValue()) {
                            LogUtils.i("Camera2", "Capture focused!!", new Object[0]);
                        }
                    } else {
                        LogUtils.w("Camera2", "afState is null", new Object[0]);
                    }
                    Camera2.this.mManualFocusEngaged = false;
                    if (captureRequest.getTag() == "FOCUS_TAG") {
                        Camera2.this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, null);
                        try {
                            Camera2.this.mCameraCaptureSession.setRepeatingRequest(Camera2.this.mCaptureRequestBuilder.build(), Camera2.this.mSessionCaptureCallback, Camera2.this.mCameraHandler);
                        } catch (CameraAccessException unused) {
                        }
                    }
                }
            };
            try {
                this.mCameraCaptureSession.stopRepeating();
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.mCameraCaptureSession.capture(this.mCaptureRequestBuilder.build(), this.mSessionCaptureCallback, this.mCameraHandler);
                if (isMeteringAreaAFSupported()) {
                    this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(_calculateFocusRect, 999)});
                } else {
                    LogUtils.w("Camera2", "do not support MeteringAreaAF!", new Object[0]);
                }
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(_calculateFocusRect, 999)});
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_MODE, 1);
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.mCaptureRequestBuilder.setTag("FOCUS_TAG");
                this.mCaptureRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                this.mCaptureRequest = this.mCaptureRequestBuilder.build();
                this.mCameraCaptureSession.capture(this.mCaptureRequest, r8, this.mCameraHandler);
                return true;
            } catch (Exception e2) {
                LogUtils.e("Camera2", "setRepeatingRequest failed, " + e2.getMessage(), new Object[0]);
                return false;
            }
        }
    }
}
