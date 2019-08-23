package com.alipay.d.a.a.d;

import java.io.File;

public final class a {
    public static String a(String str) {
        String str2 = "";
        try {
            str2 = System.getProperty(str);
        } catch (Throwable unused) {
        }
        if (!com.alipay.d.a.a.a.a.a(str2)) {
            return str2;
        }
        return b.a(".SystemConfig" + File.separator + str);
    }
}
