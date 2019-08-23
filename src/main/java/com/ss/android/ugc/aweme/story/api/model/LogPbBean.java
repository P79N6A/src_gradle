package com.ss.android.ugc.aweme.story.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class LogPbBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("impr_id")
    private String imprId;

    public String getImprId() {
        return this.imprId;
    }

    public void setImprId(String str) {
        this.imprId = str;
    }
}
