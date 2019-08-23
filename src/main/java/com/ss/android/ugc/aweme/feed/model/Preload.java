package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Preload implements Serializable {
    @SerializedName("comment_median_time")
    public long commentMedianTime;
    @SerializedName("comment")
    public int commentPreload = -1;
    @SerializedName("comment_pro")
    public double commentPro;
    @SerializedName("comment_thres")
    public double commentThres;
    @SerializedName("model_v2")
    public int modelV2;
    @SerializedName("profile_median_time")
    public long profileMedianTime;
    @SerializedName("profile")
    public int profilePreload = -1;
    @SerializedName("profile_pro")
    public double profilePro;
    @SerializedName("profile_thres")
    public double profileThres;
}
