package com.ss.android.ugc.aweme.miniapp;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface IAppbrandNetworkApi {
    @POST
    Call<String> postBody(@MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @Body TypedOutput typedOutput, @HeaderList List<Header> list, @ExtraInfo Object obj);
}
