package com.ss.android.ugc.aweme.livewallpaper.b;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@TargetApi(18)
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53613a;

    /* renamed from: b  reason: collision with root package name */
    private EGLDisplay f53614b = EGL14.EGL_NO_DISPLAY;

    /* renamed from: c  reason: collision with root package name */
    private EGLContext f53615c = EGL14.EGL_NO_CONTEXT;

    /* renamed from: d  reason: collision with root package name */
    private EGLConfig f53616d;

    public final void finalize() {
        if (PatchProxy.isSupport(new Object[0], this, f53613a, false, 56074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53613a, false, 56074, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53614b != EGL14.EGL_NO_DISPLAY) {
            a();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53613a, false, 56073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53613a, false, 56073, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53614b != EGL14.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplay = this.f53614b;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f53614b, this.f53615c);
            if (Build.VERSION.SDK_INT >= 19) {
                EGL14.eglReleaseThread();
            }
            EGL14.eglTerminate(this.f53614b);
        }
        this.f53614b = EGL14.EGL_NO_DISPLAY;
        this.f53615c = EGL14.EGL_NO_CONTEXT;
        this.f53616d = null;
    }

    public final void a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53613a, false, 56075, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53613a, false, 56075, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        EGL14.eglDestroySurface(this.f53614b, (EGLSurface) obj);
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f53613a, false, 56086, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f53613a, false, 56086, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str2 + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    public final Object b(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53613a, false, 56076, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f53613a, false, 56076, new Class[]{Object.class}, Object.class);
        } else if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f53614b, this.f53616d, obj, new int[]{12344}, 0);
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
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53613a, false, 56078, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f53613a, false, 56078, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) obj;
        if (!EGL14.eglMakeCurrent(this.f53614b, eGLSurface, eGLSurface, this.f53615c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final boolean d(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f53613a, false, 56081, new Class[]{Object.class}, Boolean.TYPE)) {
            return EGL14.eglSwapBuffers(this.f53614b, (EGLSurface) obj);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f53613a, false, 56081, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int a(Object obj, int i) {
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i)}, this, f53613a, false, 56084, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i)}, this, f53613a, false, 56084, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f53614b, (EGLSurface) obj, i, iArr, 0);
        return iArr[0];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.opengl.EGLConfig} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(java.lang.Object r14, int r15) {
        /*
            r13 = this;
            r13.<init>()
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r13.f53614b = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r13.f53615c = r0
            android.opengl.EGLDisplay r0 = r13.f53614b
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r0 != r1) goto L_0x00e5
            if (r14 != 0) goto L_0x0015
            android.opengl.EGLContext r14 = android.opengl.EGL14.EGL_NO_CONTEXT
        L_0x0015:
            r0 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r0)
            r13.f53614b = r1
            android.opengl.EGLDisplay r1 = r13.f53614b
            android.opengl.EGLDisplay r2 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r1 == r2) goto L_0x00dd
            r1 = 2
            int[] r2 = new int[r1]
            r2 = {0, 1} // fill-array
            android.opengl.EGLDisplay r3 = r13.f53614b
            r4 = 1
            boolean r2 = android.opengl.EGL14.eglInitialize(r3, r2, r0, r2, r4)
            r3 = 0
            if (r2 == 0) goto L_0x00d3
            android.opengl.EGLContext r2 = r13.f53615c
            android.opengl.EGLContext r5 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r2 != r5) goto L_0x00d2
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r6[r0] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r6[r4] = r2
            com.meituan.robust.ChangeQuickRedirect r8 = f53613a
            r9 = 0
            r10 = 56085(0xdb15, float:7.8592E-41)
            java.lang.Class[] r11 = new java.lang.Class[r1]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r11[r0] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r11[r4] = r2
            java.lang.Class<android.opengl.EGLConfig> r12 = android.opengl.EGLConfig.class
            r7 = r13
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x0088
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r5[r0] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r5[r4] = r15
            com.meituan.robust.ChangeQuickRedirect r7 = f53613a
            r8 = 0
            r9 = 56085(0xdb15, float:7.8592E-41)
            java.lang.Class[] r10 = new java.lang.Class[r1]
            java.lang.Class r15 = java.lang.Integer.TYPE
            r10[r0] = r15
            java.lang.Class r15 = java.lang.Integer.TYPE
            r10[r4] = r15
            java.lang.Class<android.opengl.EGLConfig> r11 = android.opengl.EGLConfig.class
            r6 = r13
            java.lang.Object r15 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            r3 = r15
            android.opengl.EGLConfig r3 = (android.opengl.EGLConfig) r3
            goto L_0x00b0
        L_0x0088:
            r1 = 13
            int[] r6 = new int[r1]
            r6 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344} // fill-array
            r15 = r15 & r4
            if (r15 == 0) goto L_0x009c
            r15 = 10
            r1 = 12610(0x3142, float:1.767E-41)
            r6[r15] = r1
            r15 = 11
            r6[r15] = r4
        L_0x009c:
            android.opengl.EGLConfig[] r15 = new android.opengl.EGLConfig[r4]
            int[] r11 = new int[r4]
            android.opengl.EGLDisplay r5 = r13.f53614b
            r7 = 0
            r9 = 0
            r10 = 1
            r12 = 0
            r8 = r15
            boolean r1 = android.opengl.EGL14.eglChooseConfig(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r3 = r15[r0]
        L_0x00b0:
            if (r3 == 0) goto L_0x00ca
            r15 = 3
            int[] r15 = new int[r15]
            r15 = {12440, 2, 12344} // fill-array
            android.opengl.EGLDisplay r1 = r13.f53614b
            android.opengl.EGLContext r14 = (android.opengl.EGLContext) r14
            android.opengl.EGLContext r14 = android.opengl.EGL14.eglCreateContext(r1, r3, r14, r15, r0)
            java.lang.String r15 = "eglCreateContext"
            r13.a((java.lang.String) r15)
            r13.f53616d = r3
            r13.f53615c = r14
            goto L_0x00d2
        L_0x00ca:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r15 = "Unable to find a suitable EGLConfig"
            r14.<init>(r15)
            throw r14
        L_0x00d2:
            return
        L_0x00d3:
            r13.f53614b = r3
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r15 = "unable to initialize EGL14"
            r14.<init>(r15)
            throw r14
        L_0x00dd:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r15 = "unable to get EGL14 display"
            r14.<init>(r15)
            throw r14
        L_0x00e5:
            java.lang.RuntimeException r14 = new java.lang.RuntimeException
            java.lang.String r15 = "EGL already set up"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.b.b.<init>(java.lang.Object, int):void");
    }

    public final Object a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53613a, false, 56077, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53613a, false, 56077, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class);
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f53614b, this.f53616d, new int[]{12375, i, 12374, i2, 12344}, 0);
        a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public final void a(Object obj, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{obj, new Long(j2)}, this, f53613a, false, 56082, new Class[]{Object.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, new Long(j2)}, this, f53613a, false, 56082, new Class[]{Object.class, Long.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 18) {
            try {
                EGLExt.eglPresentationTimeANDROID(this.f53614b, (EGLSurface) obj, j2);
            } catch (NoClassDefFoundError unused) {
            }
        }
    }
}
