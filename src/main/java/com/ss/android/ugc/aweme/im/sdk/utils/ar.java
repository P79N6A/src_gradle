package com.ss.android.ugc.aweme.im.sdk.utils;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0007J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/utils/TextEllipsizeUtils;", "", "()V", "ellipsizeText2ExceptWidth", "Landroid/text/SpannableStringBuilder;", "spannableStringBuilder", "paint", "Landroid/text/TextPaint;", "width", "", "maxLine", "keepOffset", "keepWidth", "canBeLineStart", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52491a;

    /* renamed from: b  reason: collision with root package name */
    public static final ar f52492b = new ar();

    private ar() {
    }

    @JvmStatic
    @NotNull
    public static final SpannableStringBuilder a(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull TextPaint textPaint, int i, int i2, int i3, int i4) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        TextPaint textPaint2 = textPaint;
        if (PatchProxy.isSupport(new Object[]{spannableStringBuilder2, textPaint2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, f52491a, true, 53693, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableStringBuilder.class)) {
            Object[] objArr = {spannableStringBuilder2, textPaint2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, f52491a, true, 53693, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, SpannableStringBuilder.class);
        }
        Intrinsics.checkParameterIsNotNull(spannableStringBuilder2, "spannableStringBuilder");
        Intrinsics.checkParameterIsNotNull(textPaint2, "paint");
        return a(spannableStringBuilder, textPaint, i, i2, i3, i4, true);
    }

    @JvmStatic
    @NotNull
    private static SpannableStringBuilder a(@NotNull SpannableStringBuilder spannableStringBuilder, @NotNull TextPaint textPaint, int i, int i2, int i3, int i4, boolean z) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        TextPaint textPaint2 = textPaint;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{spannableStringBuilder2, textPaint2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), (byte) 1}, null, f52491a, true, 53694, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, SpannableStringBuilder.class)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(new Object[]{spannableStringBuilder2, textPaint2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), (byte) 1}, null, f52491a, true, 53694, new Class[]{SpannableStringBuilder.class, TextPaint.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, SpannableStringBuilder.class);
        }
        Intrinsics.checkParameterIsNotNull(spannableStringBuilder2, "spannableStringBuilder");
        Intrinsics.checkParameterIsNotNull(textPaint2, "paint");
        CharSequence charSequence = spannableStringBuilder2;
        DynamicLayout dynamicLayout = new DynamicLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (dynamicLayout.getLineCount() <= i5) {
            return spannableStringBuilder2;
        }
        float measureText = ((float) i) - (textPaint2.measureText("...") + ((float) i4));
        int lineStart = dynamicLayout.getLineStart(i5 - 1);
        while (lineStart < spannableStringBuilder.length() - i3 && 10 != spannableStringBuilder2.charAt(lineStart)) {
            int i6 = lineStart + 1;
            measureText -= textPaint2.measureText(charSequence, lineStart, i6);
            if (measureText <= 0.0f) {
                break;
            }
            lineStart = i6;
        }
        CharSequence subSequence = spannableStringBuilder2.subSequence(spannableStringBuilder.length() - i3, spannableStringBuilder.length());
        Intrinsics.checkExpressionValueIsNotNull(subSequence, "spannableStringBuilder.s…ableStringBuilder.length)");
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2.subSequence(0, lineStart));
        spannableStringBuilder3.append("...");
        spannableStringBuilder3.append(subSequence);
        return spannableStringBuilder3;
    }
}
