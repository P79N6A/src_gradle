package io.agora.rtc.video;

import java.nio.ByteBuffer;

public class VideoRenderer {
    long nativeVideoRenderer;

    public interface Callbacks {
        void renderFrame(I420Frame i420Frame);
    }

    public static class I420Frame {
        public final int height;
        public long nativeFramePointer;
        public int rotationDegree;
        public final float[] samplingMatrix;
        public int textureId;
        public final int width;
        public final boolean yuvFrame;
        public ByteBuffer[] yuvPlanes;
        public final int[] yuvStrides;

        public int rotatedHeight() {
            if (this.rotationDegree % 180 == 0) {
                return this.height;
            }
            return this.width;
        }

        public int rotatedWidth() {
            if (this.rotationDegree % 180 == 0) {
                return this.width;
            }
            return this.height;
        }

        public String toString() {
            return this.width + "x" + this.height + ":" + this.yuvStrides[0] + ":" + this.yuvStrides[1] + ":" + this.yuvStrides[2];
        }

        I420Frame(int i, int i2, int i3, int i4, float[] fArr, long j) {
            this.width = i;
            this.height = i2;
            this.samplingMatrix = fArr;
            this.textureId = i4;
            this.rotationDegree = i3;
            this.nativeFramePointer = j;
            if (i3 % 90 != 0) {
                throw new IllegalArgumentException("Rotation degree not multiple of 90: " + i3);
            }
        }

        I420Frame(int i, int i2, int i3, int[] iArr, ByteBuffer[] byteBufferArr, long j) {
            this.width = i;
            this.height = i2;
            this.yuvStrides = iArr;
            this.yuvPlanes = byteBufferArr;
            this.yuvFrame = true;
            this.rotationDegree = i3;
            this.nativeFramePointer = j;
            if (i3 % 90 == 0) {
                this.samplingMatrix = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
                return;
            }
            throw new IllegalArgumentException("Rotation degree not multiple of 90: " + i3);
        }
    }

    private static native void freeWrappedVideoRenderer(long j);

    public static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2, int i4);

    private static native long nativeWrapVideoRenderer(Callbacks callbacks);

    private static native void releaseNativeFrame(long j);

    public void dispose() {
        if (this.nativeVideoRenderer != 0) {
            freeWrappedVideoRenderer(this.nativeVideoRenderer);
            this.nativeVideoRenderer = 0;
        }
    }

    public VideoRenderer(Callbacks callbacks) {
        this.nativeVideoRenderer = nativeWrapVideoRenderer(callbacks);
    }

    public static void renderFrameDone(I420Frame i420Frame) {
        i420Frame.yuvPlanes = null;
        i420Frame.textureId = 0;
        if (i420Frame.nativeFramePointer != 0) {
            releaseNativeFrame(i420Frame.nativeFramePointer);
            i420Frame.nativeFramePointer = 0;
        }
    }
}
