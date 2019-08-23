package com.ss.android.ugc.aweme.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.u.d;

public final class am extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75042a;

    /* renamed from: b  reason: collision with root package name */
    public String f75043b;

    /* renamed from: c  reason: collision with root package name */
    public String f75044c;

    public am() {
        super("tag_show");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75042a, false, 58947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75042a, false, 58947, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", this.f75043b, d.a.f75112a);
        a("tag_id", this.f75044c, d.a.f75113b);
        a(PushConstants.CONTENT, "tag", d.a.f75112a);
    }
}
