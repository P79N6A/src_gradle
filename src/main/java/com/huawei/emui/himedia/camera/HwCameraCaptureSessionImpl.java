package com.huawei.emui.himedia.camera;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
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

public class HwCameraCaptureSessionImpl extends HwCameraCaptureSession {
    protected final CameraCaptureSession mCameraCaptureSession;
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
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureSequenceAborted(HwCameraCaptureSessionImpl.this, i);
                }
            });
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureCompleted(HwCameraCaptureSessionImpl.this, captureRequest, totalCaptureResult);
                }
            });
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureFailed(HwCameraCaptureSessionImpl.this, captureRequest, captureFailure);
                }
            });
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureProgressed(HwCameraCaptureSessionImpl.this, captureRequest, captureResult);
                }
            });
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureSequenceCompleted(HwCameraCaptureSessionImpl.this, i, j);
                }
            });
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            final CaptureRequest captureRequest2 = captureRequest;
            final long j3 = j;
            final long j4 = j2;
            AnonymousClass1 r0 = new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureStarted(HwCameraCaptureSessionImpl.this, captureRequest2, j3, j4);
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

    public HwCameraDevice getDevice() {
        checkIfClosed();
        return this.mDevice;
    }

    public Surface getInputSurface() {
        checkIfClosed();
        return null;
    }

    public boolean isReprocessable() {
        checkIfClosed();
        return false;
    }

    public synchronized void abortCaptures() throws CameraAccessException {
        checkIfClosed();
        this.mCameraCaptureSession.abortCaptures();
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            close();
            super.finalize();
        } finally {
            super.finalize();
        }
    }

    public synchronized void stopRepeating() throws CameraAccessException {
        checkIfClosed();
        this.mCameraCaptureSession.stopRepeating();
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

    public void prepare(Surface surface) throws CameraAccessException {
        checkIfClosed();
        throw new UnsupportedOperationException("Pre-allocation all buffers for an output Surface is not supported in this device");
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

    HwCameraCaptureSessionImpl(HwCameraDevice hwCameraDevice, CameraCaptureSession cameraCaptureSession) {
        this.mDevice = hwCameraDevice;
        this.mCameraCaptureSession = cameraCaptureSession;
    }

    public synchronized int capture(CaptureRequest captureRequest, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        Handler checkHandler;
        SessionCaptureCallbackProxy sessionCaptureCallbackProxy;
        CameraCaptureSession cameraCaptureSession;
        checkIfClosed();
        if (captureRequest != null) {
            checkHandler = checkHandler(handler, captureCallback);
            ArrayList arrayList = new ArrayList();
            arrayList.add(captureRequest);
            sessionCaptureCallbackProxy = new SessionCaptureCallbackProxy(captureCallback, checkHandler, arrayList);
            cameraCaptureSession = this.mCameraCaptureSession;
            if (captureCallback == null) {
                sessionCaptureCallbackProxy = null;
            }
        } else {
            throw new IllegalArgumentException("request must not be null");
        }
        return cameraCaptureSession.capture(captureRequest, sessionCaptureCallbackProxy, checkHandler);
    }

    public synchronized int captureBurst(List<CaptureRequest> list, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        Handler checkHandler;
        SessionCaptureCallbackProxy sessionCaptureCallbackProxy;
        CameraCaptureSession cameraCaptureSession;
        checkIfClosed();
        if (list == null) {
            throw new IllegalArgumentException("requests must not be null");
        } else if (!list.isEmpty()) {
            checkHandler = checkHandler(handler, captureCallback);
            sessionCaptureCallbackProxy = new SessionCaptureCallbackProxy(captureCallback, checkHandler, list);
            cameraCaptureSession = this.mCameraCaptureSession;
            if (captureCallback == null) {
                sessionCaptureCallbackProxy = null;
            }
        } else {
            throw new IllegalArgumentException("requests must have at least one element");
        }
        return cameraCaptureSession.captureBurst(list, sessionCaptureCallbackProxy, checkHandler);
    }

    public synchronized int setRepeatingBurst(List<CaptureRequest> list, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        Handler checkHandler;
        SessionCaptureCallbackProxy sessionCaptureCallbackProxy;
        CameraCaptureSession cameraCaptureSession;
        checkIfClosed();
        if (list == null) {
            throw new IllegalArgumentException("requests must not be null");
        } else if (!list.isEmpty()) {
            checkHandler = checkHandler(handler, captureCallback);
            sessionCaptureCallbackProxy = new SessionCaptureCallbackProxy(captureCallback, checkHandler, list);
            cameraCaptureSession = this.mCameraCaptureSession;
            if (captureCallback == null) {
                sessionCaptureCallbackProxy = null;
            }
        } else {
            throw new IllegalArgumentException("requests must have at least one element");
        }
        return cameraCaptureSession.setRepeatingBurst(list, sessionCaptureCallbackProxy, checkHandler);
    }

    public synchronized int setRepeatingRequest(CaptureRequest captureRequest, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        Handler checkHandler;
        SessionCaptureCallbackProxy sessionCaptureCallbackProxy;
        CameraCaptureSession cameraCaptureSession;
        checkIfClosed();
        if (captureRequest != null) {
            checkHandler = checkHandler(handler, captureCallback);
            ArrayList arrayList = new ArrayList();
            arrayList.add(captureRequest);
            sessionCaptureCallbackProxy = new SessionCaptureCallbackProxy(captureCallback, checkHandler, arrayList);
            cameraCaptureSession = this.mCameraCaptureSession;
            if (captureCallback == null) {
                sessionCaptureCallbackProxy = null;
            }
        } else {
            throw new IllegalArgumentException("request must not be null");
        }
        return cameraCaptureSession.setRepeatingRequest(captureRequest, sessionCaptureCallbackProxy, checkHandler);
    }
}
