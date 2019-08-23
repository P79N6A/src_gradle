package com.ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.ss.android.ugc.aweme.profile.api.NewUserApiManager;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.ss.android.ugc.aweme.profile.model.NewUserCount;

public class MyProfileViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63179a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<a<NewUserCount>> f63180b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<a<ActivityLinkResponse>> f63181c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Boolean> f63182d = new MutableLiveData<>();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63179a, false, 70087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63179a, false, 70087, new Class[0], Void.TYPE);
            return;
        }
        NewUserApiManager.a(this.f63180b);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63179a, false, 70088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63179a, false, 70088, new Class[0], Void.TYPE);
            return;
        }
        ActivityLinkManager.a(this.f63181c);
    }
}
