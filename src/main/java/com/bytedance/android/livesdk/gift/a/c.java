package com.bytedance.android.livesdk.gift.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.b.a.c.a;

public final class c extends a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.ss.ugc.live.b.a.b.a mDownloadRequest;
    private int mErrorCode;

    public final int getErrorCode() {
        return this.mErrorCode;
    }

    public final String getMessage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 9388, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 9388, new Class[0], String.class);
        }
        return this.mDownloadRequest.toString() + "\n" + super.getMessage();
    }

    public c(String str, Throwable th, com.ss.ugc.live.b.a.c cVar, int i, com.ss.ugc.live.b.a.b.a aVar) {
        super(str, th, cVar);
        this.mErrorCode = i;
        this.mDownloadRequest = aVar;
    }
}
