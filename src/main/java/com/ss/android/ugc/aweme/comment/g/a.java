package com.ss.android.ugc.aweme.comment.g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.u;

public final class a {

    /* renamed from: com.ss.android.ugc.aweme.comment.g.a$a  reason: collision with other inner class name */
    public static class C0459a extends ReplacementSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36448a;

        /* renamed from: b  reason: collision with root package name */
        private int f36449b;

        /* renamed from: c  reason: collision with root package name */
        private int f36450c;

        public C0459a(int i) {
            this.f36450c = i;
        }

        public final TextPaint a(Paint paint) {
            int i;
            Paint paint2 = paint;
            if (PatchProxy.isSupport(new Object[]{paint2}, this, f36448a, false, 27767, new Class[]{Paint.class}, TextPaint.class)) {
                return (TextPaint) PatchProxy.accessDispatch(new Object[]{paint2}, this, f36448a, false, 27767, new Class[]{Paint.class}, TextPaint.class);
            }
            TextPaint textPaint = new TextPaint(paint2);
            textPaint.setTextSize((float) u.c(10.0d));
            if (this.f36450c == 1) {
                i = d.a().getResources().getColor(C0906R.color.hy);
            } else {
                i = d.a().getResources().getColor(C0906R.color.zv);
            }
            textPaint.setColor(i);
            return textPaint;
        }

        public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            if (PatchProxy.isSupport(new Object[]{paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt}, this, f36448a, false, 27765, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt}, this, f36448a, false, 27765, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
            }
            this.f36449b = (int) a(paint).measureText(charSequence.subSequence(i, i2).toString());
            return this.f36449b + u.a(16.0d);
        }

        public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NonNull Paint paint) {
            int i6;
            int i7;
            int i8;
            Canvas canvas2 = canvas;
            int i9 = i3;
            int i10 = i5;
            Paint paint2 = paint;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f36448a, false, 27766, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f36448a, false, 27766, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
                return;
            }
            Paint paint3 = new Paint();
            paint3.setStyle(Paint.Style.FILL);
            if (this.f36450c == 1) {
                i6 = d.a().getResources().getColor(C0906R.color.hs);
            } else {
                i6 = d.a().getResources().getColor(C0906R.color.hk);
            }
            paint3.setColor(i6);
            paint3.setAntiAlias(true);
            CharSequence subSequence = charSequence.subSequence(i, i2);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a2 = a(paint2);
            Paint.FontMetricsInt fontMetricsInt2 = a2.getFontMetricsInt();
            if (GlobalContext.getContext().getResources().getDisplayMetrics().density < 4.0f) {
                z = true;
            }
            if (z) {
                i7 = (((i10 - i9) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2) + u.a(1.0d);
            } else {
                i7 = ((i10 - i9) - (fontMetricsInt.descent - fontMetricsInt.ascent)) + 3;
            }
            float f3 = (float) i7;
            canvas2.drawRoundRect(new RectF(f2 + ((float) u.a(4.0d)), ((float) i9) + f3, (float) ((int) (f2 + ((float) this.f36449b) + ((float) u.a(12.0d)))), ((float) i10) - f3), (float) u.a(4.0d), (float) u.a(4.0d), paint3);
            String charSequence2 = subSequence.toString();
            float a3 = f2 + ((float) u.a(8.0d));
            int i11 = i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent));
            if (z) {
                i8 = 1;
            } else {
                i8 = 3;
            }
            canvas2.drawText(charSequence2, a3, (float) (i11 - i8), a2);
        }
    }

    public static class b extends ReplacementSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36451a;

        /* renamed from: b  reason: collision with root package name */
        private int f36452b;

        /* renamed from: c  reason: collision with root package name */
        private int f36453c;

        private TextPaint a(Paint paint) {
            if (PatchProxy.isSupport(new Object[]{paint}, this, f36451a, false, 27770, new Class[]{Paint.class}, TextPaint.class)) {
                return (TextPaint) PatchProxy.accessDispatch(new Object[]{paint}, this, f36451a, false, 27770, new Class[]{Paint.class}, TextPaint.class);
            }
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f36452b);
            textPaint.setColor(this.f36453c);
            return textPaint;
        }

        public b(int i, int i2) {
            this.f36452b = i;
            this.f36453c = i2;
        }

        public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            if (PatchProxy.isSupport(new Object[]{paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt}, this, f36451a, false, 27768, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
                Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
                return ((Integer) PatchProxy.accessDispatch(objArr, this, f36451a, false, 27768, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
            }
            return (int) a(paint).measureText(charSequence.subSequence(i, i2).toString());
        }

        public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NonNull Paint paint) {
            Canvas canvas2 = canvas;
            Paint paint2 = paint;
            if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f36451a, false, 27769, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f36451a, false, 27769, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
                return;
            }
            CharSequence subSequence = charSequence.subSequence(i, i2);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a2 = a(paint2);
            Paint.FontMetricsInt fontMetricsInt2 = a2.getFontMetricsInt();
            canvas2.drawText(subSequence.toString(), f2, (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a2);
        }
    }
}
