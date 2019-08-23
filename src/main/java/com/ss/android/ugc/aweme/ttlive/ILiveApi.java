package com.ss.android.ugc.aweme.ttlive;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.Map;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface ILiveApi {
    @Streaming
    @GET
    Call<TypedInput> downloadFile(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @ExtraInfo Object obj);

    @GET
    Call<TypedInput> get(@Url String str, @HeaderMap Map<String, String> map);

    @POST
    Call<TypedInput> post(@Url String str, @Body TypedByteArray typedByteArray, @HeaderMap Map<String, String> map);

    @POST
    Call<TypedInput> postMultiPart(@MaxLength int i, @Url String str, @HeaderMap Map<String, String> map, @Body TypedOutput typedOutput);
}
