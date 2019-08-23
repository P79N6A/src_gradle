package com.ss.android.ugc.aweme.forward.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;

public final class g extends a<ForwardDetail> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48284a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 8) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean sendRequest(java.lang.Object... r27) {
        /*
            r26 = this;
            r0 = r27
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f48284a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 45435(0xb17b, float:6.3668E-41)
            r3 = r26
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f48284a
            r13 = 0
            r14 = 45435(0xb17b, float:6.3668E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r26
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            boolean r2 = super.sendRequest(r27)
            if (r2 != 0) goto L_0x0044
            return r9
        L_0x0044:
            r2 = r0[r9]
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            r2 = r0[r1]
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            r2 = 2
            r3 = r0[r2]
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r13 = r3.intValue()
            r3 = 3
            r4 = r0[r3]
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r4 = 4
            r5 = r0[r4]
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r5 = 5
            r6 = r0[r5]
            java.util.List r6 = (java.util.List) r6
            r7 = 6
            r8 = r0[r7]
            r18 = r8
            java.lang.String r18 = (java.lang.String) r18
            r8 = 7
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r11
            r10[r1] = r12
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)
            r10[r2] = r16
            r10[r3] = r14
            r10[r4] = r15
            r10[r5] = r6
            r10[r7] = r18
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.forward.api.ForwardApi.f48265a
            r22 = 1
            r23 = 45363(0xb133, float:6.3567E-41)
            java.lang.Class[] r7 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r7[r9] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r7[r1] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r7[r2] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r7[r3] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r7[r4] = r16
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r7[r5] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r17 = 6
            r7[r17] = r16
            java.lang.Class<a.i> r25 = a.i.class
            r19 = r10
            r24 = r7
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r7 == 0) goto L_0x0103
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r7[r9] = r11
            r7[r1] = r12
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r7[r2] = r10
            r7[r3] = r14
            r7[r4] = r15
            r7[r5] = r6
            r6 = 6
            r7[r6] = r18
            r20 = 0
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.forward.api.ForwardApi.f48265a
            r22 = 1
            r23 = 45363(0xb133, float:6.3567E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r9] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r1] = r8
            java.lang.Class r8 = java.lang.Integer.TYPE
            r6[r2] = r8
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r3] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r4] = r2
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r5] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 6
            r6[r3] = r2
            java.lang.Class<a.i> r25 = a.i.class
            r19 = r7
            r24 = r6
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            a.i r2 = (a.i) r2
            goto L_0x0115
        L_0x0103:
            com.google.gson.Gson r2 = com.ss.android.ugc.aweme.app.api.m.d()
            java.lang.String r16 = r2.toJson((java.lang.Object) r6)
            com.ss.android.ugc.aweme.forward.api.ForwardApi$RetrofitApi r10 = com.ss.android.ugc.aweme.forward.api.ForwardApi.f48266b
            boolean r17 = com.ss.android.ugc.aweme.utils.aj.a()
            a.i r2 = r10.createForward(r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0115:
            com.ss.android.ugc.aweme.forward.d.h r3 = new com.ss.android.ugc.aweme.forward.d.h
            r3.<init>(r0)
            a.i r0 = r2.a((a.g<TResult, TContinuationResult>) r3)
            com.ss.android.ugc.aweme.net.m r2 = new com.ss.android.ugc.aweme.net.m
            r3 = r26
            com.bytedance.common.utility.collection.WeakHandler r4 = r3.mHandler
            r2.<init>(r4, r9)
            r0.a((a.g<TResult, TContinuationResult>) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.forward.d.g.sendRequest(java.lang.Object[]):boolean");
    }
}
