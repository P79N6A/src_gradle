package com.bytedance.android.livesdk.chatroom.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class DecorationTextAuditResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("audit_nopass_warn")
    private String auditNotPassWarnText;
    @SerializedName("audit_status")
    private int auditStatus;

    public String getAuditNotPassWarnText() {
        return this.auditNotPassWarnText;
    }

    public int getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditNotPassWarnText(String str) {
        this.auditNotPassWarnText = str;
    }

    public void setAuditStatus(int i) {
        this.auditStatus = i;
    }
}
