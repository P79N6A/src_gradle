package com.bytedance.android.livesdk.live.a.c;

import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.c.a.c.a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15789a;

    /* renamed from: b  reason: collision with root package name */
    public a f15790b;

    /* renamed from: c  reason: collision with root package name */
    private Room f15791c;

    /* renamed from: d  reason: collision with root package name */
    private Disposable f15792d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15789a, false, 10304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15789a, false, 10304, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15792d != null && !this.f15792d.isDisposed()) {
            this.f15792d.dispose();
        }
    }

    public b(Room room) {
        this.f15791c = room;
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15789a, false, 10303, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15789a, false, 10303, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f15792d = j.q().d().f().sendStatus(this.f15791c.getId(), i, this.f15791c.getStreamId(), i2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(this), new d(this));
    }
}
