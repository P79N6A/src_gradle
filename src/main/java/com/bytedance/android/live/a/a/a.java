package com.bytedance.android.live.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int mErrorCode;

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getMessage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 3, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 3, new Class[0], String.class);
        }
        return " TYPE = ApiException, errorCode = " + this.mErrorCode + " " + super.getMessage();
    }

    public a(int i) {
        this.mErrorCode = i;
    }

    public a(int i, Throwable th) {
        super(th);
        this.mErrorCode = i;
    }
}
