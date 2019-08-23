package com.ss.android.ugc.aweme.festival.christmas.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;

public final class i extends b<a<a>, com.ss.android.ugc.aweme.festival.christmas.view.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47243a;

    public i() {
        if (PatchProxy.isSupport(new Object[0], this, f47243a, false, 43913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47243a, false, 43913, new Class[0], Void.TYPE);
            return;
        }
        a(new a<a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47244a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof String)) {
                    return false;
                }
                return true;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean sendRequest(java.lang.Object... r18) {
                /*
                    r17 = this;
                    r0 = r18
                    r1 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r9 = 0
                    r2[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r4 = f47244a
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                    r7[r9] = r3
                    java.lang.Class r8 = java.lang.Boolean.TYPE
                    r5 = 0
                    r6 = 43916(0xab8c, float:6.154E-41)
                    r3 = r17
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x003d
                    java.lang.Object[] r10 = new java.lang.Object[r1]
                    r10[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r12 = f47244a
                    r13 = 0
                    r14 = 43916(0xab8c, float:6.154E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
                    r15[r9] = r0
                    java.lang.Class r16 = java.lang.Boolean.TYPE
                    r11 = r17
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    return r0
                L_0x003d:
                    boolean r2 = super.sendRequest(r18)
                    if (r2 != 0) goto L_0x0044
                    return r9
                L_0x0044:
                    com.ss.android.ugc.aweme.base.m r2 = com.ss.android.ugc.aweme.base.m.a()
                    r3 = r17
                    com.bytedance.common.utility.collection.WeakHandler r4 = r3.mHandler
                    com.ss.android.ugc.aweme.festival.christmas.c.j r5 = new com.ss.android.ugc.aweme.festival.christmas.c.j
                    r5.<init>(r0)
                    r2.a(r4, r5, r9)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.festival.christmas.c.i.AnonymousClass1.sendRequest(java.lang.Object[]):boolean");
            }
        });
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47243a, false, 43914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47243a, false, 43914, new Class[0], Void.TYPE);
        } else if (this.f2979f != null) {
            a aVar = (a) this.f2978e.getData();
            if (aVar != null) {
                ((com.ss.android.ugc.aweme.festival.christmas.view.a) this.f2979f).a(aVar);
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f47243a, false, 43915, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f47243a, false, 43915, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
    }
}
