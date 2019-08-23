package com.ss.android.ugc.aweme.message.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class NoticeCount {
    @SerializedName("count")
    public int count;
    @SerializedName("extra")
    public NoticeCountExtra extra;
    @SerializedName("group")
    public int group;
}
