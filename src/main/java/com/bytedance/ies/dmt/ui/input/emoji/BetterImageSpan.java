package com.bytedance.ies.dmt.ui.input.emoji;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

public final class BetterImageSpan extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f20361a;

    /* renamed from: b  reason: collision with root package name */
    private int f20362b;

    /* renamed from: c  reason: collision with root package name */
    private int f20363c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f20364d;

    /* renamed from: e  reason: collision with root package name */
    private final int f20365e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint.FontMetricsInt f20366f;

    public @interface BetterImageSpanAlignment {
    }

    private int a(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f20365e;
        if (i == 0) {
            return fontMetricsInt.descent - this.f20363c;
        }
        if (i != 2) {
            return -this.f20363c;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.f20363c) / 2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f20364d = this.f20361a.getBounds();
        this.f20362b = this.f20364d.width();
        this.f20363c = this.f20364d.height();
        if (fontMetricsInt == null) {
            return this.f20362b;
        }
        int a2 = a(fontMetricsInt);
        int i3 = this.f20363c + a2;
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
            fontMetricsInt.descent = i3;
        }
        return this.f20362b;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.f20366f);
        int a2 = i4 + a(this.f20366f);
        canvas.translate(f2, (float) a2);
        this.f20361a.draw(canvas);
        canvas.translate(-f2, (float) (-a2));
    }
}
