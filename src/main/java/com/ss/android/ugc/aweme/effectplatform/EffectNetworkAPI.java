package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

public interface EffectNetworkAPI {
    @Streaming
    @GET
    Call<TypedInput> doGet(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map);

    @Streaming
    @POST
    Call<TypedInput> doPost(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @Body Map<String, Object> map);
}
