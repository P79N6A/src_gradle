package com.ss.android.ugc.aweme.commercialize.splash;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;

public interface SplashAdApi {
    @GET
    Call<String> executeGet(@MaxLength int i, @Url String str);

    @FormUrlEncoded
    @POST
    Call<String> executePost(@MaxLength int i, @Url String str, @Body TypedOutput typedOutput);

    @FormUrlEncoded
    @POST
    Call<String> executePost(@MaxLength int i, @Url String str, @FieldMap Map<String, String> map);
}
