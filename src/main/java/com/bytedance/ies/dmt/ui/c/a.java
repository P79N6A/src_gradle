package com.bytedance.ies.dmt.ui.c;

import android.graphics.PointF;
import android.view.animation.Interpolator;

public class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    protected final PointF f20306a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    protected final PointF f20307b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private int f20308c;

    private static double a(double d2, double d3, double d4, double d5, double d6) {
        double d7 = 1.0d - d2;
        double d8 = d2 * d2;
        double d9 = d7 * d7;
        return (d9 * d7 * 0.0d) + (d9 * 3.0d * d2 * d4) + (d7 * 3.0d * d8 * d5) + (d8 * d2 * 1.0d);
    }

    public float getInterpolation(float f2) {
        int i = this.f20308c;
        float f3 = f2;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f3 = (((float) i) * 1.0f) / 4096.0f;
            if (a((double) f3, 0.0d, (double) this.f20306a.x, (double) this.f20307b.x, 1.0d) >= ((double) f2)) {
                this.f20308c = i;
                break;
            }
            i++;
        }
        double a2 = a((double) f3, 0.0d, (double) this.f20306a.y, (double) this.f20307b.y, 1.0d);
        if (a2 > 0.999d) {
            a2 = 1.0d;
            this.f20308c = 0;
        }
        return (float) a2;
    }
}
