package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface StatusApi {
    @GET("/webcast/room/ping/anchor/")
    Observable<d<Void>> sendStatus(@Query(a = "room_id") long j, @Query(a = "status") int i, @Query(a = "stream_id") long j2, @Query(a = "reason_no") int i2);
}
