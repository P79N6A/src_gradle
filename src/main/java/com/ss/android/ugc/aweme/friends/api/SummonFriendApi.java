package com.ss.android.ugc.aweme.friends.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;

public final class SummonFriendApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48824a;

    /* renamed from: b  reason: collision with root package name */
    private static final SummonFriendService f48825b = ((SummonFriendService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SummonFriendService.class));

    public interface SummonFriendService {
        @GET("/aweme/v1/user/following/list/")
        Call<FollowUserListModel> queryFollowFriends(@Query(a = "count") int i, @Query(a = "user_id") String str, @Query(a = "max_time") long j, @Query(a = "min_time") long j2, @Query(a = "address_book_access") int i2, @Query(a = "gps_access") int i3);

        @GET("/aweme/v1/user/recent/contact/")
        Call<RecentFriendModel> queryRecentFriends();

        @GET("/aweme/v1/discover/search/")
        Call<SummonFriendList> searchFriends(@Query(a = "keyword") String str, @Query(a = "count") long j, @Query(a = "cursor") long j2, @Query(a = "type") int i, @Query(a = "search_source") String str2, @Query(a = "filter_block") int i2);
    }

    public static RecentFriendModel a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f48824a, true, 46375, new Class[0], RecentFriendModel.class)) {
            return (RecentFriendModel) PatchProxy.accessDispatch(new Object[0], null, f48824a, true, 46375, new Class[0], RecentFriendModel.class);
        }
        return (RecentFriendModel) f48825b.queryRecentFriends().execute().body();
    }

    public static SummonFriendList a(String str, long j, long j2, String str2) throws Exception {
        long j3 = j;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j3), 20L, str2}, null, f48824a, true, 46377, new Class[]{String.class, Long.TYPE, Long.TYPE, String.class}, SummonFriendList.class)) {
            return (SummonFriendList) f48825b.searchFriends(str, 20, j, 1, str2, 1).execute().body();
        }
        Object[] objArr = {str, new Long(j3), 20L, str2};
        return (SummonFriendList) PatchProxy.accessDispatch(objArr, null, f48824a, true, 46377, new Class[]{String.class, Long.TYPE, Long.TYPE, String.class}, SummonFriendList.class);
    }

    public static FollowUserListModel a(int i, long j, long j2, String str, int i2, int i3) throws Exception {
        long j3 = j;
        if (!PatchProxy.isSupport(new Object[]{10, new Long(j3), 0L, str, Integer.valueOf(i2), Integer.valueOf(i3)}, null, f48824a, true, 46376, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, String.class, Integer.TYPE, Integer.TYPE}, FollowUserListModel.class)) {
            return (FollowUserListModel) f48825b.queryFollowFriends(10, str, j, 0, i2, i3).execute().body();
        }
        return (FollowUserListModel) PatchProxy.accessDispatch(new Object[]{10, new Long(j3), 0L, str, Integer.valueOf(i2), Integer.valueOf(i3)}, null, f48824a, true, 46376, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, String.class, Integer.TYPE, Integer.TYPE}, FollowUserListModel.class);
    }
}
