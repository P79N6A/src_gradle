package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.u.d;

public final class f extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75118a;

    public f() {
        super("change_password");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75118a, false, 58841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75118a, false, 58841, new Class[0], Void.TYPE);
            return;
        }
        a("previous_page", "password_setting", d.a.f75112a);
        a("enter_method", "click_button", d.a.f75112a);
    }
}
