package android.support.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

public class MatrixUtils {
    static final Matrix IDENTITY_MATRIX = new Matrix() {
        public final void reset() {
            oops();
        }

        /* access modifiers changed from: package-private */
        public final void oops() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public final void set(Matrix matrix) {
            oops();
        }

        public final void setRotate(float f2) {
            oops();
        }

        public final void setValues(float[] fArr) {
            oops();
        }

        public final boolean postConcat(Matrix matrix) {
            oops();
            return false;
        }

        public final boolean postRotate(float f2) {
            oops();
            return false;
        }

        public final boolean preConcat(Matrix matrix) {
            oops();
            return false;
        }

        public final boolean preRotate(float f2) {
            oops();
            return false;
        }

        public final void setScale(float f2, float f3) {
            oops();
        }

        public final void setSinCos(float f2, float f3) {
            oops();
        }

        public final void setSkew(float f2, float f3) {
            oops();
        }

        public final void setTranslate(float f2, float f3) {
            oops();
        }

        public final boolean postScale(float f2, float f3) {
            oops();
            return false;
        }

        public final boolean postSkew(float f2, float f3) {
            oops();
            return false;
        }

        public final boolean postTranslate(float f2, float f3) {
            oops();
            return false;
        }

        public final boolean preScale(float f2, float f3) {
            oops();
            return false;
        }

        public final boolean preSkew(float f2, float f3) {
            oops();
            return false;
        }

        public final boolean preTranslate(float f2, float f3) {
            oops();
            return false;
        }

        public final boolean setConcat(Matrix matrix, Matrix matrix2) {
            oops();
            return false;
        }

        public final boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            oops();
            return false;
        }

        public final void setRotate(float f2, float f3, float f4) {
            oops();
        }

        public final boolean postRotate(float f2, float f3, float f4) {
            oops();
            return false;
        }

        public final boolean preRotate(float f2, float f3, float f4) {
            oops();
            return false;
        }

        public final void setScale(float f2, float f3, float f4, float f5) {
            oops();
        }

        public final void setSinCos(float f2, float f3, float f4, float f5) {
            oops();
        }

        public final void setSkew(float f2, float f3, float f4, float f5) {
            oops();
        }

        public final boolean postScale(float f2, float f3, float f4, float f5) {
            oops();
            return false;
        }

        public final boolean postSkew(float f2, float f3, float f4, float f5) {
            oops();
            return false;
        }

        public final boolean preScale(float f2, float f3, float f4, float f5) {
            oops();
            return false;
        }

        public final boolean preSkew(float f2, float f3, float f4, float f5) {
            oops();
            return false;
        }

        public final boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            oops();
            return false;
        }
    };

    private MatrixUtils() {
    }
}
