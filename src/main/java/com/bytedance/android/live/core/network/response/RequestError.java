package com.bytedance.android.live.core.network.response;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.google.gson.annotations.SerializedName;

@Keep
public class RequestError {
    @SerializedName("alert")
    public String alert;
    @SerializedName("message")
    public String message;
    @SerializedName("prompts")
    public String prompts = "操作失败, 请稍后重试";
    @IgnoreStyleCheck
    public transient String url;
}
