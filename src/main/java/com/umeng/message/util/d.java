package com.umeng.message.util;

import android.os.Build;
import java.io.IOException;

public class d {
    public static boolean a() {
        return a("ro.build.version.emui");
    }

    public static boolean c() {
        boolean z = false;
        try {
            if (Build.class.getMethod("hasSmartBar", new Class[0]) != null) {
                z = true;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b() {
        return a("ro.miui.ui.version.code", "ro.miui.ui.version.name", "ro.miui.internal.storage");
    }

    private static boolean a(String... strArr) {
        try {
            a g = a.g();
            for (String a2 : strArr) {
                if (g.a(a2) == null) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
