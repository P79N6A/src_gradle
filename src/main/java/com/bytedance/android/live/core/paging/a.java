package com.bytedance.android.live.core.paging;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PagedList;
import com.bytedance.android.live.core.network.d;
import com.bytedance.android.live.core.rxutils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7874a;

    /* renamed from: b  reason: collision with root package name */
    private LiveData<PagedList<T>> f7875b;

    /* renamed from: c  reason: collision with root package name */
    private MutableLiveData<d> f7876c;

    /* renamed from: d  reason: collision with root package name */
    private MutableLiveData<d> f7877d;

    /* renamed from: e  reason: collision with root package name */
    private MutableLiveData<Boolean> f7878e;

    /* renamed from: f  reason: collision with root package name */
    private PublishSubject<Object> f7879f;
    private PublishSubject<Object> g;
    private PublishSubject<Object> h;
    private MutableLiveData<Integer> i;
    private MutableLiveData<Boolean> j;

    public final LiveData<PagedList<T>> a() {
        return this.f7875b;
    }

    public final LiveData<d> b() {
        return this.f7876c;
    }

    public final LiveData<d> c() {
        return this.f7877d;
    }

    public final LiveData<Boolean> d() {
        return this.j;
    }

    public final LiveData<Boolean> e() {
        return this.f7878e;
    }

    public final LiveData<Integer> i() {
        return this.i;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f7874a, false, 430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7874a, false, 430, new Class[0], Void.TYPE);
            return;
        }
        this.f7879f.onNext(i.f8107b);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f7874a, false, 431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7874a, false, 431, new Class[0], Void.TYPE);
            return;
        }
        this.g.onNext(i.f8107b);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f7874a, false, 432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7874a, false, 432, new Class[0], Void.TYPE);
            return;
        }
        this.h.onNext(i.f8107b);
    }

    public void a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f7874a, false, 438, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f7874a, false, 438, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        throw new RuntimeException("unsupported operation");
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f7874a, false, 433, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f7874a, false, 433, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.setValue(Integer.valueOf(i2));
    }

    public int b(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f7874a, false, 440, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{t}, this, f7874a, false, 440, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }
        throw new RuntimeException("unsupported operation");
    }

    public a(com.bytedance.android.live.core.paging.a.a<T> aVar, LiveData<PagedList<T>> liveData) {
        this.f7876c = aVar.a();
        this.f7877d = aVar.b();
        this.j = aVar.c();
        this.f7879f = aVar.e();
        this.g = aVar.f();
        this.h = aVar.g();
        this.f7875b = liveData;
        this.f7878e = aVar.d();
        this.i = aVar.h();
    }
}
