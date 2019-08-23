package com.ss.android.ugc.aweme.miniapp_api.model;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class c implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String message;

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public c(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
