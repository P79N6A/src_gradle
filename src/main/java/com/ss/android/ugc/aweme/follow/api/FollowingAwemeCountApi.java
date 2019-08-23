package com.ss.android.ugc.aweme.follow.api;

import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.google.common.util.concurrent.q;

public interface FollowingAwemeCountApi {
    @GET("/aweme/v1/rec/new/")
    q<Object> getFollowingsLatestAwemePublishCount(@Query(a = "need_avatar") int i);
}
