package com.facebook.c.c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

public final class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f23405a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f23406b;

    public final float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f23405a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f2 < this.f23405a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f3 = this.f23405a[length] - this.f23405a[i];
        if (f3 == 0.0f) {
            return this.f23406b[i];
        }
        float f4 = this.f23406b[i];
        return f4 + (((f2 - this.f23405a[i]) / f3) * (this.f23406b[length] - f4));
    }

    public d(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.03f)) + 1;
        this.f23405a = new float[i];
        this.f23406b = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, null);
            this.f23405a[i2] = fArr[0];
            this.f23406b[i2] = fArr[1];
        }
    }
}
