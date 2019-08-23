package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class aa extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56659a;

    /* renamed from: c  reason: collision with root package name */
    private static int f56660c;

    /* renamed from: b  reason: collision with root package name */
    private Context f56661b;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Drawable> f56662d;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.graphics.drawable.Drawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f56659a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r7 = android.graphics.drawable.Drawable.class
            r4 = 0
            r5 = 60534(0xec76, float:8.4826E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f56659a
            r5 = 0
            r6 = 60534(0xec76, float:8.4826E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            return r0
        L_0x0028:
            java.lang.ref.WeakReference<android.graphics.drawable.Drawable> r0 = r9.f56662d
            r1 = 0
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L_0x0034:
            if (r1 != 0) goto L_0x0041
            android.graphics.drawable.Drawable r1 = r9.getDrawable()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r9.f56662d = r0
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.ui.aa.a():android.graphics.drawable.Drawable");
    }

    public aa(Context context, int i) {
        super(context, 2130838991);
        this.f56661b = context;
        f56660c = (int) UIUtils.dip2Px(this.f56661b, 2.0f);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (PatchProxy.isSupport(new Object[]{paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt2}, this, f56659a, false, 60532, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt2};
            return ((Integer) PatchProxy.accessDispatch(objArr, this, f56659a, false, 60532, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
        }
        Rect bounds = a().getBounds();
        if (fontMetricsInt2 != null) {
            paint.getFontMetricsInt();
            fontMetricsInt2.ascent = (-bounds.bottom) - ((paint.getFontMetricsInt().ascent - paint.getFontMetricsInt().top) + f56660c);
            fontMetricsInt2.descent = 0;
            fontMetricsInt2.top = fontMetricsInt2.ascent;
            fontMetricsInt2.bottom = 0;
        }
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint}, this, f56659a, false, 60533, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint}, this, f56659a, false, 60533, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        Drawable a2 = a();
        canvas.save();
        canvas2.translate(f2, (float) (((i3 + paint.getFontMetricsInt().ascent) - paint.getFontMetricsInt().top) + f56660c));
        a2.draw(canvas2);
        canvas.restore();
    }
}
