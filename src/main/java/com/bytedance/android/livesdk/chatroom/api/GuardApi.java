package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.p;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface GuardApi {
    @GET("/hotsoon/ward/")
    Observable<d<p>> getGuardInfo(@Query(a = "room_id") long j);
}
