package com.ss.android.ugc.aweme.miniapp.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter;
import com.ss.android.ugc.aweme.miniapp_api.model.f;

public final /* synthetic */ class c implements RecentlyMicroAppListAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55467a;

    /* renamed from: b  reason: collision with root package name */
    private final RecentlyMicroAppListAdapter f55468b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55469c;

    /* renamed from: d  reason: collision with root package name */
    private final f f55470d;

    c(RecentlyMicroAppListAdapter recentlyMicroAppListAdapter, int i, f fVar) {
        this.f55468b = recentlyMicroAppListAdapter;
        this.f55469c = i;
        this.f55470d = fVar;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55467a, false, 59172, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f55467a, false, 59172, new Class[]{String.class}, Void.TYPE);
            return;
        }
        RecentlyMicroAppListAdapter recentlyMicroAppListAdapter = this.f55468b;
        int i = this.f55469c;
        f fVar = this.f55470d;
        if (i != 0) {
            recentlyMicroAppListAdapter.f55454b.remove(i);
            recentlyMicroAppListAdapter.f55454b.add(0, fVar);
            recentlyMicroAppListAdapter.notifyDataSetChanged();
        }
    }
}
