package com.bytedance.ies.dmt.ui.common;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

public class a extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    public int f20309a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f20310b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20311c;

    public a(Drawable drawable) {
        this(drawable, null);
    }

    public a(Drawable drawable, Integer num) {
        super(drawable);
        this.f20310b = num;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f20310b != null && this.f20310b.intValue() != i2 - i && this.f20311c) {
            return 0;
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        if (this.f20310b == null || this.f20310b.intValue() == i2 - i || !this.f20311c) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f2 + ((float) this.f20309a), (float) i6);
            drawable.draw(canvas);
            canvas.restore();
            if (!(this.f20310b == null || this.f20310b.intValue() == i2 - i)) {
                this.f20311c = true;
            }
            return;
        }
        this.f20311c = false;
    }
}
