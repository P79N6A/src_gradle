package com.bytedance.android.livesdk.verify;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

public interface HotsoonVerifyApi {
    @FormUrlEncoded
    @POST("https://hotsoon.snssdk.com/hotsoon/user/realname_reset/")
    Observable<d<Void>> unbindOldWithdrawAccount(@Field(a = "set_uniq_realname") String str);
}
