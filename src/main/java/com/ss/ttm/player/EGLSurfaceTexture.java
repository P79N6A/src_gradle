package com.ss.ttm.player;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

@TargetApi(17)
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] EGL_CONFIG_ATTRIBUTES = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private EGLContext context;
    @Nullable
    private EGLDisplay display;
    private final Handler handler;
    @Nullable
    private EGLSurface surface;
    @Nullable
    private SurfaceTexture texture;
    private final int[] textureIdHolder = new int[1];

    @Retention(RetentionPolicy.SOURCE)
    public @interface SecureMode {
    }

    public static final class GlException extends RuntimeException {
        private GlException(String str) {
            super(str);
        }
    }

    public final SurfaceTexture getSurfaceTexture() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90613, new Class[0], SurfaceTexture.class)) {
            return (SurfaceTexture) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90613, new Class[0], SurfaceTexture.class);
        } else if (this.texture != null) {
            return this.texture;
        } else {
            throw new NullPointerException();
        }
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90615, new Class[0], Void.TYPE);
            return;
        }
        if (this.texture != null) {
            this.texture.updateTexImage();
        }
    }

    private static EGLDisplay getDefaultDisplay() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 90616, new Class[0], EGLDisplay.class)) {
            return (EGLDisplay) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 90616, new Class[0], EGLDisplay.class);
        }
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new GlException("eglInitialize failed");
        }
        throw new GlException("eglGetDisplay failed");
    }

    public final void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90612, new Class[0], Void.TYPE);
            return;
        }
        this.handler.removeCallbacks(this);
        try {
            if (this.texture != null) {
                this.texture.release();
                GLES20.glDeleteTextures(1, this.textureIdHolder, 0);
            }
        } finally {
            if (this.display != null && !this.display.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay = this.display;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            if (this.surface != null && !this.surface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.display, this.surface);
            }
            if (this.context != null) {
                EGL14.eglDestroyContext(this.display, this.context);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                EGL14.eglReleaseThread();
            }
            this.display = null;
            this.context = null;
            this.surface = null;
            this.texture = null;
        }
    }

    public EGLSurfaceTexture(Handler handler2) {
        this.handler = handler2;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, 90614, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, 90614, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        this.handler.post(this);
    }

    private static EGLConfig chooseEGLConfig(EGLDisplay eGLDisplay) {
        if (PatchProxy.isSupport(new Object[]{eGLDisplay}, null, changeQuickRedirect, true, 90617, new Class[]{EGLDisplay.class}, EGLConfig.class)) {
            return (EGLConfig) PatchProxy.accessDispatch(new Object[]{eGLDisplay}, null, changeQuickRedirect, true, 90617, new Class[]{EGLDisplay.class}, EGLConfig.class);
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, EGL_CONFIG_ATTRIBUTES, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new GlException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[]{Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void generateTextureIds(int[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 90620(0x161fc, float:1.26986E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 1
            r14 = 90620(0x161fc, float:1.26986E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            android.opengl.GLES20.glGenTextures(r1, r0, r9)
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 != 0) goto L_0x003e
            return
        L_0x003e:
            com.ss.ttm.player.EGLSurfaceTexture$GlException r1 = new com.ss.ttm.player.EGLSurfaceTexture$GlException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "glGenTextures failed. Error: "
            r2.<init>(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.EGLSurfaceTexture.generateTextureIds(int[]):void");
    }

    public final void init(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90611, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90611, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.display = getDefaultDisplay();
        EGLConfig chooseEGLConfig = chooseEGLConfig(this.display);
        this.context = createEGLContext(this.display, chooseEGLConfig, i);
        this.surface = createEGLSurface(this.display, chooseEGLConfig, this.context, i);
        generateTextureIds(this.textureIdHolder);
        this.texture = new SurfaceTexture(this.textureIdHolder[0]);
        this.texture.setOnFrameAvailableListener(this);
    }

    private static EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        EGLConfig eGLConfig2 = eGLConfig;
        if (PatchProxy.isSupport(new Object[]{eGLDisplay2, eGLConfig2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 90618, new Class[]{EGLDisplay.class, EGLConfig.class, Integer.TYPE}, EGLContext.class)) {
            return (EGLContext) PatchProxy.accessDispatch(new Object[]{eGLDisplay2, eGLConfig2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 90618, new Class[]{EGLDisplay.class, EGLConfig.class, Integer.TYPE}, EGLContext.class);
        }
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay2, eGLConfig2, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    private static EGLSurface createEGLSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        EGLConfig eGLConfig2 = eGLConfig;
        EGLContext eGLContext2 = eGLContext;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{eGLDisplay2, eGLConfig2, eGLContext2, Integer.valueOf(i)}, null, changeQuickRedirect, true, 90619, new Class[]{EGLDisplay.class, EGLConfig.class, EGLContext.class, Integer.TYPE}, EGLSurface.class)) {
            Object[] objArr = {eGLDisplay2, eGLConfig2, eGLContext2, Integer.valueOf(i)};
            return (EGLSurface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 90619, new Class[]{EGLDisplay.class, EGLConfig.class, EGLContext.class, Integer.TYPE}, EGLSurface.class);
        }
        if (i2 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i2 == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig2, iArr, 0);
            if (eGLSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, eGLContext2)) {
            return eGLSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }
}
