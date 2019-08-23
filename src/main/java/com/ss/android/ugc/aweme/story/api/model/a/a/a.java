package com.ss.android.ugc.aweme.story.api.model.a.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_name")
    private String adName;
    @SerializedName("ad_id")
    private long id;
    @SerializedName("is_high_level")
    private boolean isHighLevel;
    @SerializedName("jump_url")
    private String jumpUrl;
    @SerializedName("pic_url")
    private List<UrlModel> picUrlList;

    public String getAdName() {
        return this.adName;
    }

    public long getId() {
        return this.id;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public List<UrlModel> getPicUrlList() {
        return this.picUrlList;
    }

    public boolean isHighLevel() {
        return this.isHighLevel;
    }

    public a setAdName(String str) {
        this.adName = str;
        return this;
    }

    public a setHighLevel(boolean z) {
        this.isHighLevel = z;
        return this;
    }

    public a setId(long j) {
        this.id = j;
        return this;
    }

    public a setJumpUrl(String str) {
        this.jumpUrl = str;
        return this;
    }

    public a setPicUrlList(List<UrlModel> list) {
        this.picUrlList = list;
        return this;
    }
}
