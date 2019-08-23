package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CheckCollectedBaidu {
    @SerializedName("check_info")
    public List<CollectedBaiduMusic> checkList;
    @SerializedName("status_code")
    public int statusCode;
}
