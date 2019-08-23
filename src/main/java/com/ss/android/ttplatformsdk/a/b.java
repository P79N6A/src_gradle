package com.ss.android.ttplatformsdk.a;

import android.content.Context;

public class b {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f31124a;

    private b() {
    }

    public static void a(Context context) {
        if (f31124a == null) {
            synchronized (b.class) {
                if (f31124a == null) {
                    f31124a = a.a(context.getApplicationContext());
                }
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        a(context);
        f31124a.a(str, str2);
    }

    public static String b(Context context, String str, String str2) {
        a(context);
        return f31124a.b(str, str2);
    }

    public static boolean a(Context context, String str, Boolean bool) {
        a(context);
        return f31124a.f31122a.getBoolean(str, bool.booleanValue());
    }
}
