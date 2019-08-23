package com.bytedance.usergrowth.data.a.b;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class e {
    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(String str, String str2, String str3) {
        char c2 = '?';
        int indexOf = str.indexOf(63);
        int indexOf2 = str.indexOf(35);
        if (indexOf != -1) {
            c2 = '&';
        }
        String str4 = c2 + a(str2) + '=' + a(str3);
        if (indexOf2 == -1) {
            return str + str4;
        }
        return str.substring(0, indexOf2) + str4 + str.substring(indexOf2);
    }
}
