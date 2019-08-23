package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;

public interface FeedStatsApi {
    @GET("/aweme/v1/aweme/modify/visibility/")
    Call<PrivateUrlModel> feedStats(@Query(a = "aweme_id") String str, @Query(a = "type") int i);
}
