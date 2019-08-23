package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.bytedance.android.live.base.model.Extra;
import com.google.gson.annotations.SerializedName;

@Keep
public class EnterRoomExtra extends Extra {
    @SerializedName("digg_color")
    public int diggColor;
    @SerializedName("pay_scores")
    public long payScores = -1;
}
