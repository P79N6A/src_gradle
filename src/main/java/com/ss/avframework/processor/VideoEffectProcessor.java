package com.ss.avframework.processor;

import android.graphics.Matrix;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.opengl.YuvConverter;
import com.ss.avframework.utils.JNINamespace;
import com.ss.avframework.utils.ThreadUtils;

@JNINamespace("jni")
public class VideoEffectProcessor extends NativeVideoProcessor implements TextureBufferImpl.ToI420Interface, ITTVideoEffectProcessor {
    private GLThread mGLThread = new GLThread("VideoEffectThread");
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public YuvConverter mYuvConverter;
    public VideoFrame.TextureBuffer outTex;

    private native void nativeConfigEffect(String str, String str2, boolean z);

    private native void nativeCreate();

    private native int nativeProcess(long j, int i, boolean z, int i2, int i3, float[] fArr, int i4);

    private native void nativeRelease();

    private native int nativeSetBeautify(String str, float f2, float f3);

    private native void nativeSetEffect(String str, float f2);

    private native void nativeSetFaceAttribute(boolean z);

    private native int nativeSetFilter(String str, float f2);

    private native int nativeSetReshape(String str, float f2, float f3);

    private native int nativeSetTwoFilter(String str, String str2, float f2);

    public VideoEffectProcessor() {
        nativeCreate();
        this.mGLThread.start();
    }

    public synchronized void release() {
        if (this.mGLThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mGLThread.getHandler(), (Runnable) new Runnable() {
                public void run() {
                    if (VideoEffectProcessor.this.mYuvConverter != null) {
                        VideoEffectProcessor.this.mYuvConverter.release();
                        VideoEffectProcessor.this.mYuvConverter = null;
                    }
                    if (VideoEffectProcessor.this.mTextureFrameBuffer != null) {
                        VideoEffectProcessor.this.mTextureFrameBuffer.release();
                        VideoEffectProcessor.this.mTextureFrameBuffer = null;
                    }
                }
            });
            this.mGLThread.quit();
            this.mGLThread = null;
        }
        nativeRelease();
    }

    public void setFaceAttribute(boolean z) {
        nativeSetFaceAttribute(z);
    }

    public void setEffect(String str) {
        nativeSetEffect(str, 1.0f);
    }

    public VideoFrame process(final VideoFrame videoFrame) {
        final VideoFrame[] videoFrameArr = new VideoFrame[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mGLThread.getHandler(), (Runnable) new Runnable() {
            public void run() {
                videoFrameArr[0] = VideoEffectProcessor.this.processInternal(videoFrame);
            }
        });
        return videoFrameArr[0];
    }

    public VideoFrame.I420Buffer toI420(final VideoFrame.TextureBuffer textureBuffer) {
        final VideoFrame.I420Buffer[] i420BufferArr = new VideoFrame.I420Buffer[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mGLThread.getHandler(), (Runnable) new Runnable() {
            public void run() {
                if (VideoEffectProcessor.this.mYuvConverter == null) {
                    VideoEffectProcessor.this.mYuvConverter = new YuvConverter();
                }
                i420BufferArr[0] = VideoEffectProcessor.this.mYuvConverter.convert(textureBuffer);
            }
        });
        return i420BufferArr[0];
    }

    public VideoFrame processInternal(VideoFrame videoFrame) {
        boolean z;
        if (this.outTex == null) {
            this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mTextureFrameBuffer.setSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            int textureId = this.mTextureFrameBuffer.getTextureId();
            Matrix matrix = new Matrix();
            matrix.reset();
            TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), VideoFrame.TextureBuffer.Type.RGB, textureId, matrix, (TextureBufferImpl.ToI420Interface) this, (Runnable) new Runnable() {
                public void run() {
                    VideoEffectProcessor.this.outTex.retain();
                }
            });
            this.outTex = textureBufferImpl;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (buffer instanceof VideoFrame.TextureBuffer) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
            long j = this.mNativeObj;
            int textureId2 = textureBuffer.getTextureId();
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                z = true;
            } else {
                z = false;
            }
            if (nativeProcess(j, textureId2, z, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), convertMatrixFromAndroidGraphicsMatrix, this.outTex.getTextureId()) >= 0) {
                return new VideoFrame(this.outTex, 0, videoFrame.getTimestampNs());
            }
            videoFrame.retain();
        }
        return videoFrame;
    }

    public void setEffect(String str, float f2) {
        nativeSetEffect(str, f2);
    }

    public int setFilter(String str, float f2) {
        return nativeSetFilter(str, f2);
    }

    public void configEffect(String str, String str2, boolean z) {
        nativeConfigEffect(str, str2, z);
    }

    public int setBeautify(String str, float f2, float f3) {
        return nativeSetBeautify(str, f2, f3);
    }

    public int setReshape(String str, float f2, float f3) {
        return nativeSetReshape(str, f2, f3);
    }

    public int setFilter(String str, String str2, float f2) {
        return nativeSetTwoFilter(str, str2, f2);
    }
}
