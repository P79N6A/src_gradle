package com.bytedance.android.livesdk.admin.api;

import com.bytedance.android.live.core.network.response.a;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.admin.b.b;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface AdminApi2 {
    @GET("/webcast/user/admin/list/")
    Observable<a<b, com.bytedance.android.livesdk.admin.b.a>> fetchAdministrators(@Query(a = "anchor_id") long j, @Query(a = "sec_anchor_id") String str, @Query(a = "sec_user_id") String str2);

    @FormUrlEncoded
    @POST("/webcast/user/admin/update/")
    Observable<d<Object>> updateAdmin(@Field(a = "update_type") int i, @Field(a = "to_user_id") long j, @Field(a = "anchor_id") long j2, @Field(a = "current_room_id") long j3);
}
