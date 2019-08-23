package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class au implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62488a;

    /* renamed from: b  reason: collision with root package name */
    private final MusMyProfileFragment f62489b;

    au(MusMyProfileFragment musMyProfileFragment) {
        this.f62489b = musMyProfileFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62488a, false, 68350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62488a, false, 68350, new Class[0], Void.TYPE);
            return;
        }
        this.f62489b.az.b();
    }
}
