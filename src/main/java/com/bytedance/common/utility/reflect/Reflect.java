package com.bytedance.common.utility.reflect;

import android.annotation.SuppressLint;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Reflect {
    private final boolean isClass;
    public final Object object;

    public static class NULL {
    }

    public <T> T get() {
        return this.object;
    }

    public Reflect create() throws ReflectException {
        return create(new Object[0]);
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        if (this.isClass) {
            return (Class) this.object;
        }
        return this.object.getClass();
    }

    public Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class type = type();
        do {
            for (Field field : type.getDeclaredFields()) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name, new Class[0]));
                    }
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        return linkedHashMap;
    }

    private Reflect(Object obj) {
        this.object = obj;
    }

    public static Reflect on(Class<?> cls) {
        return new Reflect(cls);
    }

    private Reflect(Class<?> cls) {
        this.object = cls;
        this.isClass = true;
    }

    private static Class<?> forName(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            throw new ReflectException((Throwable) e2);
        }
    }

    public static Reflect on(Object obj) {
        return new Reflect(obj);
    }

    private static Object unwrap(Object obj) {
        if (obj instanceof Reflect) {
            return ((Reflect) obj).get();
        }
        return obj;
    }

    public Reflect call(String str) throws ReflectException {
        return call(str, null, new Object[0]);
    }

    public static Reflect on(String str) throws ReflectException {
        return on(forName(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?>[] types(java.lang.Object... r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0006
            java.lang.Class[] r3 = new java.lang.Class[r0]
            return r3
        L_0x0006:
            int r1 = r3.length
            java.lang.Class[] r1 = new java.lang.Class[r1]
        L_0x0009:
            int r2 = r3.length
            if (r0 >= r2) goto L_0x001c
            r2 = r3[r0]
            if (r2 != 0) goto L_0x0013
            java.lang.Class<com.bytedance.common.utility.reflect.Reflect$NULL> r2 = com.bytedance.common.utility.reflect.Reflect.NULL.class
            goto L_0x0017
        L_0x0013:
            java.lang.Class r2 = r2.getClass()
        L_0x0017:
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x0009
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.Reflect.types(java.lang.Object[]):java.lang.Class[]");
    }

    public <P> P as(Class<P> cls) {
        final boolean z = this.object instanceof Map;
        AnonymousClass1 r1 = new InvocationHandler() {
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                int i;
                String name = method.getName();
                try {
                    return Reflect.on(Reflect.this.object).call(name, Reflect.types(objArr), objArr).get();
                } catch (ReflectException e2) {
                    if (z) {
                        Map map = (Map) Reflect.this.object;
                        if (objArr == null) {
                            i = 0;
                        } else {
                            i = objArr.length;
                        }
                        if (i == 0 && name.startsWith("get")) {
                            return map.get(Reflect.property(name.substring(3)));
                        }
                        if (i == 0 && name.startsWith("is")) {
                            return map.get(Reflect.property(name.substring(2)));
                        }
                        if (i == 1 && name.startsWith("set")) {
                            map.put(Reflect.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e2;
                }
            }
        };
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, r1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public static <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    @SuppressLint({"DefaultLocale"})
    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public Reflect create(Object... objArr) throws ReflectException {
        Class[] types = types(objArr);
        try {
            return on(type().getDeclaredConstructor(types), objArr);
        } catch (NoSuchMethodException e2) {
            for (Constructor constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), types)) {
                    return on(constructor, objArr);
                }
            }
            throw new ReflectException((Throwable) e2);
        }
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
        }
        return cls;
    }

    public Field exactField(String str, Class<?>... clsArr) throws ReflectException {
        return field0(str, clsArr);
    }

    public <T> T get(String str, Class<?>... clsArr) throws ReflectException {
        return field(str, clsArr).get();
    }

    public Reflect field(String str, Class<?>... clsArr) throws ReflectException {
        try {
            return on(field0(str, clsArr).get(this.object));
        } catch (Exception e2) {
            throw new ReflectException((Throwable) e2);
        }
    }

    public Reflect set(String str, Object obj) throws ReflectException {
        try {
            field0(str, new Class[0]).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e2) {
            throw new ReflectException((Throwable) e2);
        }
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != NULL.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    private static Reflect on(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e2) {
            throw new ReflectException((Throwable) e2);
        }
    }

    private Field field0(String str, Class<?>... clsArr) throws ReflectException {
        Class type = type();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return type.getField(str);
            } catch (NoSuchFieldException e2) {
                do {
                    try {
                        return (Field) accessible(type.getDeclaredField(str));
                    } catch (NoSuchFieldException unused) {
                        type = type.getSuperclass();
                        if (type != null) {
                            throw new ReflectException((Throwable) e2);
                        }
                    }
                } while (type != null);
                throw new ReflectException((Throwable) e2);
            }
        } else {
            do {
                try {
                    for (Field field : type.getDeclaredFields()) {
                        Class<?> type2 = field.getType();
                        if (type2 != null && type2.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) accessible(field);
                        }
                    }
                } catch (Exception unused2) {
                }
                type = type.getSuperclass();
            } while (type != null);
            throw new ReflectException("NoSuchFieldException");
        }
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class type = type();
        for (Method method : type.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : type.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + type() + ClassUtils.PACKAGE_SEPARATOR);
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !match(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return on(similarMethod(r3, r4), r2.object, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.bytedance.common.utility.reflect.ReflectException((java.lang.Throwable) r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.common.utility.reflect.Reflect call(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) throws com.bytedance.common.utility.reflect.ReflectException {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.exactMethod(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r2.object     // Catch:{ NoSuchMethodException -> 0x000b }
            com.bytedance.common.utility.reflect.Reflect r0 = on(r0, r1, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r0
        L_0x000b:
            java.lang.reflect.Method r3 = r2.similarMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r4 = r2.object     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.bytedance.common.utility.reflect.Reflect r3 = on(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r3
        L_0x0016:
            r3 = move-exception
            com.bytedance.common.utility.reflect.ReflectException r4 = new com.bytedance.common.utility.reflect.ReflectException
            r4.<init>((java.lang.Throwable) r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.Reflect.call(java.lang.String, java.lang.Class[], java.lang.Object[]):com.bytedance.common.utility.reflect.Reflect");
    }

    private static Reflect on(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            accessible(method);
            if (method.getReturnType() != Void.TYPE) {
                return on(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return on(obj);
        } catch (Exception e2) {
            throw new ReflectException((Throwable) e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r8 = type().getMethods();
        r0 = r8.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1 < r0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2 = r8[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r6.equals(r2.getName()) != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3 = r2.getParameterTypes();
        com.bytedance.common.utility.Logger.debug();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        return r8.getDeclaredMethod(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r8 = r8.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r8 != null) goto L_0x0009;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method exactMethod(java.lang.String r6, java.lang.Class<?>[] r7, java.lang.Object... r8) throws java.lang.NoSuchMethodException {
        /*
            r5 = this;
            java.lang.Class r8 = r5.type()
            java.lang.reflect.Method r0 = r8.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0009 }
            return r0
        L_0x0009:
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x000e }
            return r0
        L_0x000e:
            java.lang.Class r8 = r8.getSuperclass()
            if (r8 != 0) goto L_0x0009
            java.lang.Class r8 = r5.type()
            java.lang.reflect.Method[] r8 = r8.getMethods()
            int r0 = r8.length
            r1 = 0
        L_0x001e:
            if (r1 >= r0) goto L_0x003d
            r2 = r8[r1]
            java.lang.String r3 = r2.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x003a
            java.lang.Class[] r3 = r2.getParameterTypes()
            com.bytedance.common.utility.Logger.debug()
            if (r3 == 0) goto L_0x003a
            int r3 = r3.length
            int r4 = r7.length
            if (r3 != r4) goto L_0x003a
            return r2
        L_0x003a:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x003d:
            java.lang.NoSuchMethodException r6 = new java.lang.NoSuchMethodException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.Reflect.exactMethod(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }
}