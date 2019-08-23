package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MainAnimViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54174a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Boolean> f54175b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<Boolean> f54176c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Boolean> f54177d = new MutableLiveData<>();

    /* renamed from: e  reason: collision with root package name */
    public MutableLiveData<String> f54178e = new MutableLiveData<>();

    /* renamed from: f  reason: collision with root package name */
    public MutableLiveData<Boolean> f54179f = new MutableLiveData<>();
    private MutableLiveData<Boolean> g = new MutableLiveData<>();

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f54174a, false, 57230, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54174a, false, 57230, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f54179f.getValue() == null) {
            return true;
        } else {
            return ((Boolean) this.f54179f.getValue()).booleanValue();
        }
    }
}
