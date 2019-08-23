package com.ss.android.ugc.aweme.report.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class ReportFeedback {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("audit_type")
    private int auditType;
    @SerializedName("reason_type")
    private int reasonType;
    @SerializedName("text")
    private String text;

    public int getAuditType() {
        return this.auditType;
    }

    public int getReasonType() {
        return this.reasonType;
    }

    public String getText() {
        return this.text;
    }

    public void setAuditType(int i) {
        this.auditType = i;
    }

    public void setReasonType(int i) {
        this.reasonType = i;
    }

    public void setText(String str) {
        this.text = str;
    }
}
