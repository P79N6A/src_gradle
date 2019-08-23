package com.bytedance.android.livesdk.chatroom.presenter;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.f;
import com.bytedance.android.livesdk.g.c;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.ies.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

public final class n extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11374a;

    /* renamed from: b  reason: collision with root package name */
    public String f11375b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.model.b f11376c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11377d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11378e;

    /* renamed from: f  reason: collision with root package name */
    public Room f11379f;
    public int g = 0;
    private CompositeDisposable h = new CompositeDisposable();

    public interface a extends com.bytedance.ies.a.a {
        void a();

        void a(i iVar);

        void a(String str);

        void a(boolean z);

        void b();

        void c();
    }

    public final void g() {
        this.g = 0;
    }

    public final boolean a() {
        if (this.f11376c != null) {
            return true;
        }
        return false;
    }

    public final long c() {
        if (this.f11376c == null) {
            return 0;
        }
        return this.f11376c.f15105d;
    }

    public final int e() {
        if (this.f11376c != null) {
            return this.f11376c.f15107f;
        }
        return 0;
    }

    public final boolean f() {
        if (this.f11376c == null || !this.f11376c.g) {
            return false;
        }
        return true;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11374a, false, 5183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11374a, false, 5183, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.h != null) {
            this.h.clear();
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f11374a, false, 5181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11374a, false, 5181, new Class[0], Void.TYPE);
        } else if (this.f11376c != null) {
            long longValue = ((Long) com.bytedance.android.livesdk.w.b.L.a()).longValue();
            if (longValue <= 0 || longValue != this.f11376c.f15105d) {
                this.f11377d = true;
                com.bytedance.android.livesdk.w.b.L.a(0L);
                return;
            }
            this.f11377d = false;
        }
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f11374a, false, 5184, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f11374a, false, 5184, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.h.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11380a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f11380a, false, 5188, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f11380a, false, 5188, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof com.bytedance.android.livesdk.chatroom.event.i) {
                    n.this.onEvent((com.bytedance.android.livesdk.chatroom.event.i) t);
                } else {
                    if (t instanceof c) {
                        n.this.onEvent((c) t);
                    }
                }
            }
        }));
    }

    public final void onEvent(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f11374a, false, 5177, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f11374a, false, 5177, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (cVar2 != null && cVar2.f14631a == 2) {
            if (PatchProxy.isSupport(new Object[0], this, f11374a, false, 5178, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f11374a, false, 5178, new Class[0], Void.TYPE);
                return;
            }
            a((Context) null);
        }
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f11374a, false, 5179, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f11374a, false, 5179, new Class[]{Context.class}, Void.TYPE);
        } else if (!this.f11378e) {
            if (this.f11376c == null) {
                this.f11378e = false;
                return;
            }
            this.f11378e = true;
            ((GiftRetrofitApi) ((h) com.bytedance.android.live.utility.b.a(h.class)).c().create(GiftRetrofitApi.class)).send(this.f11376c.f15105d, this.f11379f.getId(), this.f11379f.getOwner().getId(), 1, 126).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new o(this, SystemClock.uptimeMillis(), context2), new p(this), new q(this));
        }
    }

    public final void onEvent(com.bytedance.android.livesdk.chatroom.event.i iVar) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f11374a, false, 5176, new Class[]{com.bytedance.android.livesdk.chatroom.event.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f11374a, false, 5176, new Class[]{com.bytedance.android.livesdk.chatroom.event.i.class}, Void.TYPE);
            return;
        }
        if (iVar != null && com.bytedance.android.live.uikit.a.a.f()) {
            if (iVar.f10177a == null) {
                i = 8;
            }
            ((com.bytedance.android.live.room.c) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.room.c.class)).toolbarManagerHelper().b().a(f.FAST_GIFT, (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.a) new com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b(i));
        }
        if (iVar != null && iVar.f10177a != null && iVar.f10177a.f15105d > 0) {
            if (iVar.f10178b == 1 || this.f11376c == null || !this.f11376c.equals(iVar.f10177a)) {
                this.f11376c = iVar.f10177a;
                h();
                if (b() != null) {
                    if (iVar.f10178b == 1) {
                        ((a) b()).a(iVar.f10179c);
                        return;
                    }
                    ((a) b()).b();
                }
            }
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11374a, false, 5182, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11374a, false, 5182, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (this.h != null) {
            this.h.clear();
        }
        a(com.bytedance.android.livesdk.chatroom.event.i.class);
        a(c.class);
        com.bytedance.android.livesdk.gift.model.b fastGift = GiftManager.inst().getFastGift();
        if (fastGift != null && this.f11376c == null && fastGift.f15105d > 0) {
            this.f11376c = fastGift;
            h();
            if (b() != null) {
                ((a) b()).b();
            }
        }
    }
}
