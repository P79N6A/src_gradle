package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.media.d;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface EndPageRecommendRetrofitApi {
    @GET("/webcast/room/recommend_live/")
    Observable<c<Room>> getLive(@Query(a = "room_id") long j);

    @GET("/webcast/room/recommend_item/")
    Observable<c<d>> getVideos(@Query(a = "room_id") long j);
}
