package io.agora.rtc.video;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;

public class RendererCommon {
    private static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    public interface GlDrawer {
        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4);

        void release();
    }

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i, int i2, int i3);
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED
    }

    public static class YuvUploader {
        private ByteBuffer copyBuffer;

        public void uploadYuvData(int[] iArr, int i, int i2, int[] iArr2, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            int i3 = i / 2;
            int[] iArr3 = {i, i3, i3};
            int i4 = i2 / 2;
            int[] iArr4 = {i2, i4, i4};
            int i5 = 0;
            for (int i6 = 0; i6 < 3; i6++) {
                if (iArr2[i6] > iArr3[i6]) {
                    i5 = Math.max(i5, iArr3[i6] * iArr4[i6]);
                }
            }
            if (i5 > 0 && (this.copyBuffer == null || this.copyBuffer.capacity() < i5)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i5);
            }
            for (int i7 = 0; i7 < 3; i7++) {
                GLES20.glActiveTexture(33984 + i7);
                GLES20.glBindTexture(3553, iArr[i7]);
                if (iArr2[i7] == iArr3[i7]) {
                    byteBuffer = byteBufferArr[i7];
                } else {
                    VideoRenderer.nativeCopyPlane(byteBufferArr[i7], iArr3[i7], iArr4[i7], iArr2[i7], this.copyBuffer, iArr3[i7]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr3[i7], iArr4[i7], 0, 6409, 5121, byteBuffer);
            }
        }
    }

    public static final float[] horizontalFlipMatrix() {
        return new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] identityMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final float[] verticalFlipMatrix() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
    }

    private static void adjustOrigin(float[] fArr) {
        fArr[12] = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[13] = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[12] = fArr[12] + 0.5f;
        fArr[13] = fArr[13] + 0.5f;
    }

    private static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        switch (scalingType) {
            case SCALE_ASPECT_FIT:
                return 1.0f;
            case SCALE_ASPECT_FILL:
                return 0.0f;
            case SCALE_ASPECT_BALANCED:
                return BALANCED_VISIBLE_FRACTION;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static float[] multiplyMatrices(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        return fArr3;
    }

    public static float[] rotateTextureMatrix(float[] fArr, float f2) {
        float[] fArr2 = new float[16];
        Matrix.setRotateM(fArr2, 0, f2, 0.0f, 0.0f, 1.0f);
        adjustOrigin(fArr2);
        return multiplyMatrices(fArr, fArr2);
    }

    public static float[] getLayoutMatrix(boolean z, float f2, float f3) {
        float f4;
        float f5;
        if (f3 > f2) {
            f4 = f2 / f3;
            f5 = 1.0f;
        } else {
            f5 = f3 / f2;
            f4 = 1.0f;
        }
        if (z) {
            f5 *= -1.0f;
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, f5, f4, 1.0f);
        adjustOrigin(fArr);
        return fArr;
    }

    public static Point getDisplaySize(ScalingType scalingType, float f2, int i, int i2) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f2, i, i2);
    }

    private static Point getDisplaySize(float f2, float f3, int i, int i2) {
        if (f2 == 0.0f || f3 == 0.0f) {
            return new Point(i, i2);
        }
        return new Point(Math.min(i, Math.round((((float) i2) / f2) * f3)), Math.min(i2, Math.round((((float) i) / f2) / f3)));
    }
}
