package com.huawei.emui.himedia.camera;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.view.Surface;
import java.util.List;

public abstract class HwCameraCaptureSession implements AutoCloseable {

    public static abstract class CaptureCallback {
        public void onCaptureCompleted(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }

        public void onCaptureFailed(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        public void onCaptureProgressed(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        public void onCaptureSequenceAborted(HwCameraCaptureSession hwCameraCaptureSession, int i) {
        }

        public void onCaptureSequenceCompleted(HwCameraCaptureSession hwCameraCaptureSession, int i, long j) {
        }

        public void onCaptureStarted(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        }
    }

    public static abstract class StateCallback {
        public void onActive(HwCameraCaptureSession hwCameraCaptureSession) {
        }

        public void onClosed(HwCameraCaptureSession hwCameraCaptureSession) {
        }

        public abstract void onConfigureFailed(HwCameraCaptureSession hwCameraCaptureSession);

        public abstract void onConfigured(HwCameraCaptureSession hwCameraCaptureSession);

        public void onReady(HwCameraCaptureSession hwCameraCaptureSession) {
        }

        public void onSurfacePrepared(HwCameraCaptureSession hwCameraCaptureSession, Surface surface) {
        }
    }

    public abstract void abortCaptures() throws CameraAccessException;

    public abstract int capture(CaptureRequest captureRequest, CaptureCallback captureCallback, Handler handler) throws CameraAccessException;

    public abstract int captureBurst(List<CaptureRequest> list, CaptureCallback captureCallback, Handler handler) throws CameraAccessException;

    public abstract void close();

    public abstract HwCameraDevice getDevice();

    public abstract Surface getInputSurface();

    public abstract boolean isReprocessable();

    public abstract void prepare(Surface surface) throws CameraAccessException;

    public abstract int setRepeatingBurst(List<CaptureRequest> list, CaptureCallback captureCallback, Handler handler) throws CameraAccessException;

    public abstract int setRepeatingRequest(CaptureRequest captureRequest, CaptureCallback captureCallback, Handler handler) throws CameraAccessException;

    public abstract void stopRepeating() throws CameraAccessException;

    public static HwCameraCaptureSession createImpl(HwCameraDevice hwCameraDevice, CameraCaptureSession cameraCaptureSession) {
        return new HwCameraCaptureSessionImpl(hwCameraDevice, cameraCaptureSession);
    }
}
