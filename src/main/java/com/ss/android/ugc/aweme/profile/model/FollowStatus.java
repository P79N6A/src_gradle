package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class FollowStatus extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("contact_name")
    public String contactName;
    @SerializedName("follow_status")
    public int followStatus;
    @SerializedName("is_enterprise")
    int isEnterprise;
    public boolean isFollowSucess = true;
    public String userId;
    @SerializedName("watch_status")
    public int watchStatus;

    public FollowStatus() {
    }

    public boolean getIsEnterprise() {
        if (this.isEnterprise == 1) {
            return true;
        }
        return false;
    }

    public boolean isCheating() {
        if (this.status_code == 2149) {
            return true;
        }
        return false;
    }

    public WatchStatus cpoyToWatchStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67479, new Class[0], WatchStatus.class)) {
            return (WatchStatus) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67479, new Class[0], WatchStatus.class);
        }
        WatchStatus watchStatus2 = new WatchStatus();
        watchStatus2.userId = this.userId;
        watchStatus2.followStatus = this.followStatus;
        watchStatus2.watchStatus = this.watchStatus;
        return watchStatus2;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67480, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67480, new Class[0], String.class);
        }
        return "FollowStatus{watchStatus=" + this.watchStatus + ", followStatus=" + this.followStatus + ", userId='" + this.userId + '\'' + ", isFollowSucess=" + this.isFollowSucess + ", contactName=" + this.contactName + ", isEnterprise=" + this.isEnterprise + '}';
    }

    public FollowStatus(String str, int i) {
        this.userId = str;
        this.followStatus = i;
    }

    public FollowStatus(String str, int i, int i2) {
        this.userId = str;
        this.followStatus = i;
        this.status_code = i2;
    }
}
