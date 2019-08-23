package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.az;

public class aj {

    /* renamed from: a  reason: collision with root package name */
    private static long f82495a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static String f928a = "";

    public static String a() {
        if (TextUtils.isEmpty(f928a)) {
            f928a = az.a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f928a);
        long j = f82495a;
        f82495a = 1 + j;
        sb.append(j);
        return sb.toString();
    }
}
