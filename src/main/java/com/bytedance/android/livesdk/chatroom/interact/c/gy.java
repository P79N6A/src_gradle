package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.contract.c;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.common.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class gy extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10779a;

    /* renamed from: c  reason: collision with root package name */
    private Room f10780c;

    /* renamed from: d  reason: collision with root package name */
    private long f10781d;

    /* renamed from: e  reason: collision with root package name */
    private int f10782e;

    /* renamed from: f  reason: collision with root package name */
    private j f10783f;
    private long g;

    public final Room b() {
        return this.f10780c;
    }

    public final long c() {
        return this.f10781d;
    }

    public final int d() {
        return this.f10782e;
    }

    public final j g() {
        return this.f10783f;
    }

    public final User a() {
        if (this.f10783f != null) {
            return this.f10783f.f11052e;
        }
        return null;
    }

    public final boolean f() {
        if (this.f10783f == null || this.f10783f.h != 2) {
            return false;
        }
        return true;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f10779a, false, 5014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10779a, false, 5014, new Class[0], Void.TYPE);
            return;
        }
        super.h();
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f10779a, false, 5017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10779a, false, 5017, new Class[0], Void.TYPE);
        } else if (this.f13640b != null) {
            if (this.f10783f == null) {
                ((c.b) this.f13640b).setVisibility(false);
                return;
            }
            ((c.b) this.f13640b).setVisibility(true);
            if (this.f10783f.f11052e != null) {
                ((c.b) this.f13640b).a(this.f10783f.f11052e);
            }
            a(this.f10783f.f11050c);
            if (this.f10783f.j > 0) {
                ((c.b) this.f13640b).a(this.f10783f.k, e());
            }
            ((c.b) this.f13640b).b(e());
        }
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f10779a, false, 5019, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10779a, false, 5019, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f10781d != 0 && this.f10781d == TTLiveSDKContext.getHostService().k().b()) {
            z = true;
        }
        return z;
    }

    public final /* synthetic */ void a(e eVar) {
        c.b bVar = (c.b) eVar;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f10779a, false, 5013, new Class[]{c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f10779a, false, 5013, new Class[]{c.b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        i();
    }

    public final void a(int i) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f10779a, false, 5015, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f10779a, false, 5015, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f10783f != null) {
            this.f10783f.f11049b = i;
        }
        if (this.f13640b != null) {
            c.b bVar = (c.b) this.f13640b;
            if (i != 0) {
                z = false;
            }
            bVar.a(z);
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10779a, false, 5018, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10779a, false, 5018, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (j >= this.g) {
            this.g = j;
            if (this.f13640b != null) {
                ((c.b) this.f13640b).a(this.g);
            }
            if (e()) {
                com.bytedance.android.livesdk.app.dataholder.e.a().a(this.g);
            }
        }
    }

    public final void a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f10779a, false, 5016, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f10779a, false, 5016, new Class[]{j.class}, Void.TYPE);
            return;
        }
        if (this.f10783f != null) {
            this.f10783f.a(jVar);
        } else {
            this.f10783f = jVar;
        }
        if (this.f10783f != null) {
            this.f10782e = this.f10783f.f11051d;
            if (this.f10783f.f11052e != null) {
                this.f10781d = this.f10783f.f11052e.getId();
            }
        }
        i();
    }

    public gy(Room room, long j, int i, j jVar) {
        this.f10780c = room;
        this.f10781d = j;
        this.f10782e = i;
        if (this.f10783f != null) {
            this.f10783f.a(jVar);
        } else {
            this.f10783f = jVar;
        }
        if (this.f10783f != null) {
            this.f10782e = this.f10783f.f11051d;
            if (this.f10783f.f11052e != null) {
                this.f10781d = this.f10783f.f11052e.getId();
            }
        }
    }
}
