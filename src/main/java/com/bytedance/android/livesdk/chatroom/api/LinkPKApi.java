package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.model.a;
import com.bytedance.android.livesdk.chatroom.interact.model.c;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.List;

public interface LinkPKApi {
    @GET("/webcast/linkmic/battle/auto_match/")
    Observable<d<LinkAutoMatchModel>> autoMatch(@Query(a = "room_id") long j, @Query(a = "is_first") int i);

    @GET("/webcast/linkmic/battle/invite/")
    Observable<d<Void>> battleInvite(@Query(a = "channel_id") long j);

    @GET("/webcast/linkmic/battle/reject/")
    Observable<d<Void>> battleReject(@Query(a = "channel_id") long j);

    @GET("/webcast/linkmic/battle/stats/")
    Observable<d<p>> battleStats(@Query(a = "channel_id") long j, @Query(a = "anchor_id") long j2);

    @GET("/webcast/linkmic/battle/cancel_match/")
    Observable<d<Void>> cancleMatch();

    @GET("/webcast/linkmic/battle/cut_short_count/")
    Observable<d<a>> cutShortCount();

    @GET("/webcast/linkmic/battle/finish/")
    Observable<d<Void>> finish(@Query(a = "channel_id") long j, @Query(a = "battle_source") int i, @Query(a = "is_cut_short") int i2);

    @GET("/hotsoon/linkmic/v3/battle/mode_finish/")
    Observable<d<com.bytedance.android.livesdk.chatroom.interact.data.a>> finishMode(@Query(a = "mode") int i, @Query(a = "channel_id") long j);

    @GET("/hotsoon/linkmic/v3/battle/mode_get/")
    Observable<d<List<c>>> getMode(@Query(a = "mode") int i);

    @GET("/webcast/linkmic/battle/open/")
    Observable<d<Void>> openBattle(@Query(a = "channel_id") long j, @Query(a = "duration") int i, @Query(a = "match_type") int i2, @Query(a = "theme") String str);

    @GET("/hotsoon/linkmic/v3/battle/mode_set/")
    Observable<d<Void>> setMode(@Query(a = "mode") int i, @Query(a = "open") int i2);

    @GET("/hotsoon/linkmic/v3/battle/mode_start/")
    Observable<d<Void>> startMode(@Query(a = "mode") int i, @Query(a = "channel_id") long j);
}
