package com.ss.android.ugc.aweme.login.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class CaptchaModel {
    @SerializedName("captcha")
    public String captcha;
}
