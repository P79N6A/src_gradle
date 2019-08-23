package com.bytedance.android.live.core.paging.a;

import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.PagedList;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b<V> extends PagedList.BoundaryCallback<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7880a;

    /* renamed from: b  reason: collision with root package name */
    private MutableLiveData<Boolean> f7881b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    private MutableLiveData<Boolean> f7882c = new MutableLiveData<>();

    public final void onZeroItemsLoaded() {
        if (PatchProxy.isSupport(new Object[0], this, f7880a, false, 515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f7880a, false, 515, new Class[0], Void.TYPE);
            return;
        }
        super.onZeroItemsLoaded();
        this.f7882c.postValue(Boolean.TRUE);
    }

    public final void onItemAtEndLoaded(@NonNull V v) {
        if (PatchProxy.isSupport(new Object[]{v}, this, f7880a, false, 516, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{v}, this, f7880a, false, 516, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        super.onItemAtEndLoaded(v);
        this.f7881b.postValue(Boolean.FALSE);
    }

    public b(MutableLiveData<Boolean> mutableLiveData, MutableLiveData<Boolean> mutableLiveData2) {
        this.f7881b = mutableLiveData;
        this.f7882c = mutableLiveData2;
    }
}
