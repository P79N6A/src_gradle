package com.ss.android.ugc.aweme.shortvideo;

import a.i;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;
import retrofit2.http.GET;

public final class LiveSettingApi {

    /* renamed from: a  reason: collision with root package name */
    static API f65350a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(API.class));

    public interface API {
        @GET(a = "/aweme/v1/live/podcast/")
        i<a> getLivePodCast();
    }

    public class a extends BaseResponse {
        @SerializedName("can_be_live_podcast")

        /* renamed from: a  reason: collision with root package name */
        public boolean f65351a;
    }
}
