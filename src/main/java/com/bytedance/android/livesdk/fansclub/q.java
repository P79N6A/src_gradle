package com.bytedance.android.livesdk.fansclub;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13904a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveFansClubEntryWidget f13905b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13906c;

    q(LiveFansClubEntryWidget liveFansClubEntryWidget, String str) {
        this.f13905b = liveFansClubEntryWidget;
        this.f13906c = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r7 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f13904a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 8347(0x209b, float:1.1697E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0034
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r2 = f13904a
            r3 = 0
            r4 = 8347(0x209b, float:1.1697E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0034:
            com.bytedance.android.livesdk.fansclub.LiveFansClubEntryWidget r0 = r7.f13905b
            java.lang.String r1 = r7.f13906c
            com.bytedance.android.livesdk.v.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.host.d r2 = r2.a()
            boolean r2 = r2.k()
            if (r2 == 0) goto L_0x004d
            r0 = 2131563904(0x7f0d1580, float:1.8753278E38)
            com.bytedance.android.livesdk.utils.ai.a((int) r0)
            return
        L_0x004d:
            com.bytedance.android.live.base.model.user.User r2 = r0.f13868e
            if (r2 == 0) goto L_0x005c
            com.bytedance.android.live.base.model.user.User r2 = r0.f13868e
            com.bytedance.android.live.base.model.FansClubMember r2 = r2.getFansClub()
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = "1"
            goto L_0x005e
        L_0x005c:
            java.lang.String r2 = "0"
        L_0x005e:
            com.bytedance.android.livesdk.j.a r3 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r4 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r3 = r3.a((java.lang.Class) r4)
            boolean r4 = r3 instanceof com.bytedance.android.livesdk.j.b.k
            if (r4 == 0) goto L_0x0302
            com.bytedance.android.livesdk.j.b.k r3 = (com.bytedance.android.livesdk.j.b.k) r3
            java.util.Map r4 = r3.a()
            java.lang.String r5 = "enter_from"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x0083
            java.util.Map r4 = r3.a()
            java.lang.String r5 = "enter_from"
            r4.get(r5)
        L_0x0083:
            java.util.Map r4 = r3.a()
            java.lang.String r5 = "source"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x0098
            java.util.Map r4 = r3.a()
            java.lang.String r5 = "source"
            r4.get(r5)
        L_0x0098:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r5 = "enter_from_merge"
            java.lang.Object r5 = r4.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "enter_method"
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00cf
            java.util.Map r6 = r3.a()
            java.lang.String r8 = "enter_from_merge"
            boolean r6 = r6.containsKey(r8)
            if (r6 == 0) goto L_0x00cf
            java.util.Map r5 = r3.a()
            java.lang.String r6 = "enter_from_merge"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x00cf
            java.lang.String r5 = ""
        L_0x00cf:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x00f2
            java.util.Map r6 = r3.a()
            java.lang.String r8 = "enter_method"
            boolean r6 = r6.containsKey(r8)
            if (r6 == 0) goto L_0x00f2
            java.util.Map r3 = r3.a()
            java.lang.String r4 = "enter_method"
            java.lang.Object r3 = r3.get(r4)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00f2
            java.lang.String r4 = ""
        L_0x00f2:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r6 = "https://webcast.amemv.com/falcon/webcast_douyin/page/fansclub/index.html?room_id=%s&anchor_id=%s&user_id=%s&enter_from=%s&enter_from_merge=%s&enter_method=%s&event_module=%s&isFans=%s"
            r8 = 8
            java.lang.Object[] r11 = new java.lang.Object[r8]
            com.bytedance.android.livesdkapi.depend.model.live.Room r12 = r0.f13867d
            long r12 = r12.getId()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r10] = r12
            com.bytedance.android.livesdkapi.depend.model.live.Room r12 = r0.f13867d
            com.bytedance.android.live.base.model.user.User r12 = r12.getOwner()
            long r12 = r12.getId()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r11[r9] = r12
            com.bytedance.android.livesdk.v.e r12 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r12 = r12.k()
            long r12 = r12.b()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 2
            r11[r13] = r12
            r12 = 3
            r11[r12] = r1
            r1 = 4
            r11[r1] = r5
            r14 = 5
            r11[r14] = r4
            java.lang.String r15 = "top"
            r16 = 6
            r11[r16] = r15
            r15 = 7
            r11[r15] = r2
            java.lang.String r2 = java.lang.String.format(r3, r6, r11)
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r0.dataCenter
            java.lang.String r6 = "data_is_anchor"
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Object r3 = r3.get((java.lang.String) r6, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r0.j = r3
            boolean r3 = com.bytedance.android.live.uikit.a.a.f()
            if (r3 == 0) goto L_0x022e
            boolean r2 = r0.j
            if (r2 == 0) goto L_0x015e
            java.lang.String r2 = "https://webcast.ixigua.com/falcon/webcast_xigua/page/fansclub_anchor/index.html?fans_status=%s&nickname=%s&fans_count=%s&is_fans=%s&fans_name=%s&anchor_avatar=%s&enter_from_merge=%s&enter_method=%s&log_pb=%s&request_id=%s"
            goto L_0x0167
        L_0x015e:
            boolean r2 = r0.i
            if (r2 == 0) goto L_0x0165
            java.lang.String r2 = "https://webcast.ixigua.com/falcon/webcast_xigua/page/fansclub_audience_rank/index.html?fans_status=%s&nickname=%s&fans_count=%s&is_fans=%s&fans_name=%s&anchor_avatar=%s&enter_from_merge=%s&enter_method=%s&log_pb=%s&request_id=%s"
            goto L_0x0167
        L_0x0165:
            java.lang.String r2 = "https://webcast.ixigua.com/falcon/webcast_xigua/page/fansclub_audience_home/index.html?fans_status=%s&nickname=%s&fans_count=%s&is_fans=%s&fans_name=%s&anchor_avatar=%s&enter_from_merge=%s&enter_method=%s&log_pb=%s&request_id=%s"
        L_0x0167:
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r0.f13867d
            com.bytedance.android.live.base.model.user.User r3 = r3.getOwner()
            com.bytedance.android.live.base.model.ImageModel r3 = r3.getAvatarThumb()
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x0188
            java.util.List r3 = r3.getUrls()
            if (r3 == 0) goto L_0x0188
            int r11 = r3.size()
            if (r11 <= 0) goto L_0x0188
            java.lang.Object r3 = r3.get(r10)
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
        L_0x0188:
            java.lang.String r3 = ""
            java.lang.String r11 = ""
            com.bytedance.android.livesdk.j.a r8 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r15 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            com.bytedance.android.livesdk.j.b.g r8 = r8.a((java.lang.Class) r15)
            boolean r15 = r8 instanceof com.bytedance.android.livesdk.j.b.n
            if (r15 == 0) goto L_0x01db
            java.util.Map r15 = r8.a()
            java.lang.String r14 = "log_pb"
            boolean r14 = r15.containsKey(r14)
            if (r14 == 0) goto L_0x01b6
            java.util.Map r3 = r8.a()
            java.lang.String r14 = "log_pb"
            java.lang.Object r3 = r3.get(r14)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x01b6
            java.lang.String r3 = ""
        L_0x01b6:
            java.util.Map r14 = r8.a()
            java.lang.String r15 = "request_id"
            boolean r14 = r14.containsKey(r15)
            if (r14 == 0) goto L_0x01db
            java.util.Map r8 = r8.a()
            java.lang.String r11 = "request_id"
            java.lang.Object r8 = r8.get(r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x01d9
            java.lang.String r8 = "\""
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x01db
        L_0x01d9:
            java.lang.String r11 = ""
        L_0x01db:
            java.lang.String r8 = "utf-8"
            java.lang.String r8 = java.net.URLEncoder.encode(r6, r8)     // Catch:{ UnsupportedEncodingException -> 0x01e9 }
            java.lang.String r6 = "utf-8"
            java.lang.String r6 = java.net.URLEncoder.encode(r3, r6)     // Catch:{ UnsupportedEncodingException -> 0x01ea }
            r3 = r6
            goto L_0x01ea
        L_0x01e9:
            r8 = r6
        L_0x01ea:
            java.util.Locale r6 = java.util.Locale.US
            r14 = 10
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r15 = r0.h
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r14[r10] = r15
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r0.f13867d
            com.bytedance.android.live.base.model.user.User r15 = r15.getOwner()
            java.lang.String r15 = r15.getNickName()
            r14[r9] = r15
            r17 = r11
            long r10 = r0.g
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            r14[r13] = r9
            boolean r9 = r0.i
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r14[r12] = r9
            java.lang.String r9 = r0.f13869f
            r14[r1] = r9
            r1 = 5
            r14[r1] = r8
            r14[r16] = r5
            r1 = 7
            r14[r1] = r4
            r1 = 8
            r14[r1] = r3
            r1 = 9
            r14[r1] = r17
            java.lang.String r2 = java.lang.String.format(r6, r2, r14)
        L_0x022e:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r0.dataCenter
            java.lang.String r3 = "data_is_portrait"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r1.get((java.lang.String) r3, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.content.Context r3 = r0.context
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r4 = r3.widthPixels
            float r4 = (float) r4
            float r5 = r3.density
            float r4 = r4 / r5
            int r4 = (int) r4
            int r5 = r3.heightPixels
            float r5 = (float) r5
            float r3 = r3.density
            float r5 = r5 / r3
            int r3 = (int) r5
            r5 = 440(0x1b8, float:6.17E-43)
            if (r1 == 0) goto L_0x027b
            boolean r3 = com.bytedance.android.live.uikit.a.a.f()
            if (r3 == 0) goto L_0x0278
            boolean r3 = r0.j
            if (r3 == 0) goto L_0x026c
            int r3 = r0.h
            if (r3 != r12) goto L_0x0269
            goto L_0x0273
        L_0x0269:
            r5 = 320(0x140, float:4.48E-43)
            goto L_0x0273
        L_0x026c:
            boolean r3 = r0.i
            if (r3 == 0) goto L_0x0271
            goto L_0x0273
        L_0x0271:
            r5 = 300(0x12c, float:4.2E-43)
        L_0x0273:
            int r5 = r5 * r4
            int r3 = r5 / 375
            goto L_0x029e
        L_0x0278:
            r3 = 440(0x1b8, float:6.17E-43)
            goto L_0x029e
        L_0x027b:
            android.content.Context r4 = r0.getContext()
            int r4 = com.bytedance.android.livesdk.utils.ak.a(r4)
            android.content.Context r5 = r0.getContext()
            float r4 = (float) r4
            int r4 = com.bytedance.common.utility.UIUtils.px2dip(r5, r4)
            boolean r5 = com.bytedance.android.live.uikit.a.a.f()
            if (r5 == 0) goto L_0x029e
            boolean r5 = r0.j
            if (r5 == 0) goto L_0x029e
            int r5 = r0.h
            if (r5 == r12) goto L_0x029e
            int r3 = r3 * 320
            int r3 = r3 / 375
        L_0x029e:
            com.bytedance.android.live.core.widget.BaseDialogFragment r5 = r0.f13866c
            if (r5 == 0) goto L_0x02aa
            com.bytedance.android.live.core.widget.BaseDialogFragment r5 = r0.f13866c
            r5.dismissAllowingStateLoss()
            r5 = 0
            r0.f13866c = r5
        L_0x02aa:
            com.bytedance.android.livesdk.v.f r5 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.browser.c.b r5 = r5.f()
            com.bytedance.android.livesdk.browser.c.b$b r2 = com.bytedance.android.livesdk.browser.c.c.a(r2)
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.a((int) r4)
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.b((int) r3)
            if (r1 == 0) goto L_0x02c2
            r3 = 0
            goto L_0x02c4
        L_0x02c2:
            r3 = 8
        L_0x02c4:
            if (r1 == 0) goto L_0x02ca
            r4 = 0
        L_0x02c7:
            r6 = 8
            goto L_0x02cd
        L_0x02ca:
            r4 = 8
            goto L_0x02c7
        L_0x02cd:
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.a(r6, r6, r3, r4)
            r3 = r1 ^ 1
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.b((boolean) r3)
            if (r1 == 0) goto L_0x02da
            r6 = 0
        L_0x02da:
            com.bytedance.android.livesdk.browser.c.b$b r2 = r2.c((int) r6)
            if (r1 == 0) goto L_0x02e3
            r1 = 80
            goto L_0x02e6
        L_0x02e3:
            r1 = 8388613(0x800005, float:1.175495E-38)
        L_0x02e6:
            com.bytedance.android.livesdk.browser.c.b$b r1 = r2.e(r1)
            r2 = 0
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.c((boolean) r2)
            com.bytedance.android.live.core.widget.BaseDialogFragment r1 = r5.a((com.bytedance.android.livesdk.browser.c.b.C0073b) r1)
            r0.f13866c = r1
            com.bytedance.android.live.core.widget.BaseDialogFragment r1 = r0.f13866c
            if (r1 == 0) goto L_0x0302
            android.content.Context r1 = r0.context
            android.support.v4.app.FragmentActivity r1 = (android.support.v4.app.FragmentActivity) r1
            com.bytedance.android.live.core.widget.BaseDialogFragment r0 = r0.f13866c
            com.bytedance.android.live.core.widget.BaseDialogFragment.a((android.support.v4.app.FragmentActivity) r1, (android.support.v4.app.DialogFragment) r0)
        L_0x0302:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.fansclub.q.onClick(android.view.View):void");
    }
}
