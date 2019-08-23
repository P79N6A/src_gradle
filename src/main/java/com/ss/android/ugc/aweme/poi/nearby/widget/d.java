package com.ss.android.ugc.aweme.poi.nearby.widget;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFilterDetailActivity;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60115a;

    /* renamed from: b  reason: collision with root package name */
    private final c f60116b;

    d(c cVar) {
        this.f60116b = cVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60115a, false, 65373, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60115a, false, 65373, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        c cVar = this.f60116b;
        if (cVar.f60110b != null) {
            r.a("click_more_recommend_poi", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("poi_channel", cVar.o).a("enter_from", "categorized_city_poi").a("city_info", aa.a()).a("enter_method", "click").f34114b);
            Intent intent = new Intent(new Intent(cVar.f60110b, PoiTypeFilterDetailActivity.class));
            intent.putExtra("poi_class_code", cVar.o);
            intent.putExtra("enter_from", "categorized_city_poi");
            intent.putExtra("enter_method", "click_filtered_poi");
            cVar.f60110b.startActivity(intent);
        }
    }
}
