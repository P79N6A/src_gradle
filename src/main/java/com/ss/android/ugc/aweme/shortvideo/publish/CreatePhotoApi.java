package com.ss.android.ugc.aweme.shortvideo.publish;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import java.util.LinkedHashMap;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class CreatePhotoApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f68862a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @FormUrlEncoded
        @SuppressLint({"TooManyMethodParam"})
        @POST(a = "/aweme/v1/create/image/aweme/")
        q<CreateAwemeResponse> createAweme(@Field(a = "image_ids") @NonNull String str, @FieldMap LinkedHashMap<String, String> linkedHashMap);
    }
}
