package com.cmic.sso.sdk.a;

import android.annotation.SuppressLint;
import android.os.Build;

@SuppressLint({"NewApi"})
public class a {

    /* renamed from: com.cmic.sso.sdk.a.a$a  reason: collision with other inner class name */
    public enum C0246a {
        UNKNOWN,
        SAMSUNG,
        HUAWEI
    }

    static int a() {
        return a(b());
    }

    private static C0246a b() {
        String str = Build.BRAND;
        if (str.equalsIgnoreCase("samsung")) {
            return C0246a.SAMSUNG;
        }
        if (str.equalsIgnoreCase("Huawei")) {
            return C0246a.HUAWEI;
        }
        return C0246a.UNKNOWN;
    }

    private static int a(C0246a aVar) {
        switch (aVar) {
            case HUAWEI:
                return 0;
            case SAMSUNG:
                return 1;
            default:
                return -1;
        }
    }
}
