package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.commercialize.log.aa;
import java.io.Serializable;

public class p implements aa.a, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("creative_id")
    public long creativeId;
    @SerializedName("log_extra")
    public String logExtra;

    public long getCreativeId() {
        return this.creativeId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }
}
