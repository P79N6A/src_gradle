package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;

public final class AwemeStatsApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45048a;

    /* renamed from: b  reason: collision with root package name */
    public static final AwemeStatsService f45049b = ((AwemeStatsService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(AwemeStatsService.class));

    public interface AwemeStatsService {
        @FormUrlEncoded
        @POST("/aweme/v1/aweme/stats/")
        Call<BaseResponse> awemeStatsReport(@FieldMap Map<String, String> map);
    }
}
