package com.ss.android.ugc.aweme.commercialize;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.k;
import com.ss.android.ugc.aweme.commercialize.api.CouponRedeemApi;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39404a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCouponRedeemActivity f39405b;

    o(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f39405b = poiCouponRedeemActivity;
    }

    public final void onClick(View view) {
        q<CouponRedeemApi.c> qVar;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f39404a, false, 30368, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f39404a, false, 30368, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiCouponRedeemActivity poiCouponRedeemActivity = this.f39405b;
        if (PatchProxy.isSupport(new Object[]{view2}, poiCouponRedeemActivity, PoiCouponRedeemActivity.f38449a, false, 30359, new Class[]{View.class}, Void.TYPE)) {
            PoiCouponRedeemActivity poiCouponRedeemActivity2 = poiCouponRedeemActivity;
            PatchProxy.accessDispatch(new Object[]{view2}, poiCouponRedeemActivity2, PoiCouponRedeemActivity.f38449a, false, 30359, new Class[]{View.class}, Void.TYPE);
            return;
        }
        r.a("verify_coupon", (Map) d.a().a("coupon_id", poiCouponRedeemActivity.f38450b).a("action_type", poiCouponRedeemActivity.f38451c).f34114b);
        view2.setEnabled(false);
        String str = poiCouponRedeemActivity.f38450b;
        if (PatchProxy.isSupport(new Object[]{str}, null, CouponRedeemApi.f38490a, true, 30414, new Class[]{String.class}, q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[]{str}, null, CouponRedeemApi.f38490a, true, 30414, new Class[]{String.class}, q.class);
        } else {
            qVar = CouponRedeemApi.a().redeemCoupon(str);
        }
        qVar.a(new p(poiCouponRedeemActivity, view2, qVar), k.f34752b);
    }
}
