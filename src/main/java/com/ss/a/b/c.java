package com.ss.a.b;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f2378a;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f2379a;

        /* renamed from: b  reason: collision with root package name */
        public final T f2380b;
    }

    static {
        HashMap hashMap = new HashMap();
        f2378a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f2378a.put(Byte.class, Byte.TYPE);
        f2378a.put(Character.class, Character.TYPE);
        f2378a.put(Short.class, Short.TYPE);
        f2378a.put(Integer.class, Integer.TYPE);
        f2378a.put(Float.class, Float.TYPE);
        f2378a.put(Long.class, Long.TYPE);
        f2378a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f2378a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f2378a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f2378a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f2378a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f2378a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f2378a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f2378a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f2378a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    static Method a(Class<?> cls, String str, Class... clsArr) {
        while (true) {
            Method a2 = a(r1.getDeclaredMethods(), str, (Class<?>[]) clsArr);
            Class<?> cls2 = cls;
            if (a2 != null) {
                a2.setAccessible(true);
                return a2;
            } else if (cls2.getSuperclass() != null) {
                cls2 = cls2.getSuperclass();
            } else {
                throw new NoSuchMethodException();
            }
        }
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f2378a.containsKey(clsArr[i]) || !f2378a.get(clsArr[i]).equals(f2378a.get(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }
}
