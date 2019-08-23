package com.bytedance.android.livesdk.chatroom.api;

import android.annotation.SuppressLint;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.model.startlive.a;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatGuidanceResult;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.CheckAnchorMemorialResult;
import com.bytedance.android.livesdk.chatroom.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.chatroom.model.WaitingReviewInfo;
import com.bytedance.android.livesdk.chatroom.model.ae;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.model.PeriodRankExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.h;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.android.livesdkapi.depend.model.report.ReportReason;
import com.bytedance.android.livesdkapi.ping.PingResult;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"RetrofitImportPackage"})
public interface RoomRetrofitApi {
    @GET("/webcast/anchor/memorial/check_memorial/")
    Observable<d<CheckAnchorMemorialResult>> checkAnchorMemorial(@Query(a = "anchor_id") long j);

    @GET("/webcast/room/collect_unread/")
    Observable<d<Object>> collectUnreadRequest(@Query(a = "room_id") long j, @Query(a = "anchor_id") long j2, @Query(a = "unread_extra") String str, @Query(a = "room_ids") String str2);

    @FormUrlEncoded
    @POST("/webcast/room/create/")
    Observable<a<Room>> createRoom(@FieldMap HashMap<String, String> hashMap);

    @GET("/hotsoon/room/{roomId}/_deblock_mosaic/")
    Observable<d<Object>> deblockMosaic(@Path(a = "roomId") long j);

    @FormUrlEncoded
    @POST("/webcast/room/digg/")
    Observable<d<Object>> digg(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/webcast/room/enter/")
    Observable<b<Room, EnterRoomExtra>> enterRoom(@Field(a = "room_id") long j, @Field(a = "hold_living_room") long j2, @Field(a = "is_login") long j3, @FieldMap HashMap<String, String> hashMap);

    @GET("/webcast/room/info/")
    Observable<d<Room>> fetchRoom(@QueryMap HashMap<String, String> hashMap);

    @GET("/webcast/room/info_by_user/")
    Observable<d<Room>> fetchUserRoom(@Query(a = "user_id") long j, @Query(a = "sec_user_id") String str);

    @GET("/webcast/room/finish_abnormal/")
    Observable<d<Object>> finishRoomAbnormal();

    @GET("/webcast/ranklist/hour/")
    Observable<b<com.bytedance.android.livesdk.rank.model.a, Extra>> getDailyRankContent(@QueryMap HashMap<String, String> hashMap);

    @POST("/webcast/room/get_latest_room/")
    Observable<d<Room>> getLatestRoom();

    @GET("/webcast/room/game_list/")
    Observable<c<Game>> getLiveGameList(@Query(a = "game_icon") int i);

    @GET("/hotsoon/room/follow/ids/")
    Call<c<Long>> getLivingRoomIds();

    @FormUrlEncoded
    @POST("/webcast/room/mget_info/")
    Observable<d<Map<String, Room>>> getMultipleRoomInfo(@Field(a = "room_ids") String str);

    @GET("/webcast/ranklist/contributor/")
    Observable<b<CurrentRankListResponse, PeriodRankExtra>> getPeriodUserRank(@QueryMap HashMap<String, String> hashMap);

    @GET("/webcast/user/report/reason/")
    Observable<c<ReportReason>> getReportReasons();

    @GET("/webcast/room/auditing/info/")
    Observable<d<WaitingReviewInfo>> getReviewInfo(@Query(a = "room_id") long j);

    @GET("/webcast/room/chat/guidance/")
    Observable<d<ChatGuidanceResult>> getRoomChatGuidance(@QueryMap HashMap<String, String> hashMap);

    @GET("/webcast/room/info/")
    Call<d<Room>> getRoomStats(@Query(a = "is_anchor") boolean z, @Query(a = "room_id") long j, @Query(a = "pack_level") int i);

    @GET("/webcast/room/info/")
    Call<d<Room>> getRoomStats(@Query(a = "is_anchor") boolean z, @Query(a = "room_id") long j, @Query(a = "pack_level") int i, @Query(a = "need_health_score_info") boolean z2, @Query(a = "from_type") int i2);

    @GET("/webcast/room/tag_list/")
    Observable<c<ae>> getRoomTags();

    @GET("/webcast/anchor/health_score/total/")
    Observable<d<h>> getTotalHealthInfo();

    @GET("/webcast/ranklist/room/{room_id}/contributor/")
    Observable<b<CurrentRankListResponse, UserRankExtra>> getUserRankContent(@Path(a = "room_id") long j, @QueryMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/webcast/room/leave/")
    Observable<d<Object>> leaveRoom(@Field(a = "room_id") long j);

    @FormUrlEncoded
    @POST("/webcast/user/report/commit/")
    Observable<d<ReportCommitData>> postReportReasons(@Field(a = "target_room_id") long j, @Field(a = "target_anchor_id") long j2, @Field(a = "reason") long j3, @Field(a = "report_record_extra") String str);

    @GET("/webcast/room/background_img/delete/")
    Observable<d<Void>> removeRoomBackgroundImg(@Query(a = "room_id") long j, @Query(a = "user_id") long j2);

    @FormUrlEncoded
    @POST("/webcast/screen_chat/")
    Observable<d<Barrage>> sendBarrage(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/webcast/room/decoration/audit_text/")
    Observable<d<DecorationTextAuditResult>> sendDecorationText(@FieldMap HashMap<String, String> hashMap);

    @GET("/webcast/room/ping/audience/")
    Observable<d<PingResult>> sendPlayingPing(@Query(a = "room_id") long j, @Query(a = "only_status") int i);

    @FormUrlEncoded
    @POST("/webcast/room/share/")
    Observable<d<ShareReportResult>> sendShare(@Field(a = "room_id") long j, @FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/webcast/room/chat/")
    Observable<d<ChatResult>> sendTextMessage(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/webcast/room/decoration/set/")
    Observable<d<Object>> setDecoration(@Field(a = "room_id") long j, @FieldMap HashMap<String, String> hashMap);

    @GET("/webcast/anchor/cover/neednotice/")
    Observable<d<Object>> shouldShowCoverNotice();

    @GET("/webcast/room/auditing/apply/")
    Observable<d<Object>> unblockRoom(@Query(a = "room_id") long j);

    @GET("/webcast/anchor/memorial/memorial_reported/")
    Observable<d<Void>> updateAnchorMemorial(@Query(a = "anchor_id") long j);

    @GET("/hotsoon/room/{room_id}/_update_status/")
    Observable<d<Void>> updateRoomStatus(@Path(a = "room_id") long j, @QueryMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/webcast/room/internal_ci_info/")
    Observable<d<Void>> uploadBeautyParams(@Field(a = "room_id") long j, @Field(a = "filter_name") String str, @Field(a = "whitening") int i, @Field(a = "beauty_skin") int i2, @Field(a = "big_eyes") int i3, @Field(a = "face_lift") int i4);
}
