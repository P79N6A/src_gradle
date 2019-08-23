package com.ss.android.ugc.aweme.common;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/common/StartNonSpaceInputFilter;", "Landroid/text/InputFilter;", "()V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class x implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40655a;

    @Nullable
    public final CharSequence filter(@NotNull CharSequence charSequence, int i, int i2, @Nullable Spanned spanned, int i3, int i4) {
        CharSequence charSequence2 = charSequence;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f40655a, false, 33327, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class)) {
            Object[] objArr = {charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)};
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, f40655a, false, 33327, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class);
        }
        Intrinsics.checkParameterIsNotNull(charSequence2, "source");
        String obj = charSequence.toString();
        if (obj != null) {
            if (TextUtils.isEmpty(StringsKt.trim((CharSequence) obj).toString())) {
                if (charSequence.length() > 0) {
                    z = true;
                }
                if (z && i3 == 0) {
                    return "";
                }
            }
            return null;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
