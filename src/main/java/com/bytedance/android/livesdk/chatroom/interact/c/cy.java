package com.bytedance.android.livesdk.chatroom.interact.c;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.d;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkRepository;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.b.a.a.f.a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;

public final class cy extends bx<b> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10530a;

    /* renamed from: b  reason: collision with root package name */
    boolean f10531b;

    /* renamed from: c  reason: collision with root package name */
    boolean f10532c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10533d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10534e;

    /* renamed from: f  reason: collision with root package name */
    boolean f10535f;
    boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    boolean l;
    boolean m;
    boolean n;
    public boolean o;
    public Room p;
    public boolean q;
    long r;
    public long s;
    public a t;
    LinkRepository u;
    public DataCenter v;
    private Observer<KVData> z = new cz(this);

    public interface a {
        void a(long j, Throwable th);

        void a(Throwable th);

        void b();

        void c();

        void c(long j);

        void d();

        void d(long j);

        void e();
    }

    public interface b extends al {
        void a(List<j> list);

        void a(boolean z);

        void b();

        void b(Throwable th);

        void b(boolean z);

        void c();

        void c(Throwable th);

        void d();

        void d(Throwable th);

        void e(Throwable th);

        void f(Throwable th);

        void g();

        Context getContext();

        void h();

        void i();

        void j();

        void k();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        b(th);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f10530a, false, 4799, new Class[0], String.class)) {
            return String.valueOf(this.p.getId());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4799, new Class[0], String.class);
    }

    public final long e() {
        if (!PatchProxy.isSupport(new Object[0], this, f10530a, false, 4800, new Class[0], Long.TYPE)) {
            return TTLiveSDKContext.getHostService().k().b();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4800, new Class[0], Long.TYPE)).longValue();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4806, new Class[0], Void.TYPE);
            return;
        }
        this.k = false;
        this.h = false;
        if (this.q) {
            n();
        } else {
            h();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4809, new Class[0], Void.TYPE);
            return;
        }
        if (b() != null && !this.k) {
            this.k = true;
            ((b) b()).c();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4796, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4796, new Class[0], Void.TYPE);
            return;
        }
        this.v.lambda$put$1$DataCenter("cmd_interact_state_change", new q(4));
        e.a().a((Integer) 0);
        if (b() != null) {
            ((b) b()).k();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4823, new Class[0], Void.TYPE);
            return;
        }
        if (2 == ((Integer) e.a().f9041c).intValue() || 1 == ((Integer) e.a().f9041c).intValue()) {
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().leave(this.p.getId()).as(p())).a(dr.f10579b, new ds(this));
        }
        this.v.removeObserver("cmd_interact_state_change", this.z);
        if (!this.q) {
            a();
        }
        super.d();
    }

    public final a.e f_() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4802, new Class[0], a.e.class)) {
            return (a.e) PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4802, new Class[0], a.e.class);
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
            int i2 = d.a().i;
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

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4808, new Class[0], Void.TYPE);
        } else if (!this.g) {
            this.g = true;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().leave(this.p.getId()).as(p())).a(new dv(this), new dw(this));
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4810, new Class[0], Void.TYPE);
        } else if (b() != null) {
            com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(((b) b()).getContext(), "interact", new i.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f10536a;

                public final void b(String str) {
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f10536a, false, 4851, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f10536a, false, 4851, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    cy cyVar = cy.this;
                    if (PatchProxy.isSupport(new Object[0], cyVar, cy.f10530a, false, 4811, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cyVar, cy.f10530a, false, 4811, new Class[0], Void.TYPE);
                        return;
                    }
                    if (cyVar.b() != null) {
                        Context context = ((b) cyVar.b()).getContext();
                        if (com.bytedance.android.livesdk.o.a.a(com.bytedance.android.livesdkapi.j.a.LiveResource)) {
                            g.a().b();
                            cyVar.k();
                            return;
                        }
                        com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(context, "interact", new i.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10538a;

                            public final void b(String str) {
                            }

                            @SuppressLint({"CheckResult"})
                            public final void a(String str) {
                                if (PatchProxy.isSupport(new Object[]{str}, this, f10538a, false, 4852, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str}, this, f10538a, false, 4852, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                ((ab) g.a().c().as(cy.this.o())).a(new ea(this), new eb(this));
                            }
                        });
                    }
                }
            });
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4812, new Class[0], Void.TYPE);
        } else if (!this.f10532c) {
            this.f10532c = true;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().checkPermissionV1(this.p.getId(), 8).as(p())).a(new dx(this), new dy(this));
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4813, new Class[0], Void.TYPE);
        } else if (!this.f10531b) {
            this.f10531b = true;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().getList(this.p.getId(), 4).as(p())).a(new dz(this), new db(this));
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4817, new Class[0], Void.TYPE);
        } else if (b() != null && !this.f10535f && !this.j) {
            if (!this.m) {
                this.f10535f = true;
                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().joinChannelV1(this.p.getId()).as(p())).a(new de(this), new df(this));
            } else if (!this.h) {
                this.v.lambda$put$1$DataCenter("cmd_interact_state_change", new q(7));
                this.j = true;
                ((b) b()).b();
            } else {
                if (this.t != null) {
                    this.t.b();
                }
            }
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4818, new Class[0], Void.TYPE);
        } else if (b() != null && !this.g && !this.k && !this.l) {
            if (this.h) {
                this.k = true;
                ((b) b()).c();
            } else if (this.m) {
                this.g = true;
                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().leave(this.p.getId()).as(p())).a(new dg(this), new dh(this));
            } else {
                this.l = true;
                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().finishV1(this.p.getId()).as(p())).a(new di(this), new dj(this));
            }
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f10530a, false, 4819, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f10530a, false, 4819, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!this.n) {
            this.r = j2;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().permit(this.p.getId(), j2, com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f, 8).as(p())).a(new dk(this), new dm(this));
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f10530a, false, 4822, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f10530a, false, 4822, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getIntType(), this);
        this.v.observeForever("cmd_interact_state_change", this.z);
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f10530a, false, 4797, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f10530a, false, 4797, new Class[]{IMessage.class}, Void.TYPE);
        } else if (b() != null) {
            com.bytedance.android.livesdk.message.model.al alVar = (com.bytedance.android.livesdk.message.model.al) iMessage;
            if (alVar.f16462b != null) {
                switch (alVar.f16462b.f16463a) {
                    case 2:
                        d.a().g = alVar.f16462b.f16464b;
                        d.a().f9052f = alVar.f16462b.f16465c;
                        if (PatchProxy.isSupport(new Object[0], this, f10530a, false, 4798, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f10530a, false, 4798, new Class[0], Void.TYPE);
                            break;
                        } else {
                            if (!this.f10535f) {
                                this.f10535f = true;
                                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().joinChannelV1(this.p.getId()).as(p())).a(new da(this), new dl(this));
                            }
                            return;
                        }
                    case 3:
                        e.a().b();
                        if (b() != null) {
                            ((b) b()).j();
                        }
                        if (!this.k) {
                            this.k = true;
                            ((b) b()).c();
                            return;
                        }
                        break;
                    case 10:
                        if (alVar.f16462b.t == TTLiveSDKContext.getHostService().k().b()) {
                            ((b) b()).b(false);
                            return;
                        }
                        break;
                    case 11:
                        if (alVar.f16462b.t == TTLiveSDKContext.getHostService().k().b()) {
                            ((b) b()).b(true);
                            break;
                        }
                        break;
                }
            }
        }
    }

    public cy(Room room, boolean z2, DataCenter dataCenter) {
        this.p = room;
        this.q = z2;
        this.v = dataCenter;
        this.u = (LinkRepository) com.bytedance.android.livesdk.v.j.q().d().a(LinkRepository.class);
    }
}
