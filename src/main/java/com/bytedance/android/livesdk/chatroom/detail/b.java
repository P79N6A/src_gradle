package com.bytedance.android.livesdk.chatroom.detail;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9917a;

    /* renamed from: b  reason: collision with root package name */
    final a f9918b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9919c;

    /* renamed from: d  reason: collision with root package name */
    public Room f9920d;

    /* renamed from: e  reason: collision with root package name */
    private Disposable f9921e;

    public interface a {
        void a(int i, String str);

        void a(@NonNull Room room);
    }

    /* access modifiers changed from: package-private */
    public abstract Observable<d<Room>> c();

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9917a, false, 4054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9917a, false, 4054, new Class[0], Void.TYPE);
            return;
        }
        this.f9919c = false;
        if (this.f9921e != null && !this.f9921e.isDisposed()) {
            this.f9921e.dispose();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9917a, false, 4053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9917a, false, 4053, new Class[0], Void.TYPE);
        } else if (!this.f9919c) {
            this.f9919c = true;
            this.f9921e = c().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(this), new d(this));
        }
    }

    b(a aVar) {
        this.f9918b = aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f9917a, false, 4055, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f9917a, false, 4055, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f9919c = false;
        this.f9918b.a(i, str);
    }
}
