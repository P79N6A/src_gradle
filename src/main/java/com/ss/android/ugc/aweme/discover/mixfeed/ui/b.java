package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Pair;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42569a;

    /* renamed from: b  reason: collision with root package name */
    private final SearchMixFeedAdapter f42570b;

    b(SearchMixFeedAdapter searchMixFeedAdapter) {
        this.f42570b = searchMixFeedAdapter;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f42569a, false, 36821, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f42569a, false, 36821, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        SearchMixFeedAdapter searchMixFeedAdapter = this.f42570b;
        Pair pair = (Pair) obj;
        if (pair != null && ((Integer) pair.getFirst()).intValue() == 2) {
            if (PatchProxy.isSupport(new Object[0], searchMixFeedAdapter, SearchMixFeedAdapter.f42566f, false, 36813, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], searchMixFeedAdapter, SearchMixFeedAdapter.f42566f, false, 36813, new Class[0], Void.TYPE);
            } else if (searchMixFeedAdapter.r.c()) {
                searchMixFeedAdapter.h();
            }
        }
    }
}
