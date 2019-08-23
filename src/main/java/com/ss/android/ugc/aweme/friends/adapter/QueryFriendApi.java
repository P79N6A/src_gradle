package com.ss.android.ugc.aweme.friends.adapter;

import a.i;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.a;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QueryFriendApi {
    @GET(a = "/aweme/v1/friends/")
    i<a> friendList(@Query(a = "count") Integer num, @Query(a = "cursor") Integer num2);
}
