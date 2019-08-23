package com.ss.android.message.b;

import com.meituan.robust.ChangeQuickRedirect;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29994a;

    /* renamed from: b  reason: collision with root package name */
    private Object f29995b;

    j() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|(3:11|12|13)|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f29994a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r4 = 0
            r5 = 18186(0x470a, float:2.5484E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f29994a
            r5 = 0
            r6 = 18186(0x470a, float:2.5484E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0026:
            java.lang.Object r0 = r9.f29995b
            if (r0 != 0) goto L_0x0042
            java.lang.Class<com.ss.android.message.b.i> r0 = com.ss.android.message.b.i.class
            monitor-enter(r0)
            java.lang.Object r1 = r9.f29995b     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x003d }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Throwable -> 0x003d }
            r9.f29995b = r1     // Catch:{ Throwable -> 0x003d }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            java.lang.Object r0 = r9.f29995b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.b.j.a():java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = a();
        r0 = (java.lang.String) r2.getClass().getMethod("get", new java.lang.Class[]{java.lang.String.class}).invoke(r2, new java.lang.Object[]{r18});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
        r0 = "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r18) throws java.lang.IllegalArgumentException {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f29994a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 18187(0x470b, float:2.5485E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f29994a
            r13 = 0
            r14 = 18187(0x470b, float:2.5485E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0035:
            java.lang.String r2 = android.os.SystemProperties.get(r18)     // Catch:{ Throwable -> 0x003a }
            return r2
        L_0x003a:
            java.lang.Object r2 = r17.a()     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            java.lang.Class r3 = r2.getClass()     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r9] = r6     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            r1[r9] = r18     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            java.lang.Object r0 = r3.invoke(r2, r1)     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalArgumentException -> 0x005c, Throwable -> 0x0059 }
            goto L_0x005b
        L_0x0059:
            java.lang.String r0 = ""
        L_0x005b:
            return r0
        L_0x005c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.b.j.a(java.lang.String):java.lang.String");
    }
}
