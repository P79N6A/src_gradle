package com.ss.android.ugc.aweme.poi.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60974a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRoutePresenter f60975b;

    z(PoiRoutePresenter poiRoutePresenter) {
        this.f60975b = poiRoutePresenter;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60974a, false, 66182, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60974a, false, 66182, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiRoutePresenter poiRoutePresenter = this.f60975b;
        if (poiRoutePresenter.h() != null) {
            poiRoutePresenter.h().a();
        }
    }
}
