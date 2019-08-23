package com.bytedance.android.live.core.rxutils.autodispose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ac extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final synchronized Throwable fillInStackTrace() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 814, new Class[0], Throwable.class)) {
            return (Throwable) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 814, new Class[0], Throwable.class);
        } else if (!q.f8066a) {
            return this;
        } else {
            return super.fillInStackTrace();
        }
    }

    public ac(String str) {
        super(str);
    }
}
