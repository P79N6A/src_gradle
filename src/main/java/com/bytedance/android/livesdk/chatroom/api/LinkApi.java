package com.bytedance.android.livesdk.chatroom.api;

import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.a.f;
import com.bytedance.android.livesdk.chatroom.model.a.g;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdk.chatroom.model.a.l;
import com.bytedance.android.livesdk.chatroom.model.a.m;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface LinkApi {
    @GET("/webcast/linkmic/cancel/")
    Observable<d<Void>> cancel(@Query(a = "channel_id") long j, @Query(a = "room_id") long j2, @Query(a = "to_room_id") long j3, @Query(a = "to_user_id") long j4);

    @GET("/hotsoon/linkmic/{room_id}/check_permission/")
    Observable<b<Void, f>> checkPermissionV1(@Path(a = "room_id") long j, @Query(a = "linkmic_layout") int i);

    @GET("/webcast/linkmic/check_permission/")
    Observable<d<Void>> checkPermissionV3(@Query(a = "room_id") long j);

    @GET("/hotsoon/linkmic/{room_id}/contributors/")
    Observable<c<k>> contributorRank(@Path(a = "room_id") long j, @Query(a = "user_id") long j2, @Query(a = "offset") int i);

    @GET("/hotsoon/linkmic/{room_id}/finish/")
    Observable<d<Void>> finishV1(@Path(a = "room_id") long j);

    @GET("/webcast/linkmic/finish/")
    Observable<d<Void>> finishV3(@Query(a = "channel_id") long j);

    @GET("/hotsoon/linkmic/{room_id}/list/")
    Observable<c<j>> getList(@Path(a = "room_id") long j, @Query(a = "link_status") int i);

    @GET("/hotsoon/linkmic/{room_id}/init/")
    Observable<d<g>> init(@Path(a = "room_id") long j, @Query(a = "linkmic_vendor") int i, @Query(a = "linkmic_layout") int i2);

    @GET("/webcast/linkmic/invite/")
    Observable<d<com.bytedance.android.livesdk.chatroom.interact.model.b>> invite(@Query(a = "vendor") int i, @Query(a = "to_room_id") long j, @Query(a = "to_user_id") long j2, @Query(a = "room_id") long j3, @Query(a = "match_type") int i2);

    @GET("/webcast/linkmic/invite/")
    Observable<d<com.bytedance.android.livesdk.chatroom.interact.model.b>> inviteWithBattleOn(@Query(a = "layout") int i, @Query(a = "vendor") int i2, @Query(a = "to_room_id") long j, @Query(a = "to_user_id") long j2, @Query(a = "room_id") long j3, @Query(a = "theme") String str, @Query(a = "duration") int i3, @Query(a = "match_type") int i4);

    @GET("/hotsoon/linkmic/{room_id}/join_channel/")
    Observable<d<Void>> joinChannelV1(@Path(a = "room_id") long j);

    @GET("/webcast/linkmic/join_channel/")
    Observable<d<Void>> joinChannelV3(@Query(a = "channel_id") long j);

    @GET("/hotsoon/linkmic/{room_id}/kick_out/")
    Observable<d<Void>> kickOut(@Path(a = "room_id") long j, @Query(a = "to_user_id") long j2);

    @GET("/hotsoon/linkmic/{room_id}/leave/")
    Observable<d<Void>> leave(@Path(a = "room_id") long j);

    @GET("/webcast/linkmic/notify_join/")
    Observable<d<Void>> notifyJoin(@Query(a = "channel_id") long j, @Query(a = "to_user_id") long j2);

    @GET("/hotsoon/linkmic/{room_id}/permit/")
    Observable<d<Void>> permit(@Path(a = "room_id") long j, @Query(a = "to_user_id") long j2, @Query(a = "linkmic_vendor") int i, @Query(a = "linkmic_layout") int i2);

    @GET("/webcast/linkmic/reply/")
    Observable<d<l>> reply(@Query(a = "channel_id") long j, @Query(a = "room_id") long j2, @Query(a = "reply_status") int i, @Query(a = "invite_user_id") long j3);

    @FormUrlEncoded
    @POST("/webcast/linkmic/monitor/vendor/")
    Observable<d<Void>> reportStartLinkStatus(@Field(a = "vendor") String str, @Field(a = "status") int i, @Field(a = "err_code") int i2);

    @GET("/webcast/linkmic/rivals/")
    Observable<d<com.bytedance.android.livesdk.chatroom.interact.model.d>> rivalsList();

    @FormUrlEncoded
    @POST("/hotsoon/linkmic/{channel_id}/send_signaling/")
    Observable<d<Void>> sendSignalV1(@Path(a = "channel_id") long j, @Field(a = "content") String str, @Nullable @Field(a = "to_user_ids") long[] jArr);

    @GET("/webcast/linkmic/send_signal/")
    Observable<d<Void>> sendSignalV3(@Query(a = "channel_id") long j, @Query(a = "content") String str, @Nullable @Query(a = "to_user_ids") long[] jArr);

    @GET("/webcast/linkmic/settings/")
    Observable<d<Void>> settings(@Query(a = "link_mic_stats") int i);

    @GET("/hotsoon/linkmic/{room_id}/silence/")
    Observable<d<Void>> silence(@Path(a = "room_id") long j, @Query(a = "to_user_id") long j2);

    @GET("/hotsoon/linkmic/{room_id}/turn_on/")
    Observable<d<Void>> turnOnV1(@Path(a = "room_id") long j, @Query(a = "linkmic_share_percent") int i, @Query(a = "linkmic_layout") int i2);

    @GET("/webcast/linkmic/turn_on/")
    Observable<d<m>> turnOnV3(@Query(a = "channel_id") long j);

    @GET("/hotsoon/linkmic/{room_id}/unsilence/")
    Observable<d<Void>> unSilence(@Path(a = "room_id") long j, @Query(a = "to_user_id") long j2);
}
