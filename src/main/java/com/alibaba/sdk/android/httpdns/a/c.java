package com.alibaba.sdk.android.httpdns.a;

import android.text.TextUtils;
import java.text.SimpleDateFormat;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f5083a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    static String c(String str) {
        try {
            return f5083a.format(Long.valueOf(a(str) * 1000));
        } catch (Exception unused) {
            return f5083a.format(Long.valueOf(System.currentTimeMillis()));
        }
    }

    static String d(String str) {
        try {
            return String.valueOf(f5083a.parse(str).getTime() / 1000);
        } catch (Exception unused) {
            return String.valueOf(System.currentTimeMillis() / 1000);
        }
    }
}
