package com.bytedance.android.livesdk.sticker;

import com.bytedance.android.livesdk.message.model.ab;
import com.meituan.robust.ChangeQuickRedirect;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class l implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17301a;

    /* renamed from: b  reason: collision with root package name */
    private final ab f17302b;

    l(ab abVar) {
        this.f17302b = abVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: com.bytedance.android.livesdk.gift.effect.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.bytedance.android.livesdk.gift.effect.b.b} */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.bytedance.android.livesdk.gift.effect.b.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribe(io.reactivex.ObservableEmitter r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f17301a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<io.reactivex.ObservableEmitter> r3 = io.reactivex.ObservableEmitter.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 13383(0x3447, float:1.8754E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f17301a
            r13 = 0
            r14 = 13383(0x3447, float:1.8754E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<io.reactivex.ObservableEmitter> r0 = io.reactivex.ObservableEmitter.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            r2 = r17
            com.bytedance.android.livesdk.message.model.ab r3 = r2.f17302b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.bl.c.f9787a
            r13 = 1
            r14 = 3962(0xf7a, float:5.552E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ab> r4 = com.bytedance.android.livesdk.message.model.ab.class
            r15[r9] = r4
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.b.b> r16 = com.bytedance.android.livesdk.gift.effect.b.b.class
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r5 = 0
            if (r4 == 0) goto L_0x006c
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.bl.c.f9787a
            r13 = 1
            r14 = 3962(0xf7a, float:5.552E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ab> r1 = com.bytedance.android.livesdk.message.model.ab.class
            r15[r9] = r1
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.b.b> r16 = com.bytedance.android.livesdk.gift.effect.b.b.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r5 = r1
            com.bytedance.android.livesdk.gift.effect.b.b r5 = (com.bytedance.android.livesdk.gift.effect.b.b) r5
            goto L_0x016c
        L_0x006c:
            if (r3 == 0) goto L_0x016c
            long r6 = r3.getMessageId()
            r10 = 0
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x016c
            com.bytedance.android.live.base.model.user.User r4 = r3.f16430b
            if (r4 != 0) goto L_0x007e
            goto L_0x016c
        L_0x007e:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r4 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.utility.b.a(r4)
            com.bytedance.android.live.gift.IGiftService r4 = (com.bytedance.android.live.gift.IGiftService) r4
            long r6 = r3.f16432d
            com.bytedance.android.livesdk.gift.model.b r4 = r4.findGiftById(r6)
            if (r4 != 0) goto L_0x0090
            goto L_0x016c
        L_0x0090:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r6 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r6 = com.bytedance.android.live.utility.b.a(r6)
            com.bytedance.android.live.gift.IGiftService r6 = (com.bytedance.android.live.gift.IGiftService) r6
            java.lang.String r7 = "effects"
            long r10 = r4.r
            java.lang.String r6 = r6.getAssetsPath(r7, r10)
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x00a8
            goto L_0x016c
        L_0x00a8:
            com.bytedance.android.livesdk.gift.effect.b.b r5 = new com.bytedance.android.livesdk.gift.effect.b.b
            r5.<init>()
            int r7 = r4.j
            if (r7 > 0) goto L_0x00b5
            r7 = 3000(0xbb8, float:4.204E-42)
            r4.j = r7
        L_0x00b5:
            int r7 = r4.j
            long r7 = (long) r7
            com.bytedance.android.livesdk.gift.effect.b.b r5 = r5.d(r7)
            com.bytedance.android.livesdk.gift.effect.b.b r5 = r5.b(r1)
            java.lang.String r7 = r4.t
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.effect.b.b.o
            r13 = 0
            r14 = 9524(0x2534, float:1.3346E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r15[r9] = r8
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.b.b> r16 = com.bytedance.android.livesdk.gift.effect.b.b.class
            r11 = r5
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r8 == 0) goto L_0x00f4
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.effect.b.b.o
            r13 = 0
            r14 = 9524(0x2534, float:1.3346E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r15[r9] = r1
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.b.b> r16 = com.bytedance.android.livesdk.gift.effect.b.b.class
            r11 = r5
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r5 = r1
            com.bytedance.android.livesdk.gift.effect.b.b r5 = (com.bytedance.android.livesdk.gift.effect.b.b) r5
            goto L_0x0133
        L_0x00f4:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.model.g.f15122a
            r13 = 1
            r14 = 9830(0x2666, float:1.3775E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r15[r9] = r8
            java.lang.Class<com.bytedance.android.livesdk.gift.model.g> r16 = com.bytedance.android.livesdk.gift.model.g.class
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r8 == 0) goto L_0x0125
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.model.g.f15122a
            r13 = 1
            r14 = 9830(0x2666, float:1.3775E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r15[r9] = r1
            java.lang.Class<com.bytedance.android.livesdk.gift.model.g> r16 = com.bytedance.android.livesdk.gift.model.g.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.gift.model.g r1 = (com.bytedance.android.livesdk.gift.model.g) r1
            goto L_0x0131
        L_0x0125:
            com.google.gson.Gson r1 = com.bytedance.android.live.a.a()
            java.lang.Class<com.bytedance.android.livesdk.gift.model.g> r8 = com.bytedance.android.livesdk.gift.model.g.class
            java.lang.Object r1 = r1.fromJson((java.lang.String) r7, (java.lang.Class<T>) r8)
            com.bytedance.android.livesdk.gift.model.g r1 = (com.bytedance.android.livesdk.gift.model.g) r1
        L_0x0131:
            r5.r = r1
        L_0x0133:
            long r7 = r3.getMessageId()
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r5.a((long) r7)
            long r7 = r4.f15105d
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.c(r7)
            long r7 = r4.r
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.b((long) r7)
            int r5 = r4.f15107f
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.a((int) r5)
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.a((java.lang.String) r6)
            boolean r5 = r3.n
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.a((boolean) r5)
            com.bytedance.android.live.base.model.user.User r5 = r3.f16431c
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.a((com.bytedance.android.live.base.model.user.User) r5)
            com.bytedance.android.live.base.model.user.User r3 = r3.f16430b
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.b((com.bytedance.android.live.base.model.user.User) r3)
            java.lang.String r3 = r4.f15104c
            com.bytedance.android.livesdk.gift.effect.b.a r1 = r1.b((java.lang.String) r3)
            r5 = r1
            com.bytedance.android.livesdk.gift.effect.b.b r5 = (com.bytedance.android.livesdk.gift.effect.b.b) r5
        L_0x016c:
            r0.onNext(r5)
            r18.onComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.sticker.l.subscribe(io.reactivex.ObservableEmitter):void");
    }
}
