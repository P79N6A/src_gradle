package com.bytedance.android.livesdk.feed.dislike;

import com.bytedance.android.live.base.model.live.DislikeResult;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface DislikeApi {
    @GET("/webcast/room/dislike/")
    Observable<d<DislikeResult>> dislikeRoom(@Query(a = "id") long j, @Query(a = "owner_uid") long j2, @Query(a = "request_id") String str, @Query(a = "enter_source") String str2, @Query(a = "source") String str3, @Query(a = "log_pb") String str4);
}
