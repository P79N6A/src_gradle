package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.j;
import com.bytedance.android.livesdk.gift.model.k;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Query;
import com.google.gson.JsonObject;
import io.reactivex.Observable;

public interface TaskGiftApi {
    @GET("/hotsoon/wallet/info/")
    Observable<d<k>> getHotsoonTaskGift();

    @GET("/hotsoon/taskgift/?type=7")
    Observable<JsonObject> getHotsoonTaskGiftEvent();

    @FormUrlEncoded
    @POST("/hotsoon/taskgift/{gift_id}/send/")
    Observable<d<j>> sendHotsoonTaskGift(@Path(a = "gift_id") long j, @Field(a = "count") long j2, @Query(a = "room_id") long j3);

    @FormUrlEncoded
    @POST("/webcast/gift/send_task_gift/")
    Observable<d<j>> sendTaskGift(@Field(a = "task_gift_id") long j, @Field(a = "count") long j2, @Query(a = "room_id") long j3);
}
