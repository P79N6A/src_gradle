package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.ao;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55007a;

    /* renamed from: b  reason: collision with root package name */
    private final MainFragment f55008b;

    /* renamed from: c  reason: collision with root package name */
    private final ao f55009c;

    z(MainFragment mainFragment, ao aoVar) {
        this.f55008b = mainFragment;
        this.f55009c = aoVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55007a, false, 57328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55007a, false, 57328, new Class[0], Void.TYPE);
            return;
        }
        MainFragment mainFragment = this.f55008b;
        mainFragment.k = this.f55009c.f45290a;
        mainFragment.k();
    }
}
