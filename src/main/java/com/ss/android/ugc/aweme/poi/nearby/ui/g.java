package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60096a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiTypeFilterDetailActivity f60097b;

    g(PoiTypeFilterDetailActivity poiTypeFilterDetailActivity) {
        this.f60097b = poiTypeFilterDetailActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60096a, false, 65354, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60096a, false, 65354, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f60097b.onRefresh();
    }
}
