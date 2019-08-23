package com.bytedance.android.livesdk.livecommerce.base;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ECBaseViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15977a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15978b;

    /* renamed from: c  reason: collision with root package name */
    MutableLiveData<String> f15979c;

    /* renamed from: d  reason: collision with root package name */
    MutableLiveData<String> f15980d;

    /* renamed from: e  reason: collision with root package name */
    MutableLiveData<Void> f15981e;

    /* renamed from: f  reason: collision with root package name */
    private MutableLiveData<String> f15982f;
    private MutableLiveData<Integer> g;
    private MutableLiveData<Void> h;
    private MutableLiveData<Void> i;
    private MutableLiveData<Void> j;

    public final MutableLiveData<Integer> b() {
        if (PatchProxy.isSupport(new Object[0], this, f15977a, false, 10461, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f15977a, false, 10461, new Class[0], MutableLiveData.class);
        }
        if (this.g == null) {
            this.g = new MutableLiveData<>();
        }
        return this.g;
    }

    public final MutableLiveData<Void> c() {
        if (PatchProxy.isSupport(new Object[0], this, f15977a, false, 10464, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f15977a, false, 10464, new Class[0], MutableLiveData.class);
        }
        if (this.h == null) {
            this.h = new MutableLiveData<>();
        }
        return this.h;
    }

    public final MutableLiveData<Void> d() {
        if (PatchProxy.isSupport(new Object[0], this, f15977a, false, 10465, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f15977a, false, 10465, new Class[0], MutableLiveData.class);
        }
        if (this.i == null) {
            this.i = new MutableLiveData<>();
        }
        return this.i;
    }

    public final MutableLiveData<Void> e() {
        if (PatchProxy.isSupport(new Object[0], this, f15977a, false, 10466, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f15977a, false, 10466, new Class[0], MutableLiveData.class);
        }
        if (this.j == null) {
            this.j = new MutableLiveData<>();
        }
        return this.j;
    }

    public final MutableLiveData<String> k_() {
        if (PatchProxy.isSupport(new Object[0], this, f15977a, false, 10460, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f15977a, false, 10460, new Class[0], MutableLiveData.class);
        }
        if (this.f15982f == null) {
            this.f15982f = new MutableLiveData<>();
        }
        return this.f15982f;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f15977a, false, 10471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15977a, false, 10471, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f15978b = true;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f15977a, false, 10468, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f15977a, false, 10468, new Class[]{String.class}, Void.TYPE);
            return;
        }
        k_().postValue(str2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.a9u)}, this, f15977a, false, 10469, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.a9u)}, this, f15977a, false, 10469, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b().postValue(Integer.valueOf(C0906R.string.a9u));
    }
}
