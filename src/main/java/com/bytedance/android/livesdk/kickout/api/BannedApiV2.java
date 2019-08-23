package com.bytedance.android.livesdk.kickout.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.kickout.b.a;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006H'¨\u0006\u0012"}, d2 = {"Lcom/bytedance/android/livesdk/kickout/api/BannedApiV2;", "", "getBannedTalkList", "Lio/reactivex/Observable;", "Lcom/bytedance/android/livesdk/kickout/model/BannedUserEntity;", "roomId", "", "count", "", "offset", "secUid", "", "getKickedOutList", "kickOut", "Lcom/bytedance/android/live/core/network/response/Response;", "Ljava/lang/Void;", "uid", "unKickOut", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public interface BannedApiV2 {
    @NotNull
    @GET("/webcast/room/silence/list/")
    Observable<a> getBannedTalkList(@Query(a = "room_id") long j, @Query(a = "count") int i, @Query(a = "offset") int i2, @NotNull @Query(a = "sec_user_id") String str);

    @NotNull
    @GET("/webcast/room/kick/list/")
    Observable<a> getKickedOutList(@Query(a = "room_id") long j, @Query(a = "count") int i, @Query(a = "offset") int i2, @NotNull @Query(a = "sec_user_id") String str);

    @NotNull
    @GET("/webcast/room/kick/user/")
    Observable<d<Void>> kickOut(@Query(a = "room_id") long j, @Query(a = "kick_uid") long j2);

    @NotNull
    @GET("/webcast/room/unkick/user/")
    Observable<d<Void>> unKickOut(@Query(a = "room_id") long j, @Query(a = "kick_uid") long j2);
}
