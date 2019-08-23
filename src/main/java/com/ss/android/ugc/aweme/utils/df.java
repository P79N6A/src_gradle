package com.ss.android.ugc.aweme.utils;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;

public final class df {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75743a;

    public static RecyclerView a(RecyclerView recyclerView, m mVar) {
        RecyclerView recyclerView2 = recyclerView;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, mVar2}, null, f75743a, true, 88505, new Class[]{RecyclerView.class, m.class}, RecyclerView.class)) {
            return (RecyclerView) PatchProxy.accessDispatch(new Object[]{recyclerView2, mVar2}, null, f75743a, true, 88505, new Class[]{RecyclerView.class, m.class}, RecyclerView.class);
        }
        recyclerView2.addOnScrollListener(new FrescoRecycleViewScrollListener(k.h()));
        recyclerView2.setOnFlingListener(new OnRecyclerViewFlingListener(recyclerView2, mVar2));
        return recyclerView2;
    }
}
