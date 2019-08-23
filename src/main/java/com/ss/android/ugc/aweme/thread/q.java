package com.ss.android.ugc.aweme.thread;

import com.google.a.a.a.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.concurrent.FutureTask;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4264a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Field f4265b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile Field f4266c;

    q() {
    }

    static boolean b(Object obj) {
        return obj instanceof FutureTask;
    }

    static String a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, null, f4264a, true, 86925, new Class[]{Throwable.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{th2}, null, f4264a, true, 86925, new Class[]{Throwable.class}, String.class);
        } else if (th2 == null) {
            return "";
        } else {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                a.a(th2, printWriter);
                return stringWriter.toString();
            } finally {
                printWriter.close();
            }
        }
    }

    static Object c(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f4264a, true, 86929, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj2}, null, f4264a, true, 86929, new Class[]{Object.class}, Object.class);
        }
        try {
            if (f4265b == null) {
                synchronized (q.class) {
                    if (f4265b == null) {
                        Field declaredField = obj.getClass().getDeclaredField("callable");
                        f4265b = declaredField;
                        declaredField.setAccessible(true);
                    }
                }
            }
            return f4265b.get(obj2);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object d(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f4264a, true, 86930, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj2}, null, f4264a, true, 86930, new Class[]{Object.class}, Object.class);
        }
        try {
            if (f4266c == null) {
                synchronized (q.class) {
                    if (f4266c == null) {
                        Field declaredField = obj.getClass().getDeclaredField("task");
                        f4266c = declaredField;
                        declaredField.setAccessible(true);
                    }
                }
            }
            return f4266c.get(obj2);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean a(Class cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, null, f4264a, true, 86931, new Class[]{Class.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cls}, null, f4264a, true, 86931, new Class[]{Class.class}, Boolean.TYPE)).booleanValue();
        }
        String name = cls.getName();
        if ("java.lang.Integer".equals(name) || "java.lang.Boolean".equals(name) || "java.lang.Long".equals(name) || "java.lang.Float".equals(name) || "java.lang.Double".equals(name) || "java.lang.String".equals(name) || "sun.misc.Unsafe".equals(name) || "bolts.TaskCompletionSource".equals(name) || "java.util.ArrayList".equals(name) || name.contains("android.os.Handler") || name.contains("com.bytedance.common.utility.collection.WeakHandler") || name.contains("java.util.concurrent.Executors$RunnableAdapter") || name.contains("bolts.Task") || cls.isPrimitive()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6 A[Catch:{ Exception -> 0x00f6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.lang.Object r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f4264a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 86926(0x1538e, float:1.21809E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f4264a
            r13 = 1
            r14 = 86926(0x1538e, float:1.21809E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            boolean r2 = b(r17)
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = c(r17)
            if (r2 == 0) goto L_0x0043
            r0 = r2
            goto L_0x0045
        L_0x0043:
            r0 = r17
        L_0x0045:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r0
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f4264a
            r5 = 1
            r6 = 86927(0x1538f, float:1.2181E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r7[r9] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x007c
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f4264a
            r13 = 1
            r14 = 86927(0x1538f, float:1.2181E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x008a
        L_0x007c:
            java.lang.String r2 = "java.util.concurrent.Executors$RunnableAdapter"
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equals(r3)
        L_0x008a:
            if (r2 == 0) goto L_0x0093
            java.lang.Object r2 = d(r0)
            if (r2 == 0) goto L_0x0093
            r0 = r2
        L_0x0093:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            boolean r3 = a((java.lang.Class) r3)
            if (r3 != 0) goto L_0x00ba
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "@"
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00b2
            java.lang.String r3 = r3.substring(r9, r4)
        L_0x00b2:
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
        L_0x00ba:
            java.lang.Class r3 = r0.getClass()
            java.lang.reflect.Field[] r3 = r3.getDeclaredFields()
            int r4 = r3.length     // Catch:{ Exception -> 0x00f6 }
            r5 = 0
        L_0x00c4:
            if (r5 >= r4) goto L_0x00f6
            r6 = r3[r5]     // Catch:{ Exception -> 0x00f6 }
            r6.setAccessible(r1)     // Catch:{ Exception -> 0x00f6 }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x00f6 }
            if (r6 == 0) goto L_0x00f3
            java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x00f6 }
            boolean r7 = a((java.lang.Class) r6)     // Catch:{ Exception -> 0x00f6 }
            if (r7 != 0) goto L_0x00f3
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r7 = "@"
            int r7 = r6.indexOf(r7)     // Catch:{ Exception -> 0x00f6 }
            if (r7 <= 0) goto L_0x00eb
            java.lang.String r6 = r6.substring(r9, r7)     // Catch:{ Exception -> 0x00f6 }
        L_0x00eb:
            r2.append(r6)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r6 = ","
            r2.append(r6)     // Catch:{ Exception -> 0x00f6 }
        L_0x00f3:
            int r5 = r5 + 1
            goto L_0x00c4
        L_0x00f6:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "class "
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceAll(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.thread.q.a(java.lang.Object):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(java.lang.StackTraceElement[] r17) throws java.lang.IllegalArgumentException {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f4264a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.StackTraceElement[]> r3 = java.lang.StackTraceElement[].class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 86932(0x15394, float:1.21818E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f4264a
            r13 = 1
            r14 = 86932(0x15394, float:1.21818E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.StackTraceElement[]> r0 = java.lang.StackTraceElement[].class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            if (r0 == 0) goto L_0x0124
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0124
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0043:
            if (r4 >= r3) goto L_0x011f
            r5 = r0[r4]
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r5
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f4264a
            r13 = 1
            r14 = 86933(0x15395, float:1.21819E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.StackTraceElement> r6 = java.lang.StackTraceElement.class
            r15[r9] = r6
            java.lang.Class r16 = java.lang.Boolean.TYPE
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x007e
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r5
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f4264a
            r13 = 1
            r14 = 86933(0x15395, float:1.21819E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.StackTraceElement> r6 = java.lang.StackTraceElement.class
            r15[r9] = r6
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L_0x00e4
        L_0x007e:
            if (r5 == 0) goto L_0x00e3
            java.lang.String r6 = r5.getClassName()
            java.lang.String r7 = "libcore.io"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "com.tencent.matrix.iocanary"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "java.io"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "android.database.sqlite"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "android.database.AbstractCursor"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "dalvik.system"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "android.os"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "com.ss.android.ugc.conan"
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "com.lody.whale"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00e3
            java.lang.String r6 = r5.getMethodName()
            java.lang.String r7 = "getThreadStackTrace"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x00e3
            java.lang.String r7 = "getStackTrace"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r6 = 0
            goto L_0x00e4
        L_0x00e3:
            r6 = 1
        L_0x00e4:
            if (r6 != 0) goto L_0x011b
            java.lang.String r6 = "\tat "
            r2.append(r6)
            java.lang.String r6 = r5.getClassName()
            r2.append(r6)
            java.lang.String r6 = "."
            r2.append(r6)
            java.lang.String r6 = r5.getMethodName()
            r2.append(r6)
            java.lang.String r6 = "("
            r2.append(r6)
            java.lang.String r6 = r5.getFileName()
            r2.append(r6)
            java.lang.String r6 = ":"
            r2.append(r6)
            int r5 = r5.getLineNumber()
            r2.append(r5)
            java.lang.String r5 = ")\n"
            r2.append(r5)
        L_0x011b:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x011f:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0124:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.thread.q.a(java.lang.StackTraceElement[]):java.lang.String");
    }
}
