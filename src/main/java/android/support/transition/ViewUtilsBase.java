package android.support.transition;

import android.graphics.Matrix;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.C0906R;

public class ViewUtilsBase {
    private float[] mMatrixValues;

    ViewUtilsBase() {
    }

    public void clearNonTransitionAlpha(@NonNull View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0906R.id.cjd, null);
        }
    }

    public float getTransitionAlpha(@NonNull View view) {
        Float f2 = (Float) view.getTag(C0906R.id.cjd);
        if (f2 != null) {
            return view.getAlpha() / f2.floatValue();
        }
        return view.getAlpha();
    }

    public void saveNonTransitionAlpha(@NonNull View view) {
        if (view.getTag(C0906R.id.cjd) == null) {
            view.setTag(C0906R.id.cjd, Float.valueOf(view.getAlpha()));
        }
    }

    public void setTransitionAlpha(@NonNull View view, float f2) {
        Float f3 = (Float) view.getTag(C0906R.id.cjd);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            transformMatrixToGlobal(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            transformMatrixToLocal(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void setAnimationMatrix(@NonNull View view, Matrix matrix) {
        int i;
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.mMatrixValues;
        if (fArr == null) {
            fArr = new float[9];
            this.mMatrixValues = fArr;
        }
        matrix.getValues(fArr);
        float f2 = fArr[3];
        float sqrt = (float) Math.sqrt((double) (1.0f - (f2 * f2)));
        if (fArr[0] < 0.0f) {
            i = -1;
        } else {
            i = 1;
        }
        float f3 = sqrt * ((float) i);
        float degrees = (float) Math.toDegrees(Math.atan2((double) f2, (double) f3));
        float f4 = fArr[0] / f3;
        float f5 = fArr[4] / f3;
        float f6 = fArr[2];
        float f7 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        view.setRotation(degrees);
        view.setScaleX(f4);
        view.setScaleY(f5);
    }

    public void setLeftTopRightBottom(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
