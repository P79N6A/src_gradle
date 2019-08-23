package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJP\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J2\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/ad/CenterBitmapImageSpan;", "Landroid/text/style/ImageSpan;", "context", "Landroid/content/Context;", "b", "Landroid/graphics/Bitmap;", "verticalAlignment", "", "(Landroid/content/Context;Landroid/graphics/Bitmap;I)V", "marginRight", "getMarginRight", "()I", "setMarginRight", "(I)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38469a;

    /* renamed from: b  reason: collision with root package name */
    public int f38470b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull Bitmap bitmap, int i) {
        super(context, bitmap, -1);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bitmap, "b");
    }

    public final int getSize(@NotNull Paint paint, @NotNull CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint paint2 = paint;
        CharSequence charSequence2 = charSequence;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (PatchProxy.isSupport(new Object[]{paint2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt2}, this, f38469a, false, 30385, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            Object[] objArr = {paint2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt2};
            return ((Integer) PatchProxy.accessDispatch(objArr, this, f38469a, false, 30385, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        Intrinsics.checkParameterIsNotNull(charSequence2, "text");
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt2 != null) {
            fontMetricsInt2.ascent = -bounds.bottom;
            fontMetricsInt2.descent = 0;
            fontMetricsInt2.top = fontMetricsInt2.ascent;
            fontMetricsInt2.bottom = 0;
        }
        return bounds.right + this.f38470b;
    }

    public final void draw(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NotNull Paint paint) {
        int i6;
        Canvas canvas2 = canvas;
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f38469a, false, 30384, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f38469a, false, 30384, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "canvas");
        Intrinsics.checkParameterIsNotNull(charSequence2, "text");
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        int i7 = i5 - drawable.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i6 = i7 - paint.getFontMetricsInt().descent;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            i6 = ((((i4 + fontMetricsInt.descent) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        }
        canvas2.translate(f2, (float) i6);
        drawable.draw(canvas2);
        canvas.restore();
    }
}
