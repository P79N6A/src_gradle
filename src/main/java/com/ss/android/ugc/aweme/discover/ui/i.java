package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper;

public final /* synthetic */ class i implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43170a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43171b;

    i(DiscoverFragment discoverFragment) {
        this.f43171b = discoverFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43170a, false, 37543, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43170a, false, 37543, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        DiscoverFragment discoverFragment = this.f43171b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, discoverFragment, DiscoverFragment.f42863a, false, 37535, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            DiscoverFragment discoverFragment2 = discoverFragment;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, discoverFragment2, DiscoverFragment.f42863a, false, 37535, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        LoadMoreAdapterWrapper loadMoreAdapterWrapper = (LoadMoreAdapterWrapper) discoverFragment.mListView.getAdapter();
        if (booleanValue) {
            loadMoreAdapterWrapper.b(1);
        } else {
            loadMoreAdapterWrapper.b(2);
        }
    }
}
