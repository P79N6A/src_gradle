package com.ss.android.ugc.aweme.friends.api;

import a.i;
import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.friends.b.c;
import com.ss.android.ugc.aweme.friends.b.d;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface FriendApi {
    @GET(a = "/ug/social/invite/msg/settings/")
    q<d> getInviteContactFriendsSettings();

    @FormUrlEncoded
    @POST(a = "/ug/social/invite/msg/send_msg/")
    q<c> inviteBySms(@Field(a = "user_name") String str, @Field(a = "enter_from") String str2, @Field(a = "mobile_list") String str3);

    @FormUrlEncoded
    @POST(a = "/aweme/v1/user/contact/invite/")
    q<c> inviteBySmsDouyin(@Query(a = "user_name") String str, @Field(a = "mobile_ids") String str2);

    @GET(a = "/aweme/v1/user/contact/")
    i<FriendList<User>> queryContactsFriends(@Query(a = "cursor") int i, @Query(a = "count") int i2, @Query(a = "type") int i3);

    @GET(a = "/aweme/v1/user/contact/")
    i<FriendList<User>> queryContactsFriendsCountOnly(@Query(a = "cursor") int i, @Query(a = "count") int i2, @Query(a = "type") int i3, @Query(a = "count_only") int i4);

    @GET(a = "/aweme/v1/user/contact/invite_list/")
    i<FriendList<User>> queryMoreUnregisteredFriends(@Query(a = "cursor") int i, @Query(a = "count") int i2);

    @FormUrlEncoded
    @POST(a = "/ug/social/invite/msg/short_url/")
    q<c> shortenUrl(@Field(a = "url") String str);

    @GET(a = "/aweme/v1/social/friend/")
    i<FriendList<Friend>> thirdPartFriends(@Query(a = "social") String str, @Query(a = "access_token") String str2, @Query(a = "secret_access_token") String str3);

    @GET(a = "/aweme/v1/social/token_upload/")
    i<Void> uploadAccessToken(@Query(a = "social") String str, @Query(a = "access_token") String str2, @Query(a = "secret_access_token") String str3);
}
