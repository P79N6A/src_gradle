package com.ss.android.ugc.aweme.feed.widget;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

public final class b implements TypeEvaluator<PointF> {

    /* renamed from: a  reason: collision with root package name */
    PointF f47038a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private float f47039b;

    /* renamed from: c  reason: collision with root package name */
    private float f47040c;

    /* renamed from: d  reason: collision with root package name */
    private float f47041d;

    /* renamed from: e  reason: collision with root package name */
    private float f47042e;

    /* renamed from: f  reason: collision with root package name */
    private float f47043f;
    private float g;

    public b(PointF pointF, PointF pointF2) {
        float f2 = pointF.x * 3.0f;
        float f3 = pointF2.x * 3.0f;
        this.f47039b = f2 - f3;
        this.f47040c = f3 - (f2 * 2.0f);
        this.f47041d = f2;
        float f4 = pointF.y * 3.0f;
        float f5 = pointF2.y * 3.0f;
        this.f47042e = f4 - f5;
        this.f47043f = f5 - (2.0f * f4);
        this.g = f4;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        PointF pointF = (PointF) obj;
        PointF pointF2 = (PointF) obj2;
        float f3 = pointF.x * 3.0f;
        float f4 = pointF.y * 3.0f;
        this.f47038a.x = (((((((((pointF2.x - pointF.x) + this.f47039b) * f2) + f3) + this.f47040c) * f2) - f3) + this.f47041d) * f2) + pointF.x;
        this.f47038a.y = (f2 * ((((((((pointF2.y - pointF.y) + this.f47042e) * f2) + f4) + this.f47043f) * f2) - f4) + this.g)) + pointF.y;
        return this.f47038a;
    }
}
