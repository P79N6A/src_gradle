package com.ss.android.ugc.aweme.setting.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class MLModel {
    @SerializedName("package")
    public String packageUrl;
    @SerializedName("params")
    public int[] params;
    @SerializedName("scene")
    public String scene;
    @SerializedName("type")
    public int type;
}
