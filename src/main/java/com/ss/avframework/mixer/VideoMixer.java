package com.ss.avframework.mixer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.avframework.buffer.JavaI420Buffer;
import com.ss.avframework.buffer.TextureBufferImpl;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.opengl.YuvConverter;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("jni")
public class VideoMixer extends NativeMixer implements TextureBufferImpl.ToI420Interface {
    public static int TEXTURE_TYPE_2D = 1;
    public static int TEXTURE_TYPE_OES = 2;
    public static int TEXTURE_TYPE_UNKNOWN = 0;
    public static int TEXTURE_TYPE_YUV = 3;
    private boolean mHaveNativeObj;
    private final long mWeakNativeThis;
    private YuvConverter mYuvConverter;

    public static class VideoMixerDescription {
        public float bottom = 1.0f;
        public long flags = 1;
        public float left;
        public float right = 1.0f;
        public float top;
        public int zOrder = 1;

        @CalledByNative("VideoMixerDescription")
        public float getBottom() {
            return this.bottom;
        }

        @CalledByNative("VideoMixerDescription")
        public long getFlags() {
            return this.flags;
        }

        @CalledByNative("VideoMixerDescription")
        public float getLeft() {
            return this.left;
        }

        @CalledByNative("VideoMixerDescription")
        public float getRight() {
            return this.right;
        }

        @CalledByNative("VideoMixerDescription")
        public float getTop() {
            return this.top;
        }

        @CalledByNative("VideoMixerDescription")
        public int getzOrder() {
            return this.zOrder;
        }

        public int getMode() {
            if ((this.flags & 1) != 0) {
                return 1;
            }
            return 2;
        }

        public void copy(VideoMixerDescription videoMixerDescription) {
            this.left = videoMixerDescription.left;
            this.right = videoMixerDescription.right;
            this.top = videoMixerDescription.top;
            this.bottom = videoMixerDescription.bottom;
            this.zOrder = videoMixerDescription.zOrder;
            this.flags = videoMixerDescription.flags;
        }

        public boolean isMirror(boolean z) {
            if (z) {
                if ((this.flags & 2) != 0) {
                    return true;
                }
                return false;
            } else if ((this.flags & 4) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public void setMode(int i) {
            switch (i) {
                case 1:
                    this.flags |= 1;
                    break;
                case 2:
                    this.flags &= -2;
                    return;
            }
        }

        public void setMirror(boolean z, boolean z2) {
            if (z2) {
                this.flags |= 2;
            } else {
                this.flags &= -3;
            }
        }
    }

    public static class VideoMixerTexture {
        int height;
        int rotation;
        float[] texMatrix;
        int[] textures;
        int type;
        int width;

        public VideoMixerTexture() {
        }

        @CalledByNative("VideoMixerTexture")
        public int getHeight() {
            return this.height;
        }

        @CalledByNative("VideoMixerTexture")
        public int getRotation() {
            return this.rotation;
        }

        @CalledByNative("VideoMixerTexture")
        public float[] getTexMatrix() {
            return this.texMatrix;
        }

        @CalledByNative("VideoMixerTexture")
        public int[] getTextures() {
            return this.textures;
        }

        @CalledByNative("VideoMixerTexture")
        public int getType() {
            return this.type;
        }

        @CalledByNative("VideoMixerTexture")
        public int getWidth() {
            return this.width;
        }

        @CalledByNative("VideoMixerTexture")
        public VideoMixerTexture(int i, int i2, int i3, int i4, int[] iArr, float[] fArr) {
            this.textures = new int[1];
            this.textures = iArr;
            this.width = i;
            this.height = i2;
            this.rotation = i3;
            this.type = i4;
            if (this.rotation != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                if (i3 % 180 != 0) {
                    this.width = i2;
                    this.height = i;
                }
                matrix.preTranslate(0.5f, 0.5f);
                matrix.preRotate((float) (-i3));
                matrix.preTranslate(-0.5f, -0.5f);
                if (fArr != null) {
                    matrix.preConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr));
                }
                this.texMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
                return;
            }
            this.texMatrix = fArr == null ? RendererCommon.identityMatrix() : fArr;
        }
    }

    private native void nativeAddVideoSink(VideoSink videoSink);

    private native void nativeCreate();

    private native void nativeRemoveVideoSink(VideoSink videoSink);

    private native VideoMixerTexture nativeUploadI420ImageToTexture(long j, int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5);

    private native void nativeVideoMixerRelease(long j);

    public boolean isAudioMixer() {
        return false;
    }

    public native void nativeReleaseTexture();

    @CalledByNative
    private boolean isHaveNativeObj() {
        return this.mHaveNativeObj;
    }

    @CalledByNative
    public VideoMixer() {
        this.mHaveNativeObj = true;
        nativeCreate();
        this.mWeakNativeThis = this.mNativeObj;
    }

    public synchronized void release() {
        if (this.mHaveNativeObj) {
            super.release();
        } else if (this.mNativeObj != 0) {
            nativeVideoMixerRelease(this.mNativeObj);
        }
        this.mNativeObj = 0;
    }

    public void AddVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeAddVideoSink(videoSink);
        }
    }

    public void RemoveVideoSink(VideoSink videoSink) {
        if (videoSink != null) {
            nativeRemoveVideoSink(videoSink);
        }
    }

    public VideoMixer(long j) {
        setNativeObj(j);
        this.mWeakNativeThis = j;
    }

    public VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer) {
        if (this.mYuvConverter == null) {
            this.mYuvConverter = new YuvConverter();
        }
        return this.mYuvConverter.convert(textureBuffer);
    }

    /* access modifiers changed from: protected */
    @CalledByNative
    public VideoFrame.Buffer wrapperTextureBuffer(VideoMixerTexture videoMixerTexture) {
        Matrix matrix;
        if (videoMixerTexture.texMatrix != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(videoMixerTexture.texMatrix);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(videoMixerTexture.width, videoMixerTexture.height, VideoFrame.TextureBuffer.Type.RGB, videoMixerTexture.getTextures()[0], matrix, (TextureBufferImpl.ToI420Interface) this, (Runnable) new Runnable() {
            public void run() {
                VideoMixer.this.nativeReleaseTexture();
            }
        });
        return textureBufferImpl;
    }

    /* access modifiers changed from: protected */
    @CalledByNative
    public VideoMixerTexture getVideoMixerTexture(VideoFrame videoFrame) {
        int i;
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        VideoMixerTexture videoMixerTexture = new VideoMixerTexture();
        if (buffer instanceof VideoFrame.TextureBuffer) {
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                i = TEXTURE_TYPE_OES;
            } else {
                i = TEXTURE_TYPE_2D;
            }
            videoMixerTexture.type = i;
            videoMixerTexture.width = buffer.getWidth();
            videoMixerTexture.height = buffer.getHeight();
            videoMixerTexture.rotation = videoFrame.getRotation();
            videoMixerTexture.texMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
            videoMixerTexture.textures = new int[1];
            videoMixerTexture.textures[0] = textureBuffer.getTextureId();
            return videoMixerTexture;
        } else if (buffer instanceof JavaI420Buffer) {
            JavaI420Buffer javaI420Buffer = (JavaI420Buffer) buffer;
            VideoMixerTexture nativeUploadI420ImageToTexture = nativeUploadI420ImageToTexture(this.mWeakNativeThis, javaI420Buffer.getWidth(), javaI420Buffer.getHeight(), javaI420Buffer.getDataY(), javaI420Buffer.getStrideY(), javaI420Buffer.getDataU(), javaI420Buffer.getStrideU(), javaI420Buffer.getDataV(), javaI420Buffer.getStrideV());
            if (nativeUploadI420ImageToTexture != null) {
                nativeUploadI420ImageToTexture.texMatrix = RendererCommon.multiplyMatrices(nativeUploadI420ImageToTexture.texMatrix, RendererCommon.verticalFlipMatrix());
            }
            return nativeUploadI420ImageToTexture;
        } else {
            throw new AndroidRuntimeException("No implement.");
        }
    }

    /* access modifiers changed from: protected */
    @CalledByNative
    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, long j) {
        return wrapperTextureBuffer(i, i2, i3, i4, i5, null, j);
    }

    /* access modifiers changed from: protected */
    @CalledByNative
    public VideoFrame wrapperTextureBuffer(int i, int i2, int i3, int i4, int i5, float[] fArr, long j) {
        Matrix matrix;
        if (fArr != null) {
            matrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
        } else {
            matrix = new Matrix();
            matrix.reset();
        }
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i, i2, VideoFrame.TextureBuffer.Type.RGB, i5, matrix, (TextureBufferImpl.ToI420Interface) this, (Runnable) new Runnable() {
            public void run() {
                VideoMixer.this.nativeReleaseTexture();
            }
        });
        int i6 = i3;
        return new VideoFrame(textureBufferImpl, i3, j);
    }
}
