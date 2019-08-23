package com.ss.android.ugc.aweme.forward.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.forward.b.c;
import com.ss.android.ugc.aweme.newfollow.util.l;

public class j extends b {
    public static ChangeQuickRedirect l;

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45441, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        k();
    }

    public j(c.b bVar, l lVar) {
        super(bVar, lVar);
    }
}
