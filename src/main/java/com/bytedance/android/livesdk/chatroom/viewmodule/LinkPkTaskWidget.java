package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.c.c;
import com.bytedance.android.livesdk.chatroom.interact.c.gs;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class LinkPkTaskWidget extends LinkCrossRoomWidget.SubWidget implements Observer<KVData>, gs.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f12637e;

    /* renamed from: f  reason: collision with root package name */
    public b f12638f;
    public b.e g;
    private ViewGroup h;
    private gs i;
    private boolean j;
    private long k;
    private a l;

    final class a implements Observer<KVData>, b.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12639a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f12639a, false, 7175, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12639a, false, 7175, new Class[0], Void.TYPE);
                return;
            }
            LinkPkTaskWidget.this.f12607b.removeObserver(this);
        }

        private a() {
        }

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            KVData kVData = (KVData) obj;
            if (PatchProxy.isSupport(new Object[]{kVData}, this, f12639a, false, 7173, new Class[]{KVData.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{kVData}, this, f12639a, false, 7173, new Class[]{KVData.class}, Void.TYPE);
            } else if (kVData != null && kVData.getData() != null) {
                List<String> list = (List) kVData.getData();
                for (String str : list) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f12639a, false, 7174, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f12639a, false, 7174, new Class[]{String.class}, Void.TYPE);
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("data", str);
                            jSONObject.put("type", "json");
                        } catch (JSONException e2) {
                            LinkPkTaskWidget.this.a((Throwable) e2);
                        }
                        LinkPkTaskWidget.this.f12638f.a(LinkPkTaskWidget.this.g, "H5_commonMessage", jSONObject);
                    }
                }
                list.clear();
            }
        }

        /* synthetic */ a(LinkPkTaskWidget linkPkTaskWidget, byte b2) {
            this();
        }

        public final void a(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f12639a, false, 7172, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f12639a, false, 7172, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            LinkPkTaskWidget.this.f12607b.observeForever("data_banner_pending_data", this, true);
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12637e, false, 7170, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12637e, false, 7170, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12637e, false, 7171, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12637e, false, 7171, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12637e, false, 7165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12637e, false, 7165, new Class[0], Void.TYPE);
        } else if (!this.j) {
            this.j = true;
            if (this.l != null) {
                this.l.a();
            }
            this.l = new a(this, (byte) 0);
            this.g = this.f12638f.a((Activity) this.context, (b.d) this.l);
            if (Build.VERSION.SDK_INT <= 19) {
                this.g.f9317b.setLayerType(1, null);
            }
            this.g.f9317b.setBackgroundColor(0);
            this.g.f9317b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.h.addView(this.g.f9317b);
            this.g.f9317b.setVisibility(4);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12637e, false, 7166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12637e, false, 7166, new Class[0], Void.TYPE);
            return;
        }
        c();
        this.f12638f.a(this.g, Uri.parse("https://hotsoon.snssdk.com/falcon/live_inroom/page/pk_gift_task/index.html").buildUpon().appendQueryParameter("channel_id", String.valueOf(this.f12607b.f9030d)).appendQueryParameter("battle_id", String.valueOf(this.f12607b.f9031e)).appendQueryParameter("anchor_id", String.valueOf(this.f12608c.getOwner().getId())).appendQueryParameter("user_id", String.valueOf(this.k)).toString());
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12637e, false, 7163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12637e, false, 7163, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.k = TTLiveSDKContext.getHostService().k().b();
        this.h = (ViewGroup) this.contentView.findViewById(C0906R.id.dx3);
        this.f12638f = j.q().f();
        this.dataCenter.observe("data_pre_show_keyboard", this).observe("data_keyboard_status", this);
        this.f12607b.observe("cmd_show_gift_task_info", this).observe("cmd_show_steal_tower_info", this).observeForever("data_pk_state", this);
        this.i = new gs();
        this.i.a((gs.a) this);
        b();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12637e, false, 7164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12637e, false, 7164, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f12638f.a(this.g);
        if (this.i != null) {
            this.i.d();
        }
        if (this.l != null) {
            this.l.a();
        }
        this.f12607b.removeObserver(this);
        this.dataCenter.removeObserver(this);
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12637e, false, 7169, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12637e, false, 7169, new Class[]{String.class}, Void.TYPE);
            return;
        }
        BaseDialogFragment.a((FragmentActivity) this.context, (DialogFragment) j.q().f().a(c.a(str).a(280).b(384)));
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12637e, false, 7167, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12637e, false, 7167, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            this.g.f9317b.setVisibility(4);
        } else {
            this.g.f9317b.setVisibility(0);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
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
            com.meituan.robust.ChangeQuickRedirect r2 = f12637e
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7162(0x1bfa, float:1.0036E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f12637e
            r3 = 0
            r4 = 7162(0x1bfa, float:1.0036E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            if (r7 == 0) goto L_0x00fc
            java.lang.Object r0 = r7.getData()
            if (r0 != 0) goto L_0x003d
            goto L_0x00fc
        L_0x003d:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -2082923311: goto L_0x0072;
                case -1357019912: goto L_0x0068;
                case 855900630: goto L_0x005e;
                case 1060055221: goto L_0x0054;
                case 1505611330: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x007c
        L_0x004a:
            java.lang.String r2 = "data_pk_state"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007c
            r0 = 2
            goto L_0x007d
        L_0x0054:
            java.lang.String r2 = "data_keyboard_status"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x005e:
            java.lang.String r2 = "cmd_show_gift_task_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007c
            r0 = 3
            goto L_0x007d
        L_0x0068:
            java.lang.String r2 = "data_pre_show_keyboard"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007c
            r0 = 0
            goto L_0x007d
        L_0x0072:
            java.lang.String r2 = "cmd_show_steal_tower_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007c
            r0 = 4
            goto L_0x007d
        L_0x007c:
            r0 = -1
        L_0x007d:
            switch(r0) {
                case 0: goto L_0x00cc;
                case 1: goto L_0x00cc;
                case 2: goto L_0x008f;
                case 3: goto L_0x0089;
                case 4: goto L_0x0082;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00fb
        L_0x0082:
            java.lang.String r0 = "https://hotsoon.snssdk.com/falcon/live_inroom/page/pk_task_intro/index.html"
            r10.a((java.lang.String) r0)
            goto L_0x00fb
        L_0x0089:
            java.lang.String r0 = "https://hotsoon.snssdk.com/falcon/live_inroom/page/pk_task_intro/index.html?show_task=true"
            r10.a((java.lang.String) r0)
            return
        L_0x008f:
            java.lang.Object r0 = r7.getData()
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder$d r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.d.PENAL
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00fb
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f12637e
            r3 = 0
            r4 = 7168(0x1c00, float:1.0045E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00bd
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f12637e
            r3 = 0
            r4 = 7168(0x1c00, float:1.0045E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00fb
        L_0x00bd:
            android.view.ViewGroup r0 = r10.h
            r0.removeAllViews()
            com.bytedance.android.livesdk.browser.c.b r0 = r10.f12638f
            com.bytedance.android.livesdk.browser.c.b$e r1 = r10.g
            r0.a((com.bytedance.android.livesdk.browser.c.b.e) r1)
            r10.j = r9
            return
        L_0x00cc:
            java.lang.Object r0 = r7.getData()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.bytedance.android.livesdk.browser.c.b$e r1 = r10.g
            if (r1 == 0) goto L_0x00f1
            com.bytedance.android.livesdk.browser.c.b$e r1 = r10.g
            com.bytedance.android.livesdk.browser.view.RoundRectWebView r1 = r1.f9317b
            if (r1 == 0) goto L_0x00f1
            if (r0 == 0) goto L_0x00ea
            com.bytedance.android.livesdk.browser.c.b$e r1 = r10.g
            com.bytedance.android.livesdk.browser.view.RoundRectWebView r1 = r1.f9317b
            r1.setFocusable(r9)
            goto L_0x00f1
        L_0x00ea:
            com.bytedance.android.livesdk.browser.c.b$e r1 = r10.g
            com.bytedance.android.livesdk.browser.view.RoundRectWebView r1 = r1.f9317b
            r1.setFocusable(r8)
        L_0x00f1:
            android.view.ViewGroup r1 = r10.h
            if (r0 == 0) goto L_0x00f7
            r9 = 8
        L_0x00f7:
            r1.setVisibility(r9)
            return
        L_0x00fb:
            return
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget.onChanged(java.lang.Object):void");
    }

    LinkPkTaskWidget(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
    }
}
