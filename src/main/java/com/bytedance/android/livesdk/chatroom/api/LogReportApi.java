package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface LogReportApi {
    @POST("/webcast/stats/")
    Observable<d<Object>> logReport(@Query(a = "ssmix") String str, @Body Object obj);
}
