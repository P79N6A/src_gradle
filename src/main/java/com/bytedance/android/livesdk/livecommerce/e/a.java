package com.bytedance.android.livesdk.livecommerce.e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16189a;

    /* renamed from: b  reason: collision with root package name */
    public float f16190b;

    /* renamed from: c  reason: collision with root package name */
    private Context f16191c;

    /* renamed from: d  reason: collision with root package name */
    private String f16192d;

    /* renamed from: e  reason: collision with root package name */
    private float f16193e;

    /* renamed from: f  reason: collision with root package name */
    private float f16194f;
    private Paint g;
    private Paint h;
    private float i;

    private float a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f16189a, false, 10714, new Class[]{String.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{str}, this, f16189a, false, 10714, new Class[]{String.class}, Float.TYPE)).floatValue();
        }
        Rect rect = new Rect();
        this.h.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (b(4.0f) * 2.0f);
    }

    public float b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f16189a, false, 10713, new Class[]{Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f16189a, false, 10713, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
        } else if (this.f16191c != null) {
            return TypedValue.applyDimension(1, f2, this.f16191c.getResources().getDisplayMetrics());
        } else {
            return 0.0f;
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(11.0f)}, this, f16189a, false, 10712, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(11.0f)}, this, f16189a, false, 10712, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.h.setTextSize(b(11.0f));
        this.f16193e = a(this.f16192d);
    }

    public a(Context context, String str, int i2, int i3) {
        int i4;
        int i5;
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            this.f16191c = context.getApplicationContext();
            this.f16192d = str2;
            this.f16190b = b(2.0f);
            this.f16194f = b(2.0f);
            float b2 = b(13.0f);
            this.i = b(1.0f);
            if (i2 != 0) {
                i4 = i2;
            } else {
                i4 = -16776961;
            }
            if (i3 != 0) {
                i5 = i3;
            } else {
                i5 = this.f16191c.getResources().getColor(C0906R.color.l5);
            }
            float f2 = this.i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(b2), Float.valueOf(f2)}, this, f16189a, false, 10711, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Float.valueOf(b2), Float.valueOf(f2)}, this, f16189a, false, 10711, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            } else {
                this.g = new Paint();
                this.g.setColor(i4);
                this.g.setStyle(Paint.Style.STROKE);
                this.g.setAntiAlias(true);
                this.g.setStrokeWidth(f2);
                this.h = new TextPaint();
                this.h.setColor(i5);
                this.h.setTextSize(b2);
                this.h.setAntiAlias(true);
                this.h.setTextAlign(Paint.Align.CENTER);
            }
            this.f16193e = a(str2);
        }
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f16193e + this.f16190b);
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f16189a, false, 10716, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f16189a, false, 10716, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        float textSize = paint.getTextSize();
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f3 = ((float) i5) + (((fontMetrics.descent - fontMetrics.ascent) - textSize) / 2.0f) + fontMetrics.ascent;
        canvas2.drawRoundRect(new RectF(f2 + this.i, f3, f2 + this.f16193e + this.i, f3 + textSize), this.f16194f, this.f16194f, this.g);
        Rect rect = new Rect();
        this.h.getTextBounds(this.f16192d, 0, this.f16192d.length(), rect);
        canvas2.drawText(this.f16192d, f2 + (this.f16193e / 2.0f) + this.i, (f3 + ((textSize - ((float) rect.height())) / 2.0f)) - ((float) rect.top), this.h);
    }
}
