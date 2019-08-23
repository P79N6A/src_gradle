package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.dutygift.DutyGiftInfo;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface DutyGiftAPi {
    @GET("/webcast/gift/duty_gift/")
    Observable<d<DutyGiftInfo>> dutyGiftRequest(@Query(a = "room_id") long j, @Query(a = "anchor_id") long j2, @Query(a = "op_type") long j3, @Query(a = "is_cut_short") boolean z);
}
