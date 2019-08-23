package com.ss.android.ugc.aweme.challenge.recommend;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.challenge.recommend.a.b;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;

public final class RecommendHashTagApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35401a;

    /* renamed from: b  reason: collision with root package name */
    public static API f35402b = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @GET(a = "/aweme/v1/challenge/history/intervene/")
        i<b> fetchRecommendHashTags();
    }
}
