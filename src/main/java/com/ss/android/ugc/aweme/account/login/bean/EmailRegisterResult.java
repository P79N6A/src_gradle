package com.ss.android.ugc.aweme.account.login.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class EmailRegisterResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DataBean data;
    private String message;

    @Keep
    public static class DataBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String captcha;
        private String description;
        private int error_code;
        private boolean is_registered;

        public String getCaptcha() {
            return this.captcha;
        }

        public String getDescription() {
            return this.description;
        }

        public int getError_code() {
            return this.error_code;
        }

        public boolean isIs_registered() {
            return this.is_registered;
        }

        public void setCaptcha(String str) {
            this.captcha = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setError_code(int i) {
            this.error_code = i;
        }

        public void setIs_registered(boolean z) {
            this.is_registered = z;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
