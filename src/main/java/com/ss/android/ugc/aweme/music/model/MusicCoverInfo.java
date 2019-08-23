package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class MusicCoverInfo {
    @SerializedName("url_list")
    public List<String> coverUrlList;
    @SerializedName("partner_name")
    public String partnerName;
}
