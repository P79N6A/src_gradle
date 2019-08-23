package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CommercePermissionStruct implements Serializable {
    @SerializedName("ad_link")
    @Status
    public int adLink = -1;
    @SerializedName("star_atlas_order")
    @Status
    public int starAtlasOrder = -1;
    @SerializedName("top_item")
    @Status
    public int topItem = -1;

    public @interface Status {
    }
}
