package com.ss.android.ugc.aweme.base.api;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;

@Keep
public class BaseResponse extends c {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int error_code;
    public ServerTimeExtra extra;
    public String message;
    public String prompts;
    public int status_code;
    public String status_msg;

    @Keep
    public static class ServerTimeExtra {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String logid;
        public long now;

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24134, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24134, new Class[0], String.class);
            }
            return "{now=" + this.now + ", logid='" + this.logid + '\'' + '}';
        }
    }

    private void checkStatusCode() throws a {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24133, new Class[0], Void.TYPE);
        } else if (this.status_code != 0) {
            throw new a(this.status_code).setErrorMsg(this.status_msg).setPrompt(this.prompts).setResponse((Object) this);
        }
    }

    public <T> T checkValid() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24132, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24132, new Class[0], Object.class);
        }
        checkStatusCode();
        super.checkValid();
        return this;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24131, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24131, new Class[0], String.class);
        }
        return "BaseResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + ", status_msg='" + this.status_msg + '\'' + ", prompts='" + this.prompts + '\'' + ", extra=" + this.extra + '}';
    }
}
