package com.bytedance.android.livesdkapi.k;

import com.bytedance.common.utility.reflect.JavaCalls;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18823a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f18824b;

    public static void a(Object obj, String str, Object obj2) {
        if (PatchProxy.isSupport(new Object[]{obj, str, obj2}, null, f18823a, true, 15090, new Class[]{Object.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, str, obj2}, null, f18823a, true, 15090, new Class[]{Object.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        try {
            b(obj, str, obj2);
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.Class<?>[] r19, java.lang.Class<?>[] r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f18823a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Class[]> r4 = java.lang.Class[].class
            r8[r10] = r4
            java.lang.Class<java.lang.Class[]> r4 = java.lang.Class[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 15097(0x3af9, float:2.1155E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f18823a
            r15 = 1
            r16 = 15097(0x3af9, float:2.1155E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Class[]> r1 = java.lang.Class[].class
            r0[r10] = r1
            java.lang.Class<java.lang.Class[]> r1 = java.lang.Class[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004a:
            if (r0 != 0) goto L_0x0054
            if (r1 == 0) goto L_0x0053
            int r0 = r1.length
            if (r0 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            return r10
        L_0x0053:
            return r11
        L_0x0054:
            if (r1 != 0) goto L_0x005b
            int r0 = r0.length
            if (r0 != 0) goto L_0x005a
            return r11
        L_0x005a:
            return r10
        L_0x005b:
            int r2 = r0.length
            int r3 = r1.length
            if (r2 == r3) goto L_0x0060
            return r10
        L_0x0060:
            r2 = 0
        L_0x0061:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0094
            r3 = r0[r2]
            r4 = r1[r2]
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L_0x0091
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r3 = f18824b
            r4 = r0[r2]
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x0090
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r3 = f18824b
            r4 = r0[r2]
            java.lang.Object r3 = r3.get(r4)
            java.lang.Class r3 = (java.lang.Class) r3
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r4 = f18824b
            r5 = r1[r2]
            java.lang.Object r4 = r4.get(r5)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0091
        L_0x0090:
            return r10
        L_0x0091:
            int r2 = r2 + 1
            goto L_0x0061
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.k.a.a(java.lang.Class[], java.lang.Class[]):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Class<?>[] a(java.lang.Object... r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f18823a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class<java.lang.Class[]> r8 = java.lang.Class[].class
            r3 = 0
            r5 = 1
            r6 = 15107(0x3b03, float:2.117E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f18823a
            r13 = 1
            r14 = 15107(0x3b03, float:2.117E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class<java.lang.Class[]> r16 = java.lang.Class[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            return r0
        L_0x0035:
            r1 = 0
            if (r0 == 0) goto L_0x005c
            int r2 = r0.length
            if (r2 <= 0) goto L_0x005c
            int r2 = r0.length
            java.lang.Class[] r2 = new java.lang.Class[r2]
        L_0x003e:
            int r3 = r0.length
            if (r9 >= r3) goto L_0x005b
            r3 = r0[r9]
            if (r3 == 0) goto L_0x004e
            boolean r4 = r3 instanceof com.bytedance.common.utility.reflect.JavaCalls.JavaParam
            if (r4 == 0) goto L_0x004e
            com.bytedance.common.utility.reflect.JavaCalls$JavaParam r3 = (com.bytedance.common.utility.reflect.JavaCalls.JavaParam) r3
            java.lang.Class<? extends T> r3 = r3.clazz
            goto L_0x0056
        L_0x004e:
            if (r3 != 0) goto L_0x0052
            r3 = r1
            goto L_0x0056
        L_0x0052:
            java.lang.Class r3 = r3.getClass()
        L_0x0056:
            r2[r9] = r3
            int r9 = r9 + 1
            goto L_0x003e
        L_0x005b:
            r1 = r2
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.k.a.a(java.lang.Object[]):java.lang.Class[]");
    }

    static {
        HashMap hashMap = new HashMap();
        f18824b = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f18824b.put(Byte.class, Byte.TYPE);
        f18824b.put(Character.class, Character.TYPE);
        f18824b.put(Short.class, Short.TYPE);
        f18824b.put(Integer.class, Integer.TYPE);
        f18824b.put(Float.class, Float.TYPE);
        f18824b.put(Long.class, Long.TYPE);
        f18824b.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f18824b;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f18824b;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f18824b;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f18824b;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f18824b;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f18824b;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f18824b;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f18824b;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    private static Object[] b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            JavaCalls.JavaParam javaParam = objArr[i];
            if (javaParam == null || !(javaParam instanceof JavaCalls.JavaParam)) {
                objArr2[i] = javaParam;
            } else {
                objArr2[i] = javaParam.obj;
            }
        }
        return objArr2;
    }

    public static <T> T a(Class<?> cls) {
        int i;
        Class<?> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, null, f18823a, true, 15101, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2}, null, f18823a, true, 15101, new Class[]{Class.class}, Object.class);
        }
        try {
            if (PatchProxy.isSupport(new Object[]{cls2}, null, f18823a, true, 15102, new Class[]{Class.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{cls2}, null, f18823a, true, 15102, new Class[]{Class.class}, Object.class);
            }
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            if (declaredConstructors == null || declaredConstructors.length == 0) {
                throw new IllegalArgumentException("Can't get even one available constructor for " + cls2);
            }
            Constructor constructor = declaredConstructors[0];
            constructor.setAccessible(true);
            Class[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes != null) {
                if (parameterTypes.length != 0) {
                    Object[] objArr = new Object[parameterTypes.length];
                    for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                        Class cls3 = parameterTypes[i2];
                        if (PatchProxy.isSupport(new Object[]{cls3}, null, f18823a, true, 15103, new Class[]{Class.class}, Object.class)) {
                            i = PatchProxy.accessDispatch(new Object[]{cls3}, null, f18823a, true, 15103, new Class[]{Class.class}, Object.class);
                        } else {
                            if (!Integer.TYPE.equals(cls3) && !Integer.class.equals(cls3) && !Byte.TYPE.equals(cls3) && !Byte.class.equals(cls3) && !Short.TYPE.equals(cls3) && !Short.class.equals(cls3) && !Long.TYPE.equals(cls3) && !Long.class.equals(cls3) && !Double.TYPE.equals(cls3) && !Double.class.equals(cls3) && !Float.TYPE.equals(cls3)) {
                                if (!Float.class.equals(cls3)) {
                                    if (!Boolean.TYPE.equals(cls3)) {
                                        if (!Boolean.class.equals(cls3)) {
                                            if (!Character.TYPE.equals(cls3)) {
                                                if (!Character.class.equals(cls3)) {
                                                    i = null;
                                                }
                                            }
                                            i = 0;
                                        }
                                    }
                                    i = Boolean.FALSE;
                                }
                            }
                            i = 0;
                        }
                        objArr[i2] = i;
                    }
                    return constructor.newInstance(objArr);
                }
            }
            return constructor.newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method a(java.lang.Class<?> r21, java.lang.String r22, java.lang.Class<?>... r23) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            r0 = r22
            r1 = r23
            r2 = r21
        L_0x0006:
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r2
            r12 = 1
            r4[r12] = r0
            r13 = 2
            r4[r13] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f18823a
            r7 = 1
            r8 = 15095(0x3af7, float:2.1153E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Class> r10 = java.lang.Class.class
            r9[r11] = r10
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r12] = r10
            java.lang.Class<java.lang.Class[]> r10 = java.lang.Class[].class
            r9[r13] = r10
            java.lang.Class<java.lang.reflect.Method> r10 = java.lang.reflect.Method.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r2
            r14[r12] = r0
            r14[r13] = r1
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f18823a
            r17 = 1
            r18 = 15095(0x3af7, float:2.1153E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.Class[]> r1 = java.lang.Class[].class
            r0[r13] = r1
            java.lang.Class<java.lang.reflect.Method> r20 = java.lang.reflect.Method.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L_0x0056:
            java.lang.reflect.Method[] r3 = r2.getDeclaredMethods()
            java.lang.reflect.Method r3 = a((java.lang.reflect.Method[]) r3, (java.lang.String) r0, (java.lang.Class<?>[]) r1)
            if (r3 != 0) goto L_0x0071
            java.lang.Class r3 = r2.getSuperclass()
            if (r3 == 0) goto L_0x006b
            java.lang.Class r2 = r2.getSuperclass()
            goto L_0x0006
        L_0x006b:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r0.<init>()
            throw r0
        L_0x0071:
            r3.setAccessible(r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.k.a.a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private static void b(Object obj, String str, Object obj2) throws NoSuchFieldException, IllegalAccessException {
        Object obj3 = obj;
        String str2 = str;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, str2, obj4}, null, f18823a, true, 15091, new Class[]{Object.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj3, str2, obj4}, null, f18823a, true, 15091, new Class[]{Object.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        Class cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str2);
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
        field.set(obj3, obj4);
    }

    public static <T> T a(Object obj, String str, Object... objArr) {
        Object obj2 = obj;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{obj2, str2, objArr}, null, f18823a, true, 15092, new Class[]{Object.class, String.class, Object[].class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj2, str2, objArr}, null, f18823a, true, 15092, new Class[]{Object.class, String.class, Object[].class}, Object.class);
        }
        try {
            if (!PatchProxy.isSupport(new Object[]{obj2, str2, objArr}, null, f18823a, true, 15093, new Class[]{Object.class, String.class, Object[].class}, Object.class)) {
                return a((Class) obj.getClass(), str2, a(objArr)).invoke(obj2, b(objArr));
            }
            return PatchProxy.accessDispatch(new Object[]{obj2, str2, objArr}, null, f18823a, true, 15093, new Class[]{Object.class, String.class, Object[].class}, Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3, objArr}, null, f18823a, true, 15094, new Class[]{String.class, String.class, Object[].class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str, str3, objArr}, null, f18823a, true, 15094, new Class[]{String.class, String.class, Object[].class}, Object.class);
        }
        try {
            Class<?> cls = Class.forName(str);
            if (!PatchProxy.isSupport(new Object[]{cls, str3, objArr}, null, f18823a, true, 15099, new Class[]{Class.class, String.class, Object[].class}, Object.class)) {
                return a((Class) cls, str3, a(objArr)).invoke(null, b(objArr));
            }
            return PatchProxy.accessDispatch(new Object[]{cls, str3, objArr}, null, f18823a, true, 15099, new Class[]{Class.class, String.class, Object[].class}, Object.class);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method a(java.lang.reflect.Method[] r21, java.lang.String r22, java.lang.Class<?>[] r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f18823a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.reflect.Method[]> r5 = java.lang.reflect.Method[].class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            r9[r13] = r5
            java.lang.Class<java.lang.reflect.Method> r10 = java.lang.reflect.Method.class
            r5 = 0
            r7 = 1
            r8 = 15096(0x3af8, float:2.1154E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f18823a
            r17 = 1
            r18 = 15096(0x3af8, float:2.1154E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.reflect.Method[]> r1 = java.lang.reflect.Method[].class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.Class[]> r1 = java.lang.Class[].class
            r0[r13] = r1
            java.lang.Class<java.lang.reflect.Method> r20 = java.lang.reflect.Method.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L_0x0056:
            if (r1 == 0) goto L_0x0077
            int r3 = r0.length
        L_0x0059:
            if (r11 >= r3) goto L_0x0075
            r4 = r0[r11]
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0072
            java.lang.Class[] r5 = r4.getParameterTypes()
            boolean r5 = a(r5, r2)
            if (r5 == 0) goto L_0x0072
            return r4
        L_0x0072:
            int r11 = r11 + 1
            goto L_0x0059
        L_0x0075:
            r0 = 0
            return r0
        L_0x0077:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Method name must not be null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.k.a.a(java.lang.reflect.Method[], java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }
}
