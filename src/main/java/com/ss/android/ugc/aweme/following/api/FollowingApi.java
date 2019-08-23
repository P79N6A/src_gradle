package com.ss.android.ugc.aweme.following.api;

import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.following.a.e;

public interface FollowingApi {
    @GET("/aweme/v1/user/following/list/")
    q<e> fetchFollowingList(@Query(a = "user_id") String str, @Query(a = "max_time") long j, @Query(a = "count") int i, @Query(a = "offset") int i2, @Query(a = "source_type") int i3, @Query(a = "address_book_access") int i4, @Query(a = "gps_access") int i5);
}
