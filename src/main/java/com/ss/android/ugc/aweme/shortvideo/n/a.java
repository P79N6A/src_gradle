package com.ss.android.ugc.aweme.shortvideo.n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJP\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J2\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J6\u0010#\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nXD¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/span/HookAtSpan;", "Landroid/text/style/ReplacementSpan;", "mContext", "Landroid/content/Context;", "mView", "Landroid/view/View;", "maxW", "", "(Landroid/content/Context;Landroid/view/View;I)V", "extraWdp", "", "hookTextSizedp", "hookTextmarginLeftdp", "mSize", "realString", "", "triangleHdp", "triangleMarginLeftdp", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "replaceTail2Dot", "viewWidth", "increasedWidth", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68783a;

    /* renamed from: b  reason: collision with root package name */
    private int f68784b;

    /* renamed from: c  reason: collision with root package name */
    private final float f68785c = 22.0f;

    /* renamed from: d  reason: collision with root package name */
    private final float f68786d = 15.0f;

    /* renamed from: e  reason: collision with root package name */
    private final float f68787e = 17.0f;

    /* renamed from: f  reason: collision with root package name */
    private final float f68788f = 10.0f;
    private final float g = 5.0f;
    private String h = "";
    private final Context i;
    private final View j;
    private final int k;

    public a(@NotNull Context context, @NotNull View view, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mView");
        this.i = context;
        this.j = view;
        this.k = i2;
    }

    public final int getSize(@NotNull Paint paint, @NotNull CharSequence charSequence, int i2, int i3, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint paint2 = paint;
        CharSequence charSequence2 = charSequence;
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{paint2, charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f68783a, false, 78522, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{paint2, charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f68783a, false, 78522, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        Intrinsics.checkParameterIsNotNull(charSequence2, "text");
        int i5 = i2 + 1;
        if (i5 >= i4) {
            return 0;
        }
        paint2.setTextSize(UIUtils.dip2Px(this.i, this.f68786d - 2.0f));
        this.f68784b = (int) (paint2.measureText(charSequence2, i5, i4) + UIUtils.dip2Px(this.i, this.f68785c));
        if (this.f68784b >= this.k) {
            this.h = a(charSequence, i5, i3, paint, this.k, UIUtils.dip2Px(this.i, this.f68785c + 2.0f));
            this.f68784b = (int) (paint2.measureText(this.h) + UIUtils.dip2Px(this.i, this.f68785c));
        }
        return this.f68784b;
    }

    @NotNull
    private String a(@NotNull CharSequence charSequence, int i2, int i3, @NotNull Paint paint, int i4, float f2) {
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        int i5 = i4;
        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), paint2, Integer.valueOf(i4), Float.valueOf(f2)}, this, f68783a, false, 78524, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.class, Integer.TYPE, Float.TYPE}, String.class)) {
            Object[] objArr = {charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), paint2, Integer.valueOf(i4), Float.valueOf(f2)};
            return (String) PatchProxy.accessDispatch(objArr, this, f68783a, false, 78524, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.class, Integer.TYPE, Float.TYPE}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(charSequence2, "text");
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        String obj = charSequence.subSequence(i2, i3).toString();
        int measureText = (int) (paint2.measureText(obj) + f2);
        if (i5 == 0 || measureText <= i5) {
            return "";
        }
        while (obj.length() != 1) {
            int length = obj.length() - 1;
            int length2 = obj.length();
            if (obj != null) {
                obj = StringsKt.removeRange((CharSequence) obj, length, length2).toString();
                if (((int) (paint2.measureText(obj + "…") + f2)) <= i5 && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                    return obj + "…";
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        return "…";
    }

    public final void draw(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, @NotNull Paint paint) {
        Canvas canvas2 = canvas;
        CharSequence charSequence2 = charSequence;
        int i7 = i2;
        float f3 = f2;
        int i8 = i5;
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f68783a, false, 78523, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence2, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f68783a, false, 78523, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "canvas");
        Intrinsics.checkParameterIsNotNull(charSequence2, "text");
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        int i9 = i7 + 1;
        if (i9 < i3) {
            if (((float) this.f68784b) + f3 > ((float) this.j.getWidth())) {
                canvas2.drawText("…", f3, (float) i8, paint2);
            } else if (charSequence.length() <= i7 || charSequence.charAt(i2) != 8230) {
                paint2.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint2.setTextSize(UIUtils.dip2Px(this.i, this.f68786d));
                if (com.ss.android.g.a.b()) {
                    paint2.setColor(Color.parseColor("#0B161823"));
                } else {
                    paint2.setColor(Color.parseColor("#33FFFFFF"));
                }
                paint2.setPathEffect(new CornerPathEffect(UIUtils.dip2Px(this.i, 2.0f)));
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float f4 = fontMetrics.top;
                float f5 = fontMetrics.bottom;
                float f6 = (float) i8;
                float f7 = f6 + f4;
                canvas2.drawRect(new RectF(f3, f7, ((float) this.f68784b) + f3, f6 + f5), paint2);
                paint2.setColor(color);
                float f8 = f5 - f4;
                float dip2Px = UIUtils.dip2Px(this.i, this.f68788f);
                float dip2Px2 = UIUtils.dip2Px(this.i, this.g);
                Path path = new Path();
                float f9 = dip2Px2 + f3;
                float f10 = f7 + ((f8 - dip2Px) / 2.0f);
                path.moveTo(f9, f10);
                path.lineTo(f9, f10 + dip2Px);
                path.lineTo(f9 + (0.86f * dip2Px), f10 + (dip2Px / 2.0f));
                path.close();
                canvas2.drawPath(path, paint2);
                paint2.setPathEffect(pathEffect);
                paint2.setTextSize(UIUtils.dip2Px(this.i, this.f68786d - 2.0f));
                if (TextUtils.isEmpty(this.h)) {
                    canvas.drawText(charSequence, i9, i3, f3 + UIUtils.dip2Px(this.i, this.f68787e), f6 - UIUtils.dip2Px(this.i, 1.0f), paint);
                    return;
                }
                canvas2.drawText(this.h, UIUtils.dip2Px(this.i, this.f68787e) + f3, f6 - UIUtils.dip2Px(this.i, 1.0f), paint2);
            } else {
                canvas2.drawText("…", f3, (float) i8, paint2);
            }
        }
    }
}
