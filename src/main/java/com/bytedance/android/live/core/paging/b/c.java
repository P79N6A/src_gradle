package com.bytedance.android.live.core.paging.b;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;
import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.Pair;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.a.a;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.paging.a.d;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

public abstract class c<DataKey, V, CacheKey> extends PageKeyedDataSource<DataKey, V> implements DataSource.InvalidatedCallback {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f7929b;

    /* renamed from: a  reason: collision with root package name */
    private final d<CacheKey, V> f7930a;

    /* renamed from: c  reason: collision with root package name */
    protected CacheKey f7931c;

    /* renamed from: d  reason: collision with root package name */
    protected b<CacheKey, V> f7932d;

    /* renamed from: e  reason: collision with root package name */
    protected a<CacheKey, Extra> f7933e;

    /* renamed from: f  reason: collision with root package name */
    protected MutableLiveData<com.bytedance.android.live.core.network.d> f7934f;
    protected MutableLiveData<com.bytedance.android.live.core.network.d> g;
    protected MutableLiveData<Boolean> h;
    protected MutableLiveData<Boolean> i;
    Runnable j;
    private long k;
    private final CompositeDisposable l = new CompositeDisposable();

    @NonNull
    public abstract Observable<Pair<List<V>, Extra>> a(boolean z, DataKey datakey, int i2);

    public abstract DataKey a(Extra extra);

    public void loadBefore(@NonNull PageKeyedDataSource.LoadParams<DataKey> loadParams, @NonNull PageKeyedDataSource.LoadCallback<DataKey, V> loadCallback) {
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f7929b, false, 565, new Class[0], Boolean.TYPE)) {
            return this.f7930a.i();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f7929b, false, 565, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @MainThread
    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f7929b, false, 562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7929b, false, 562, new Class[0], Void.TYPE);
        } else if (a()) {
            d();
            this.f7930a.a(false);
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f7929b, false, 563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7929b, false, 563, new Class[0], Void.TYPE);
            return;
        }
        this.f7932d.b(this.f7931c);
        this.f7933e.a(this.f7931c);
    }

    public void onInvalidated() {
        if (PatchProxy.isSupport(new Object[0], this, f7929b, false, 559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7929b, false, 559, new Class[0], Void.TYPE);
            return;
        }
        this.l.clear();
        removeInvalidatedCallback(this);
    }

    private boolean e() {
        long j2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f7929b, false, 564, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f7929b, false, 564, new Class[0], Boolean.TYPE)).booleanValue();
        }
        synchronized (this.f7930a) {
            long j3 = this.k;
            d<CacheKey, V> dVar = this.f7930a;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f7885a, false, 544, new Class[0], Long.TYPE)) {
                j2 = ((Long) PatchProxy.accessDispatch(new Object[0], dVar, d.f7885a, false, 544, new Class[0], Long.TYPE)).longValue();
            } else {
                j2 = dVar.f7887c.get();
            }
            if (j3 == j2) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() throws Exception {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f7929b, false, 566, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f7929b, false, 566, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f7934f.getValue() != null && this.f7934f.getValue() == com.bytedance.android.live.core.network.d.f7861d) {
            z = true;
        }
        if (!z) {
            invalidate();
        }
    }

    private void a(Disposable disposable) {
        Disposable disposable2 = disposable;
        if (PatchProxy.isSupport(new Object[]{disposable2}, this, f7929b, false, 558, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable2}, this, f7929b, false, 558, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        this.l.add(disposable2);
    }

    public c(d<CacheKey, V> dVar) {
        long j2;
        this.f7931c = dVar.f7888d;
        this.f7932d = dVar.f7889e;
        this.f7933e = dVar.f7890f;
        this.g = dVar.b();
        this.f7934f = dVar.a();
        this.h = dVar.c();
        this.i = dVar.d();
        this.f7930a = dVar;
        if (PatchProxy.isSupport(new Object[0], dVar, d.f7885a, false, 545, new Class[0], Long.TYPE)) {
            j2 = ((Long) PatchProxy.accessDispatch(new Object[0], dVar, d.f7885a, false, 545, new Class[0], Long.TYPE)).longValue();
        } else {
            j2 = dVar.f7887c.incrementAndGet();
        }
        this.k = j2;
        a(dVar.f().subscribe(new d(this), e.f7937a));
        a(dVar.e().observeOn(AndroidSchedulers.mainThread()).subscribe(new h(this, dVar), i.f7947a));
        a(dVar.g().subscribe((Consumer<? super T>) new j<Object>(this)));
        addInvalidatedCallback(this);
    }

    private List<V> a(List<V> list, Extra extra) {
        if (PatchProxy.isSupport(new Object[]{list, extra}, this, f7929b, false, 568, new Class[]{List.class, Extra.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, extra}, this, f7929b, false, 568, new Class[]{List.class, Extra.class}, List.class);
        }
        this.f7933e.a(this.f7931c, extra);
        return this.f7932d.a(this.f7931c, (List<V>) new ArrayList<V>(list));
    }

    public void loadAfter(@NonNull PageKeyedDataSource.LoadParams<DataKey> loadParams, @NonNull PageKeyedDataSource.LoadCallback<DataKey, V> loadCallback) {
        if (PatchProxy.isSupport(new Object[]{loadParams, loadCallback}, this, f7929b, false, 567, new Class[]{PageKeyedDataSource.LoadParams.class, PageKeyedDataSource.LoadCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{loadParams, loadCallback}, this, f7929b, false, 567, new Class[]{PageKeyedDataSource.LoadParams.class, PageKeyedDataSource.LoadCallback.class}, Void.TYPE);
        } else if (!a()) {
            this.f7934f.postValue(com.bytedance.android.live.core.network.d.f7861d);
            this.j = null;
            a(a(false, (DataKey) loadParams.key, loadParams.requestedLoadSize).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new m(this, loadCallback), new n(this, loadParams, loadCallback)));
        }
    }

    public void loadInitial(@NonNull PageKeyedDataSource.LoadInitialParams<DataKey> loadInitialParams, @NonNull PageKeyedDataSource.LoadInitialCallback<DataKey, V> loadInitialCallback) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{loadInitialParams, loadInitialCallback}, this, f7929b, false, 560, new Class[]{PageKeyedDataSource.LoadInitialParams.class, PageKeyedDataSource.LoadInitialCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{loadInitialParams, loadInitialCallback}, this, f7929b, false, 560, new Class[]{PageKeyedDataSource.LoadInitialParams.class, PageKeyedDataSource.LoadInitialCallback.class}, Void.TYPE);
        } else if (e()) {
            if (this.f7930a.f7886b) {
                this.f7930a.b(false);
                this.f7930a.a(true);
            }
            this.g.postValue(com.bytedance.android.live.core.network.d.f7861d);
            this.f7934f.postValue(com.bytedance.android.live.core.network.d.f7861d);
            this.h.postValue(Boolean.TRUE);
            this.j = null;
            List a2 = this.f7932d.a(this.f7931c);
            if (!Lists.isEmpty(a2)) {
                Extra extra = (Extra) this.f7933e.b(this.f7931c);
                loadInitialCallback.onResult(new ArrayList(a2), null, a(extra));
                if (a()) {
                    a(a(true, (DataKey) null, loadInitialParams.requestedLoadSize), loadInitialParams, loadInitialCallback);
                } else {
                    this.i.postValue(Boolean.FALSE);
                    MutableLiveData<Boolean> mutableLiveData = this.h;
                    if (a(extra) != null) {
                        z = true;
                    }
                    mutableLiveData.postValue(Boolean.valueOf(z));
                    this.g.postValue(com.bytedance.android.live.core.network.d.f7862e);
                    this.f7934f.postValue(com.bytedance.android.live.core.network.d.f7862e);
                }
            } else {
                a(a(true, (DataKey) null, loadInitialParams.requestedLoadSize), loadInitialParams, loadInitialCallback);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(@NonNull PageKeyedDataSource.LoadCallback loadCallback, Pair pair) throws Exception {
        boolean z;
        Object a2 = a((Extra) pair.second);
        MutableLiveData<Boolean> mutableLiveData = this.h;
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
        loadCallback.onResult(a((List) pair.first, (Extra) pair.second), a2);
        this.f7934f.postValue(com.bytedance.android.live.core.network.d.f7862e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(@NonNull PageKeyedDataSource.LoadInitialCallback loadInitialCallback, Pair pair) throws Exception {
        boolean z;
        this.g.postValue(com.bytedance.android.live.core.network.d.f7862e);
        this.f7934f.postValue(com.bytedance.android.live.core.network.d.f7862e);
        if (!e()) {
            if (a()) {
                this.f7930a.a(false);
            }
            return;
        }
        Object a2 = a((Extra) pair.second);
        MutableLiveData<Boolean> mutableLiveData = this.h;
        boolean z2 = true;
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        mutableLiveData.postValue(Boolean.valueOf(z));
        if (!Lists.isEmpty(this.f7932d.a(this.f7931c)) || !Lists.isEmpty((List) pair.first)) {
            z2 = false;
        }
        if (!a() || z2) {
            if (!Lists.isEmpty((List) pair.first)) {
                d();
            }
            List a3 = a((List) pair.first, (Extra) pair.second);
            this.i.postValue(Boolean.valueOf(Lists.isEmpty(a3)));
            loadInitialCallback.onResult(a3, null, a2);
            this.f7930a.a(false);
            return;
        }
        c();
        a((List) pair.first, (Extra) pair.second);
        invalidate();
        this.i.postValue(Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(@NonNull PageKeyedDataSource.LoadParams loadParams, @NonNull PageKeyedDataSource.LoadCallback loadCallback, Throwable th) throws Exception {
        this.f7934f.postValue(com.bytedance.android.live.core.network.d.a(th));
        this.j = new o(this, loadParams, loadCallback);
    }

    private void a(Observable<Pair<List<V>, Extra>> observable, @NonNull PageKeyedDataSource.LoadInitialParams<DataKey> loadInitialParams, @NonNull PageKeyedDataSource.LoadInitialCallback<DataKey, V> loadInitialCallback) {
        Observable<Pair<List<V>, Extra>> observable2 = observable;
        PageKeyedDataSource.LoadInitialParams<DataKey> loadInitialParams2 = loadInitialParams;
        PageKeyedDataSource.LoadInitialCallback<DataKey, V> loadInitialCallback2 = loadInitialCallback;
        if (PatchProxy.isSupport(new Object[]{observable2, loadInitialParams2, loadInitialCallback2}, this, f7929b, false, 561, new Class[]{Observable.class, PageKeyedDataSource.LoadInitialParams.class, PageKeyedDataSource.LoadInitialCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observable2, loadInitialParams2, loadInitialCallback2}, this, f7929b, false, 561, new Class[]{Observable.class, PageKeyedDataSource.LoadInitialParams.class, PageKeyedDataSource.LoadInitialCallback.class}, Void.TYPE);
        } else if (observable2 == null) {
            this.g.postValue(com.bytedance.android.live.core.network.d.f7862e);
            this.f7934f.postValue(com.bytedance.android.live.core.network.d.f7862e);
        } else {
            a(observable2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new k(this, loadInitialCallback2), new l(this, loadInitialParams2, loadInitialCallback2)));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(@NonNull PageKeyedDataSource.LoadInitialParams loadInitialParams, @NonNull PageKeyedDataSource.LoadInitialCallback loadInitialCallback, Throwable th) throws Exception {
        this.f7930a.a(false);
        this.g.postValue(com.bytedance.android.live.core.network.d.a(th));
        this.f7934f.postValue(com.bytedance.android.live.core.network.d.a(th));
        if (e()) {
            if (a()) {
                c();
                this.j = new f(this);
                return;
            }
            this.j = new g(this, loadInitialParams, loadInitialCallback);
        }
    }
}
