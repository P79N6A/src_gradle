package com.bytedance.ies.net.cronet;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.DELETE;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Multipart;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.PUT;
import com.bytedance.retrofit2.http.PartMap;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.List;
import java.util.Map;

public interface IIESNetworkApi {
    @DELETE
    Call<String> doDetete(@MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @GET
    Call<String> doGet(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @FormUrlEncoded
    @POST
    Call<String> doPost(@MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @FieldMap(a = true) Map<String, String> map2, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @FormUrlEncoded
    @PUT
    Call<String> doPut(@MaxLength int i, @Url String str, @QueryMap Map<String, String> map, @FieldMap(a = true) Map<String, String> map2, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @Streaming
    @GET
    Call<TypedInput> downloadFile(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map);

    @Streaming
    @GET
    Call<TypedInput> downloadFile(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list);

    @Streaming
    @GET
    Call<TypedInput> downloadFile(@AddCommonParam boolean z, @MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @POST
    Call<String> postBody(@MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @Body TypedOutput typedOutput, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @Multipart
    @POST
    Call<String> postMultiPart(@MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @PartMap Map<String, TypedOutput> map2, @HeaderList List<Header> list, @ExtraInfo Object obj);

    @PUT
    Call<String> putBody(@MaxLength int i, @Url String str, @QueryMap(encode = true) Map<String, String> map, @Body TypedOutput typedOutput, @HeaderList List<Header> list, @ExtraInfo Object obj);
}
