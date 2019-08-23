package com.ss.android.ugc.aweme.base.mvvm.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.c;
import com.ss.android.ugc.aweme.base.mvvm.e;

public class b<T extends c> implements e<T> {
    public static ChangeQuickRedirect h;

    public final T a() {
        return null;
    }

    public final void a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, h, false, 24672, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, h, false, 24672, new Class[]{c.class}, Void.TYPE);
            return;
        }
        throw new IllegalArgumentException();
    }
}
