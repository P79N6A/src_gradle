package com.bytedance.android.livesdk.chatroom.api;

import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.t;
import com.bytedance.android.livesdk.chatroom.model.u;
import com.bytedance.android.livesdk.chatroom.model.v;
import com.bytedance.android.livesdk.chatroom.model.w;
import com.bytedance.android.livesdk.message.model.aq;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface LuckyBoxApi {
    @GET("/webcast/luckybox/box/list/")
    Observable<c<aq>> fetchCurrentList(@Query(a = "room_id") long j);

    @GET("/webcast/luckybox/rushed/list/")
    Observable<d<t>> fetchRushedList(@Query(a = "box_id") long j, @Query(a = "room_id") long j2, @Query(a = "box_type") int i);

    @GET("/webcast/luckybox/box/meta/")
    Observable<c<w>> fetchTypeList(@Query(a = "room_id") long j);

    @FormUrlEncoded
    @POST("/webcast/luckybox/rush/")
    Observable<d<u>> rush(@Field(a = "box_id") long j, @Field(a = "room_id") long j2, @Field(a = "box_type") int i, @Field(a = "send_time") long j3, @Field(a = "delay_time") int i2, @Nullable @Field(a = "common_label_list") String str);

    @FormUrlEncoded
    @POST("/webcast/luckybox/send/")
    Observable<d<v>> send(@Field(a = "box_meta_id") long j, @Field(a = "room_id") long j2, @Field(a = "box_type") int i, @Field(a = "delay_time") int i2, @Field(a = "enter_source") String str, @Field(a = "request_id") String str2, @Nullable @Field(a = "common_label_list") String str3);
}
