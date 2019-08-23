package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f6237a;

    /* renamed from: b  reason: collision with root package name */
    private Canvas f6238b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap.Config f6239c;

    public i(Bitmap.Config config) {
        this.f6239c = config;
    }

    public void a(Bitmap bitmap) {
        this.f6237a = bitmap;
        this.f6238b = new Canvas(this.f6237a);
    }

    public void a(j jVar) {
        this.f6238b.save(1);
        jVar.a(this.f6238b);
        this.f6238b.restore();
    }
}
