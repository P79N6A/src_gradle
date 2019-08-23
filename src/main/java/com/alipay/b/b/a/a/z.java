package com.alipay.b.b.a.a;

import android.content.Context;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f5310a;

    public static final boolean a(Context context) {
        if (f5310a != null) {
            return f5310a.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f5310a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
