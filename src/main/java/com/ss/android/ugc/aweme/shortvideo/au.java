package com.ss.android.ugc.aweme.shortvideo;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class au implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65747a;

    /* renamed from: b  reason: collision with root package name */
    protected PointF f65748b;

    /* renamed from: c  reason: collision with root package name */
    protected PointF f65749c;

    /* renamed from: d  reason: collision with root package name */
    protected PointF f65750d;

    /* renamed from: e  reason: collision with root package name */
    protected PointF f65751e;

    /* renamed from: f  reason: collision with root package name */
    protected PointF f65752f;

    private float a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65747a, false, 74053, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65747a, false, 74053, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        }
        float f3 = f2;
        for (int i = 1; i < 14; i++) {
            this.f65752f.x = this.f65748b.x * 3.0f;
            this.f65751e.x = ((this.f65749c.x - this.f65748b.x) * 3.0f) - this.f65752f.x;
            this.f65750d.x = (1.0f - this.f65752f.x) - this.f65751e.x;
            float f4 = ((this.f65752f.x + ((this.f65751e.x + (this.f65750d.x * f3)) * f3)) * f3) - f2;
            if (((double) Math.abs(f4)) < 0.001d) {
                break;
            }
            f3 -= f4 / (this.f65752f.x + (((this.f65751e.x * 2.0f) + ((this.f65750d.x * 3.0f) * f3)) * f3));
        }
        return f3;
    }

    public final float getInterpolation(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65747a, false, 74052, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65747a, false, 74052, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        }
        float a2 = a(f2);
        this.f65752f.y = this.f65748b.y * 3.0f;
        this.f65751e.y = ((this.f65749c.y - this.f65748b.y) * 3.0f) - this.f65752f.y;
        this.f65750d.y = (1.0f - this.f65752f.y) - this.f65751e.y;
        return a2 * (this.f65752f.y + ((this.f65751e.y + (this.f65750d.y * a2)) * a2));
    }

    private au(PointF pointF, PointF pointF2) throws IllegalArgumentException {
        this.f65750d = new PointF();
        this.f65751e = new PointF();
        this.f65752f = new PointF();
        if (pointF.x < 0.0f || pointF.x > 1.0f) {
            throw new IllegalArgumentException("startX value must be in the range [0, 1]");
        } else if (pointF2.x < 0.0f || pointF2.x > 1.0f) {
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        } else {
            this.f65748b = pointF;
            this.f65749c = pointF2;
        }
    }

    public au(float f2, float f3, float f4, float f5) {
        this(new PointF(f2, f3), new PointF(f4, 1.0f));
    }
}
