package com.tt.appbrandimpl;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

public class PublishExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alias_id")
    String aliasId;
    @SerializedName("videoPath")
    String videoPath;
    @SerializedName("videoTopics")
    List<String> videoTopics;

    public String getAliasId() {
        return this.aliasId;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public List<String> getVideoTopics() {
        return this.videoTopics;
    }

    public void setAliasId(String str) {
        this.aliasId = str;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setVideoTopics(List<String> list) {
        this.videoTopics = list;
    }
}
