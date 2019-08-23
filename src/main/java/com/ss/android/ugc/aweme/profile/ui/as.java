package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class as implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62482a;

    /* renamed from: b  reason: collision with root package name */
    private final MusMyProfileFragment f62483b;

    as(MusMyProfileFragment musMyProfileFragment) {
        this.f62483b = musMyProfileFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62482a, false, 68327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62482a, false, 68327, new Class[0], Void.TYPE);
            return;
        }
        this.f62483b.I();
    }
}
