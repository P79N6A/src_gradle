package com.ss.android.ugc.aweme.feed.cache;

import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public interface IFeedApi {
    FeedItemList fetchFeedList(int i, long j, long j2, int i2, Integer num, String str, @Constants.FeedPullType int i3, int i4, String str2, String str3, String str4, long j3, String str5) throws Exception;
}
