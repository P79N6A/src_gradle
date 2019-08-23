package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.bytex.a.a.a;
import java.lang.ref.WeakReference;

public final class d extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47046a;

    /* renamed from: b  reason: collision with root package name */
    float f47047b;

    /* renamed from: c  reason: collision with root package name */
    int f47048c = -1;

    /* renamed from: d  reason: collision with root package name */
    private Context f47049d;

    /* renamed from: e  reason: collision with root package name */
    private int f47050e;

    /* renamed from: f  reason: collision with root package name */
    private String f47051f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private WeakReference<Drawable> m;

    private Xfermode a() {
        if (!PatchProxy.isSupport(new Object[0], this, f47046a, false, 43647, new Class[0], Xfermode.class)) {
            return new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        }
        return (Xfermode) PatchProxy.accessDispatch(new Object[0], this, f47046a, false, 43647, new Class[0], Xfermode.class);
    }

    private Drawable c() {
        if (!PatchProxy.isSupport(new Object[0], this, f47046a, false, 43651, new Class[0], Drawable.class)) {
            return a.a(this.f47049d.getResources(), this.l);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f47046a, false, 43651, new Class[0], Drawable.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.graphics.drawable.Drawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47046a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            r4 = 0
            r5 = 43650(0xaa82, float:6.1167E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f47046a
            r5 = 0
            r6 = 43650(0xaa82, float:6.1167E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x0028:
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r9.m
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x0034:
            if (r1 != 0) goto L_0x0041
            android.graphics.drawable.Drawable r1 = r9.c()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r9.m = r0
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.widget.d.b():android.graphics.drawable.Drawable");
    }

    public d(Context context, @ColorRes int i2, String str, @DrawableRes int i3) {
        float f2;
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(C0906R.color.bz), str2, 2130839578}, this, f47046a, false, 43643, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(C0906R.color.bz), str2, 2130839578}, this, f47046a, false, 43643, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            } else {
                this.f47049d = context.getApplicationContext();
                this.f47050e = C0906R.color.bz;
                this.f47051f = str2;
                this.k = TypedValue.applyDimension(1, 1.0f, this.f47049d.getResources().getDisplayMetrics());
                this.g = this.k * 20.0f;
                this.i = this.k * 4.0f;
                this.j = this.k * 12.0f;
                this.l = 2130839578;
            }
            if (PatchProxy.isSupport(new Object[]{str2}, this, f47046a, false, 43644, new Class[]{String.class}, Float.TYPE)) {
                f2 = ((Float) PatchProxy.accessDispatch(new Object[]{str2}, this, f47046a, false, 43644, new Class[]{String.class}, Float.TYPE)).floatValue();
            } else if (str.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.j);
                paint.getTextBounds(str2, 0, str.length(), rect);
                f2 = ((float) rect.width()) + (this.k * 4.0f * 3.0f) + ((float) b().getIntrinsicWidth());
            } else {
                f2 = this.g;
            }
            this.h = f2;
        }
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) this.h;
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int i7;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f47046a, false, 43645, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f47046a, false, 43645, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        if (this.f47047b < 0.0f) {
            this.f47047b = f2;
        }
        if (this.f47048c < 0) {
            this.f47048c = i5;
        }
        float f3 = this.f47047b;
        int i8 = this.f47048c;
        if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8), paint}, this, f47046a, false, 43649, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Float.TYPE)) {
            ((Float) PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8), paint}, this, f47046a, false, 43649, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Float.TYPE)).floatValue();
        } else {
            Paint paint2 = new Paint();
            paint2.setColor(this.f47049d.getResources().getColor(this.f47050e));
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f4 = ((float) i8) + (((fontMetrics.descent - fontMetrics.ascent) - this.g) / 2.0f) + fontMetrics.ascent;
            RectF rectF = new RectF(f3, f4, this.h + f3, this.g + f4);
            if (Build.VERSION.SDK_INT >= 21) {
                i7 = canvas2.saveLayer(rectF, paint2);
            } else {
                i7 = canvas2.saveLayer(rectF, paint2, 31);
            }
            canvas2.drawRoundRect(rectF, this.i, this.i, paint2);
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f3), Float.valueOf(f4)}, this, f47046a, false, 43648, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f3), Float.valueOf(f4)}, this, f47046a, false, 43648, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            } else {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(this.j);
                textPaint.setXfermode(a());
                textPaint.setAntiAlias(true);
                textPaint.setFakeBoldText(true);
                Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
                RectF rectF2 = new RectF(f3, f4, this.h + f3, this.g + f4);
                canvas2.drawText(this.f47051f, (this.k * 6.0f) + f3 + ((float) b().getIntrinsicWidth()), (float) ((int) ((((rectF2.bottom + rectF2.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f)), textPaint);
            }
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8)}, this, f47046a, false, 43646, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8)}, this, f47046a, false, 43646, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                Bitmap bitmap = ((BitmapDrawable) b()).getBitmap();
                Paint paint3 = new Paint();
                paint3.setXfermode(a());
                canvas2.drawBitmap(bitmap, f3 + ((float) u.a(4.0d)), (float) ((i8 - b().getMinimumHeight()) + u.a(2.0d)), paint3);
            }
            canvas2.restoreToCount(i7);
        }
    }
}
