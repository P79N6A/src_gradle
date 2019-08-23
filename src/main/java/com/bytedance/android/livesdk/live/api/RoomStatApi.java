package com.bytedance.android.livesdk.live.api;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.live.model.a;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

public interface RoomStatApi {
    @FormUrlEncoded
    @POST("/webcast/room/check_alive/")
    Observable<c<a>> checkRoom(@Field(a = "room_ids") String str);
}
