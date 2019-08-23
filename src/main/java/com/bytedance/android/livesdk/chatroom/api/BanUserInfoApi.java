package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;

public interface BanUserInfoApi {
    @GET("/webcast/user/ban_detail/")
    Observable<d<com.bytedance.android.livesdk.chatroom.model.d>> getBanUserInfo();
}
