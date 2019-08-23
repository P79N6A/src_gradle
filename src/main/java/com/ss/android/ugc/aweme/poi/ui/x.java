package com.ss.android.ugc.aweme.poi.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.u.ao;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60970a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRouteFragment f60971b;

    /* renamed from: c  reason: collision with root package name */
    private final long f60972c;

    x(PoiRouteFragment poiRouteFragment, long j) {
        this.f60971b = poiRouteFragment;
        this.f60972c = j;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60970a, false, 66153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60970a, false, 66153, new Class[0], Void.TYPE);
            return;
        }
        PoiRouteFragment poiRouteFragment = this.f60971b;
        long j = this.f60972c;
        r.a(poiRouteFragment.getContext(), "stay_time", poiRouteFragment.f60482d, j, 0);
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, poiRouteFragment, PoiRouteFragment.f60479a, false, 66151, new Class[]{Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j)};
            Object[] objArr2 = objArr;
            PoiRouteFragment poiRouteFragment2 = poiRouteFragment;
            PatchProxy.accessDispatch(objArr2, poiRouteFragment2, PoiRouteFragment.f60479a, false, 66151, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        new ao().a(String.valueOf(j)).b(poiRouteFragment.f60482d).f(poiRouteFragment.f60483e).g(poiRouteFragment.f60484f).e("map").h(poiRouteFragment.f60481c).a(poiRouteFragment.f60480b).e();
    }
}
