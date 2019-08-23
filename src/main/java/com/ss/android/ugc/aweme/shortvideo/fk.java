package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;

public abstract /* synthetic */ class fk {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67749a;

    public static fj a() {
        if (PatchProxy.isSupport(new Object[0], null, f67749a, true, 74627, new Class[0], fj.class)) {
            return (fj) PatchProxy.accessDispatch(new Object[0], null, f67749a, true, 74627, new Class[0], fj.class);
        }
        return a.b() ? new ch() : new ax();
    }
}
