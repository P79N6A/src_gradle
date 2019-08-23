package com.ss.android.account.token;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;

public interface IGetTokenApi {
    @GET("/passport/user/logout/")
    Call<String> logout(@Query(a = "logout_from") String str);

    @POST("/passport/token/change/")
    Call<String> requestChangeToken(@Body String str);

    @POST("/passport/token/beat/")
    Call<String> requestToken(@Body String str);
}
