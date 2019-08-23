package com.ss.android.ugc.aweme.followrequest.a;

import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J&\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH&J\u001e\u0010\u0010\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/followrequest/presenter/IFollowRequestView;", "Lcom/ss/android/ugc/aweme/common/IBaseView;", "onFollowRequestEmpty", "", "onFollowRequestError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isLoadMore", "", "onFollowRequestLoading", "onFollowRequestResult", "list", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "hasMore", "onFollowRequestSummaryResult", "total", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface e extends o {
    void a(@Nullable Exception exc, boolean z);

    void a(@NotNull List<User> list, boolean z, boolean z2);

    void a(boolean z);

    void c();
}
