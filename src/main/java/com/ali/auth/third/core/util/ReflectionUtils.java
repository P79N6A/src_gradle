package com.ali.auth.third.core.util;

import com.ali.auth.third.core.trace.SDKLogger;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReflectionUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<?>> f4989a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final String f4990b = ReflectionUtils.class.getSimpleName();

    static {
        f4989a.put("short", Short.TYPE);
        f4989a.put("int", Integer.TYPE);
        f4989a.put("long", Long.TYPE);
        f4989a.put("double", Double.TYPE);
        f4989a.put("float", Float.TYPE);
        f4989a.put("char", Character.TYPE);
        f4989a.put("boolean", Boolean.TYPE);
    }

    public static Object invoke(String str, String str2, String[] strArr, Object obj, Object[] objArr) {
        Class[] clsArr;
        try {
            Class<?> cls = Class.forName(str);
            if (strArr != null) {
                if (strArr.length != 0) {
                    clsArr = toClasses(strArr);
                    return cls.getMethod(str2, clsArr).invoke(obj, objArr);
                }
            }
            clsArr = new Class[0];
            return cls.getMethod(str2, clsArr).invoke(obj, objArr);
        } catch (Exception e2) {
            String str3 = f4990b;
            SDKLogger.e(str3, "Fail to invoke the " + str + ClassUtils.PACKAGE_SEPARATOR + str2 + ", the error is " + e2.getMessage());
            throw new RuntimeException(e2);
        }
    }

    public static Class<?> loadClassQuietly(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> T newInstance(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        if (clsArr != null) {
            try {
                if (clsArr.length != 0) {
                    return cls.getConstructor(clsArr).newInstance(objArr);
                }
            } catch (Exception e2) {
                String str = f4990b;
                SDKLogger.e(str, "Fail to create the instance of type " + cls.getName() + ", the error is " + e2.getMessage());
                throw new RuntimeException(e2);
            }
        }
        return cls.newInstance();
    }

    public static Object newInstance(String str, String[] strArr, Object[] objArr) {
        try {
            return newInstance(Class.forName(str), (Class<?>[]) toClasses(strArr), objArr);
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            String str2 = f4990b;
            SDKLogger.e(str2, "Fail to create the instance of type " + str + ", the error is " + e3.getMessage());
            throw new RuntimeException(e3);
        }
    }

    public static void set(Object obj, String str, Object obj2) {
        try {
            Field field = obj.getClass().getField(str);
            field.setAccessible(true);
            field.set(obj, obj2);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    public static Class<?>[] toClasses(String[] strArr) throws Exception {
        if (strArr == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[strArr.length];
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str.length() < 8) {
                clsArr[i] = f4989a.get(str);
            }
            if (clsArr[i] == null) {
                clsArr[i] = Class.forName(str);
            }
        }
        return clsArr;
    }
}
