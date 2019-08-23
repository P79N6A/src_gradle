package com.ss.android.ugc.aweme.utils;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bx implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75646a;

    /* renamed from: b  reason: collision with root package name */
    static final g f75647b = new bx();

    private bx() {
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f75646a, false, 88341, new Class[]{i.class}, Object.class)) {
            return bs.a(iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f75646a, false, 88341, new Class[]{i.class}, Object.class);
    }
}
