package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.e.h;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60668a;

    /* renamed from: b  reason: collision with root package name */
    private final GotCouponDialog f60669b;

    d(GotCouponDialog gotCouponDialog) {
        this.f60669b = gotCouponDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60668a, false, 66335, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60668a, false, 66335, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        GotCouponDialog gotCouponDialog = this.f60669b;
        gotCouponDialog.dismiss();
        h.a(gotCouponDialog.f60628b.f60646c, "click_coupon_toast", com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_follow").a("enter_method", "click_publish").a("coupon_id", gotCouponDialog.f60628b.f60645b.getCouponId()).a("poi_id", gotCouponDialog.f60628b.f60644a));
    }
}
