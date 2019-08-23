package com.ss.android.ugc.aweme.profile.api;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ap.a;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61328a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableLiveData f61329b;

    b(MutableLiveData mutableLiveData) {
        this.f61329b = mutableLiveData;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f61328a, false, 67430, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f61328a, false, 67430, new Class[]{i.class}, Object.class);
        }
        MutableLiveData mutableLiveData = this.f61329b;
        if (iVar.d()) {
            mutableLiveData.setValue(a.a(iVar.f()));
        } else {
            mutableLiveData.setValue(a.a(iVar.e()));
        }
        return null;
    }
}
