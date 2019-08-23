package com.ss.android.ugc.aweme.discover.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class x extends k<w> {
    public static ChangeQuickRedirect h;

    public x() {
        a(new w());
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 37331, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, h, false, 37331, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f2978e != null && ((w) this.f2978e).isHasMore()) {
            z = true;
        }
        return z;
    }
}
