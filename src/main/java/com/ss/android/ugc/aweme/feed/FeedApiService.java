package com.ss.android.ugc.aweme.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public class FeedApiService implements IFeedApi {
    public static ChangeQuickRedirect changeQuickRedirect;

    public FeedItemList fetchFeedList(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, String str5) throws Exception {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j4), new Long(j5), Integer.valueOf(i2), num, str, Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, str4, new Long(j6), str5}, this, changeQuickRedirect, false, 40140, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Long.TYPE, String.class}, FeedItemList.class)) {
            return FeedApi.a(i, j, j2, i2, num, str, i3, i4, str2, str3, str4, j3);
        }
        return (FeedItemList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j4), new Long(j5), Integer.valueOf(i2), num, str, Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, str4, new Long(j6), str5}, this, changeQuickRedirect, false, 40140, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Long.TYPE, String.class}, FeedItemList.class);
    }
}
