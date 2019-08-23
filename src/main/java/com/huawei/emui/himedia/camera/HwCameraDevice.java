package com.huawei.emui.himedia.camera;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Size;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraSuperSlowMotionCaptureSession;
import java.io.IOException;
import java.util.List;

public abstract class HwCameraDevice implements AutoCloseable {

    public static abstract class StateCallback {
        public void onClosed(HwCameraDevice hwCameraDevice) {
        }

        public abstract void onDisconnected(HwCameraDevice hwCameraDevice);

        public abstract void onError(HwCameraDevice hwCameraDevice, int i);

        public abstract void onOpened(HwCameraDevice hwCameraDevice);
    }

    public abstract void cleanSuperSlowMotionTag() throws RemoteException;

    public abstract void close();

    public abstract void confirmSuggestMode(CaptureRequest.Builder builder, int i) throws RemoteException;

    public abstract CaptureRequest.Builder createCaptureRequest(int i) throws CameraAccessException, RemoteException;

    public abstract void createCaptureSession(List<Surface> list, HwCameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException;

    public abstract void createConstrainedHighSpeedCaptureSession(List<Surface> list, HwCameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException;

    public abstract void createSuperSlowMotionCaptrureSession(List<Surface> list, HwCameraSuperSlowMotionCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException;

    public abstract void disMissSuggestMode(CaptureRequest.Builder builder, int i) throws RemoteException;

    public abstract void enableBodyBeautyMode(CaptureRequest.Builder builder, boolean z) throws RemoteException;

    public abstract Byte getExposureModePreviewState(CaptureResult captureResult);

    public abstract String getId();

    public abstract Integer getLightPaintingExposureTime(TotalCaptureResult totalCaptureResult) throws RemoteException;

    public abstract int getMode();

    public abstract Size getOptimalPreviewSize(int i, int i2);

    public abstract Surface getPreviewSurface();

    public abstract Surface getRecordSurface();

    public abstract Integer getSceneResult(CaptureResult captureResult) throws RemoteException;

    public abstract void releaseSuperSlowMotionMediaRecorder() throws IOException;

    public abstract void resetSuperNightParams(CaptureRequest.Builder builder) throws RemoteException;

    public abstract void resetSuperSlowMotionMediaRecorder();

    public abstract boolean setApertureLevel(CaptureRequest.Builder builder, int i);

    public abstract void setBodyBeautyLevel(CaptureRequest.Builder builder, byte b2) throws RemoteException;

    public abstract void setCharacteristics(CameraCharacteristics cameraCharacteristics);

    /* access modifiers changed from: package-private */
    public abstract void setMode(int i);

    public abstract void setupMediaRecorderForSuperSlowMotion(String str, String str2, int i) throws IOException;

    public abstract void startRecordingSuperSlowMotion(HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException;

    public abstract void startSuperNightRelayout(CaptureRequest.Builder builder, CaptureRequest.Builder builder2, int i, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException;

    public abstract void startTryAE(CaptureRequest.Builder builder, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException, RemoteException;

    public abstract void stopRecordingSuperSlowMotion();

    static HwCameraDevice createImpl(CameraDevice cameraDevice) {
        return new HwCameraDeviceImpl(cameraDevice);
    }

    static HwCameraDevice createImpl(CameraDevice cameraDevice, Context context) {
        return new HwCameraDeviceImpl(cameraDevice, context);
    }
}
