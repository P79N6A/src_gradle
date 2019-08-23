package com.ss.android.ugc.aweme.follow.api;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/api/FollowFeedApiV2;", "", "getFollowFeedList", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedList;", "refreshCount", "", "cursor", "", "level", "count", "pullType", "feedStyle", "enterTime", "recImprUsers", "", "awemeId", "awemeIds", "pushParams", "impressionIds", "lastFeedIds", "gpsAccess", "lastFollowId", "addressBookAccess", "filterStrategy", "logId", "itemCount", "liveCount", "noticeCountType", "authorId", "itemId", "liveTagShowType", "(IJIIIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/google/common/util/concurrent/ListenableFuture;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface FollowFeedApiV2 {
    @FormUrlEncoded
    @NotNull
    @POST(a = "/aweme/v2/follow/feed/")
    q<FollowFeedList> getFollowFeedList(@Field(a = "follow_req_index") int i, @Field(a = "cursor") long j, @Field(a = "level") int i2, @Field(a = "count") int i3, @Field(a = "pull_type") int i4, @Field(a = "feed_style") int i5, @Field(a = "enter_time") long j2, @Field(a = "rec_impr_users") @Nullable String str, @Field(a = "aweme_id") @Nullable String str2, @Field(a = "aweme_ids") @Nullable String str3, @Field(a = "push_params") @Nullable String str4, @Field(a = "impression_ids") @Nullable String str5, @Field(a = "last_feed_ids") @Nullable String str6, @Field(a = "gps_access") int i6, @Field(a = "last_follow_uid") @Nullable String str7, @Field(a = "address_book_access") int i7, @Field(a = "filter_strategy") int i8, @Field(a = "notice_count_log_id") @Nullable String str8, @Field(a = "notice_item_count") @Nullable Integer num, @Field(a = "notice_live_count") @Nullable Integer num2, @Field(a = "notice_count_type") @Nullable Integer num3, @Field(a = "notice_link_author_id") @Nullable Long l, @Field(a = "notice_link_item_id") @Nullable Long l2, @Field(a = "notice_is_display_live") @Nullable Integer num4);
}
