package com.ss.android.ugc.aweme.commercialize.coupon.views;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38638a;

    /* renamed from: b  reason: collision with root package name */
    private final CouponDetailActivity f38639b;

    b(CouponDetailActivity couponDetailActivity) {
        this.f38639b = couponDetailActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38638a, false, 30494, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38638a, false, 30494, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f38639b.a();
    }
}
