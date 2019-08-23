package com.ss.ttm.utils.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Field getDeclaredField(Object obj, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{obj, str2}, null, changeQuickRedirect, true, 91168, new Class[]{Object.class, String.class}, Field.class)) {
            return (Field) PatchProxy.accessDispatch(new Object[]{obj, str2}, null, changeQuickRedirect, true, 91168, new Class[]{Object.class, String.class}, Field.class);
        }
        Class cls = obj.getClass();
        while (cls != Object.class) {
            try {
                return cls.getDeclaredField(str2);
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object getFieldValue(Object obj, String str) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2, str}, null, changeQuickRedirect, true, 91170, new Class[]{Object.class, String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj2, str}, null, changeQuickRedirect, true, 91170, new Class[]{Object.class, String.class}, Object.class);
        }
        Field declaredField = getDeclaredField(obj, str);
        declaredField.setAccessible(true);
        try {
            return declaredField.get(obj2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object invokeMethod(Object obj, String str) {
        Object obj2 = obj;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{obj2, str2}, null, changeQuickRedirect, true, 91166, new Class[]{Object.class, String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj2, str2}, null, changeQuickRedirect, true, 91166, new Class[]{Object.class, String.class}, Object.class);
        }
        Method declaredMethod = getDeclaredMethod(obj2, str2, (Class<?>[]) new Class[0]);
        if (declaredMethod == null) {
            return null;
        }
        try {
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj2, new Object[0]);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException(e2.getMessage());
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3.getMessage());
        } catch (InvocationTargetException e4) {
            Throwable targetException = e4.getTargetException();
            if (targetException != null) {
                System.out.print(targetException.getMessage());
            }
            throw new RuntimeException(e4.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method getDeclaredMethod(java.lang.Class<?> r21, java.lang.String r22, java.lang.Class<?>... r23) {
        /*
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r21
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Class> r5 = java.lang.Class.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            r9[r13] = r5
            java.lang.Class<java.lang.reflect.Method> r10 = java.lang.reflect.Method.class
            r5 = 0
            r7 = 1
            r8 = 91164(0x1641c, float:1.27748E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r21
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 1
            r18 = 91164(0x1641c, float:1.27748E-40)
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
            r0 = r21
        L_0x0058:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r0 == r3) goto L_0x0066
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0061 }
            return r3
        L_0x0061:
            java.lang.Class r0 = r0.getSuperclass()
            goto L_0x0058
        L_0x0066:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.app.RefUtil.getDeclaredMethod(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    public static void setFieldValue(Object obj, String str, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, str, obj4}, null, changeQuickRedirect, true, 91169, new Class[]{Object.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj3, str, obj4}, null, changeQuickRedirect, true, 91169, new Class[]{Object.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        Field declaredField = getDeclaredField(obj, str);
        declaredField.setAccessible(true);
        try {
            declaredField.set(obj3, obj4);
        } catch (IllegalArgumentException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method getDeclaredMethod(java.lang.Object r21, java.lang.String r22, java.lang.Class<?>... r23) {
        /*
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r21
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            r9[r13] = r5
            java.lang.Class<java.lang.reflect.Method> r10 = java.lang.reflect.Method.class
            r5 = 0
            r7 = 1
            r8 = 91165(0x1641d, float:1.2775E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r21
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 1
            r18 = 91165(0x1641d, float:1.2775E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
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
            java.lang.Class r0 = r21.getClass()
        L_0x005a:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r0 == r3) goto L_0x0068
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r1, r2)     // Catch:{ Exception -> 0x0063 }
            return r3
        L_0x0063:
            java.lang.Class r0 = r0.getSuperclass()
            goto L_0x005a
        L_0x0068:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.app.RefUtil.getDeclaredMethod(java.lang.Object, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object invokeMethod(java.lang.Object r22, java.lang.String r23, java.lang.Class<?>[] r24, java.lang.Object[] r25) {
        /*
            r0 = r22
            r2 = r25
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r23
            r13 = 2
            r4[r13] = r24
            r14 = 3
            r4[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            r9[r13] = r5
            java.lang.Class<java.lang.Object[]> r5 = java.lang.Object[].class
            r9[r14] = r5
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r5 = 0
            r7 = 1
            r8 = 91167(0x1641f, float:1.27752E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0065
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r0
            r4[r12] = r23
            r4[r13] = r24
            r4[r14] = r2
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = changeQuickRedirect
            r18 = 1
            r19 = 91167(0x1641f, float:1.27752E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.Class[]> r1 = java.lang.Class[].class
            r0[r13] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r14] = r1
            java.lang.Class<java.lang.Object> r21 = java.lang.Object.class
            r15 = r4
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0065:
            java.lang.reflect.Method r1 = getDeclaredMethod((java.lang.Object) r22, (java.lang.String) r23, (java.lang.Class[]) r24)
            r1.setAccessible(r12)
            if (r1 == 0) goto L_0x0084
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0084, InvocationTargetException -> 0x0073 }
            return r0
        L_0x0073:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r0 = r1.getTargetException()
            if (r0 == 0) goto L_0x0084
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r0 = r0.getMessage()
            r1.print(r0)
        L_0x0084:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.utils.app.RefUtil.invokeMethod(java.lang.Object, java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }
}
