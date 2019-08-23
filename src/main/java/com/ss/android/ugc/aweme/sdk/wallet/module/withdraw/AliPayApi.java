package com.ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AliPayApi {
    @FormUrlEncoded
    @POST(a = "wallet/alipay/bind/")
    q<BaseResponse> checkBindResult(@Field(a = "live_id") int i, @Field(a = "bind_type") int i2, @Field(a = "auth_result") String str);
}
