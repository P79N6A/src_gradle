package com.ss.android.ugc.aweme.base.api.a;

import com.meituan.robust.ChangeQuickRedirect;

public class a extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public a(int i) {
        super("error_code = " + i);
        this.mErrorCode = i;
    }

    public a(int i, Throwable th) {
        super("error_code = " + i, th);
        this.mErrorCode = i;
    }
}
