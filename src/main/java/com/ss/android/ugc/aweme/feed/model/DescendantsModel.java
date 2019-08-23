package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

public class DescendantsModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("notifyMsg")
    public String notifyMsg;
    @SerializedName("platforms")
    public List<String> platforms;

    public String getNotifyMsg() {
        return this.notifyMsg;
    }

    public List<String> getPlatforms() {
        return this.platforms;
    }

    public void setNotifyMsg(String str) {
        this.notifyMsg = str;
    }

    public void setPlatforms(List<String> list) {
        this.platforms = list;
    }
}
