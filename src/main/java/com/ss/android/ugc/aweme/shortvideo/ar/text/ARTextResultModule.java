package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ARTextResultModule extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65673a;

    /* renamed from: b  reason: collision with root package name */
    private MutableLiveData<q> f65674b;

    public final MutableLiveData<q> a() {
        if (PatchProxy.isSupport(new Object[0], this, f65673a, false, 75134, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f65673a, false, 75134, new Class[0], MutableLiveData.class);
        }
        if (this.f65674b == null) {
            this.f65674b = new MutableLiveData<>();
        }
        return this.f65674b;
    }
}
