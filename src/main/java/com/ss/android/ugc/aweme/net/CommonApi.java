package com.ss.android.ugc.aweme.net;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.DELETE;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
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

public interface CommonApi {
    @DELETE
    Call<String> doDelete(@Url String str);

    @DELETE
    Call<String> doDelete(@Url String str, @MaxLength int i, @HeaderList List<Header> list);

    @DELETE
    Call<String> doDelete(@Url String str, @HeaderList List<Header> list);

    @DELETE
    Call<String> doDelete(@Url String str, @QueryMap Map<String, String> map);

    @GET
    Call<String> doGet(@Url String str);

    @GET
    Call<String> doGet(@Url String str, @MaxLength int i);

    @GET
    Call<String> doGet(@Url String str, @MaxLength int i, @QueryMap Map<String, String> map);

    @GET
    Call<String> doGet(@Url String str, @QueryMap Map<String, String> map);

    @GET
    Call<String> doGet(@Url String str, @QueryMap Map<String, String> map, @HeaderList List<Header> list);

    @FormUrlEncoded
    @POST
    Call<String> doPost(@Url String str, @MaxLength int i, @FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST
    Call<String> doPost(@Url String str, @MaxLength int i, @FieldMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @FormUrlEncoded
    @POST
    Call<String> doPost(@Url String str, @FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST
    Call<String> doPost(@Url String str, @FieldMap Map<String, String> map, @HeaderList List<Header> list);

    @POST
    Call<String> postBody(@Url String str, @Body TypedOutput typedOutput, @HeaderList List<Header> list);

    @PUT
    Call<String> putBody(@Url String str, @Body TypedOutput typedOutput, @HeaderList List<Header> list);
}
