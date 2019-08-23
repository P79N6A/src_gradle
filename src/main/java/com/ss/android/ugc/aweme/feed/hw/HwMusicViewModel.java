package com.ss.android.ugc.aweme.feed.hw;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

public class HwMusicViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45539a;

    /* renamed from: b  reason: collision with root package name */
    private MutableLiveData<VideoItemParams> f45540b;

    /* renamed from: c  reason: collision with root package name */
    private MutableLiveData<a> f45541c;

    public final MutableLiveData<VideoItemParams> a() {
        if (PatchProxy.isSupport(new Object[0], this, f45539a, false, 41342, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f45539a, false, 41342, new Class[0], MutableLiveData.class);
        }
        if (this.f45540b == null) {
            this.f45540b = new MutableLiveData<>();
        }
        return this.f45540b;
    }

    public final MutableLiveData<a> b() {
        if (PatchProxy.isSupport(new Object[0], this, f45539a, false, 41343, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f45539a, false, 41343, new Class[0], MutableLiveData.class);
        }
        if (this.f45541c == null) {
            this.f45541c = new MutableLiveData<>();
        }
        return this.f45541c;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f45539a, false, 41344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45539a, false, 41344, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
    }
}
