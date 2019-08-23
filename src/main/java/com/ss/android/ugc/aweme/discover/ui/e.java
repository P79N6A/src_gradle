package com.ss.android.ugc.aweme.discover.ui;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43160a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverDetailPageFragment f43161b;

    e(DiscoverDetailPageFragment discoverDetailPageFragment) {
        this.f43161b = discoverDetailPageFragment;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f43160a, false, 37451, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f43160a, false, 37451, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f43160a, false, 37450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43160a, false, 37450, new Class[0], Void.TYPE);
            return;
        }
        DiscoverDetailPageFragment discoverDetailPageFragment = this.f43161b;
        if (d.a().isLogin()) {
            User c2 = discoverDetailPageFragment.c();
            if (c2 != null) {
                if (c2.getFollowStatus() == 1) {
                    z = true;
                }
                discoverDetailPageFragment.mDiscoverShootView.a(c2, z);
            }
        }
    }
}
