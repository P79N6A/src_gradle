package it.sephiroth.android.library.imagezoom.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f83415a;

    /* renamed from: b  reason: collision with root package name */
    public Paint f83416b;

    /* renamed from: c  reason: collision with root package name */
    protected int f83417c;

    /* renamed from: d  reason: collision with root package name */
    protected int f83418d;

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f83418d;
    }

    public final int getIntrinsicWidth() {
        return this.f83417c;
    }

    public final int getMinimumHeight() {
        return this.f83418d;
    }

    public final int getMinimumWidth() {
        return this.f83417c;
    }

    public final void setAlpha(int i) {
        this.f83416b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f83416b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (this.f83415a != null && !this.f83415a.isRecycled()) {
            canvas.drawBitmap(this.f83415a, 0.0f, 0.0f, this.f83416b);
        }
    }

    public a(Bitmap bitmap) {
        this.f83415a = bitmap;
        if (this.f83415a != null) {
            this.f83417c = this.f83415a.getWidth();
            this.f83418d = this.f83415a.getHeight();
        } else {
            this.f83417c = 0;
            this.f83418d = 0;
        }
        this.f83416b = new Paint();
        this.f83416b.setDither(true);
        this.f83416b.setFilterBitmap(true);
    }
}
