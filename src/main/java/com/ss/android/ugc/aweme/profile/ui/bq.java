package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62544a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62545b;

    bq(MyProfileFragment myProfileFragment) {
        this.f62545b = myProfileFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62544a, false, 68584, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62544a, false, 68584, new Class[0], Void.TYPE);
            return;
        }
        this.f62545b.X.b();
    }
}
