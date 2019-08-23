package com.bytedance.android.livesdk.rank.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.user.User;
import com.google.gson.annotations.SerializedName;

@Keep
public class PeriodRankExtra extends Extra {
    @SerializedName("gap_description")
    public String gapDescription;
    @SerializedName("self_info")
    public User mUser;
    @SerializedName("self_rank")
    public int selfRank;
    @SerializedName("self_score")
    public long selfScore;
}
