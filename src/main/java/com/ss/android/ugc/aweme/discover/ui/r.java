package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public final /* synthetic */ class r implements SwipeRefreshLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43190a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43191b;

    r(DiscoverFragment discoverFragment) {
        this.f43191b = discoverFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43190a, false, 37553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43190a, false, 37553, new Class[0], Void.TYPE);
            return;
        }
        DiscoverFragment discoverFragment = this.f43191b;
        if (!NetworkUtils.isNetworkAvailable(discoverFragment.getContext())) {
            a.b(discoverFragment.getContext(), (int) C0906R.string.bgf).a();
            discoverFragment.mRefreshLayout.setRefreshing(false);
            return;
        }
        discoverFragment.d();
    }
}
