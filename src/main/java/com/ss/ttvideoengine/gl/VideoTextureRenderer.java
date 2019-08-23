package com.ss.ttvideoengine.gl;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@TargetApi(18)
public class VideoTextureRenderer extends TextureRenderer implements SurfaceTexture.OnFrameAvailableListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String mFragmentShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private long mLastRenderTimeStamp;
    private int[] mTextures;
    private final String mVertexShader = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private SurfaceTexture mVideoTexture;

    public void initGLComponents() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91491, new Class[0], Void.TYPE);
            return;
        }
        setupTexture();
        if (this.mState != -1) {
            setupGraphics();
        }
    }

    private void drawTexture() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91490, new Class[0], Void.TYPE);
            return;
        }
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glBindTexture(36197, this.mTextures[0]);
        GLES20.glActiveTexture(33984);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private int getConsumerHeight() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91488, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91488, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        } else {
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12374, iArr, 0);
            return iArr[0];
        }
    }

    private int getConsumerWidth() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91487, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91487, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mEglSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        } else {
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(this.mEglDisplay, this.mEglSurface, 12375, iArr, 0);
            return iArr[0];
        }
    }

    private void setupTexture() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91486, new Class[0], Void.TYPE);
            return;
        }
        if (this.mTextures == null) {
            this.mTextures = new int[1];
        }
        GLES20.glGenTextures(1, this.mTextures, 0);
        GLES20.glTexParameteri(36197, 10242, 10497);
        GLES20.glTexParameteri(36197, 10243, 10497);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glBindTexture(36197, this.mTextures[0]);
    }

    public void deinitGLComponents() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91492, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91492, new Class[0], Void.TYPE);
            return;
        }
        if (this.mVideoTexture != null) {
            this.mVideoTexture.release();
            this.mVideoTexture.setOnFrameAvailableListener(null);
            this.mVideoTexture = null;
        }
        GLES20.glDeleteTextures(1, this.mTextures, 0);
        GLES20.glDeleteProgram(this.mProgram);
    }

    public boolean draw() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91489, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91489, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mVideoTexture.updateTexImage();
        if (this.mState != 2) {
            return false;
        }
        int consumerWidth = getConsumerWidth();
        int consumerHeight = getConsumerHeight();
        if (consumerWidth > 0 && consumerHeight > 0 && !(consumerWidth == this.mViewPortWidth && consumerHeight == this.mViewPortHeight)) {
            this.mViewPortWidth = consumerWidth;
            this.mViewPortHeight = consumerHeight;
        }
        this.mVideoTexture.getTransformMatrix(this.mSTMatrix);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glViewport(0, 0, this.mViewPortWidth, this.mViewPortHeight);
        drawTexture();
        if (GLES20.glGetError() == 0) {
            z = true;
        }
        return z;
    }

    public SurfaceTexture getVideoTexture() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91493, new Class[0], SurfaceTexture.class)) {
            return (SurfaceTexture) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91493, new Class[0], SurfaceTexture.class);
        }
        synchronized (this) {
            if (this.mState <= 0) {
                return null;
            }
            if (this.mVideoTexture == null) {
                this.mVideoTexture = new SurfaceTexture(this.mTextures[0]);
                this.mVideoTexture.setOnFrameAvailableListener(this);
            }
            SurfaceTexture surfaceTexture = this.mVideoTexture;
            return surfaceTexture;
        }
    }

    private void setupGraphics() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91485, new Class[0], Void.TYPE);
            return;
        }
        this.mProgram = ShaderHelper.createAndLinkProgram(ShaderHelper.compileShader(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"), ShaderHelper.compileShader(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"), null);
        GLES20.glUseProgram(this.mProgram);
        this.maPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "aPosition");
        if (this.maPositionHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for aPosition");
            return;
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        if (this.maTextureHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for aTextureCoord");
            return;
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for uMVPMatrix");
            return;
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            notifyEGLError(0, "Could not get attrib location for uSTMatrix");
            return;
        }
        this.mTriangleVertices.position(0);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 12, this.mTriangleVertices);
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        this.mTextureVertices.position(0);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, 8, this.mTextureVertices);
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, 91494, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, 91494, new Class[]{SurfaceTexture.class}, Void.TYPE);
            return;
        }
        try {
            if (this.mHandler != null && this.mState > 0) {
                this.mHandler.sendEmptyMessage(2);
            }
        } catch (Exception unused) {
        }
    }

    public void updateDisplaySize(int i, int i2) {
        this.mViewPortWidth = i;
        this.mViewPortHeight = i2;
    }
}
