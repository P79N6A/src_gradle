package com.sina.weibo.sdk.utils;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static Object getByArray(Object obj, int i) {
        return Array.get(obj, i);
    }

    public static boolean isInstance(Object obj, Class cls) {
        return cls.isInstance(obj);
    }

    public static Object getProperty(Object obj, String str) throws Exception {
        return obj.getClass().getField(str).get(obj);
    }

    public static Object getStaticProperty(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    public static Object newInstance(String str, Class<?>[] clsArr, Object[] objArr) throws Exception {
        return Class.forName(str).getConstructor(clsArr).newInstance(objArr);
    }

    public static Object invokeMethod(Object obj, String str, Object[] objArr) throws Exception {
        Class<?> cls = obj.getClass();
        Class[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return cls.getMethod(str, clsArr).invoke(obj, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Object[] objArr) throws Exception {
        Class<?> cls = Class.forName(str);
        Class[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return cls.getMethod(str2, clsArr).invoke(null, objArr);
    }

    public static void invokeVoidMethod(Object obj, String str, boolean z) {
        try {
            obj.getClass().getMethod(str, new Class[]{Boolean.TYPE}).invoke(obj, new Object[]{Boolean.valueOf(z)});
        } catch (SecurityException unused) {
        } catch (NoSuchMethodException unused2) {
        } catch (IllegalArgumentException unused3) {
        } catch (IllegalAccessException unused4) {
        } catch (InvocationTargetException unused5) {
        }
    }

    public static Object invokeMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object invokeStaticMethod(Class cls, String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            return cls.getMethod(str, clsArr).invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Object invokeParamsMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Method method = obj.getClass().getMethod(str, clsArr);
        method.setAccessible(true);
        return method.invoke(obj, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object[] objArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }
}
