package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class o extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75138a;

    /* renamed from: b  reason: collision with root package name */
    private String f75139b;

    public o() {
        super("enter_page");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75138a, false, 58867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75138a, false, 58867, new Class[0], Void.TYPE);
            return;
        }
        a("page", this.f75139b, d.a.f75112a);
    }

    public final o a(String str) {
        this.f75139b = str;
        return this;
    }
}
