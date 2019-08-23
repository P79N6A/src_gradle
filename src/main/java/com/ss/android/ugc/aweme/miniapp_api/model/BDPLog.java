package com.ss.android.ugc.aweme.miniapp_api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class BDPLog {
    @SerializedName("biz_location")
    public String bizLocation;
    @SerializedName("group_id")
    public String groupId;
    @SerializedName("launch_from")
    public String launchFrom;
    @SerializedName("location")
    public String location;
    @SerializedName("ttid")
    public String ttid;

    public BDPLog() {
    }

    public BDPLog(String str, String str2, String str3) {
        this.launchFrom = str;
        this.location = str2;
        this.groupId = str3;
    }
}
