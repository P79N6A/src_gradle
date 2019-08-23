package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.u.d;

public final class ac extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75011a;

    /* renamed from: b  reason: collision with root package name */
    public String f75012b;

    /* renamed from: c  reason: collision with root package name */
    public String f75013c;

    public ac() {
        super("client_show");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75011a, false, 58931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75011a, false, 58931, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.f75012b, d.a.f75112a);
        a(PushConstants.CONTENT, this.f75013c, d.a.f75112a);
    }
}
