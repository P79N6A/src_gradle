package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.annotations.SerializedName;

public class AdAck {
    @SerializedName("message")
    String message;
    @SerializedName("status")
    public int status;
}
