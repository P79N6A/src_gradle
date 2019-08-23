package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;

public final /* synthetic */ class o implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43184a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43185b;

    o(DiscoverFragment discoverFragment) {
        this.f43185b = discoverFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43184a, false, 37550, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43184a, false, 37550, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f43185b.a((b) obj);
    }
}
