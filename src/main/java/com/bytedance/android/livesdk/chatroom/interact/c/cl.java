package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.autodispose.af;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.event.o;
import com.bytedance.android.livesdk.chatroom.event.p;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.n;
import com.bytedance.android.livesdk.chatroom.interact.t;
import com.bytedance.android.livesdk.chatroom.interact.y;
import com.bytedance.android.livesdk.chatroom.interact.z;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.aj;
import com.bytedance.android.livesdk.message.model.an;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.b.b;
import com.bytedance.b.a.a.b.c;
import com.bytedance.b.a.a.b.d;
import com.bytedance.b.a.a.f.a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.util.concurrent.TimeUnit;

public final class cl extends bx<a> implements Observer<KVData>, b, c, d, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10498a;

    /* renamed from: b  reason: collision with root package name */
    LinkCrossRoomDataHolder f10499b;

    /* renamed from: c  reason: collision with root package name */
    boolean f10500c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10501d;

    /* renamed from: e  reason: collision with root package name */
    public y f10502e;

    /* renamed from: f  reason: collision with root package name */
    private Room f10503f = ((Room) this.h.get("data_room"));
    private boolean g = ((Boolean) this.h.get("data_is_anchor")).booleanValue();
    private DataCenter h;
    private Disposable i;
    private boolean j;
    private com.bytedance.b.a.a.c.a k;
    private com.bytedance.android.livesdk.chatroom.interact.b.b l;
    private com.bytedance.b.a.a.g.d m;
    private z n;
    private n o;

    public interface a extends al {
        void a(long j, long j2);

        void a(String str);

        void a(boolean z);

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        b(th);
    }

    public final void a(String[] strArr, boolean[] zArr) {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10498a, false, 4758, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10498a, false, 4758, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.l.f10341b = z;
        if (this.j) {
            com.bytedance.android.livesdk.chatroom.interact.data.d dVar = new com.bytedance.android.livesdk.chatroom.interact.data.d();
            dVar.g = z ? 100102 : 100101;
            dVar.f10875d = String.valueOf(TTLiveSDKContext.getHostService().k().b());
            dVar.f10876e = String.valueOf(this.f10499b.n);
            dVar.f10873b = PushConstants.PUSH_TYPE_NOTIFY;
            dVar.f10874c = PushConstants.PUSH_TYPE_NOTIFY;
            ((ab) j.q().d().a().sendSignalV3(this.f10499b.f9030d, j.q().c().toJson((Object) dVar), null).as(p())).a(cq.f10515b, new cr(this));
        }
        if (this.k != null) {
            this.k.a(z);
            this.k.e();
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10498a, false, 4773, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10498a, false, 4773, new Class[]{String.class}, Void.TYPE);
            return;
        }
        long id = this.f10503f.getId();
        String valueOf = String.valueOf(this.f10499b.f9030d);
        String eVar = h().toString();
        t.a(id, valueOf, eVar, 402, "onWarn:" + str);
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4766, new Class[0], Void.TYPE);
            return;
        }
        this.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.TURN_OFF_ENGINE);
        if (this.k != null) {
            this.k.g();
        } else {
            e_();
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4768, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.b();
            this.o = null;
        }
    }

    private boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4781, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4781, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f10503f.getStreamUrlExtraSafely().m > 0) {
            z = true;
        }
        return z;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4763, new Class[0], Void.TYPE);
        } else if (b() != null) {
            this.f10501d = false;
            if (this.g) {
                j();
            } else {
                i();
            }
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4764, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            this.h.lambda$put$1$DataCenter("cmd_interact_state_change", new q(8));
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.chatroom.event.n(2));
        this.h.lambda$put$1$DataCenter("cmd_pk_state_change", new o(1));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4757, new Class[0], Void.TYPE);
        } else if (this.f10499b.f9032f != 0) {
            ((af) TTLiveSDKContext.getHostService().k().b(this.f10499b.f9032f).as(p())).a(new cm(this), new cn(this));
        }
    }

    public final void e_() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4771, new Class[0], Void.TYPE);
            return;
        }
        this.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.TURN_OFF_ENGINE_SUCCEED);
        this.j = false;
        i();
        k();
        this.k.b((c) this);
        this.k.b((d) this);
        this.k.b((b) this);
        if (this.h != null) {
            this.h.lambda$put$1$DataCenter("data_interact_debug_info", new p(false, null));
        }
        t.a(0, 0, null, "anchor", PushConstants.URI_PACKAGE_NAME, h().toString(), String.valueOf(this.f10499b.f9030d));
    }

    public final a.e h() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4782, new Class[0], a.e.class)) {
            return (a.e) PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4782, new Class[0], a.e.class);
        } else if (com.bytedance.android.livesdkapi.a.a.f18614b) {
            return a.e.ZEGO;
        } else {
            String str = (String) LiveSettingKeys.INTERACT_VENDOR.a();
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("agora")) {
                    return a.e.AGORA;
                }
                if (str.contains("zego")) {
                    return a.e.ZEGO;
                }
            }
            int i2 = this.f10499b.l;
            if (i2 == 4) {
                return a.e.BYTE;
            }
            switch (i2) {
                case 1:
                    return a.e.AGORA;
                case 2:
                    return a.e.ZEGO;
                default:
                    return a.e.AGORA;
            }
        }
    }

    public final void c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4762, new Class[0], Void.TYPE);
            return;
        }
        this.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.FINISH);
        if (!this.f10500c) {
            this.f10500c = true;
            this.f10499b.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.DISABLED);
            if (LinkCrossRoomDataHolder.a.SELF_JOIN_SUCCEED.compareTo((LinkCrossRoomDataHolder.a) this.f10499b.get("data_link_state", LinkCrossRoomDataHolder.a.DISABLED)) < 0) {
                z = true;
            }
            if (!z || this.f10499b.f9030d == 0) {
                g();
            } else {
                ((ab) j.q().d().a().finishV3(this.f10499b.f9030d).as(p())).a(new co(this), new cp(this));
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4755, new Class[0], Void.TYPE);
            return;
        }
        this.h.lambda$put$1$DataCenter("cmd_pk_state_change", new o(3));
        k();
        if (this.k != null) {
            this.k.b((c) this);
            this.k.b((d) this);
            this.k.b((b) this);
            this.k.g();
        }
        this.f10499b.f9029c = false;
        this.f10499b.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.DISABLED);
        LinkCrossRoomDataHolder.a aVar = (LinkCrossRoomDataHolder.a) this.f10499b.get("data_link_state", LinkCrossRoomDataHolder.a.DISABLED);
        if (this.g && LinkCrossRoomDataHolder.a.FINISH_SUCCEED.compareTo(aVar) <= 0) {
            c();
        }
        this.f10499b.removeObserver(this);
        this.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.UNLOADED);
        if (this.i != null) {
            this.i.dispose();
        }
        super.d();
    }

    public final void e() {
        a.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4769, new Class[0], Void.TYPE);
            return;
        }
        t.a(h().toString(), 0, 0);
        this.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.TURN_ON_ENGINE_SUCCEED);
        this.j = true;
        if (this.i != null) {
            this.i.dispose();
        }
        if (this.h != null) {
            this.h.lambda$put$1$DataCenter("data_interact_debug_info", new p(true, h().name()));
        }
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4767, new Class[0], Void.TYPE);
        } else {
            String a2 = this.f10503f.getStreamUrl().a();
            long id = this.f10503f.getId();
            String lowerCase = h().name().toLowerCase();
            if (l()) {
                fVar = a.f.f19203e;
            } else {
                fVar = a.f.f19202d;
            }
            n nVar = new n(lowerCase, a2, id, fVar.f19204f, fVar.g, fVar.i, fVar.h);
            this.o = nVar;
            this.o.a();
        }
        if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4760, new Class[0], Void.TYPE);
            return;
        }
        this.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.SELF_JOIN);
        ((ab) j.q().d().a().joinChannelV3(this.f10499b.f9030d).as(p())).a(new cu(this), new cv(this));
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f10498a, false, 4774, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f10498a, false, 4774, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (b() != null) {
            ((a) b()).d();
            ((a) b()).a("STREAM_ON_ERROR");
        }
        this.f10501d = true;
        t.a(this.f10503f.getId(), String.valueOf(this.f10499b.f9030d), h().toString(), 401, str);
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10498a, false, 4775, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10498a, false, 4775, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ((a) b()).a("STREAM_ON_USER_JOINED");
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10498a, false, 4777, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10498a, false, 4777, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g && !com.bytedance.android.live.uikit.a.a.g()) {
            com.bytedance.android.live.uikit.d.a.a(TTLiveSDKContext.getHostService().a().a(), (int) C0906R.string.d53);
            c();
        }
        if (this.f10499b.i > 0) {
            this.f10499b.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.LEFT_WON);
            this.f10499b.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.DISABLED);
        }
        ((a) b()).a("STREAM_ON_USER_LEAVED");
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10498a, false, 4778, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10498a, false, 4778, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        t.a((long) i2, PushConstants.URI_PACKAGE_NAME, h().toString());
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f10498a, false, 4753, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f10498a, false, 4753, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData == null || kVData.getKey() == null || kVData.getData() == null) {
        } else {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == 1608140686 && key.equals("cmd_stop_interact")) {
                c2 = 0;
            }
            if (c2 == 0) {
                if (((Boolean) kVData.getData()).booleanValue()) {
                    ((a) b()).d();
                } else if (this.g) {
                    c();
                }
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f10498a, false, 4756, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f10498a, false, 4756, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (iMessage instanceof com.bytedance.android.livesdk.message.model.al) {
            int i2 = ((com.bytedance.android.livesdk.message.model.al) iMessage).f16462b.f16463a;
            if (i2 != 4) {
                if (i2 == 105) {
                    g();
                }
            } else if (this.g) {
                c();
                if (this.f10499b.i > 0) {
                    this.f10499b.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.LEFT_WON);
                    this.f10499b.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.DISABLED);
                }
            } else {
                g();
            }
        } else if (iMessage instanceof an) {
            if (this.g) {
                an anVar = (an) iMessage;
                if (anVar.a() != null) {
                    com.bytedance.android.livesdk.chatroom.interact.data.d a2 = anVar.a();
                    try {
                        if (Long.parseLong(a2.f10875d) == this.f10499b.f9032f) {
                            if (this.k != null) {
                                this.k.e();
                            }
                            if (a2.g == 100102) {
                                ((a) b()).a(true);
                                this.l.f10342c = true;
                            } else if (a2.g == 100101) {
                                ((a) b()).a(false);
                                this.l.f10342c = false;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        } else if ((iMessage instanceof aj) && !this.g) {
            aj ajVar = (aj) iMessage;
            this.f10499b.f9030d = ajVar.f16455b.f11028a;
            this.f10499b.i = ajVar.f16455b.f11029b;
            this.f10499b.j = ajVar.f16455b.f11030c;
            this.f10499b.k = ajVar.f16455b.f11031d;
            this.f10499b.f9031e = ajVar.f16455b.f11032e;
            ((a) b()).b();
        }
    }

    public final void a(a aVar) {
        a.f fVar;
        a.C0147a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10498a, false, 4754, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10498a, false, 4754, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f10499b = LinkCrossRoomDataHolder.a();
        this.f10499b.lambda$put$1$DataCenter("data_pk_state", LinkCrossRoomDataHolder.d.DISABLED).observeForever("cmd_stop_interact", this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_SIGNAL.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE.getIntType(), this);
        if (this.g) {
            if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4759, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4759, new Class[0], Void.TYPE);
            } else if (b() != null) {
                this.f10499b.o = System.currentTimeMillis();
                this.h.lambda$put$1$DataCenter("cmd_interact_state_change", new q(7));
                if (PatchProxy.isSupport(new Object[0], this, f10498a, false, 4765, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f10498a, false, 4765, new Class[0], Void.TYPE);
                } else {
                    this.f10502e = this.n.b();
                    if (l()) {
                        fVar = a.f.f19203e;
                    } else {
                        fVar = a.f.f19202d;
                    }
                    this.l = new com.bytedance.android.livesdk.chatroom.interact.b.b(fVar);
                    String str = null;
                    if (TextUtils.equals(TTLiveSDKContext.getHostService().a().c(), "local_test")) {
                        if (TTLiveSDKContext.getHostService().a().a().getExternalFilesDir(null) != null) {
                            str = r1.getAbsolutePath() + "/interact_" + System.currentTimeMillis() + ".log";
                            new File(str).exists();
                        }
                    }
                    com.bytedance.b.a.a.f.a a2 = new com.bytedance.b.a.a.f.a().a(TTLiveSDKContext.getHostService().a().a()).b(com.bytedance.android.livesdk.chatroom.interact.data.c.a()).c(this.f10499b.m).b(com.bytedance.android.livesdk.chatroom.interact.data.b.f10866b).a(com.bytedance.android.livesdk.chatroom.interact.data.b.f10869e).d("d926522026314752bb721d08").e(this.f10499b.m).a(TTLiveSDKContext.getHostService().k().b()).a(this.f10499b.n).a(fVar).a(h()).f(this.f10503f.getStreamUrl().a()).a(String.valueOf(this.f10499b.f9030d)).g("#161823").a(a.b.ANCHOR).a(a.c.TEXTURE_2D);
                    a2.q = false;
                    a2.w = str;
                    com.bytedance.b.a.a.f.a c2 = a2.c(2);
                    if (((Integer) LiveSettingKeys.LIVE_USE_NEW_AUDIO_CODEC.a()).intValue() == 1) {
                        aVar2 = a.C0147a.AUDIO_PROFILE_HE;
                    } else {
                        aVar2 = a.C0147a.AUDIO_PROFILE_LC;
                    }
                    com.bytedance.b.a.a.f.a a3 = c2.a(aVar2).a(a.d.VIDEO);
                    if (com.bytedance.android.live.uikit.a.a.a()) {
                        a3.g("#161823");
                    } else {
                        a3.g("#303342");
                    }
                    this.k = new com.bytedance.b.a.a.c.a(a3, this.m, this.l);
                    this.k.a((c) this);
                    this.k.a((d) this);
                    this.k.a((b) this);
                    this.k.f();
                    this.f10499b.lambda$put$1$DataCenter("data_link_state", LinkCrossRoomDataHolder.a.TURN_ON_ENGINE);
                    b();
                }
                this.i = ((ab) Observable.timer(20, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).as(o())).a(new cs(this), new ct(this));
            }
        }
    }

    public cl(DataCenter dataCenter, final z zVar) {
        this.h = dataCenter;
        this.n = zVar;
        this.m = new com.bytedance.b.a.a.g.d() {
            public final com.bytedance.b.a.a.g.c a() {
                return cl.this.f10502e;
            }
        };
    }

    public final void a(int i2, SurfaceView surfaceView) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), surfaceView}, this, f10498a, false, 4776, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), surfaceView}, this, f10498a, false, 4776, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE);
            return;
        }
        if (this.f10499b.o > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f10499b.o;
            if (this.f10499b.h) {
                i3 = 2;
            } else {
                i3 = 3;
            }
            t.a(currentTimeMillis, i3, h().toString());
            this.f10499b.o = 0;
        }
        o oVar = new o(2);
        oVar.f10188b = surfaceView;
        if (this.h != null) {
            this.h.lambda$put$1$DataCenter("cmd_pk_state_change", oVar);
        }
        ((a) b()).f();
        ((a) b()).a("STREAM_ON_FIRST_REMOTE_VIDEO_FRAME");
    }

    public final void b(int i2, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f10498a, false, 4772, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f10498a, false, 4772, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        i();
        t.a(1, 301, "code: " + i2 + ", desc: " + str2, "anchor", PushConstants.URI_PACKAGE_NAME, h().toString(), String.valueOf(this.f10499b.f9030d));
    }

    public final void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f10498a, false, 4770, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f10498a, false, 4770, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        t.a(h().toString(), 1, i2);
        if (b() != null) {
            ((a) b()).c();
        }
        if (this.i != null) {
            this.i.dispose();
        }
        t.a(1, 107, "code: " + i2 + ", desc: " + str, "anchor", PushConstants.URI_PACKAGE_NAME, h().toString());
        this.f10499b.o = 0;
    }

    public final void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f10498a, false, 4779, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f10498a, false, 4779, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
        } else if (b() != null) {
            ((a) b()).a(j4, j5);
        }
    }
}
