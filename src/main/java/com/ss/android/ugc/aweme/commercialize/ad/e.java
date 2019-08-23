package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJR\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u000200H\u0016J8\u00101\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010/\u001a\u0002002\u0006\u0010+\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0002J4\u00102\u001a\u00020\u00072\u0006\u0010/\u001a\u0002002\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000104H\u0016J(\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u0010/\u001a\u0002002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u000e\u0010\"\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/ad/RoundedBackgroundSpan;", "Landroid/text/style/ReplacementSpan;", "context", "Landroid/content/Context;", "width", "", "bgColor", "", "textColor", "struct", "Lcom/ss/android/ugc/aweme/model/TextExtraStruct;", "(Landroid/content/Context;FIILcom/ss/android/ugc/aweme/model/TextExtraStruct;)V", "atLength", "increasedWidth", "getIncreasedWidth", "()F", "setIncreasedWidth", "(F)V", "mBackgroundColor", "mContext", "mTextColor", "modifyedText", "", "radius", "getRadius", "setRadius", "recfWidth", "getRecfWidth", "()I", "setRecfWidth", "(I)V", "textSize", "getTextSize", "setTextSize", "textViewWith", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "drawTriangle", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "replaceTail2Dot", "s", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38473a;

    /* renamed from: b  reason: collision with root package name */
    public float f38474b;

    /* renamed from: c  reason: collision with root package name */
    public float f38475c;

    /* renamed from: d  reason: collision with root package name */
    public float f38476d;

    /* renamed from: e  reason: collision with root package name */
    public int f38477e;

    /* renamed from: f  reason: collision with root package name */
    private final TextExtraStruct f38478f;
    private final int g;
    private final int h = -1;
    private float i;
    private final Context j;
    private String k;
    private float l;

    private final String a(String str, Paint paint, float f2, float f3) {
        String str2 = str;
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{str2, paint2, Float.valueOf(f2), Float.valueOf(f3)}, this, f38473a, false, 30402, new Class[]{String.class, Paint.class, Float.TYPE, Float.TYPE}, String.class)) {
            Object[] objArr = {str2, paint2, Float.valueOf(f2), Float.valueOf(f3)};
            return (String) PatchProxy.accessDispatch(objArr, this, f38473a, false, 30402, new Class[]{String.class, Paint.class, Float.TYPE, Float.TYPE}, String.class);
        }
        int measureText = (int) (paint2.measureText(str2) + f3);
        if (f2 == 0.0f || ((float) measureText) <= f2) {
            return str2;
        }
        while (true) {
            int length = str2.length() - 1;
            int length2 = str2.length();
            if (str2 != null) {
                str2 = StringsKt.removeRange((CharSequence) str2, length, length2).toString();
                if (((float) ((int) (paint2.measureText(str2 + "…") + f3))) <= f2 && !Character.isHighSurrogate(str2.charAt(str2.length() - 1))) {
                    return str2 + "…";
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public e(@NotNull Context context, float f2, int i2, int i3, @NotNull TextExtraStruct textExtraStruct) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(textExtraStruct, "struct");
        this.f38478f = textExtraStruct;
        this.g = i2;
        this.i = f2;
        this.j = context;
        this.f38474b = -1.0f;
        this.k = "";
    }

    public final int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i2, int i3, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Paint paint2 = paint;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{paint2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f38473a, false, 30400, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{paint2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), fontMetricsInt}, this, f38473a, false, 30400, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        if (i4 + 1 >= i5) {
            return 0;
        }
        if (this.f38474b != -1.0f) {
            paint2.setTextSize(this.f38474b);
        }
        String valueOf = String.valueOf(charSequence);
        if (valueOf != null) {
            String substring = valueOf.substring(i4, i5);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            this.k = a(substring, paint2, this.i, this.f38475c);
            this.f38477e = (int) (paint2.measureText(this.k) + this.f38475c);
            return this.f38477e;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, @NotNull Paint paint) {
        boolean z;
        Canvas canvas2 = canvas;
        int i7 = i2;
        float f3 = f2;
        int i8 = i5;
        Paint paint2 = paint;
        if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f38473a, false, 30401, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), paint2}, this, f38473a, false, 30401, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "canvas");
        Intrinsics.checkParameterIsNotNull(paint2, "paint");
        if (i7 + 1 < i3) {
            if (((float) this.f38477e) + f3 > this.i) {
                this.f38478f.setClickable(false);
                canvas2.drawText("…", f3, (float) i8, paint2);
                return;
            }
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || charSequence.length() <= i7 || charSequence.charAt(i2) != 8230) {
                this.f38478f.setClickable(true);
                paint2.setTypeface(Typeface.DEFAULT);
                if (this.f38474b != -1.0f) {
                    paint2.setTextSize(this.f38474b);
                }
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                paint2.setColor(this.g);
                float f4 = (float) i8;
                float f5 = fontMetrics.top + f4;
                float f6 = fontMetrics.bottom + f4;
                canvas2.drawRoundRect(new RectF(f3, f5, ((float) this.f38477e) + f3, f6), this.f38476d, this.f38476d, paint2);
                if (this.k.charAt(0) == '@') {
                    this.l = paint2.measureText(String.valueOf(this.k.charAt(0)));
                    String str = this.k;
                    int length = this.k.length();
                    if (str != null) {
                        String substring = str.substring(1, length);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        this.k = substring;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                paint2.setColor(this.h);
                canvas2.drawText(this.k, (this.f38475c / 2.0f) + f3 + this.l, f4 - UIUtils.dip2Px(this.j, 1.0f), paint2);
                int i9 = (int) f5;
                int i10 = (int) f6;
                if (PatchProxy.isSupport(new Object[]{canvas2, paint2, Float.valueOf(f2), Float.valueOf(f4), Integer.valueOf(i9), Integer.valueOf(i10)}, this, f38473a, false, 30403, new Class[]{Canvas.class, Paint.class, Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{canvas2, paint2, Float.valueOf(f2), Float.valueOf(f4), Integer.valueOf(i9), Integer.valueOf(i10)}, this, f38473a, false, 30403, new Class[]{Canvas.class, Paint.class, Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                paint2.setColor(-1);
                paint2.setPathEffect(new CornerPathEffect(UIUtils.dip2Px(this.j, 2.0f)));
                Path path = new Path();
                float dip2Px = UIUtils.dip2Px(this.j, 10.0f);
                float f7 = ((float) (i10 + i9)) / 2.0f;
                float f8 = dip2Px / 2.0f;
                path.moveTo((this.f38475c / 2.0f) + f3, f7 + f8);
                path.lineTo((this.f38475c / 2.0f) + f3 + ((float) Math.sqrt((Math.pow((double) dip2Px, 2.0d) * 3.0d) / 4.0d)), f7);
                path.lineTo(f3 + (this.f38475c / 2.0f), f7 - f8);
                path.close();
                canvas2.drawPath(path, paint2);
                return;
            }
            this.f38478f.setClickable(false);
            canvas2.drawText("…", f3, (float) i8, paint2);
        }
    }
}
