package com.bytedance.frameworks.plugin.b;

import com.bytedance.frameworks.plugin.e.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Class f2166a;

    /* renamed from: b  reason: collision with root package name */
    private static Object f2167b;

    private static Class b() {
        if (f2166a == null) {
            try {
                f2166a = Class.forName("android.content.res.CompatibilityInfo");
            } catch (ClassNotFoundException unused) {
            }
        }
        return f2166a;
    }

    public static Object a() {
        if (f2167b == null) {
            try {
                f2167b = a.b(b(), "DEFAULT_COMPATIBILITY_INFO");
            } catch (IllegalAccessException unused) {
            }
        }
        return f2167b;
    }
}
