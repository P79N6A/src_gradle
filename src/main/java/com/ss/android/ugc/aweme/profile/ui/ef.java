package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ef implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62730a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileFragment f62731b;

    ef(UserProfileFragment userProfileFragment) {
        this.f62731b = userProfileFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62730a, false, 69247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62730a, false, 69247, new Class[0], Void.TYPE);
            return;
        }
        UserProfileFragment userProfileFragment = this.f62731b;
        userProfileFragment.W.b();
        userProfileFragment.W = null;
    }
}
