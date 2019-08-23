package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.e;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.model.l;
import com.bytedance.android.livesdk.gift.relay.a.b;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface GiftRetrofitApi {
    @GET("/webcast/gift/free_cell_stats/")
    Observable<d<b>> checkFreeCellStatus(@Query(a = "room_id") long j, @Query(a = "anchor_id") long j2, @Query(a = "gift_id") long j3);

    @FormUrlEncoded
    @POST("/webcast/gift/live_gift_guidance/")
    Observable<d<Object>> getGiftGuidance(@Field(a = "room_id") String str);

    @FormUrlEncoded
    @POST("/webcast/gift/send/")
    Observable<d<i>> send(@Field(a = "gift_id") long j, @Query(a = "room_id") long j2, @Field(a = "to_user_id") long j3, @Field(a = "count") int i);

    @FormUrlEncoded
    @POST("/webcast/gift/send/")
    Observable<d<i>> send(@Field(a = "gift_id") long j, @Query(a = "room_id") long j2, @Field(a = "to_user_id") long j3, @Field(a = "count") int i, @Field(a = "gift_source") int i2);

    @FormUrlEncoded
    @POST("/webcast/gift/golden_beans_send/")
    Observable<d<i>> sendGoldenGift(@Field(a = "gift_id") long j, @Query(a = "room_id") long j2, @Field(a = "to_user_id") long j3, @Field(a = "count") int i);

    @GET("/webcast/gift/list/")
    Observable<d<e>> syncGiftList(@Query(a = "room_id") String str);

    @GET("/webcast/freegift/get_watermelon_seeds/")
    Observable<d<l>> syncXgCoin();
}
