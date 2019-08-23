package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class StreamUrlModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    public String id;
    @SerializedName("rtmp_pull_url")
    public String rtmpPullUrl;

    public String getId() {
        return this.id;
    }

    public String getRtmpPullUrl() {
        return this.rtmpPullUrl;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmpPullUrl = str;
    }
}
