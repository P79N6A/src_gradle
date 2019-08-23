package com.ss.android.ugc.aweme.app.application.a;

import a.g;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33918a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f33919b;

    c(Bundle bundle) {
        this.f33919b = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00be, code lost:
        if (r1 == null) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(a.i r25) {
        /*
            r24 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r25
            com.meituan.robust.ChangeQuickRedirect r4 = f33918a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<a.i> r3 = a.i.class
            r7[r9] = r3
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r5 = 0
            r6 = 23234(0x5ac2, float:3.2558E-41)
            r3 = r24
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r25
            com.meituan.robust.ChangeQuickRedirect r12 = f33918a
            r13 = 0
            r14 = 23234(0x5ac2, float:3.2558E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<a.i> r0 = a.i.class
            r15[r9] = r0
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            r11 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0035:
            r2 = r24
            android.os.Bundle r3 = r2.f33919b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.app.accountsdk.a.a.f33682a
            r13 = 1
            r14 = 22999(0x59d7, float:3.2228E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0068
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.app.accountsdk.a.a.f33682a
            r13 = 1
            r14 = 22999(0x59d7, float:3.2228E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r15[r9] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00d1
        L_0x0068:
            com.ss.android.ugc.aweme.app.accountsdk.a.a$a r4 = com.ss.android.ugc.aweme.app.accountsdk.a.a.f33685d
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.app.accountsdk.a.a.C0433a.f33686a
            r20 = 0
            r21 = 23005(0x59dd, float:3.2237E-41)
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            r6[r9] = r7
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r5
            r18 = r4
            r22 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)
            if (r5 == 0) goto L_0x00a2
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.app.accountsdk.a.a.C0433a.f33686a
            r7 = 0
            r8 = 23005(0x59dd, float:3.2237E-41)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r1[r9] = r3
            java.lang.Class r9 = java.lang.Void.TYPE
            r3 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00d1
        L_0x00a2:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r5 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r1 = r1.getService(r5)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r1 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r1
            if (r1 == 0) goto L_0x00b5
            java.util.List r1 = r1.getAfterLoginActions(r3)
            goto L_0x00b6
        L_0x00b5:
            r1 = 0
        L_0x00b6:
            if (r1 == 0) goto L_0x00c0
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r1)
            if (r1 != 0) goto L_0x00c7
        L_0x00c0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
        L_0x00c7:
            com.ss.android.ugc.aweme.app.accountsdk.a.a.f33683b = r1
            com.ss.android.ugc.aweme.app.accountsdk.a.a$a r4 = (com.ss.android.ugc.aweme.app.accountsdk.a.a.C0433a) r4
            r4.a()
            r4.a(r3)
        L_0x00d1:
            java.lang.Object r0 = r25.e()
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.application.a.c.then(a.i):java.lang.Object");
    }
}
