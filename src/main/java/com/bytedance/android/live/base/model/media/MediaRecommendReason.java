package com.bytedance.android.live.base.model.media;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class MediaRecommendReason {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("city")
    private String city;
    @SerializedName("friend_name")
    private String friendName;
    @SerializedName("reason")
    private String reason;
    @SerializedName("type")
    private int type;

    public String getCity() {
        return this.city;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public String getReason() {
        return this.reason;
    }

    public int getType() {
        return this.type;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
