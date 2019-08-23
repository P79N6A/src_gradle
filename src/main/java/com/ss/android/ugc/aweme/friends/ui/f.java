package com.ss.android.ugc.aweme.friends.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49455a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49456b;

    f(FindFriendsFragment findFriendsFragment) {
        this.f49456b = findFriendsFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f49455a, false, 47163, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f49455a, false, 47163, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f49456b.m();
    }
}
