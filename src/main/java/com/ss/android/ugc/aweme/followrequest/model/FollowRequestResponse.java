package com.ss.android.ugc.aweme.followrequest.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

@Keep
public class FollowRequestResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("max_time")
    public long maxTime;
    @SerializedName("min_time")
    public long minTime;
    @SerializedName("total")
    public int total;
    @SerializedName("request_users")
    public List<User> userRequestList;

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getTotal() {
        return this.total;
    }

    public List<User> getUserRequestList() {
        return this.userRequestList;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
