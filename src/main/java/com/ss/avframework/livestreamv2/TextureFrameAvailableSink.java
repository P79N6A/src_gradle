package com.ss.avframework.livestreamv2;

import android.graphics.Matrix;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public class TextureFrameAvailableSink extends VideoSink {
    private Thread mCurrentThread;
    private EGLContext mEGLContext;
    private int mHeight;
    private ILiveStream.ITextureFrameAvailableListener mListener;
    private int mWidth;

    public void OnDiscardedFrame() {
    }

    public void setListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        this.mListener = iTextureFrameAvailableListener;
    }

    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener = this.mListener;
        if (this.mCurrentThread != Thread.currentThread()) {
            this.mCurrentThread = Thread.currentThread();
            EGL egl = EGLContext.getEGL();
            if (egl instanceof EGL10) {
                this.mEGLContext = ((EGL10) egl).eglGetCurrentContext();
            }
        }
        if (iTextureFrameAvailableListener != null && this.mEGLContext != null) {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (videoFrame == null || !(videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer)) {
                AVLog.e("TextureFrameAvailableSink", "Unsupport format");
                return;
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
            Matrix transformMatrix = textureBuffer.getTransformMatrix();
            Matrix matrix = new Matrix();
            matrix.reset();
            if (videoFrame.getRotation() != 0) {
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate((float) (-videoFrame.getRotation()));
                matrix.preTranslate(-0.5f, -0.5f);
            }
            if (transformMatrix != null) {
                matrix.preConcat(transformMatrix);
            }
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
            int textureId = textureBuffer.getTextureId();
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                z = true;
            } else {
                z = false;
            }
            iTextureFrameAvailableListener.onTextureFrameAvailable(this.mEGLContext, textureId, z, rotatedWidth, rotatedHeight, videoFrame.getTimestampNs(), convertMatrixFromAndroidGraphicsMatrix);
        }
    }

    public TextureFrameAvailableSink(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }
}
