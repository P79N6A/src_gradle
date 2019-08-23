package com.ss.sys.ces.b;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;

public interface c {
    @GET
    Call<TypedInput> a(@Url String str, @HeaderList List<Header> list);

    @POST
    Call<TypedInput> a(@Url String str, @HeaderList List<Header> list, @Body TypedByteArray typedByteArray);
}
