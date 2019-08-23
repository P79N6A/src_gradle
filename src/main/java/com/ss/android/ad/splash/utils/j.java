package com.ss.android.ad.splash.utils;

import android.util.Base64;

public final class j {
    public static String a(String str) {
        if (g.a(str)) {
            return "";
        }
        try {
            return new String(Base64.decode(str, 0), "utf-8");
        } catch (Throwable unused) {
            return "";
        }
    }
}
