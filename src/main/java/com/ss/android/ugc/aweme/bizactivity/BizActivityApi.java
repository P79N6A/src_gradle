package com.ss.android.ugc.aweme.bizactivity;

import com.google.common.util.concurrent.q;
import retrofit2.http.GET;

public interface BizActivityApi {
    @GET(a = "https://aweme.snssdk.com/aweme/v2/activity/evening/info/")
    q<h> getActivityInfo();
}
