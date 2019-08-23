package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiTypeDetailAdapter;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60021a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiTypeDetailAdapter.PoiTypeDetailViewHolder f60022b;

    /* renamed from: c  reason: collision with root package name */
    private final PoiTypeDetailAdapter.a f60023c;

    d(PoiTypeDetailAdapter.PoiTypeDetailViewHolder poiTypeDetailViewHolder, PoiTypeDetailAdapter.a aVar) {
        this.f60022b = poiTypeDetailViewHolder;
        this.f60023c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60021a, false, 65205, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60021a, false, 65205, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiTypeDetailAdapter.PoiTypeDetailViewHolder poiTypeDetailViewHolder = this.f60022b;
        PoiTypeDetailAdapter.a aVar = this.f60023c;
        if (aVar != null) {
            aVar.a(poiTypeDetailViewHolder.g, poiTypeDetailViewHolder.f59998f);
        }
    }
}
