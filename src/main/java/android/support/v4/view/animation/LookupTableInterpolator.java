package android.support.v4.view.animation;

import android.view.animation.Interpolator;

public abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize = (1.0f / ((float) (this.mValues.length - 1)));
    private final float[] mValues;

    protected LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.mValues.length - 1)) * f2), this.mValues.length - 2);
        return this.mValues[min] + (((f2 - (((float) min) * this.mStepSize)) / this.mStepSize) * (this.mValues[min + 1] - this.mValues[min]));
    }
}
