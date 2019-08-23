package com.bytedance.android.live.core.utils;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8236a;

    public static SpannableString a(String str, float f2, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(0.6777f), Integer.valueOf(i), Integer.valueOf(i2)}, null, f8236a, true, 1277, new Class[]{String.class, Float.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(0.6777f), Integer.valueOf(i), Integer.valueOf(i2)}, null, f8236a, true, 1277, new Class[]{String.class, Float.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class);
        }
        SpannableString spannableString = new SpannableString(str2);
        af.a(spannableString, new RelativeSizeSpan(0.6777f), i, i2, 18);
        return spannableString;
    }

    public static SpannableString b(String str, float f2, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(20.0f), Integer.valueOf(i), Integer.valueOf(i2)}, null, f8236a, true, 1278, new Class[]{String.class, Float.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(20.0f), Integer.valueOf(i), Integer.valueOf(i2)}, null, f8236a, true, 1278, new Class[]{String.class, Float.TYPE, Integer.TYPE, Integer.TYPE}, SpannableString.class);
        }
        SpannableString spannableString = new SpannableString(str2);
        af.a(spannableString, new AbsoluteSizeSpan(ac.a(20.0f)), i, i2, 18);
        return spannableString;
    }
}
