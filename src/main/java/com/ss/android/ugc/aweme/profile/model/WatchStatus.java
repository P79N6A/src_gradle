package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class WatchStatus extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("follow_status")
    public int followStatus;
    public String userId;
    @SerializedName("watch_status")
    public int watchStatus;

    public FollowStatus cpoyToFollowStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67524, new Class[0], FollowStatus.class)) {
            return (FollowStatus) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67524, new Class[0], FollowStatus.class);
        }
        FollowStatus followStatus2 = new FollowStatus();
        followStatus2.userId = this.userId;
        followStatus2.followStatus = this.followStatus;
        followStatus2.watchStatus = this.watchStatus;
        return followStatus2;
    }
}
