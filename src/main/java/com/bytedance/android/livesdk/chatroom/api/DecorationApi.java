package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.ad;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;

public interface DecorationApi {
    @GET("/webcast/room/decoration/")
    Observable<d<ad>> getRoomDecorationList();
}
