package com.ss.android.ugc.aweme.profile.presenter;

import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.w.a.d;

public interface o extends d {
    void onLoadMoreRecommendSuccess(RecommendList recommendList);

    void onRecommendFailed(Exception exc);

    void onRefreshRecommendSuccess(RecommendList recommendList);
}
