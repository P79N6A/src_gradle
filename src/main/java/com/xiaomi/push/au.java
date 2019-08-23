package com.xiaomi.push;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class au {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f81843a;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f81844a;

        /* renamed from: a  reason: collision with other field name */
        public final T f161a;
    }

    static {
        HashMap hashMap = new HashMap();
        f81843a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f81843a.put(Byte.class, Byte.TYPE);
        f81843a.put(Character.class, Character.TYPE);
        f81843a.put(Short.class, Short.TYPE);
        f81843a.put(Integer.class, Integer.TYPE);
        f81843a.put(Float.class, Float.TYPE);
        f81843a.put(Long.class, Long.TYPE);
        f81843a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f81843a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f81843a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f81843a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f81843a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f81843a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f81843a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f81843a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f81843a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0015 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T a(java.lang.Class<? extends java.lang.Object> r3, java.lang.Object r4, java.lang.String r5) {
        /*
            r0 = 0
        L_0x0001:
            r1 = 1
            if (r0 != 0) goto L_0x001b
            java.lang.reflect.Field r2 = r3.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x000e }
            r2.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x000d }
            r0 = r2
            goto L_0x0012
        L_0x000d:
            r0 = r2
        L_0x000e:
            java.lang.Class r3 = r3.getSuperclass()
        L_0x0012:
            if (r3 == 0) goto L_0x0015
            goto L_0x0001
        L_0x0015:
            java.lang.NoSuchFieldException r3 = new java.lang.NoSuchFieldException
            r3.<init>()
            throw r3
        L_0x001b:
            r0.setAccessible(r1)
            java.lang.Object r3 = r0.get(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.au.a(java.lang.Class, java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static <T> T a(Class<? extends Object> cls, String str) {
        try {
            return a((Class) cls, (Object) null, str);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) {
        return a(cls, str, (Class<?>[]) a(objArr)).invoke(null, a(objArr));
    }

    public static <T> T a(Object obj, String str) {
        try {
            return a((Class) obj.getClass(), obj, str);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    public static <T> T a(Object obj, String str, Object... objArr) {
        try {
            return b(obj, str, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(String str, String str2) {
        try {
            return a((Class) Class.forName(str), (Object) null, str2);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a2 = a(cls.getDeclaredMethods(), str, clsArr);
        if (a2 != null) {
            a2.setAccessible(true);
            return a2;
        } else if (cls.getSuperclass() != null) {
            return a(cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && a((Class<?>[]) method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (!(clsArr2 == null || clsArr2.length == 0)) {
                return false;
            }
        } else if (clsArr2 == null) {
            if (clsArr.length != 0) {
                return false;
            }
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (clsArr2[i] != null && !clsArr[i].isAssignableFrom(clsArr2[i]) && (!f81843a.containsKey(clsArr[i]) || !f81843a.get(clsArr[i]).equals(f81843a.get(clsArr2[i])))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof a)) {
                clsArr[i] = aVar == null ? null : aVar.getClass();
            } else {
                clsArr[i] = aVar.f81844a;
            }
        }
        return clsArr;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static Object[] m89a(Object... objArr) {
        Object[] objArr2 = null;
        if (objArr != null && objArr.length > 0) {
            objArr2 = new Object[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                a aVar = objArr[i];
                if (aVar == null || !(aVar instanceof a)) {
                    objArr2[i] = aVar;
                } else {
                    objArr2[i] = aVar.f161a;
                }
            }
        }
        return objArr2;
    }

    public static <T> T b(Object obj, String str, Object... objArr) {
        return a(obj.getClass(), str, (Class<?>[]) a(objArr)).invoke(obj, a(objArr));
    }
}
