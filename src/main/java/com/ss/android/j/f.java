package com.ss.android.j;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f2469a = "snssdk143";

    /* renamed from: b  reason: collision with root package name */
    private static String f2470b;

    private static String a(Context context) {
        if (f2470b != null) {
            return f2470b;
        }
        return a(context.getPackageCodePath());
    }

    private static synchronized String a(String str) {
        String str2;
        synchronized (f.class) {
            if (f2470b != null) {
                String str3 = f2470b;
                return str3;
            }
            try {
                str2 = b.a(str);
            } catch (IOException unused) {
                str2 = null;
            }
            if (str2 != null) {
                if (str2.startsWith("growth") || str2.startsWith(f2469a)) {
                    Uri parse = Uri.parse(str2);
                    if ("growth".equals(parse.getScheme())) {
                        f2470b = parse.getQuery();
                    } else if (f2469a.equals(parse.getScheme())) {
                        f2470b = parse.getQuery();
                    }
                }
            }
            if (f2470b == null) {
                f2470b = "";
            }
            String str4 = f2470b;
            return str4;
        }
    }

    public static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (a(context, sb)) {
            return sb.toString();
        }
        return str;
    }

    public static boolean a(Context context, StringBuilder sb) {
        String str;
        if (sb.indexOf("#") > 0) {
            return false;
        }
        String a2 = a(context);
        if (a2.length() == 0) {
            return false;
        }
        if (sb.indexOf("?") > 0) {
            str = "&";
        } else {
            str = "?";
        }
        sb.append(str);
        sb.append(a2);
        return true;
    }
}
