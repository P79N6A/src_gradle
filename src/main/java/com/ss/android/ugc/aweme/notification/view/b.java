package com.ss.android.ugc.aweme.notification.view;

import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\n\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/view/IFansRecommendView;", "Lcom/ss/android/ugc/aweme/common/IBaseView;", "onLoadMoreRecommendFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onLoadMoreRecommendListResult", "data", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "onRefreshRecommendFailed", "onRefreshRecommendListResult", "showLoadingMoreRecommendList", "showRefreshingRecommendList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface b extends o {
    void a(@Nullable RecommendList recommendList);

    void a(@Nullable Exception exc);

    void b(@Nullable RecommendList recommendList);

    void e(@Nullable Exception exc);

    void i();
}
