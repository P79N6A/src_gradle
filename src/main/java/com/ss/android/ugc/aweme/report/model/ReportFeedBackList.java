package com.ss.android.ugc.aweme.report.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

@Keep
public class ReportFeedBackList {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    List<ReportFeedback> data;

    public List<ReportFeedback> getData() {
        return this.data;
    }

    public void setData(List<ReportFeedback> list) {
        this.data = list;
    }
}
