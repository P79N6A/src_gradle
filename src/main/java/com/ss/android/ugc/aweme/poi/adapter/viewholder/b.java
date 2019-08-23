package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.am;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59658a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiDcdProductInfoViewHolder f59659b;

    /* renamed from: c  reason: collision with root package name */
    private final am f59660c;

    /* renamed from: d  reason: collision with root package name */
    private final c f59661d;

    public b(PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder, am amVar, c cVar) {
        this.f59659b = poiDcdProductInfoViewHolder;
        this.f59660c = amVar;
        this.f59661d = cVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59658a, false, 64823, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59658a, false, 64823, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder = this.f59659b;
        am amVar = this.f59660c;
        c cVar = this.f59661d;
        if (!TextUtils.isEmpty(amVar.url)) {
            h.a(cVar, "project_click_more", d.a().a("enter_from", "poi_page").a("poi_id", poiDcdProductInfoViewHolder.f59550d.poiId).a("content_type", poiDcdProductInfoViewHolder.f59550d.getSpSource()));
            h.a(poiDcdProductInfoViewHolder.f59549c, amVar.url, "poi_page", "click_more");
        }
    }
}
