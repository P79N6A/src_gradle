package com.ss.android.ttvecamera.d;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraDevice;
import com.huawei.emui.himedia.camera.HwCameraSuperSlowMotionCaptureSession;
import java.util.List;

public final class f extends HwCameraCaptureSession {

    /* renamed from: a  reason: collision with root package name */
    public Byte f31394a;

    /* renamed from: b  reason: collision with root package name */
    a f31395b = new a();

    /* renamed from: c  reason: collision with root package name */
    private HwCameraSuperSlowMotionCaptureSession f31396c;

    static class a extends HwCameraSuperSlowMotionCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        public HwCameraCaptureSession.CaptureCallback f31397a;

        /* renamed from: b  reason: collision with root package name */
        public f f31398b;

        public final void onCaptureSequenceAborted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, int i) {
            if (this.f31397a != null && this.f31398b != null) {
                this.f31397a.onCaptureSequenceAborted(this.f31398b, i);
            }
        }

        public final void onCaptureFailed(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            if (this.f31397a != null && this.f31398b != null) {
                this.f31397a.onCaptureFailed(this.f31398b, captureRequest, captureFailure);
            }
        }

        public final void onCaptureProgressed(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            if (this.f31397a != null && this.f31398b != null) {
                this.f31397a.onCaptureProgressed(this.f31398b, captureRequest, captureResult);
            }
        }

        public final void onCaptureSequenceCompleted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, int i, long j) {
            if (this.f31397a != null && this.f31398b != null) {
                this.f31397a.onCaptureSequenceCompleted(this.f31398b, i, j);
            }
        }

        public final void onCaptureCompleted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, Byte b2) {
            if (this.f31397a != null && this.f31398b != null) {
                this.f31398b.f31394a = b2;
                this.f31397a.onCaptureCompleted(this.f31398b, captureRequest, totalCaptureResult);
            }
        }

        public final void onCaptureStarted(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            if (this.f31397a != null && this.f31398b != null) {
                this.f31397a.onCaptureStarted(this.f31398b, captureRequest, j, j2);
            }
        }
    }

    public final HwCameraDevice getDevice() {
        return this.f31396c.getDevice();
    }

    public final void abortCaptures() throws CameraAccessException {
        if (this.f31396c != null) {
            this.f31396c.stopRepeating();
        }
    }

    public final void close() {
        if (this.f31396c != null) {
            this.f31396c.close();
        }
    }

    public final Surface getInputSurface() {
        if (this.f31396c != null) {
            return this.f31396c.getInputSurface();
        }
        return null;
    }

    public final boolean isReprocessable() {
        if (this.f31396c == null || !this.f31396c.isReprocessable()) {
            return false;
        }
        return true;
    }

    public final void stopRepeating() throws CameraAccessException {
        if (this.f31396c != null) {
            this.f31396c.stopRepeating();
        }
    }

    public final void prepare(Surface surface) throws CameraAccessException {
        this.f31396c.prepare(surface);
    }

    public f(HwCameraSuperSlowMotionCaptureSession hwCameraSuperSlowMotionCaptureSession) {
        this.f31396c = hwCameraSuperSlowMotionCaptureSession;
        this.f31395b.f31398b = this;
    }

    public final int capture(CaptureRequest captureRequest, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        if (this.f31396c == null) {
            return -1;
        }
        a aVar = null;
        if (captureCallback != null) {
            aVar = this.f31395b;
            aVar.f31397a = captureCallback;
        }
        return this.f31396c.capture(captureRequest, aVar, handler);
    }

    public final int captureBurst(List<CaptureRequest> list, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        if (this.f31396c == null) {
            return -1;
        }
        a aVar = null;
        if (captureCallback != null) {
            aVar = this.f31395b;
            aVar.f31397a = captureCallback;
        }
        return this.f31396c.captureBurst(list, aVar, handler);
    }

    public final int setRepeatingBurst(List<CaptureRequest> list, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        if (this.f31396c == null) {
            return -1;
        }
        a aVar = null;
        if (captureCallback != null) {
            aVar = this.f31395b;
            aVar.f31397a = captureCallback;
        }
        return this.f31396c.setRepeatingBurst(list, aVar, handler);
    }

    public final int setRepeatingRequest(CaptureRequest captureRequest, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        if (this.f31396c == null) {
            return -1;
        }
        a aVar = null;
        if (captureCallback != null) {
            aVar = this.f31395b;
            aVar.f31397a = captureCallback;
        }
        return this.f31396c.setRepeatingSuperSlowMotionRequest(captureRequest, aVar, handler);
    }
}
