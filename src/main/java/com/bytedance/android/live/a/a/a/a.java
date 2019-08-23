package com.bytedance.android.live.a.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a extends com.bytedance.android.live.a.a.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getMessage() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 4, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 4, new Class[0], String.class);
        }
        return " TYPE = ApiLocalException " + super.getMessage();
    }

    public a(int i) {
        super(i);
    }

    public a(int i, Throwable th) {
        super(i, th);
    }
}
