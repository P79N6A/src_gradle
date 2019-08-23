package com.ss.android.ugc.aweme.profile.api;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.NewUserCount;
import retrofit2.http.GET;

public final class NewUserApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61319a;

    /* renamed from: b  reason: collision with root package name */
    private static NewUserApi f61320b = ((NewUserApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(NewUserApi.class));

    interface NewUserApi {
        @GET(a = "/aweme/v2/new/recommend/user/count/")
        i<NewUserCount> getNewUserCount();
    }

    public static void a(MutableLiveData<a<NewUserCount>> mutableLiveData) {
        MutableLiveData<a<NewUserCount>> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{mutableLiveData2}, null, f61319a, true, 67448, new Class[]{MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mutableLiveData2}, null, f61319a, true, 67448, new Class[]{MutableLiveData.class}, Void.TYPE);
            return;
        }
        f61320b.getNewUserCount().a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(mutableLiveData2), i.f1052b);
    }
}
