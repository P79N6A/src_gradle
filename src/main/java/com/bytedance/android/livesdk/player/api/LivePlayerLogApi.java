package com.bytedance.android.livesdk.player.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Observable;

public interface LivePlayerLogApi {
    @POST("/webcast/stats/")
    Observable<d<Void>> sendLiveLog(@Body TypedOutput typedOutput);
}
