package com.ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.annotations.SerializedName;

public class UploadUrlBean {
    @SerializedName("ip")
    public String ip;
    @SerializedName("timeout")
    public int timeout;
    @SerializedName("url")
    public String url;
}
