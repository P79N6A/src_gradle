package com.huawei.emui.himedia.camera;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Surface;
import com.huawei.android.sdk.camera.HwCameraCaptureResultEx;
import com.huawei.emui.himedia.camera.HwCameraSuperSlowMotionCaptureSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class HwCameraSuperSlowMotionCaptureSessionImpl extends HwCameraSuperSlowMotionCaptureSession {
    private final CameraCaptureSession mCameraCaptureSession;
    protected final AtomicBoolean mClosed = new AtomicBoolean();
    private final HwCameraDevice mDevice;
    CaptureResult.Key superSlowStatusKey = null;

    class SessionCaptureCallbackProxy extends CameraCaptureSession.CaptureCallback {
        private final Map<Long, List<CaptureResult>> mPartialResultMap = new HashMap();
        private final Map<CaptureRequest, CaptureRequest> mRequestMap = new HashMap();
        private final List<CaptureRequest> mRequests;
        public final HwCameraSuperSlowMotionCaptureSession.CaptureCallback mUserCallback;
        private final Handler mUserHandler;

        private byte getStatusFromResult(TotalCaptureResult totalCaptureResult) {
            long currentTimeMillis = System.currentTimeMillis();
            if (HwCamera.SDK_USAGE_FALG != 2) {
                return ((Byte) totalCaptureResult.get(HwCameraCaptureResultEx.HUAWEI_SUPER_SLOW_MOTION_STATUS)).byteValue();
            }
            String str = null;
            try {
                str = HwCameraEngineUtils.mICamera.getCaptureResultKeyName(1);
            } catch (RemoteException unused) {
            }
            if (str == null) {
                return 0;
            }
            if (HwCameraSuperSlowMotionCaptureSessionImpl.this.superSlowStatusKey == null) {
                Iterator it2 = totalCaptureResult.getKeys().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CaptureResult.Key key = (CaptureResult.Key) it2.next();
                    if (key.getName().equals(str)) {
                        HwCameraSuperSlowMotionCaptureSessionImpl.this.superSlowStatusKey = key;
                        break;
                    }
                }
            }
            if (HwCameraSuperSlowMotionCaptureSessionImpl.this.superSlowStatusKey != null) {
                return ((byte[]) totalCaptureResult.get(HwCameraSuperSlowMotionCaptureSessionImpl.this.superSlowStatusKey))[0];
            }
            HwCameraEngineUtils.reportFunc("getStatusFromResult", 0, "ResKeyNotF", System.currentTimeMillis() - currentTimeMillis);
            return 0;
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, final int i) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureSequenceAborted(HwCameraSuperSlowMotionCaptureSessionImpl.this, i);
                }
            });
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureFailed(HwCameraSuperSlowMotionCaptureSessionImpl.this, captureRequest, captureFailure);
                }
            });
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureProgressed(HwCameraSuperSlowMotionCaptureSessionImpl.this, captureRequest, captureResult);
                }
            });
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureSequenceCompleted(HwCameraSuperSlowMotionCaptureSessionImpl.this, i, j);
                }
            });
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            final Byte valueOf = Byte.valueOf(getStatusFromResult(totalCaptureResult));
            this.mUserHandler.post(new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureCompleted(HwCameraSuperSlowMotionCaptureSessionImpl.this, captureRequest, totalCaptureResult, valueOf);
                }
            });
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            final CaptureRequest captureRequest2 = captureRequest;
            final long j3 = j;
            final long j4 = j2;
            AnonymousClass1 r0 = new Runnable() {
                public void run() {
                    SessionCaptureCallbackProxy.this.mUserCallback.onCaptureStarted(HwCameraSuperSlowMotionCaptureSessionImpl.this, captureRequest2, j3, j4);
                }
            };
            this.mUserHandler.post(r0);
        }

        public SessionCaptureCallbackProxy(HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler, List<CaptureRequest> list) {
            this.mUserCallback = captureCallback;
            this.mUserHandler = handler;
            this.mRequests = new ArrayList(list);
        }
    }

    public void abortCaptures() throws CameraAccessException {
    }

    public int capture(CaptureRequest captureRequest, HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        return 0;
    }

    public int captureBurst(List<CaptureRequest> list, HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
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

    public int setRepeatingRequest(CaptureRequest captureRequest, HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        return 0;
    }

    public void stopRepeating() throws CameraAccessException {
    }

    /* access modifiers changed from: protected */
    public void checkIfClosed() {
        if (this.mClosed.get()) {
            throw new IllegalStateException("Device was already closed");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void close() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.mClosed     // Catch:{ all -> 0x0018 }
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r2)
            return
        L_0x000c:
            com.huawei.emui.himedia.camera.HwCameraDevice r0 = r2.mDevice     // Catch:{ RemoteException -> 0x0011 }
            r0.cleanSuperSlowMotionTag()     // Catch:{ RemoteException -> 0x0011 }
        L_0x0011:
            android.hardware.camera2.CameraCaptureSession r0 = r2.mCameraCaptureSession     // Catch:{ all -> 0x0018 }
            r0.close()     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.emui.himedia.camera.HwCameraSuperSlowMotionCaptureSessionImpl.close():void");
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

    HwCameraSuperSlowMotionCaptureSessionImpl(HwCameraDevice hwCameraDevice, CameraCaptureSession cameraCaptureSession) {
        this.mDevice = hwCameraDevice;
        this.mCameraCaptureSession = cameraCaptureSession;
    }

    public int setRepeatingBurst(List<CaptureRequest> list, HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        checkIfClosed();
        if (list == null) {
            throw new IllegalArgumentException("requests must not be null");
        } else if (!list.isEmpty()) {
            Handler checkHandler = checkHandler(handler, captureCallback);
            SessionCaptureCallbackProxy sessionCaptureCallbackProxy = new SessionCaptureCallbackProxy(captureCallback, checkHandler, list);
            CameraCaptureSession cameraCaptureSession = this.mCameraCaptureSession;
            if (captureCallback == null) {
                sessionCaptureCallbackProxy = null;
            }
            return cameraCaptureSession.setRepeatingBurst(list, sessionCaptureCallbackProxy, checkHandler);
        } else {
            throw new IllegalArgumentException("requests must have at least one element");
        }
    }

    public int setRepeatingSuperSlowMotionRequest(CaptureRequest captureRequest, HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        checkIfClosed();
        if (captureRequest != null) {
            Handler checkHandler = checkHandler(handler, captureCallback);
            ArrayList arrayList = new ArrayList();
            arrayList.add(captureRequest);
            SessionCaptureCallbackProxy sessionCaptureCallbackProxy = new SessionCaptureCallbackProxy(captureCallback, checkHandler, arrayList);
            CameraCaptureSession cameraCaptureSession = this.mCameraCaptureSession;
            List asList = Arrays.asList(new CaptureRequest[]{captureRequest});
            if (captureCallback == null) {
                sessionCaptureCallbackProxy = null;
            }
            return cameraCaptureSession.setRepeatingBurst(asList, sessionCaptureCallbackProxy, checkHandler);
        }
        throw new IllegalArgumentException("requests must not be null");
    }
}
