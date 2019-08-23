package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59688a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiOptimizedDetailViewHolder f59689b;

    j(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f59689b = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59688a, false, 64880, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59688a, false, 64880, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f59689b.d();
    }
}
