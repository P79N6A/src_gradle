package com.ss.android.ugc.aweme.profile.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/presenter/UserResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "()V", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setUser", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("log_pb")
    @Nullable
    private LogPbBean logPb;
    @SerializedName("user")
    @Nullable
    private User user;

    @Nullable
    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    @Nullable
    public final User getUser() {
        return this.user;
    }

    public final void setLogPb(@Nullable LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUser(@Nullable User user2) {
        this.user = user2;
    }
}
