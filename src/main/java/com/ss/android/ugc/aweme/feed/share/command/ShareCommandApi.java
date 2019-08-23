package com.ss.android.ugc.aweme.feed.share.command;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.share.a.d;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShareCommandApi {
    @GET(a = "/aweme/v2/platform/share/command/gen/")
    q<a> getCommand(@Query(a = "schema") String str, @Query(a = "schema_type") int i, @Query(a = "object_id") String str2);

    @GET(a = "/aweme/v2/platform/share/command/trans/")
    q<d> getSchema(@Query(a = "command") String str);
}
