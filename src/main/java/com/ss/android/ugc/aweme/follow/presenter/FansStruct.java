package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class FansStruct extends BaseResponse {
    @SerializedName("fans_level")
    public int fansLevel;
    @SerializedName("fans_name")
    public String fansName;
    @SerializedName("is_fan")
    public boolean isFans;
    @SerializedName("light_up")
    public boolean isLightUp;
}
