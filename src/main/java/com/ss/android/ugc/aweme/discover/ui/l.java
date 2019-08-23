package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.a;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43177a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43178b;

    /* renamed from: c  reason: collision with root package name */
    private final a f43179c;

    l(DiscoverFragment discoverFragment, a aVar) {
        this.f43178b = discoverFragment;
        this.f43179c = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43177a, false, 37547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43177a, false, 37547, new Class[0], Void.TYPE);
            return;
        }
        this.f43178b.a(this.f43179c, true);
    }
}
