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
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
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

public final class f extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47058a;

    /* renamed from: b  reason: collision with root package name */
    private Context f47059b;

    /* renamed from: c  reason: collision with root package name */
    private int f47060c;

    /* renamed from: d  reason: collision with root package name */
    private String f47061d;

    /* renamed from: e  reason: collision with root package name */
    private float f47062e;

    /* renamed from: f  reason: collision with root package name */
    private float f47063f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private Paint l;
    private TextPaint m;
    private WeakReference<Drawable> n;

    private Xfermode c() {
        if (!PatchProxy.isSupport(new Object[0], this, f47058a, false, 43667, new Class[0], Xfermode.class)) {
            return new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        }
        return (Xfermode) PatchProxy.accessDispatch(new Object[0], this, f47058a, false, 43667, new Class[0], Xfermode.class);
    }

    public final Drawable a() {
        if (!PatchProxy.isSupport(new Object[0], this, f47058a, false, 43671, new Class[0], Drawable.class)) {
            return a.a(this.f47059b.getResources(), this.k);
        }
        return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f47058a, false, 43671, new Class[0], Drawable.class);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47058a, false, 43665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47058a, false, 43665, new Class[0], Void.TYPE);
            return;
        }
        if (this.m == null) {
            this.m = new TextPaint();
            this.m.setTextSize(this.i);
            this.m.setXfermode(c());
            this.m.setAntiAlias(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.graphics.drawable.Drawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable d() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47058a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            r4 = 0
            r5 = 43670(0xaa96, float:6.1195E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f47058a
            r5 = 0
            r6 = 43670(0xaa96, float:6.1195E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x0028:
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r9.n
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x0034:
            if (r1 != 0) goto L_0x0041
            android.graphics.drawable.Drawable r1 = r9.a()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r9.n = r0
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.widget.f.d():android.graphics.drawable.Drawable");
    }

    public f(Context context, @ColorRes int i2, String str, @DrawableRes int i3) {
        this(context, C0906R.color.bz, str, 2130839479, 15);
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) this.f47063f;
    }

    public f(Context context, @ColorRes int i2, String str, @DrawableRes int i3, int i4) {
        float f2;
        String str2 = str;
        if (!TextUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2), str2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f47058a, false, 43661, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2), str2, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f47058a, false, 43661, new Class[]{Context.class, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                this.f47059b = context.getApplicationContext();
                this.f47060c = i2;
                this.f47061d = str2;
                this.j = TypedValue.applyDimension(1, 1.0f, this.f47059b.getResources().getDisplayMetrics());
                this.f47062e = ((float) i4) * this.j;
                this.h = this.j * 2.0f;
                this.g = this.j * 2.0f;
                this.i = this.j * 12.0f;
                this.k = i3;
            }
            if (PatchProxy.isSupport(new Object[]{str2}, this, f47058a, false, 43662, new Class[]{String.class}, Float.TYPE)) {
                f2 = ((Float) PatchProxy.accessDispatch(new Object[]{str2}, this, f47058a, false, 43662, new Class[]{String.class}, Float.TYPE)).floatValue();
            } else if (str.length() > 1) {
                b();
                Rect rect = new Rect();
                this.m.getTextBounds(str2, 0, str.length(), rect);
                f2 = ((float) rect.width()) + (this.j * 4.0f * 3.0f) + ((float) d().getIntrinsicWidth());
            } else {
                f2 = this.f47062e;
            }
            this.f47063f = f2;
        }
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Canvas canvas2 = canvas;
        float f3 = f2;
        int i7 = i5;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f47058a, false, 43663, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint}, this, f47058a, false, 43663, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f47058a, false, 43664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47058a, false, 43664, new Class[0], Void.TYPE);
        } else if (this.l == null) {
            this.l = new Paint();
            this.l.setColor(ContextCompat.getColor(this.f47059b, this.f47060c));
            this.l.setStyle(Paint.Style.FILL);
            this.l.setAntiAlias(true);
        }
        b();
        if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Integer.valueOf(i5), paint}, this, f47058a, false, 43669, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Integer.valueOf(i5), paint}, this, f47058a, false, 43669, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
        } else {
            Paint.FontMetrics fontMetrics = this.m.getFontMetrics();
            float f4 = (float) i7;
            float f5 = fontMetrics.ascent + f4;
            float f6 = f4 + fontMetrics.descent;
            float min = Math.min(Math.min(f5, ((float) canvas.getHeight()) - f6), (this.f47062e - (f6 - f5)) * 0.5f);
            canvas2.drawRoundRect(new RectF(f3, f5 - min, this.f47063f + f3, f6 + min), this.g, this.g, this.l);
        }
        float f7 = (float) i7;
        Object[] objArr = {canvas2, Float.valueOf(f2), Float.valueOf(f7)};
        if (PatchProxy.isSupport(objArr, this, f47058a, false, 43668, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            Object[] objArr2 = {canvas2, Float.valueOf(f2), Float.valueOf(f7)};
            Object[] objArr3 = objArr2;
            PatchProxy.accessDispatch(objArr3, this, f47058a, false, 43668, new Class[]{Canvas.class, Float.TYPE, Float.TYPE}, Void.TYPE);
        } else {
            canvas2.drawText(this.f47061d, f3 + (this.j * 6.0f) + ((float) d().getIntrinsicWidth()), f7, this.m);
        }
        Object[] objArr4 = {canvas2, Float.valueOf(f2), Integer.valueOf(i5)};
        if (PatchProxy.isSupport(objArr4, this, f47058a, false, 43666, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Integer.valueOf(i5)}, this, f47058a, false, 43666, new Class[]{Canvas.class, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) d()).getBitmap();
        Paint paint2 = new Paint();
        paint2.setXfermode(c());
        canvas2.drawBitmap(bitmap, UIUtils.dip2Px(this.f47059b, 4.0f) + f3, ((float) (i7 - d().getMinimumHeight())) + UIUtils.dip2Px(this.f47059b, 1.5f), paint2);
    }
}
