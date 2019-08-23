package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.x;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59662a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiDcdProductViewHolder f59663b;

    /* renamed from: c  reason: collision with root package name */
    private final x f59664c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.poi.c f59665d;

    /* renamed from: e  reason: collision with root package name */
    private final String f59666e;

    public c(PoiDcdProductViewHolder poiDcdProductViewHolder, x xVar, com.ss.android.ugc.aweme.poi.c cVar, String str) {
        this.f59663b = poiDcdProductViewHolder;
        this.f59664c = xVar;
        this.f59665d = cVar;
        this.f59666e = str;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59662a, false, 64828, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59662a, false, 64828, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiDcdProductViewHolder poiDcdProductViewHolder = this.f59663b;
        x xVar = this.f59664c;
        com.ss.android.ugc.aweme.poi.c cVar = this.f59665d;
        String str = this.f59666e;
        if (!TextUtils.isEmpty(xVar.buttonUrl)) {
            h.a(poiDcdProductViewHolder.itemView.getContext(), xVar.buttonUrl, "poi_page", "click_button");
            h.a(cVar, "project_click_price", d.a().a("enter_from", "poi_page").a("product_id", xVar.extId).a("poi_id", cVar.getPoiId()).a("content_type", str));
        }
    }
}
