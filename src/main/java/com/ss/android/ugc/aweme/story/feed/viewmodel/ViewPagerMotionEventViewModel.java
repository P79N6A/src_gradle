package com.ss.android.ugc.aweme.story.feed.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.a.c;

public class ViewPagerMotionEventViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72998a;

    /* renamed from: b  reason: collision with root package name */
    private MutableLiveData<c> f72999b;

    public final MutableLiveData<c> a() {
        if (PatchProxy.isSupport(new Object[0], this, f72998a, false, 84403, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f72998a, false, 84403, new Class[0], MutableLiveData.class);
        }
        if (this.f72999b == null) {
            this.f72999b = new MutableLiveData<>();
        }
        return this.f72999b;
    }
}
