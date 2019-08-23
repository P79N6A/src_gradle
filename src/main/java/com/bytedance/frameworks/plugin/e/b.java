package com.bytedance.frameworks.plugin.e;

import com.bytedance.frameworks.plugin.f.e;
import com.bytedance.frameworks.plugin.f.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Method> f2249a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Class<?>, Class<?>> f2250b;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f2250b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        f2250b.put(Byte.TYPE, Byte.class);
        f2250b.put(Character.TYPE, Character.class);
        f2250b.put(Short.TYPE, Short.class);
        f2250b.put(Integer.TYPE, Integer.class);
        f2250b.put(Long.TYPE, Long.class);
        f2250b.put(Double.TYPE, Double.class);
        f2250b.put(Float.TYPE, Float.class);
        f2250b.put(Void.TYPE, Void.class);
    }

    private static <T> Constructor<T> a(Class<T> cls, Class<?>... clsArr) {
        try {
            Constructor<T> declaredConstructor = ((Class) j.a(cls, "class cannot be null")).getDeclaredConstructor(clsArr);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Object a(Class cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] b2 = e.b(objArr);
        return a(cls, str, b2, (Class<?>[]) e.a(b2));
    }

    public static <T> T a(Class<T> cls, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object[] b2 = e.b(objArr);
        Constructor<T> a2 = a(cls, e.a(clsArr));
        if (a2 != null) {
            return a2.newInstance(b2);
        }
        return null;
    }

    public static Object a(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] b2 = e.b(objArr);
        return a(obj, str, b2, (Class<?>[]) e.a(b2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe A[LOOP:1: B:18:0x0069->B:76:0x00fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00e0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method a(java.lang.Class<?> r17, java.lang.String r18, java.lang.Class<?>... r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "The class must not be null"
            r3 = r17
            com.bytedance.frameworks.plugin.f.j.a(r3, (java.lang.String) r2)
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            r4 = 1
            r2 = r2 ^ r4
            java.lang.String r5 = "The method name must not be blank"
            com.bytedance.frameworks.plugin.f.j.a((boolean) r2, (java.lang.String) r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r17.toString()
            r2.append(r5)
            java.lang.String r5 = "#"
            r2.append(r5)
            r2.append(r0)
            if (r1 == 0) goto L_0x0044
            int r6 = r1.length
            if (r6 <= 0) goto L_0x0044
            int r6 = r1.length
            r7 = 0
        L_0x0031:
            if (r7 >= r6) goto L_0x004d
            r8 = r1[r7]
            java.lang.String r8 = r8.toString()
            r2.append(r8)
            java.lang.String r8 = "#"
            r2.append(r8)
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0044:
            java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
            java.lang.String r6 = r6.toString()
            r2.append(r6)
        L_0x004d:
            java.lang.String r2 = r2.toString()
            java.util.Map<java.lang.String, java.lang.reflect.Method> r6 = f2249a
            monitor-enter(r6)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r7 = f2249a     // Catch:{ all -> 0x0106 }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ all -> 0x0106 }
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch:{ all -> 0x0106 }
            monitor-exit(r6)     // Catch:{ all -> 0x0106 }
            if (r7 == 0) goto L_0x0069
            boolean r0 = r7.isAccessible()
            if (r0 != 0) goto L_0x0068
            r7.setAccessible(r4)
        L_0x0068:
            return r7
        L_0x0069:
            if (r3 == 0) goto L_0x0104
            java.lang.reflect.Method r6 = r3.getDeclaredMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0070 }
            goto L_0x0071
        L_0x0070:
            r6 = r7
        L_0x0071:
            if (r6 != 0) goto L_0x00eb
            java.lang.reflect.Method[] r7 = r3.getDeclaredMethods()
            if (r7 == 0) goto L_0x00eb
            int r8 = r7.length
            r9 = r6
            r6 = 0
        L_0x007c:
            if (r6 >= r8) goto L_0x00e9
            r10 = r7[r6]
            if (r10 == 0) goto L_0x00e6
            java.lang.String r11 = r10.getName()
            boolean r11 = android.text.TextUtils.equals(r11, r0)
            if (r11 == 0) goto L_0x00e6
            java.lang.Class[] r11 = r10.getParameterTypes()
            if (r1 == 0) goto L_0x00e6
            if (r11 == 0) goto L_0x00e6
            int r12 = r1.length
            int r13 = r11.length
            if (r12 != r13) goto L_0x00e6
            r12 = 0
            r13 = 1
        L_0x009a:
            int r14 = r1.length
            if (r12 >= r14) goto L_0x00e3
            r14 = r1[r12]
            r15 = r11[r12]
            if (r15 != 0) goto L_0x00a5
        L_0x00a3:
            r5 = 0
            goto L_0x00dd
        L_0x00a5:
            if (r14 != 0) goto L_0x00af
            boolean r14 = r15.isPrimitive()
            if (r14 != 0) goto L_0x00a3
            r5 = 1
            goto L_0x00dd
        L_0x00af:
            boolean r16 = r14.isPrimitive()
            if (r16 == 0) goto L_0x00c4
            boolean r16 = r15.isPrimitive()
            if (r16 != 0) goto L_0x00c4
            java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> r5 = f2250b
            java.lang.Object r5 = r5.get(r14)
            r14 = r5
            java.lang.Class r14 = (java.lang.Class) r14
        L_0x00c4:
            boolean r5 = r15.isPrimitive()
            if (r5 == 0) goto L_0x00d9
            boolean r5 = r14.isPrimitive()
            if (r5 != 0) goto L_0x00d9
            java.util.HashMap<java.lang.Class<?>, java.lang.Class<?>> r5 = f2250b
            java.lang.Object r5 = r5.get(r15)
            r15 = r5
            java.lang.Class r15 = (java.lang.Class) r15
        L_0x00d9:
            boolean r5 = r15.isAssignableFrom(r14)
        L_0x00dd:
            if (r5 != 0) goto L_0x00e0
            r13 = 0
        L_0x00e0:
            int r12 = r12 + 1
            goto L_0x009a
        L_0x00e3:
            if (r13 == 0) goto L_0x00e6
            r9 = r10
        L_0x00e6:
            int r6 = r6 + 1
            goto L_0x007c
        L_0x00e9:
            r7 = r9
            goto L_0x00ec
        L_0x00eb:
            r7 = r6
        L_0x00ec:
            if (r7 == 0) goto L_0x00fe
            r7.setAccessible(r4)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r5 = f2249a
            monitor-enter(r5)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r0 = f2249a     // Catch:{ all -> 0x00fb }
            r0.put(r2, r7)     // Catch:{ all -> 0x00fb }
            monitor-exit(r5)     // Catch:{ all -> 0x00fb }
            return r7
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00fb }
            throw r0
        L_0x00fe:
            java.lang.Class r3 = r3.getSuperclass()
            goto L_0x0069
        L_0x0104:
            r0 = 0
            return r0
        L_0x0106:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0106 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.e.b.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private static Object a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class[] a2 = e.a(clsArr);
        Object[] b2 = e.b(objArr);
        Method a3 = a(cls, str, a2);
        if (a3 != null) {
            return a3.invoke(null, b2);
        }
        return null;
    }

    public static Object a(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class[] a2 = e.a(clsArr);
        Object[] b2 = e.b(objArr);
        Method a3 = a((Class) obj.getClass(), str, a2);
        if (a3 != null) {
            return a3.invoke(obj, b2);
        }
        return null;
    }
}
