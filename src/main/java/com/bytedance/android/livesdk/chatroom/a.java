package com.bytedance.android.livesdk.chatroom;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.ugc.live.a.i;
import com.ss.utils.OpenGLUtils;
import com.ss.utils.TextureRotationUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;

@TargetApi(15)
public final class a implements SurfaceTexture.OnFrameAvailableListener, GLSurfaceView.Renderer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9692a;

    /* renamed from: b  reason: collision with root package name */
    public GLSurfaceView f9693b;

    /* renamed from: c  reason: collision with root package name */
    public C0077a f9694c;

    /* renamed from: d  reason: collision with root package name */
    public EGLContext f9695d;

    /* renamed from: e  reason: collision with root package name */
    public GLThread f9696e;

    /* renamed from: f  reason: collision with root package name */
    private int f9697f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private FloatBuffer m;
    private FloatBuffer n;
    private FloatBuffer o;
    private SurfaceTexture p;
    private List<i> q;
    private int r = 36197;

    /* renamed from: com.bytedance.android.livesdk.chatroom.a$a  reason: collision with other inner class name */
    public interface C0077a {
        void a(Surface surface);
    }

    public final void finalize() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, f9692a, false, 3892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9692a, false, 3892, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9696e != null) {
            this.f9696e.quit();
            this.f9696e = null;
        }
        super.finalize();
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f9692a, false, 3881, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f9692a, false, 3881, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        this.f9693b.requestRender();
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9692a, false, 3882, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9692a, false, 3882, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 == 36197 || i3 == 3553) {
            this.r = i3;
        } else {
            throw new RuntimeException("format is not support");
        }
    }

    public a(GLSurfaceView gLSurfaceView) {
        this.f9693b = gLSurfaceView;
        this.f9693b.setEGLContextClientVersion(2);
        this.f9693b.setPreserveEGLContextOnPause(true);
        this.f9693b.setEGLContextFactory(new GLSurfaceView.EGLContextFactory() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9698a;

            public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
                if (PatchProxy.isSupport(new Object[]{egl10, eGLDisplay, eGLContext}, this, f9698a, false, 3895, new Class[]{EGL10.class, EGLDisplay.class, EGLContext.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{egl10, eGLDisplay, eGLContext}, this, f9698a, false, 3895, new Class[]{EGL10.class, EGLDisplay.class, EGLContext.class}, Void.TYPE);
                } else if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    if (a.this.f9696e != null) {
                        a.this.f9696e.quit();
                        a.this.f9696e = null;
                    }
                } else {
                    throw new RuntimeException("eglDestroyContext" + egl10.eglGetError());
                }
            }

            public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
                EGL10 egl102 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                EGLConfig eGLConfig2 = eGLConfig;
                if (PatchProxy.isSupport(new Object[]{egl102, eGLDisplay2, eGLConfig2}, this, f9698a, false, 3894, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class}, EGLContext.class)) {
                    return (EGLContext) PatchProxy.accessDispatch(new Object[]{egl102, eGLDisplay2, eGLConfig2}, this, f9698a, false, 3894, new Class[]{EGL10.class, EGLDisplay.class, EGLConfig.class}, EGLContext.class);
                }
                int[] iArr = {12440, 2, 12344};
                EGLContext[] eGLContextArr = {null};
                if (a.this.f9696e == null) {
                    a.this.f9696e = new GLThread("ImageCaptureThread");
                    a.this.f9696e.start();
                }
                ThreadUtils.invokeAtFrontUninterruptibly(a.this.f9696e.getHandler(), (Runnable) new c(eGLContextArr));
                if (eGLContextArr[0] == null) {
                    eGLContextArr[0] = EGL10.EGL_NO_CONTEXT;
                }
                a.this.f9695d = egl102.eglCreateContext(eGLDisplay2, eGLConfig2, eGLContextArr[0], iArr);
                return a.this.f9695d;
            }
        });
        this.f9693b.setRenderer(this);
        this.f9693b.setRenderMode(0);
        this.m = ByteBuffer.allocateDirect(TextureRotationUtil.CUBE.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.m.put(TextureRotationUtil.CUBE).position(0);
        this.n = ByteBuffer.allocateDirect(TextureRotationUtil.TEXTURE_NO_ROTATION.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.n.put(TextureRotationUtil.TEXTURE_NO_ROTATION).position(0);
        float[] rotation = TextureRotationUtil.getRotation(180, true, false);
        this.o = ByteBuffer.allocateDirect(rotation.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.o.put(rotation).position(0);
    }

    public final synchronized void a(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f9692a, false, 3883, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f9692a, false, 3883, new Class[]{i.class}, Void.TYPE);
            return;
        }
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(iVar);
    }

    public final void onDrawFrame(GL10 gl10) {
        if (PatchProxy.isSupport(new Object[]{gl10}, this, f9692a, false, 3887, new Class[]{GL10.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10}, this, f9692a, false, 3887, new Class[]{GL10.class}, Void.TYPE);
            return;
        }
        this.p.updateTexImage();
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f9697f);
        this.m.position(0);
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, this.m);
        GLES20.glEnableVertexAttribArray(this.g);
        this.n.position(0);
        GLES20.glVertexAttribPointer(this.i, 2, 5126, false, 0, this.n);
        GLES20.glEnableVertexAttribArray(this.i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.j);
        GLES20.glUniform1i(this.h, 0);
        GLES20.glDrawArrays(5, 0, 4);
        OpenGLUtils.checkGlError("ImageCapture");
        int i2 = this.j;
        if (3553 == this.r) {
            if (PatchProxy.isSupport(new Object[0], this, f9692a, false, 3891, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f9692a, false, 3891, new Class[0], Integer.TYPE)).intValue();
            } else {
                GLES20.glBindFramebuffer(36160, this.k);
                this.o.position(0);
                GLES20.glVertexAttribPointer(this.i, 2, 5126, false, 0, this.o);
                GLES20.glEnableVertexAttribArray(this.i);
                GLES20.glDrawArrays(5, 0, 4);
                OpenGLUtils.checkGlError("ImageCapture");
                GLES20.glBindFramebuffer(36160, 0);
                i2 = this.l;
            }
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, 0);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (this.q != null) {
                for (i a2 : this.q) {
                    a2.a(this.f9695d, i2, this.r, this.f9693b.getWidth(), this.f9693b.getHeight(), currentTimeMillis, null);
                }
            }
        }
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        if (PatchProxy.isSupport(new Object[]{gl10, eGLConfig}, this, f9692a, false, 3885, new Class[]{GL10.class, EGLConfig.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10, eGLConfig}, this, f9692a, false, 3885, new Class[]{GL10.class, EGLConfig.class}, Void.TYPE);
            return;
        }
        this.f9697f = OpenGLUtils.loadProgram("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n\nvarying vec2 textureCoordinate;\n\nvoid main()\n{\n   textureCoordinate = inputTextureCoordinate.xy;\n   gl_Position = position;\n}", "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\n\nvoid main()\n{\n gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        new StringBuilder("onSurfaceCreated: OES programId=").append(this.f9697f);
        this.g = GLES20.glGetAttribLocation(this.f9697f, "position");
        this.h = GLES20.glGetUniformLocation(this.f9697f, "inputImageTexture");
        this.i = GLES20.glGetAttribLocation(this.f9697f, "inputTextureCoordinate");
        this.j = OpenGLUtils.getExternalOESTextureID();
        new StringBuilder("onSurfaceCreated: OES textureId=").append(this.j);
        OpenGLUtils.checkGlError("ImageCapture");
        if (3553 == this.r) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.k = iArr[0];
            new StringBuilder("onSurfaceCreated: frameBuffer=").append(this.k);
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr2, 0);
            this.l = iArr2[0];
            new StringBuilder("onSurfaceCreated: frameBufferTextureId=").append(this.l);
            int i2 = this.l;
            int i3 = this.k;
            int width = this.f9693b.getWidth();
            int height = this.f9693b.getHeight();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(width), Integer.valueOf(height)}, this, f9692a, false, 3890, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(width), Integer.valueOf(height)}, this, f9692a, false, 3890, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                GLES20.glBindTexture(3553, i2);
                GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindFramebuffer(36160, i3);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
        this.p = new SurfaceTexture(this.j);
        this.p.setDefaultBufferSize(this.f9693b.getWidth(), this.f9693b.getHeight());
        this.p.setOnFrameAvailableListener(this);
        this.f9693b.post(new b(this, new Surface(this.p)));
    }

    public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{gl10, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9692a, false, 3886, new Class[]{GL10.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gl10, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9692a, false, 3886, new Class[]{GL10.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        GLES20.glViewport(0, 0, i2, i3);
    }
}
