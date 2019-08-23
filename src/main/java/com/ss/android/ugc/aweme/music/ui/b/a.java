package com.ss.android.ugc.aweme.music.ui.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJP\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J2\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/music/ui/original/CenterVerticalImageSpan;", "Landroid/text/style/ImageSpan;", "mContext", "Landroid/content/Context;", "mDrawable", "Landroid/graphics/drawable/Drawable;", "mRightMargin", "", "(Landroid/content/Context;Landroid/graphics/drawable/Drawable;I)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56664a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f56665b;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable f56666c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56667d = 2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull Drawable drawable, int i) {
        super(drawable);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(drawable, "mDrawable");
        this.f56665b = context;
        this.f56666c = drawable;
    }

    public final int getSize(@NotNull Paint paint, @NotNull CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint paint2 = paint;
        CharSequence charSequence2 = charSequence;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (PatchProxy.isSupport(new Object[]{paint2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt2}, this, f56664a, false, 60569, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{paint2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt2}, this, f56664a, false, 60569, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        Intrinsics.checkParameterIsNotNull(charSequence2, "text");
        Drawable drawable = getDrawable();
        if (drawable == null) {
            drawable = this.f56666c;
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt2 != null) {
            Paint.FontMetricsInt fontMetricsInt3 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt3.bottom - fontMetricsInt3.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt2.ascent = i7;
            fontMetricsInt2.top = i7;
            fontMetricsInt2.bottom = i6;
            fontMetricsInt2.descent = i6;
        }
        return bounds.right + ((int) UIUtils.dip2Px(this.f56665b, (float) this.f56667d));
    }

    public final void draw(@NotNull Canvas canvas, @NotNull CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NotNull Paint paint) {
        Canvas canvas2 = canvas;
        CharSequence charSequence2 = charSequence;
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f56664a, false, 60570, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint2}, this, f56664a, false, 60570, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "canvas");
        Intrinsics.checkParameterIsNotNull(charSequence2, "text");
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        Drawable drawable = getDrawable();
        canvas.save();
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        canvas2.translate(f2, (float) ((((i5 - i3) - drawable.getBounds().bottom) / 2) + i3));
        drawable.draw(canvas2);
        canvas.restore();
    }
}
