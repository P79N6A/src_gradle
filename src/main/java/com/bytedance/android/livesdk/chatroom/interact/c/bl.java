package com.bytedance.android.livesdk.chatroom.interact.c;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.autodispose.af;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.bl.c;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.event.n;
import com.bytedance.android.livesdk.chatroom.model.a.e;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.j.c.g;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.message.model.aj;
import com.bytedance.android.livesdk.message.model.am;
import com.bytedance.android.livesdk.message.model.bb;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public final class bl extends bx<a> implements a.C0132a, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10435a;

    /* renamed from: b  reason: collision with root package name */
    public LinkCrossRoomDataHolder f10436b = LinkCrossRoomDataHolder.a();

    /* renamed from: c  reason: collision with root package name */
    int f10437c = -1;

    /* renamed from: d  reason: collision with root package name */
    Room f10438d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10439e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.depend.c.a f10440f;
    private boolean g;
    private Gson h;
    private com.bytedance.android.livesdkapi.depend.model.live.a i;

    public interface a extends al {
        void a(int i);

        void a(long j, i iVar);

        void a(boolean z);

        void b();

        void b(Throwable th);

        void b(boolean z);

        void c();

        void c(Throwable th);

        void d();

        void d(Throwable th);

        void e();

        void f();

        void g();

        void h();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        b(th);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10435a, false, 4715, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10435a, false, 4715, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f10440f = new com.bytedance.android.livesdkapi.depend.c.a(this);
        ((ab) com.bytedance.android.livesdk.u.a.a().a(n.class).as(o())).a((Consumer<? super T>) new bm<Object>(this));
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE.getIntType(), this);
        h a2 = h.a();
        com.bytedance.android.livesdkapi.depend.c.a aVar2 = this.f10440f;
        boolean z = this.g;
        long id = this.f10438d.getId();
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z ? (byte) 1 : 0), new Long(id), 2}, a2, h.f9797a, false, 3994, new Class[]{Handler.class, Boolean.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            h hVar = a2;
            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z), new Long(id), 2}, hVar, h.f9797a, false, 3994, new Class[]{Handler.class, Boolean.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            a2.a((Handler) aVar2, z, id, 3, 2);
        }
        if (com.bytedance.android.live.uikit.a.a.g() && this.g && this.i == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
            if (PatchProxy.isSupport(new Object[0], this, f10435a, false, 4726, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f10435a, false, 4726, new Class[0], Void.TYPE);
                return;
            }
            ((ab) j.q().d().a().checkPermissionV3(this.f10438d.getId()).as(p())).a(new bv(this), new bw(this));
            ((ab) j.q().d().a().checkPermissionV1(this.f10438d.getId(), 1).as(p())).a(new bx(this), new bz(this));
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10435a, false, 4724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10435a, false, 4724, new Class[0], Void.TYPE);
            return;
        }
        ((ab) j.q().d().a().checkPermissionV3(this.f10438d.getId()).as(p())).a(new br(this), new bs(this));
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10435a, false, 4716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10435a, false, 4716, new Class[0], Void.TYPE);
            return;
        }
        if (this.g && this.f10436b.f9032f > 0) {
            LinkCrossRoomDataHolder.d dVar = (LinkCrossRoomDataHolder.d) this.f10436b.get("data_pk_state");
            if (!this.g || dVar != LinkCrossRoomDataHolder.d.PK) {
                a(this.f10436b.f9030d);
            } else {
                long j = this.f10436b.f9030d;
                ((ab) j.q().d().b().finish(j, this.f10436b.p, 1).as(p())).a(new bn(this, j), new by(this, j));
            }
        }
        this.f10436b.c();
        this.f10440f.removeCallbacksAndMessages(null);
        super.d();
    }

    public final void onEvent(n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f10435a, false, 4721, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f10435a, false, 4721, new Class[]{n.class}, Void.TYPE);
        } else if (b() != null) {
            switch (nVar2.f10186a) {
                case 1:
                    ((a) b()).c();
                    return;
                case 2:
                    ((a) b()).e();
                    break;
            }
        }
    }

    private void a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, this, f10435a, false, 4725, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, this, f10435a, false, 4725, new Class[]{Room.class}, Void.TYPE);
            return;
        }
        this.f10438d = room;
        if (this.f10438d.isWithLinkMic()) {
            ((a) b()).b();
            return;
        }
        if (!TextUtils.isEmpty(this.f10438d.getLinkMicInfo())) {
            LinkCrossRoomDataHolder a2 = LinkCrossRoomDataHolder.a();
            p pVar = (p) this.h.fromJson(this.f10438d.getLinkMicInfo(), p.class);
            a2.a(pVar, this.f10438d);
            e eVar = pVar.f11071b;
            if (a2.f9030d > 0 && eVar != null) {
                if (eVar.f11036b == 1 && eVar.f11035a == 4) {
                    ((a) b()).d();
                }
            } else {
                return;
            }
        }
        if (this.g) {
            b.q.a(Integer.valueOf(this.f10438d.getOwner().getLinkMicStats()));
            ((ab) j.q().d().b().cutShortCount().as(p())).a(bt.f10457b, new bu(this));
        }
    }

    public final void a(int i2) {
        int i3 = 1;
        if (PatchProxy.isSupport(new Object[]{0}, this, f10435a, false, 4719, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f10435a, false, 4719, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!this.f10439e) {
            this.f10439e = true;
            this.f10437c = 0;
            if (this.f10438d.isLiveTypeAudio()) {
                i3 = 8;
            }
            ((ab) j.q().d().a().init(this.f10438d.getId(), com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f, i3).as(p())).a(new ci(this), new cj(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f10435a, false, 4722, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f10435a, false, 4722, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        ((ab) j.q().d().a().finishV3(j2).as(p())).a(ck.f10497b, new bo(this));
    }

    public final void onMessage(IMessage iMessage) {
        String str;
        long j;
        long j2;
        String str2;
        IMessage iMessage2 = iMessage;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f10435a, false, 4717, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f10435a, false, 4717, new Class[]{IMessage.class}, Void.TYPE);
        } else if (b() != null) {
            if (iMessage2 instanceof com.bytedance.android.livesdk.message.model.al) {
                com.bytedance.android.livesdk.message.model.al alVar = (com.bytedance.android.livesdk.message.model.al) iMessage2;
                if (alVar.f16462b != null) {
                    am amVar = alVar.f16462b;
                    int i3 = amVar.f16463a;
                    if (i3 == 1) {
                        ((a) b()).b();
                    } else if (i3 != 4) {
                        if (i3 != 205) {
                            switch (i3) {
                                case 100:
                                    if (!this.g) {
                                        ((a) b()).d();
                                        break;
                                    }
                                    break;
                                case BaseLoginOrRegisterActivity.o /*101*/:
                                    if (this.g) {
                                        if (PatchProxy.isSupport(new Object[]{amVar}, this, f10435a, false, 4727, new Class[]{am.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{amVar}, this, f10435a, false, 4727, new Class[]{am.class}, Void.TYPE);
                                        } else if (this.f10436b.f9029c || this.f10436b.g > 0 || this.f10436b.f9032f > 0 || amVar.j != 1 || amVar.h != 4 || Build.VERSION.SDK_INT < 21) {
                                            HashMap hashMap = new HashMap();
                                            hashMap.put("pk_id", String.valueOf(this.f10436b.f9031e));
                                            hashMap.put("selection", "not_support");
                                            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                                            Object[] objArr = new Object[4];
                                            g gVar = new g();
                                            if (amVar.q == 1) {
                                                str = "random";
                                            } else {
                                                str = "manual";
                                            }
                                            g c2 = gVar.c(str);
                                            if (this.f10438d.getId() == amVar.g) {
                                                j = this.f10438d.getOwner().getId();
                                            } else {
                                                j = amVar.l;
                                            }
                                            g a3 = c2.a(j);
                                            if (this.f10438d.getId() == amVar.g) {
                                                j2 = amVar.l;
                                            } else {
                                                j2 = this.f10438d.getOwner().getId();
                                            }
                                            g b2 = a3.b(j2);
                                            b2.f15687d = amVar.g;
                                            if (amVar.o == 0) {
                                                str2 = "anchor";
                                            } else {
                                                str2 = PushConstants.URI_PACKAGE_NAME;
                                            }
                                            objArr[0] = b2.a(str2).b(amVar.k).a(amVar.o);
                                            objArr[1] = new com.bytedance.android.livesdk.j.c.j().a("live_detail").b("live").f("other");
                                            objArr[2] = new k();
                                            objArr[3] = Room.class;
                                            a2.a("connection_invited", hashMap, objArr);
                                        }
                                        if (this.f10436b.f9029c || this.f10436b.g > 0 || this.f10436b.f9032f > 0) {
                                            i2 = 4;
                                        } else if (amVar.j != 1 || amVar.h != 4 || (amVar.i & com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f) <= 0) {
                                            i2 = 3;
                                        } else if (Build.VERSION.SDK_INT < 21) {
                                            i2 = 7;
                                        }
                                        if (i2 <= 0) {
                                            this.f10436b.l = amVar.i;
                                            this.f10436b.f9030d = amVar.g;
                                            this.f10436b.f9032f = amVar.l;
                                            this.f10436b.i = amVar.o;
                                            this.f10436b.p = amVar.q;
                                            this.f10436b.j = amVar.k;
                                            ((af) TTLiveSDKContext.getHostService().k().b(amVar.l).as(p())).a(new cg(this, amVar), new ch(this, amVar));
                                            break;
                                        } else {
                                            ((ab) j.q().d().a().reply(amVar.g, this.f10438d.getId(), i2, amVar.l).as(p())).a(new ce(i2, amVar), new cf(this));
                                            return;
                                        }
                                    }
                                    break;
                                case 102:
                                    if (this.g && this.f10436b.f9032f != 0) {
                                        ((a) b()).a(amVar.m);
                                        break;
                                    }
                                case 103:
                                    if (this.g) {
                                        ((a) b()).d();
                                        break;
                                    }
                                    break;
                                case 104:
                                    if (this.g && this.f10436b.f9030d != 0) {
                                        ((a) b()).g();
                                        this.f10436b.c();
                                        break;
                                    }
                            }
                        } else {
                            bb a4 = c.a(this.f10438d.getId(), amVar.s);
                            a4.baseMessage = alVar.baseMessage;
                            this.y.insertMessage(a4, true);
                            if (this.g) {
                                if (alVar.f16462b.r) {
                                    ai.a((int) C0906R.string.d6r);
                                    g d2 = new g().d("passivity");
                                    if (this.f10438d.getId() == this.f10436b.f9030d) {
                                        d2.a(this.f10438d.getOwner().getId());
                                        d2.b(this.f10436b.f9032f);
                                    } else {
                                        d2.a(this.f10436b.f9032f);
                                        d2.b(this.f10438d.getOwner().getId());
                                    }
                                    com.bytedance.android.livesdk.j.a.a().a("pk_ended", new com.bytedance.android.livesdk.j.c.j().a("live_detail").b("live").f("other"), d2, this.f10436b, Room.class);
                                } else {
                                    ai.a((int) C0906R.string.d63);
                                }
                            }
                        }
                    } else {
                        ((a) b()).f();
                    }
                }
            } else if (iMessage2 instanceof aj) {
                aj ajVar = (aj) iMessage2;
                this.f10436b.f9031e = ajVar.f16455b.f11032e;
                this.f10436b.k = ajVar.f16455b.f11031d;
                this.f10436b.i = ajVar.f16455b.f11029b;
                this.f10436b.j = ajVar.f16455b.f11030c;
                this.f10436b.f9030d = ajVar.f16455b.f11028a;
            }
        }
    }

    public final void a(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f10435a, false, 4718, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f10435a, false, 4718, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (b() != null && message.what == 2) {
            if (!(message.obj instanceof Room) || !Room.isValid((Room) message.obj)) {
                a(this.f10438d);
            } else {
                a((Room) message.obj);
            }
        }
    }

    public bl(Room room, boolean z, com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
        this.f10438d = room;
        this.g = z;
        this.i = aVar;
        this.h = com.bytedance.android.live.a.a();
    }
}
