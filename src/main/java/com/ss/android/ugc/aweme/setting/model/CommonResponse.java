package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;

public class CommonResponse {
    @SerializedName("result")
    public boolean result;
    @SerializedName("status_code")
    public int statusCode;
    @SerializedName("status_msg")
    public String statusMsg;
}
