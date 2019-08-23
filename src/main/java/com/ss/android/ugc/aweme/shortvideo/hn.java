package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;

public class hn extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isRecover;

    public boolean isRecover() {
        return this.isRecover;
    }

    public boolean isCauseByApiServerException() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74858, new Class[0], Boolean.TYPE)) {
            return getCause() instanceof a;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74858, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public hn(Throwable th) {
        super(th);
    }

    public void setRecover(boolean z) {
        this.isRecover = z;
    }
}
