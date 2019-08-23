package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class BindModel extends BaseResponse {
    @SerializedName("weibo_name")
    public String weiboName;
}
