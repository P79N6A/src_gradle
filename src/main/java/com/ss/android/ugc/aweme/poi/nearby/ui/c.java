package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60088a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRankListActivity f60089b;

    c(PoiRankListActivity poiRankListActivity) {
        this.f60089b = poiRankListActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60088a, false, 65298, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60088a, false, 65298, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f60089b.c();
    }
}
