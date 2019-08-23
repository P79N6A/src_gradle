package com.ta.utdid2.b.a;

import java.lang.reflect.Method;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f78853a = null;

    /* renamed from: a  reason: collision with other field name */
    private static Method f42a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Method f78854b = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f78855e;

    static {
        boolean z = false;
        if (getInt("alidebug", 0) == 1) {
            z = true;
        }
        f78855e = z;
    }

    private static void a() {
        try {
            if (f78853a == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                f78853a = cls;
                f42a = cls.getDeclaredMethod("get", new Class[]{String.class});
                f78854b = f78853a.getDeclaredMethod("getInt", new Class[]{String.class, Integer.TYPE});
            }
        } catch (Exception unused) {
        }
    }

    public static int getInt(String str, int i) {
        a();
        try {
            return ((Integer) f78854b.invoke(f78853a, new Object[]{str, Integer.valueOf(i)})).intValue();
        } catch (Exception unused) {
            return i;
        }
    }
}
