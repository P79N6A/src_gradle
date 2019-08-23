package com.ss.android.ugc.aweme.poi.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.poi.adapter.PoiRankBannerPagerAdapter;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59480a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRankBannerPagerAdapter.a f59481b;

    /* renamed from: c  reason: collision with root package name */
    private final PoiClassRankBannerStruct f59482c;

    /* renamed from: d  reason: collision with root package name */
    private final int f59483d;

    d(PoiRankBannerPagerAdapter.a aVar, PoiClassRankBannerStruct poiClassRankBannerStruct, int i) {
        this.f59481b = aVar;
        this.f59482c = poiClassRankBannerStruct;
        this.f59483d = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59480a, false, 64776, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59480a, false, 64776, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiRankBannerPagerAdapter.a aVar = this.f59481b;
        aVar.k.a(aVar.f59439c, this.f59482c, this.f59483d);
    }
}
