package com.ss.android.ugc.aweme.login.utils;

import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53839a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f53839a, true, 56495, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f53839a, true, 56495, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return str2;
        } else {
            Matcher matcher = Pattern.compile("\\+[0-9]{1,3}[ \\-]").matcher(str2);
            if (matcher.find()) {
                return matcher.replaceFirst("");
            }
            return str2;
        }
    }

    public static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f53839a, true, 56496, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f53839a, true, 56496, new Class[]{String.class}, String.class);
        } else if (Build.VERSION.SDK_INT >= 21) {
            return PhoneNumberUtils.normalizeNumber(str);
        } else {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str2.charAt(i);
                int digit = Character.digit(charAt, 10);
                if (digit != -1) {
                    sb.append(digit);
                } else if (sb.length() == 0 && charAt == '+') {
                    sb.append(charAt);
                }
            }
            return sb.toString();
        }
    }
}
