package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.feed.model.Aweme;

@Keep
public class SystemNotice {
    @SerializedName("aweme")
    public Aweme aweme;
    @SerializedName("content")
    public String content;
}
