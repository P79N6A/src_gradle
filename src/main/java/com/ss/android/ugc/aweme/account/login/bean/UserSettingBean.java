package com.ss.android.ugc.aweme.account.login.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class UserSettingBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int is_password_set;

    public int getIs_password_set() {
        return this.is_password_set;
    }

    public void setIs_password_set(int i) {
        this.is_password_set = i;
    }
}
