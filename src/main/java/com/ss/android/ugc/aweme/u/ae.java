package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class ae extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75017a;

    /* renamed from: b  reason: collision with root package name */
    private String f75018b;

    /* renamed from: c  reason: collision with root package name */
    private String f75019c;

    /* renamed from: d  reason: collision with root package name */
    private String f75020d;
    private String p;

    public ae() {
        super("qr_code_save");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75017a, false, 58934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75017a, false, 58934, new Class[0], Void.TYPE);
            return;
        }
        a("previous_page", this.f75018b, d.a.f75112a);
        a("platform", this.f75019c, d.a.f75112a);
        a("qr_code_type", this.f75020d, d.a.f75112a);
        a("enter_method", this.p, d.a.f75112a);
    }

    public final ae a(String str) {
        this.f75018b = str;
        return this;
    }

    public final ae b(String str) {
        this.f75019c = str;
        return this;
    }

    public final ae c(String str) {
        this.f75020d = str;
        return this;
    }

    public final ae e(String str) {
        this.p = str;
        return this;
    }
}
