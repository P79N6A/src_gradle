package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.utils.b.c;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class af extends com.bytedance.ies.a.b<b> implements a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11207a;

    /* renamed from: b  reason: collision with root package name */
    public a f11208b;

    /* renamed from: c  reason: collision with root package name */
    Handler f11209c = new com.bytedance.android.livesdkapi.depend.c.a(this);

    /* renamed from: d  reason: collision with root package name */
    boolean f11210d;

    /* renamed from: e  reason: collision with root package name */
    List<com.bytedance.android.live.base.model.b> f11211e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    int f11212f = 0;
    int g = 20;
    public boolean h;
    private Disposable i;
    private boolean j;

    public interface a {
        void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar);

        void a(Throwable th);
    }

    public interface b extends com.bytedance.ies.a.a {
        void a();

        void a(i iVar);

        void a(Throwable th);

        void a(List<com.bytedance.android.live.base.model.b> list);

        void b(Throwable th);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11207a, false, 5227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11207a, false, 5227, new Class[0], Void.TYPE);
            return;
        }
        if (b() != null) {
            ((b) b()).a();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11207a, false, 5231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11207a, false, 5231, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.i != null && !this.i.isDisposed()) {
            this.i.dispose();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f11207a, false, 5226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11207a, false, 5226, new Class[0], Void.TYPE);
        } else if (!this.f11210d) {
            this.f11210d = true;
            this.i = ((com.bytedance.android.livesdk.utils.b.b) j.q().d().e().get(this.f11212f, this.g).as(c.a())).a(3).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new am(this), new an(this), new ao(this));
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f11207a, false, 5224, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f11207a, false, 5224, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.f11211e.clear();
    }

    public final void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f11207a, false, 5230, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f11207a, false, 5230, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        int i2 = message2.what;
        if (i2 != 0) {
            if (i2 == 100) {
                a();
            }
            return;
        }
        this.j = false;
        if (b() != null) {
            if (message2.obj instanceof Exception) {
                ((b) b()).a((Throwable) (Exception) message2.obj);
            } else if (message2.obj instanceof User) {
                ((b) b()).a((i) (User) message2.obj);
            } else {
                ((b) b()).a((Throwable) new Exception("unknown msg.what"));
            }
        }
    }

    public final void a(HashMap<String, String> hashMap) {
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, f11207a, false, 5225, new Class[]{HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap}, this, f11207a, false, 5225, new Class[]{HashMap.class}, Void.TYPE);
        } else if (!this.j) {
            TTLiveSDKContext.getHostService().k().a(hashMap).observeOn(AndroidSchedulers.mainThread()).subscribe(new ag(this), new ah(this));
        }
    }
}
