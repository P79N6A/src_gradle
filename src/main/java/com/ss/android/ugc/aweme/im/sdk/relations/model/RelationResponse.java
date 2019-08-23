package com.ss.android.ugc.aweme.im.sdk.relations.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;

@Keep
public class RelationResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("followings")
    List<IMUser> followings;
    @SerializedName("has_more")
    int hasMore;
    @SerializedName("max_time")
    long maxTime;
    @SerializedName("min_time")
    long minTime;
    @SerializedName("next_req_count")
    int nextReqCount;

    public List<IMUser> getFollowings() {
        return this.followings;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getNextReqCount() {
        return this.nextReqCount;
    }

    public void setFollowings(List<IMUser> list) {
        this.followings = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxTime(long j) {
        this.maxTime = j;
    }

    public void setMinTime(long j) {
        this.minTime = j;
    }

    public void setNextReqCount(int i) {
        this.nextReqCount = i;
    }
}
