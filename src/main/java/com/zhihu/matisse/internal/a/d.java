package com.zhihu.matisse.internal.a;

import android.os.Build;

public final class d {
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 14) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return false;
    }
}
