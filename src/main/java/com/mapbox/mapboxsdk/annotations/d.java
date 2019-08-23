package com.mapbox.mapboxsdk.annotations;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private RectF f26429a;

    /* renamed from: b  reason: collision with root package name */
    private float f26430b;

    /* renamed from: c  reason: collision with root package name */
    private float f26431c;

    /* renamed from: d  reason: collision with root package name */
    private float f26432d;

    /* renamed from: e  reason: collision with root package name */
    private float f26433e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f26434f = new Paint(1);
    private float g;
    private Paint h;
    private Path i;
    private Path j = new Path();

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f26429a.height();
    }

    public final int getIntrinsicWidth() {
        return (int) this.f26429a.width();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i2) {
        this.f26434f.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26434f.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        if (this.g > 0.0f) {
            canvas.drawPath(this.i, this.h);
        }
        canvas.drawPath(this.j, this.f26434f);
    }

    private void a(RectF rectF, Path path, float f2) {
        path.moveTo(this.f26430b + rectF.left + f2, rectF.top + f2);
        path.lineTo(rectF.width() - f2, rectF.top + f2);
        path.lineTo(rectF.right - f2, rectF.bottom - f2);
        path.lineTo(rectF.left + this.f26430b + f2, rectF.bottom - f2);
        float f3 = f2 / 2.0f;
        path.lineTo(rectF.left + this.f26430b + f2, (this.f26431c + this.f26432d) - f3);
        path.lineTo(rectF.left + f2 + f2, this.f26432d + (this.f26431c / 2.0f));
        path.lineTo(rectF.left + this.f26430b + f2, this.f26432d + f3);
        path.lineTo(rectF.left + this.f26430b + f2, rectF.top + f2);
        path.close();
    }

    private void e(RectF rectF, Path path, float f2) {
        path.moveTo(rectF.left + f2, rectF.top + f2);
        path.lineTo((rectF.width() - this.f26430b) - f2, rectF.top + f2);
        float f3 = f2 / 2.0f;
        path.lineTo((rectF.right - this.f26430b) - f2, this.f26432d + f3);
        path.lineTo((rectF.right - f2) - f2, this.f26432d + (this.f26431c / 2.0f));
        path.lineTo((rectF.right - this.f26430b) - f2, (this.f26432d + this.f26431c) - f3);
        path.lineTo((rectF.right - this.f26430b) - f2, rectF.bottom - f2);
        path.lineTo(rectF.left + f2, rectF.bottom - f2);
        path.lineTo(rectF.left + f2, rectF.top + f2);
        path.close();
    }

    private void g(RectF rectF, Path path, float f2) {
        path.moveTo(rectF.left + f2, rectF.top + f2);
        path.lineTo(rectF.right - f2, rectF.top + f2);
        path.lineTo(rectF.right - f2, (rectF.bottom - this.f26431c) - f2);
        float f3 = f2 / 2.0f;
        path.lineTo(((rectF.left + this.f26430b) + this.f26432d) - f3, (rectF.bottom - this.f26431c) - f2);
        path.lineTo(rectF.left + this.f26432d + (this.f26430b / 2.0f), (rectF.bottom - f2) - f2);
        path.lineTo(rectF.left + this.f26432d + f3, (rectF.bottom - this.f26431c) - f2);
        path.lineTo(rectF.left + this.f26432d + f2, (rectF.bottom - this.f26431c) - f2);
        path.lineTo(rectF.left + f2, (rectF.bottom - this.f26431c) - f2);
        path.lineTo(rectF.left + f2, rectF.top + f2);
        path.close();
    }

    private void a(b bVar, Path path, float f2) {
        switch (bVar.f26424a) {
            case 0:
                if (this.f26433e <= 0.0f) {
                    a(this.f26429a, path, f2);
                    return;
                } else if (f2 <= 0.0f || f2 <= this.f26433e) {
                    b(this.f26429a, path, f2);
                    return;
                } else {
                    a(this.f26429a, path, f2);
                    return;
                }
            case 1:
                if (this.f26433e <= 0.0f) {
                    e(this.f26429a, path, f2);
                    return;
                } else if (f2 <= 0.0f || f2 <= this.f26433e) {
                    f(this.f26429a, path, f2);
                    return;
                } else {
                    e(this.f26429a, path, f2);
                    return;
                }
            case 2:
                if (this.f26433e <= 0.0f) {
                    c(this.f26429a, path, f2);
                    return;
                } else if (f2 <= 0.0f || f2 <= this.f26433e) {
                    d(this.f26429a, path, f2);
                    return;
                } else {
                    c(this.f26429a, path, f2);
                    return;
                }
            case 3:
                if (this.f26433e <= 0.0f) {
                    g(this.f26429a, path, f2);
                    return;
                } else if (f2 <= 0.0f || f2 <= this.f26433e) {
                    h(this.f26429a, path, f2);
                    break;
                } else {
                    g(this.f26429a, path, f2);
                    return;
                }
        }
    }

    private void b(RectF rectF, Path path, float f2) {
        path.moveTo(this.f26430b + rectF.left + this.f26433e + f2, rectF.top + f2);
        path.lineTo((rectF.width() - this.f26433e) - f2, rectF.top + f2);
        path.arcTo(new RectF(rectF.right - this.f26433e, rectF.top + f2, rectF.right - f2, this.f26433e + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f2, (rectF.bottom - this.f26433e) - f2);
        path.arcTo(new RectF(rectF.right - this.f26433e, rectF.bottom - this.f26433e, rectF.right - f2, rectF.bottom - f2), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f26430b + this.f26433e + f2, rectF.bottom - f2);
        path.arcTo(new RectF(rectF.left + this.f26430b + f2, rectF.bottom - this.f26433e, this.f26433e + rectF.left + this.f26430b, rectF.bottom - f2), 90.0f, 90.0f);
        float f3 = f2 / 2.0f;
        path.lineTo(rectF.left + this.f26430b + f2, (this.f26431c + this.f26432d) - f3);
        path.lineTo(rectF.left + f2 + f2, this.f26432d + (this.f26431c / 2.0f));
        path.lineTo(rectF.left + this.f26430b + f2, this.f26432d + f3);
        path.lineTo(rectF.left + this.f26430b + f2, rectF.top + this.f26433e + f2);
        path.arcTo(new RectF(rectF.left + this.f26430b + f2, rectF.top + f2, this.f26433e + rectF.left + this.f26430b, this.f26433e + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    private void c(RectF rectF, Path path, float f2) {
        path.moveTo(rectF.left + this.f26432d + f2, rectF.top + this.f26431c + f2);
        float f3 = f2 / 2.0f;
        path.lineTo(rectF.left + this.f26432d + f3, rectF.top + this.f26431c + f2);
        path.lineTo(rectF.left + (this.f26430b / 2.0f) + this.f26432d, rectF.top + f2 + f2);
        path.lineTo(((rectF.left + this.f26430b) + this.f26432d) - f3, rectF.top + this.f26431c + f2);
        path.lineTo(rectF.right - f2, rectF.top + this.f26431c + f2);
        path.lineTo(rectF.right - f2, rectF.bottom - f2);
        path.lineTo(rectF.left + f2, rectF.bottom - f2);
        path.lineTo(rectF.left + f2, rectF.top + this.f26431c + f2);
        path.lineTo(rectF.left + this.f26432d + f2, rectF.top + this.f26431c + f2);
        path.close();
    }

    private void d(RectF rectF, Path path, float f2) {
        path.moveTo(rectF.left + Math.min(this.f26432d, this.f26433e) + f2, rectF.top + this.f26431c + f2);
        float f3 = f2 / 2.0f;
        path.lineTo(rectF.left + this.f26432d + f3, rectF.top + this.f26431c + f2);
        path.lineTo(rectF.left + (this.f26430b / 2.0f) + this.f26432d, rectF.top + f2 + f2);
        path.lineTo(((rectF.left + this.f26430b) + this.f26432d) - f3, rectF.top + this.f26431c + f2);
        path.lineTo((rectF.right - this.f26433e) - f2, rectF.top + this.f26431c + f2);
        path.arcTo(new RectF(rectF.right - this.f26433e, rectF.top + this.f26431c + f2, rectF.right - f2, this.f26433e + rectF.top + this.f26431c), 270.0f, 90.0f);
        path.lineTo(rectF.right - f2, (rectF.bottom - this.f26433e) - f2);
        path.arcTo(new RectF(rectF.right - this.f26433e, rectF.bottom - this.f26433e, rectF.right - f2, rectF.bottom - f2), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f26433e + f2, rectF.bottom - f2);
        path.arcTo(new RectF(rectF.left + f2, rectF.bottom - this.f26433e, this.f26433e + rectF.left, rectF.bottom - f2), 90.0f, 90.0f);
        path.lineTo(rectF.left + f2, rectF.top + this.f26431c + this.f26433e + f2);
        path.arcTo(new RectF(rectF.left + f2, rectF.top + this.f26431c + f2, this.f26433e + rectF.left, this.f26433e + rectF.top + this.f26431c), 180.0f, 90.0f);
        path.close();
    }

    private void f(RectF rectF, Path path, float f2) {
        path.moveTo(rectF.left + this.f26433e + f2, rectF.top + f2);
        path.lineTo(((rectF.width() - this.f26433e) - this.f26430b) - f2, rectF.top + f2);
        path.arcTo(new RectF((rectF.right - this.f26433e) - this.f26430b, rectF.top + f2, (rectF.right - this.f26430b) - f2, this.f26433e + rectF.top), 270.0f, 90.0f);
        float f3 = f2 / 2.0f;
        path.lineTo((rectF.right - this.f26430b) - f2, this.f26432d + f3);
        path.lineTo((rectF.right - f2) - f2, this.f26432d + (this.f26431c / 2.0f));
        path.lineTo((rectF.right - this.f26430b) - f2, (this.f26432d + this.f26431c) - f3);
        path.lineTo((rectF.right - this.f26430b) - f2, (rectF.bottom - this.f26433e) - f2);
        path.arcTo(new RectF((rectF.right - this.f26433e) - this.f26430b, rectF.bottom - this.f26433e, (rectF.right - this.f26430b) - f2, rectF.bottom - f2), 0.0f, 90.0f);
        path.lineTo(rectF.left + this.f26430b + f2, rectF.bottom - f2);
        path.arcTo(new RectF(rectF.left + f2, rectF.bottom - this.f26433e, this.f26433e + rectF.left, rectF.bottom - f2), 90.0f, 90.0f);
        path.arcTo(new RectF(rectF.left + f2, rectF.top + f2, this.f26433e + rectF.left, this.f26433e + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    private void h(RectF rectF, Path path, float f2) {
        path.moveTo(rectF.left + this.f26433e + f2, rectF.top + f2);
        path.lineTo((rectF.width() - this.f26433e) - f2, rectF.top + f2);
        path.arcTo(new RectF(rectF.right - this.f26433e, rectF.top + f2, rectF.right - f2, this.f26433e + rectF.top), 270.0f, 90.0f);
        path.lineTo(rectF.right - f2, ((rectF.bottom - this.f26431c) - this.f26433e) - f2);
        path.arcTo(new RectF(rectF.right - this.f26433e, (rectF.bottom - this.f26433e) - this.f26431c, rectF.right - f2, (rectF.bottom - this.f26431c) - f2), 0.0f, 90.0f);
        float f3 = f2 / 2.0f;
        path.lineTo(((rectF.left + this.f26430b) + this.f26432d) - f3, (rectF.bottom - this.f26431c) - f2);
        path.lineTo(rectF.left + this.f26432d + (this.f26430b / 2.0f), (rectF.bottom - f2) - f2);
        path.lineTo(rectF.left + this.f26432d + f3, (rectF.bottom - this.f26431c) - f2);
        path.lineTo(rectF.left + Math.min(this.f26433e, this.f26432d) + f2, (rectF.bottom - this.f26431c) - f2);
        path.arcTo(new RectF(rectF.left + f2, (rectF.bottom - this.f26433e) - this.f26431c, this.f26433e + rectF.left, (rectF.bottom - this.f26431c) - f2), 90.0f, 90.0f);
        path.lineTo(rectF.left + f2, rectF.top + this.f26433e + f2);
        path.arcTo(new RectF(rectF.left + f2, rectF.top + f2, this.f26433e + rectF.left, this.f26433e + rectF.top), 180.0f, 90.0f);
        path.close();
    }

    d(RectF rectF, b bVar, float f2, float f3, float f4, float f5, int i2, float f6, int i3) {
        this.f26429a = rectF;
        this.f26430b = f2;
        this.f26431c = f3;
        this.f26432d = f4;
        this.f26433e = f5;
        this.f26434f.setColor(i2);
        this.g = f6;
        if (f6 > 0.0f) {
            this.h = new Paint(1);
            this.h.setColor(i3);
            this.i = new Path();
            a(bVar, this.j, f6);
            a(bVar, this.i, 0.0f);
            return;
        }
        a(bVar, this.j, 0.0f);
    }
}
