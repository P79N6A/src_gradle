package com.ss.android.ugc.aweme.usercommand;

import com.google.common.util.concurrent.q;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserCommandApi {
    @GET(a = "/aweme/v2/platform/share/command/trans/")
    q<Object> getSchema(@Query(a = "command") String str);
}
