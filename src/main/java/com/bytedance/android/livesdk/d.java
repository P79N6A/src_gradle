package com.bytedance.android.livesdk;

import android.arch.lifecycle.Observer;
import android.support.v4.widget.SwipeRefreshLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13670a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubAutoLightFragment f13671b;

    d(FansClubAutoLightFragment fansClubAutoLightFragment) {
        this.f13671b = fansClubAutoLightFragment;
    }

    public final void onChanged(Object obj) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13670a, false, 2507, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13670a, false, 2507, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.live.core.network.d dVar = (com.bytedance.android.live.core.network.d) obj;
        SwipeRefreshLayout swipeRefreshLayout = this.f13671b.i;
        if (dVar == null || !dVar.a()) {
            z = false;
        }
        swipeRefreshLayout.setRefreshing(z);
    }
}
