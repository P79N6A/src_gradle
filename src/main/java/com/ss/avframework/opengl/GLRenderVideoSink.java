package com.ss.avframework.opengl;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.utils.AVLog;

public class GLRenderVideoSink extends VideoSink implements Handler.Callback, SurfaceHolder.Callback {
    private GLRenderer mGLRenderer;
    public GLThread mGLThread;
    private boolean mNeedSwapSurface;
    private GLSurface mSurface;

    public interface GLRenderer {
        void onDrawFrame(VideoFrame videoFrame);

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated();

        void onSurfaceDestroy();
    }

    public void OnDiscardedFrame() {
    }

    private void onSurfaceCreated() {
        this.mSurface = new GLSurface();
    }

    public Handler getGlThreadHandler() {
        return this.mGLThread.getHandler();
    }

    /* access modifiers changed from: private */
    public void onSurfaceDestroy() {
        if (this.mSurface != null) {
            this.mSurface.nativeSurfaceDestroy();
            this.mSurface.release();
            this.mSurface = null;
            if (this.mGLRenderer != null) {
                this.mGLRenderer.onSurfaceDestroy();
            }
        }
    }

    public synchronized void release() {
        super.release();
        this.mGLThread.getHandler().post(new Runnable() {
            public void run() {
                GLRenderVideoSink.this.onSurfaceDestroy();
            }
        });
        if (Build.VERSION.SDK_INT >= 18) {
            this.mGLThread.quitSafely();
            return;
        }
        this.mGLThread.getHandler().post(new Runnable() {
            public void run() {
                GLRenderVideoSink.this.mGLThread.quit();
            }
        });
        try {
            this.mGLThread.join(3000);
        } catch (InterruptedException unused) {
            AVLog.e("GLRenderVideoSink", "GlRenderVideoSink thread exit exception at " + 3000 + " ms.");
        }
    }

    public void setRenderer(GLRenderer gLRenderer) {
        this.mGLRenderer = gLRenderer;
    }

    public GLRenderVideoSink(SurfaceTexture surfaceTexture) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mNeedSwapSurface = true;
        this.mGLThread.post(1);
    }

    public GLRenderVideoSink(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(this);
        this.mGLThread = new GLThread((Handler.Callback) this);
        this.mGLThread.setName("GlRenderSink");
        this.mGLThread.start();
    }

    private void onFrameAvailable(VideoFrame videoFrame) {
        if (this.mGLRenderer != null) {
            this.mGLRenderer.onDrawFrame(videoFrame);
            if (this.mSurface != null && this.mNeedSwapSurface) {
                this.mSurface.nativeSwapBuffers();
            }
            videoFrame.release();
        }
    }

    public void onFrame(VideoFrame videoFrame) {
        if (this.mGLThread != null) {
            videoFrame.retain();
            if (!this.mGLThread.post(4, videoFrame)) {
                videoFrame.release();
            }
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mNeedSwapSurface = false;
        if (!this.mGLThread.post(3)) {
            AVLog.w("GLRenderVideoSink", "surfaceDestroyed exception! thread already exit.");
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                onSurfaceCreated();
                break;
            case 2:
                onSurfaceChanged(message.arg1, message.arg2, (Surface) message.obj);
                break;
            case 3:
                onSurfaceDestroy();
                break;
            case 4:
                onFrameAvailable((VideoFrame) message.obj);
                break;
        }
        return true;
    }

    public GLRenderVideoSink(int i, int i2, int i3) {
    }

    private void onSurfaceChanged(int i, int i2, Surface surface) {
        if (this.mGLRenderer != null) {
            if (this.mSurface != null) {
                this.mSurface.nativeSurfaceCreate(i, i2, surface);
                this.mSurface.nativeMakeCurrent();
            }
            if (this.mGLRenderer != null) {
                this.mGLRenderer.onSurfaceCreated();
                this.mGLRenderer.onSurfaceChanged(i, i2);
            }
            if (this.mNeedSwapSurface && this.mSurface != null) {
                this.mSurface.nativeSwapBuffers();
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (!this.mGLThread.post(2, i2, i3, surfaceHolder.getSurface())) {
            AVLog.w("GLRenderVideoSink", "surfaceChanged exception! thread already exit.");
        }
    }
}
