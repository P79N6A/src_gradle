package com.ss.android.ugc.aweme.account.login.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class SetPasswordResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DataBean data;
    private String message;

    @Keep
    public static class DataBean {
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
