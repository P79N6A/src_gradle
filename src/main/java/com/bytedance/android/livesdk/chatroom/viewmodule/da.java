package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class da implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13142a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget f13143b;

    da(LiveShareWidget liveShareWidget) {
        this.f13143b = liveShareWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r4.equals("data_user_in_room") != false) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f13142a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 7248(0x1c50, float:1.0157E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f13142a
            r13 = 0
            r14 = 7248(0x1c50, float:1.0157E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            r2 = r17
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r3 = r2.f13143b
            r0 = r18
            com.bytedance.ies.sdk.widgets.KVData r0 = (com.bytedance.ies.sdk.widgets.KVData) r0
            boolean r4 = r3.isViewValid()
            if (r4 == 0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            java.lang.String r4 = r0.getKey()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x004d
            goto L_0x008b
        L_0x004d:
            java.lang.String r4 = r0.getKey()
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -1741164106(0xffffffff9837f1b6, float:-2.3774228E-24)
            if (r6 == r7) goto L_0x006b
            r1 = 239745881(0xe4a3b59, float:2.4926997E-30)
            if (r6 == r1) goto L_0x0061
            goto L_0x0074
        L_0x0061:
            java.lang.String r1 = "cmd_wanna_share_live"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0074
            r1 = 0
            goto L_0x0075
        L_0x006b:
            java.lang.String r6 = "data_user_in_room"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = -1
        L_0x0075:
            switch(r1) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x008a
        L_0x0079:
            java.lang.Object r0 = r0.getData()
            boolean r1 = r0 instanceof com.bytedance.android.live.base.model.user.User
            if (r1 == 0) goto L_0x008a
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            r3.f12660d = r0
            goto L_0x008a
        L_0x0086:
            r3.a()
            return
        L_0x008a:
            return
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.da.onChanged(java.lang.Object):void");
    }
}
