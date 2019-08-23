package com.ss.android.ugc.aweme.newfollow.f;

import a.g;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.vh.n;

public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57147a;

    /* renamed from: b  reason: collision with root package name */
    private final g f57148b;

    i(g gVar) {
        this.f57148b = gVar;
    }

    public final Object then(a.i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f57147a, false, 61311, new Class[]{a.i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f57147a, false, 61311, new Class[]{a.i.class}, Object.class);
        }
        g gVar = this.f57148b;
        if (iVar.b()) {
            gVar.f57136e = (Bitmap) iVar.e();
            if (!(gVar.f57135d == null || gVar.f57136e == null)) {
                n nVar = gVar.f57135d;
                Bitmap bitmap = gVar.f57136e;
                if (PatchProxy.isSupport(new Object[]{bitmap}, nVar, n.f57731a, false, 62256, new Class[]{Bitmap.class}, Void.TYPE)) {
                    n nVar2 = nVar;
                    PatchProxy.accessDispatch(new Object[]{bitmap}, nVar2, n.f57731a, false, 62256, new Class[]{Bitmap.class}, Void.TYPE);
                } else if (bitmap != null && !bitmap.isRecycled() && nVar.mRecyclerView != null && nVar.mRecyclerView.getScrollState() == 0 && !nVar.mRecyclerView.isComputingLayout()) {
                    FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) nVar.j;
                    if (PatchProxy.isSupport(new Object[]{bitmap}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61086, new Class[]{Bitmap.class}, Void.TYPE)) {
                        FollowFeedAdapter followFeedAdapter2 = followFeedAdapter;
                        PatchProxy.accessDispatch(new Object[]{bitmap}, followFeedAdapter2, FollowFeedAdapter.f57068f, false, 61086, new Class[]{Bitmap.class}, Void.TYPE);
                    } else if (!(followFeedAdapter.mItems == null || followFeedAdapter.I == null || !followFeedAdapter.mItems.contains(followFeedAdapter.I))) {
                        int indexOf = followFeedAdapter.mItems.indexOf(followFeedAdapter.I);
                        followFeedAdapter.I.a(bitmap);
                        followFeedAdapter.notifyItemChanged(indexOf);
                    }
                }
            }
            gVar.f57137f = false;
        }
        return null;
    }
}
