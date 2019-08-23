package com.bytedance.ad.symphony.g;

import android.os.Looper;
import com.bytedance.ad.symphony.b;

public final class f {
    public static void a() {
        if (b.b()) {
            b();
        }
    }

    private static boolean b() {
        if (Looper.myLooper() == a.a()) {
            return true;
        }
        return false;
    }
}
