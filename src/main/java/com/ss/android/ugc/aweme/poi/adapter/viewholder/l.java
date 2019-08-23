package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.c.b;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.u.q;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59692a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiOptimizedDetailViewHolder f59693b;

    l(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f59693b = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59692a, false, 64882, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59692a, false, 64882, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f59693b;
        if (PatchProxy.isSupport(new Object[0], poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], poiOptimizedDetailViewHolder, PoiOptimizedDetailViewHolder.f59577a, false, 64854, new Class[0], Void.TYPE);
        } else if (poiOptimizedDetailViewHolder.f59579c != null && !StringUtils.isEmpty(poiOptimizedDetailViewHolder.f59579c.getEnterpriseId())) {
            Context context = poiOptimizedDetailViewHolder.f59578b;
            PoiDetail poiDetail = poiOptimizedDetailViewHolder.f59579c;
            String awemeId = poiOptimizedDetailViewHolder.f59581e.getAwemeId();
            if (PatchProxy.isSupport(new Object[]{context, poiDetail, awemeId}, null, h.f59792a, true, 66835, new Class[]{Context.class, PoiDetail.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, poiDetail, awemeId}, null, h.f59792a, true, 66835, new Class[]{Context.class, PoiDetail.class, String.class}, Void.TYPE);
            } else {
                q qVar = (q) new q().b("poi_page").a("click_profile_card");
                qVar.t = awemeId;
                qVar.k(poiDetail.getEnterpriseId()).b(poiDetail.getPoiId(), poiDetail.getPoiTypeStr()).e();
                UserProfileActivity.a(context, poiDetail.getEnterpriseModel());
            }
        }
        b.a("click", "merchants", "poi_page", "poi_page", poiOptimizedDetailViewHolder.f59581e);
    }
}
