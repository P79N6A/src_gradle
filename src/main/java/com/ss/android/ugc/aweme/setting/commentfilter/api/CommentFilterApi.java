package com.ss.android.ugc.aweme.setting.commentfilter.api;

import a.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class CommentFilterApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f63897a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @GET(a = "/aweme/v2/comment/filter/get_words/")
        i<a> getCommentFilterKeywords();

        @POST(a = "/aweme/v2/comment/filter/update_words/")
        i<BaseResponse> setCommentFilterKeywords(@Query(a = "words") String str);
    }
}
