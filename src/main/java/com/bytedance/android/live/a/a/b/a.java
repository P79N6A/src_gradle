package com.bytedance.android.live.a.a.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a extends com.bytedance.android.live.a.a.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mAlert;
    private String mErrorMsg;
    private String mExtra;
    private String mPrompt;

    public String getAlert() {
        return this.mAlert;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public String getPrompt() {
        return this.mPrompt;
    }

    public String getMessage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 8, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 8, new Class[0], String.class);
        }
        return " TYPE = ApiServerException, errorMsg = " + this.mErrorMsg + " extra = " + this.mExtra + " " + super.getMessage();
    }

    public a(int i) {
        super(i);
    }

    public a setAlert(String str) {
        this.mAlert = str;
        return this;
    }

    public a setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public a setExtra(String str) {
        this.mExtra = str;
        return this;
    }

    public a setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }
}
