package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class ad extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75014a;

    /* renamed from: b  reason: collision with root package name */
    public String f75015b;

    /* renamed from: c  reason: collision with root package name */
    public String f75016c;

    public ad() {
        super("qr_code_generate");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75014a, false, 58933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75014a, false, 58933, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.f75015b, d.a.f75112a);
        a("qr_code_type", this.f75016c, d.a.f75112a);
    }
}
