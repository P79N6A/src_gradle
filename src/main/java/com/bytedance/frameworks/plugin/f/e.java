package com.bytedance.frameworks.plugin.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f2256a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f2257b = new Class[0];

    /* renamed from: c  reason: collision with root package name */
    private static final String f2258c = "e";

    private e() {
    }

    public static Class<?>[] a(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return f2257b;
        }
        return clsArr;
    }

    public static Object[] b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f2256a;
        }
        return objArr;
    }

    public static Class<?>[] a(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length == 0) {
            return f2257b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == null) {
                cls = null;
            } else {
                cls = objArr[i].getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }
}
