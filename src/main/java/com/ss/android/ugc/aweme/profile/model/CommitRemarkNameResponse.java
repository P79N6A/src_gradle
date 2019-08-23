package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

public class CommitRemarkNameResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("remark_name")
    public String remarkName;
    @SerializedName("status_code")
    public int statusCode;
    @SerializedName("status_msg")
    public String statusMsg;

    public boolean isOK() {
        if (this.statusCode == 0) {
            return true;
        }
        return false;
    }
}
