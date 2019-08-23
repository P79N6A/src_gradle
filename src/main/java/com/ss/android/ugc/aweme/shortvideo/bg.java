package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;

public abstract /* synthetic */ class bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65793a;

    public static bf a() {
        if (PatchProxy.isSupport(new Object[0], null, f65793a, true, 74089, new Class[0], bf.class)) {
            return (bf) PatchProxy.accessDispatch(new Object[0], null, f65793a, true, 74089, new Class[0], bf.class);
        }
        return a.b() ? new ci() : new ay();
    }
}
