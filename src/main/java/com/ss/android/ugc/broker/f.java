package com.ss.android.ugc.broker;

public abstract class f {
    public static <T> T a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (cls != null) {
                return cls.newInstance();
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
