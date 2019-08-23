package com.ss.android.ugc.aweme.share.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class ShortenModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String data;
    private String message;
    private String reason;

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReason() {
        return this.reason;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }
}
