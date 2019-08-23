package com.loc;

import android.content.Context;

public final class ck {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25667a = false;

    /* renamed from: b  reason: collision with root package name */
    static boolean f25668b = false;

    /* renamed from: c  reason: collision with root package name */
    static boolean f25669c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f25670d = false;

    /* renamed from: e  reason: collision with root package name */
    static int f25671e = 0;

    /* renamed from: f  reason: collision with root package name */
    static int f25672f = 0;
    static boolean g = true;
    static boolean h;

    private static void a(Context context, int i) {
        try {
            if (a(context)) {
                cl.a(context, "loc", "endMark", i);
                cl.a(context, "loc", "startMark", i);
            }
        } catch (Throwable th) {
            ce.a(th, "RollBackDynamic", "resetMark");
        }
    }

    public static void a(Context context, dh dhVar) {
        if (!f25670d) {
            f25669c = t.b(context, dhVar);
            f25670d = true;
            if (!f25669c && ce.c()) {
                t.a(context, "loc");
                cj.a("dexrollbackstatistics", "RollBack because of version error");
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        try {
            t.a(context, str);
            cj.a("dexrollbackstatistics", "RollBack because of ".concat(String.valueOf(str2)));
        } catch (Throwable th) {
            ce.a(th, "RollBackDynamic", "rollBackDynamicFile");
        }
    }

    public static boolean a(Context context) {
        if (!f25670d) {
            a(context, ce.b());
        }
        return f25669c;
    }

    public static boolean b(Context context) {
        try {
            if (!a(context)) {
                return false;
            }
            if (h) {
                return g;
            }
            if (f25671e == 0) {
                f25671e = cl.b(context, "loc", "startMark", 0);
            }
            if (f25672f == 0) {
                f25672f = cl.b(context, "loc", "endMark", 0);
            }
            if (!f25667a && !f25668b) {
                if (f25671e < f25672f) {
                    a(context, 0);
                    g = true;
                }
                if (f25671e - f25672f > 0 && f25671e > 99) {
                    a(context, 0);
                    g = true;
                }
                if (f25671e - f25672f > 0 && f25671e < 99) {
                    a(context, -2);
                    g = false;
                }
                if (f25671e - f25672f > 0 && f25672f < 0) {
                    a(context, "loc", "checkMark");
                    g = false;
                }
            }
            cl.a(context, "loc", "isload", g);
            h = true;
            return g;
        } catch (Throwable th) {
            ce.a(th, "RollBackDynamic", "checkMark");
        }
    }

    public static boolean c(Context context) {
        try {
            if (!a(context)) {
                return false;
            }
            return cl.b(context, "loc", "isload", false);
        } catch (Throwable th) {
            ce.a(th, "RollBackDynamic", "isLoad");
            return true;
        }
    }
}
