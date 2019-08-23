package com.bytedance.android.livesdkapi.depend.model.report;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class ReportReason {
    @SerializedName("reason")
    public long reasonId;
    @SerializedName("reason_str")
    public String reasonStr;
}
