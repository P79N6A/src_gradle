package com.bytedance.android.live.core.model.startlive;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.Extra;
import com.google.gson.annotations.SerializedName;

@Keep
public class StartLiveExtra extends Extra {
    @SerializedName("is_phone_binded")
    public boolean isPhoneBinded;
    @SerializedName("live_agreement")
    public boolean liveAgreement;
    @SerializedName("live_answer")
    public boolean liveAnswer;
    @SerializedName("realname_verify")
    public int realnameVerify;
}
