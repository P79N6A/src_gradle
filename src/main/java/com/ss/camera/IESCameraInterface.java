package com.ss.camera;

import android.graphics.SurfaceTexture;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface IESCameraInterface {
    public static final int[] CameraHWLevelAndroid2VE = {1, 2, 0, 3};
    public static final int[] CameraHWLevelVE2Android = {2, 0, 1, 3};

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashMode {
    }

    public interface ZoomListener {
        boolean enablbeSmooth();

        void onChange(int i, float f2, boolean z);

        void onZoomSupport(int i, boolean z, boolean z2, float f2, List<Integer> list);
    }

    void cancelAutoFocus();

    void changeCamera(int i, CameraListener cameraListener);

    void close();

    boolean currentValid();

    void enableTorch(boolean z);

    int getCameraPosition();

    float getMaxZoom();

    int[] getPreviewWH();

    List<int[]> getSupportedPreviewSizes();

    void init(CameraParams cameraParams);

    int[] initCameraParam();

    boolean isTorchSupported();

    boolean isVideoStabilizationSupported();

    boolean open(int i, CameraListener cameraListener);

    int setCameraPosition(int i);

    boolean setFocusAreas(View view, float[] fArr, int i);

    int setOrientationDegrees(int i);

    boolean setVideoStabilization(boolean z);

    void setZoom(float f2);

    void setZoomListener(ZoomListener zoomListener);

    void startPreview(SurfaceTexture surfaceTexture);

    void startZoom(float f2);

    void stopZoom();

    boolean switchFlashMode(int i);
}
