package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60086a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRankListActivity f60087b;

    b(PoiRankListActivity poiRankListActivity) {
        this.f60087b = poiRankListActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60086a, false, 65297, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60086a, false, 65297, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f60087b.c();
    }
}
