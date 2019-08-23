package com.bytedance.crash.nativecrash;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f19490a;

    /* renamed from: com.bytedance.crash.nativecrash.a$a  reason: collision with other inner class name */
    public static class C0153a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f19491a;

        /* renamed from: b  reason: collision with root package name */
        public final T f19492b;
    }

    static {
        HashMap hashMap = new HashMap();
        f19490a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f19490a.put(Byte.class, Byte.TYPE);
        f19490a.put(Character.class, Character.TYPE);
        f19490a.put(Short.class, Short.TYPE);
        f19490a.put(Integer.class, Integer.TYPE);
        f19490a.put(Float.class, Float.TYPE);
        f19490a.put(Long.class, Long.TYPE);
        f19490a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f19490a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f19490a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f19490a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f19490a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f19490a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f19490a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f19490a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f19490a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (clsArr2 == null || clsArr2.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr2 == null) {
            if (clsArr.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f19490a.containsKey(clsArr[i]) || !f19490a.get(clsArr[i]).equals(f19490a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a2 = a(r1.getDeclaredMethods(), str, clsArr);
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

    public static <T> T a(String str, String str2, Object... objArr) {
        Class[] clsArr;
        Object[] objArr2;
        Class cls;
        try {
            Class<?> cls2 = Class.forName(str);
            if (objArr == null || objArr.length <= 0) {
                clsArr = null;
            } else {
                clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    C0153a aVar = objArr[i];
                    if (aVar != null && (aVar instanceof C0153a)) {
                        cls = aVar.f19491a;
                    } else if (aVar == null) {
                        cls = null;
                    } else {
                        cls = aVar.getClass();
                    }
                    clsArr[i] = cls;
                }
            }
            Method a2 = a(cls2, str2, (Class<?>[]) clsArr);
            if (objArr == null || objArr.length <= 0) {
                objArr2 = null;
            } else {
                objArr2 = new Object[objArr.length];
                for (int i2 = 0; i2 < objArr.length; i2++) {
                    C0153a aVar2 = objArr[i2];
                    if (aVar2 == null || !(aVar2 instanceof C0153a)) {
                        objArr2[i2] = aVar2;
                    } else {
                        objArr2[i2] = aVar2.f19492b;
                    }
                }
            }
            return a2.invoke(null, objArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
