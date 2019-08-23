package com.ss.ttm.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@TargetApi(17)
public final class DummySurface extends Surface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final DummySurfaceThread thread;
    private boolean threadReleased;

    static class DummySurfaceThread extends HandlerThread implements Handler.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NonNull
        private EGLSurfaceTexture eglSurfaceTexture;
        @NonNull
        private Handler handler;
        @Nullable
        private Error initError;
        @Nullable
        private RuntimeException initException;
        @Nullable
        private DummySurface surface;

        public DummySurfaceThread() {
            super("dummySurface");
        }

        private void releaseInternal() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90610, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90610, new Class[0], Void.TYPE);
            } else if (this.eglSurfaceTexture != null) {
                this.eglSurfaceTexture.release();
            } else {
                throw new NullPointerException();
            }
        }

        public void release() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90607, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90607, new Class[0], Void.TYPE);
            } else if (this.handler != null) {
                this.handler.sendEmptyMessage(2);
            } else {
                throw new NullPointerException();
            }
        }

        private void initInternal(int i) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90609, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90609, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (this.eglSurfaceTexture != null) {
                this.eglSurfaceTexture.init(i);
                SurfaceTexture surfaceTexture = this.eglSurfaceTexture.getSurfaceTexture();
                if (i == 0) {
                    z = false;
                }
                this.surface = new DummySurface(this, surfaceTexture, z);
            } else {
                throw new NullPointerException();
            }
        }

        public boolean handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 90608, new Class[]{Message.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 90608, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
            }
            switch (message.what) {
                case 1:
                    try {
                        initInternal(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        this.initException = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e3) {
                        try {
                            this.initError = e3;
                            synchronized (this) {
                                notify();
                            }
                        } catch (Throwable th) {
                            synchronized (this) {
                                notify();
                                throw th;
                            }
                        }
                    }
                    return true;
                case 2:
                    try {
                        releaseInternal();
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        quit();
                        throw th3;
                    }
                    quit();
                    return true;
                default:
                    return true;
            }
        }

        public DummySurface init(int i) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90606, new Class[]{Integer.TYPE}, DummySurface.class)) {
                return (DummySurface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90606, new Class[]{Integer.TYPE}, DummySurface.class);
            }
            start();
            this.handler = new Handler(getLooper(), this);
            this.eglSurfaceTexture = new EGLSurfaceTexture(this.handler);
            synchronized (this) {
                this.handler.obtainMessage(1, i, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            if (this.initException != null) {
                throw this.initException;
            } else if (this.initError != null) {
                throw this.initError;
            } else if (this.surface != null) {
                return this.surface;
            } else {
                throw new NullPointerException();
            }
        }
    }

    private static void assertApiLevel17OrHigher() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90604, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public final void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90603, new Class[0], Void.TYPE);
            return;
        }
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.release();
                this.threadReleased = true;
            }
        }
    }

    @TargetApi(24)
    private static int getSecureModeV24(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90605, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90605, new Class[]{Context.class}, Integer.TYPE)).intValue();
        } else if (Build.VERSION.SDK_INT < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return 0;
        } else {
            String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            if (eglQueryString == null || !eglQueryString.contains("EGL_EXT_protected_content")) {
                return 0;
            }
            if (eglQueryString.contains("EGL_KHR_surfaceless_context")) {
                return 1;
            }
            return 2;
        }
    }

    public static synchronized boolean isSecureSupported(Context context) {
        int i;
        synchronized (DummySurface.class) {
            if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90601, new Class[]{Context.class}, Boolean.TYPE)) {
                boolean booleanValue = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90601, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
                return booleanValue;
            }
            if (!secureModeInitialized) {
                if (Build.VERSION.SDK_INT < 24) {
                    i = 0;
                } else {
                    i = getSecureModeV24(context);
                }
                secureMode = i;
                secureModeInitialized = true;
            }
            if (secureMode != 0) {
                return true;
            }
            return false;
        }
    }

    public static DummySurface newInstanceV17(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 90602, new Class[]{Boolean.TYPE}, DummySurface.class)) {
            return (DummySurface) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 90602, new Class[]{Boolean.TYPE}, DummySurface.class);
        }
        assertApiLevel17OrHigher();
        DummySurfaceThread dummySurfaceThread = new DummySurfaceThread();
        if (z) {
            i = secureMode;
        }
        return dummySurfaceThread.init(i);
    }

    private DummySurface(DummySurfaceThread dummySurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = dummySurfaceThread;
        this.secure = z;
    }
}
