package com.ss.android.ugc.aweme.base.livedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SlideData extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34754a;

    /* renamed from: b  reason: collision with root package name */
    private MutableLiveData<Float> f34755b;

    /* renamed from: c  reason: collision with root package name */
    private MutableLiveData<Boolean> f34756c;

    public final MutableLiveData<Float> a() {
        if (PatchProxy.isSupport(new Object[0], this, f34754a, false, 24657, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f34754a, false, 24657, new Class[0], MutableLiveData.class);
        }
        if (this.f34755b == null) {
            this.f34755b = new MutableLiveData<>();
        }
        return this.f34755b;
    }

    public final MutableLiveData<Boolean> b() {
        if (PatchProxy.isSupport(new Object[0], this, f34754a, false, 24658, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f34754a, false, 24658, new Class[0], MutableLiveData.class);
        }
        if (this.f34756c == null) {
            this.f34756c = new MutableLiveData<>();
        }
        return this.f34756c;
    }
}
