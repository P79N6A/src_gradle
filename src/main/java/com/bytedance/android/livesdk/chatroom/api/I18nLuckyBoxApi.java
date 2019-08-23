package com.bytedance.android.livesdk.chatroom.api;

import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.message.model.av;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import io.reactivex.Observable;

public interface I18nLuckyBoxApi {
    @GET("/hotsoon/luckymoney/{room_id}/_list/")
    Observable<c<av>> fetchRedEnvelopeList(@Path(a = "room_id") long j);

    @GET("/hotsoon/luckymoney/{red_packet_id}/_rushed_list/")
    Observable<d<Object>> fetchRedEnvelopeRushedList(@Path(a = "red_packet_id") long j);

    @FormUrlEncoded
    @POST("/hotsoon/luckymoney/{red_packet_id}/_rush/")
    Observable<d<Object>> rush(@Path(a = "red_packet_id") long j, @Field(a = "room_id") long j2, @Field(a = "send_time") int i, @Field(a = "delay_time") int i2, @Nullable @Field(a = "common_label_list") String str);

    @FormUrlEncoded
    @POST("/hotsoon/luckymoney/{red_packet_id}/_send/")
    Observable<d<Object>> send(@Path(a = "red_packet_id") long j, @Field(a = "request_id") String str, @Field(a = "enter_source") String str2, @Field(a = "room_id") long j2, @Field(a = "delay_time") int i, @Nullable @Field(a = "common_label_list") String str3);
}
