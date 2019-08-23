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

public abstract class HwCameraSuperSlowMotionCaptureSession implements AutoCloseable {

    public static abstract class CaptureCallback {
        public void onCaptureCompleted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, Byte b2) {
        }

        public void onCaptureFailed(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        }

        public void onCaptureProgressed(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        public void onCaptureSequenceAborted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, int i) {
        }

        public void onCaptureSequenceCompleted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, int i, long j) {
        }

        public void onCaptureStarted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        }
    }

    public static abstract class StateCallback {
        public void onActive(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession) {
        }

        public void onClosed(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession) {
        }

        public abstract void onConfigureFailed(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession);

        public abstract void onConfigured(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession);

        public void onReady(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession) {
        }

        public void onSurfacePrepared(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, Surface surface) {
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

    public abstract int setRepeatingSuperSlowMotionRequest(CaptureRequest captureRequest, CaptureCallback captureCallback, Handler handler) throws CameraAccessException;

    public abstract void stopRepeating() throws CameraAccessException;

    public static HwCameraSuperSlowMotionCaptureSession createImpl(HwCameraDevice hwCameraDevice, CameraCaptureSession cameraCaptureSession) {
        return new HwCameraSuperSlowMotionCaptureSessionImpl(hwCameraDevice, cameraCaptureSession);
    }
}
