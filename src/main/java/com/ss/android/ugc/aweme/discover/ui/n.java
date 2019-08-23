package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper;

public final /* synthetic */ class n implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43182a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43183b;

    n(DiscoverFragment discoverFragment) {
        this.f43183b = discoverFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43182a, false, 37549, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43182a, false, 37549, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LoadMoreAdapterWrapper loadMoreAdapterWrapper = (LoadMoreAdapterWrapper) this.f43183b.mListView.getAdapter();
        if (!((Boolean) obj).booleanValue()) {
            loadMoreAdapterWrapper.b(3);
        }
    }
}
