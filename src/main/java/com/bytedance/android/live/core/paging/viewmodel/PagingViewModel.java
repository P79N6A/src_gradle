package com.bytedance.android.live.core.paging.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.paging.PagedList;
import android.support.annotation.MainThread;
import com.bytedance.android.live.core.network.d;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PagingViewModel<T> extends RxViewModel {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f7972b;

    /* renamed from: a  reason: collision with root package name */
    private final Observer<d> f7973a = new a(this);

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<d> f7974c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<d> f7975d = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    public MutableLiveData<Boolean> f7976e = new MutableLiveData<>();

    /* renamed from: f  reason: collision with root package name */
    public MutableLiveData<Boolean> f7977f = new MutableLiveData<>();
    public MutableLiveData<Integer> g = new MutableLiveData<>();
    public MutableLiveData<PagedList<T>> h = new MutableLiveData<>();
    public b<T> i;
    private final Observer<d> l = new b(this);
    private final Observer<PagedList<T>> m = new c(this);
    private final Observer<Boolean> n = new d(this);
    private final Observer<Boolean> o = new e(this);
    private final Observer<Integer> p = new f(this);

    public boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f7972b, false, 597, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f7972b, false, 597, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((this.f7975d.getValue() != null && ((d) this.f7975d.getValue()).a()) || this.i == null) {
            return false;
        } else {
            this.i.f();
            return true;
        }
    }

    @MainThread
    public final void a(b<T> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f7972b, false, 595, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f7972b, false, 595, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.b().removeObserver(this.f7973a);
            this.i.c().removeObserver(this.l);
            this.i.a().removeObserver(this.m);
            this.i.e().removeObserver(this.n);
            this.i.d().removeObserver(this.o);
            this.i.i().removeObserver(this.p);
        }
        this.i = bVar;
        if (bVar != null) {
            this.i.b().observeForever(this.f7973a);
            this.i.c().observeForever(this.l);
            this.i.a().observeForever(this.m);
            this.i.e().observeForever(this.n);
            this.i.d().observeForever(this.o);
            this.i.i().observeForever(this.p);
        }
    }
}
