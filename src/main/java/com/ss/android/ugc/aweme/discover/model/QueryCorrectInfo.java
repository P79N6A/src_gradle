package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class QueryCorrectInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    static final long serialVersionUID = 1;
    @SerializedName("corrected_query")
    String correctedKeyword;
    @SerializedName("correct_level")
    int correctedLevel;
    private String requestId;

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i) {
        this.correctedLevel = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
