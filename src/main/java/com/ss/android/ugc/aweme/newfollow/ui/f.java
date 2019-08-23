package com.ss.android.ugc.aweme.newfollow.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57304a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendTabFragment f57305b;

    f(FriendTabFragment friendTabFragment) {
        this.f57305b = friendTabFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f57304a, false, 61598, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f57304a, false, 61598, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FriendTabFragment friendTabFragment = this.f57305b;
        if (((n) obj).f57321c) {
            friendTabFragment.f();
        }
    }
}
