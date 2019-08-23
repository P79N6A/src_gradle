package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class WalletNotice {
    @SerializedName("content")
    public String content;
    @SerializedName("title")
    public String title;
}
