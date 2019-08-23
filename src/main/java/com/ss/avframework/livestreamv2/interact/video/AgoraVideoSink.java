package com.ss.avframework.livestreamv2.interact.video;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.SurfaceView;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.ThreadUtils;
import io.agora.rtc.mediaio.IVideoSink;
import io.agora.rtc.mediaio.MediaIO;
import java.nio.ByteBuffer;

public class AgoraVideoSink implements TextureBufferImpl.ToI420Interface, IVideoSink {
    private EngineCallback mCallback;
    public long mEglContextHandle;
    private RenderView mRenderSink;
    private int mUid;

    public boolean onInitialize() {
        return true;
    }

    public boolean onStart() {
        return true;
    }

    public void onStop() {
    }

    public long getEGLContextHandle() {
        return this.mEglContextHandle;
    }

    public void onDispose() {
        this.mRenderSink.release();
        this.mRenderSink = null;
    }

    public int getBufferType() {
        MediaIO.BufferType bufferType;
        if (getEGLContextHandle() == 0) {
            bufferType = MediaIO.BufferType.BYTE_BUFFER;
        } else {
            bufferType = MediaIO.BufferType.TEXTURE;
        }
        return bufferType.intValue();
    }

    public int getPixelFormat() {
        MediaIO.PixelFormat pixelFormat;
        if (getEGLContextHandle() == 0) {
            pixelFormat = MediaIO.PixelFormat.I420;
        } else {
            pixelFormat = MediaIO.PixelFormat.TEXTURE_2D;
        }
        return pixelFormat.intValue();
    }

    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        throw new AndroidRuntimeException("Should not be here.");
    }

    private Config.VideoOutputFormat getAgoraVideoOutputFormat(int i) {
        if (i == MediaIO.PixelFormat.I420.intValue()) {
            return Config.VideoOutputFormat.PIXEL_FORMAT_I420;
        }
        if (i == MediaIO.PixelFormat.NV21.intValue()) {
            return Config.VideoOutputFormat.PIXEL_FORMAT_NV21;
        }
        if (i == MediaIO.PixelFormat.RGBA.intValue()) {
            return Config.VideoOutputFormat.PIXEL_FORMAT_RGBA32;
        }
        if (i == MediaIO.PixelFormat.TEXTURE_2D.intValue()) {
            return Config.VideoOutputFormat.TEXTURE_2D;
        }
        if (i == MediaIO.PixelFormat.TEXTURE_OES.intValue()) {
            return Config.VideoOutputFormat.TEXTURE_OES;
        }
        return Config.VideoOutputFormat.PIXEL_FORMAT_UNKNOWN;
    }

    public AgoraVideoSink(int i, EngineCallback engineCallback, SurfaceView surfaceView) {
        this.mUid = i;
        this.mCallback = engineCallback;
        this.mRenderSink = new RenderView(surfaceView);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mRenderSink.getGlThreadHandler(), (Runnable) new Runnable() {
            public void run() {
                if (Build.VERSION.SDK_INT >= 21) {
                    AgoraVideoSink.this.mEglContextHandle = EGL14.eglGetCurrentContext().getNativeHandle();
                    return;
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    AgoraVideoSink.this.mEglContextHandle = (long) EGL14.eglGetCurrentContext().getHandle();
                }
            }
        });
        if (this.mEglContextHandle == 0) {
            throw new IllegalArgumentException("Native egl handler is null");
        }
    }

    public void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        int i5 = i;
        this.mCallback.onReceiveVideoBufferFrame(this.mUid, ByteBuffer.wrap(bArr), getAgoraVideoOutputFormat(i), i2, i3, i4, j);
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        int i5 = i;
        this.mCallback.onReceiveVideoBufferFrame(this.mUid, byteBuffer, getAgoraVideoOutputFormat(i), i2, i3, i4, j);
    }

    public void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        convertMatrixToAndroidGraphicsMatrix.preTranslate(0.0f, 0.5f);
        convertMatrixToAndroidGraphicsMatrix.preScale(1.0f, -1.0f);
        convertMatrixToAndroidGraphicsMatrix.preTranslate(0.0f, -0.5f);
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i3, i4, VideoFrame.TextureBuffer.Type.RGB, i, convertMatrixToAndroidGraphicsMatrix, (TextureBufferImpl.ToI420Interface) this, (Runnable) new Runnable() {
            public void run() {
            }
        });
        this.mRenderSink.onFrame(new VideoFrame(textureBufferImpl, i5, j));
        this.mCallback.onReceiveTextureFrame(this.mUid, i, getAgoraVideoOutputFormat(i2), i3, i4, i5, j, fArr);
    }
}
