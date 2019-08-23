package com.ss.android.g;

import android.text.TextUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f2462a;

    /* renamed from: b  reason: collision with root package name */
    private static C0348a f2463b;

    /* renamed from: com.ss.android.g.a$a  reason: collision with other inner class name */
    public interface C0348a {
        String a();
    }

    public static boolean b() {
        return TextUtils.equals(f2462a, "musically");
    }

    public static boolean c() {
        return TextUtils.equals(f2462a, "tiktok");
    }

    public static String d() {
        if (f2463b == null) {
            return null;
        }
        return f2463b.a();
    }

    public static boolean a() {
        if (b() || c()) {
            return true;
        }
        return false;
    }
}
