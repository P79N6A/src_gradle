package com.ss.android.ugc.aweme.live.d;

import com.meituan.robust.ChangeQuickRedirect;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53365a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f53367a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(@android.support.annotation.NonNull android.app.Activity r19, @android.support.annotation.NonNull com.ss.android.ugc.aweme.live.d.c.a r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f53365a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.live.d.c$a> r4 = com.ss.android.ugc.aweme.live.d.c.a.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 55981(0xdaad, float:7.8446E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f53365a
            r15 = 1
            r16 = 55981(0xdaad, float:7.8446E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.live.d.c$a> r1 = com.ss.android.ugc.aweme.live.d.c.a.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            boolean r3 = r19.isTaskRoot()
            if (r3 == 0) goto L_0x004e
            r1.f53367a = r11
            return
        L_0x004e:
            r3 = 0
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            java.lang.Class[] r4 = r4.getDeclaredClasses()     // Catch:{ Throwable -> 0x00d0 }
            int r5 = r4.length     // Catch:{ Throwable -> 0x00d0 }
            r7 = r3
            r6 = 0
        L_0x0058:
            if (r6 >= r5) goto L_0x006c
            r8 = r4[r6]     // Catch:{ Throwable -> 0x00d0 }
            java.lang.String r9 = r8.getSimpleName()     // Catch:{ Throwable -> 0x00d0 }
            java.lang.String r12 = "TranslucentConversionListener"
            boolean r9 = r9.contains(r12)     // Catch:{ Throwable -> 0x00d0 }
            if (r9 == 0) goto L_0x0069
            r7 = r8
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0058
        L_0x006c:
            if (r7 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.live.d.c$1 r4 = new com.ss.android.ugc.aweme.live.d.c$1     // Catch:{ Throwable -> 0x00d0 }
            r4.<init>(r1)     // Catch:{ Throwable -> 0x00d0 }
            java.lang.ClassLoader r5 = r7.getClassLoader()     // Catch:{ Throwable -> 0x00d0 }
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x00d0 }
            r6[r10] = r7     // Catch:{ Throwable -> 0x00d0 }
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r5, r6, r4)     // Catch:{ Throwable -> 0x00d0 }
            goto L_0x0081
        L_0x0080:
            r4 = r3
        L_0x0081:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00d1 }
            r6 = 21
            if (r5 < r6) goto L_0x00b9
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            java.lang.String r6 = "getActivityOptions"
            java.lang.Class[] r8 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x009b }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r8)     // Catch:{ Exception -> 0x009b }
            r5.setAccessible(r11)     // Catch:{ Exception -> 0x009b }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x009b }
            java.lang.Object r5 = r5.invoke(r0, r6)     // Catch:{ Exception -> 0x009b }
            goto L_0x009c
        L_0x009b:
            r5 = r3
        L_0x009c:
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            java.lang.String r8 = "convertToTranslucent"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x00d1 }
            r9[r10] = r7     // Catch:{ Throwable -> 0x00d1 }
            java.lang.Class<android.app.ActivityOptions> r7 = android.app.ActivityOptions.class
            r9[r11] = r7     // Catch:{ Throwable -> 0x00d1 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r8, r9)     // Catch:{ Throwable -> 0x00d1 }
            r6.setAccessible(r11)     // Catch:{ Throwable -> 0x00d1 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x00d1 }
            r2[r10] = r4     // Catch:{ Throwable -> 0x00d1 }
            r2[r11] = r5     // Catch:{ Throwable -> 0x00d1 }
            r6.invoke(r0, r2)     // Catch:{ Throwable -> 0x00d1 }
            goto L_0x00d3
        L_0x00b9:
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r5 = "convertToTranslucent"
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x00d1 }
            r6[r10] = r7     // Catch:{ Throwable -> 0x00d1 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r6)     // Catch:{ Throwable -> 0x00d1 }
            r2.setAccessible(r11)     // Catch:{ Throwable -> 0x00d1 }
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x00d1 }
            r5[r10] = r4     // Catch:{ Throwable -> 0x00d1 }
            r2.invoke(r0, r5)     // Catch:{ Throwable -> 0x00d1 }
            goto L_0x00d3
        L_0x00d0:
            r4 = r3
        L_0x00d1:
            r1.f53367a = r11
        L_0x00d3:
            if (r4 != 0) goto L_0x00d7
            r1.f53367a = r11
        L_0x00d7:
            android.view.Window r0 = r19.getWindow()
            r0.setBackgroundDrawable(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.d.c.a(android.app.Activity, com.ss.android.ugc.aweme.live.d.c$a):void");
    }
}
