package com.ss.android.ugc.aweme.live.api;

import a.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.AVApi;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class LiveCoverApi {

    /* renamed from: a  reason: collision with root package name */
    public static final LiveCoverRetrofit f53290a = ((LiveCoverRetrofit) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(LiveCoverRetrofit.class));

    public interface LiveCoverRetrofit {
        @GET(a = "/aweme/v1/room/cover/create/")
        i<BaseResponse> createLiveCover(@Query(a = "cover_uri") String str);

        @GET(a = "/aweme/v1/live/podcast/convention/")
        i<Object> fetchConvention();

        @GET(a = "/aweme/v1/room/cover/")
        i<Object> fetchLiveCover();
    }
}
