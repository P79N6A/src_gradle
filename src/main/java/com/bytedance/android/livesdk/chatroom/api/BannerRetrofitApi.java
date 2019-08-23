package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface BannerRetrofitApi {
    @GET("/webcast/room/in_room_banner/")
    Observable<d<f>> queryLiveRoomBanner(@Query(a = "room_id") long j, @Query(a = "user_type") int i);

    @GET("/webcast/room/live_page_banner/")
    Observable<d<f.a>> queryStartLiveBanner(@Query(a = "live_page_type") String str, @Query(a = "user_type") int i);
}
