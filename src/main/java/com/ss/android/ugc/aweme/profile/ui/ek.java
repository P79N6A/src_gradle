package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ek implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62740a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileFragment f62741b;

    ek(UserProfileFragment userProfileFragment) {
        this.f62741b = userProfileFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62740a, false, 69252, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62740a, false, 69252, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62741b.l();
    }
}
