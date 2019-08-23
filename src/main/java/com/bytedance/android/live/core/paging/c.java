package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.LiveData;
import android.arch.paging.PagedList;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.paging.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c<CacheKey, T> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f7968b;

    /* renamed from: c  reason: collision with root package name */
    private b<CacheKey, T> f7969c;

    /* renamed from: d  reason: collision with root package name */
    private CacheKey f7970d;

    public final void a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f7968b, false, 447, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f7968b, false, 447, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7969c.a(this.f7970d, t);
        h();
    }

    public final int b(T t) {
        if (!PatchProxy.isSupport(new Object[]{t}, this, f7968b, false, 449, new Class[]{Object.class}, Integer.TYPE)) {
            return this.f7969c.b(this.f7970d, t);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{t}, this, f7968b, false, 449, new Class[]{Object.class}, Integer.TYPE)).intValue();
    }

    public c(d<CacheKey, T> dVar, LiveData<PagedList<T>> liveData) {
        super(dVar, liveData);
        this.f7970d = dVar.f7888d;
        this.f7969c = dVar.f7889e;
    }
}
