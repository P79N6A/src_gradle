package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.a;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.commercialize.loft.model.l;
import com.ss.android.ugc.aweme.discover.adapter.CategoryListAdapter;
import com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43194a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43195b;

    /* renamed from: c  reason: collision with root package name */
    private final a f43196c;

    t(DiscoverFragment discoverFragment, a aVar) {
        this.f43195b = discoverFragment;
        this.f43196c = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43194a, false, 37555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43194a, false, 37555, new Class[0], Void.TYPE);
            return;
        }
        DiscoverFragment discoverFragment = this.f43195b;
        a aVar = this.f43196c;
        if (!(discoverFragment.mListView == null || discoverFragment.mListView.getAdapter() == null)) {
            CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) discoverFragment.mListView.getAdapter()).f42115f;
            if (!((e) e.m.a(discoverFragment.getContext())).b() || aVar == null || aVar.getGuide() == null) {
                categoryListAdapter.a(null, discoverFragment.getActivity());
            } else {
                categoryListAdapter.a(new l(aVar.getGuide().getImageUrl(), aVar.getGuide().getDesc(), discoverFragment.f42867e.getTotalConsume(), (float) discoverFragment.f42867e.getHeight()), discoverFragment.getActivity());
            }
        }
    }
}
