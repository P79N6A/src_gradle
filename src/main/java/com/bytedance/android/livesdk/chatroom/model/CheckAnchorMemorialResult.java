package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class CheckAnchorMemorialResult {
    @SerializedName("interval")
    public int interval;
    @SerializedName("is_memorial")
    public boolean isMemorial;
}
