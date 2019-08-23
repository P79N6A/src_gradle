package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiTypeRecyclerAdapter;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60024a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiTypeRecyclerAdapter.PoiTypeRecyclerViewHolder f60025b;

    /* renamed from: c  reason: collision with root package name */
    private final SimplePoiInfoStruct f60026c;

    e(PoiTypeRecyclerAdapter.PoiTypeRecyclerViewHolder poiTypeRecyclerViewHolder, SimplePoiInfoStruct simplePoiInfoStruct) {
        this.f60025b = poiTypeRecyclerViewHolder;
        this.f60026c = simplePoiInfoStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60024a, false, 65214, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60024a, false, 65214, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiTypeRecyclerAdapter.PoiTypeRecyclerViewHolder poiTypeRecyclerViewHolder = this.f60025b;
        SimplePoiInfoStruct simplePoiInfoStruct = this.f60026c;
        if (poiTypeRecyclerViewHolder.f60006b != null) {
            poiTypeRecyclerViewHolder.f60006b.a(simplePoiInfoStruct);
        }
    }
}
