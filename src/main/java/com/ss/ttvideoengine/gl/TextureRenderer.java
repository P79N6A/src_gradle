package com.ss.ttvideoengine.gl;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@TargetApi(18)
public abstract class TextureRenderer implements Handler.Callback {
    public static String LOG_TAG = "TextureRenderer";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Surface mCurrentSurface;
    EGLConfig mEglConfig;
    protected EGLContext mEglContext = EGL14.EGL_NO_CONTEXT;
    protected EGLDisplay mEglDisplay;
    protected EGLSurface mEglDummySurface = EGL14.EGL_NO_SURFACE;
    protected EGLSurface mEglSurface = EGL14.EGL_NO_SURFACE;
    private OnEglErrorListener mErrorListener;
    protected Handler mHandler;
    private final Object mHandlerObject = new Object();
    private HandlerThread mHandlerThread = new HandlerThread("RendererThread");
    protected float[] mMVPMatrix = new float[16];
    protected Handler mNotifyHandler;
    protected int mOutputheight = 0;
    protected int mOutputwidth = 0;
    protected int mProgram;
    private OnRenderFrameListener mRenderFrameListener;
    protected float[] mSTMatrix = new float[16];
    private int mSerial = 0;
    protected int mState = 0;
    private OnStateChangeListener mStateChangeListener;
    protected FloatBuffer mTextureVertices;
    private final float[] mTextureVerticesData = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    protected FloatBuffer mTriangleVertices;
    private final float[] mTriangleVerticesData = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    protected int mViewPortHeight;
    protected int mViewPortWidth;
    protected int maPositionHandle;
    protected int maTextureHandle;
    protected int muMVPMatrixHandle;
    protected int muSTMatrixHandle;

    public interface OnEglErrorListener {
        void onError(int i, String str);
    }

    public interface OnRenderFrameListener {
        void onRenderFrame(long j);
    }

    public interface OnStateChangeListener {
        void onStateChanged(int i);
    }

    public abstract void deinitGLComponents();

    public abstract boolean draw();

    public abstract SurfaceTexture getVideoTexture();

    public abstract void initGLComponents();

    public abstract void updateDisplaySize(int i, int i2);

    public long getSerial() {
        return (long) this.mSerial;
    }

    public int getState() {
        return this.mState;
    }

    private int[] getAttributes() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12344};
    }

    public void handleDeinit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91471, new Class[0], Void.TYPE);
            return;
        }
        changeState(1, false);
        deinitGLComponents();
        deinitEGL();
        changeState(0, true);
        this.mHandler = null;
    }

    public void handleInit() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91469, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91469, new Class[0], Void.TYPE);
            return;
        }
        initEGL();
        if (this.mState != -1) {
            initGLComponents();
            if (this.mState != -1) {
                changeState(1, true);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:10|11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91480(0x16558, float:1.28191E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 91480(0x16558, float:1.28191E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            monitor-enter(r9)
            int r0 = r9.mState     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x002c
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            return
        L_0x002c:
            android.os.Handler r0 = r9.mHandler     // Catch:{ all -> 0x0039 }
            r1 = 3
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0039 }
            android.os.HandlerThread r0 = r9.mHandlerThread     // Catch:{ Exception -> 0x0037 }
            r0.quitSafely()     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.gl.TextureRenderer.release():void");
    }

    private EGLConfig chooseEglConfig() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91483, new Class[0], EGLConfig.class)) {
            return (EGLConfig) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91483, new Class[0], EGLConfig.class);
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.mEglDisplay, getAttributes(), 0, eGLConfigArr, 0, 1, iArr, 0)) {
            notifyEGLError(0, "choose config failed");
        } else if (iArr[0] > 0) {
            return eGLConfigArr[0];
        }
        return null;
    }

    private void deinitEGL() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91477, new Class[0], Void.TYPE);
            return;
        }
        EGLDisplay eGLDisplay = this.mEglDisplay;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
            this.mEglSurface = EGL14.EGL_NO_SURFACE;
        }
        if (this.mEglDummySurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.mEglDisplay, this.mEglDummySurface);
            this.mEglDummySurface = EGL14.EGL_NO_SURFACE;
        }
        if (this.mEglContext != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
            this.mEglContext = EGL14.EGL_NO_CONTEXT;
        }
        EGL14.eglTerminate(this.mEglDisplay);
        this.mEglDisplay = EGL14.EGL_NO_DISPLAY;
    }

    private EGLDisplay getDefaultDisplay() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91472, new Class[0], EGLDisplay.class)) {
            return (EGLDisplay) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91472, new Class[0], EGLDisplay.class);
        }
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            notifyEGLError(0, "egl get display failed");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            notifyEGLError(0, "eglInitialize failed");
        }
        return eglGetDisplay;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleDraw() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91470(0x1654e, float:1.28177E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 91470(0x1654e, float:1.28177E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r0 = r9.draw()
            if (r0 == 0) goto L_0x0058
            int r0 = r9.mSerial
            android.opengl.EGLDisplay r1 = r9.mEglDisplay
            android.opengl.EGLSurface r2 = r9.mEglSurface
            boolean r1 = android.opengl.EGL14.eglSwapBuffers(r1, r2)
            if (r1 != 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.Object r1 = r9.mHandlerObject
            monitor-enter(r1)
            com.ss.ttvideoengine.gl.TextureRenderer$OnRenderFrameListener r2 = r9.mRenderFrameListener     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0053
            android.os.Handler r2 = r9.mNotifyHandler     // Catch:{ all -> 0x0055 }
            if (r2 != 0) goto L_0x0044
            goto L_0x0053
        L_0x0044:
            android.os.Handler r2 = r9.mNotifyHandler     // Catch:{ all -> 0x0055 }
            r3 = 8
            android.os.Message r2 = r2.obtainMessage(r3)     // Catch:{ all -> 0x0055 }
            r2.arg1 = r0     // Catch:{ all -> 0x0055 }
            r2.sendToTarget()     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            return
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r0
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.gl.TextureRenderer.handleDraw():void");
    }

    public TextureRenderer() {
        this.mHandlerThread.start();
        if (Looper.myLooper() != null) {
            this.mNotifyHandler = new Handler(this);
        } else {
            this.mNotifyHandler = new Handler(Looper.getMainLooper(), this);
        }
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void handleMessage(Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 91484, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 91484, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                switch (message.what) {
                    case 1:
                        TextureRenderer.this.handleInit();
                        return;
                    case 2:
                        TextureRenderer.this.handleDraw();
                        return;
                    case 3:
                        TextureRenderer.this.handleDeinit();
                        return;
                    case 4:
                        TextureRenderer.this.handleSetSurface((Surface) message.obj);
                        return;
                    case 5:
                        TextureRenderer.this.handleSizeChanged(message.arg1, message.arg2);
                        return;
                    default:
                        return;
                }
            }
        };
        this.mHandler.sendEmptyMessage(1);
    }

    private void initEGL() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91474, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91474, new Class[0], Void.TYPE);
            return;
        }
        this.mEglDisplay = getDefaultDisplay();
        this.mEglConfig = chooseEglConfig();
        if (this.mEglConfig != null) {
            this.mEglContext = createContext(this.mEglDisplay, this.mEglConfig);
            if (this.mEglContext == EGL14.EGL_NO_CONTEXT) {
                notifyEGLError(0, "create egl context failed");
            }
            this.mEglDummySurface = EGL14.eglCreatePbufferSurface(this.mEglDisplay, this.mEglConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
            try {
                if (this.mEglDummySurface == null || this.mEglDummySurface == EGL14.EGL_NO_SURFACE) {
                    notifyEGLError(0, "create eglCreatePbufferSurface failed");
                }
                if (!EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglDummySurface, this.mEglDummySurface, this.mEglContext)) {
                    notifyEGLError(0, "eglMakeCurrent failed");
                }
                this.mTriangleVertices = ByteBuffer.allocateDirect(this.mTriangleVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.mTriangleVertices.put(this.mTriangleVerticesData).position(0);
                this.mTextureVertices = ByteBuffer.allocateDirect(this.mTextureVerticesData.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.mTextureVertices.put(this.mTextureVerticesData).position(0);
            } catch (Exception unused) {
                notifyEGLError(0, "create dummy env failed");
            }
        }
    }

    public void setOnErrorListener(OnEglErrorListener onEglErrorListener) {
        this.mErrorListener = onEglErrorListener;
    }

    public void setOnRenderFrameListener(OnRenderFrameListener onRenderFrameListener) {
        this.mRenderFrameListener = onRenderFrameListener;
    }

    public void setOnStateChangedListener(OnStateChangeListener onStateChangeListener) {
        this.mStateChangeListener = onStateChangeListener;
    }

    public void setSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 91478, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 91478, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            if (this.mHandler != null) {
                Message obtainMessage = this.mHandler.obtainMessage(4);
                obtainMessage.obj = surface;
                this.mHandler.sendMessage(obtainMessage);
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, changeQuickRedirect, false, 91467, new Class[]{Message.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, changeQuickRedirect, false, 91467, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
        }
        switch (message.what) {
            case 6:
                if (this.mErrorListener != null) {
                    this.mErrorListener.onError(message.arg1, message.obj.toString());
                    break;
                }
                break;
            case e.l:
                if (this.mStateChangeListener != null) {
                    this.mStateChangeListener.onStateChanged(message.arg1);
                    if (message.arg1 == 0) {
                        this.mNotifyHandler.removeCallbacksAndMessages(null);
                        this.mNotifyHandler = null;
                        break;
                    }
                }
                break;
            case 8:
                int i = message.arg1;
                if (i == this.mSerial && this.mState == 2 && this.mRenderFrameListener != null) {
                    this.mRenderFrameListener.onRenderFrame((long) i);
                    break;
                }
        }
        return true;
    }

    public void handleSetSurface(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 91475, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 91475, new Class[]{Surface.class}, Void.TYPE);
        } else if (this.mCurrentSurface != surface) {
            if (this.mEglSurface != EGL14.EGL_NO_SURFACE) {
                GLES20.glFinish();
                changeState(1, false);
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEglContext);
                EGL14.eglDestroySurface(this.mEglDisplay, this.mEglSurface);
                this.mEglSurface = EGL14.EGL_NO_SURFACE;
                this.mOutputwidth = 0;
                this.mOutputheight = 0;
                this.mViewPortWidth = 0;
                this.mViewPortHeight = 0;
            }
            if (surface != null && surface.isValid()) {
                try {
                    this.mEglSurface = EGL14.eglCreateWindowSurface(this.mEglDisplay, this.mEglConfig, surface, new int[]{12344}, 0);
                    if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
                        notifyEGLError(1, "eglCreateWindowSurface failed");
                        return;
                    } else if (!EGL14.eglMakeCurrent(this.mEglDisplay, this.mEglSurface, this.mEglSurface, this.mEglContext)) {
                        notifyEGLError(1, "render surface eglMakeCurrent failed");
                        return;
                    } else {
                        changeState(2, false);
                    }
                } catch (Exception unused) {
                    notifyEGLError(1, "render env failed");
                    return;
                }
            }
            this.mCurrentSurface = surface;
            this.mSerial++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void changeState(int r12, boolean r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r9 = 0
            r1[r9] = r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r13)
            r10 = 1
            r1[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r9] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 91468(0x1654c, float:1.28174E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x004f
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1[r9] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r13)
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 91468(0x1654c, float:1.28174E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r9] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x004f:
            int r1 = r11.mState
            if (r1 != r12) goto L_0x0054
            return
        L_0x0054:
            int r1 = r11.mState
            r2 = -1
            if (r1 != r2) goto L_0x005c
            if (r12 == 0) goto L_0x005c
            return
        L_0x005c:
            r11.mState = r12
            if (r13 != 0) goto L_0x0061
            return
        L_0x0061:
            java.lang.Object r1 = r11.mHandlerObject
            monitor-enter(r1)
            com.ss.ttvideoengine.gl.TextureRenderer$OnStateChangeListener r2 = r11.mStateChangeListener     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x007b
            android.os.Handler r2 = r11.mNotifyHandler     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x006d
            goto L_0x007b
        L_0x006d:
            android.os.Handler r2 = r11.mNotifyHandler     // Catch:{ all -> 0x007d }
            r3 = 7
            android.os.Message r2 = r2.obtainMessage(r3)     // Catch:{ all -> 0x007d }
            r2.arg1 = r12     // Catch:{ all -> 0x007d }
            r2.sendToTarget()     // Catch:{ all -> 0x007d }
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            return
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            return
        L_0x007d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.gl.TextureRenderer.changeState(int, boolean):void");
    }

    private EGLContext createContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLDisplay eGLDisplay2 = eGLDisplay;
        EGLConfig eGLConfig2 = eGLConfig;
        if (PatchProxy.isSupport(new Object[]{eGLDisplay2, eGLConfig2}, this, changeQuickRedirect, false, 91482, new Class[]{EGLDisplay.class, EGLConfig.class}, EGLContext.class)) {
            return (EGLContext) PatchProxy.accessDispatch(new Object[]{eGLDisplay2, eGLConfig2}, this, changeQuickRedirect, false, 91482, new Class[]{EGLDisplay.class, EGLConfig.class}, EGLContext.class);
        }
        return EGL14.eglCreateContext(eGLDisplay2, eGLConfig2, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
    }

    public void changeDisplaySize(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91481, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91481, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i > 0 && i2 > 0) {
            synchronized (this) {
                if (this.mHandler != null) {
                    Message obtainMessage = this.mHandler.obtainMessage(5);
                    obtainMessage.arg1 = i;
                    obtainMessage.arg2 = i2;
                    this.mHandler.sendMessage(obtainMessage);
                }
            }
        }
    }

    public void handleSizeChanged(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91476, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91476, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mOutputwidth = i;
        this.mOutputheight = i2;
        updateDisplaySize(i, i2);
    }

    public void notifyEGLError(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91473, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 91473, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        synchronized (this.mNotifyHandler) {
            changeState(-1, false);
            if (this.mErrorListener != null) {
                Message obtainMessage = this.mNotifyHandler.obtainMessage(6);
                obtainMessage.arg1 = i;
                obtainMessage.obj = "EGL fail = " + str + ", reason = " + GLUtils.getEGLErrorString(EGL14.eglGetError());
                obtainMessage.sendToTarget();
            }
        }
    }

    public void setSurface(Surface surface, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91479, new Class[]{Surface.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 91479, new Class[]{Surface.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setSurface(surface);
        changeDisplaySize(i, i2);
    }
}
