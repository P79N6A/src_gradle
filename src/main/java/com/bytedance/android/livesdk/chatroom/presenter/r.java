package com.bytedance.android.livesdk.chatroom.presenter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.gift.a.a;
import com.bytedance.android.live.gift.a.b;
import com.bytedance.android.live.gift.a.c;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.bytedance.android.livesdk.chatroom.event.ag;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.message.model.ad;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;

public final class r extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11390a;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f11391b;

    /* renamed from: c  reason: collision with root package name */
    public final Room f11392c;

    /* renamed from: d  reason: collision with root package name */
    public IMessageManager f11393d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f11394e;

    /* renamed from: f  reason: collision with root package name */
    private b f11395f;

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11390a, false, 5190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11390a, false, 5190, new Class[0], Void.TYPE);
            return;
        }
        if (b() != null) {
            ((c) b()).a();
        }
        this.f11395f = null;
        super.d();
    }

    public r(DataCenter dataCenter) {
        this.f11391b = dataCenter;
        this.f11392c = (Room) dataCenter.get("data_room");
        this.f11394e = ((Boolean) dataCenter.get("data_is_anchor")).booleanValue();
    }

    public final /* synthetic */ void a(com.bytedance.ies.a.a aVar) {
        c cVar = (c) aVar;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f11390a, false, 5189, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f11390a, false, 5189, new Class[]{c.class}, Void.TYPE);
            return;
        }
        super.a(cVar);
        this.f11393d = (IMessageManager) this.f11391b.get("data_message_manager");
        this.f11395f = new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11396a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f11396a, false, 5192, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11396a, false, 5192, new Class[0], Void.TYPE);
                    return;
                }
                ag agVar = new ag(0, "live_detail", "gift_guide");
                ai.a((int) C0906R.string.dje);
                r.this.f11391b.lambda$put$1$DataCenter("cmd_show_recharge_dialog", agVar);
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f11396a, false, 5195, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11396a, false, 5195, new Class[0], Void.TYPE);
                    return;
                }
                if (r.this.b() != null) {
                    ai.a((int) C0906R.string.d2r);
                }
            }

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f11396a, false, 5193, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f11396a, false, 5193, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (r.this.b() != null) {
                    ai.a(str);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.String} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.bytedance.android.livesdk.gift.model.i r10) {
                /*
                    r9 = this;
                    r7 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r8 = 0
                    r0[r8] = r10
                    com.meituan.robust.ChangeQuickRedirect r2 = f11396a
                    java.lang.Class[] r5 = new java.lang.Class[r7]
                    java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                    r5[r8] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 5194(0x144a, float:7.278E-42)
                    r1 = r9
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0030
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r0[r8] = r10
                    com.meituan.robust.ChangeQuickRedirect r2 = f11396a
                    r3 = 0
                    r4 = 5194(0x144a, float:7.278E-42)
                    java.lang.Class[] r5 = new java.lang.Class[r7]
                    java.lang.Class<com.bytedance.android.livesdk.gift.model.i> r1 = com.bytedance.android.livesdk.gift.model.i.class
                    r5[r8] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0030:
                    com.bytedance.android.livesdk.chatroom.presenter.r r0 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.ies.a.a r0 = r0.b()
                    if (r0 == 0) goto L_0x0043
                    com.bytedance.android.livesdk.chatroom.presenter.r r0 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.ies.a.a r0 = r0.b()
                    com.bytedance.android.live.gift.a.c r0 = (com.bytedance.android.live.gift.a.c) r0
                    r0.a()
                L_0x0043:
                    com.bytedance.android.livesdk.chatroom.presenter.r r0 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.f11391b
                    java.lang.String r1 = "data_user_in_room"
                    java.lang.Object r0 = r0.get(r1)
                    com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
                    com.bytedance.android.livesdk.chatroom.presenter.r r1 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.ss.ugc.live.sdk.message.interfaces.IMessageManager r1 = r1.f11393d
                    com.bytedance.android.livesdk.chatroom.presenter.r r2 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.f11392c
                    long r2 = r2.getId()
                    com.bytedance.android.livesdk.message.model.ab r0 = com.bytedance.android.livesdk.gift.l.a(r2, r10, r0)
                    r1.insertMessage(r0)
                    com.bytedance.android.livesdk.chatroom.presenter.r r0 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.f11391b
                    java.lang.String r1 = "log_enter_live_source"
                    r0.get(r1)
                    com.bytedance.android.livesdk.chatroom.presenter.r r0 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.ies.sdk.widgets.DataCenter r0 = r0.f11391b
                    java.lang.String r1 = "log_action_type"
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.String r0 = (java.lang.String) r0
                    com.bytedance.android.livesdk.j.a r1 = com.bytedance.android.livesdk.j.a.a()
                    java.lang.Class<com.bytedance.android.livesdk.j.c.j> r2 = com.bytedance.android.livesdk.j.c.j.class
                    com.bytedance.android.livesdk.j.b.g r1 = r1.a((java.lang.Class) r2)
                    java.lang.String r2 = ""
                    java.lang.String r3 = ""
                    java.util.Map r4 = r1.a()
                    java.lang.String r5 = "source"
                    boolean r4 = r4.containsKey(r5)
                    if (r4 == 0) goto L_0x009d
                    java.util.Map r3 = r1.a()
                    java.lang.String r4 = "source"
                    java.lang.Object r3 = r3.get(r4)
                    java.lang.String r3 = (java.lang.String) r3
                L_0x009d:
                    java.util.Map r4 = r1.a()
                    java.lang.String r5 = "enter_from"
                    boolean r4 = r4.containsKey(r5)
                    if (r4 == 0) goto L_0x00b6
                    java.util.Map r1 = r1.a()
                    java.lang.String r2 = "enter_from"
                    java.lang.Object r1 = r1.get(r2)
                    r2 = r1
                    java.lang.String r2 = (java.lang.String) r2
                L_0x00b6:
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    java.lang.String r4 = "event_type"
                    java.lang.String r5 = "core"
                    r1.put(r4, r5)
                    java.lang.String r4 = "event_belong"
                    java.lang.String r5 = "live_interact"
                    r1.put(r4, r5)
                    java.lang.String r4 = "event_page"
                    java.lang.String r5 = "live_detail"
                    r1.put(r4, r5)
                    java.lang.String r4 = "room_id"
                    com.bytedance.android.livesdk.chatroom.presenter.r r5 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r5.f11392c
                    long r5 = r5.getId()
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    r1.put(r4, r5)
                    java.lang.String r4 = "enter_from"
                    r1.put(r4, r2)
                    java.lang.String r2 = "anchor_id"
                    com.bytedance.android.livesdk.chatroom.presenter.r r4 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r4.f11392c
                    com.bytedance.android.live.base.model.user.User r4 = r4.getOwner()
                    long r4 = r4.getId()
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    r1.put(r2, r4)
                    java.lang.String r2 = "gift_id"
                    long r4 = r10.f15133e
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    r1.put(r2, r4)
                    java.lang.String r2 = "live_type"
                    java.lang.String r4 = "video_live"
                    r1.put(r2, r4)
                    java.lang.String r2 = "gift_type"
                    java.lang.String r4 = "convenient_gift"
                    r1.put(r2, r4)
                    java.lang.String r2 = "source"
                    r1.put(r2, r3)
                    java.lang.String r2 = "request_page"
                    java.lang.String r3 = "shortcut"
                    r1.put(r2, r3)
                    java.lang.String r2 = "event_type"
                    java.lang.String r3 = "other"
                    r1.put(r2, r3)
                    java.lang.String r2 = "event_module"
                    java.lang.String r3 = "bottom_tab"
                    r1.put(r2, r3)
                    java.lang.String r2 = "money"
                    java.lang.String r3 = "1"
                    r1.put(r2, r3)
                    java.lang.String r2 = "gift_cnt"
                    java.lang.String r3 = "1"
                    r1.put(r2, r3)
                    boolean r2 = com.bytedance.android.live.uikit.a.a.c()
                    if (r2 == 0) goto L_0x0189
                    com.bytedance.android.livesdk.chatroom.presenter.r r2 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.f11392c
                    com.bytedance.android.live.base.model.user.User r2 = r2.getOwner()
                    if (r2 == 0) goto L_0x0189
                    java.lang.String r2 = "request_page"
                    java.lang.String r3 = "normal"
                    r1.put(r2, r3)
                    java.lang.String r2 = "to_user_id"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    com.bytedance.android.livesdk.chatroom.presenter.r r4 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r4.f11392c
                    com.bytedance.android.live.base.model.user.User r4 = r4.getOwner()
                    long r4 = r4.getId()
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    r1.put(r2, r3)
                    java.lang.String r2 = "orientation"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    com.bytedance.android.livesdk.chatroom.presenter.r r4 = com.bytedance.android.livesdk.chatroom.presenter.r.this
                    com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r4.f11392c
                    int r4 = r4.getOrientation()
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    r1.put(r2, r3)
                L_0x0189:
                    java.lang.String r2 = "action_type"
                    r1.put(r2, r0)
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    long r2 = r10.f15133e
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
                    r0.put(r2, r3)
                    java.lang.String r2 = "gift_info"
                    java.lang.String r0 = com.bytedance.android.livesdk.gift.e.a.a(r0)
                    r1.put(r2, r0)
                    java.lang.String r0 = "is_first_consume"
                    java.lang.Class<com.bytedance.android.live.e.a> r2 = com.bytedance.android.live.e.a.class
                    com.bytedance.android.live.base.b r2 = com.bytedance.android.live.utility.b.a(r2)
                    com.bytedance.android.live.e.a r2 = (com.bytedance.android.live.e.a) r2
                    com.bytedance.android.livesdk.user.e r2 = r2.user()
                    com.bytedance.android.live.base.model.user.i r2 = r2.a()
                    int r2 = com.bytedance.android.livesdk.wallet.b.b.a((com.bytedance.android.live.base.model.user.i) r2)
                    java.lang.String r2 = java.lang.String.valueOf(r2)
                    r1.put(r0, r2)
                    java.lang.String r0 = "growth_deepevent"
                    java.lang.String r2 = "1"
                    r1.put(r0, r2)
                    com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()
                    java.lang.String r2 = "send_gift"
                    java.lang.Object[] r3 = new java.lang.Object[r8]
                    r0.a(r2, r1, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.presenter.r.AnonymousClass1.a(com.bytedance.android.livesdk.gift.model.i):void");
            }
        };
    }

    public final boolean a(ad adVar) {
        String str;
        ad adVar2 = adVar;
        if (PatchProxy.isSupport(new Object[]{adVar2}, this, f11390a, false, 5191, new Class[]{ad.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{adVar2}, this, f11390a, false, 5191, new Class[]{ad.class}, Boolean.TYPE)).booleanValue();
        } else if (com.bytedance.android.live.uikit.a.a.j() || b() == null || (com.bytedance.android.live.uikit.a.a.a() && !((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c())) {
            return false;
        } else {
            String str2 = (String) com.bytedance.android.livesdk.w.b.T.a();
            if (b() == null || this.f11394e || String.valueOf(this.f11392c.getId()).equals(str2)) {
                return false;
            }
            Fragment parentFragment = ((Fragment) b()).getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            FragmentActivity activity = parentFragment.getActivity();
            if (activity == null) {
                return false;
            }
            Fragment findFragmentByTag = activity.getSupportFragmentManager().findFragmentByTag("login_dialog");
            if (findFragmentByTag != null && findFragmentByTag.isVisible()) {
                return false;
            }
            if (!((c) b()).a(this.f11395f, adVar2.f16439c, adVar2.f16440d, adVar2.f16438b)) {
                d.INSTANCE.onMessageFinish();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f11392c.getId()));
            if (adVar2.f16438b == 3) {
                str = "charge";
            } else {
                str = "convenient_gift";
            }
            hashMap.put("guide_style", str);
            com.bytedance.android.livesdk.j.a.a().a("gift_guide_popup_show", hashMap, new j().b("live_function").f("show").a("live_detail"));
            com.bytedance.android.livesdk.w.b.T.a(String.valueOf(this.f11392c.getId()));
            return true;
        }
    }
}
