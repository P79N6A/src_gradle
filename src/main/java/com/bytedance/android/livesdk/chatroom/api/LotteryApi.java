package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface LotteryApi {
    @GET("/webcast/lottery/melon/check_user_right/")
    Observable<d<Object>> checkoutUserRightWithLotteryId(@Query(a = "lottery_id") long j);

    @GET("/webcast/lottery/melon/check_user_right/")
    Observable<d<Object>> checkoutUserRightWithRoomId(@Query(a = "room_id") long j);

    @FormUrlEncoded
    @POST("/webcast/lottery/melon/create_lottery/")
    Observable<d<Object>> createLottery(@Field(a = "owner_type") int i, @Field(a = "room_id") long j, @Field(a = "anchor_id") long j2, @Field(a = "prize_type") int i2, @Field(a = "prize_count") int i3, @Field(a = "lucky_count") int i4, @Field(a = "count_down") int i5, @Field(a = "command") String str);

    @GET("/webcast/lottery/melon/lottery_config/")
    Observable<d<Object>> getLotteryConfig();

    @GET("/webcast/lottery/melon/lottery_info/")
    Observable<d<Object>> getLotteryInfoResult(@Query(a = "lottery_id") long j);
}
