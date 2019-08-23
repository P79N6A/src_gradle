package com.ss.android.ugc.aweme.main.follow.api;

import com.google.common.util.concurrent.q;
import retrofit2.http.GET;

public final class FollowLastAPI {

    interface FollowLastApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/rec/recent/item/user/")
        q<Object> getLastItem();
    }
}
