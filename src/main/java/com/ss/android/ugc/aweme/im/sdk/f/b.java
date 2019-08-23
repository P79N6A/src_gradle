package com.ss.android.ugc.aweme.im.sdk.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.f.a;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f51446d;

    public b() {
        super("phone_bundling_click");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51446d, false, 52358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51446d, false, 52358, new Class[0], Void.TYPE);
            return;
        }
        a("enter_from", "chat", a.C0601a.f51442a);
    }
}
