package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.i.a.b;
import com.bytedance.android.livesdk.message.proto.XGLotteryMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

public final class bp extends c<XGLotteryMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16604a;
    @SerializedName("lottery_info")

    /* renamed from: b  reason: collision with root package name */
    public b f16605b;

    public bp() {
        this.type = a.LOTTERY_XG;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.bytedance.android.livesdk.i.a.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.bytedance.android.livesdk.message.model.c wrap(com.squareup.wire.Message r18) {
        /*
            r17 = this;
            r0 = r18
            com.bytedance.android.livesdk.message.proto.XGLotteryMessage r0 = (com.bytedance.android.livesdk.message.proto.XGLotteryMessage) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f16604a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.XGLotteryMessage> r3 = com.bytedance.android.livesdk.message.proto.XGLotteryMessage.class
            r7[r9] = r3
            java.lang.Class<com.bytedance.android.livesdk.message.model.c> r8 = com.bytedance.android.livesdk.message.model.c.class
            r5 = 0
            r6 = 11106(0x2b62, float:1.5563E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f16604a
            r13 = 0
            r14 = 11106(0x2b62, float:1.5563E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.XGLotteryMessage> r0 = com.bytedance.android.livesdk.message.proto.XGLotteryMessage.class
            r15[r9] = r0
            java.lang.Class<com.bytedance.android.livesdk.message.model.c> r16 = com.bytedance.android.livesdk.message.model.c.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.message.model.c r0 = (com.bytedance.android.livesdk.message.model.c) r0
            return r0
        L_0x0039:
            com.bytedance.android.livesdk.message.model.bp r2 = new com.bytedance.android.livesdk.message.model.bp
            r2.<init>()
            com.bytedance.android.livesdk.message.proto.Common r3 = r0.common
            com.bytedance.android.livesdkapi.h.b r3 = com.bytedance.android.livesdk.message.a.a.a((com.bytedance.android.livesdk.message.proto.Common) r3)
            r2.baseMessage = r3
            com.bytedance.android.livesdk.message.proto.LotteryInfo r0 = r0.lottery_info
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.message.a.a.f16388a
            r13 = 1
            r14 = 10981(0x2ae5, float:1.5388E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryInfo> r3 = com.bytedance.android.livesdk.message.proto.LotteryInfo.class
            r15[r9] = r3
            java.lang.Class<com.bytedance.android.livesdk.i.a.b> r16 = com.bytedance.android.livesdk.i.a.b.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r4 = 0
            if (r3 == 0) goto L_0x007c
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.message.a.a.f16388a
            r13 = 1
            r14 = 10981(0x2ae5, float:1.5388E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryInfo> r0 = com.bytedance.android.livesdk.message.proto.LotteryInfo.class
            r15[r9] = r0
            java.lang.Class<com.bytedance.android.livesdk.i.a.b> r16 = com.bytedance.android.livesdk.i.a.b.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r4 = r0
            com.bytedance.android.livesdk.i.a.b r4 = (com.bytedance.android.livesdk.i.a.b) r4
            goto L_0x0271
        L_0x007c:
            if (r0 != 0) goto L_0x0080
            goto L_0x0271
        L_0x0080:
            com.bytedance.android.livesdk.i.a.b r3 = new com.bytedance.android.livesdk.i.a.b
            r3.<init>()
            java.lang.Long r5 = r0.lottery_id
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.f15552b = r5
            java.lang.Long r5 = r0.owner_user_id
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.f15553c = r5
            java.lang.Long r5 = r0.anchor_id
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.f15554d = r5
            java.lang.Integer r5 = r0.owner_type
            int r5 = r5.intValue()
            r3.f15555e = r5
            java.lang.Long r5 = r0.room_id
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.f15556f = r5
            java.lang.Integer r5 = r0.status
            int r5 = r5.intValue()
            r3.g = r5
            java.lang.Long r5 = r0.prize_count
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.j = r5
            java.lang.Long r5 = r0.lucky_count
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.k = r5
            java.lang.Long r5 = r0.start_time
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.l = r5
            java.lang.Long r5 = r0.draw_time
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.m = r5
            java.lang.String r5 = r0.extra
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.n = r5
            java.lang.Long r5 = r0.real_lucky_count
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.p = r5
            java.lang.Long r5 = r0.total_grant_count
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.q = r5
            java.lang.Long r5 = r0.withdraw_count
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.r = r5
            java.lang.Long r5 = r0.real_draw_time
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.s = r5
            java.lang.Long r5 = r0.current_time
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.o = r5
            com.bytedance.android.livesdk.message.proto.LotteryPrize r5 = r0.prize_info
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r5
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.i.a.d.f15563a
            r13 = 1
            r14 = 10855(0x2a67, float:1.5211E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryPrize> r6 = com.bytedance.android.livesdk.message.proto.LotteryPrize.class
            r15[r9] = r6
            java.lang.Class<com.bytedance.android.livesdk.i.a.d> r16 = com.bytedance.android.livesdk.i.a.d.class
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x0138
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r5
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.i.a.d.f15563a
            r13 = 1
            r14 = 10855(0x2a67, float:1.5211E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryPrize> r5 = com.bytedance.android.livesdk.message.proto.LotteryPrize.class
            r15[r9] = r5
            java.lang.Class<com.bytedance.android.livesdk.i.a.d> r16 = com.bytedance.android.livesdk.i.a.d.class
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.i.a.d r5 = (com.bytedance.android.livesdk.i.a.d) r5
            goto L_0x015a
        L_0x0138:
            if (r5 != 0) goto L_0x013c
            r5 = r4
            goto L_0x015a
        L_0x013c:
            com.bytedance.android.livesdk.i.a.d r6 = new com.bytedance.android.livesdk.i.a.d
            r6.<init>()
            java.lang.Long r7 = r5.prize_id
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.f15564b = r7
            java.lang.String r7 = r5.image
            r6.f15567e = r7
            java.lang.String r7 = r5.name
            r6.f15566d = r7
            java.lang.Integer r5 = r5.type
            int r5 = r5.intValue()
            r6.f15565c = r5
            r5 = r6
        L_0x015a:
            r3.h = r5
            java.util.List<com.bytedance.android.livesdk.message.proto.LotteryCondition> r5 = r0.conditions
            if (r5 == 0) goto L_0x01e4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.bytedance.android.livesdk.message.proto.LotteryCondition> r6 = r0.conditions
            java.util.Iterator r6 = r6.iterator()
        L_0x016b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01e2
            java.lang.Object r7 = r6.next()
            com.bytedance.android.livesdk.message.proto.LotteryCondition r7 = (com.bytedance.android.livesdk.message.proto.LotteryCondition) r7
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.i.a.a.f15545a
            r13 = 1
            r14 = 10852(0x2a64, float:1.5207E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryCondition> r8 = com.bytedance.android.livesdk.message.proto.LotteryCondition.class
            r15[r9] = r8
            java.lang.Class<com.bytedance.android.livesdk.i.a.a> r16 = com.bytedance.android.livesdk.i.a.a.class
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r8 == 0) goto L_0x01a8
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r7
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.i.a.a.f15545a
            r13 = 1
            r14 = 10852(0x2a64, float:1.5207E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryCondition> r7 = com.bytedance.android.livesdk.message.proto.LotteryCondition.class
            r15[r9] = r7
            java.lang.Class<com.bytedance.android.livesdk.i.a.a> r16 = com.bytedance.android.livesdk.i.a.a.class
            java.lang.Object r7 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.i.a.a r7 = (com.bytedance.android.livesdk.i.a.a) r7
            goto L_0x01de
        L_0x01a8:
            if (r7 != 0) goto L_0x01ac
            r7 = r4
            goto L_0x01de
        L_0x01ac:
            com.bytedance.android.livesdk.i.a.a r8 = new com.bytedance.android.livesdk.i.a.a
            r8.<init>()
            java.lang.Long r10 = r7.condition_id
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r8.f15546b = r10
            java.lang.String r10 = r7.content
            r8.f15548d = r10
            java.lang.String r10 = r7.description
            r8.f15550f = r10
            java.lang.Integer r10 = r7.status
            if (r10 != 0) goto L_0x01c7
            r10 = 0
            goto L_0x01cd
        L_0x01c7:
            java.lang.Integer r10 = r7.status
            int r10 = r10.intValue()
        L_0x01cd:
            r8.f15549e = r10
            java.lang.Integer r10 = r7.type
            if (r10 != 0) goto L_0x01d5
            r7 = 0
            goto L_0x01db
        L_0x01d5:
            java.lang.Integer r7 = r7.type
            int r7 = r7.intValue()
        L_0x01db:
            r8.f15547c = r7
            r7 = r8
        L_0x01de:
            r5.add(r7)
            goto L_0x016b
        L_0x01e2:
            r3.i = r5
        L_0x01e4:
            java.util.List<com.bytedance.android.livesdk.message.proto.LotteryLuckyUser> r5 = r0.lucky_users
            if (r5 == 0) goto L_0x0270
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List<com.bytedance.android.livesdk.message.proto.LotteryLuckyUser> r0 = r0.lucky_users
            java.util.Iterator r0 = r0.iterator()
        L_0x01f3:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x026e
            java.lang.Object r6 = r0.next()
            com.bytedance.android.livesdk.message.proto.LotteryLuckyUser r6 = (com.bytedance.android.livesdk.message.proto.LotteryLuckyUser) r6
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r6
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.i.a.c.f15557a
            r13 = 1
            r14 = 10854(0x2a66, float:1.521E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryLuckyUser> r7 = com.bytedance.android.livesdk.message.proto.LotteryLuckyUser.class
            r15[r9] = r7
            java.lang.Class<com.bytedance.android.livesdk.i.a.c> r16 = com.bytedance.android.livesdk.i.a.c.class
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r7 == 0) goto L_0x0230
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r6
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.i.a.c.f15557a
            r13 = 1
            r14 = 10854(0x2a66, float:1.521E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.message.proto.LotteryLuckyUser> r6 = com.bytedance.android.livesdk.message.proto.LotteryLuckyUser.class
            r15[r9] = r6
            java.lang.Class<com.bytedance.android.livesdk.i.a.c> r16 = com.bytedance.android.livesdk.i.a.c.class
            java.lang.Object r6 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.i.a.c r6 = (com.bytedance.android.livesdk.i.a.c) r6
            goto L_0x026a
        L_0x0230:
            if (r6 != 0) goto L_0x0234
            r6 = r4
            goto L_0x026a
        L_0x0234:
            com.bytedance.android.livesdk.i.a.c r7 = new com.bytedance.android.livesdk.i.a.c
            r7.<init>()
            java.lang.String r8 = r6.avatar_url
            r7.g = r8
            java.lang.Long r8 = r6.grant_count
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.h = r8
            java.lang.Long r8 = r6.lottery_id
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.f15559c = r8
            java.lang.Long r8 = r6.lucky_id
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.f15558b = r8
            java.lang.Long r8 = r6.room_id
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.f15560d = r8
            java.lang.Long r8 = r6.user_id
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.f15561e = r8
            java.lang.String r6 = r6.user_name
            r7.f15562f = r6
            r6 = r7
        L_0x026a:
            r5.add(r6)
            goto L_0x01f3
        L_0x026e:
            r3.t = r5
        L_0x0270:
            r4 = r3
        L_0x0271:
            r2.f16605b = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.message.model.bp.wrap(com.squareup.wire.Message):com.bytedance.android.livesdk.message.model.c");
    }
}
