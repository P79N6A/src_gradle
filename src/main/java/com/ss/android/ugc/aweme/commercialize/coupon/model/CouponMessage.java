package com.ss.android.ugc.aweme.commercialize.coupon.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class CouponMessage {
    @SerializedName("code_id")
    public String codeId;
    @SerializedName("msg_type")
    public int msgType;
}
