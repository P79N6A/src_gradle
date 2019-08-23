package com.mapbox.mapboxsdk.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.support.annotation.Keep;
import android.support.annotation.WorkerThread;

public class LocalGlyphRasterizer {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f26819a = Bitmap.createBitmap(35, 35, Bitmap.Config.ARGB_8888);

    /* renamed from: b  reason: collision with root package name */
    private final Paint f26820b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f26821c;

    LocalGlyphRasterizer() {
        this.f26820b.setAntiAlias(true);
        this.f26820b.setTextSize(24.0f);
        this.f26821c = new Canvas();
        this.f26821c.setBitmap(this.f26819a);
    }

    /* access modifiers changed from: protected */
    @Keep
    @WorkerThread
    public Bitmap drawGlyphBitmap(String str, boolean z, char c2) {
        this.f26820b.setTypeface(Typeface.create(str, z ? 1 : 0));
        this.f26821c.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f26821c.drawText(String.valueOf(c2), 0.0f, 20.0f, this.f26820b);
        return this.f26819a;
    }
}
