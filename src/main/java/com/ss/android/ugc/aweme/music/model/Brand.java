package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class Brand implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("heat")
    private int heat;
    @SerializedName("id")
    private int id;
    @SerializedName("logo_url")
    private UrlModel logoUrl;
    @SerializedName("name")
    private String name;
    @SerializedName("rank")
    private int rank;
    @SerializedName("rank_diff")
    private int rankDiff;

    public int getHeat() {
        return this.heat;
    }

    public int getId() {
        return this.id;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public String getName() {
        return this.name;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public void setHeat(int i) {
        this.heat = i;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }
}
