package com.bytedance.android.livesdk.feed.roomdetector;

import android.annotation.SuppressLint;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

@SuppressLint({"RetrofitImportPackage"})
public interface RoomRetrofitApi {
    @GET("/webcast/room/ping/audience/")
    Observable<d<PingResult>> sendPlayingPing(@Query(a = "room_id") long j, @Query(a = "only_status") int i);
}
