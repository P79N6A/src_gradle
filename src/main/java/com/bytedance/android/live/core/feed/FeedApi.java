package com.bytedance.android.live.core.feed;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.network.response.c;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.Url;
import io.reactivex.Observable;

public interface FeedApi {
    @GET
    Observable<c<FeedItem>> feed(@Url String str, @Query(a = "max_time") long j, @Query(a = "req_from") String str2);

    @GET
    Observable<c<FeedItem>> feed(@Url String str, @Query(a = "max_time") long j, @Query(a = "req_from") String str2, @Query(a = "is_draw") long j2, @Query(a = "draw_room_id") long j3, @Query(a = "draw_room_owner_id") long j4);

    @GET
    Observable<c<FeedItem>> feedAfter(@Url String str, @Query(a = "max_time") long j, @Query(a = "min_time") long j2, @Query(a = "offset") long j3, @Query(a = "count") long j4, @Query(a = "req_from") String str2, @Query(a = "hb_info") String str3, @Query(a = "gaid") String str4, @Query(a = "ad_user_agent") String str5);

    @GET
    Observable<c<FeedItem>> feedAfter(@Url String str, @Query(a = "max_time") long j, @Query(a = "offset") long j2, @Query(a = "count") long j3, @Query(a = "req_from") String str2, @Query(a = "diff_stream") Integer num, @Query(a = "hb_info") String str3, @Query(a = "gaid") String str4, @Query(a = "ad_user_agent") String str5);

    @GET
    Observable<c<FeedItem>> feedAfter(@Url String str, @Query(a = "max_time") long j, @Query(a = "offset") long j2, @Query(a = "count") long j3, @Query(a = "req_from") String str2, @Query(a = "hb_info") String str3, @Query(a = "gaid") String str4, @Query(a = "ad_user_agent") String str5);

    @GET
    Observable<c<FeedItem>> feedInitial(@Url String str, @Query(a = "min_time") long j, @Query(a = "offset") long j2, @Query(a = "count") long j3, @Query(a = "req_from") String str2, @Query(a = "push_item_id") long j4, @Query(a = "hb_info") String str3, @Query(a = "gaid") String str4, @Query(a = "ad_user_agent") String str5);

    @GET
    Observable<c<FeedItem>> feedInitial(@Url String str, @Query(a = "min_time") long j, @Query(a = "offset") long j2, @Query(a = "count") long j3, @Query(a = "req_from") String str2, @Query(a = "diff_stream") Integer num, @Query(a = "hb_info") String str3, @Query(a = "gaid") String str4, @Query(a = "ad_user_agent") String str5);
}
