package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.android.livesdk.chatroom.presenter.a;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BottomRightBannerWidget extends LiveRecyclableWidget implements Observer<KVData>, a.C0093a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12363a;

    /* renamed from: b  reason: collision with root package name */
    a f12364b;

    /* renamed from: c  reason: collision with root package name */
    b.e f12365c;

    /* renamed from: d  reason: collision with root package name */
    Room f12366d;

    /* renamed from: e  reason: collision with root package name */
    boolean f12367e;

    /* renamed from: f  reason: collision with root package name */
    b f12368f;
    f g;
    public boolean h;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12363a, false, 6583, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12363a, false, 6583, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12363a, false, 6584, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12363a, false, 6584, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.aow;
    }

    public void onClear() {
        if (PatchProxy.isSupport(new Object[0], this, f12363a, false, 6578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12363a, false, 6578, new Class[0], Void.TYPE);
            return;
        }
        super.onClear();
        this.f12368f.a(this.f12365c);
        this.f12365c = null;
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12363a, false, 6577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12363a, false, 6577, new Class[0], Void.TYPE);
            return;
        }
        this.f12364b.d();
        this.dataCenter.removeObserver(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.bytedance.ies.sdk.widgets.KVData r7 = (com.bytedance.ies.sdk.widgets.KVData) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12363a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6579(0x19b3, float:9.219E-42)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12363a
            r3 = 0
            r4 = 6579(0x19b3, float:9.219E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            if (r7 == 0) goto L_0x00ca
            java.lang.String r0 = r7.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.Object r0 = r7.getData()
            if (r0 != 0) goto L_0x0047
            goto L_0x00ca
        L_0x0047:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -2104158356(0xffffffff8295176c, float:-2.1907026E-37)
            if (r2 == r3) goto L_0x0074
            r3 = -1357019912(0xffffffffaf1d84f8, float:-1.4326307E-10)
            if (r2 == r3) goto L_0x006a
            r3 = 1060055221(0x3f2f28b5, float:0.6842149)
            if (r2 == r3) goto L_0x0060
            goto L_0x007e
        L_0x0060:
            java.lang.String r2 = "data_keyboard_status"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r0 = 1
            goto L_0x007f
        L_0x006a:
            java.lang.String r2 = "data_pre_show_keyboard"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r0 = 0
            goto L_0x007f
        L_0x0074:
            java.lang.String r2 = "data_xt_landscape_tab_change"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007e
            r0 = 2
            goto L_0x007f
        L_0x007e:
            r0 = -1
        L_0x007f:
            switch(r0) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x00a3;
                case 2: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x00c9
        L_0x0083:
            java.lang.Object r0 = r7.getData()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r7.getData()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x009d
            android.view.View r0 = r10.contentView
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x009d:
            android.view.View r0 = r10.contentView
            r0.setVisibility(r9)
            goto L_0x00c9
        L_0x00a3:
            java.lang.Object r0 = r7.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.android.livesdk.browser.c.b$e r1 = r10.f12365c
            if (r1 == 0) goto L_0x00c9
            com.bytedance.android.livesdk.browser.c.b$e r1 = r10.f12365c
            com.bytedance.android.livesdk.browser.view.RoundRectWebView r1 = r1.f9317b
            if (r1 == 0) goto L_0x00c9
            if (r0 == 0) goto L_0x00c1
            com.bytedance.android.livesdk.browser.c.b$e r0 = r10.f12365c
            com.bytedance.android.livesdk.browser.view.RoundRectWebView r0 = r0.f9317b
            r0.setFocusable(r9)
            return
        L_0x00c1:
            com.bytedance.android.livesdk.browser.c.b$e r0 = r10.f12365c
            com.bytedance.android.livesdk.browser.view.RoundRectWebView r0 = r0.f9317b
            r0.setFocusable(r8)
            return
        L_0x00c9:
            return
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.onChanged(java.lang.Object):void");
    }

    @SuppressLint({"AnonymousInnerClass"})
    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12363a, false, 6575, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12363a, false, 6575, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12368f = j.q().f();
        try {
            this.f12365c = this.f12368f.a((Activity) this.context, (b.d) new f(this));
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("BottomRightBannerWidget", th);
        }
        if (this.f12365c != null) {
            if (Build.VERSION.SDK_INT <= 19) {
                this.f12365c.f9317b.setLayerType(1, null);
            }
            this.f12365c.f9317b.setBackgroundColor(0);
            this.f12365c.f9317b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ((ViewGroup) this.contentView).addView(this.f12365c.f9317b);
        }
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12363a, false, 6576, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12363a, false, 6576, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        if (this.f12365c != null) {
            this.f12365c.f9317b.setVisibility(4);
        }
        this.f12367e = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12366d = (Room) this.dataCenter.get("data_room");
        this.f12364b = new a(this.f12366d, this.f12367e);
        this.f12364b.a((a.C0093a) this);
        com.bytedance.android.livesdk.banner.a aVar = (com.bytedance.android.livesdk.banner.a) this.dataCenter.get("data_in_room_banner_manager", null);
        if (aVar != null) {
            ((ab) aVar.a(Long.valueOf(this.f12366d.getId())).as(autoDispose())).a(new g(this), new h(this));
        }
        this.dataCenter.observe("data_pre_show_keyboard", this).observe("data_xt_landscape_tab_change", this).observe("data_keyboard_status", this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.message.model.ae r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f12363a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ae> r1 = com.bytedance.android.livesdk.message.model.ae.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 6582(0x19b6, float:9.223E-42)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f12363a
            r3 = 0
            r4 = 6582(0x19b6, float:9.223E-42)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.message.model.ae> r1 = com.bytedance.android.livesdk.message.model.ae.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            boolean r0 = r9.isViewValid()
            if (r0 == 0) goto L_0x0118
            if (r10 == 0) goto L_0x0118
            com.bytedance.android.livesdk.browser.c.b$e r0 = r9.f12365c
            if (r0 != 0) goto L_0x003e
            goto L_0x0118
        L_0x003e:
            com.bytedance.android.livesdk.v.f r0 = com.bytedance.android.livesdk.v.j.q()     // Catch:{ Exception -> 0x0117 }
            com.google.gson.Gson r0 = r0.c()     // Catch:{ Exception -> 0x0117 }
            com.google.gson.JsonObject r1 = r10.f16442b     // Catch:{ Exception -> 0x0117 }
            java.lang.String r0 = r0.toJson((com.google.gson.JsonElement) r1)     // Catch:{ Exception -> 0x0117 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0117 }
            r1.<init>()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r2 = "type"
            java.lang.String r3 = "refresh"
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r2 = "data"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0117 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0117 }
            r0.<init>()     // Catch:{ Exception -> 0x0117 }
            com.bytedance.android.livesdk.j.a r2 = com.bytedance.android.livesdk.j.a.a()     // Catch:{ Exception -> 0x0117 }
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r3 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r2 = r2.a((java.lang.Class) r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            boolean r5 = r2 instanceof com.bytedance.android.livesdk.j.b.k     // Catch:{ Exception -> 0x0117 }
            if (r5 == 0) goto L_0x00b6
            com.bytedance.android.livesdk.j.b.k r2 = (com.bytedance.android.livesdk.j.b.k) r2     // Catch:{ Exception -> 0x0117 }
            java.util.Map r3 = r2.a()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = "enter_from"
            boolean r3 = r3.containsKey(r4)     // Catch:{ Exception -> 0x0117 }
            if (r3 == 0) goto L_0x008b
            java.util.Map r3 = r2.a()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = "enter_from"
            r3.get(r4)     // Catch:{ Exception -> 0x0117 }
        L_0x008b:
            java.util.Map r3 = r2.a()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = "source"
            boolean r3 = r3.containsKey(r4)     // Catch:{ Exception -> 0x0117 }
            if (r3 == 0) goto L_0x00a0
            java.util.Map r2 = r2.a()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "source"
            r2.get(r3)     // Catch:{ Exception -> 0x0117 }
        L_0x00a0:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0117 }
            r2.<init>()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "enter_from_merge"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = "enter_method"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x0117 }
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0117 }
        L_0x00b6:
            java.lang.String r2 = "enter_from_merge"
            org.json.JSONObject r2 = r0.put(r2, r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "enter_method"
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "event_page"
            boolean r4 = r9.f12367e     // Catch:{ Exception -> 0x0117 }
            if (r4 == 0) goto L_0x00cb
            java.lang.String r4 = "live_take_detail"
            goto L_0x00cd
        L_0x00cb:
            java.lang.String r4 = "live_detail"
        L_0x00cd:
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f12366d     // Catch:{ Exception -> 0x0117 }
            long r4 = r4.getId()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0117 }
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f12366d     // Catch:{ Exception -> 0x0117 }
            long r4 = r4.getOwnerUserId()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0117 }
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "request_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f12366d     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = r4.getRequestId()     // Catch:{ Exception -> 0x0117 }
            org.json.JSONObject r2 = r2.put(r3, r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "log_pb"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r9.f12366d     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = r4.getLog_pb()     // Catch:{ Exception -> 0x0117 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r2 = "log"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0117 }
            com.bytedance.android.livesdk.browser.c.b r0 = r9.f12368f     // Catch:{ Exception -> 0x0117 }
            com.bytedance.android.livesdk.browser.c.b$e r2 = r9.f12365c     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "H5_roomStatusChange"
            r0.a((com.bytedance.android.livesdk.browser.c.b.e) r2, (java.lang.String) r3, (org.json.JSONObject) r1)     // Catch:{ Exception -> 0x0117 }
            return
        L_0x0117:
            return
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.a(com.bytedance.android.livesdk.message.model.ae):void");
    }
}
