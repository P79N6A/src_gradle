package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class af extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75021a;

    /* renamed from: b  reason: collision with root package name */
    public String f75022b;

    /* renamed from: c  reason: collision with root package name */
    public String f75023c;

    /* renamed from: d  reason: collision with root package name */
    public String f75024d;
    public String p;
    public String q;

    public af() {
        super("qr_code_scanned");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75021a, false, 58935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75021a, false, 58935, new Class[0], Void.TYPE);
            return;
        }
        a("url_content", this.f75022b, d.a.f75112a);
        a("enter_method", this.f75023c, d.a.f75112a);
        a("landing_page", this.f75024d, d.a.f75112a);
        a("from_user_code", this.p, d.a.f75112a);
        a("qr_code_type", this.q, d.a.f75112a);
    }
}
