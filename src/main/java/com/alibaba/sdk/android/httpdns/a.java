package com.alibaba.sdk.android.httpdns;

import android.text.TextUtils;
import java.security.NoSuchAlgorithmException;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f5079a;

    /* renamed from: a  reason: collision with other field name */
    private static String f18a;

    static String a(String str, String str2) {
        String str3;
        if (!j.b(str)) {
            return "";
        }
        try {
            str3 = j.a(str + "-" + f18a + "-" + str2);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "";
        }
        return str3;
    }

    static void a(String str) {
        f18a = str;
    }

    static boolean a() {
        return !TextUtils.isEmpty(f18a);
    }

    static String getTimestamp() {
        return String.valueOf((System.currentTimeMillis() / 1000) + f5079a + 600);
    }

    static void setAuthCurrentTime(long j) {
        f5079a = j - (System.currentTimeMillis() / 1000);
    }
}
