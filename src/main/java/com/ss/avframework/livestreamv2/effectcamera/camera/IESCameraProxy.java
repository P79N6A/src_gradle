package com.ss.avframework.livestreamv2.effectcamera.camera;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.avframework.livestreamv2.effectcamera.utils.LogUtils;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IESCameraProxy extends AbsIESCameraProxy {
    private static int PREVIEW_HEIGHT = 720;
    private static int PREVIEW_WIDTH = 1280;
    public static final String TAG = "com.ss.avframework.livestreamv2.effectcamera.camera.IESCameraProxy";
    private Camera mCamera;
    private int mCameraID;
    private Camera.CameraInfo mCameraInfo = new Camera.CameraInfo();
    private int mPreviewFormat = 17;
    private int mPreviewHeight = PREVIEW_HEIGHT;
    private int mPreviewWidth = PREVIEW_WIDTH;
    private int previewRate = 30;

    private static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public void init(CameraParams cameraParams) {
    }

    public Object getCamera() {
        return this.mCamera;
    }

    public int getCameraID() {
        return this.mCameraID;
    }

    public int getPreviewFormat() {
        return this.mPreviewFormat;
    }

    public int getNumberOfCameras() {
        return Camera.getNumberOfCameras();
    }

    public int getOrientation() {
        if (this.mCameraInfo == null) {
            return 0;
        }
        return this.mCameraInfo.orientation;
    }

    public boolean isFlipHorizontal() {
        if (this.mCameraInfo != null && this.mCameraInfo.facing == 1) {
            return true;
        }
        return false;
    }

    private List<Camera.Size> getSupportedPreviewSize() {
        List<Camera.Size> list;
        if (this.mCamera != null) {
            try {
                list = this.mCamera.getParameters().getSupportedPreviewSizes();
            } catch (Exception unused) {
                return null;
            }
        } else {
            list = null;
        }
        return list;
    }

    public synchronized void cancelAutoFocus() {
        if (this.mCamera != null) {
            try {
                this.mCamera.cancelAutoFocus();
            } catch (Exception unused) {
            }
        }
    }

    public int getMaxExposureCompensation() {
        if (this.mCamera == null) {
            return 0;
        }
        return this.mCamera.getParameters().getMaxExposureCompensation();
    }

    public int getMinExposureCompensation() {
        if (this.mCamera == null) {
            return 0;
        }
        return this.mCamera.getParameters().getMinExposureCompensation();
    }

    public boolean isSupportExposureCompensation() {
        if (this.mCamera == null) {
            return false;
        }
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (parameters.getMaxExposureCompensation() == 0 && parameters.getMinExposureCompensation() == 0) {
            return false;
        }
        return true;
    }

    public void releaseCamera() {
        try {
            if (this.mCamera != null) {
                this.mCamera.stopPreview();
                this.mCamera.setPreviewCallback(null);
                this.mCamera.release();
                this.mCamera = null;
            }
        } catch (Exception unused) {
            this.mCamera = null;
        }
    }

    private boolean hasPermission() {
        if (this.mCamera == null) {
            return false;
        }
        try {
            Field declaredField = this.mCamera.getClass().getDeclaredField("mHasPermission");
            if (declaredField == null) {
                return true;
            }
            declaredField.setAccessible(true);
            return ((Boolean) declaredField.get(this.mCamera)).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public List<int[]> getBestMatchCameraPreviewSize() {
        int i;
        int i2;
        List<Camera.Size> supportedPreviewSize = getSupportedPreviewSize();
        if (supportedPreviewSize == null) {
            return null;
        }
        int i3 = PREVIEW_WIDTH;
        int i4 = PREVIEW_HEIGHT;
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSize != null) {
            Iterator<Camera.Size> it2 = supportedPreviewSize.iterator();
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    i2 = -1;
                    break;
                }
                Camera.Size next = it2.next();
                i2 = next.width;
                i = next.height;
                if (i2 == PREVIEW_WIDTH && i == PREVIEW_HEIGHT) {
                    break;
                }
                if (Math.abs((i2 * 9) - (i * 16)) < 32 && (i6 < i || z)) {
                    i6 = i;
                    i5 = i2;
                    z2 = true;
                }
                if (Math.abs((i2 * 3) - (i * 4)) < 32 && i6 < i && !z2) {
                    i6 = i;
                    i5 = i2;
                    z = true;
                }
            }
            if (i != -1) {
                i4 = i;
                i3 = i2;
            } else {
                i3 = i5;
                i4 = i6;
            }
        }
        arrayList.add(new int[]{i4, i3});
        return arrayList;
    }

    private void setDefaultParameters() {
        if (this.mCamera != null) {
            Camera.Parameters parameters = this.mCamera.getParameters();
            String str = TAG;
            LogUtils.e(str, "parameters: " + parameters.flatten(), new Object[0]);
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            if (supportedFocusModes != null) {
                if (supportedFocusModes.contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                }
            }
            List<String> supportedFlashModes = parameters.getSupportedFlashModes();
            if (supportedFlashModes != null && supportedFlashModes.contains("off")) {
                parameters.setFlashMode("off");
            }
            List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
            this.previewRate = 0;
            if (supportedPreviewFrameRates != null) {
                Collections.sort(supportedPreviewFrameRates);
                if (supportedPreviewFrameRates.contains(30)) {
                    this.previewRate = 30;
                } else if (supportedPreviewFrameRates.contains(15)) {
                    this.previewRate = 15;
                }
            }
            if (this.previewRate > 0) {
                parameters.setPreviewFrameRate(this.previewRate);
            }
            parameters.setPreviewSize(this.mPreviewWidth, this.mPreviewHeight);
            this.mCamera.setParameters(parameters);
        }
    }

    private static int clamp(int i) {
        return clamp(i, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public void setExposureCompensation(int i) {
        if (this.mCamera != null) {
            Camera.Parameters parameters = this.mCamera.getParameters();
            parameters.setExposureCompensation(i);
            this.mCamera.setParameters(parameters);
        }
    }

    public void startPreview(SurfaceTexture surfaceTexture) {
        if (this.mCamera != null) {
            String str = null;
            try {
                setDefaultParameters();
                this.mCamera.setPreviewTexture(surfaceTexture);
            } catch (IOException e2) {
                str = e2.getMessage();
            }
            if (str != null) {
                String str2 = TAG;
                LogUtils.e(str2, "IllegalStateException: " + str, new Object[0]);
            }
            try {
                this.mCamera.startPreview();
            } catch (Exception unused) {
            }
        }
    }

    public int toggleFlashLight(boolean z) {
        if (this.mCamera == null || this.mCameraInfo == null) {
            return -502;
        }
        if (this.mCameraInfo.facing == 1) {
            return -503;
        }
        Camera.Parameters parameters = this.mCamera.getParameters();
        if (z) {
            parameters.setFlashMode("torch");
            this.mCamera.setParameters(parameters);
            this.mCamera.startPreview();
        } else {
            parameters.setFlashMode("off");
            this.mCamera.setParameters(parameters);
        }
        return 0;
    }

    public void changeCamera(int i, CameraListener cameraListener) {
        openCamera(i, cameraListener);
    }

    public void setPreviewSize(int i, int i2) {
        this.mPreviewWidth = i;
        this.mPreviewHeight = i2;
    }

    public boolean openCamera(int i, CameraListener cameraListener) {
        boolean z = false;
        try {
            releaseCamera();
            this.mCamera = Camera.open(i);
            if (!hasPermission()) {
                releaseCamera();
                return false;
            }
            this.mCameraID = i;
            Camera.getCameraInfo(i, this.mCameraInfo);
            z = true;
            if (!(this.mCamera == null || cameraListener == null)) {
                cameraListener.onOpenSuccess(1);
            }
            if (cameraListener != null) {
                cameraListener.onOpenFail(1);
            }
            return z;
        } catch (Exception e2) {
            this.mCamera = null;
            String str = TAG;
            LogUtils.e(str, "openCamera fail msg=" + e2.getMessage(), new Object[0]);
        }
    }

    public boolean setFocusAreas(int i, int i2, float f2, float[] fArr, int i3) {
        if (this.mCamera == null) {
            return false;
        }
        Rect calculateTapArea = calculateTapArea(i, i2, f2, fArr, i3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(calculateTapArea, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
        try {
            Camera.Parameters parameters = this.mCamera.getParameters();
            if (parameters.getMaxNumFocusAreas() <= 0 || TextUtils.equals(Build.BRAND, "Multilaser") || TextUtils.equals(Build.BRAND, "MS40") || TextUtils.equals(Build.MODEL, "MHA-AL00")) {
                return false;
            }
            parameters.setFocusAreas(arrayList);
            parameters.setMeteringAreas(arrayList);
            parameters.setFocusMode("auto");
            this.mCamera.setParameters(parameters);
            this.mCamera.autoFocus(new Camera.AutoFocusCallback() {
                public void onAutoFocus(boolean z, Camera camera) {
                    try {
                        camera.cancelAutoFocus();
                        Camera.Parameters parameters = camera.getParameters();
                        parameters.setFocusMode("continuous-video");
                        camera.setParameters(parameters);
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public Rect calculateTapArea(int i, int i2, float f2, float[] fArr, int i3) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        int intValue = Float.valueOf((f2 * 60.0f) + 0.5f).intValue();
        int i4 = ((int) ((f3 * 2000.0f) / ((float) i))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i5 = ((int) ((f4 * 2000.0f) / ((float) i2))) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i6 = intValue / 2;
        int clamp = clamp(i4 - i6, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        int clamp2 = clamp(i5 - i6, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        RectF rectF = new RectF((float) clamp, (float) clamp2, (float) clamp(clamp + intValue), (float) clamp(clamp2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        RectUtils.rotateRectForOrientation(i3, new Rect(-1000, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), rect);
        Rect rect2 = new Rect(rect.left - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.top - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.right - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.bottom - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        rect2.left = clamp(rect2.left);
        rect2.right = clamp(rect2.right);
        rect2.top = clamp(rect2.top);
        rect2.bottom = clamp(rect2.bottom);
        return rect2;
    }
}
