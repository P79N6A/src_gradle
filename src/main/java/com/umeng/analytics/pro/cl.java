package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

public class cl {
    public static ck a(Class<? extends ck> cls, int i) {
        try {
            return (ck) cls.getMethod("findByValue", new Class[]{Integer.TYPE}).invoke(null, new Object[]{Integer.valueOf(i)});
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (IllegalAccessException unused2) {
            return null;
        } catch (InvocationTargetException unused3) {
            return null;
        }
    }
}
