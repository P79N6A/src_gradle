package com.mapbox.mapboxsdk.maps.renderer.c;

import android.graphics.SurfaceTexture;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.TextureView;
import com.mapbox.mapboxsdk.log.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class b extends Thread implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    final Object f26725a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<Runnable> f26726b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    boolean f26727c;

    /* renamed from: d  reason: collision with root package name */
    boolean f26728d;

    /* renamed from: e  reason: collision with root package name */
    boolean f26729e;

    /* renamed from: f  reason: collision with root package name */
    boolean f26730f;
    private final a g;
    private final a h;
    private SurfaceTexture i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<TextureView> f26731a;

        /* renamed from: b  reason: collision with root package name */
        boolean f26732b;

        /* renamed from: c  reason: collision with root package name */
        EGL10 f26733c;

        /* renamed from: d  reason: collision with root package name */
        public EGLConfig f26734d;

        /* renamed from: e  reason: collision with root package name */
        EGLDisplay f26735e = EGL10.EGL_NO_DISPLAY;

        /* renamed from: f  reason: collision with root package name */
        public EGLContext f26736f = EGL10.EGL_NO_CONTEXT;
        public EGLSurface g = EGL10.EGL_NO_SURFACE;

        /* access modifiers changed from: package-private */
        public final void d() {
            b();
            c();
            f();
        }

        private boolean e() {
            if (this.f26733c.eglMakeCurrent(this.f26735e, this.g, this.g, this.f26736f)) {
                return true;
            }
            Logger.w("Mbgl-TextureViewRenderThread", String.format("eglMakeCurrent: %s", new Object[]{Integer.valueOf(this.f26733c.eglGetError())}));
            return false;
        }

        private void f() {
            if (this.f26735e != EGL10.EGL_NO_DISPLAY) {
                if (!this.f26733c.eglTerminate(this.f26735e)) {
                    Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not terminate egl. Display %s", new Object[]{this.f26735e}));
                }
                this.f26735e = EGL10.EGL_NO_DISPLAY;
            }
        }

        public final void b() {
            if (this.g != EGL10.EGL_NO_SURFACE) {
                if (!this.f26733c.eglDestroySurface(this.f26735e, this.g)) {
                    Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl surface. Display %s, Surface %s", new Object[]{this.f26735e, this.g}));
                }
                this.g = EGL10.EGL_NO_SURFACE;
            }
        }

        public final void c() {
            if (this.f26736f != EGL10.EGL_NO_CONTEXT) {
                if (!this.f26733c.eglDestroyContext(this.f26735e, this.f26736f)) {
                    Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl context. Display %s, Context %s", new Object[]{this.f26735e, this.f26736f}));
                }
                this.f26736f = EGL10.EGL_NO_CONTEXT;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            b();
            TextureView textureView = (TextureView) this.f26731a.get();
            if (textureView != null) {
                this.g = this.f26733c.eglCreateWindowSurface(this.f26735e, this.f26734d, textureView.getSurfaceTexture(), new int[]{12344});
            } else {
                this.g = EGL10.EGL_NO_SURFACE;
            }
            if (this.g != null && this.g != EGL10.EGL_NO_SURFACE) {
                return e();
            }
            if (this.f26733c.eglGetError() == 12299) {
                Logger.e("Mbgl-TextureViewRenderThread", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }

        a(WeakReference<TextureView> weakReference, boolean z) {
            this.f26731a = weakReference;
            this.f26732b = z;
        }
    }

    @UiThread
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r10.i = null;
        r10.n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a1, code lost:
        com.mapbox.mapboxsdk.log.Logger.w("Mbgl-TextureViewRenderThread", "Context lost. Waiting for re-aquire");
        r1 = r10.f26725a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01aa, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r10.i = null;
        r10.n = true;
        r10.m = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b1, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0000, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0000, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
        if (r2 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0089, code lost:
        r1 = (javax.microedition.khronos.opengles.GL10) r10.h.f26736f.getGL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r3 == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r2 = r10.h;
        r2.f26733c = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a3, code lost:
        if (r2.f26735e != javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a5, code lost:
        r2.f26735e = r2.f26733c.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b3, code lost:
        if (r2.f26735e == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        if (r2.f26733c.eglInitialize(r2.f26735e, new int[2]) == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        throw new java.lang.RuntimeException("eglInitialize failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
        throw new java.lang.RuntimeException("eglGetDisplay failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d5, code lost:
        if (r2.f26731a != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d7, code lost:
        r2.f26734d = null;
        r2.f26736f = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e2, code lost:
        if (r2.f26736f != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e4, code lost:
        r2.f26734d = new com.mapbox.mapboxsdk.maps.renderer.a.a(r2.f26732b).chooseConfig(r2.f26733c, r2.f26735e);
        r2.f26736f = r2.f26733c.eglCreateContext(r2.f26735e, r2.f26734d, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010d, code lost:
        if (r2.f26736f == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0115, code lost:
        if (r10.h.a() != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0117, code lost:
        r1 = r10.f26725a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0119, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r10.n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0122, code lost:
        r10.g.onSurfaceCreated(r1, r10.h.f26734d);
        r10.g.onSurfaceChanged(r1, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0139, code lost:
        throw new java.lang.RuntimeException("createContext");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013a, code lost:
        if (r6 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013c, code lost:
        r10.h.a();
        r10.g.onSurfaceChanged(r1, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014a, code lost:
        if (r10.l == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014c, code lost:
        r10.g.onSurfaceChanged(r1, r7, r8);
        r10.l = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015b, code lost:
        if (r10.h.g == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015d, code lost:
        r10.g.onDrawFrame(r1);
        r1 = r10.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0170, code lost:
        if (r1.f26733c.eglSwapBuffers(r1.f26735e, r1.g) != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0172, code lost:
        r1 = r1.f26733c.eglGetError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0179, code lost:
        r1 = 12288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        if (r1 == 12288) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017f, code lost:
        if (r1 == 12302) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0181, code lost:
        com.mapbox.mapboxsdk.log.Logger.w("Mbgl-TextureViewRenderThread", java.lang.String.format("eglSwapBuffer error: %s. Waiting or new surface", new java.lang.Object[]{java.lang.Integer.valueOf(r1)}));
        r1 = r10.f26725a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0196, code lost:
        monitor-enter(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r10.f26725a     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x0004:
            boolean r2 = r10.f26729e     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x001d
            monitor-exit(r1)     // Catch:{ all -> 0x01be }
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r1 = r10.h
            r1.d()
            java.lang.Object r2 = r10.f26725a
            monitor-enter(r2)
            r10.f26730f = r0     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r10.f26725a     // Catch:{ all -> 0x001a }
            r0.notifyAll()     // Catch:{ all -> 0x001a }
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            java.util.ArrayList<java.lang.Runnable> r2 = r10.f26726b     // Catch:{ all -> 0x01be }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x01be }
            r3 = -1
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L_0x0035
            java.util.ArrayList<java.lang.Runnable> r2 = r10.f26726b     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r2.remove(r5)     // Catch:{ all -> 0x01be }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x01be }
        L_0x0030:
            r3 = 0
            r6 = 0
            r7 = -1
            r8 = -1
            goto L_0x0081
        L_0x0035:
            boolean r2 = r10.n     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0041
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r2 = r10.h     // Catch:{ all -> 0x01be }
            r2.b()     // Catch:{ all -> 0x01be }
            r10.n = r5     // Catch:{ all -> 0x01be }
            goto L_0x004c
        L_0x0041:
            boolean r2 = r10.m     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x004e
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r2 = r10.h     // Catch:{ all -> 0x01be }
            r2.c()     // Catch:{ all -> 0x01be }
            r10.m = r5     // Catch:{ all -> 0x01be }
        L_0x004c:
            r2 = r4
            goto L_0x0030
        L_0x004e:
            android.graphics.SurfaceTexture r2 = r10.i     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x01b7
            boolean r2 = r10.f26728d     // Catch:{ all -> 0x01be }
            if (r2 != 0) goto L_0x01b7
            boolean r2 = r10.f26727c     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x01b7
            int r3 = r10.j     // Catch:{ all -> 0x01be }
            int r2 = r10.k     // Catch:{ all -> 0x01be }
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r6 = r10.h     // Catch:{ all -> 0x01be }
            javax.microedition.khronos.egl.EGLContext r6 = r6.f26736f     // Catch:{ all -> 0x01be }
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ all -> 0x01be }
            if (r6 != r7) goto L_0x006c
            r8 = r2
            r7 = r3
            r2 = r4
            r3 = 1
        L_0x006a:
            r6 = 0
            goto L_0x0081
        L_0x006c:
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r6 = r10.h     // Catch:{ all -> 0x01be }
            javax.microedition.khronos.egl.EGLSurface r6 = r6.g     // Catch:{ all -> 0x01be }
            javax.microedition.khronos.egl.EGLSurface r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x01be }
            if (r6 != r7) goto L_0x007a
            r8 = r2
            r7 = r3
            r2 = r4
            r3 = 0
            r6 = 1
            goto L_0x0081
        L_0x007a:
            r10.f26727c = r5     // Catch:{ all -> 0x01be }
            r8 = r2
            r7 = r3
            r2 = r4
            r3 = 0
            goto L_0x006a
        L_0x0081:
            monitor-exit(r1)     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x0089
            r2.run()     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            goto L_0x0000
        L_0x0089:
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r1 = r10.h     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLContext r1 = r1.f26736f     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.opengles.GL r1 = r1.getGL()     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.opengles.GL10 r1 = (javax.microedition.khronos.opengles.GL10) r1     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r3 == 0) goto L_0x013a
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r2 = r10.h     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGL r3 = javax.microedition.khronos.egl.EGLContext.getEGL()     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGL10 r3 = (javax.microedition.khronos.egl.EGL10) r3     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.f26733c = r3     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r3 = r2.f26735e     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r3 != r5) goto L_0x00d3
            javax.microedition.khronos.egl.EGL10 r3 = r2.f26733c     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.Object r5 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r3 = r3.eglGetDisplay(r5)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.f26735e = r3     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r3 = r2.f26735e     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r5 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r3 == r5) goto L_0x00cb
            r3 = 2
            int[] r3 = new int[r3]     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGL10 r5 = r2.f26733c     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r6 = r2.f26735e     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            boolean r3 = r5.eglInitialize(r6, r3)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r3 == 0) goto L_0x00c3
            goto L_0x00d3
        L_0x00c3:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.String r2 = "eglInitialize failed"
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            throw r1     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x00cb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.String r2 = "eglGetDisplay failed"
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            throw r1     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x00d3:
            java.lang.ref.WeakReference<android.view.TextureView> r3 = r2.f26731a     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r3 != 0) goto L_0x00de
            r2.f26734d = r4     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.f26736f = r3     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            goto L_0x0109
        L_0x00de:
            javax.microedition.khronos.egl.EGLContext r3 = r2.f26736f     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLContext r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r3 != r4) goto L_0x0109
            com.mapbox.mapboxsdk.maps.renderer.a.a r3 = new com.mapbox.mapboxsdk.maps.renderer.a.a     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            boolean r4 = r2.f26732b     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r3.<init>(r4)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGL10 r4 = r2.f26733c     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r5 = r2.f26735e     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLConfig r3 = r3.chooseConfig(r4, r5)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.f26734d = r3     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r3 = 3
            int[] r3 = new int[r3]     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r3 = {12440, 2, 12344} // fill-array     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGL10 r4 = r2.f26733c     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r5 = r2.f26735e     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLConfig r6 = r2.f26734d     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLContext r3 = r4.eglCreateContext(r5, r6, r9, r3)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.f26736f = r3     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x0109:
            javax.microedition.khronos.egl.EGLContext r2 = r2.f26736f     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r2 == r3) goto L_0x0132
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r2 = r10.h     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            boolean r2 = r2.a()     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r2 != 0) goto L_0x0122
            java.lang.Object r1 = r10.f26725a     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r10.n = r0     // Catch:{ all -> 0x011f }
            monitor-exit(r1)     // Catch:{ all -> 0x011f }
            goto L_0x0000
        L_0x011f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011f }
            throw r2     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x0122:
            com.mapbox.mapboxsdk.maps.renderer.c.a r2 = r10.g     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r3 = r10.h     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLConfig r3 = r3.f26734d     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.onSurfaceCreated(r1, r3)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            com.mapbox.mapboxsdk.maps.renderer.c.a r2 = r10.g     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.onSurfaceChanged(r1, r7, r8)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            goto L_0x0000
        L_0x0132:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.String r2 = "createContext"
            r1.<init>(r2)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            throw r1     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x013a:
            if (r6 == 0) goto L_0x0148
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r2 = r10.h     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.a()     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            com.mapbox.mapboxsdk.maps.renderer.c.a r2 = r10.g     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.onSurfaceChanged(r1, r7, r8)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            goto L_0x0000
        L_0x0148:
            boolean r2 = r10.l     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r2 == 0) goto L_0x0155
            com.mapbox.mapboxsdk.maps.renderer.c.a r2 = r10.g     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.onSurfaceChanged(r1, r7, r8)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r10.l = r5     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            goto L_0x0000
        L_0x0155:
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r2 = r10.h     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLSurface r2 = r2.g     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLSurface r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            if (r2 == r3) goto L_0x0000
            com.mapbox.mapboxsdk.maps.renderer.c.a r2 = r10.g     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r2.onDrawFrame(r1)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r1 = r10.h     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGL10 r2 = r1.f26733c     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLDisplay r3 = r1.f26735e     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            javax.microedition.khronos.egl.EGLSurface r6 = r1.g     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            boolean r2 = r2.eglSwapBuffers(r3, r6)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r3 = 12288(0x3000, float:1.7219E-41)
            if (r2 != 0) goto L_0x0179
            javax.microedition.khronos.egl.EGL10 r1 = r1.f26733c     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            int r1 = r1.eglGetError()     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            goto L_0x017b
        L_0x0179:
            r1 = 12288(0x3000, float:1.7219E-41)
        L_0x017b:
            if (r1 == r3) goto L_0x0000
            r2 = 12302(0x300e, float:1.7239E-41)
            if (r1 == r2) goto L_0x01a1
            java.lang.String r2 = "Mbgl-TextureViewRenderThread"
            java.lang.String r3 = "eglSwapBuffer error: %s. Waiting or new surface"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r6[r5] = r1     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.String r1 = java.lang.String.format(r3, r6)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            com.mapbox.mapboxsdk.log.Logger.w(r2, r1)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.Object r1 = r10.f26725a     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r10.i = r4     // Catch:{ all -> 0x019e }
            r10.n = r0     // Catch:{ all -> 0x019e }
            monitor-exit(r1)     // Catch:{ all -> 0x019e }
            goto L_0x0000
        L_0x019e:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x019e }
            throw r2     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x01a1:
            java.lang.String r1 = "Mbgl-TextureViewRenderThread"
            java.lang.String r2 = "Context lost. Waiting for re-aquire"
            com.mapbox.mapboxsdk.log.Logger.w(r1, r2)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            java.lang.Object r1 = r10.f26725a     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
            r10.i = r4     // Catch:{ all -> 0x01b4 }
            r10.n = r0     // Catch:{ all -> 0x01b4 }
            r10.m = r0     // Catch:{ all -> 0x01b4 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b4 }
            goto L_0x0000
        L_0x01b4:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b4 }
            throw r2     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x01b7:
            java.lang.Object r2 = r10.f26725a     // Catch:{ all -> 0x01be }
            r2.wait()     // Catch:{ all -> 0x01be }
            goto L_0x0004
        L_0x01be:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01be }
            throw r2     // Catch:{ InterruptedException -> 0x01d6, all -> 0x01c1 }
        L_0x01c1:
            r1 = move-exception
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r2 = r10.h
            r2.d()
            java.lang.Object r2 = r10.f26725a
            monitor-enter(r2)
            r10.f26730f = r0     // Catch:{ all -> 0x01d3 }
            java.lang.Object r0 = r10.f26725a     // Catch:{ all -> 0x01d3 }
            r0.notifyAll()     // Catch:{ all -> 0x01d3 }
            monitor-exit(r2)     // Catch:{ all -> 0x01d3 }
            throw r1
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d3 }
            throw r0
        L_0x01d6:
            com.mapbox.mapboxsdk.maps.renderer.c.b$a r1 = r10.h
            r1.d()
            java.lang.Object r1 = r10.f26725a
            monitor-enter(r1)
            r10.f26730f = r0     // Catch:{ all -> 0x01e7 }
            java.lang.Object r0 = r10.f26725a     // Catch:{ all -> 0x01e7 }
            r0.notifyAll()     // Catch:{ all -> 0x01e7 }
            monitor-exit(r1)     // Catch:{ all -> 0x01e7 }
            return
        L_0x01e7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01e7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.renderer.c.b.run():void");
    }

    @UiThread
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.f26725a) {
            this.i = null;
            this.n = true;
            this.f26727c = false;
            this.f26725a.notifyAll();
        }
        return true;
    }

    @UiThread
    b(@NonNull TextureView textureView, @NonNull a aVar) {
        textureView.setOpaque(!aVar.f26724b);
        textureView.setSurfaceTextureListener(this);
        this.g = aVar;
        this.h = new a(new WeakReference(textureView), aVar.f26724b);
    }

    @UiThread
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        synchronized (this.f26725a) {
            this.i = surfaceTexture;
            this.j = i2;
            this.k = i3;
            this.f26727c = true;
            this.f26725a.notifyAll();
        }
    }

    @UiThread
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        synchronized (this.f26725a) {
            this.j = i2;
            this.k = i3;
            this.l = true;
            this.f26727c = true;
            this.f26725a.notifyAll();
        }
    }
}
