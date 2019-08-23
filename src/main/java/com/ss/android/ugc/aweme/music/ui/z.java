package com.ss.android.ugc.aweme.music.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class z extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56784a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f56785b = new Paint();

    /* renamed from: c  reason: collision with root package name */
    private int f56786c;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f56787d;

    /* renamed from: e  reason: collision with root package name */
    private float f56788e;

    /* renamed from: f  reason: collision with root package name */
    private float f56789f;
    private float g;
    private float h;
    private float i;
    private float j;

    public z(Drawable drawable) {
        this.f56785b.setStyle(Paint.Style.STROKE);
        this.f56785b.setColor(-16777216);
        this.f56785b.setAntiAlias(true);
        this.f56785b.setTypeface(b.a().a(c.g));
        this.f56787d = drawable;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f56784a, false, 60527, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f56784a, false, 60527, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f56785b.setTextSize(f2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f56784a, false, 60528, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f56784a, false, 60528, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f56785b.setColor(i2);
    }

    public final void a(float f2, float f3) {
        this.i = f2;
        this.j = 0.0f;
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.f56788e = f2;
        this.f56789f = f3;
        this.h = f4;
        this.g = f5;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{paint, charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f56784a, false, 60529, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{paint, charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f56784a, false, 60529, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
        }
        this.f56786c = (int) (this.f56785b.measureText(charSequence2, i2, i3) + this.f56788e + this.h);
        return (int) (((float) this.f56786c) + this.i + this.j);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f56784a, false, 60530, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f56784a, false, 60530, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        this.f56787d.setBounds((int) (f2 + this.i), i4, (int) (f2 + ((float) this.f56786c) + this.i + this.j), i6);
        this.f56787d.draw(canvas2);
        canvas.drawText(charSequence, i2, i3, f2 + this.f56788e + this.i, ((float) i5) - (this.h / 2.0f), this.f56785b);
    }
}
