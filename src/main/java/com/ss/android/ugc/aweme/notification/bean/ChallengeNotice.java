package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.discover.model.Challenge;

@Keep
public class ChallengeNotice {
    @SerializedName("challenge")
    public Challenge challenge;
    @SerializedName("content")
    public String content;
    @SerializedName("schema")
    public String schema;
    @SerializedName("title")
    public String title;
}
