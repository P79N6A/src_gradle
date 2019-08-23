package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.ui.a;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.c.b;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import java.util.ArrayList;
import java.util.Arrays;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59690a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiOptimizedDetailViewHolder f59691b;

    k(PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder) {
        this.f59691b = poiOptimizedDetailViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59690a, false, 64881, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59690a, false, 64881, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = this.f59691b;
        Context context = poiOptimizedDetailViewHolder.f59578b;
        PoiDetail poiDetail = poiOptimizedDetailViewHolder.f59579c;
        c cVar = poiOptimizedDetailViewHolder.f59581e;
        if (PatchProxy.isSupport(new Object[]{context, poiDetail, "poi_page", cVar, (byte) 1, "click_button"}, null, h.f59792a, true, 66831, new Class[]{Context.class, PoiDetail.class, String.class, c.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, poiDetail, "poi_page", cVar, (byte) 1, "click_button"}, null, h.f59792a, true, 66831, new Class[]{Context.class, PoiDetail.class, String.class, c.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else {
            String phone = poiDetail.getPhone();
            String[] split = StringUtils.isEmpty(phone) ? new String[0] : phone.split(";");
            if (split.length > 0) {
                g.h(context, j.a().a(cVar.getAwemeId()), poiDetail.getPoiId());
                h.a(cVar, "poi_contact_method", d.a().a("enter_method", "show").a("previous_page", cVar.getPreviousPage()).a("poi_id", poiDetail.getPoiId()).a("content_type", "phone"));
            }
            ArrayList arrayList = new ArrayList();
            boolean isEnterprise = poiDetail.isEnterprise();
            if (isEnterprise) {
                arrayList.add(context.getString(C0906R.string.btv));
                h.a(cVar, "poi_contact_method", d.a().a("enter_method", "show").a("previous_page", cVar.getPreviousPage()).a("poi_id", poiDetail.getPoiId()).a("content_type", "message"));
            }
            arrayList.addAll(Arrays.asList(split));
            if (arrayList.size() != 0) {
                a aVar = new a(context);
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                com.ss.android.ugc.aweme.poi.e.k kVar = new com.ss.android.ugc.aweme.poi.e.k(isEnterprise, context, poiDetail, cVar, strArr, "click_button", "poi_page");
                aVar.a((CharSequence[]) strArr, (DialogInterface.OnClickListener) kVar);
                aVar.b();
            }
        }
        b.a("click", "contacts", "poi_page", "poi_page", poiOptimizedDetailViewHolder.f59581e);
    }
}
