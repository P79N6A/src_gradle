package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.ab;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;

public interface PackagePurchaseApi {
    @GET("/hotsoon/props/bundles/mine/")
    Observable<d<ab>> getPackagePurchaseInfo();
}
