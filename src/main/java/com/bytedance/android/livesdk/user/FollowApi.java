package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

public interface FollowApi {
    @FormUrlEncoded
    @POST("/webcast/user/relation/update/")
    Observable<d<c>> follow(@Field(a = "follow_type") int i, @Field(a = "to_user_id") long j, @Field(a = "current_room_id") long j2, @Field(a = "sec_user_id") String str, @Field(a = "sec_to_user_id") String str2);

    @FormUrlEncoded
    @POST("/webcast/user/relation/update/")
    Observable<d<c>> unfollow(@Field(a = "follow_type") int i, @Field(a = "sec_user_id") String str, @Field(a = "to_user_id") long j, @Field(a = "sec_to_user_id") String str2, @Field(a = "current_room_id") long j2);
}
