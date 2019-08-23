package com.ss.android.ugc.aweme.livewallpaper.b;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53608a;

    /* renamed from: b  reason: collision with root package name */
    private EGLDisplay f53609b = EGL10.EGL_NO_DISPLAY;

    /* renamed from: c  reason: collision with root package name */
    private EGLContext f53610c = EGL10.EGL_NO_CONTEXT;

    /* renamed from: d  reason: collision with root package name */
    private EGLConfig f53611d;

    /* renamed from: e  reason: collision with root package name */
    private EGL10 f53612e = ((EGL10) EGLContext.getEGL());

    public final void a(Object obj, long j) {
    }

    public final void finalize() {
        if (PatchProxy.isSupport(new Object[0], this, f53608a, false, 56060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53608a, false, 56060, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53609b != EGL10.EGL_NO_DISPLAY) {
            a();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53608a, false, 56059, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53608a, false, 56059, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53609b != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f53612e;
            EGLDisplay eGLDisplay = this.f53609b;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f53612e.eglDestroyContext(this.f53609b, this.f53610c);
            this.f53612e.eglTerminate(this.f53609b);
        }
        this.f53609b = EGL10.EGL_NO_DISPLAY;
        this.f53610c = EGL10.EGL_NO_CONTEXT;
        this.f53611d = null;
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53608a, false, 56061, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53608a, false, 56061, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f53612e.eglDestroySurface(this.f53609b, (EGLSurface) obj);
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f53608a, false, 56071, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f53608a, false, 56071, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int eglGetError = this.f53612e.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str2 + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    public final Object b(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53608a, false, 56062, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f53608a, false, 56062, new Class[]{Object.class}, Object.class);
        } else if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = this.f53612e.eglCreateWindowSurface(this.f53609b, this.f53611d, obj, new int[]{12344});
            a("eglCreateWindowSurface");
            if (eglCreateWindowSurface != null) {
                return eglCreateWindowSurface;
            }
            throw new RuntimeException("surface was null");
        } else {
            throw new RuntimeException("invalid surface: " + obj);
        }
    }

    public final void c(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53608a, false, 56064, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53608a, false, 56064, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!this.f53612e.eglMakeCurrent(this.f53609b, eGLSurface, eGLSurface, this.f53610c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final boolean d(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f53608a, false, 56067, new Class[]{Object.class}, Boolean.TYPE)) {
            return this.f53612e.eglSwapBuffers(this.f53609b, (EGLSurface) obj);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f53608a, false, 56067, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int a(Object obj, int i) {
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i)}, this, f53608a, false, 56069, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i)}, this, f53608a, false, 56069, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[1];
        this.f53612e.eglQuerySurface(this.f53609b, (EGLSurface) obj, i, iArr);
        return iArr[0];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.microedition.khronos.egl.EGLConfig} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.Object r13, int r14) {
        /*
            r12 = this;
            r12.<init>()
            javax.microedition.khronos.egl.EGLDisplay r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r12.f53609b = r0
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            r12.f53610c = r0
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r12.f53612e = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r12.f53609b
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            if (r0 != r1) goto L_0x00f1
            if (r13 != 0) goto L_0x001d
            javax.microedition.khronos.egl.EGLContext r13 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
        L_0x001d:
            javax.microedition.khronos.egl.EGL10 r0 = r12.f53612e
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r12.f53609b = r0
            javax.microedition.khronos.egl.EGLDisplay r0 = r12.f53609b
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            if (r0 == r1) goto L_0x00e9
            r0 = 2
            int[] r1 = new int[r0]
            javax.microedition.khronos.egl.EGL10 r2 = r12.f53612e
            javax.microedition.khronos.egl.EGLDisplay r3 = r12.f53609b
            boolean r1 = r2.eglInitialize(r3, r1)
            r2 = 0
            if (r1 == 0) goto L_0x00df
            javax.microedition.khronos.egl.EGLContext r1 = r12.f53610c
            javax.microedition.khronos.egl.EGLContext r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r3) goto L_0x00de
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r3 = 0
            r4[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r11 = 1
            r4[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r6 = f53608a
            r7 = 0
            r8 = 56070(0xdb06, float:7.8571E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r9[r3] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r9[r11] = r1
            java.lang.Class<javax.microedition.khronos.egl.EGLConfig> r10 = javax.microedition.khronos.egl.EGLConfig.class
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0093
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4[r3] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r4[r11] = r14
            com.meituan.robust.ChangeQuickRedirect r6 = f53608a
            r7 = 0
            r8 = 56070(0xdb06, float:7.8571E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r14 = java.lang.Integer.TYPE
            r9[r3] = r14
            java.lang.Class r14 = java.lang.Integer.TYPE
            r9[r11] = r14
            java.lang.Class<javax.microedition.khronos.egl.EGLConfig> r10 = javax.microedition.khronos.egl.EGLConfig.class
            r5 = r12
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            r2 = r14
            javax.microedition.khronos.egl.EGLConfig r2 = (javax.microedition.khronos.egl.EGLConfig) r2
            goto L_0x00ba
        L_0x0093:
            r0 = 11
            int[] r6 = new int[r0]
            r6 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344, 0, 12344} // fill-array
            r14 = r14 & r11
            if (r14 == 0) goto L_0x00a7
            r14 = 8
            r0 = 12610(0x3142, float:1.767E-41)
            r6[r14] = r0
            r14 = 9
            r6[r14] = r11
        L_0x00a7:
            javax.microedition.khronos.egl.EGLConfig[] r14 = new javax.microedition.khronos.egl.EGLConfig[r11]
            int[] r9 = new int[r11]
            javax.microedition.khronos.egl.EGL10 r4 = r12.f53612e
            javax.microedition.khronos.egl.EGLDisplay r5 = r12.f53609b
            r8 = 1
            r7 = r14
            boolean r0 = r4.eglChooseConfig(r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r2 = r14[r3]
        L_0x00ba:
            if (r2 == 0) goto L_0x00d6
            r14 = 3
            int[] r14 = new int[r14]
            r14 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r0 = r12.f53612e
            javax.microedition.khronos.egl.EGLDisplay r1 = r12.f53609b
            javax.microedition.khronos.egl.EGLContext r13 = (javax.microedition.khronos.egl.EGLContext) r13
            javax.microedition.khronos.egl.EGLContext r13 = r0.eglCreateContext(r1, r2, r13, r14)
            java.lang.String r14 = "eglCreateContext"
            r12.a((java.lang.String) r14)
            r12.f53611d = r2
            r12.f53610c = r13
            goto L_0x00de
        L_0x00d6:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unable to find a suitable EGLConfig"
            r13.<init>(r14)
            throw r13
        L_0x00de:
            return
        L_0x00df:
            r12.f53609b = r2
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "unable to initialize EGL10"
            r13.<init>(r14)
            throw r13
        L_0x00e9:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "unable to get EGL10 display"
            r13.<init>(r14)
            throw r13
        L_0x00f1:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "EGL already set up"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.b.a.<init>(java.lang.Object, int):void");
    }

    public final Object a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53608a, false, 56063, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53608a, false, 56063, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class);
        }
        EGLSurface eglCreatePbufferSurface = this.f53612e.eglCreatePbufferSurface(this.f53609b, this.f53611d, new int[]{12375, i, 12374, i2, 12344});
        a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }
}
