package com.ss.android.ugc.aweme.account.j;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32010a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32011b;

    /* renamed from: c  reason: collision with root package name */
    private final User f32012c;

    public b(long j, User user) {
        this.f32011b = j;
        this.f32012c = user;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object then(a.i r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f32010a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<a.i> r1 = a.i.class
            r5[r9] = r1
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r3 = 0
            r4 = 20884(0x5194, float:2.9265E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0037
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r2 = f32010a
            r3 = 0
            r4 = 20884(0x5194, float:2.9265E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<a.i> r1 = a.i.class
            r5[r9] = r1
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0037:
            long r0 = r7.f32011b
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f32012c
            java.lang.String r3 = com.ss.android.ugc.aweme.w.e()
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r3
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            r10[r8] = r5
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.login.g.f32230a
            r13 = 1
            r14 = 20082(0x4e72, float:2.8141E-41)
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r9] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r5[r8] = r6
            java.lang.Class r16 = java.lang.Void.TYPE
            r15 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r5 == 0) goto L_0x0087
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
            r10[r8] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.account.login.g.f32230a
            r13 = 1
            r14 = 20082(0x4e72, float:2.8141E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r8] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r15 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00fd
        L_0x0087:
            java.lang.String r4 = "userId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            java.util.List<com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod> r5 = com.ss.android.ugc.aweme.account.login.g.f32231b
            java.util.Iterator r5 = r5.iterator()
        L_0x0099:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b3
            java.lang.Object r6 = r5.next()
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r6 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r6
            java.lang.String r8 = r6.getUid()
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0099
            r4.add(r6)
            goto L_0x0099
        L_0x00b3:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r3 = r4.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x00c1
            r3 = 0
            goto L_0x00eb
        L_0x00c1:
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r5 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r5
            java.util.Date r5 = r5.getExpires()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
        L_0x00ce:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00ea
            java.lang.Object r6 = r3.next()
            r8 = r6
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r8 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r8
            java.util.Date r8 = r8.getExpires()
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r9 = r5.compareTo(r8)
            if (r9 >= 0) goto L_0x00ce
            r4 = r6
            r5 = r8
            goto L_0x00ce
        L_0x00ea:
            r3 = r4
        L_0x00eb:
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r3 = (com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod) r3
            if (r3 == 0) goto L_0x00fd
            java.util.Date r4 = new java.util.Date
            r5 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r0 = r0 + r5
            r4.<init>(r0)
            r3.setExpires(r4)
        L_0x00fd:
            com.ss.android.ugc.aweme.account.login.g.a((com.ss.android.ugc.aweme.profile.model.User) r2)
            java.lang.Object r0 = r18.e()
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.j.b.then(a.i):java.lang.Object");
    }
}
