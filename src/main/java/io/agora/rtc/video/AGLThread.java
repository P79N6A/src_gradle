package io.agora.rtc.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import io.agora.rtc.internal.Logging;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public abstract class AGLThread extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    private EGLConfig eglConfig;
    private EGLContext eglContext = EGL14.EGL_NO_CONTEXT;
    private EGLDisplay eglDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;
    protected int height;
    private boolean isReady;
    private boolean isRendering = false;
    private int mDstTexture;
    private int mFbo;
    private WeakReference<SurfaceTextureListener> mListener;
    private boolean mRequestSoftwareEncoder;
    private final ScheduledExecutorService mScheduler = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(1);
    private TextureRenderer mSurfaceTextureToFbo;
    private boolean quit_status;
    private SurfaceTexture surfaceTexture;
    private int texId;
    protected int width;

    public interface SurfaceTextureListener {
        void onSurfaceTextureCreated(SurfaceTexture surfaceTexture);
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(int i) {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a());
        }
    }

    public abstract void drawFrame(int i, float[] fArr);

    public abstract void drawFrame(ByteBuffer byteBuffer, int i, float[] fArr);

    public final void switchToSoftware() {
        this.mRequestSoftwareEncoder = true;
    }

    public final EGLContext getEglContext() {
        return this.eglContext;
    }

    public final SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public final boolean isReady() {
        return this.isReady;
    }

    public void notifyNewFrameAvailable() {
        synchronized (this) {
            notify();
        }
    }

    private void deleteFbo() {
        int[] iArr = {this.mDstTexture};
        int[] iArr2 = {this.mFbo};
        if (this.mDstTexture != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        if (this.mFbo != 0) {
            GLES20.glDeleteFramebuffers(1, iArr2, 0);
        }
    }

    private void destroyTexture() {
        this.surfaceTexture = null;
        this.mListener = null;
        int[] iArr = {this.texId};
        if (this.texId != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
    }

    public final void releaseAGLThread() {
        this.quit_status = true;
        synchronized (this) {
            notifyAll();
        }
        this.mScheduler.shutdownNow();
    }

    private void deInitGL() {
        EGLDisplay eGLDisplay = this.eglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, this.eglSurface);
        }
        if (this.eglContext != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        }
        if (this.eglDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglTerminate(this.eglDisplay);
        }
        this.eglSurface = EGL14.EGL_NO_SURFACE;
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.isReady = false;
    }

    private int createTexture() throws RuntimeException {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            this.texId = iArr[0];
            GLES20.glBindTexture(36197, this.texId);
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 == 0) {
                GLES20.glTexParameterf(36197, 10241, 9728.0f);
                GLES20.glTexParameterf(36197, 10240, 9729.0f);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                this.surfaceTexture = new SurfaceTexture(this.texId);
                if (this.mListener.get() != null) {
                    ((SurfaceTextureListener) this.mListener.get()).onSurfaceTextureCreated(this.surfaceTexture);
                }
                this.surfaceTexture.setOnFrameAvailableListener(this);
                this.isReady = true;
                return 0;
            }
            throw new RuntimeException("EglError " + glGetError2);
        }
        throw new RuntimeException("EglError " + glGetError);
    }

    private void initGL() throws RuntimeException {
        this.eglDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(this.eglDisplay, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(this.eglDisplay, new int[]{12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                this.eglConfig = eGLConfigArr[0];
                this.eglContext = EGL14.eglCreateContext(this.eglDisplay, this.eglConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                if (this.eglContext != EGL14.EGL_NO_CONTEXT) {
                    this.eglSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                    EGL14.eglMakeCurrent(this.eglDisplay, this.eglSurface, this.eglSurface, this.eglContext);
                    return;
                }
                throw new RuntimeException("EGL error " + EGL14.eglGetError());
            }
            throw new RuntimeException("EGL error " + EGL14.eglGetError());
        }
        throw new RuntimeException("EGL error " + EGL14.eglGetError());
    }

    public synchronized void run() {
        setName("AGLThread " + getId());
        Logging.i("AGLThread", "thread starting tid = " + getId());
        try {
            initGL();
            createTexture();
            while (!this.quit_status) {
                if (this.mRequestSoftwareEncoder && this.mFbo == 0) {
                    createFbo(this.width, this.height);
                }
                if (this.mRequestSoftwareEncoder && this.mSurfaceTextureToFbo == null) {
                    this.mSurfaceTextureToFbo = new TextureRenderer(true);
                }
                if (this.isReady) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    float[] fArr = new float[16];
                    try {
                        this.surfaceTexture.updateTexImage();
                    } catch (Exception e2) {
                        Logging.e("AGLThread", "updateTexImage " + Log.getStackTraceString(e2));
                    }
                    this.surfaceTexture.getTransformMatrix(fArr);
                    if (this.mRequestSoftwareEncoder) {
                        GLES20.glFinish();
                        GLES20.glViewport(0, 0, this.width, this.height);
                        GLES20.glBindFramebuffer(36160, this.mFbo);
                        this.mSurfaceTextureToFbo.draw(this.texId);
                        ByteBuffer wrap = ByteBuffer.wrap(new byte[(this.width * this.height * 4)]);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        GLES20.glReadPixels(0, 0, this.width, this.height, 6408, 5121, wrap);
                        GlUtil.checkNoGLES2Error("glReadPixels");
                        drawFrame(wrap, -180, fArr);
                        GLES20.glBindFramebuffer(36160, 0);
                    } else {
                        drawFrame(this.texId, fArr);
                    }
                }
                try {
                    wait();
                } catch (Exception unused) {
                }
            }
            this.mSurfaceTextureToFbo = null;
            if (this.mRequestSoftwareEncoder) {
                deleteFbo();
            }
            destroyTexture();
            deInitGL();
        } catch (RuntimeException unused2) {
            Logging.e("AGLThread", "failed to create texture");
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
        try {
            this.mScheduler.schedule(new Runnable() {
                public void run() {
                    AGLThread.this.notifyNewFrameAvailable();
                }
            }, 0, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
            Logging.e("AGLThread", "failed to notify new frame, maybe threadpool terminated");
        }
    }

    private int createFbo(int i, int i2) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glGenTextures(1, iArr, 0);
        this.mFbo = iArr2[0];
        this.mDstTexture = iArr[0];
        GLES20.glBindTexture(3553, this.mDstTexture);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, this.mFbo);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mDstTexture, 0);
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            Logging.e("AGLThread", "failed to create framebuffer");
        }
        return 0;
    }

    public AGLThread(int i, int i2, SurfaceTextureListener surfaceTextureListener) {
        this.width = i;
        this.height = i2;
        this.mListener = new WeakReference<>(surfaceTextureListener);
    }
}
