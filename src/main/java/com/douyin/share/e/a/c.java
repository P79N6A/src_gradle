package com.douyin.share.e.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

public final class c extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private int f23221a;

    /* renamed from: b  reason: collision with root package name */
    private Context f23222b;

    private TextPaint a(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        textPaint.setTextSize((float) this.f23221a);
        return textPaint;
    }

    public c(int i, Context context) {
        this.f23221a = i;
        this.f23222b = context;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) a(paint).measureText(charSequence.subSequence(i, i2).toString());
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        TextPaint a2 = a(paint);
        Paint.FontMetricsInt fontMetricsInt = a2.getFontMetricsInt();
        canvas.drawText(subSequence.toString(), f2, (float) (i4 - (((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - ((i5 + i3) / 2))), a2);
    }
}
