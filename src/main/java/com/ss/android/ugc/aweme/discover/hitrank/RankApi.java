package com.ss.android.ugc.aweme.discover.hitrank;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RankApi {
    @GET(a = "aweme/v1/spotpoint/set/hitrank/")
    q<BaseResponse> finishHitRankTask(@Query(a = "to_userid") String str, @Query(a = "rank_type") int i, @Query(a = "action_type") int i2, @Query(a = "hashtag_names") List<String> list, @Query(a = "sec_to_userid") String str2);

    @GET(a = "aweme/v1/spotpoint/hit/notice/star/list/")
    q<HitNotice> getActivityInfo(@Query(a = "user_id") String str, @Query(a = "sec_user_id") String str2);
}
