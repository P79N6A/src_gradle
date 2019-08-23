package com.taobao.android.dexposed;

import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.WeakHashMap;

public class XposedHelpers {
    private static final WeakHashMap<Object, HashMap<String, Object>> additionalFields = new WeakHashMap<>();
    private static final HashMap<String, Constructor<?>> constructorCache = new HashMap<>();
    private static final HashMap<String, Field> fieldCache = new HashMap<>();
    private static final HashMap<String, Method> methodCache = new HashMap<>();

    public static class ClassNotFoundError extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        public ClassNotFoundError(Throwable th) {
            super(th);
        }

        public ClassNotFoundError(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class InvocationTargetError extends Error {
        private static final long serialVersionUID = -1070936889459514628L;

        public InvocationTargetError(Throwable th) {
            super(th);
        }

        public InvocationTargetError(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Class<?>[] getClassesAsArray(Class<?>... clsArr) {
        return clsArr;
    }

    public static Object getSurroundingThis(Object obj) {
        return getObjectField(obj, "this$0");
    }

    public static Class<?>[] getParameterTypes(Object... objArr) {
        Class<?> cls;
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] != null) {
                cls = objArr[i].getClass();
            } else {
                cls = null;
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    public static String getMD5Sum(String str) throws IOException {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return new BigInteger(1, instance.digest()).toString(16);
                }
            }
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static String getParametersString(Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("(");
        boolean z = true;
        for (Class<?> cls : clsArr) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            if (cls != null) {
                sb.append(cls.getCanonicalName());
            } else {
                sb.append("null");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public static Object getAdditionalStaticField(Class<?> cls, String str) {
        return getAdditionalInstanceField(cls, str);
    }

    public static Object removeAdditionalStaticField(Class<?> cls, String str) {
        return removeAdditionalInstanceField(cls, str);
    }

    public static Constructor<?> findConstructorBestMatch(Class<?> cls, Object... objArr) {
        return findConstructorBestMatch(cls, (Class<?>[]) getParameterTypes(objArr));
    }

    public static Object getAdditionalStaticField(Object obj, String str) {
        return getAdditionalInstanceField(obj.getClass(), str);
    }

    public static Object removeAdditionalStaticField(Object obj, String str) {
        return removeAdditionalInstanceField(obj.getClass(), str);
    }

    public static Class<?> findClass(String str, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = DexposedBridge.BOOTCLASSLOADER;
        }
        try {
            return ClassUtils.getClass(classLoader, str, false);
        } catch (ClassNotFoundException e2) {
            throw new ClassNotFoundError(e2);
        }
    }

    private static Field findFieldRecursiveImpl(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Class<?> cls2 = cls;
            while (true) {
                Class<? super T> superclass = cls2.getSuperclass();
                if (superclass == null || superclass.equals(Object.class)) {
                    throw e2;
                }
                try {
                    return superclass.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                    cls2 = superclass;
                }
            }
            throw e2;
        }
    }

    public static boolean getBooleanField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getBoolean(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static byte getByteField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getByte(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static char getCharField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getChar(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static double getDoubleField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getDouble(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static float getFloatField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getFloat(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static int getIntField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getInt(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static long getLongField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getLong(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static Object getObjectField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static short getShortField(Object obj, String str) {
        try {
            return findField(obj.getClass(), str).getShort(obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static boolean getStaticBooleanField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getBoolean(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static byte getStaticByteField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getByte(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static char getStaticCharField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getChar(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static double getStaticDoubleField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getDouble(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static float getStaticFloatField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getFloat(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static int getStaticIntField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getInt(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static long getStaticLongField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getLong(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static Object getStaticObjectField(Class<?> cls, String str) {
        try {
            return findField(cls, str).get(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static short getStaticShortField(Class<?> cls, String str) {
        try {
            return findField(cls, str).getShort(null);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static byte[] assetAsByteArray(Resources resources, String str) throws IOException {
        InputStream open = resources.getAssets().open(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                open.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Object getAdditionalInstanceField(Object obj, String str) {
        Object obj2;
        if (obj == null) {
            throw new NullPointerException("object must not be null");
        } else if (str != null) {
            synchronized (additionalFields) {
                HashMap hashMap = additionalFields.get(obj);
                if (hashMap == null) {
                    return null;
                }
                synchronized (hashMap) {
                    obj2 = hashMap.get(str);
                }
                return obj2;
            }
        } else {
            throw new NullPointerException("key must not be null");
        }
    }

    public static Object removeAdditionalInstanceField(Object obj, String str) {
        Object remove;
        if (obj == null) {
            throw new NullPointerException("object must not be null");
        } else if (str != null) {
            synchronized (additionalFields) {
                HashMap hashMap = additionalFields.get(obj);
                if (hashMap == null) {
                    return null;
                }
                synchronized (hashMap) {
                    remove = hashMap.remove(str);
                }
                return remove;
            }
        } else {
            throw new NullPointerException("key must not be null");
        }
    }

    public static Constructor<?> findConstructorBestMatch(Class<?> cls, Class<?>... clsArr) {
        String str = cls.getName() + getParametersString(clsArr) + "#bestmatch";
        if (constructorCache.containsKey(str)) {
            Constructor<?> constructor = constructorCache.get(str);
            if (constructor != null) {
                return constructor;
            }
            throw new NoSuchMethodError(str);
        }
        try {
            Constructor<?> findConstructorExact = findConstructorExact(cls, clsArr);
            constructorCache.put(str, findConstructorExact);
            return findConstructorExact;
        } catch (NoSuchMethodError unused) {
            cls.getDeclaredConstructors();
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError(str);
            constructorCache.put(str, null);
            throw noSuchMethodError;
        }
    }

    public static Constructor<?> findConstructorExact(Class<?> cls, Class<?>... clsArr) {
        String str = cls.getName() + getParametersString(clsArr) + "#exact";
        if (constructorCache.containsKey(str)) {
            Constructor<?> constructor = constructorCache.get(str);
            if (constructor != null) {
                return constructor;
            }
            throw new NoSuchMethodError(str);
        }
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            constructorCache.put(str, declaredConstructor);
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            constructorCache.put(str, null);
            throw new NoSuchMethodError(str);
        }
    }

    public static Field findField(Class<?> cls, String str) {
        String str2 = cls.getName() + '#' + str;
        if (fieldCache.containsKey(str2)) {
            Field field = fieldCache.get(str2);
            if (field != null) {
                return field;
            }
            throw new NoSuchFieldError(str2);
        }
        try {
            Field findFieldRecursiveImpl = findFieldRecursiveImpl(cls, str);
            findFieldRecursiveImpl.setAccessible(true);
            fieldCache.put(str2, findFieldRecursiveImpl);
            return findFieldRecursiveImpl;
        } catch (NoSuchFieldException unused) {
            fieldCache.put(str2, null);
            throw new NoSuchFieldError(str2);
        }
    }

    public static Field findFirstFieldByExactType(Class<?> cls, Class<?> cls2) {
        Class cls3 = cls;
        do {
            for (Field field : cls3.getDeclaredFields()) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            cls3 = cls3.getSuperclass();
        } while (cls3 != null);
        throw new NoSuchFieldError("Field of type " + cls2.getName() + " in class " + cls.getName());
    }

    public static Object newInstance(Class<?> cls, Object... objArr) {
        try {
            return findConstructorBestMatch(cls, objArr).newInstance(objArr);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new InvocationTargetError(e4.getCause());
        } catch (InstantiationException e5) {
            throw new InstantiationError(e5.getMessage());
        }
    }

    public static Object setAdditionalStaticField(Class<?> cls, String str, Object obj) {
        return setAdditionalInstanceField(cls, str, obj);
    }

    public static Method findMethodBestMatch(Class<?> cls, String str, Object... objArr) {
        return findMethodBestMatch(cls, str, (Class<?>[]) getParameterTypes(objArr));
    }

    public static Object setAdditionalStaticField(Object obj, String str, Object obj2) {
        return setAdditionalInstanceField(obj.getClass(), str, obj2);
    }

    public static Constructor<?> findConstructorBestMatch(Class<?> cls, Class<?>[] clsArr, Object[] objArr) {
        Class<?>[] clsArr2 = null;
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i] == null) {
                if (clsArr2 == null) {
                    clsArr2 = getParameterTypes(objArr);
                }
                clsArr[i] = clsArr2[i];
            }
        }
        return findConstructorBestMatch(cls, clsArr);
    }

    public static void setBooleanField(Object obj, String str, boolean z) {
        try {
            findField(obj.getClass(), str).setBoolean(obj, z);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setByteField(Object obj, String str, byte b2) {
        try {
            findField(obj.getClass(), str).setByte(obj, b2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setCharField(Object obj, String str, char c2) {
        try {
            findField(obj.getClass(), str).setChar(obj, c2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setDoubleField(Object obj, String str, double d2) {
        try {
            findField(obj.getClass(), str).setDouble(obj, d2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setFloatField(Object obj, String str, float f2) {
        try {
            findField(obj.getClass(), str).setFloat(obj, f2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setIntField(Object obj, String str, int i) {
        try {
            findField(obj.getClass(), str).setInt(obj, i);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setLongField(Object obj, String str, long j) {
        try {
            findField(obj.getClass(), str).setLong(obj, j);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setObjectField(Object obj, String str, Object obj2) {
        try {
            findField(obj.getClass(), str).set(obj, obj2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setShortField(Object obj, String str, short s) {
        try {
            findField(obj.getClass(), str).setShort(obj, s);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticBooleanField(Class<?> cls, String str, boolean z) {
        try {
            findField(cls, str).setBoolean(null, z);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticByteField(Class<?> cls, String str, byte b2) {
        try {
            findField(cls, str).setByte(null, b2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticCharField(Class<?> cls, String str, char c2) {
        try {
            findField(cls, str).setChar(null, c2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticDoubleField(Class<?> cls, String str, double d2) {
        try {
            findField(cls, str).setDouble(null, d2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticFloatField(Class<?> cls, String str, float f2) {
        try {
            findField(cls, str).setFloat(null, f2);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticIntField(Class<?> cls, String str, int i) {
        try {
            findField(cls, str).setInt(null, i);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticLongField(Class<?> cls, String str, long j) {
        try {
            findField(cls, str).setLong(null, j);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticObjectField(Class<?> cls, String str, Object obj) {
        try {
            findField(cls, str).set(null, obj);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static void setStaticShortField(Class<?> cls, String str, short s) {
        try {
            findField(cls, str).setShort(null, s);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        }
    }

    public static Object newInstance(Class<?> cls, Class<?>[] clsArr, Object... objArr) {
        try {
            return findConstructorBestMatch(cls, clsArr, objArr).newInstance(objArr);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new InvocationTargetError(e4.getCause());
        } catch (InstantiationException e5) {
            throw new InstantiationError(e5.getMessage());
        }
    }

    public static Object setAdditionalInstanceField(Object obj, String str, Object obj2) {
        HashMap hashMap;
        Object put;
        if (obj == null) {
            throw new NullPointerException("object must not be null");
        } else if (str != null) {
            synchronized (additionalFields) {
                hashMap = additionalFields.get(obj);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    additionalFields.put(obj, hashMap);
                }
            }
            synchronized (hashMap) {
                put = hashMap.put(str, obj2);
            }
            return put;
        } else {
            throw new NullPointerException("key must not be null");
        }
    }

    public static Object callMethod(Object obj, String str, Object... objArr) {
        try {
            return findMethodBestMatch(obj.getClass(), str, objArr).invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new InvocationTargetError(e4.getCause());
        }
    }

    public static Object callStaticMethod(Class<?> cls, String str, Object... objArr) {
        try {
            return findMethodBestMatch(cls, str, objArr).invoke(null, objArr);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new InvocationTargetError(e4.getCause());
        }
    }

    public static Method findMethodBestMatch(Class<?> cls, String str, Class<?>... clsArr) {
        String str2 = cls.getName() + '#' + str + getParametersString(clsArr) + "#bestmatch";
        if (methodCache.containsKey(str2)) {
            Method method = methodCache.get(str2);
            if (method != null) {
                return method;
            }
            throw new NoSuchMethodError(str2);
        }
        try {
            Method findMethodExact = findMethodExact(cls, str, clsArr);
            methodCache.put(str2, findMethodExact);
            return findMethodExact;
        } catch (NoSuchMethodError unused) {
            boolean z = true;
            Class<?> cls2 = cls;
            while (true) {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (!z) {
                        Modifier.isPrivate(method2.getModifiers());
                    }
                }
                Class<? super T> superclass = cls2.getSuperclass();
                if (superclass != null) {
                    z = false;
                    cls2 = superclass;
                } else {
                    NoSuchMethodError noSuchMethodError = new NoSuchMethodError(str2);
                    methodCache.put(str2, null);
                    throw noSuchMethodError;
                }
            }
        }
    }

    public static Method findMethodExact(Class<?> cls, String str, Class<?>... clsArr) {
        String str2 = cls.getName() + '#' + str + getParametersString(clsArr) + "#exact";
        if (methodCache.containsKey(str2)) {
            Method method = methodCache.get(str2);
            if (method != null) {
                return method;
            }
            throw new NoSuchMethodError(str2);
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            methodCache.put(str2, declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            methodCache.put(str2, null);
            throw new NoSuchMethodError(str2);
        }
    }

    public static Method[] findMethodsByExactParameters(Class<?> cls, Class<?> cls2, Class<?>... clsArr) {
        boolean z;
        LinkedList linkedList = new LinkedList();
        for (Method method : cls.getDeclaredMethods()) {
            if (cls2 == null || cls2 == method.getReturnType()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (clsArr.length == parameterTypes.length) {
                    int i = 0;
                    while (true) {
                        if (i >= clsArr.length) {
                            z = true;
                            break;
                        } else if (clsArr[i] != parameterTypes[i]) {
                            z = false;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        method.setAccessible(true);
                        linkedList.add(method);
                    }
                }
            }
        }
        return (Method[]) linkedList.toArray(new Method[linkedList.size()]);
    }

    public static Method findMethodExact(Class<?> cls, String str, Object... objArr) {
        int length = objArr.length - 1;
        Class[] clsArr = null;
        while (length >= 0) {
            String str2 = objArr[length];
            if (str2 != null) {
                if (!(str2 instanceof XC_MethodHook)) {
                    if (clsArr == null) {
                        clsArr = new Class[(length + 1)];
                    }
                    if (str2 instanceof Class) {
                        clsArr[length] = (Class) str2;
                    } else if (str2 instanceof String) {
                        clsArr[length] = findClass(str2, cls.getClassLoader());
                    } else {
                        throw new ClassNotFoundError("parameter type must either be specified as Class or String", null);
                    }
                }
                length--;
            } else {
                throw new ClassNotFoundError("parameter type must not be null", null);
            }
        }
        if (clsArr == null) {
            clsArr = new Class[0];
        }
        return findMethodExact(cls, str, (Class<?>[]) clsArr);
    }

    public static Method findMethodExact(String str, ClassLoader classLoader, String str2, Object... objArr) {
        return findMethodExact(findClass(str, classLoader), str2, objArr);
    }

    public static Method findMethodBestMatch(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?>[] clsArr2 = null;
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i] == null) {
                if (clsArr2 == null) {
                    clsArr2 = getParameterTypes(objArr);
                }
                clsArr[i] = clsArr2[i];
            }
        }
        return findMethodBestMatch(cls, str, clsArr);
    }

    public static Object callMethod(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return findMethodBestMatch(obj.getClass(), str, clsArr, objArr).invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new InvocationTargetError(e4.getCause());
        }
    }

    public static Object callStaticMethod(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return findMethodBestMatch(cls, str, clsArr, objArr).invoke(null, objArr);
        } catch (IllegalAccessException e2) {
            DexposedBridge.log((Throwable) e2);
            throw new IllegalAccessError(e2.getMessage());
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (InvocationTargetException e4) {
            throw new InvocationTargetError(e4.getCause());
        }
    }
}
