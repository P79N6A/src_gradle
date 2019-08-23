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
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.bytex.a.a.a;
import java.lang.ref.WeakReference;

public final class e extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47052a;

    /* renamed from: b  reason: collision with root package name */
    float f47053b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    int f47054c = -1;

    /* renamed from: d  reason: collision with root package name */
    private Context f47055d;

    /* renamed from: e  reason: collision with root package name */
    private int f47056e;

    /* renamed from: f  reason: collision with root package name */
    private String f47057f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m = 12;
    private int n;
    private WeakReference<Drawable> o;

    private Xfermode a() {
        if (!PatchProxy.isSupport(new Object[0], this, f47052a, false, 43656, new Class[0], Xfermode.class)) {
            return new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        }
        return (Xfermode) PatchProxy.accessDispatch(new Object[0], this, f47052a, false, 43656, new Class[0], Xfermode.class);
    }

    private Drawable c() {
        if (!PatchProxy.isSupport(new Object[0], this, f47052a, false, 43660, new Class[0], Drawable.class)) {
            return a.a(this.f47055d.getResources(), this.n);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f47052a, false, 43660, new Class[0], Drawable.class);
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
            com.meituan.robust.ChangeQuickRedirect r3 = f47052a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            r4 = 0
            r5 = 43659(0xaa8b, float:6.1179E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f47052a
            r5 = 0
            r6 = 43659(0xaa8b, float:6.1179E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x0028:
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r9.o
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
            r9.o = r0
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.widget.e.b():android.graphics.drawable.Drawable");
    }

    public e(Context context, @ColorRes int i2, String str, @DrawableRes int i3) {
        float f2;
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(C0906R.color.bz), str2, 2130839649}, this, f47052a, false, 43652, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(C0906R.color.bz), str2, 2130839649}, this, f47052a, false, 43652, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            } else {
                this.f47055d = context.getApplicationContext();
                this.f47056e = C0906R.color.bz;
                this.f47057f = str2;
                this.l = TypedValue.applyDimension(1, 1.0f, this.f47055d.getResources().getDisplayMetrics());
                this.g = this.l * 18.0f;
                this.j = this.l * 2.0f;
                this.i = this.l * 4.0f;
                this.k = this.l * 12.0f;
                this.n = 2130839649;
            }
            if (PatchProxy.isSupport(new Object[]{str2}, this, f47052a, false, 43653, new Class[]{String.class}, Float.TYPE)) {
                f2 = ((Float) PatchProxy.accessDispatch(new Object[]{str2}, this, f47052a, false, 43653, new Class[]{String.class}, Float.TYPE)).floatValue();
            } else if (str.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.k);
                paint.getTextBounds(str2, 0, str.length(), rect);
                f2 = ((float) rect.width()) + (this.l * 4.0f * 3.0f) + ((float) b().getIntrinsicWidth());
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
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f47052a, false, 43654, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f47052a, false, 43654, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        if (this.f47053b < 0.0f) {
            this.f47053b = f2;
        }
        if (this.f47054c < 0) {
            this.f47054c = i5;
        }
        float f3 = this.f47053b;
        int i8 = this.f47054c;
        if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8), paint}, this, f47052a, false, 43658, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Float.TYPE)) {
            ((Float) PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8), paint}, this, f47052a, false, 43658, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Float.TYPE)).floatValue();
        } else {
            Paint paint2 = new Paint();
            paint2.setColor(this.f47055d.getResources().getColor(this.f47056e));
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
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f3), Float.valueOf(f4)}, this, f47052a, false, 43657, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f3), Float.valueOf(f4)}, this, f47052a, false, 43657, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            } else {
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(this.k);
                textPaint.setXfermode(a());
                textPaint.setAntiAlias(true);
                Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
                RectF rectF2 = new RectF(f3, f4, this.h + f3, this.g + f4);
                canvas2.drawText(this.f47057f, (this.l * 6.0f) + f3 + ((float) b().getIntrinsicWidth()), (float) ((int) ((((rectF2.bottom + rectF2.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f)), textPaint);
            }
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8)}, this, f47052a, false, 43655, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f3), Integer.valueOf(i8)}, this, f47052a, false, 43655, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                Bitmap bitmap = ((BitmapDrawable) b()).getBitmap();
                Paint paint3 = new Paint();
                paint3.setXfermode(a());
                canvas2.drawBitmap(bitmap, f3 + UIUtils.dip2Px(this.f47055d, 4.0f), ((float) (i8 - b().getMinimumHeight())) + UIUtils.dip2Px(this.f47055d, -1.0f), paint3);
            }
            canvas2.restoreToCount(i7);
        }
    }
}
