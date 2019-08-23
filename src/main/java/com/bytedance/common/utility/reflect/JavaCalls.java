package com.bytedance.common.utility.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class JavaCalls {
    private static final Map<Class<?>, Class<?>> PRIMITIVE_MAP;

    public static class JavaParam<T> {
        public final Class<? extends T> clazz;
        public final T obj;

        public JavaParam(Class<? extends T> cls, T t) {
            this.clazz = cls;
            this.obj = t;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        PRIMITIVE_MAP = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        PRIMITIVE_MAP.put(Byte.class, Byte.TYPE);
        PRIMITIVE_MAP.put(Character.class, Character.TYPE);
        PRIMITIVE_MAP.put(Short.class, Short.TYPE);
        PRIMITIVE_MAP.put(Integer.class, Integer.TYPE);
        PRIMITIVE_MAP.put(Float.class, Float.TYPE);
        PRIMITIVE_MAP.put(Long.class, Long.TYPE);
        PRIMITIVE_MAP.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = PRIMITIVE_MAP;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = PRIMITIVE_MAP;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = PRIMITIVE_MAP;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = PRIMITIVE_MAP;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = PRIMITIVE_MAP;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = PRIMITIVE_MAP;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = PRIMITIVE_MAP;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = PRIMITIVE_MAP;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    public static <T> T newEmptyInstance(Class<?> cls) {
        try {
            return newEmptyInstanceOrThrow(cls);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Class<?>[] getParameterTypes(Object... objArr) {
        Class cls;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            JavaParam javaParam = objArr[i];
            if (javaParam != null && (javaParam instanceof JavaParam)) {
                cls = javaParam.clazz;
            } else if (javaParam == null) {
                cls = null;
            } else {
                cls = javaParam.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    private static Object[] getParameters(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            JavaParam javaParam = objArr[i];
            if (javaParam == null || !(javaParam instanceof JavaParam)) {
                objArr2[i] = javaParam;
            } else {
                objArr2[i] = javaParam.obj;
            }
        }
        return objArr2;
    }

    public static <T> T newEmptyInstanceOrThrow(Class<?> cls) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        if (declaredConstructors == null || declaredConstructors.length == 0) {
            throw new IllegalArgumentException("Can't get even one available constructor for " + cls);
        }
        Constructor constructor = declaredConstructors[0];
        constructor.setAccessible(true);
        Class[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes == null || parameterTypes.length == 0) {
            return constructor.newInstance(new Object[0]);
        }
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            objArr[i] = getDefaultValue(parameterTypes[i]);
        }
        return constructor.newInstance(objArr);
    }

    private static Object getDefaultValue(Class<?> cls) {
        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls) || Byte.TYPE.equals(cls) || Byte.class.equals(cls) || Short.TYPE.equals(cls) || Short.class.equals(cls) || Long.TYPE.equals(cls) || Long.class.equals(cls) || Double.TYPE.equals(cls) || Double.class.equals(cls) || Float.TYPE.equals(cls) || Float.class.equals(cls)) {
            return 0;
        }
        if (Boolean.TYPE.equals(cls) || Boolean.class.equals(cls)) {
            return Boolean.FALSE;
        }
        if (Character.TYPE.equals(cls) || Character.class.equals(cls)) {
            return 0;
        }
        return null;
    }

    public static <T> T getField(Object obj, String str) {
        try {
            return getFieldOrThrow(obj, str);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    public static <T> T newInstance(Class<?> cls, Object... objArr) {
        try {
            return newInstanceOrThrow(cls, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object newInstance(String str, Object... objArr) {
        try {
            return newInstanceOrThrow(str, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object newInstanceOrThrow(String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return newInstanceOrThrow(Class.forName(str), getParameters(objArr));
    }

    public static <T> T newInstanceOrThrow(Class<?> cls, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return cls.getConstructor(getParameterTypes(objArr)).newInstance(getParameters(objArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0019 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T getFieldOrThrow(java.lang.Object r4, java.lang.String r5) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        /*
            java.lang.Class r0 = r4.getClass()
            r1 = 0
        L_0x0005:
            r2 = 1
            if (r1 != 0) goto L_0x001f
            java.lang.reflect.Field r3 = r0.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x0012 }
            r3.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x0011 }
            r1 = r3
            goto L_0x0016
        L_0x0011:
            r1 = r3
        L_0x0012:
            java.lang.Class r0 = r0.getSuperclass()
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            java.lang.NoSuchFieldException r4 = new java.lang.NoSuchFieldException
            r4.<init>()
            throw r4
        L_0x001f:
            r1.setAccessible(r2)
            java.lang.Object r4 = r1.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.JavaCalls.getFieldOrThrow(java.lang.Object, java.lang.String):java.lang.Object");
    }

    private static boolean compareClassLists(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!PRIMITIVE_MAP.containsKey(clsArr[i]) || !PRIMITIVE_MAP.get(clsArr[i]).equals(PRIMITIVE_MAP.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static <T> T callMethod(Object obj, String str, Object... objArr) {
        try {
            return callMethodOrThrow(obj, str, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setField(Object obj, String str, Object obj2) {
        try {
            setFieldOrThrow(obj, str, obj2);
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    public static <T> T callStaticMethod(String str, String str2, Object... objArr) {
        try {
            return callStaticMethodOrThrow(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T callMethodOrThrow(Object obj, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return getDeclaredMethod(obj.getClass(), str, getParameterTypes(objArr)).invoke(obj, getParameters(objArr));
    }

    public static <T> T callStaticMethodOrThrow(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return getDeclaredMethod(cls, str, getParameterTypes(objArr)).invoke(null, getParameters(objArr));
    }

    private static Method getDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method findMethodByName = findMethodByName(r1.getDeclaredMethods(), str, clsArr);
            Class<?> cls2 = cls;
            if (findMethodByName != null) {
                findMethodByName.setAccessible(true);
                return findMethodByName;
            } else if (cls2.getSuperclass() != null) {
                cls2 = cls2.getSuperclass();
            } else {
                throw new NoSuchMethodException();
            }
        }
    }

    public static <T> T callStaticMethodOrThrow(String str, String str2, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        return getDeclaredMethod(Class.forName(str), str2, getParameterTypes(objArr)).invoke(null, getParameters(objArr));
    }

    private static Method findMethodByName(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && compareClassLists(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    public static void setFieldOrThrow(Object obj, String str, Object obj2) throws NoSuchFieldException, IllegalAccessException {
        Class cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        field.set(obj, obj2);
    }
}
