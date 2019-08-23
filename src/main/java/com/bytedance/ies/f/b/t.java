package com.bytedance.ies.f.b;

import android.support.annotation.Nullable;
import android.text.TextUtils;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    static boolean f20691a;

    static String a() {
        return "";
    }

    static String a(@Nullable Throwable th) {
        int i;
        StringBuilder sb = new StringBuilder("{\"code\":");
        if (th instanceof q) {
            i = ((q) th).code;
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String str3 = "";
        if (f20691a) {
            str3 = str.substring(1, str.length() - 1);
        }
        String str4 = "{\"code\":1,\"__data\":" + str;
        if (!str3.isEmpty()) {
            str2 = str4 + "," + str3 + "}";
        } else {
            str2 = str4 + "}";
        }
        return str2;
    }
}
