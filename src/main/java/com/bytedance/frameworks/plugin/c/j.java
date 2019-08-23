package com.bytedance.frameworks.plugin.c;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class j extends i implements InvocationHandler {

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, i> f2174b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    protected static final Map<Class<?>, Class<?>> f2175c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2176a;

    /* renamed from: d  reason: collision with root package name */
    protected HashMap<String, i> f2177d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public Object f2178e;

    /* renamed from: f  reason: collision with root package name */
    public Object f2179f;
    public boolean g = true;

    public abstract void a();

    /* access modifiers changed from: protected */
    public boolean a(Method method) {
        return true;
    }

    static {
        HashMap hashMap = new HashMap();
        f2175c = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f2175c.put(Byte.class, Byte.TYPE);
        f2175c.put(Character.class, Character.TYPE);
        f2175c.put(Short.class, Short.TYPE);
        f2175c.put(Integer.class, Integer.TYPE);
        f2175c.put(Long.class, Long.TYPE);
        f2175c.put(Double.class, Double.TYPE);
        f2175c.put(Float.class, Float.TYPE);
    }

    public final void b(Object obj) {
        this.f2176a = true;
        this.f2178e = obj;
    }

    private i a(String str) {
        i iVar = f2174b.get(str);
        if (iVar == null) {
            return this.f2177d.get(str);
        }
        return iVar;
    }

    public final Object a(Object obj, Method method, Object[] objArr) {
        i a2 = a(method.getName());
        if (a2 != null) {
            return a2.a(obj, method, objArr);
        }
        return super.a(obj, method, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        if (r5 != null) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        /*
            r3 = this;
            boolean r4 = r3.f2176a
            if (r4 == 0) goto L_0x0084
            boolean r4 = r5.isAccessible()
            if (r4 != 0) goto L_0x000e
            r4 = 1
            r5.setAccessible(r4)
        L_0x000e:
            boolean r4 = r3.g
            if (r4 != 0) goto L_0x0019
            java.lang.Object r4 = r3.f2178e
            java.lang.Object r4 = r5.invoke(r4, r6)
            return r4
        L_0x0019:
            r4 = 0
            java.lang.Object r0 = r3.f2178e     // Catch:{ Throwable -> 0x0021 }
            java.lang.Object r0 = r3.a(r0, r5, r6)     // Catch:{ Throwable -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            r0 = move-exception
            java.lang.String r1 = "MethodProxy beforeInvoke error."
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r1, (java.lang.Throwable) r0)
            r0 = r4
        L_0x0028:
            if (r0 != 0) goto L_0x0045
            java.lang.Object r1 = r3.f2178e     // Catch:{ Throwable -> 0x0032 }
            java.lang.Object r1 = r5.invoke(r1, r6)     // Catch:{ Throwable -> 0x0032 }
            r0 = r1
            goto L_0x0045
        L_0x0032:
            r1 = move-exception
            boolean r2 = r3.a((java.lang.reflect.Method) r5)
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = "MethodProxy invoke error."
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r2, (java.lang.Throwable) r1)
            goto L_0x0045
        L_0x003f:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r1)
            throw r4
        L_0x0045:
            java.lang.Object r1 = r3.f2178e     // Catch:{ Throwable -> 0x004c }
            java.lang.Object r6 = r3.a(r1, r5, r6, r0)     // Catch:{ Throwable -> 0x004c }
            goto L_0x0053
        L_0x004c:
            r6 = move-exception
            java.lang.String r1 = "MethodProxy afterInvoke error."
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r1, (java.lang.Throwable) r6)
            r6 = r0
        L_0x0053:
            if (r6 == 0) goto L_0x0056
            return r6
        L_0x0056:
            java.lang.Class r5 = r5.getReturnType()
            if (r5 == 0) goto L_0x0083
            boolean r6 = r5.isPrimitive()
            if (r6 != 0) goto L_0x006c
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r6 = f2175c
            java.lang.Object r5 = r6.get(r5)
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L_0x0083
        L_0x006c:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r5 != r4) goto L_0x0073
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L_0x0073:
            java.lang.Class r4 = java.lang.Void.TYPE
            if (r5 != r4) goto L_0x007d
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            return r4
        L_0x007d:
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L_0x0083:
            return r4
        L_0x0084:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "setTarget must be invoked before this invoke"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.c.j.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
        i a2 = a(method.getName());
        if (a2 != null) {
            return a2.a(obj, method, objArr, obj2);
        }
        return super.a(obj, method, objArr, obj2);
    }
}
