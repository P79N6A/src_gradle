package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.p;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.event.r;
import com.bytedance.android.livesdk.chatroom.interact.ab;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter;
import com.bytedance.android.livesdk.chatroom.interact.b.c;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.chatroom.interact.c.dt;
import com.bytedance.android.livesdk.chatroom.interact.c.du;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.interact.t;
import com.bytedance.android.livesdk.chatroom.interact.y;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.bn;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.b.b;
import com.bytedance.b.a.a.b.d;
import com.bytedance.b.a.a.f.a;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

public class LinkInRoomAudioWidget extends LiveWidget implements c.a, cy.b, b, com.bytedance.b.a.a.b.c, d, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12610a;

    /* renamed from: b  reason: collision with root package name */
    bn f12611b;

    /* renamed from: c  reason: collision with root package name */
    public cy f12612c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.interact.c.a f12613d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.android.livesdk.chatroom.interact.d.a f12614e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.livesdk.chatroom.interact.e.a f12615f;
    public com.bytedance.b.a.a.c.b g;
    public y h;
    Runnable i;
    public ab j;
    public boolean k;
    public AbsInteractionFragment.d l;
    private m m;
    private WeakHandler n;
    private a o = new a(this, (byte) 0);
    private boolean p;

    class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12617a;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f12618e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12620c;

        /* renamed from: d  reason: collision with root package name */
        private View f12621d;

        public final void a(com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f12617a, false, 7089, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f12617a, false, 7089, new Class[]{com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a.class}, Void.TYPE);
            }
        }

        public final void b(View view, DataCenter dataCenter) {
            if (PatchProxy.isSupport(new Object[]{view, dataCenter}, this, f12617a, false, 7088, new Class[]{View.class, DataCenter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, dataCenter}, this, f12617a, false, 7088, new Class[]{View.class, DataCenter.class}, Void.TYPE);
            }
        }

        static {
            if (PatchProxy.isSupport(new Object[0], null, f12617a, true, 7087, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f12617a, true, 7087, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LinkInRoomAudioWidget.java", a.class);
            f12618e = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget$ToolbarAudioToggleBehavior", "android.view.View", NotifyType.VIBRATE, "", "void"), 650);
        }

        private a() {
            this.f12620c = true;
        }

        public final void a(boolean z) {
            int i;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12617a, false, 7086, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12617a, false, 7086, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f12620c = z;
            if (this.f12621d != null) {
                this.f12621d.setVisibility(0);
                View view = this.f12621d;
                if (z) {
                    i = 2130841220;
                } else {
                    i = 2130841219;
                }
                view.setBackgroundResource(i);
            }
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f12617a, false, 7085, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f12617a, false, 7085, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f12618e, this, this, view));
            if (this.f12620c) {
                if (LinkInRoomAudioWidget.this.f12613d.a(false) && LinkInRoomAudioWidget.this.g != null) {
                    LinkInRoomAudioWidget.this.g.a(false);
                    LinkInRoomAudioWidget.this.f12613d.a(LinkInRoomAudioWidget.this.f12612c.e());
                    ai.a((int) C0906R.string.d_y);
                    if (LinkInRoomAudioWidget.this.k) {
                        LinkInRoomAudioWidget.this.j.b(LinkInRoomAudioWidget.this.f12612c.e(), true);
                    }
                    a(false);
                }
            } else if (!LinkInRoomAudioWidget.this.f12613d.a(true) || LinkInRoomAudioWidget.this.g == null) {
                ai.a((int) C0906R.string.d77);
            } else {
                LinkInRoomAudioWidget.this.g.a(true);
                LinkInRoomAudioWidget.this.f12613d.b(LinkInRoomAudioWidget.this.f12612c.e());
                ai.a((int) C0906R.string.da1);
                if (LinkInRoomAudioWidget.this.k) {
                    LinkInRoomAudioWidget.this.j.b(LinkInRoomAudioWidget.this.f12612c.e(), false);
                }
                a(true);
            }
        }

        /* synthetic */ a(LinkInRoomAudioWidget linkInRoomAudioWidget, byte b2) {
            this();
        }

        public final void a(@NonNull View view, @NonNull DataCenter dataCenter) {
            this.f12621d = view;
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12610a, false, 7077, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7077, new Class[0], String.class);
    }

    public final void a(int i2, SurfaceView surfaceView) {
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12610a, false, 7078, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12610a, false, 7078, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public final void d(int i2) {
    }

    public int getLayoutId() {
        return C0906R.layout.an2;
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f12610a, false, 7051, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f12610a, false, 7051, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid() && this.f12611b == null) {
            bn bnVar = new bn(this.context, this.k, this.f12612c.p, list, this.f12612c);
            this.f12611b = bnVar;
            this.f12611b.setOnDismissListener(new bo(this));
            this.f12611b.show();
            aa.a(this.f12612c.p, "show_connection_management", "guest_connection", false);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f12610a, false, 7052, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f12610a, false, 7052, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(true);
    }

    public final void a(String[] strArr, boolean[] zArr) {
        if (PatchProxy.isSupport(new Object[]{strArr, zArr}, this, f12610a, false, 7072, new Class[]{String[].class, boolean[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, zArr}, this, f12610a, false, 7072, new Class[]{String[].class, boolean[].class}, Void.TYPE);
            return;
        }
        if (this.f12615f != null) {
            this.f12615f.a(strArr, zArr);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7061, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (this.g != null) {
                this.g.g();
            } else {
                this.f12612c.g();
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7050, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7050, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            ai.a((int) C0906R.string.d56);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7053, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            c(false);
            ai.a((int) C0906R.string.cp6);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7055, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f12615f.a();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7057, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7057, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f12615f.a();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7062, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7062, new Class[0], Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.da5);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7044, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.run();
            this.i = null;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7040, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.n.removeCallbacksAndMessages(null);
        if (this.f12612c.h) {
            if (this.h != null) {
                this.h.b();
            }
            this.f12614e.f();
            if (this.p) {
                this.g.a(true);
                this.f12613d.b(this.f12612c.e());
            }
            if (!this.k) {
                this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new q(3));
            }
        }
    }

    public final void e_() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7067, new Class[0], Void.TYPE);
            return;
        }
        if (this.k) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", new q(11));
        }
        this.g.b((com.bytedance.b.a.a.b.c) this);
        this.g.b((com.bytedance.b.a.a.b.d) this);
        this.g.b((b) this);
        this.g = null;
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().b(f.AUDIO_TOGGLE, this.o);
        this.f12612c.g();
        this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new p(false, null));
        if (this.k) {
            str = "anchor";
        } else {
            str = "audience";
        }
        t.a(0, 0, null, str, "normal", this.f12612c.f_().toString(), this.f12612c.c());
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7039, new Class[0], Void.TYPE);
            return;
        }
        if (this.k) {
            com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(f.RADIO_COVER, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) new com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b(0));
        }
        com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().b(f.AUDIO_TOGGLE, this.o);
        com.bytedance.android.livesdk.app.dataholder.d.a().a(Boolean.FALSE);
        this.f12613d.d();
        this.f12612c.d();
        com.bytedance.android.livesdk.chatroom.interact.e.a aVar = this.f12615f;
        if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.interact.e.a.f10881a, false, 5066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.interact.e.a.f10881a, false, 5066, new Class[0], Void.TYPE);
        } else {
            aVar.l = false;
            if (aVar.p != null && aVar.p.isShowing()) {
                aVar.p.dismiss();
            }
            if (aVar.o != null) {
                aVar.o.d();
            }
            aVar.f10883c.removeAllViews();
            r rVar = new r(false);
            com.bytedance.android.livesdk.u.a.a().a((Object) rVar);
            aVar.m.lambda$put$1$DataCenter("cmd_interact_audio", rVar);
            e.a().b(aVar.n);
        }
        this.f12614e.b();
        if (this.g != null) {
            this.g.b((com.bytedance.b.a.a.b.c) this);
            this.g.b((com.bytedance.b.a.a.b.d) this);
            this.g.b((b) this);
            this.g.g();
        }
        super.onDestroy();
    }

    public void onPause() {
        int i2;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7041, new Class[0], Void.TYPE);
            return;
        }
        if (this.f12612c.h) {
            com.bytedance.android.livesdk.chatroom.interact.c.a aVar = this.f12613d;
            if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.interact.c.a.f10349a, false, 4620, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.interact.c.a.f10349a, false, 4620, new Class[0], Integer.TYPE)).intValue();
            } else {
                j b2 = aVar.g.b(TTLiveSDKContext.getHostService().k().b(), com.bytedance.android.livesdk.app.dataholder.d.a().h);
                if (b2 != null) {
                    i2 = b2.m;
                } else {
                    i2 = -1;
                }
            }
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            this.p = z;
            this.g.a(false);
            this.f12613d.a(this.f12612c.e());
            if (this.h != null) {
                this.h.a();
            }
            this.f12614e.e();
            this.n.sendEmptyMessageDelayed(140000, 180000);
        }
        super.onPause();
    }

    public final void b() {
        int i2;
        a.b bVar;
        a.C0147a aVar;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7060, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            e.a().g = SystemClock.currentThreadTimeMillis();
            a.e f_ = this.f12612c.f_();
            com.bytedance.b.a.a.f.a a2 = new com.bytedance.b.a.a.f.a().a(this.context).b(com.bytedance.android.livesdk.chatroom.interact.data.c.a()).c(com.bytedance.android.livesdk.app.dataholder.d.a().g).b(com.bytedance.android.livesdk.chatroom.interact.data.b.f10866b).a(com.bytedance.android.livesdk.chatroom.interact.data.b.f10869e).d("d926522026314752bb721d08").e(com.bytedance.android.livesdk.app.dataholder.d.a().g).a(this.f12612c.e());
            cy cyVar = this.f12612c;
            if (PatchProxy.isSupport(new Object[0], cyVar, cy.f10530a, false, 4801, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], cyVar, cy.f10530a, false, 4801, new Class[0], Integer.TYPE)).intValue();
            } else {
                i2 = com.bytedance.android.livesdk.app.dataholder.d.a().h;
            }
            com.bytedance.b.a.a.f.a b2 = a2.a(i2).a(a.f.f19200b).a(f_).b((int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
            if (this.k) {
                bVar = a.b.ANCHOR;
            } else {
                bVar = a.b.GUEST;
            }
            com.bytedance.b.a.a.f.a c2 = b2.a(bVar).c(3);
            if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.a()).intValue() == 1) {
                aVar = a.C0147a.AUDIO_PROFILE_HE;
            } else {
                aVar = a.C0147a.AUDIO_PROFILE_LC;
            }
            com.bytedance.b.a.a.f.a a3 = c2.a(aVar).a(this.f12612c.c());
            if (this.k) {
                ((com.bytedance.android.livesdk.chatroom.d) this.h).setOutputFormat(3553);
                c cVar = new c(this);
                cy cyVar2 = this.f12612c;
                if (PatchProxy.isSupport(new Object[0], cyVar2, cy.f10530a, false, 4803, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], cyVar2, cy.f10530a, false, 4803, new Class[0], String.class);
                } else {
                    str = cyVar2.p.getStreamUrl().a();
                }
                com.bytedance.b.a.a.f.a a4 = a3.f(str).g("#161823").a(a.c.TEXTURE_2D);
                a4.u = true;
                a4.a(a.d.VIDEO);
                this.g = new com.bytedance.b.a.a.c.a(a3, new com.bytedance.b.a.a.g.d() {
                    public final com.bytedance.b.a.a.g.c a() {
                        return LinkInRoomAudioWidget.this.h;
                    }
                }, cVar);
            } else {
                a3.a(a.d.AUDIO);
                this.g = new com.bytedance.b.a.a.c.c(a3, null);
            }
            this.g.a((com.bytedance.b.a.a.b.c) this);
            this.g.a((com.bytedance.b.a.a.b.d) this);
            this.g.a((b) this);
            this.g.f();
        }
    }

    public final void e() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7065, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            t.a(this.f12612c.f_().toString(), 0, 0);
            com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(f.AUDIO_TOGGLE, (d.a) this.o);
            this.o.a(true);
            cy cyVar = this.f12612c;
            if (PatchProxy.isSupport(new Object[0], cyVar, cy.f10530a, false, 4804, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cyVar, cy.f10530a, false, 4804, new Class[0], Void.TYPE);
            } else {
                cyVar.h = true;
                if (cyVar.q) {
                    cyVar.j = false;
                    if (cyVar.t != null) {
                        cyVar.t.b();
                    }
                } else {
                    cyVar.v.lambda$put$1$DataCenter("cmd_interact_state_change", new q(3));
                    e.a().a((Integer) 2);
                }
            }
            t.a(0, 0, null, "audience", "normal", this.f12612c.f_().toString());
            JSONObject jSONObject = new JSONObject();
            if (e.a().l) {
                str = String.valueOf(r2.m) + "-" + r2.n;
            } else {
                str = "";
            }
            try {
                jSONObject.put("type", str);
                if (e.a().o == 2) {
                    str2 = "voice_type";
                } else {
                    str2 = "live_type";
                }
                jSONObject.put("connection_type", str2);
                com.bytedance.android.livesdk.j.f.a(this.context).a("guest_connection_success", "guest_connection", this.f12612c.p.getOwner().getId(), this.f12612c.p.getId(), jSONObject);
            } catch (JSONException unused) {
            }
            if (this.k) {
                q qVar = new q(10);
                qVar.f10193b = this.h;
                this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", qVar);
            }
            this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new p(true, this.f12612c.f_().name()));
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7038, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Room room = (Room) this.dataCenter.get("data_room");
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f12614e = new com.bytedance.android.livesdk.chatroom.interact.d.a(room, this.dataCenter);
        this.f12612c = new cy(room, booleanValue, this.dataCenter);
        this.f12613d = new com.bytedance.android.livesdk.chatroom.interact.c.a(room, booleanValue, this.f12614e);
        this.f12613d.a(null);
        this.n = new WeakHandler(this);
        this.k = booleanValue;
        this.f12614e.a();
        com.bytedance.android.livesdk.chatroom.interact.e.a aVar = new com.bytedance.android.livesdk.chatroom.interact.e.a(this.f12612c.p, this.k, (FrameLayout) this.containerView, this.f12614e, this.context, this.j, this.dataCenter);
        this.f12615f = aVar;
        com.bytedance.android.livesdk.chatroom.interact.e.a aVar2 = this.f12615f;
        if (PatchProxy.isSupport(new Object[0], aVar2, com.bytedance.android.livesdk.chatroom.interact.e.a.f10881a, false, 5064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar2, com.bytedance.android.livesdk.chatroom.interact.e.a.f10881a, false, 5064, new Class[0], Void.TYPE);
        } else {
            r rVar = new r(true);
            com.bytedance.android.livesdk.u.a.a().a((Object) rVar);
            aVar2.m.lambda$put$1$DataCenter("cmd_interact_audio", rVar);
            aVar2.l = true;
            aVar2.f10884d = LayoutInflater.from(aVar2.f10883c.getContext()).inflate(C0906R.layout.anq, aVar2.f10883c, false);
            aVar2.f10884d.setVisibility(4);
            aVar2.f10885e = (ImageView) aVar2.f10884d.findViewById(C0906R.id.dwd);
            aVar2.f10886f = (TextView) aVar2.f10884d.findViewById(C0906R.id.dwe);
            aVar2.g = (RecyclerView) LayoutInflater.from(aVar2.f10883c.getContext()).inflate(C0906R.layout.anp, aVar2.f10883c, false);
            aVar2.g.setLayoutManager(new GridLayoutManager(aVar2.f10883c.getContext(), 4));
            if (PatchProxy.isSupport(new Object[0], aVar2, com.bytedance.android.livesdk.chatroom.interact.e.a.f10881a, false, 5065, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar2, com.bytedance.android.livesdk.chatroom.interact.e.a.f10881a, false, 5065, new Class[0], Void.TYPE);
            } else {
                ArrayList arrayList = new ArrayList(8);
                for (int i2 = 0; i2 < 8; i2++) {
                    j jVar = new j();
                    jVar.f11051d = -1;
                    arrayList.add(jVar);
                }
                aVar2.h = new LinkInRoomAudioGuestAdapter(arrayList, aVar2);
                aVar2.g.setAdapter(aVar2.h);
            }
            aVar2.f10883c.addView(aVar2.f10884d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 1);
            layoutParams.topMargin = ac.d(C0906R.dimen.f4459pl);
            aVar2.f10883c.addView(aVar2.g, layoutParams);
            aVar2.i.a((a.C0089a) aVar2);
            aVar2.a();
            e.a().a(aVar2.n);
        }
        this.f12612c.a((cy.b) this);
        if (!this.k) {
            e.a().a((Integer) 0);
        } else {
            this.h = new com.bytedance.android.livesdk.chatroom.d(this.context);
        }
        if (this.k) {
            com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.j.a().a(f.RADIO_COVER, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) new com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b(8));
        }
    }

    public LinkInRoomAudioWidget(ab abVar) {
        this.j = abVar;
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12610a, false, 7059, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12610a, false, 7059, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (this.m == null) {
                this.m = new m.a(getContext(), 2).c((int) C0906R.string.d4i).a();
            }
            if (!this.m.isShowing()) {
                this.m.show();
            }
        } else if (this.m != null && this.m.isShowing()) {
            this.m.dismiss();
        }
    }

    public final long a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12610a, false, 7076, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return this.f12614e.b(i2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12610a, false, 7076, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12610a, false, 7064, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12610a, false, 7064, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.g != null) {
            this.g.a(z);
            if (z) {
                this.o.a(true);
                ai.a((int) C0906R.string.da7);
                return;
            }
            this.o.a(false);
            ai.a((int) C0906R.string.d77);
        }
    }

    public final void d(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12610a, false, 7056, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12610a, false, 7056, new Class[]{Throwable.class}, Void.TYPE);
        } else if (isViewValid()) {
            l.a(getContext(), th2, (int) C0906R.string.d6x);
        }
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12610a, false, 7071, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12610a, false, 7071, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f12614e.a(i2);
        this.f12615f.a(0, i2);
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f12610a, false, 7073, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f12610a, false, 7073, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        t.a((long) i2, "normal", this.f12612c.f_().toString());
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f12610a, false, 7046, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f12610a, false, 7046, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (isViewValid() && 140000 == message.what && this.f12612c != null) {
            this.f12612c.i();
        }
    }

    public final void c(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12610a, false, 7054, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12610a, false, 7054, new Class[]{Throwable.class}, Void.TYPE);
        } else if (isViewValid()) {
            c(false);
            l.a(getContext(), th2, (int) C0906R.string.d4g);
        }
    }

    public final void e(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12610a, false, 7058, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12610a, false, 7058, new Class[]{Throwable.class}, Void.TYPE);
        } else if (isViewValid()) {
            l.a(getContext(), th2, (int) C0906R.string.d6x);
        }
    }

    public final void f(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f12610a, false, 7063, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f12610a, false, 7063, new Class[]{Throwable.class}, Void.TYPE);
        } else if (isViewValid()) {
            l.a(this.context, th2);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12610a, false, 7069, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12610a, false, 7069, new Class[]{String.class}, Void.TYPE);
            return;
        }
        long id = this.f12612c.p.getId();
        String c2 = this.f12612c.c();
        String eVar = this.f12612c.f_().toString();
        t.a(id, c2, eVar, 402, "onWarn:" + str);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12610a, false, 7070, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f12610a, false, 7070, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.d7w);
        cy cyVar = this.f12612c;
        if (PatchProxy.isSupport(new Object[0], cyVar, cy.f10530a, false, 4814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cyVar, cy.f10530a, false, 4814, new Class[0], Void.TYPE);
        } else {
            cyVar.i = true;
            cyVar.i();
        }
        t.a(this.f12612c.p.getId(), this.f12612c.c(), this.f12612c.f_().toString(), 401, str);
    }

    public final void b(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12610a, false, 7047, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12610a, false, 7047, new Class[]{Throwable.class}, Void.TYPE);
        } else if (isViewValid()) {
            c(false);
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                int errorCode = ((com.bytedance.android.live.a.a.b.a) th).getErrorCode();
                if (30010 == errorCode) {
                    if (PatchProxy.isSupport(new Object[0], this, f12610a, false, 7048, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f12610a, false, 7048, new Class[0], Void.TYPE);
                        return;
                    }
                    new m.a(this.context).c((int) C0906R.string.d7z).b(0, (int) C0906R.string.d7y, (DialogInterface.OnClickListener) new bm(this)).b(1, (int) C0906R.string.cpz, bn.f13035b).c();
                    return;
                } else if (31002 == errorCode) {
                    aa.a(this.f12612c.p);
                }
            }
            l.a(this.context, th);
        }
    }

    public final void a(int i2, String str) {
        int i3 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f12610a, false, 7066, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f12610a, false, 7066, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        t.a(this.f12612c.f_().toString(), 1, i3);
        cy cyVar = this.f12612c;
        if (PatchProxy.isSupport(new Object[0], cyVar, cy.f10530a, false, 4805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cyVar, cy.f10530a, false, 4805, new Class[0], Void.TYPE);
        } else {
            ((com.bytedance.android.live.core.rxutils.autodispose.ab) com.bytedance.android.livesdk.v.j.q().d().a().leave(cyVar.p.getId()).as(cyVar.p())).a(dt.f10583b, new du(cyVar));
            e.a().a((Integer) 0);
        }
        ai.a((int) C0906R.string.d7v);
        t.a(1, 107, "code: " + i3 + ", desc: " + str2, "audience", "normal", this.f12612c.f_().toString());
    }

    public final void b(int i2, String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3}, this, f12610a, false, 7068, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3}, this, f12610a, false, 7068, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f12612c;
        if (PatchProxy.isSupport(new Object[0], cyVar, cy.f10530a, false, 4807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cyVar, cy.f10530a, false, 4807, new Class[0], Void.TYPE);
        } else if (cyVar.q) {
            cyVar.k = false;
            if (cyVar.i) {
                cyVar.h = false;
                cyVar.n();
            } else if (cyVar.t != null) {
                cyVar.t.e();
            }
        } else {
            cyVar.k = false;
            cyVar.h = false;
            cyVar.h();
        }
        String str4 = "code: " + i2 + ", desc: " + str3;
        if (this.k) {
            str2 = "anchor";
        } else {
            str2 = "audience";
        }
        t.a(1, 301, str4, str2, "normal", this.f12612c.f_().toString(), this.f12612c.c());
    }

    public final void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f12610a, false, 7074, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f12610a, false, 7074, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.a(j4, j5);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f12610a, false, 7049, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f12610a, false, 7049, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 1) {
            this.f12612c.j();
        }
    }
}
