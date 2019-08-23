package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;

public class RecommendMusic {
    @SerializedName("music_info")
    public Music musicInfo;
    @SerializedName("user_name")
    public String userName;
    @SerializedName("user_schema")
    public String userSchema;
}
