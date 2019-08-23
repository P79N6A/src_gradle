package com.ss.android.ugc.aweme.challenge.recommend;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.recommend.a.b;
import java.util.Collections;
import java.util.List;

public final /* synthetic */ class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35405a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableLiveData f35406b;

    public a(MutableLiveData mutableLiveData) {
        this.f35406b = mutableLiveData;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35405a, false, 25888, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35405a, false, 25888, new Class[]{i.class}, Object.class);
        }
        MutableLiveData mutableLiveData = this.f35406b;
        if (iVar.b()) {
            List<com.ss.android.ugc.aweme.challenge.recommend.a.a> list = ((b) iVar.e()).f35414a;
            Collections.sort(list, b.f35416b);
            mutableLiveData.setValue(list);
        }
        return null;
    }
}
