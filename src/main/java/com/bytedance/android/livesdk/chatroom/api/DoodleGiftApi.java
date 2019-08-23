package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface DoodleGiftApi {
    @FormUrlEncoded
    @POST("/webcast/gift/send/")
    Observable<d<i>> sendDoodleGift(@Field(a = "gift_id") long j, @Query(a = "room_id") long j2, @Field(a = "compose") String str, @Field(a = "to_user_id") long j3);
}
