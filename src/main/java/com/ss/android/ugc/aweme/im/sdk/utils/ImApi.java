package com.ss.android.ugc.aweme.im.sdk.utils;

import a.i;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.model.BlockResponse;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerMessageList;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerSessionList;
import com.ss.android.ugc.aweme.im.sdk.model.UserStruct;
import com.ss.android.ugc.aweme.im.sdk.model.XPlanAwemeBannerConfig;
import com.ss.android.ugc.aweme.im.sdk.model.a;
import com.ss.android.ugc.aweme.im.sdk.model.b;
import com.ss.android.ugc.aweme.im.sdk.model.f;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationResponse;
import com.ss.android.ugc.aweme.im.sdk.resources.model.EmojiResourcesResponce;
import com.ss.android.ugc.aweme.im.sdk.resources.model.ResourcesResponse;
import com.ss.android.ugc.aweme.im.sdk.resources.model.d;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ImApi {
    @POST(a = "im/resources/sticker/create/")
    q<d> addSelfEmoji(@Query(a = "hash") String str, @Query(a = "animate_uri") String str2, @Query(a = "static_uri") String str3, @Query(a = "animate_type") String str4, @Query(a = "static_type") String str5, @Query(a = "width") int i, @Query(a = "height") int i2);

    @GET(a = "user/block/")
    q<BlockResponse> block(@Query(a = "user_id") String str, @Query(a = "sec_user_id") String str2, @Query(a = "block_type") int i);

    @POST(a = "im/resources/sticker/collect/")
    q<d> collectEmoji(@Query(a = "action") int i, @Query(a = "sticker_ids") String str);

    @GET(a = "im/stranger/cell/delete/")
    q<BaseResponse> deleteStrangerCell();

    @GET(a = "im/stranger/msg/delete/")
    q<BaseResponse> deleteStrangerSingleMsg(@Query(a = "to_uid") long j, @Query(a = "client_msg_id") long j2);

    @GET(a = "im/stranger/session/delete/")
    q<BaseResponse> deleteStrangerSingleSession(@Query(a = "to_uid") long j);

    @GET(a = "im/resources/hellosticker/")
    i<a> fetchGreetEmoji();

    @GET(a = "im/reboot/misc/")
    Observable<b> fetchMixInit(@Query(a = "r_cell_status") int i, @Query(a = "is_active_x") int i2, @Query(a = "im_token") int i3);

    @GET(a = "im/stranger/msg/list/")
    q<StrangerMessageList> fetchStrangerMsgList(@Query(a = "to_uid") long j, @Query(a = "sec_to_uid") String str);

    @GET(a = "im/stranger/session/list/")
    q<StrangerSessionList> fetchStrangerSessionList(@Query(a = "cursor") long j, @Query(a = "count") long j2, @Query(a = "is_reset_total_unread_count") boolean z);

    @GET(a = "user/")
    i<UserStruct> fetchUser(@Query(a = "user_id") String str, @Query(a = "sec_user_id") String str2);

    @FormUrlEncoded
    @POST(a = "im/user/info/")
    i<f> fetchUserInfo(@Field(a = "sec_user_ids") String str);

    @GET(a = "im/dx/banner/")
    i<XPlanAwemeBannerConfig> fetchXPlanAwemeBannerConfig();

    @GET(a = "im/group/share/")
    i<com.ss.android.ugc.aweme.im.sdk.detail.a.d> getGroupShareInfo(@Query(a = "share_scene") int i, @Query(a = "share_type") int i2, @Query(a = "group_id") String str);

    @GET(a = "im/resources/")
    q<ResourcesResponse> getResources(@Query(a = "resource_type") String str);

    @GET(a = "im/resources/sticker/list")
    q<EmojiResourcesResponce> getSelfEmojis();

    @GET(a = "spotlight/relation/")
    q<RelationResponse> getSpotlightRelation(@Query(a = "count") int i, @Query(a = "with_fstatus") int i2, @Query(a = "max_time") long j, @Query(a = "min_time") long j2);

    @GET(a = "life/detail/")
    i<com.ss.android.ugc.aweme.im.sdk.story.a.a> getStoryDetail(@Query(a = "story_id") String str);

    @FormUrlEncoded
    @POST(a = "im/story/state/")
    i<com.ss.android.ugc.aweme.im.sdk.story.a.b> getStoryState(@Field(a = "user_ids") String str);

    @GET(a = "im/upload/config/")
    q<com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b> getUploadAuthKeyConfig();

    @FormUrlEncoded
    @POST(a = "im/group/share/verification/")
    i<com.ss.android.ugc.aweme.im.sdk.detail.a.f> groupShareVerification(@Field(a = "secret") String str, @Field(a = "secret_type") int i, @Field(a = "group_id") String str2);

    @POST
    i<Response> postIMSDK(@Url String str, @Body Request request, @Header(a = "Content-Type") String str2);

    @GET(a = "user/")
    q<UserStruct> queryUser(@Query(a = "user_id") String str, @Query(a = "sec_user_id") String str2);

    @GET(a = "im/resources/emoticon/search/")
    i<com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.a> searchEmojis(@Query(a = "keyword") String str, @Query(a = "cursor") int i);

    @POST(a = "im/dr/cell/")
    i<BaseResponse> updateRCellState(@Query(a = "action") int i);
}
