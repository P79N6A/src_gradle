package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOptionStruct;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterDetailAdapter;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60017a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiFilterDetailAdapter.PoiFilterDetailViewHolder f60018b;

    /* renamed from: c  reason: collision with root package name */
    private final int f60019c;

    /* renamed from: d  reason: collision with root package name */
    private final PoiOptionStruct f60020d;

    c(PoiFilterDetailAdapter.PoiFilterDetailViewHolder poiFilterDetailViewHolder, int i, PoiOptionStruct poiOptionStruct) {
        this.f60018b = poiFilterDetailViewHolder;
        this.f60019c = i;
        this.f60020d = poiOptionStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60017a, false, 65192, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60017a, false, 65192, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiFilterDetailAdapter.PoiFilterDetailViewHolder poiFilterDetailViewHolder = this.f60018b;
        int i = this.f60019c;
        PoiOptionStruct poiOptionStruct = this.f60020d;
        if (poiFilterDetailViewHolder.f59966b != null) {
            poiFilterDetailViewHolder.f59966b.a(i, poiOptionStruct);
        }
    }
}
