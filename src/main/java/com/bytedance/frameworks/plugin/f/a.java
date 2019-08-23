package com.bytedance.frameworks.plugin.f;

import android.text.TextUtils;

public class a {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (a.class.getClassLoader().loadClass(str) != null) {
                return true;
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
