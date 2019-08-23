package com.huawei.emui.himedia.camera;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class HwCameraConstrainedHighSpeedCaptureSessionImpl extends HwCameraConstrainedHighSpeedCaptureSession {
    protected final CameraConstrainedHighSpeedCaptureSession mCameraCaptureSession;
    protected final AtomicBoolean mClosed = new AtomicBoolean();
    protected final HwCameraDevice mDevice;

    class SessionCaptureCallbackProxy extends CameraCaptureSession.CaptureCallback {
        private final Map<Long, List<CaptureResult>> mPartialResultMap = new HashMap();
        private final Map<CaptureRequest, CaptureRequest> mRequestMap = new HashMap();
        private final List<CaptureRequest> mRequests;
        public final HwCameraCaptureSession.CaptureCallback mUserCallback;
        private final Handler mUserHandler;

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, final int i) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureSequenceAborted(HwCameraConstrainedHighSpeedCaptureSessionImpl.this, i);
                }
            });
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureCompleted(HwCameraConstrainedHighSpeedCaptureSessionImpl.this, captureRequest, totalCaptureResult);
                }
            });
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureFailed(HwCameraConstrainedHighSpeedCaptureSessionImpl.this, captureRequest, captureFailure);
                }
            });
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureProgressed(HwCameraConstrainedHighSpeedCaptureSessionImpl.this, captureRequest, captureResult);
                }
            });
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureSequenceCompleted(HwCameraConstrainedHighSpeedCaptureSessionImpl.this, i, j);
                }
            });
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            final CaptureRequest captureRequest2 = captureRequest;
            final long j3 = j;
            final long j4 = j2;
            AnonymousClass1 r0 = new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureStarted(HwCameraConstrainedHighSpeedCaptureSessionImpl.this, captureRequest2, j3, j4);
                }
            };
            this.mUserHandler.post(r0);
        }

        public SessionCaptureCallbackProxy(HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler, List<CaptureRequest> list) {
            this.mUserCallback = captureCallback;
            this.mUserHandler = handler;
            this.mRequests = new ArrayList(list);
        }
    }

    public void abortCaptures() throws CameraAccessException {
    }

    public int capture(CaptureRequest captureRequest, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        return 0;
    }

    public int captureBurst(List<CaptureRequest> list, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        return 0;
    }

    public HwCameraDevice getDevice() {
        return null;
    }

    public Surface getInputSurface() {
        return null;
    }

    public boolean isReprocessable() {
        return false;
    }

    public void prepare(Surface surface) throws CameraAccessException {
    }

    public int setRepeatingRequest(CaptureRequest captureRequest, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        return 0;
    }

    public void stopRepeating() throws CameraAccessException {
    }

    /* access modifiers changed from: protected */
    public void checkIfClosed() {
        if (this.mClosed.get()) {
            throw new IllegalStateException("Session has been closed; further changes are illegal.");
        }
    }

    public synchronized void close() {
        if (!this.mClosed.getAndSet(true)) {
            this.mCameraCaptureSession.close();
        }
    }

    public List<CaptureRequest> createHighSpeedRequestList(CaptureRequest captureRequest) throws CameraAccessException {
        return this.mCameraCaptureSession.createHighSpeedRequestList(captureRequest);
    }

    static Handler checkHandler(Handler handler) {
        if (handler != null) {
            return handler;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new Handler(myLooper);
        }
        throw new IllegalArgumentException("No handler given, and current thread has no looper!");
    }

    static <T> Handler checkHandler(Handler handler, T t) {
        if (t != null) {
            return checkHandler(handler);
        }
        return handler;
    }

    HwCameraConstrainedHighSpeedCaptureSessionImpl(HwCameraDevice hwCameraDevice, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession) {
        this.mDevice = hwCameraDevice;
        this.mCameraCaptureSession = cameraConstrainedHighSpeedCaptureSession;
    }

    public synchronized int setRepeatingBurst(List<CaptureRequest> list, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        Handler checkHandler;
        SessionCaptureCallbackProxy sessionCaptureCallbackProxy;
        CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession;
        checkIfClosed();
        if (list == null) {
            throw new IllegalArgumentException("requests must not be null");
        } else if (!list.isEmpty()) {
            checkHandler = checkHandler(handler, captureCallback);
            sessionCaptureCallbackProxy = new SessionCaptureCallbackProxy(captureCallback, checkHandler, list);
            cameraConstrainedHighSpeedCaptureSession = this.mCameraCaptureSession;
            if (captureCallback == null) {
                sessionCaptureCallbackProxy = null;
            }
        } else {
            throw new IllegalArgumentException("requests must have at least one element");
        }
        return cameraConstrainedHighSpeedCaptureSession.setRepeatingBurst(list, sessionCaptureCallbackProxy, checkHandler);
    }
}
