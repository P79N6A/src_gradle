package com.bytedance.android.livesdk;

import android.support.v4.widget.SwipeRefreshLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class FansClubAutoLightFragment$$Lambda$0 implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8743a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubAutoLightFragment f8744b;

    FansClubAutoLightFragment$$Lambda$0(FansClubAutoLightFragment fansClubAutoLightFragment) {
        this.f8744b = fansClubAutoLightFragment;
    }

    public final void onRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, f8743a, false, 2504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8743a, false, 2504, new Class[0], Void.TYPE);
            return;
        }
        FansClubAutoLightFragment fansClubAutoLightFragment = this.f8744b;
        if (fansClubAutoLightFragment.f8742c != null) {
            fansClubAutoLightFragment.f8742c.a();
        }
    }
}
