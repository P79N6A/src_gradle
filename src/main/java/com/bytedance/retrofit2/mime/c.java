package com.bytedance.retrofit2.mime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f21915a = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    public static String a(String str, String str2) {
        Matcher matcher = f21915a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).replaceAll("[\"\\\\]", "");
        }
        return str2;
    }
}
