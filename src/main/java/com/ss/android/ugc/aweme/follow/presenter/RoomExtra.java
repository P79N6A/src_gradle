package com.ss.android.ugc.aweme.follow.presenter;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class RoomExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("config")
    public RoomConfig config;
    @SerializedName("with_promotion")
    public boolean withPromotion;

    public RoomConfig getConfig() {
        return this.config;
    }

    public void setConfig(RoomConfig roomConfig) {
        this.config = roomConfig;
    }
}
