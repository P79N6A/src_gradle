package com.ss.android.ugc.aweme.setting.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class SettingUserHasSetPwd {
    @SerializedName("data")
    public Data data;
    @SerializedName("message")
    public String message;

    public static class Data {
        @SerializedName("captcha")
        public String captcha;
        @SerializedName("description")
        public String description;
        @SerializedName("error_code")
        public int errorCode;
        @SerializedName("has_set")
        public boolean hasSet;
    }
}
