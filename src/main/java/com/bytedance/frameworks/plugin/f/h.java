package com.bytedance.frameworks.plugin.f;

import android.os.Build;

public final class h {
    public static boolean a() {
        if (Build.VERSION.SDK_INT == 28 || (Build.VERSION.SDK_INT == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            return true;
        }
        return false;
    }
}
