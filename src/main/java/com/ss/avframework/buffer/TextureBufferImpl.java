package com.ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.avframework.buffer.VideoFrame;

public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;
    private final int id;
    private VideoFrame.Buffer.stRoiInfo mROIInfo;
    private ToI420Interface mToI420Interface;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;

    public interface ToI420Interface {
        VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer);
    }

    public int getHeight() {
        return this.height;
    }

    public VideoFrame.Buffer.stRoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    public int getTextureId() {
        return this.id;
    }

    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public void release() {
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && this.releaseCallback != null) {
                this.releaseCallback.run();
            }
        }
    }

    public VideoFrame.I420Buffer toI420() {
        if (this.surfaceTextureHelper != null) {
            return this.surfaceTextureHelper.textureToYuv(this);
        }
        if (this.mToI420Interface != null) {
            return this.mToI420Interface.toI420(this);
        }
        throw new AndroidRuntimeException("BUG, Fixed me");
    }

    public void setROIInfo(VideoFrame.Buffer.stRoiInfo stroiinfo) {
        this.mROIInfo = stroiinfo;
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) i2) / ((float) this.height));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i5, i6, this.type, this.id, matrix, this.surfaceTextureHelper, (Runnable) new Runnable() {
            public void run() {
                TextureBufferImpl.this.release();
            }
        });
        textureBufferImpl.mToI420Interface = this.mToI420Interface;
        textureBufferImpl.mROIInfo = this.mROIInfo;
        return textureBufferImpl;
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.releaseCallback = runnable;
        this.mToI420Interface = null;
        this.refCount = 1;
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = null;
        this.releaseCallback = runnable;
        this.mToI420Interface = toI420Interface;
        this.refCount = 1;
    }
}
