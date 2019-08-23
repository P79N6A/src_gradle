package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Path;
import io.reactivex.Observable;

public interface RechargeGuideApi {
    @GET("/live/room/{room_id}/notify_first_charge/")
    Observable<d<Object>> notifyAnchor(@Path(a = "room_id") long j);
}
