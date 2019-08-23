package com.bytedance.android.livesdk.fansclub;

import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.Url;
import io.reactivex.Observable;

public interface LiveFansClubApi {
    @GET
    Observable<m> queryFansClubInfo(@Url String str, @Query(a = "anchor_id") long j);
}
