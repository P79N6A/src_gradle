package com.vivo.push.util;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.vivo.push.a.a;
import com.vivo.push.b.n;
import com.vivo.push.y;

public final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81679a = ("(" + Process.myPid() + ")");

    public final String a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public final void a(Context context, String str) {
        if (o.a()) {
            a(context, str, 0);
        }
    }

    public final void b(Context context, String str) {
        if (o.a()) {
            a(context, str, 1);
        }
    }

    public final void c(Context context, String str) {
        if (o.a()) {
            a(context, str, 2);
        }
    }

    public final int b(String str, String str2) {
        String concat = "VivoPush.".concat(String.valueOf(str));
        return Log.w(concat, f81679a + str2);
    }

    public final int c(String str, String str2) {
        String concat = "VivoPush.".concat(String.valueOf(str));
        return Log.d(concat, f81679a + str2);
    }

    public final int a(String str, String str2) {
        String concat = "VivoPush.".concat(String.valueOf(str));
        return Log.e(concat, f81679a + str2);
    }

    public final int d(String str, String str2) {
        if (!o.a()) {
            return -1;
        }
        String concat = "VivoPush.".concat(String.valueOf(str));
        return Log.i(concat, f81679a + str2);
    }

    public final int e(String str, String str2) {
        if (!o.a()) {
            return -1;
        }
        String concat = "VivoPush.".concat(String.valueOf(str));
        return Log.v(concat, f81679a + str2);
    }

    private static void a(Context context, n nVar, String str) {
        if (str.contains("test") || str.equals(r.b(context)) || "com.vivo.hybrid".equals(str)) {
            a.a(context, (y) nVar, str);
        }
    }

    public final int b(String str, String str2, Throwable th) {
        if (!o.a()) {
            return -1;
        }
        String concat = "VivoPush.".concat(String.valueOf(str));
        return Log.i(concat, f81679a + str2, th);
    }

    private void a(Context context, String str, int i) {
        n nVar = new n();
        nVar.b(str);
        nVar.a(i);
        if (i > 0) {
            d("LogController", str);
        }
        if (y.a(context)) {
            nVar.a(true);
            for (String a2 : r.c(context)) {
                a(context, nVar, a2);
            }
            return;
        }
        nVar.a(false);
        a(context, nVar, context.getPackageName());
    }

    public final int a(String str, String str2, Throwable th) {
        String concat = "VivoPush.".concat(String.valueOf(str));
        return Log.e(concat, f81679a + str2, th);
    }
}
