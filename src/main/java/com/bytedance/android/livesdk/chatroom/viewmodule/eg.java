package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class eg implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13213a;

    /* renamed from: b  reason: collision with root package name */
    private final RechargeWidget f13214b;

    eg(RechargeWidget rechargeWidget) {
        this.f13214b = rechargeWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0195, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f13213a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 7455(0x1d1f, float:1.0447E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f13213a
            r13 = 0
            r14 = 7455(0x1d1f, float:1.0447E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            r2 = r17
            com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget r3 = r2.f13214b
            r0 = r18
            com.bytedance.ies.sdk.widgets.KVData r0 = (com.bytedance.ies.sdk.widgets.KVData) r0
            if (r0 == 0) goto L_0x0197
            java.lang.String r4 = r0.getKey()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0048
            goto L_0x0197
        L_0x0048:
            java.lang.String r4 = r0.getKey()
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -187819389(0xfffffffff4ce1a83, float:-1.3063365E32)
            if (r6 == r7) goto L_0x0066
            r7 = 1257343548(0x4af18a3c, float:7914782.0)
            if (r6 == r7) goto L_0x005c
            goto L_0x006f
        L_0x005c:
            java.lang.String r6 = "cmd_show_pay_dialog"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x006f
            r5 = 1
            goto L_0x006f
        L_0x0066:
            java.lang.String r6 = "cmd_show_recharge_dialog"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x006f
            r5 = 0
        L_0x006f:
            switch(r5) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0196
        L_0x0074:
            java.lang.Object r0 = r0.getData()
            com.bytedance.android.livesdk.chatroom.event.af r0 = (com.bytedance.android.livesdk.chatroom.event.af) r0
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget.f12785a
            r13 = 0
            r14 = 7454(0x1d1e, float:1.0445E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.af> r4 = com.bytedance.android.livesdk.chatroom.event.af.class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x00a8
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget.f12785a
            r13 = 0
            r14 = 7454(0x1d1e, float:1.0445E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.af> r0 = com.bytedance.android.livesdk.chatroom.event.af.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x00a8:
            if (r0 == 0) goto L_0x0196
            com.bytedance.android.livesdkapi.depend.model.a r4 = r0.f10139a
            java.lang.String r5 = r0.f10140b
            com.bytedance.android.livesdk.wallet.a r6 = r3.f12786b
            if (r6 != 0) goto L_0x00c3
            com.bytedance.android.livesdk.wallet.ae r6 = new com.bytedance.android.livesdk.wallet.ae
            android.content.Context r11 = r3.context
            r12 = 0
            java.lang.String r14 = "live_detail"
            int r15 = r0.f10142d
            r10 = r6
            r13 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            r3.f12786b = r6
            goto L_0x00d0
        L_0x00c3:
            com.bytedance.android.livesdk.wallet.a r6 = r3.f12786b
            boolean r6 = r6.isShowing()
            if (r6 == 0) goto L_0x00d0
            com.bytedance.android.livesdk.wallet.a r6 = r3.f12786b
            r6.dismiss()
        L_0x00d0:
            com.bytedance.android.livesdk.wallet.a r6 = r3.f12786b
            r6.a(r4)
            com.bytedance.android.livesdk.wallet.a r6 = r3.f12786b
            r6.setCanceledOnTouchOutside(r1)
            com.bytedance.android.livesdk.wallet.a r3 = r3.f12786b
            r3.show()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            int r6 = r4.f18682e
            int r4 = r4.f18683f
            int r6 = r6 + r4
            java.lang.String r4 = "money"
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r3.put(r4, r6)
            java.lang.String r4 = "request_page"
            java.lang.String r6 = "live_detail"
            r3.put(r4, r6)
            java.lang.String r4 = "charge_reason"
            r3.put(r4, r5)
            int r4 = r0.f10142d
            r5 = 2
            if (r4 != r1) goto L_0x0106
            java.lang.String r0 = "first_recharge"
            goto L_0x010f
        L_0x0106:
            int r0 = r0.f10142d
            if (r0 != r5) goto L_0x010d
            java.lang.String r0 = "small_heart"
            goto L_0x010f
        L_0x010d:
            java.lang.String r0 = "normal"
        L_0x010f:
            java.lang.String r4 = "panel_position"
            r3.put(r4, r0)
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r4 = "livesdk_check_out_show"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r6 = com.bytedance.android.livesdk.j.c.j.class
            r5[r9] = r6
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r6 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r5[r1] = r6
            r0.a(r4, r3, r5)
            goto L_0x0196
        L_0x0129:
            java.lang.Object r0 = r0.getData()
            com.bytedance.android.livesdk.chatroom.event.ag r0 = (com.bytedance.android.livesdk.chatroom.event.ag) r0
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget.f12785a
            r13 = 0
            r14 = 7451(0x1d1b, float:1.0441E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.ag> r4 = com.bytedance.android.livesdk.chatroom.event.ag.class
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x015d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget.f12785a
            r13 = 0
            r14 = 7451(0x1d1b, float:1.0441E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.ag> r0 = com.bytedance.android.livesdk.chatroom.event.ag.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0196
        L_0x015d:
            int r4 = r0.f10143a
            switch(r4) {
                case 0: goto L_0x0175;
                case 1: goto L_0x0169;
                case 2: goto L_0x0163;
                default: goto L_0x0162;
            }
        L_0x0162:
            goto L_0x0195
        L_0x0163:
            java.lang.String r0 = r0.f10145c
            r3.a((java.lang.String) r0)
            goto L_0x0195
        L_0x0169:
            java.lang.String r1 = r0.f10145c
            java.lang.String r4 = r0.f10146d
            java.lang.String r5 = r0.f10147e
            int r0 = r0.f10144b
            r3.a(r1, r4, r5, r0)
            goto L_0x0196
        L_0x0175:
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r4 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE
            java.lang.Object r4 = r4.a()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r1) goto L_0x018f
            java.lang.String r1 = r0.f10145c
            java.lang.String r4 = r0.f10146d
            java.lang.String r5 = r0.f10147e
            int r0 = r0.f10144b
            r3.a(r1, r4, r5, r0)
            goto L_0x0196
        L_0x018f:
            java.lang.String r0 = r0.f10145c
            r3.a((java.lang.String) r0)
            goto L_0x0196
        L_0x0195:
            return
        L_0x0196:
            return
        L_0x0197:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.eg.onChanged(java.lang.Object):void");
    }
}
