package com.ss.android.ugc.aweme.friendfeed.api;

import a.i;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class FriendFeedUnreadApi {

    /* renamed from: a  reason: collision with root package name */
    private static final FriendFeedUnreadRetrofitApi f48667a = ((FriendFeedUnreadRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FriendFeedUnreadRetrofitApi.class));

    interface FriendFeedUnreadRetrofitApi {
        @GET(a = "/aweme/v1/friend/feed/unread/")
        i<Object> getFriendFeedUnread(@Query(a = "cold_start") int i);

        @GET(a = "/aweme/v1/friend/feed/unread/")
        i<Object> getFriendFeedUnread(@Query(a = "cold_start") int i, @Query(a = "notice_group_type") int i2);
    }
}
