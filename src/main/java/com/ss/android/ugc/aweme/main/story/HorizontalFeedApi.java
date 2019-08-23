package com.ss.android.ugc.aweme.main.story;

import a.i;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.main.story.live.d;
import com.ss.android.ugc.aweme.story.model.StoryResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HorizontalFeedApi {
    @GET(a = "/aweme/v1/room/recommended/avatars/")
    q<d> fetchRecommendAvatars(@Query(a = "page_id") int i, @Query(a = "is_cold_start") String str, @Query(a = "is_hot_start") String str2);

    @GET(a = "/aweme/v1/story/")
    q<StoryResponse> getStory(@Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "page_id") int i2, @Query(a = "is_cold_start") String str, @Query(a = "is_hot_start") String str2);

    @GET(a = "/aweme/v1/skylight/open/report/")
    i<BaseResponse> sendSkylightState(@Query(a = "status") int i);
}
