package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassFilterOptionStruct;
import com.ss.android.ugc.aweme.poi.nearby.adapter.PoiFilterAdapter;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60013a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiFilterAdapter.PoiFilterViewHolder f60014b;

    /* renamed from: c  reason: collision with root package name */
    private final PoiClassFilterOptionStruct f60015c;

    /* renamed from: d  reason: collision with root package name */
    private final int f60016d;

    b(PoiFilterAdapter.PoiFilterViewHolder poiFilterViewHolder, PoiClassFilterOptionStruct poiClassFilterOptionStruct, int i) {
        this.f60014b = poiFilterViewHolder;
        this.f60015c = poiClassFilterOptionStruct;
        this.f60016d = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60013a, false, 65186, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60013a, false, 65186, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiFilterAdapter.PoiFilterViewHolder poiFilterViewHolder = this.f60014b;
        PoiClassFilterOptionStruct poiClassFilterOptionStruct = this.f60015c;
        int i = this.f60016d;
        poiFilterViewHolder.f59960d.setTextColor(poiFilterViewHolder.f59958b.getContext().getResources().getColor(C0906R.color.a6i));
        poiFilterViewHolder.f59961e.setImageResource(2130839200);
        if (poiFilterViewHolder.f59959c != null) {
            poiFilterViewHolder.f59959c.a(poiClassFilterOptionStruct, i);
        }
    }
}
