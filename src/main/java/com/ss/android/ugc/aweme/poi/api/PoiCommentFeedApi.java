package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.ss.android.ugc.aweme.poi.a.e;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PoiCommentFeedApi {
    @GET(a = "/aweme/v1/poi/comment/list/")
    i<e> getCommentList(@Query(a = "poi_id") String str, @Query(a = "count") int i, @Query(a = "page") long j);
}
