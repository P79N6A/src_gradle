package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.cc;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f80308a = new String[2];

    public static void b(Context context) {
        f80308a[0] = null;
        f80308a[1] = null;
        if (context != null) {
            cc.a(context).b();
        }
    }

    public static String[] a(Context context) {
        if (!TextUtils.isEmpty(f80308a[0]) && !TextUtils.isEmpty(f80308a[1])) {
            return f80308a;
        }
        if (context != null) {
            String[] a2 = cc.a(context).a();
            if (a2 != null) {
                f80308a[0] = a2[0];
                f80308a[1] = a2[1];
                return f80308a;
            }
        }
        return null;
    }

    public static void a(Context context, String str, String str2) {
        f80308a[0] = str;
        f80308a[1] = str2;
        if (context != null) {
            cc.a(context).a(str, str2);
        }
    }
}
