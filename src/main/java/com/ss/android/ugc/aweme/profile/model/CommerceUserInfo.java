package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class CommerceUserInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("show_star_atlas_cooperation")
    public boolean showStarAtlasCooperation;
    @SerializedName("star_atlas")
    public int starAtlas;

    public int getStarAtlas() {
        return this.starAtlas;
    }

    public boolean isShowStarAtlasCooperation() {
        return this.showStarAtlasCooperation;
    }
}
