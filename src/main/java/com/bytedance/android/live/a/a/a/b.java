package com.bytedance.android.live.a.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b extends a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public b() {
        super(-1);
    }

    public final String getMessage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 5, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 5, new Class[0], String.class);
        }
        return " TYPE = EmptyResponseException " + super.getMessage();
    }
}
