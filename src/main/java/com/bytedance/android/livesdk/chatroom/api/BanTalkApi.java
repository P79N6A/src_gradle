package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface BanTalkApi {
    @GET("/webcast/room/silence/")
    Observable<d<Object>> silence(@Query(a = "room_id") long j, @Query(a = "user_id") long j2);

    @GET("/webcast/room/unsilence/")
    Observable<d<Object>> unsilence(@Query(a = "room_id") long j, @Query(a = "user_id") long j2);
}
