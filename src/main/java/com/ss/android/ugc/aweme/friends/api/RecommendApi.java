package com.ss.android.ugc.aweme.friends.api;

import a.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RecommendApi {
    @FormUrlEncoded
    @POST(a = "/aweme/v2/recommend/dislike/")
    i<BaseResponse> dislikeRecommend(@Field(a = "dislike_type") int i, @Field(a = "object_id") String str);

    @GET(a = "/aweme/v1/recommend/user/dislike/")
    i<BaseResponse> dislikeRecommend(@Query(a = "user_id") String str);

    @FormUrlEncoded
    @POST(a = "/aweme/v1/multi/commit/follow/user/")
    i followUsers(@Field(a = "user_ids") String str, @Field(a = "sec_user_ids") String str2, @Field(a = "type") int i);

    @FormUrlEncoded
    @POST(a = "/aweme/v1/commit/user/extra/")
    i modifyUser(@Field(a = "need_recommend") int i);

    @GET(a = "/aweme/v2/user/recommend/")
    i<RecommendList> recommendList(@Query(a = "count") Integer num, @Query(a = "cursor") Integer num2, @Query(a = "target_user_id") String str, @Query(a = "recommend_type") Integer num3, @Query(a = "yellow_point_count") Integer num4, @Query(a = "address_book_access") Integer num5, @Query(a = "rec_impr_users") String str2, @Query(a = "gps_access") Integer num6, @Query(a = "sec_target_user_id") String str3);

    @GET(a = "/aweme/v2/user/recommend/")
    i<RecommendList> recommendList(@Query(a = "count") Integer num, @Query(a = "cursor") Integer num2, @Query(a = "target_user_id") String str, @Query(a = "recommend_type") Integer num3, @Query(a = "yellow_point_count") Integer num4, @Query(a = "address_book_access") Integer num5, @Query(a = "rec_impr_users") String str2, @Query(a = "push_user_id") String str3, @Query(a = "gps_access") Integer num6, @Query(a = "sec_target_user_id") String str4, @Query(a = "sec_push_user_id") String str5);
}
