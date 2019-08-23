package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;

public interface BroadcastConfigRetrofitApi {
    @GET("/webcast/room/live_scenario/")
    Observable<d<h>> getBroadcastConfig();
}
