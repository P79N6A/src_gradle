package com.bytedance.android.livesdk.gift.effect.normal.a;

import com.meituan.robust.ChangeQuickRedirect;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14898a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdk.gift.effect.normal.d.b a(java.lang.Object... r23) {
        /*
            r22 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r23
            com.meituan.robust.ChangeQuickRedirect r4 = f14898a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.normal.d.b> r8 = com.bytedance.android.livesdk.gift.effect.normal.d.b.class
            r5 = 0
            r6 = 9525(0x2535, float:1.3347E-41)
            r3 = r22
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r23
            com.meituan.robust.ChangeQuickRedirect r12 = f14898a
            r13 = 0
            r14 = 9525(0x2535, float:1.3347E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.normal.d.b> r16 = com.bytedance.android.livesdk.gift.effect.normal.d.b.class
            r11 = r22
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.gift.effect.normal.d.b r0 = (com.bytedance.android.livesdk.gift.effect.normal.d.b) r0
            return r0
        L_0x0035:
            r2 = r23[r9]
            com.bytedance.android.livesdk.message.model.ab r2 = (com.bytedance.android.livesdk.message.model.ab) r2
            r3 = r23[r1]
            com.bytedance.android.livesdk.gift.model.b r3 = (com.bytedance.android.livesdk.gift.model.b) r3
            r4 = 2
            r0 = r23[r4]
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            java.lang.String r5 = r3.f15104c
            int r6 = r2.i
            int r7 = r2.j
            int r8 = r2.h
            r10 = 0
            if (r8 != r1) goto L_0x0069
            com.google.gson.Gson r8 = com.bytedance.android.live.a.a()
            com.bytedance.android.live.base.model.user.User r10 = r2.f16430b
            java.lang.String r10 = r8.toJson((java.lang.Object) r10)
            com.bytedance.android.livesdkapi.h.b r8 = r2.baseMessage
            java.lang.String r8 = r8.f18779f
            if (r8 == 0) goto L_0x006a
            java.lang.String r11 = ":"
            java.lang.String[] r11 = r8.split(r11)
            int r12 = r11.length
            if (r12 <= r1) goto L_0x006a
            r8 = r11[r1]
            goto L_0x006a
        L_0x0069:
            r8 = r10
        L_0x006a:
            if (r10 != 0) goto L_0x006e
            java.lang.String r10 = ""
        L_0x006e:
            if (r8 != 0) goto L_0x0072
            java.lang.String r8 = ""
        L_0x0072:
            com.bytedance.android.live.base.model.user.User r11 = r2.f16431c
            if (r11 == 0) goto L_0x00fc
            com.bytedance.android.live.base.model.user.User r11 = r2.f16431c
            long r11 = r11.getId()
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x00fc
            if (r0 == 0) goto L_0x0093
            com.bytedance.android.live.base.model.user.User r11 = r2.f16431c
            long r11 = r11.getId()
            long r13 = r0.getId()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0093
            goto L_0x00fc
        L_0x0093:
            com.bytedance.android.live.base.model.user.User r0 = r2.f16431c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r11 = r0.getNickName()
            r5[r9] = r11
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r11 = 2131563467(0x7f0d13cb, float:1.8752392E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r12[r9] = r13
            r12[r1] = r5
            com.meituan.robust.ChangeQuickRedirect r14 = f14898a
            r15 = 0
            r16 = 9526(0x2536, float:1.3349E-41)
            java.lang.Class[] r13 = new java.lang.Class[r4]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r13[r9] = r17
            java.lang.Class<java.lang.Object[]> r17 = java.lang.Object[].class
            r13[r1] = r17
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r13
            r13 = r22
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r12 == 0) goto L_0x00ed
            java.lang.Object[] r13 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13[r9] = r11
            r13[r1] = r5
            com.meituan.robust.ChangeQuickRedirect r15 = f14898a
            r16 = 0
            r17 = 9526(0x2536, float:1.3349E-41)
            java.lang.Class[] r4 = new java.lang.Class[r4]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r9] = r5
            java.lang.Class<java.lang.Object[]> r5 = java.lang.Object[].class
            r4[r1] = r5
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r14 = r22
            r18 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r4 = (java.lang.String) r4
        L_0x00eb:
            r5 = r4
            goto L_0x00fa
        L_0x00ed:
            android.content.Context r4 = com.bytedance.android.live.core.utils.ac.e()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getString(r11, r5)
            goto L_0x00eb
        L_0x00fa:
            r4 = 0
            goto L_0x00fd
        L_0x00fc:
            r4 = 1
        L_0x00fd:
            com.bytedance.android.livesdkapi.h.b r11 = r2.baseMessage
            long r11 = r11.f18777d
            int r13 = r2.j
            if (r13 <= r1) goto L_0x0108
            com.bytedance.android.livesdk.gift.effect.normal.d.b$a r13 = com.bytedance.android.livesdk.gift.effect.normal.d.b.a.group
            goto L_0x010a
        L_0x0108:
            com.bytedance.android.livesdk.gift.effect.normal.d.b$a r13 = com.bytedance.android.livesdk.gift.effect.normal.d.b.a.normal
        L_0x010a:
            com.bytedance.android.livesdk.gift.effect.normal.d.b r14 = new com.bytedance.android.livesdk.gift.effect.normal.d.b
            r21 = r4
            r20 = r5
            long r4 = r2.f16432d
            r14.<init>(r11, r4)
            r14.p = r10
            r14.h = r8
            int r4 = r2.h
            if (r4 != r1) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r1 = 0
        L_0x011f:
            r14.g = r1
            r14.f14910d = r6
            r14.f14908b = r7
            long r4 = r2.k
            r14.f14909c = r4
            com.bytedance.android.live.base.model.ImageModel r1 = r3.f15103b
            r14.f14912f = r1
            r5 = r20
            r14.k = r5
            com.bytedance.android.live.base.model.user.User r1 = r2.f16430b
            r14.l = r1
            r14.m = r0
            int r0 = r3.f15107f
            r14.o = r0
            r1 = r21
            r14.n = r1
            r14.s = r13
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.q
            r14.q = r0
            r14.r = r2
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.normal.a.a.a(java.lang.Object[]):com.bytedance.android.livesdk.gift.effect.normal.d.b");
    }
}
