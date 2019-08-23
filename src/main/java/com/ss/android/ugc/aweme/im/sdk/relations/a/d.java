package com.ss.android.ugc.aweme.im.sdk.relations.a;

import android.support.annotation.ColorInt;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.taobao.android.dexposed.ClassUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52042a;

    public static SpannableString a(@ColorInt int i, String str, String str2, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4, Integer.valueOf(i2)}, null, f52042a, true, 53036, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4, Integer.valueOf(i2)}, null, f52042a, true, 53036, new Class[]{Integer.TYPE, String.class, String.class, Integer.TYPE}, SpannableString.class);
        }
        if (str4.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            str4 = str4.replace(ClassUtils.PACKAGE_SEPARATOR, "\\.");
        }
        SpannableString spannableString = new SpannableString(str3);
        try {
            Matcher matcher = Pattern.compile(str4).matcher(spannableString);
            if (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (start >= i2) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
                    if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(start), Integer.valueOf(end), 33}, null, e.f52043a, true, 53038, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(start), Integer.valueOf(end), 33}, null, e.f52043a, true, 53038, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        spannableString.setSpan(foregroundColorSpan, start, end, 33);
                    }
                }
            }
            return spannableString;
        } catch (PatternSyntaxException unused) {
            return spannableString;
        }
    }
}
