package com.bytedance.android.livesdk.feed.tab.api;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.retrofit2.http.GET;
import io.reactivex.Observable;

public interface FeedTabApi {
    @GET("/webcast/tab/")
    Observable<c<g>> queryTab();
}
