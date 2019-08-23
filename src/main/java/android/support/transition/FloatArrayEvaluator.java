package android.support.transition;

import android.animation.TypeEvaluator;

public class FloatArrayEvaluator implements TypeEvaluator<float[]> {
    private float[] mArray;

    FloatArrayEvaluator(float[] fArr) {
        this.mArray = fArr;
    }

    public float[] evaluate(float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.mArray;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f3 = fArr[i];
            fArr3[i] = f3 + ((fArr2[i] - f3) * f2);
        }
        return fArr3;
    }
}
