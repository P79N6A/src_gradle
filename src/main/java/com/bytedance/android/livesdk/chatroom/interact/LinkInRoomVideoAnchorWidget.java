package com.bytedance.android.livesdk.chatroom.interact;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.f;
import com.bytedance.android.livesdk.chatroom.event.p;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.b.a;
import com.bytedance.android.livesdk.chatroom.interact.c.ec;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.interact.e.g;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.bw;
import com.bytedance.android.livesdk.chatroom.viewmodule.am;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.b.b;
import com.bytedance.b.a.a.b.c;
import com.bytedance.b.a.a.b.d;
import com.bytedance.b.a.a.f.a;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;

public class LinkInRoomVideoAnchorWidget extends LiveWidget implements Observer<KVData>, a.C0085a, ec.b, b, c, d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10243a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.b.a.a.c.a f10244b;

    /* renamed from: c  reason: collision with root package name */
    public ec f10245c;

    /* renamed from: d  reason: collision with root package name */
    bw f10246d;

    /* renamed from: e  reason: collision with root package name */
    public z f10247e;

    /* renamed from: f  reason: collision with root package name */
    public AbsInteractionFragment.d f10248f;
    private com.bytedance.android.livesdk.chatroom.interact.d.a g;
    private g h;
    private n i;
    private a.C0089a j = new a.C0089a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10249a;

        public final void a(long j, int i) {
        }

        public final void a(long j, long j2) {
        }

        public final void a(List<j> list) {
        }

        public final void b(List<j> list) {
        }

        public final void c(List<k> list) {
        }

        public final void a(long j, int i, boolean z) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f10249a, false, 4377, new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Byte.valueOf(z)}, this, f10249a, false, 4377, new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (LinkInRoomVideoAnchorWidget.this.f10244b != null) {
                LinkInRoomVideoAnchorWidget.this.f10244b.e();
            }
        }
    };

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f10243a, false, 4374, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4374, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f10243a, false, 4375, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f10243a, false, 4375, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public final void a(String[] strArr, boolean[] zArr) {
    }

    public int getLayoutId() {
        return C0906R.layout.an2;
    }

    public final boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4351, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4351, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        com.bytedance.android.livesdk.chatroom.interact.d.a aVar = this.g;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, aVar, com.bytedance.android.livesdk.chatroom.interact.d.a.f10835a, false, 5036, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return aVar.k.containsKey(Integer.valueOf(i2)) && aVar.k.get(Integer.valueOf(i2)).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, aVar, com.bytedance.android.livesdk.chatroom.interact.d.a.f10835a, false, 5036, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10243a, false, 4355, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10243a, false, 4355, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid() && this.f10246d == null) {
            Room room = this.f10245c.m;
            this.f10246d = new bw(this.context, room, list, this.f10245c);
            this.f10246d.setOnDismissListener(new i(this));
            this.f10246d.show();
            aa.a(room, "show_connection_management", "anchor_connection", false);
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4357, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.b();
            this.i = null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4354, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            ai.a((int) C0906R.string.d56);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4358, new Class[0], Void.TYPE);
            return;
        }
        this.f10244b.f();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4359, new Class[0], Void.TYPE);
        } else if (this.f10244b != null) {
            this.f10244b.g();
        } else {
            this.f10245c.g_();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4350, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10245c.k) {
            this.f10244b.a(false);
            this.g.e();
        }
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4349, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f10245c.k) {
            this.f10244b.a(true);
            this.g.f();
        }
    }

    public final void e_() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4363, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.f10245c.g_();
            this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new p(false, null));
        }
        g();
        t.a(0, 0, null, "anchor", "normal", this.f10245c.h().toString(), this.f10245c.j());
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4348, new Class[0], Void.TYPE);
            return;
        }
        this.f10245c.d();
        this.h.a();
        this.g.b(this.j);
        this.g.b();
        if (this.f10244b != null) {
            this.f10244b.b((c) this);
            this.f10244b.b((d) this);
            this.f10244b.b((b) this);
            this.f10244b.g();
        }
        g();
        if (this.f10246d != null && this.f10246d.isShowing()) {
            this.f10246d.f();
            this.f10246d.dismiss();
        }
        super.onDestroy();
    }

    public final void e() {
        a.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4361, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            t.a(this.f10245c.h().toString(), 0, 0);
            ec ecVar = this.f10245c;
            if (PatchProxy.isSupport(new Object[0], ecVar, ec.f10602a, false, 4862, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], ecVar, ec.f10602a, false, 4862, new Class[0], Void.TYPE);
            } else {
                t.a(0, 0, null, "anchor", "normal", ecVar.h().toString());
                ecVar.i = false;
                ecVar.k = true;
                if (ecVar.p != null) {
                    ecVar.p.b();
                }
            }
            this.dataCenter.lambda$put$1$DataCenter("data_interact_debug_info", new p(true, this.f10245c.h().name()));
            if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4356, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4356, new Class[0], Void.TYPE);
                return;
            }
            String i2 = this.f10245c.i();
            long id = this.f10245c.m.getId();
            String lowerCase = this.f10245c.h().name().toLowerCase();
            if (this.f10245c.g()) {
                fVar = a.f.f19203e;
            } else {
                fVar = a.f.f19202d;
            }
            n nVar = new n(lowerCase, i2, id, fVar.f19204f, fVar.g, fVar.i, fVar.h);
            this.i = nVar;
            this.i.a();
        }
    }

    public void onCreate() {
        a.f fVar;
        long j2;
        int i2;
        a.C0147a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f10243a, false, 4347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10243a, false, 4347, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        Room room = (Room) this.dataCenter.get("data_room");
        this.dataCenter.observe("cmd_force_close_linkin", this);
        this.f10245c = new ec(room, this.dataCenter);
        AnonymousClass2 r2 = new com.bytedance.b.a.a.g.d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f10251a;

            public final com.bytedance.b.a.a.g.c a() {
                if (!PatchProxy.isSupport(new Object[0], this, f10251a, false, 4378, new Class[0], com.bytedance.b.a.a.g.c.class)) {
                    return LinkInRoomVideoAnchorWidget.this.f10247e.b();
                }
                return (com.bytedance.b.a.a.g.c) PatchProxy.accessDispatch(new Object[0], this, f10251a, false, 4378, new Class[0], com.bytedance.b.a.a.g.c.class);
            }
        };
        this.g = new com.bytedance.android.livesdk.chatroom.interact.d.a(room, this.dataCenter);
        this.g.a(this.j);
        this.g.a();
        if (this.f10245c.g()) {
            fVar = a.f.f19203e;
        } else {
            fVar = a.f.f19202d;
        }
        com.bytedance.android.livesdk.chatroom.interact.b.a aVar2 = new com.bytedance.android.livesdk.chatroom.interact.b.a(fVar, this);
        com.bytedance.b.a.a.f.a e2 = new com.bytedance.b.a.a.f.a().a(this.context).b(com.bytedance.android.livesdk.chatroom.interact.data.c.a()).c(com.bytedance.android.livesdk.app.dataholder.d.a().g).b(com.bytedance.android.livesdk.chatroom.interact.data.b.f10866b).a(com.bytedance.android.livesdk.chatroom.interact.data.b.f10869e).d("d926522026314752bb721d08").e(com.bytedance.android.livesdk.app.dataholder.d.a().g);
        ec ecVar = this.f10245c;
        if (PatchProxy.isSupport(new Object[0], ecVar, ec.f10602a, false, 4868, new Class[0], Long.TYPE)) {
            j2 = ((Long) PatchProxy.accessDispatch(new Object[0], ecVar, ec.f10602a, false, 4868, new Class[0], Long.TYPE)).longValue();
        } else {
            j2 = TTLiveSDKContext.getHostService().k().b();
        }
        com.bytedance.b.a.a.f.a a2 = e2.a(j2);
        ec ecVar2 = this.f10245c;
        if (PatchProxy.isSupport(new Object[0], ecVar2, ec.f10602a, false, 4869, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], ecVar2, ec.f10602a, false, 4869, new Class[0], Integer.TYPE)).intValue();
        } else {
            i2 = com.bytedance.android.livesdk.app.dataholder.d.a().h;
        }
        com.bytedance.b.a.a.f.a c2 = a2.a(i2).a(fVar).a(this.f10245c.h()).f(this.f10245c.i()).a(this.f10245c.j()).g("#161823").a(a.b.ANCHOR).a(a.c.TEXTURE_2D).c(1);
        if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.a()).intValue() == 1) {
            aVar = a.C0147a.AUDIO_PROFILE_HE;
        } else {
            aVar = a.C0147a.AUDIO_PROFILE_LC;
        }
        this.f10244b = new com.bytedance.b.a.a.c.a(c2.a(aVar).a(a.d.VIDEO), r2, aVar2);
        this.f10244b.a((c) this);
        this.f10244b.a((d) this);
        this.f10244b.a((b) this);
        g gVar = new g(this.f10245c.m, true, null, (FrameLayout) this.containerView, this.g);
        this.h = gVar;
        this.h.n = this.dataCenter;
        this.h.a(false);
        this.f10245c.a((ec.b) this);
        ai.a((int) C0906R.string.d5r, 1);
    }

    public LinkInRoomVideoAnchorWidget(z zVar) {
        this.f10247e = zVar;
    }

    public final long c(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4353, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return this.g.b(i2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4353, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4369, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4369, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g.a(i2);
        this.h.a(0, i2);
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4370, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4370, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        t.a((long) i2, "normal", this.f10245c.h().toString());
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f10243a, false, 4373, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f10243a, false, 4373, new Class[]{KVData.class}, Void.TYPE);
            return;
        }
        if (kVData != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == -95319361 && key.equals("cmd_force_close_linkin")) {
                c2 = 0;
            }
            if (c2 == 0 && this.f10245c != null) {
                this.f10245c.e();
            }
        }
    }

    public final int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4352, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4352, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        com.bytedance.android.livesdk.chatroom.interact.d.a aVar = this.g;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, aVar, com.bytedance.android.livesdk.chatroom.interact.d.a.f10835a, false, 5037, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, aVar, com.bytedance.android.livesdk.chatroom.interact.d.a.f10835a, false, 5037, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        j a2 = aVar.a(0, i2);
        if (a2 == null) {
            return 1;
        }
        return a2.h;
    }

    public final void d(int i2) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4367, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10243a, false, 4367, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        j a2 = this.g.a(this.g.b(i2), i2);
        if (a2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f10245c.m.getId()));
            if (a2.j > 0) {
                str = String.valueOf(a2.j);
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            hashMap.put("money", str);
            if (a2.j > 0) {
                str2 = String.valueOf(ah.a(a2.k));
            } else {
                str2 = "1440";
            }
            hashMap.put("time", str2);
            com.bytedance.android.livesdk.j.a.a().a("guest_connection_success", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_function").a("live_take_detail"));
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10243a, false, 4365, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10243a, false, 4365, new Class[]{String.class}, Void.TYPE);
            return;
        }
        long id = this.f10245c.m.getId();
        String j2 = this.f10245c.j();
        String eVar = this.f10245c.h().toString();
        t.a(id, j2, eVar, 402, "onWarn:" + str);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10243a, false, 4366, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10243a, false, 4366, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ai.a((int) C0906R.string.d7w);
        ec ecVar = this.f10245c;
        if (PatchProxy.isSupport(new Object[0], ecVar, ec.f10602a, false, 4867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], ecVar, ec.f10602a, false, 4867, new Class[0], Void.TYPE);
        } else {
            ecVar.l = true;
            ecVar.e();
        }
        t.a(this.f10245c.m.getId(), this.f10245c.j(), this.f10245c.h().toString(), 401, str);
    }

    public final void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f10243a, false, 4371, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f10243a, false, 4371, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f10248f != null) {
            this.f10248f.a(j4, j5);
        }
    }

    public final void a(int i2, String str) {
        int i3 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f10243a, false, 4362, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f10243a, false, 4362, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            t.a(this.f10245c.h().toString(), 1, i3);
            ec ecVar = this.f10245c;
            if (PatchProxy.isSupport(new Object[0], ecVar, ec.f10602a, false, 4863, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], ecVar, ec.f10602a, false, 4863, new Class[0], Void.TYPE);
            } else {
                ecVar.i = false;
                if (ecVar.p != null) {
                    ecVar.p.c();
                }
                ecVar.q.lambda$put$1$DataCenter("cmd_interact_state_change", new q(8));
            }
            t.a(1, 107, "code: " + i3 + ", desc: " + str2, "anchor", "normal", this.f10245c.h().toString());
        }
    }

    public final void a(int i2, SurfaceView surfaceView) {
        long j2;
        int i3 = i2;
        SurfaceView surfaceView2 = surfaceView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), surfaceView2}, this, f10243a, false, 4368, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), surfaceView2}, this, f10243a, false, 4368, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE);
            return;
        }
        this.h.a(i3, surfaceView2);
        long b2 = this.g.b(i3);
        if (b2 > 0) {
            f fVar = com.bytedance.android.livesdk.app.dataholder.d.a().j;
            if (PatchProxy.isSupport(new Object[]{new Long(b2), 0L}, fVar, f.f9056a, false, 3173, new Class[]{Long.TYPE, Long.TYPE}, Long.TYPE)) {
                j2 = ((Long) PatchProxy.accessDispatch(new Object[]{new Long(b2), 0L}, fVar, f.f9056a, false, 3173, new Class[]{Long.TYPE, Long.TYPE}, Long.TYPE)).longValue();
            } else {
                int a2 = com.bytedance.android.livesdk.app.dataholder.c.a(fVar.f9057b, fVar.f9059d, b2);
                if (a2 < 0) {
                    j2 = 0;
                } else {
                    j2 = fVar.f9058c[a2];
                }
            }
            if (j2 > 0) {
                t.a(System.currentTimeMillis() - j2, 0, this.f10245c.h().toString());
            }
            f fVar2 = com.bytedance.android.livesdk.app.dataholder.d.a().j;
            if (PatchProxy.isSupport(new Object[]{new Long(b2)}, fVar2, f.f9056a, false, 3174, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(b2)}, fVar2, f.f9056a, false, 3174, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            int a3 = com.bytedance.android.livesdk.app.dataholder.c.a(fVar2.f9057b, fVar2.f9059d, b2);
            if (a3 >= 0) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a3)}, fVar2, f.f9056a, false, 3175, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a3)}, fVar2, f.f9056a, false, 3175, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                int i4 = a3 + 1;
                System.arraycopy(fVar2.f9057b, i4, fVar2.f9057b, a3, fVar2.f9059d - i4);
                System.arraycopy(fVar2.f9058c, i4, fVar2.f9058c, a3, fVar2.f9059d - i4);
                fVar2.f9059d--;
            }
        }
    }

    public final void b(int i2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f10243a, false, 4364, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f10243a, false, 4364, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            ec ecVar = this.f10245c;
            if (PatchProxy.isSupport(new Object[0], ecVar, ec.f10602a, false, 4865, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], ecVar, ec.f10602a, false, 4865, new Class[0], Void.TYPE);
            } else {
                ecVar.j = false;
                if (ecVar.l) {
                    ecVar.k = false;
                    ecVar.e();
                } else if (ecVar.p != null) {
                    ecVar.p.e();
                }
            }
        }
        t.a(1, 301, "code: " + i2 + ", desc: " + str2, "anchor", "normal", this.f10245c.h().toString(), this.f10245c.j());
    }
}
