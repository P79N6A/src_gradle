package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Keep
public class HonorStruct implements Serializable {
    @SerializedName("honor_level")
    public int level;
    @SerializedName("honor_score")
    public long score;
}
