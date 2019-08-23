package com.bytedance.android.livesdk.gift.domain.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.h;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface PropApi {
    @POST("/webcast/props/mine/")
    Observable<d<h>> getPropList();

    @FormUrlEncoded
    @POST("/webcast/props/consume/")
    Observable<d<i>> sendProp(@Field(a = "prop_def_id") long j, @Query(a = "room_id") long j2, @Field(a = "count") int i, @Field(a = "to_user_id") long j3, @Field(a = "is_aweme_free_gift") int i2);
}
