package com.bytedance.android.livesdk.verify.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class ZhimaPollingResponse {
    @SerializedName("is_verified")
    public boolean isVerified;
}
