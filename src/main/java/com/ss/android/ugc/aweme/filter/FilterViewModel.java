package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public class FilterViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47453a;

    /* renamed from: b  reason: collision with root package name */
    private MutableLiveData<h> f47454b;

    /* renamed from: c  reason: collision with root package name */
    private MutableLiveData<h> f47455c;

    /* renamed from: d  reason: collision with root package name */
    private MutableLiveData<Boolean> f47456d;

    public final MutableLiveData<h> a() {
        if (PatchProxy.isSupport(new Object[0], this, f47453a, false, 44411, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f47453a, false, 44411, new Class[0], MutableLiveData.class);
        }
        if (this.f47454b == null) {
            this.f47454b = new MutableLiveData<>();
        }
        return this.f47454b;
    }

    public final MutableLiveData<h> b() {
        if (PatchProxy.isSupport(new Object[0], this, f47453a, false, 44412, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f47453a, false, 44412, new Class[0], MutableLiveData.class);
        }
        if (this.f47455c == null) {
            this.f47455c = new MutableLiveData<>();
        }
        return this.f47455c;
    }

    public final MutableLiveData<Boolean> c() {
        if (PatchProxy.isSupport(new Object[0], this, f47453a, false, 44415, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f47453a, false, 44415, new Class[0], MutableLiveData.class);
        }
        if (this.f47456d == null) {
            this.f47456d = new MutableLiveData<>();
            this.f47456d.setValue(Boolean.valueOf(a.L.a(e.a.DisableFilter)));
        }
        return this.f47456d;
    }

    public static void a(@NonNull AppCompatActivity appCompatActivity, @NonNull h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, hVar2}, null, f47453a, true, 44409, new Class[]{AppCompatActivity.class, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity, hVar2}, null, f47453a, true, 44409, new Class[]{AppCompatActivity.class, h.class}, Void.TYPE);
            return;
        }
        ((FilterViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity).get(FilterViewModel.class)).a().postValue(hVar2);
    }

    public static void a(@NonNull AppCompatActivity appCompatActivity, @NonNull Boolean bool) {
        Boolean bool2 = bool;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, bool2}, null, f47453a, true, 44414, new Class[]{AppCompatActivity.class, Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity, bool2}, null, f47453a, true, 44414, new Class[]{AppCompatActivity.class, Boolean.class}, Void.TYPE);
            return;
        }
        ((FilterViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity).get(FilterViewModel.class)).c().setValue(bool2);
    }
}
