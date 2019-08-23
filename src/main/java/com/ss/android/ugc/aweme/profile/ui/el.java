package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class el implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62742a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileFragment f62743b;

    el(UserProfileFragment userProfileFragment) {
        this.f62743b = userProfileFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62742a, false, 69253, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62742a, false, 69253, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        UserProfileFragment userProfileFragment = this.f62743b;
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            com.ss.android.ugc.aweme.app.api.a.a.a(userProfileFragment.getContext(), (a) th);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
