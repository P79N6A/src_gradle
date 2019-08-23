package com.bytedance.android.live.base.model.media;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class MediaDebugInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("info")
    private String info;

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String str) {
        this.info = str;
    }
}
