package com.ss.android.ugc.aweme.discover.base;

import com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/IDiscoverFragment;", "", "onDiscoverHiddenChange", "", "hidden", "", "onHiddenChanged", "onVisibleToUser", "requestRefresh", "setExternalCurrentState", "currentState", "", "setLoftRefresh", "loftNestedRefreshLayout", "Lcom/ss/android/ugc/aweme/commercialize/loft/LoftNestedRefreshLayout;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface c {
    void a(int i);

    void a(@NotNull LoftNestedRefreshLayout loftNestedRefreshLayout);

    void a(boolean z);

    void onHiddenChanged(boolean z);
}
