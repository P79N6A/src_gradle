package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60678a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCouponLayout f60679b;

    /* renamed from: c  reason: collision with root package name */
    private final c f60680c;

    g(PoiCouponLayout poiCouponLayout, c cVar) {
        this.f60679b = poiCouponLayout;
        this.f60680c = cVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60678a, false, 66347, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60678a, false, 66347, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiCouponLayout poiCouponLayout = this.f60679b;
        c cVar = this.f60680c;
        CouponDetailActivity.a(poiCouponLayout.getContext(), cVar.getCouponId(), cVar.getCodeId());
        poiCouponLayout.b(cVar);
    }
}
