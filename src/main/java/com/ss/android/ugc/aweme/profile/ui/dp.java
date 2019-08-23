package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.dm;

public final /* synthetic */ class dp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62678a;

    /* renamed from: b  reason: collision with root package name */
    private final dm.AnonymousClass4 f62679b;

    dp(dm.AnonymousClass4 r1) {
        this.f62679b = r1;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62678a, false, 69001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62678a, false, 69001, new Class[0], Void.TYPE);
            return;
        }
        dm.this.dismiss();
    }
}
