package android.support.v4.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

public class PathInterpolatorApi14 implements Interpolator {
    private final float[] mX;
    private final float[] mY;

    PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.mX = new float[i];
        this.mY = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.mX[i2] = fArr[0];
            this.mY[i2] = fArr[1];
        }
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.mX.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f2 < this.mX[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f3 = this.mX[length] - this.mX[i];
        if (f3 == 0.0f) {
            return this.mY[i];
        }
        float f4 = this.mY[i];
        return f4 + (((f2 - this.mX[i]) / f3) * (this.mY[length] - f4));
    }

    PathInterpolatorApi14(float f2, float f3) {
        this(createQuad(f2, f3));
    }

    private static Path createQuad(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        return path;
    }

    PathInterpolatorApi14(float f2, float f3, float f4, float f5) {
        this(createCubic(f2, f3, f4, f5));
    }

    private static Path createCubic(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        return path;
    }
}
