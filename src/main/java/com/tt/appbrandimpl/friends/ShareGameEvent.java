package com.tt.appbrandimpl.friends;

import com.meituan.robust.ChangeQuickRedirect;

public class ShareGameEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isSuccess;

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public ShareGameEvent(boolean z) {
        this.isSuccess = z;
    }
}
