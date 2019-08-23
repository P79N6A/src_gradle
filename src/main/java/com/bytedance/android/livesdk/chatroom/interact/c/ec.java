package com.bytedance.android.livesdk.chatroom.interact.c;

import android.arch.lifecycle.Observer;
import android.text.TextUtils;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.d;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.f.a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class ec extends bx<b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10602a;

    /* renamed from: b  reason: collision with root package name */
    boolean f10603b;

    /* renamed from: c  reason: collision with root package name */
    boolean f10604c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10605d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10606e;

    /* renamed from: f  reason: collision with root package name */
    boolean f10607f;
    boolean g;
    boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public Room m;
    long n;
    public long o;
    public a p;
    public DataCenter q;
    private Observer<KVData> r = new ed(this);

    public interface a {
        void a(long j);

        void a(long j, Throwable th);

        void a(Throwable th);

        void b();

        void b(long j);

        void c();

        void d();

        void e();
    }

    public interface b extends al {
        void a(List<j> list);

        void b();

        void c();

        void d();
    }

    public final boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10602a, false, 4870, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4870, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.m.getStreamUrlExtraSafely().m > 0) {
            z = true;
        }
        return z;
    }

    public final void g_() {
        if (PatchProxy.isSupport(new Object[0], this, f10602a, false, 4864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4864, new Class[0], Void.TYPE);
            return;
        }
        this.j = false;
        this.k = false;
        e();
    }

    public final String i() {
        if (!PatchProxy.isSupport(new Object[0], this, f10602a, false, 4872, new Class[0], String.class)) {
            return this.m.getStreamUrl().a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4872, new Class[0], String.class);
    }

    public final String j() {
        if (!PatchProxy.isSupport(new Object[0], this, f10602a, false, 4873, new Class[0], String.class)) {
            return String.valueOf(this.m.getId());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4873, new Class[0], String.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10602a, false, 4857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4857, new Class[0], Void.TYPE);
        } else if (!this.f10603b) {
            this.f10603b = true;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().getList(this.m.getId(), 4).as(p())).a(new el(this), new em(this));
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10602a, false, 4856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4856, new Class[0], Void.TYPE);
            return;
        }
        if (2 == ((Integer) e.a().f9041c).intValue() || 1 == ((Integer) e.a().f9041c).intValue()) {
            com.bytedance.android.livesdk.v.j.q().d().a().leave(this.m.getId()).subscribe(ee.f10611b, new ek(this));
        }
        this.q.removeObserver("cmd_interact_state_change", this.r);
        super.d();
    }

    public final a.e h() {
        if (PatchProxy.isSupport(new Object[0], this, f10602a, false, 4871, new Class[0], a.e.class)) {
            return (a.e) PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4871, new Class[0], a.e.class);
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

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10602a, false, 4860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4860, new Class[0], Void.TYPE);
        } else if (b() != null && !this.f10607f && !this.i) {
            if (!this.h) {
                this.f10607f = true;
                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().joinChannelV1(this.m.getId()).as(p())).a(new er(this), new ef(this));
            } else if (!this.k) {
                this.q.lambda$put$1$DataCenter("cmd_interact_state_change", new q(7));
                this.i = true;
                ((b) b()).c();
            } else {
                if (this.p != null) {
                    this.p.b();
                }
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f10602a, false, 4861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10602a, false, 4861, new Class[0], Void.TYPE);
        } else if (b() != null && !this.g && !this.j && !this.f10606e) {
            if (this.k) {
                this.j = true;
                ((b) b()).d();
            } else if (this.h) {
                this.g = true;
                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().leave(this.m.getId()).as(p())).a(new eg(this), new eh(this));
            } else {
                this.f10606e = true;
                ((ab) com.bytedance.android.livesdk.v.j.q().d().a().finishV1(this.m.getId()).as(p())).a(new ei(this), new ej(this));
            }
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f10602a, false, 4855, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f10602a, false, 4855, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.q.observeForever("cmd_interact_state_change", this.r);
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f10602a, false, 4858, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f10602a, false, 4858, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!this.f10604c) {
            this.n = j2;
            ((ab) com.bytedance.android.livesdk.v.j.q().d().a().permit(this.m.getId(), j2, com.bytedance.android.livesdk.chatroom.interact.data.b.f10870f, 1).as(p())).a(new en(this), new eo(this));
        }
    }

    public ec(Room room, DataCenter dataCenter) {
        this.m = room;
        this.q = dataCenter;
    }
}
