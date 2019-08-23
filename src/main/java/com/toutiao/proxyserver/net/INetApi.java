package com.toutiao.proxyserver.net;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HEAD;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Map;

public interface INetApi {
    @Streaming
    @GET
    Call<TypedInput> get(@Url String str, @QueryMap Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @HEAD
    Call<Void> head(@Url String str, @QueryMap Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);
}
