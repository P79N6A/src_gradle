package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.c;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface AssetAuthorizeApi {
    @POST("/hotsoon/misc/authorize_assets")
    Observable<d<Object>> agreeAuthorize(@Query(a = "authorize") int i);

    @GET("/hotsoon/misc/assets_authorize_tips")
    Observable<d<c.a>> isShowAuthorizeTips();
}
