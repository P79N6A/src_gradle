package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.ac;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface PkPromotionApi {
    @GET("/hotsoon/linkmic/v3/battle/medal/")
    Observable<d<ac>> getCurrentMedal(@Query(a = "uid") long j);
}
