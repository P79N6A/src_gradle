package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u001a\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\b"}, d2 = {"lengthWithEmoji", "", "", "start", "end", "substringForGroupTitle", "length", "substringWithEmoji", "im.base_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52484a;

    @NotNull
    public static final String a(@NotNull String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52484a, true, 53688, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52484a, true, 53688, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "$this$substringWithEmoji");
        try {
            String substring = str2.substring(str2.offsetByCodePoints(0, i), str2.offsetByCodePoints(0, i2));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            str2 = substring;
        } catch (Exception unused) {
        }
        return str2;
    }

    /* access modifiers changed from: private */
    public static int b(@NotNull String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52484a, true, 53687, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52484a, true, 53687, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "$this$lengthWithEmoji");
        return str.codePointCount(i, i2);
    }
}
