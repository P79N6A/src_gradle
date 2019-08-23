package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2;

public final /* synthetic */ class ab implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43099a;

    /* renamed from: b  reason: collision with root package name */
    private final HotSearchAndDiscoveryFragment2.AnonymousClass5 f43100b;

    ab(HotSearchAndDiscoveryFragment2.AnonymousClass5 r1) {
        this.f43100b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43099a, false, 37661, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43099a, false, 37661, new Class[0], Void.TYPE);
            return;
        }
        HotSearchAndDiscoveryFragment2.this.mTopStatus.setVisibility(0);
    }
}
