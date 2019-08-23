package com.ss.android.ugc.aweme.update.api;

import com.bytedance.retrofit2.Call;
import com.google.gson.JsonObject;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;

public interface InHouseCheckUpdateApi {

    /* renamed from: a  reason: collision with root package name */
    public static final InHouseCheckUpdateApi f75204a = ((InHouseCheckUpdateApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme-beta.bytedance.net").create(InHouseCheckUpdateApi.class));

    @GET(a = "/beta_check/v1")
    Call<JsonObject> getInHouseVersionUpdateInfo();
}
