package com.bytedance.android.live.core.paging.a;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.a.a;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.paging.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicLong;

public final class d<CacheKey, V> implements a<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7885a;
    private static final PagedList.Config h = new PagedList.Config.Builder().setEnablePlaceholders(false).setPageSize(12).setPrefetchDistance(12).build();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f7886b = false;

    /* renamed from: c  reason: collision with root package name */
    public AtomicLong f7887c = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    public CacheKey f7888d;

    /* renamed from: e  reason: collision with root package name */
    public b<CacheKey, V> f7889e;

    /* renamed from: f  reason: collision with root package name */
    public a<CacheKey, Extra> f7890f;
    public com.bytedance.android.live.core.paging.b.b<V> g;
    private MutableLiveData<com.bytedance.android.live.core.network.d> i = new MutableLiveData<>();
    private MutableLiveData<com.bytedance.android.live.core.network.d> j = new MutableLiveData<>();
    private MutableLiveData<Boolean> k = new MutableLiveData<>();
    private MutableLiveData<Boolean> l = new MutableLiveData<>();
    private PublishSubject<Object> m = PublishSubject.create();
    private PublishSubject<Object> n = PublishSubject.create();
    private PublishSubject<Object> o = PublishSubject.create();
    private volatile boolean p = false;
    private MutableLiveData<Integer> q = new MutableLiveData<>();
    private PagedList.Config r = h;

    public final MutableLiveData<com.bytedance.android.live.core.network.d> a() {
        return this.i;
    }

    public final MutableLiveData<com.bytedance.android.live.core.network.d> b() {
        return this.j;
    }

    public final MutableLiveData<Boolean> c() {
        return this.k;
    }

    public final MutableLiveData<Boolean> d() {
        return this.l;
    }

    public final PublishSubject<Object> e() {
        return this.m;
    }

    public final PublishSubject<Object> f() {
        return this.n;
    }

    public final PublishSubject<Object> g() {
        return this.o;
    }

    public final MutableLiveData<Integer> h() {
        return this.q;
    }

    public final boolean i() {
        return this.p;
    }

    public final com.bytedance.android.live.core.paging.b<V> j() {
        if (PatchProxy.isSupport(new Object[0], this, f7885a, false, 546, new Class[0], com.bytedance.android.live.core.paging.b.class)) {
            return (com.bytedance.android.live.core.paging.b) PatchProxy.accessDispatch(new Object[0], this, f7885a, false, 546, new Class[0], com.bytedance.android.live.core.paging.b.class);
        }
        AnonymousClass1 r0 = new DataSource.Factory<Long, V>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f7891a;

            public final DataSource<Long, V> create() {
                if (!PatchProxy.isSupport(new Object[0], this, f7891a, false, 547, new Class[0], DataSource.class)) {
                    return new com.bytedance.android.live.core.paging.b.a(d.this);
                }
                return (DataSource) PatchProxy.accessDispatch(new Object[0], this, f7891a, false, 547, new Class[0], DataSource.class);
            }
        };
        return new c(this, new LivePagedListBuilder((DataSource.Factory<Key, Value>) r0, this.r).setBoundaryCallback(new b(this.k, this.l)).build());
    }

    public final d<CacheKey, V> a(PagedList.Config config) {
        this.r = config;
        return this;
    }

    public final void b(boolean z) {
        this.f7886b = z;
    }

    public final d<CacheKey, V> a(@NonNull com.bytedance.android.live.core.paging.b.b<V> bVar) {
        this.g = bVar;
        return this;
    }

    public final d<CacheKey, V> a(CacheKey cachekey) {
        this.f7888d = cachekey;
        return this;
    }

    public final void a(boolean z) {
        this.p = z;
    }

    public final d<CacheKey, V> a(b<CacheKey, V> bVar, a<CacheKey, Extra> aVar) {
        this.f7889e = bVar;
        this.f7890f = aVar;
        return this;
    }
}
