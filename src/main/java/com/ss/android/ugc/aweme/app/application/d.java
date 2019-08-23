package com.ss.android.ugc.aweme.app.application;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.base.sharedpref.f;
import com.ss.android.ugc.aweme.feed.y;

public final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33936a;

    /* renamed from: b  reason: collision with root package name */
    static final a f33937b = new d();

    private d() {
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33936a, false, 23214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33936a, false, 23214, new Class[0], Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, y.f47065a, true, 40065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, y.f47065a, true, 40065, new Class[0], Void.TYPE);
        } else {
            f d2 = e.d();
            d2.b("cold_start_times", d2.a("cold_start_times", 0) + 1);
        }
    }
}
