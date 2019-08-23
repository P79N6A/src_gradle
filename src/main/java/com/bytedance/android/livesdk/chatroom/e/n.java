package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ab;
import com.bytedance.android.livesdk.message.model.av;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class n extends a<av> {
    public static ChangeQuickRedirect j;

    public final ImageModel a() {
        return null;
    }

    public final int b() {
        return 2130841264;
    }

    public final boolean d() {
        return true;
    }

    public final String g() {
        return "#ff8533";
    }

    public final User e() {
        return ((av) this.f10013b).f16505b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        if (r3 > 0) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.text.Spannable l() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = j
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.text.Spannable> r7 = android.text.Spannable.class
            r4 = 0
            r5 = 5395(0x1513, float:7.56E-42)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = j
            r5 = 0
            r6 = 5395(0x1513, float:7.56E-42)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.text.Spannable> r8 = android.text.Spannable.class
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.text.Spannable r0 = (android.text.Spannable) r0
            return r0
        L_0x0026:
            r1 = 0
            com.bytedance.android.livesdkapi.service.c r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            com.bytedance.android.livesdkapi.depend.d.n r2 = r2.d()
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.a()
            boolean r3 = com.bytedance.android.livesdkapi.depend.model.live.Room.isValid(r2)
            if (r3 == 0) goto L_0x0042
            com.bytedance.android.live.base.model.user.User r2 = r2.getOwner()
            long r2 = r2.getId()
            goto L_0x0044
        L_0x0042:
            r2 = 0
        L_0x0044:
            com.bytedance.android.livesdk.message.model.c r4 = r11.f10013b
            com.bytedance.android.livesdk.message.model.av r4 = (com.bytedance.android.livesdk.message.model.av) r4
            com.bytedance.android.live.base.model.user.User r4 = r4.f16505b
            if (r4 == 0) goto L_0x0070
            com.bytedance.android.livesdk.message.model.c r1 = r11.f10013b
            com.bytedance.android.livesdk.message.model.av r1 = (com.bytedance.android.livesdk.message.model.av) r1
            com.bytedance.android.live.base.model.user.User r1 = r1.f16505b
            long r4 = r1.getId()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0062
            r1 = 2131563120(0x7f0d1270, float:1.8751688E38)
            java.lang.String r1 = com.bytedance.android.live.core.utils.ac.a((int) r1)
            goto L_0x0070
        L_0x0062:
            com.bytedance.android.livesdk.message.model.c r1 = r11.f10013b
            com.bytedance.android.livesdk.message.model.av r1 = (com.bytedance.android.livesdk.message.model.av) r1
            com.bytedance.android.live.base.model.user.User r1 = r1.f16505b
            java.lang.String r1 = r1.getNickName()
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = ""
        L_0x0070:
            T r2 = r11.f10013b
            com.bytedance.android.livesdk.message.model.av r2 = (com.bytedance.android.livesdk.message.model.av) r2
            int r2 = r2.f16507d
            com.bytedance.android.livesdk.message.model.c r3 = r11.f10013b
            com.bytedance.android.livesdk.message.model.av r3 = (com.bytedance.android.livesdk.message.model.av) r3
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = com.bytedance.android.livesdk.message.model.av.f16504a
            r7 = 0
            r8 = 11084(0x2b4c, float:1.5532E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Integer.TYPE
            r5 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x00a3
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = com.bytedance.android.livesdk.message.model.av.f16504a
            r7 = 0
            r8 = 11084(0x2b4c, float:1.5532E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Integer.TYPE
            r5 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x00ba
        L_0x00a3:
            int r4 = r3.f16509f
            if (r4 <= 0) goto L_0x00b9
            int r4 = r3.f16509f
            long r5 = com.bytedance.android.livesdk.utils.ah.a()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            int r5 = (int) r5
            int r3 = r3.f16508e
            int r5 = r5 - r3
            int r3 = r4 - r5
            if (r3 <= 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            com.bytedance.android.livesdk.message.model.c r4 = r11.f10013b
            com.bytedance.android.livesdk.message.model.av r4 = (com.bytedance.android.livesdk.message.model.av) r4
            boolean r4 = r4.k
            r5 = 1
            r6 = 2
            if (r4 != 0) goto L_0x00ef
            if (r3 <= 0) goto L_0x00ef
            r2 = 60
            if (r3 >= r2) goto L_0x00dc
            r2 = 2131564124(0x7f0d165c, float:1.8753724E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r0] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4[r5] = r0
            java.lang.String r0 = com.bytedance.android.live.core.utils.ac.a((int) r2, (java.lang.Object[]) r4)
            goto L_0x0100
        L_0x00dc:
            r4 = 2131564123(0x7f0d165b, float:1.8753722E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r0] = r1
            int r3 = r3 / r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r6[r5] = r0
            java.lang.String r0 = com.bytedance.android.live.core.utils.ac.a((int) r4, (java.lang.Object[]) r6)
            goto L_0x0100
        L_0x00ef:
            r3 = 2131564125(0x7f0d165d, float:1.8753726E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r0] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r4[r5] = r0
            java.lang.String r0 = com.bytedance.android.live.core.utils.ac.a((int) r3, (java.lang.Object[]) r4)
        L_0x0100:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.e.n.l():android.text.Spannable");
    }

    n(av avVar) {
        super(avVar);
    }

    public final void a(Context context, Room room) {
        if (PatchProxy.isSupport(new Object[]{context, room}, this, j, false, 5396, new Class[]{Context.class, Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, room}, this, j, false, 5396, new Class[]{Context.class, Room.class}, Void.TYPE);
            return;
        }
        ab abVar = new ab(1);
        abVar.f10134b = this.f10013b;
        a.a().a((Object) abVar);
    }
}
