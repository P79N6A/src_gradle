package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.d;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public final class a extends b<C0086a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10349a;

    /* renamed from: b  reason: collision with root package name */
    public final CompositeDisposable f10350b = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    public boolean f10351c;

    /* renamed from: d  reason: collision with root package name */
    boolean f10352d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10353e;

    /* renamed from: f  reason: collision with root package name */
    public Room f10354f;
    public com.bytedance.android.livesdk.chatroom.interact.d.a g;
    private boolean h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.a$a  reason: collision with other inner class name */
    public interface C0086a extends com.bytedance.ies.a.a {
        void a();

        void a(Throwable th);

        void b();

        void b(Throwable th);

        void c();

        void c(Throwable th);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10349a, false, 4618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10349a, false, 4618, new Class[0], Void.TYPE);
            return;
        }
        this.f10350b.clear();
        super.d();
    }

    /* access modifiers changed from: package-private */
    public void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f10349a, false, 4624, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f10349a, false, 4624, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.live.core.c.a.a(6, "AudioGuestManagerPresenter", th.getStackTrace());
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10349a, false, 4621, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10349a, false, 4621, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!this.f10352d) {
            this.f10352d = true;
            this.f10350b.add(j.q().d().a().silence(this.f10354f.getId(), j).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(this), new c(this)));
        }
    }

    public final void b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10349a, false, 4622, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10349a, false, 4622, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!this.f10353e) {
            this.f10353e = true;
            this.f10350b.add(j.q().d().a().unSilence(this.f10354f.getId(), j).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(this), new e(this)));
        }
    }

    public final boolean a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10349a, false, 4619, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10349a, false, 4619, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        com.bytedance.android.livesdk.chatroom.model.a.j b2 = this.g.b(TTLiveSDKContext.getHostService().k().b(), d.a().h);
        if (this.h || !z) {
            return true;
        }
        if (b2 == null || b2.m == 2) {
            return false;
        }
        return true;
    }

    public a(Room room, boolean z, com.bytedance.android.livesdk.chatroom.interact.d.a aVar) {
        this.f10354f = room;
        this.h = z;
        this.g = aVar;
    }
}
