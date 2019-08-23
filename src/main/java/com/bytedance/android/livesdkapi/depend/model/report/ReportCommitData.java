package com.bytedance.android.livesdkapi.depend.model.report;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class ReportCommitData {
    @SerializedName("desc")
    public String desc;
    @SerializedName("record_id")
    public long recordId;
    @SerializedName("report_id")
    public long reportId;
    @SerializedName("status")
    public long status;
}
