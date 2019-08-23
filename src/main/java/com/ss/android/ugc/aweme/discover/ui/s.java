package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class s implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43192a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43193b;

    s(DiscoverFragment discoverFragment) {
        this.f43193b = discoverFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43192a, false, 37554, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43192a, false, 37554, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f43193b.a((Float) obj);
    }
}
