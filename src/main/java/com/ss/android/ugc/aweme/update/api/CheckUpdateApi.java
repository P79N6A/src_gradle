package com.ss.android.ugc.aweme.update.api;

import com.bytedance.retrofit2.Call;
import com.google.gson.JsonObject;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;

public interface CheckUpdateApi {

    /* renamed from: a  reason: collision with root package name */
    public static final CheckUpdateApi f75203a = ((CheckUpdateApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CheckUpdateApi.class));

    @GET(a = "/appbeta/check_version/check_beta/")
    Call<JsonObject> getI18nVersionUpdateInfo();

    @GET(a = "/check_version/v6/")
    Call<JsonObject> getVersionUpdateInfo();
}
