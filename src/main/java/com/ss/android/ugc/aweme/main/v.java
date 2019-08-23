package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public final /* synthetic */ class v implements SwipeRefreshLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54998a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f54999b;

    v(MainFragment mainFragment) {
        this.f54999b = mainFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54998a, false, 57324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54998a, false, 57324, new Class[0], Void.TYPE);
            return;
        }
        this.f54999b.a(7, "");
    }
}
