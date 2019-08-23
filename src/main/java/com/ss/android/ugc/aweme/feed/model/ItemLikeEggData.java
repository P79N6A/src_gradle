package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class ItemLikeEggData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("material_url")
    public String materialUrl;

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }
}
