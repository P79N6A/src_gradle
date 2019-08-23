package com.ss.android.ugc.aweme.live.hostbusiness;

import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.ss.android.ugc.aweme.live.model.a;
import com.ss.android.ugc.aweme.live.model.b;
import io.reactivex.Observable;

public interface ILiveDouPlusApi {
    @GET("/aweme/v2/douplus/live/entry/")
    Observable<a> douPlusLiveEntry(@Query(a = "sec_anchor_id") String str, @Query(a = "room_id") long j, @Query(a = "entrance_type") String str2);

    @GET("/aweme/v2/douplus/ad/")
    Observable<b> queryOrderStatus(@Query(a = "item_id") long j);
}
