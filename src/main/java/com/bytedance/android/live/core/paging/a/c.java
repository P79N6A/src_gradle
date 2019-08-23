package com.bytedance.android.live.core.paging.a;

import android.arch.lifecycle.MutableLiveData;
import com.bytedance.android.live.core.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;

public class c<V> implements a<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7883a;

    /* renamed from: b  reason: collision with root package name */
    public d<String, V> f7884b = new d<>();

    public final MutableLiveData<d> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 527, new Class[0], MutableLiveData.class)) {
            return this.f7884b.a();
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 527, new Class[0], MutableLiveData.class);
    }

    public final MutableLiveData<d> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 528, new Class[0], MutableLiveData.class)) {
            return this.f7884b.b();
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 528, new Class[0], MutableLiveData.class);
    }

    public final MutableLiveData<Boolean> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 533, new Class[0], MutableLiveData.class)) {
            return this.f7884b.c();
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 533, new Class[0], MutableLiveData.class);
    }

    public final MutableLiveData<Boolean> d() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 534, new Class[0], MutableLiveData.class)) {
            return this.f7884b.d();
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 534, new Class[0], MutableLiveData.class);
    }

    public final PublishSubject<Object> e() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 535, new Class[0], PublishSubject.class)) {
            return this.f7884b.e();
        }
        return (PublishSubject) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 535, new Class[0], PublishSubject.class);
    }

    public final PublishSubject<Object> f() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 536, new Class[0], PublishSubject.class)) {
            return this.f7884b.f();
        }
        return (PublishSubject) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 536, new Class[0], PublishSubject.class);
    }

    public final PublishSubject<Object> g() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 537, new Class[0], PublishSubject.class)) {
            return this.f7884b.g();
        }
        return (PublishSubject) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 537, new Class[0], PublishSubject.class);
    }

    public final MutableLiveData<Integer> h() {
        if (!PatchProxy.isSupport(new Object[0], this, f7883a, false, 538, new Class[0], MutableLiveData.class)) {
            return this.f7884b.h();
        }
        return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f7883a, false, 538, new Class[0], MutableLiveData.class);
    }
}
