package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.adapter.type.d;

public class MusicCollectionItem implements d {
    @SerializedName("aweme_cover")
    public UrlModel awemeCover;
    @SerializedName("cover")
    public UrlModel cover;
    @SerializedName("is_hot")
    public boolean isHot;
    @SerializedName("id_str")
    public String mcId;
    @SerializedName("name")
    public String mcName;
}
