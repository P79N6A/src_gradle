package com.bytedance.android.livesdk.live.c;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.live.data.d;
import com.bytedance.android.livesdk.live.data.e;
import com.bytedance.android.livesdk.live.data.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15815a;

    /* renamed from: b  reason: collision with root package name */
    final List<Bundle> f15816b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    final List<Room> f15817c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    final List<FeedItem> f15818d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    Extra f15819e;
    private CompositeDisposable g = new CompositeDisposable();
    private d h;
    private boolean i;

    public final void a(int i2, FeedItem feedItem) {
    }

    public final void a(long j) {
    }

    @NonNull
    public final List<Room> d() {
        return this.f15817c;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f15815a, false, 10338, new Class[0], Integer.TYPE)) {
            return this.f15816b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15815a, false, 10338, new Class[0], Integer.TYPE)).intValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f15815a, false, 10344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15815a, false, 10344, new Class[0], Void.TYPE);
            return;
        }
        this.f15816b.clear();
        this.f15817c.clear();
        this.g.clear();
    }

    public b(Bundle bundle) {
        this.f15816b.add(bundle);
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15815a, false, 10336, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15815a, false, 10336, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Room room = new Room();
        room.setId(bundle.getLong("live.intent.extra.ROOM_ID", -1));
        this.f15817c.add(room);
    }

    private void a(List<com.bytedance.android.livesdkapi.depend.model.live.b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15815a, false, 10341, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15815a, false, 10341, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            for (com.bytedance.android.livesdkapi.depend.model.live.b next : list) {
                Room room = next.f18712a;
                Bundle bundle = new Bundle();
                bundle.putLong("live.intent.extra.ROOM_ID", room.getId());
                bundle.putString("live.intent.extra.LOG_PB", next.f18713b);
                this.f15816b.add(bundle);
                this.f15817c.add(room);
            }
        }
    }

    public final int a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15815a, false, 10339, new Class[]{Bundle.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bundle}, this, f15815a, false, 10339, new Class[]{Bundle.class}, Integer.TYPE)).intValue();
        }
        long j = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        for (int i2 = 0; i2 < this.f15816b.size(); i2++) {
            Bundle bundle2 = this.f15816b.get(i2);
            if (bundle2 != null && bundle2.getLong("live.intent.extra.ROOM_ID", 0) == j) {
                return i2;
            }
        }
        return -1;
    }

    public final void b(int i2) {
        long j;
        Observable observable;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15815a, false, 10342, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15815a, false, 10342, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!this.i) {
            if (this.f15819e == null || this.f15819e.hasMore) {
                if (this.h == null) {
                    this.h = new d();
                }
                d dVar = this.h;
                if (this.f15819e == null) {
                    j = 1;
                } else {
                    j = this.f15819e.maxTime;
                }
                if (PatchProxy.isSupport(new Object[]{new Long(j), "detail_loadmore"}, dVar, d.f15842a, false, 10316, new Class[]{Long.TYPE, String.class}, Observable.class)) {
                    d dVar2 = dVar;
                    observable = (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j), "detail_loadmore"}, dVar2, d.f15842a, false, 10316, new Class[]{Long.TYPE, String.class}, Observable.class);
                } else {
                    observable = dVar.f15844c.feed(d.f15843b, j, "detail_loadmore").map(new e(dVar)).doOnNext(f.f15848b);
                }
                this.g.add(observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new c(this), d.f15823b));
            }
        }
    }

    public final Bundle a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15815a, false, 10337, new Class[]{Integer.TYPE}, Bundle.class)) {
            return this.f15816b.get(i2);
        }
        return (Bundle) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15815a, false, 10337, new Class[]{Integer.TYPE}, Bundle.class);
    }

    public b(List<com.bytedance.android.livesdkapi.depend.model.live.b> list, boolean z) {
        this.i = z;
        a(list);
    }
}
