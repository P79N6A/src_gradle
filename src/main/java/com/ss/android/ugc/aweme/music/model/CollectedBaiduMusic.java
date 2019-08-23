package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;

public class CollectedBaiduMusic {
    @SerializedName("collect_stat")
    public boolean collectStatus;
    @SerializedName("music_id")
    public String id;
    @SerializedName("item_id")
    public long itemId;
    @SerializedName("music_status")
    public int musicStatus;
}
