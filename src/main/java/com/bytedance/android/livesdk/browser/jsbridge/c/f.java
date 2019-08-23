package com.bytedance.android.livesdk.browser.jsbridge.c;

import android.content.Context;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import java.lang.ref.WeakReference;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9465a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f9466b;

    public f(WeakReference<Context> weakReference) {
        this.f9466b = weakReference;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r13v3, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r13v15 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x039d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(com.bytedance.ies.f.a.h r20, org.json.JSONObject r21) throws java.lang.Exception {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.f.a.h> r1 = com.bytedance.ies.f.a.h.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 3634(0xe32, float:5.092E-42)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3634(0xe32, float:5.092E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.bytedance.ies.f.a.h> r1 = com.bytedance.ies.f.a.h.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            org.json.JSONObject r0 = r8.f20623d
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            return
        L_0x005e:
            org.json.JSONObject r1 = r8.f20623d
            java.lang.String r2 = "args"
            boolean r1 = r1.has(r2)
            r13 = 0
            if (r1 == 0) goto L_0x0073
            org.json.JSONObject r1 = r8.f20623d
            java.lang.String r2 = "args"
            org.json.JSONObject r1 = r1.getJSONObject(r2)
            r14 = r1
            goto L_0x0074
        L_0x0073:
            r14 = r13
        L_0x0074:
            int r1 = r0.hashCode()
            r15 = -1
            r16 = 8
            switch(r1) {
                case -1949693950: goto L_0x00f4;
                case -1932693274: goto L_0x00ea;
                case -1361632588: goto L_0x00df;
                case -309425751: goto L_0x00d5;
                case -191501435: goto L_0x00cb;
                case 3322092: goto L_0x00c0;
                case 3506395: goto L_0x00b6;
                case 65209337: goto L_0x00ac;
                case 505229877: goto L_0x00a2;
                case 1152538955: goto L_0x0097;
                case 1224424441: goto L_0x008b;
                case 1654221230: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x00fe
        L_0x0080:
            java.lang.String r1 = "login_panel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 4
            goto L_0x00ff
        L_0x008b:
            java.lang.String r1 = "webview"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 8
            goto L_0x00ff
        L_0x0097:
            java.lang.String r1 = "upload_poster"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 11
            goto L_0x00ff
        L_0x00a2:
            java.lang.String r1 = "gift_panel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 1
            goto L_0x00ff
        L_0x00ac:
            java.lang.String r1 = "comments_panel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 2
            goto L_0x00ff
        L_0x00b6:
            java.lang.String r1 = "room"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 3
            goto L_0x00ff
        L_0x00c0:
            java.lang.String r1 = "live"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 10
            goto L_0x00ff
        L_0x00cb:
            java.lang.String r1 = "feedback"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 5
            goto L_0x00ff
        L_0x00d5:
            java.lang.String r1 = "profile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 0
            goto L_0x00ff
        L_0x00df:
            java.lang.String r1 = "charge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 9
            goto L_0x00ff
        L_0x00ea:
            java.lang.String r1 = "webview_popup"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 7
            goto L_0x00ff
        L_0x00f4:
            java.lang.String r1 = "feedback_send"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fe
            r0 = 6
            goto L_0x00ff
        L_0x00fe:
            r0 = -1
        L_0x00ff:
            switch(r0) {
                case 0: goto L_0x0711;
                case 1: goto L_0x06f0;
                case 2: goto L_0x06b5;
                case 3: goto L_0x053a;
                case 4: goto L_0x04b5;
                case 5: goto L_0x0442;
                case 6: goto L_0x03d4;
                case 7: goto L_0x022f;
                case 8: goto L_0x0183;
                case 9: goto L_0x0127;
                case 10: goto L_0x0118;
                case 11: goto L_0x0109;
                default: goto L_0x0102;
            }
        L_0x0102:
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            goto L_0x0783
        L_0x0109:
            com.bytedance.android.livesdk.g.d r0 = new com.bytedance.android.livesdk.g.d
            r0.<init>()
            r0.f14634a = r12
            com.bytedance.android.livesdk.u.a r1 = com.bytedance.android.livesdk.u.a.a()
            r1.a((java.lang.Object) r0)
            return
        L_0x0118:
            com.bytedance.android.livesdk.g.d r0 = new com.bytedance.android.livesdk.g.d
            r0.<init>()
            r0.f14634a = r11
            com.bytedance.android.livesdk.u.a r1 = com.bytedance.android.livesdk.u.a.a()
            r1.a((java.lang.Object) r0)
            return
        L_0x0127:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3642(0xe3a, float:5.104E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0164
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3642(0xe3a, float:5.104E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x0164:
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x017d
            com.bytedance.android.livesdk.v.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.host.IHostApp r1 = r1.c()
            android.app.Activity r0 = (android.app.Activity) r0
            r1.a((android.app.Activity) r0)
        L_0x017d:
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            return
        L_0x0183:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3641(0xe39, float:5.102E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01c0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3641(0xe39, float:5.102E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x01c0:
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r14 == 0) goto L_0x0228
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f9466b
            if (r1 != 0) goto L_0x01cf
            goto L_0x0228
        L_0x01cf:
            java.lang.String r1 = "url"
            java.lang.String r1 = r14.optString(r1)
            java.lang.String r2 = "title"
            java.lang.String r2 = r14.optString(r2)
            java.lang.String r3 = "hide_nav_bar"
            java.lang.String r3 = r14.optString(r3)
            java.lang.String r4 = "hide_status_bar"
            java.lang.String r4 = r14.optString(r4)
            com.bytedance.android.livesdk.v.f r5 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.browser.c.b r5 = r5.f()
            com.bytedance.android.livesdk.browser.c.b$a r1 = com.bytedance.android.livesdk.browser.c.c.b(r1)
            com.bytedance.android.livesdk.browser.c.b$a r1 = r1.a((java.lang.String) r2)
            java.lang.String r2 = "1"
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            com.bytedance.android.livesdk.browser.c.b$a r1 = r1.b((boolean) r2)
            java.lang.String r2 = "status_bar_color"
            java.lang.String r2 = r14.optString(r2)
            com.bytedance.android.livesdk.browser.c.b$a r1 = r1.b((java.lang.String) r2)
            java.lang.String r2 = "status_bar_bg_color"
            java.lang.String r2 = r14.optString(r2)
            com.bytedance.android.livesdk.browser.c.b$a r1 = r1.c(r2)
            java.lang.String r2 = "1"
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            com.bytedance.android.livesdk.browser.c.b$a r1 = r1.a((boolean) r2)
            r5.a((android.content.Context) r0, (com.bytedance.android.livesdk.browser.c.b.a) r1)
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            return
        L_0x0228:
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            goto L_0x0783
        L_0x022f:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3640(0xe38, float:5.101E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x026c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3640(0xe38, float:5.101E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x026c:
            if (r14 == 0) goto L_0x03cd
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            if (r0 == 0) goto L_0x03cd
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x03cd
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            java.lang.Object r0 = r0.get()
            boolean r0 = r0 instanceof android.support.v4.app.FragmentActivity
            if (r0 != 0) goto L_0x0286
            goto L_0x03cd
        L_0x0286:
            boolean r0 = com.bytedance.android.live.core.utils.ac.f()
            java.lang.String r1 = "width"
            if (r0 == 0) goto L_0x0293
            int r2 = com.bytedance.android.live.core.utils.ac.c()
            goto L_0x0297
        L_0x0293:
            int r2 = com.bytedance.android.live.core.utils.ac.b()
        L_0x0297:
            float r2 = com.bytedance.android.live.core.utils.ac.e(r2)
            int r2 = (int) r2
            int r1 = r14.optInt(r1, r2)
            if (r1 > 0) goto L_0x02b2
            if (r0 == 0) goto L_0x02a9
            int r1 = com.bytedance.android.live.core.utils.ac.c()
            goto L_0x02ad
        L_0x02a9:
            int r1 = com.bytedance.android.live.core.utils.ac.b()
        L_0x02ad:
            float r1 = com.bytedance.android.live.core.utils.ac.e(r1)
            int r1 = (int) r1
        L_0x02b2:
            java.lang.String r2 = "height"
            r3 = 400(0x190, float:5.6E-43)
            int r2 = r14.optInt(r2, r3)
            java.lang.String r3 = "radius"
            int r3 = r14.optInt(r3, r11)
            java.lang.String r4 = "radius_top_left"
            int r4 = r14.optInt(r4, r11)
            java.lang.String r5 = "radius_top_right"
            int r5 = r14.optInt(r5, r11)
            java.lang.String r6 = "radius_bottom_right"
            int r6 = r14.optInt(r6, r11)
            java.lang.String r8 = "radius_bottom_left"
            int r8 = r14.optInt(r8, r11)
            java.lang.String r10 = "margin"
            int r10 = r14.optInt(r10, r11)
            boolean r13 = com.bytedance.android.live.uikit.a.a.f()
            if (r13 == 0) goto L_0x02ea
            if (r0 != 0) goto L_0x02ea
            if (r10 != 0) goto L_0x02ea
            r10 = 8
        L_0x02ea:
            java.lang.String r0 = "gravity"
            boolean r0 = r14.has(r0)
            r13 = 80
            if (r0 == 0) goto L_0x0345
            java.lang.String r0 = "gravity"
            java.lang.String r0 = r14.optString(r0)
            java.lang.String r15 = "right"
            boolean r15 = android.text.TextUtils.equals(r0, r15)
            if (r15 != 0) goto L_0x0341
            java.lang.String r15 = "end"
            boolean r15 = android.text.TextUtils.equals(r0, r15)
            if (r15 == 0) goto L_0x030b
            goto L_0x0341
        L_0x030b:
            java.lang.String r15 = "left"
            boolean r15 = android.text.TextUtils.equals(r0, r15)
            if (r15 != 0) goto L_0x033d
            java.lang.String r15 = "start"
            boolean r15 = android.text.TextUtils.equals(r0, r15)
            if (r15 == 0) goto L_0x031c
            goto L_0x033d
        L_0x031c:
            java.lang.String r15 = "top"
            boolean r15 = android.text.TextUtils.equals(r0, r15)
            if (r15 == 0) goto L_0x0327
            r0 = 48
            goto L_0x0346
        L_0x0327:
            java.lang.String r15 = "bottom"
            boolean r15 = android.text.TextUtils.equals(r0, r15)
            if (r15 == 0) goto L_0x0332
            r0 = 80
            goto L_0x0346
        L_0x0332:
            java.lang.String r15 = "center"
            boolean r0 = android.text.TextUtils.equals(r0, r15)
            if (r0 == 0) goto L_0x0345
            r0 = 17
            goto L_0x0346
        L_0x033d:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            goto L_0x0346
        L_0x0341:
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L_0x0346
        L_0x0345:
            r0 = 0
        L_0x0346:
            if (r0 != r13) goto L_0x035e
            java.lang.String r13 = "radius_top_left"
            boolean r13 = r14.has(r13)
            if (r13 != 0) goto L_0x035e
            java.lang.String r13 = "radius_top_right"
            boolean r13 = r14.has(r13)
            if (r13 != 0) goto L_0x035e
            r4 = 8
            r5 = 8
            r6 = 0
            r8 = 0
        L_0x035e:
            java.lang.String r11 = "from_label"
            java.lang.String r11 = r14.optString(r11)
            java.lang.String r13 = "url"
            java.lang.String r13 = r14.getString(r13)
            com.bytedance.android.livesdk.browser.c.b$b r13 = com.bytedance.android.livesdk.browser.c.c.a(r13)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r13.a((int) r1)
            com.bytedance.android.livesdk.browser.c.b$b r1 = r1.b((int) r2)
            com.bytedance.android.livesdk.browser.c.b$b r0 = r1.e(r0)
            com.bytedance.android.livesdk.browser.c.b$b r0 = r0.a((java.lang.String) r11)
            com.bytedance.android.livesdk.browser.c.b$b r0 = r0.c((int) r10)
            com.bytedance.android.livesdk.browser.c.b$b r0 = r0.b((boolean) r12)
            java.lang.String r1 = "radius"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0392
            r0.d(r3)
            goto L_0x0395
        L_0x0392:
            r0.a(r4, r5, r6, r8)
        L_0x0395:
            java.lang.String r1 = "monitor"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03b0
            java.lang.String r1 = "monitor"
            org.json.JSONObject r1 = r14.optJSONObject(r1)
            java.lang.String r2 = "service"
            java.lang.String r1 = r1.optString(r2)
            com.bytedance.android.live.b.b r1 = com.bytedance.android.livesdk.wallet.b.b.a((java.lang.String) r1)
            r0.a((com.bytedance.android.live.b.b) r1)
        L_0x03b0:
            com.bytedance.android.livesdk.v.f r1 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.browser.c.b r1 = r1.f()
            com.bytedance.android.live.core.widget.BaseDialogFragment r0 = r1.a((com.bytedance.android.livesdk.browser.c.b.C0073b) r0)
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f9466b
            java.lang.Object r1 = r1.get()
            android.support.v4.app.FragmentActivity r1 = (android.support.v4.app.FragmentActivity) r1
            com.bytedance.android.live.core.widget.BaseDialogFragment.a((android.support.v4.app.FragmentActivity) r1, (android.support.v4.app.DialogFragment) r0)
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            return
        L_0x03cd:
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            goto L_0x0783
        L_0x03d4:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3639(0xe37, float:5.1E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0411
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3639(0xe37, float:5.1E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x0411:
            if (r14 != 0) goto L_0x041a
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            goto L_0x0783
        L_0x041a:
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            com.bytedance.android.livesdk.v.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.schema.b r1 = r1.i()
            java.lang.String r2 = "source"
            java.lang.String r2 = r14.optString(r2)
            r1.a((java.lang.String) r2, (android.content.Context) r0)
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x043c
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
        L_0x043c:
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            return
        L_0x0442:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3638(0xe36, float:5.098E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x047f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3638(0xe36, float:5.098E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x047f:
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0490
            java.lang.String r0 = "feedback_id"
            r14.optInt(r0, r15)
            java.lang.String r0 = "source"
            java.lang.String r1 = ""
            java.lang.String r0 = r14.optString(r0, r1)
        L_0x0490:
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f9466b
            if (r1 == 0) goto L_0x04b4
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f9466b
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x04b4
            java.lang.ref.WeakReference<android.content.Context> r1 = r7.f9466b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            com.bytedance.android.livesdk.v.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.schema.b r2 = r2.i()
            r2.a((java.lang.String) r0, (android.content.Context) r1)
            java.lang.String r0 = "code"
            r9.put(r0, r12)
        L_0x04b4:
            return
        L_0x04b5:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3637(0xe35, float:5.097E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04f2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3637(0xe35, float:5.097E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x04f2:
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            if (r0 == 0) goto L_0x04ff
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            java.lang.Object r0 = r0.get()
            r13 = r0
            android.content.Context r13 = (android.content.Context) r13
        L_0x04ff:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            boolean r1 = r0.c()
            if (r1 != 0) goto L_0x0539
            com.bytedance.android.livesdk.user.i$a r1 = com.bytedance.android.livesdk.user.i.a()
            r2 = 2131564108(0x7f0d164c, float:1.8753692E38)
            java.lang.String r2 = com.bytedance.android.live.core.utils.ac.a((int) r2)
            com.bytedance.android.livesdk.user.i$a r1 = r1.a((java.lang.String) r2)
            com.bytedance.android.livesdk.user.i$a r1 = r1.a((int) r15)
            com.bytedance.android.livesdk.user.i r1 = r1.a()
            io.reactivex.Observable r0 = r0.a(r13, r1)
            com.bytedance.android.livesdk.user.g r1 = new com.bytedance.android.livesdk.user.g
            r1.<init>()
            r0.subscribe((io.reactivex.Observer<? super T>) r1)
            if (r9 == 0) goto L_0x0539
            java.lang.String r0 = "code"
            r9.put(r0, r12)     // Catch:{ JSONException -> 0x0539 }
            goto L_0x0783
        L_0x0539:
            return
        L_0x053a:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3636(0xe34, float:5.095E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0577
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3636(0xe34, float:5.095E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x0577:
            if (r14 == 0) goto L_0x06ae
            java.lang.String r0 = "room_id"
            boolean r0 = r14.has(r0)
            if (r0 != 0) goto L_0x0583
            goto L_0x06ae
        L_0x0583:
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            if (r0 == 0) goto L_0x0591
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f9466b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r8 = r0
            goto L_0x0592
        L_0x0591:
            r8 = r13
        L_0x0592:
            if (r8 != 0) goto L_0x059b
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            goto L_0x0783
        L_0x059b:
            java.lang.String r0 = "room_id"
            java.lang.String r0 = r14.getString(r0)
            long r5 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "log_extra"
            boolean r0 = r14.has(r0)
            if (r0 == 0) goto L_0x05b3
            java.lang.String r0 = "log_extra"
            org.json.JSONObject r13 = r14.getJSONObject(r0)
        L_0x05b3:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3643(0xe3b, float:5.105E-42)
            java.lang.Class[] r10 = new java.lang.Class[r12]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r10[r11] = r1
            java.lang.Class<android.os.Bundle> r15 = android.os.Bundle.class
            r1 = r19
            r17 = r5
            r5 = r10
            r6 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x05ea
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3643(0xe3b, float:5.105E-42)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.os.Bundle r0 = (android.os.Bundle) r0
            goto L_0x0631
        L_0x05ea:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r13 == 0) goto L_0x0631
            java.util.Iterator r1 = r13.keys()
        L_0x05f5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0631
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r13.get(r2)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.Byte
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.Character
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.Double
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.Float
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.Short
            if (r4 != 0) goto L_0x0629
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x05f5
        L_0x0629:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.putString(r2, r3)
            goto L_0x05f5
        L_0x0631:
            if (r0 == 0) goto L_0x063a
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "h5"
            r0.putString(r1, r2)
        L_0x063a:
            com.bytedance.android.livesdk.v.f r1 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.schema.a.a r1 = r1.m()
            com.bytedance.android.livesdk.schema.a.b$a r2 = new com.bytedance.android.livesdk.schema.a.b$a
            r2.<init>()
            r3 = r17
            com.bytedance.android.livesdk.schema.a.b$a r2 = r2.a((long) r3)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "web"
            java.lang.String r3 = r14.optString(r3, r4)
            com.bytedance.android.livesdk.schema.a.b$a r2 = r2.a((java.lang.String) r3)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "web"
            java.lang.String r3 = r14.optString(r3, r4)
            com.bytedance.android.livesdk.schema.a.b$a r2 = r2.c(r3)
            java.lang.String r3 = "enter_from_merge"
            java.lang.String r4 = "h5"
            java.lang.String r3 = r14.optString(r3, r4)
            com.bytedance.android.livesdk.schema.a.b$a r2 = r2.i(r3)
            java.lang.String r3 = "gift_panel"
            boolean r3 = r14.optBoolean(r3, r11)
            r2.k = r3
            java.lang.String r3 = "prop_panel"
            boolean r3 = r14.optBoolean(r3, r11)
            r2.l = r3
            java.lang.String r3 = "enter_method"
            java.lang.String r4 = "h5"
            java.lang.String r3 = r14.optString(r3, r4)
            com.bytedance.android.livesdk.schema.a.b$a r2 = r2.j(r3)
            boolean r3 = com.bytedance.android.live.uikit.a.a.f()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.bytedance.android.livesdk.schema.a.b$a r2 = r2.k(r3)
            r2.m = r0
            boolean r0 = r1.a((android.content.Context) r8, (com.bytedance.android.livesdk.schema.a.b.a) r2)
            if (r0 == 0) goto L_0x06a8
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            goto L_0x0783
        L_0x06a8:
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            return
        L_0x06ae:
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            goto L_0x0783
        L_0x06b5:
            org.json.JSONObject r0 = r8.f20623d
            java.lang.String r1 = "args"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x06e3
            org.json.JSONObject r0 = r8.f20623d
            java.lang.String r1 = "args"
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            java.lang.String r1 = "enableDanmaku"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L_0x06e3
            org.json.JSONObject r0 = r8.f20623d
            java.lang.String r1 = "args"
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            java.lang.String r1 = "enableDanmaku"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "1"
            boolean r11 = android.text.TextUtils.equals(r0, r1)
        L_0x06e3:
            com.bytedance.android.livesdkapi.service.c r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            r0.a((boolean) r11)
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            return
        L_0x06f0:
            java.lang.String r0 = "gift"
            org.json.JSONObject r1 = r8.f20623d
            java.lang.String r2 = "panel_type"
            boolean r1 = r1.has(r2)
            if (r1 == 0) goto L_0x0704
            org.json.JSONObject r0 = r8.f20623d
            java.lang.String r1 = "panel_type"
            java.lang.String r0 = r0.getString(r1)
        L_0x0704:
            com.bytedance.android.livesdkapi.service.c r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getLiveService()
            r1.a((java.lang.String) r0, (boolean) r11)
            java.lang.String r0 = "code"
            r9.put(r0, r12)
            return
        L_0x0711:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3635(0xe33, float:5.094E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x074d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r14
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f9465a
            r3 = 0
            r4 = 3635(0xe33, float:5.094E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0783
        L_0x074d:
            if (r14 != 0) goto L_0x0755
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            goto L_0x0783
        L_0x0755:
            java.lang.String r0 = "user_id"
            java.lang.String r0 = r14.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0767
            java.lang.String r0 = "code"
            r9.put(r0, r11)
            goto L_0x0783
        L_0x0767:
            com.bytedance.android.livesdk.v.f r1 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.schema.a.a r1 = r1.m()
            long r2 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "type"
            java.lang.String r0 = r14.optString(r0)
            boolean r0 = r1.a(r2, r0, r13)
            java.lang.String r1 = "code"
            r9.put(r1, r0)
            return
        L_0x0783:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.c.f.call(com.bytedance.ies.f.a.h, org.json.JSONObject):void");
    }
}
