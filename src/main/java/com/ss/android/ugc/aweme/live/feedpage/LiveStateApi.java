package com.ss.android.ugc.aweme.live.feedpage;

import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

public interface LiveStateApi {
    @FormUrlEncoded
    @POST("/webcast/room/live_room_id/")
    Observable<f> liveStates(@Field(a = "user_id") String str);
}
