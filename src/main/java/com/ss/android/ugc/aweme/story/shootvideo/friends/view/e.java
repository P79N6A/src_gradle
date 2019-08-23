package com.ss.android.ugc.aweme.story.shootvideo.friends.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public final /* synthetic */ class e implements LoadMoreRecyclerViewAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73611a;

    /* renamed from: b  reason: collision with root package name */
    private final d f73612b;

    e(d dVar) {
        this.f73612b = dVar;
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f73611a, false, 85373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73611a, false, 85373, new Class[0], Void.TYPE);
            return;
        }
        this.f73612b.m();
    }
}
