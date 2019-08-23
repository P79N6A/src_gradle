package com.ss.android.ugc.aweme.poi.preview.view.image;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;

public class a {

    /* renamed from: a  reason: collision with root package name */
    RectF f60269a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    RectF f60270b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    RectF f60271c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    RectF f60272d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    PointF f60273e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    float f60274f;
    float g;
    ImageView.ScaleType h;

    public a(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f2, float f3, ImageView.ScaleType scaleType) {
        this.f60269a.set(rectF);
        this.f60270b.set(rectF2);
        this.f60271c.set(rectF3);
        this.f60274f = f2;
        this.h = scaleType;
        this.g = f3;
        this.f60272d.set(rectF4);
        this.f60273e.set(pointF);
    }
}
