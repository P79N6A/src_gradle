package com.ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.adapter.PoiTypeEntranceAdapter;
import com.ss.android.ugc.aweme.feed.model.poi.PoiVerticalEntranceStruct;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44972a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiTypeEntranceAdapter.PoiTypeViewHolder f44973b;

    /* renamed from: c  reason: collision with root package name */
    private final PoiVerticalEntranceStruct f44974c;

    y(PoiTypeEntranceAdapter.PoiTypeViewHolder poiTypeViewHolder, PoiVerticalEntranceStruct poiVerticalEntranceStruct) {
        this.f44973b = poiTypeViewHolder;
        this.f44974c = poiVerticalEntranceStruct;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44972a, false, 40609, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44972a, false, 40609, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiTypeEntranceAdapter.PoiTypeViewHolder poiTypeViewHolder = this.f44973b;
        PoiVerticalEntranceStruct poiVerticalEntranceStruct = this.f44974c;
        if (poiTypeViewHolder.f44762b != null) {
            poiTypeViewHolder.f44762b.a(poiVerticalEntranceStruct);
        }
    }
}
