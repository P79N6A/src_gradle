package com.facebook.widget.text.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class BetterImageSpan extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f24248a;

    /* renamed from: b  reason: collision with root package name */
    private int f24249b;

    /* renamed from: c  reason: collision with root package name */
    private int f24250c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f24251d;

    /* renamed from: e  reason: collision with root package name */
    private final int f24252e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint.FontMetricsInt f24253f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BetterImageSpanAlignment {
    }

    private int a(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f24252e;
        if (i == 0) {
            return fontMetricsInt.descent - this.f24250c;
        }
        if (i != 2) {
            return -this.f24250c;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.f24250c) / 2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f24251d = this.f24248a.getBounds();
        this.f24249b = this.f24251d.width();
        this.f24250c = this.f24251d.height();
        if (fontMetricsInt == null) {
            return this.f24249b;
        }
        int a2 = a(fontMetricsInt);
        int i3 = this.f24250c + a2;
        if (a2 < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = a2;
        }
        if (a2 < fontMetricsInt.top) {
            fontMetricsInt.top = a2;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.f24249b;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.f24253f);
        int a2 = i4 + a(this.f24253f);
        canvas.translate(f2, (float) a2);
        this.f24248a.draw(canvas);
        canvas.translate(-f2, (float) (-a2));
    }
}
