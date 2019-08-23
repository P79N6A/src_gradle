package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47032a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47033b;

    /* renamed from: c  reason: collision with root package name */
    private Context f47034c;

    /* renamed from: d  reason: collision with root package name */
    private String f47035d;

    /* renamed from: e  reason: collision with root package name */
    private float f47036e;

    /* renamed from: f  reason: collision with root package name */
    private float f47037f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private String l;
    private String m;

    private float a(@NonNull Canvas canvas, float f2, int i2, Paint paint) {
        float f3;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Integer.valueOf(i2), paint}, this, f47032a, false, 43627, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Integer.valueOf(i2), paint}, this, f47032a, false, 43627, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Float.TYPE)).floatValue();
        }
        Paint paint2 = new Paint();
        try {
            if (!TextUtils.isEmpty(this.l)) {
                paint2.setColor(Color.parseColor(this.l));
            } else {
                paint2.setColor(ContextCompat.getColor(this.f47034c, C0906R.color.ry));
            }
        } catch (Exception unused) {
            paint2.setColor(-1);
        }
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f4 = ((float) i2) + (((fontMetrics.descent - fontMetrics.ascent) - this.f47036e) / 2.0f) + fontMetrics.ascent;
        if (f2 != 0.0f) {
            f3 = f2 + this.i;
        } else {
            f3 = f2;
        }
        canvas.drawRoundRect(new RectF(f3, f4, this.f47037f + f3, this.f47036e + f4), this.g, this.g, paint2);
        return f4;
    }

    public a(Context context, String str, String str2, String str3) {
        float f2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (!TextUtils.isEmpty(str2)) {
            if (PatchProxy.isSupport(new Object[]{context, str4, str5, str6}, this, f47032a, false, 43622, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, str4, str5, str6}, this, f47032a, false, 43622, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
            } else {
                this.f47034c = context.getApplicationContext();
                this.l = str4;
                this.f47035d = str5;
                this.k = TypedValue.applyDimension(1, 1.0f, this.f47034c.getResources().getDisplayMetrics());
                this.f47036e = this.k * 16.0f;
                this.h = this.k * 2.0f;
                this.g = this.k * 2.0f;
                this.j = this.k * 10.0f;
                this.m = str6;
                this.i = this.k * 3.0f;
            }
            if (PatchProxy.isSupport(new Object[]{str5}, this, f47032a, false, 43623, new Class[]{String.class}, Float.TYPE)) {
                f2 = ((Float) PatchProxy.accessDispatch(new Object[]{str5}, this, f47032a, false, 43623, new Class[]{String.class}, Float.TYPE)).floatValue();
            } else if (str2.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.j);
                paint.getTextBounds(str5, 0, str2.length(), rect);
                f2 = ((float) rect.width()) + (this.k * 4.0f * 2.0f);
            } else {
                f2 = this.f47036e;
            }
            this.f47037f = f2;
        }
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f47037f + this.i);
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int i7;
        Xfermode xfermode;
        Canvas canvas2 = canvas;
        float f3 = f2;
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f47032a, false, 43624, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f47032a, false, 43624, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        float a2 = a(canvas2, f3, i5, paint2);
        if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(a2)}, this, f47032a, false, 43626, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(a2)}, this, f47032a, false, 43626, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.j);
        if (this.f47033b) {
            if (PatchProxy.isSupport(new Object[0], this, f47032a, false, 43625, new Class[0], Xfermode.class)) {
                xfermode = (Xfermode) PatchProxy.accessDispatch(new Object[0], this, f47032a, false, 43625, new Class[0], Xfermode.class);
            } else {
                xfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            }
            textPaint.setXfermode(xfermode);
        }
        try {
            if (!TextUtils.isEmpty(this.m)) {
                if (this.f47033b) {
                    i7 = -16777216;
                } else {
                    i7 = Color.parseColor(this.m);
                }
                textPaint.setColor(i7);
            } else {
                textPaint.setColor(-1);
            }
            textPaint.setFakeBoldText(true);
        } catch (Exception unused) {
            textPaint.setColor(-1);
        }
        textPaint.setAntiAlias(true);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        if (f3 != 0.0f) {
            f3 = this.i + f3;
        }
        RectF rectF = new RectF(f3, a2, this.f47037f + f3, this.f47036e + a2);
        canvas2.drawText(this.f47035d, (f3 + (this.k * 4.0f)) - (this.k * 0.5f), ((float) ((int) ((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f))) - (this.k * 0.5f), textPaint);
    }
}
