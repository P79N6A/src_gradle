package com.ss.android.d.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.d.b.a.a.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f28341a = "applog_stats";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f28342b;

    /* renamed from: c  reason: collision with root package name */
    private static String f28343c;

    public static String a() {
        return f28341a;
    }

    public static boolean b() {
        return f28342b;
    }

    public static String c() {
        if (TextUtils.isEmpty(f28343c)) {
            f28343c = c.a("c25zc2RrX29wZW51ZGlk");
        }
        return f28343c;
    }

    public static SharedPreferences a(Context context) {
        return com.ss.android.ugc.aweme.q.c.a(context, a(), 0);
    }
}
