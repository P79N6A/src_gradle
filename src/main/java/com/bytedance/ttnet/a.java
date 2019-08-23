package com.bytedance.ttnet;

import android.text.TextUtils;

public final class a {
    public static String a() {
        String d2 = TTNetInit.getTTNetDepend().d();
        if (!TextUtils.isEmpty(d2)) {
            return d2;
        }
        throw new IllegalArgumentException("apiIHostPrefix is not init !!!");
    }

    public static String b() {
        String c2 = TTNetInit.getTTNetDepend().c();
        if (c2 != null && !TextUtils.isEmpty(c2)) {
            return c2;
        }
        throw new IllegalArgumentException("hostSuffix is not init !!!");
    }

    public static String a(String str) {
        String c2 = TTNetInit.getTTNetDepend().c();
        if (str == null || TextUtils.isEmpty(c2)) {
            throw new IllegalArgumentException("hostSuffix is not init !!!");
        }
        return str + c2;
    }
}
