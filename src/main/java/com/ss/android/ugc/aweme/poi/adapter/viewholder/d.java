package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.x;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59667a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiDcdProductViewHolder f59668b;

    /* renamed from: c  reason: collision with root package name */
    private final x f59669c;

    /* renamed from: d  reason: collision with root package name */
    private final c f59670d;

    /* renamed from: e  reason: collision with root package name */
    private final String f59671e;

    public d(PoiDcdProductViewHolder poiDcdProductViewHolder, x xVar, c cVar, String str) {
        this.f59668b = poiDcdProductViewHolder;
        this.f59669c = xVar;
        this.f59670d = cVar;
        this.f59671e = str;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59667a, false, 64829, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59667a, false, 64829, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiDcdProductViewHolder poiDcdProductViewHolder = this.f59668b;
        x xVar = this.f59669c;
        c cVar = this.f59670d;
        String str = this.f59671e;
        if (!TextUtils.isEmpty(xVar.url)) {
            h.a(poiDcdProductViewHolder.itemView.getContext(), xVar.url, "poi_page", "click_card");
            h.a(cVar, "project_click_card", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "poi_page").a("product_id", xVar.extId).a("poi_id", cVar.getPoiId()).a("content_type", str));
        }
    }
}
