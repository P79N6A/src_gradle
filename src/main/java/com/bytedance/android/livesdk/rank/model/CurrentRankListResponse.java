package com.bytedance.android.livesdk.rank.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
public class CurrentRankListResponse {
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("music_wave")
    public String musicWave;
    @SerializedName("ranks")
    public List<b> ranks;
    @SerializedName("seats")
    public List<b> seats;
    @SerializedName("self_info")
    public b selfInfo;
    @SerializedName("total")
    public long total;
}
