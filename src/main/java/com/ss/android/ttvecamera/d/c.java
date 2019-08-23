package com.ss.android.ttvecamera.d;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraConstrainedHighSpeedCaptureSession;
import java.util.List;

@RequiresApi(api = 21)
public final class c extends CameraCaptureSession {

    /* renamed from: a  reason: collision with root package name */
    HwCameraCaptureSession f31383a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f31384b;

    public static class a extends HwCameraCaptureSession.CaptureCallback {

        /* renamed from: a  reason: collision with root package name */
        c f31385a;

        /* renamed from: b  reason: collision with root package name */
        CameraCaptureSession.CaptureCallback f31386b;

        public a(c cVar, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f31385a = cVar;
            this.f31386b = captureCallback;
        }

        public final void onCaptureSequenceAborted(HwCameraCaptureSession hwCameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(hwCameraCaptureSession, i);
            if (this.f31386b != null) {
                this.f31386b.onCaptureSequenceAborted(this.f31385a, i);
            }
        }

        public final void onCaptureCompleted(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(hwCameraCaptureSession, captureRequest, totalCaptureResult);
            if (this.f31386b != null) {
                this.f31386b.onCaptureCompleted(this.f31385a, captureRequest, totalCaptureResult);
            }
        }

        public final void onCaptureFailed(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(hwCameraCaptureSession, captureRequest, captureFailure);
            if (this.f31386b != null) {
                this.f31386b.onCaptureFailed(this.f31385a, captureRequest, captureFailure);
            }
        }

        public final void onCaptureProgressed(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            super.onCaptureProgressed(hwCameraCaptureSession, captureRequest, captureResult);
            if (this.f31386b != null) {
                this.f31386b.onCaptureProgressed(this.f31385a, captureRequest, captureResult);
            }
        }

        public final void onCaptureSequenceCompleted(HwCameraCaptureSession hwCameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(hwCameraCaptureSession, i, j);
            if (this.f31386b != null) {
                this.f31386b.onCaptureSequenceCompleted(this.f31385a, i, j);
            }
        }

        public final void onCaptureStarted(HwCameraCaptureSession hwCameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(hwCameraCaptureSession, captureRequest, j, j2);
            if (this.f31386b != null) {
                this.f31386b.onCaptureStarted(this.f31385a, captureRequest, j, j2);
            }
        }
    }

    public final void finalizeOutputConfigurations(List<OutputConfiguration> list) throws CameraAccessException {
    }

    @NonNull
    public final CameraDevice getDevice() {
        return null;
    }

    public final Byte a() {
        if (this.f31383a instanceof f) {
            return ((f) this.f31383a).f31394a;
        }
        return null;
    }

    public final void abortCaptures() throws CameraAccessException {
        if (this.f31383a != null) {
            this.f31383a.abortCaptures();
            return;
        }
        throw new RuntimeException("Session is null");
    }

    public final void close() {
        if (this.f31383a != null) {
            this.f31383a.close();
            return;
        }
        throw new RuntimeException("Session is null");
    }

    @Nullable
    public final Surface getInputSurface() {
        if (this.f31383a != null) {
            return this.f31383a.getInputSurface();
        }
        throw new RuntimeException("Session is null");
    }

    public final boolean isReprocessable() {
        if (this.f31383a != null) {
            return this.f31383a.isReprocessable();
        }
        throw new RuntimeException("Session is null");
    }

    public final void stopRepeating() throws CameraAccessException {
        if (this.f31383a != null) {
            this.f31383a.stopRepeating();
            return;
        }
        throw new RuntimeException("Session is null");
    }

    public c(HwCameraCaptureSession hwCameraCaptureSession) {
        this.f31383a = hwCameraCaptureSession;
        this.f31384b = hwCameraCaptureSession instanceof HwCameraConstrainedHighSpeedCaptureSession;
    }

    public final void prepare(@NonNull Surface surface) throws CameraAccessException {
        if (this.f31383a == null) {
            this.f31383a.prepare(surface);
        }
    }

    public final int capture(@NonNull CaptureRequest captureRequest, @Nullable CameraCaptureSession.CaptureCallback captureCallback, @Nullable Handler handler) throws CameraAccessException {
        if (this.f31383a != null) {
            a aVar = null;
            if (captureCallback != null) {
                aVar = new a(this, captureCallback);
            }
            return this.f31383a.capture(captureRequest, aVar, handler);
        }
        throw new RuntimeException("Session is null");
    }

    public final int captureBurst(@NonNull List<CaptureRequest> list, @Nullable CameraCaptureSession.CaptureCallback captureCallback, @Nullable Handler handler) throws CameraAccessException {
        if (this.f31383a != null) {
            a aVar = null;
            if (captureCallback != null) {
                aVar = new a(this, captureCallback);
            }
            return this.f31383a.captureBurst(list, aVar, handler);
        }
        throw new RuntimeException("Session is null");
    }

    public final int setRepeatingBurst(@NonNull List<CaptureRequest> list, @Nullable CameraCaptureSession.CaptureCallback captureCallback, @Nullable Handler handler) throws CameraAccessException {
        if (this.f31383a != null) {
            a aVar = null;
            if (captureCallback != null) {
                aVar = new a(this, captureCallback);
            }
            return this.f31383a.setRepeatingBurst(list, aVar, handler);
        }
        throw new RuntimeException("Session is null");
    }

    public final int setRepeatingRequest(@NonNull CaptureRequest captureRequest, @Nullable CameraCaptureSession.CaptureCallback captureCallback, @Nullable Handler handler) throws CameraAccessException {
        if (this.f31383a != null) {
            a aVar = null;
            if (captureCallback != null) {
                aVar = new a(this, captureCallback);
            }
            if (!this.f31384b) {
                return this.f31383a.setRepeatingRequest(captureRequest, aVar, handler);
            }
            return this.f31383a.setRepeatingBurst(((HwCameraConstrainedHighSpeedCaptureSession) this.f31383a).createHighSpeedRequestList(captureRequest), aVar, handler);
        }
        throw new RuntimeException("Session is null");
    }
}
