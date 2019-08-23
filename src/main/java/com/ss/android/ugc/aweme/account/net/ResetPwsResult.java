package com.ss.android.ugc.aweme.account.net;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class ResetPwsResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ExtraBean extra;
    private int status_code;
    private String status_msg;

    @Keep
    public static class ExtraBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        private long now;

        public long getNow() {
            return this.now;
        }

        public void setNow(long j) {
            this.now = j;
        }
    }

    public ExtraBean getExtra() {
        return this.extra;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public void setExtra(ExtraBean extraBean) {
        this.extra = extraBean;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
