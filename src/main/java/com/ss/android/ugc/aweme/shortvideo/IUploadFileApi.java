package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.PUT;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface IUploadFileApi {
    @GET
    Call<String> doGet(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @PUT
    Call<String> doPut(@MaxLength int i, @Body TypedOutput typedOutput, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @POST
    Call<String> postBody(@MaxLength int i, @Body TypedOutput typedOutput, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);
}
