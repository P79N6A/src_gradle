package com.bytedance.android.livesdk.chatroom.interact.c;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.d;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.model.a.i;
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

public final class es extends bx<b> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10638a;

    /* renamed from: b  reason: collision with root package name */
    boolean f10639b;

    /* renamed from: c  reason: collision with root package name */
    boolean f10640c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10641d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10642e;

    /* renamed from: f  reason: collision with root package name */
    boolean f10643f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Room j;
    public a k;
    e l = e.a();
    public DataCenter m;
    private Observer<KVData> n = new et(this);

    public interface a {
        void a(Throwable th);

        void b();

        void b(Throwable th);

        void c();
    }

    public interface b extends al {
        void a(List<j> list);

        void a(List<i> list, String str);

        void b();

        void b(Throwable th);

        void b(List<i> list, String str);

        void c();

        void c(Throwable th);

        void d();

        void g();

        Context getContext();

        void h();

        void i();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        b(th);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4899, new Class[0], Void.TYPE);
            return;
        }
        if (b() != null && !this.g) {
            this.g = true;
            ((b) b()).d();
        }
    }

    public final void h_() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4897, new Class[0], Void.TYPE);
            return;
        }
        this.g = false;
        this.h = false;
        h();
    }

    public final String j() {
        if (!PatchProxy.isSupport(new Object[0], this, f10638a, false, 4907, new Class[0], String.class)) {
            return String.valueOf(this.j.getId());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4907, new Class[0], String.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4890, new Class[0], Void.TYPE);
        } else if (!this.f10639b) {
            this.f10639b = true;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().getList(this.j.getId(), 1).as(p())).a(new eu(this), new fa(this));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4892, new Class[0], Void.TYPE);
        } else if (b() != null) {
            com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(((b) b()).getContext(), "interact", new i.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f10644a;

                public final void b(String str) {
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f10644a, false, 4927, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f10644a, false, 4927, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    es esVar = es.this;
                    if (PatchProxy.isSupport(new Object[0], esVar, es.f10638a, false, 4893, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], esVar, es.f10638a, false, 4893, new Class[0], Void.TYPE);
                        return;
                    }
                    if (esVar.b() != null) {
                        Context context = ((b) esVar.b()).getContext();
                        if (com.bytedance.android.livesdk.o.a.a(com.bytedance.android.livesdkapi.j.a.LiveResource)) {
                            g.a().b();
                            esVar.e();
                            return;
                        }
                        com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(context, "interact", new i.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f10646a;

                            public final void b(String str) {
                            }

                            @SuppressLint({"CheckResult"})
                            public final void a(String str) {
                                if (PatchProxy.isSupport(new Object[]{str}, this, f10646a, false, 4928, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str}, this, f10646a, false, 4928, new Class[]{String.class}, Void.TYPE);
                                    return;
                                }
                                g.a().c().subscribe(new fi(this), fj.f10683b);
                            }
                        });
                    }
                }
            });
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4891, new Class[0], Void.TYPE);
            return;
        }
        if (2 == ((Integer) e.a().f9041c).intValue() || 1 == ((Integer) e.a().f9041c).intValue()) {
            com.bytedance.android.livesdk.v.j.q().d().a().leave(this.j.getId()).subscribe(fb.f10667b, new fc(this));
        }
        i();
        this.m.removeObserver("cmd_interact_state_change", this.n);
        super.d();
    }

    @SuppressLint({"CheckResult"})
    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4894, new Class[0], Void.TYPE);
        } else if (!this.f10640c) {
            this.f10640c = true;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().checkPermissionV1(this.j.getId(), 1).as(p())).a(new fd(this), new fe(this));
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4900, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4900, new Class[0], Void.TYPE);
        } else if (!this.f10643f) {
            this.f10643f = true;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().leave(this.j.getId()).as(p())).a(new fh(this), new ev(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4903, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.lambda$put$1$DataCenter("cmd_interact_state_change", new q(4));
        }
        e.a().a((Integer) 0);
        if (b() != null) {
            ((b) b()).i();
        }
    }

    public final a.e k() {
        if (PatchProxy.isSupport(new Object[0], this, f10638a, false, 4910, new Class[0], a.e.class)) {
            return (a.e) PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4910, new Class[0], a.e.class);
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

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f10638a, false, 4889, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f10638a, false, 4889, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC.getIntType(), this);
        this.m.observeForever("cmd_interact_state_change", this.n);
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f10638a, false, 4904, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f10638a, false, 4904, new Class[]{IMessage.class}, Void.TYPE);
        } else if (b() != null) {
            com.bytedance.android.livesdk.message.model.al alVar = (com.bytedance.android.livesdk.message.model.al) iMessage;
            if (alVar.f16462b != null) {
                switch (alVar.f16462b.f16463a) {
                    case 2:
                        d.a().g = alVar.f16462b.f16464b;
                        d.a().f9052f = alVar.f16462b.f16465c;
                        if (!PatchProxy.isSupport(new Object[0], this, f10638a, false, 4902, new Class[0], Void.TYPE)) {
                            if (!this.f10642e) {
                                this.f10642e = true;
                                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().joinChannelV1(this.j.getId()).as(p())).a(new ey(this), new ez(this));
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], this, f10638a, false, 4902, new Class[0], Void.TYPE);
                            return;
                        }
                        break;
                    case 3:
                        e.a().b();
                        if (b() != null) {
                            ((b) b()).g();
                        }
                        if (!this.g) {
                            this.g = true;
                            ((b) b()).d();
                            return;
                        }
                        break;
                }
            }
        }
    }

    public es(Room room, DataCenter dataCenter) {
        this.j = room;
        this.m = dataCenter;
    }
}
