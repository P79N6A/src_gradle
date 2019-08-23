package com.ss.android.ugc.aweme.hotsearch.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.bytex.a.a.a;

public final class h extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49892a;
    private static int[] i = {2130840401, 2130840412, 2130840423, 2130840425, 2130840426, 2130840427, 2130840428, 2130840429, 2130840430, 2130840402, 2130840403, 2130840404, 2130840405, 2130840406, 2130840407, 2130840408, 2130840409, 2130840410, 2130840411, 2130840413, 2130840414, 2130840415, 2130840416, 2130840417, 2130840418, 2130840419, 2130840420, 2130840421, 2130840422, 2130840424};

    /* renamed from: b  reason: collision with root package name */
    private int f49893b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f49894c;

    /* renamed from: d  reason: collision with root package name */
    private String f49895d;

    /* renamed from: e  reason: collision with root package name */
    private int f49896e = u.c(8.5d);

    /* renamed from: f  reason: collision with root package name */
    private int f49897f = Color.parseColor("#8b3312");
    private Drawable g;
    private int h;

    private Drawable a() {
        if (PatchProxy.isSupport(new Object[0], this, f49892a, false, 49860, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f49892a, false, 49860, new Class[0], Drawable.class);
        }
        if (this.f49894c == null) {
            this.f49894c = a.a(d.a().getResources(), 2130838550);
            this.f49894c.setBounds(0, 0, this.f49894c.getIntrinsicWidth(), this.f49894c.getIntrinsicHeight());
        }
        return this.f49894c;
    }

    private Drawable a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f49892a, false, 49859, new Class[]{Integer.TYPE}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f49892a, false, 49859, new Class[]{Integer.TYPE}, Drawable.class);
        }
        if (this.g == null) {
            this.g = a.a(d.a().getResources(), i[i2 - 1]);
            this.g.setBounds(0, 0, this.g.getIntrinsicWidth(), this.g.getIntrinsicHeight());
        }
        return this.g;
    }

    public h(int i2, String str, int i3) {
        this.f49893b = i2;
        this.f49895d = str;
        this.h = i3;
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i2, int i3, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{paint2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f49892a, false, 49856, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{paint2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f49892a, false, 49856, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
        }
        Rect bounds = a().getBounds();
        if (TextUtils.isEmpty(this.f49895d)) {
            return bounds.right;
        }
        paint2.setTextSize((float) this.f49896e);
        return bounds.right + ((int) paint2.measureText(this.f49895d)) + 14;
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, @NonNull Paint paint) {
        Canvas canvas2 = canvas;
        float f3 = f2;
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f49892a, false, 49857, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f49892a, false, 49857, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(this.f49895d)) {
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Integer.valueOf(i4)}, this, f49892a, false, 49858, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Integer.valueOf(i4)}, this, f49892a, false, 49858, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Drawable a2 = a();
            canvas.save();
            canvas2.translate(f3, (float) (i4 + u.a((double) this.h)));
            a2.draw(canvas2);
            Drawable a3 = a(this.f49893b);
            canvas2.translate(9.0f, 0.0f);
            a3.draw(canvas2);
            canvas.restore();
        } else {
            Drawable a4 = a();
            if (!TextUtils.isEmpty(this.f49895d)) {
                canvas.save();
                canvas2.translate(f3, (float) (i4 + u.a((double) this.h)));
                canvas2.translate((float) (a4.getBounds().right - 2), 0.0f);
                paint.reset();
                paint2.setTextSize((float) this.f49896e);
                float measureText = paint2.measureText(this.f49895d) + 16.0f;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, measureText, 0.0f, Color.parseColor("#FFD95E"), Color.parseColor("#FFB700"), Shader.TileMode.CLAMP);
                paint2.setShader(linearGradient);
                RectF rectF = new RectF(0.0f, (float) (a4.getBounds().bottom - u.a(12.5d)), measureText, (float) a4.getBounds().bottom);
                float a5 = (float) u.a(2.0d);
                canvas2.drawRoundRect(rectF, a5, a5, paint2);
                float f4 = a5;
                Paint paint3 = paint;
                canvas.drawRect(rectF.left, rectF.top, f4, a5, paint3);
                canvas.drawRect(rectF.left, rectF.bottom - a5, f4, rectF.bottom, paint3);
                paint.reset();
                paint2.setAntiAlias(true);
                paint2.setTypeface(Typeface.DEFAULT_BOLD);
                paint2.setTextSize((float) this.f49896e);
                paint2.setColor(this.f49897f);
                canvas2.drawText(this.f49895d, 8.0f, ((float) a4.getBounds().bottom) - (((((((float) a4.getBounds().bottom) + paint.getFontMetrics().descent) + ((float) a4.getBounds().bottom)) + paint.getFontMetrics().ascent) / 2.0f) - ((rectF.bottom + rectF.top) / 2.0f)), paint2);
                canvas.restore();
            }
            canvas.save();
            canvas2.translate(f3, (float) (i4 + u.a((double) this.h)));
            a4.draw(canvas2);
            Drawable a6 = a(this.f49893b);
            canvas2.translate(9.0f, 0.0f);
            a6.draw(canvas2);
            canvas.restore();
        }
    }
}
