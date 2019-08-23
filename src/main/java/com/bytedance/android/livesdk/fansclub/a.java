package com.bytedance.android.livesdk.fansclub;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements TypeEvaluator<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13870a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f13871b;

    public a(PointF pointF) {
        this.f13871b = pointF;
    }

    public final /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        PointF pointF = (PointF) obj;
        PointF pointF2 = (PointF) obj2;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), pointF, pointF2}, this, f13870a, false, 8284, new Class[]{Float.TYPE, PointF.class, PointF.class}, PointF.class)) {
            return (PointF) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), pointF, pointF2}, this, f13870a, false, 8284, new Class[]{Float.TYPE, PointF.class, PointF.class}, PointF.class);
        }
        PointF pointF3 = new PointF();
        float f3 = 1.0f - f2;
        double d2 = (double) f3;
        double pow = Math.pow(d2, 2.0d);
        double d3 = (double) pointF.x;
        Double.isNaN(d3);
        double d4 = pow * d3;
        float f4 = 2.0f * f2 * f3;
        double d5 = (double) (this.f13871b.x * f4);
        Double.isNaN(d5);
        double d6 = d4 + d5;
        float f5 = f2 * f2;
        double d7 = (double) (pointF2.x * f5);
        Double.isNaN(d7);
        pointF3.x = (float) (d6 + d7);
        double pow2 = Math.pow(d2, 2.0d);
        double d8 = (double) pointF.y;
        Double.isNaN(d8);
        double d9 = pow2 * d8;
        double d10 = (double) (f4 * this.f13871b.y);
        Double.isNaN(d10);
        double d11 = d9 + d10;
        double d12 = (double) (f5 * pointF2.y);
        Double.isNaN(d12);
        pointF3.y = (float) (d11 + d12);
        return pointF3;
    }
}
