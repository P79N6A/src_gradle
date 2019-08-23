package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class ed implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62726a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileFragment f62727b;

    ed(UserProfileFragment userProfileFragment) {
        this.f62727b = userProfileFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62726a, false, 69245, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62726a, false, 69245, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f62727b.m((User) obj);
    }
}
