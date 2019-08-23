package com.xiaomi.push;

public class bp {
    private static Class a() {
        return Class.forName("android.os.SystemProperties");
    }

    public static String a(String str, String str2) {
        try {
            return (String) a().getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Exception unused) {
            return "";
        }
    }
}
