package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.bytedance.android.livesdk.chatroom.model.l;
import com.bytedance.android.livesdk.chatroom.model.m;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface FansClubApi {
    @FormUrlEncoded
    @POST("/live/fansclub/auto_renewal/{anchor_id}/edit/")
    Observable<d<l>> editAutoLight(@Path(a = "anchor_id") long j, @Field(a = "open") int i);

    @GET("/live/fansclub/prefer/candidate_list/")
    Observable<d<m>> get(@Query(a = "offset") int i, @Query(a = "count") int i2);

    @GET("/live/fansclub/auto_renewal/list/")
    Observable<d<k>> getAutoLightList(@Query(a = "offset") int i, @Query(a = "count") int i2);

    @FormUrlEncoded
    @POST("/live/fansclub/prefer/set/")
    Observable<d<Object>> setPreferFansClub(@Field(a = "anchor_id") String str);
}
