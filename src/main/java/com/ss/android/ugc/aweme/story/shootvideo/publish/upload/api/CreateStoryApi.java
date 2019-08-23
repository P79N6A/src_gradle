package com.ss.android.ugc.aweme.story.shootvideo.publish.upload.api;

import android.support.annotation.NonNull;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;
import java.util.LinkedHashMap;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class CreateStoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f73726a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @FormUrlEncoded
        @POST(a = "/aweme/v1/life/create/story/")
        q<CreateStoryResponse> createStory(@Field(a = "media_id") @NonNull String str, @FieldMap LinkedHashMap<String, String> linkedHashMap);
    }
}
