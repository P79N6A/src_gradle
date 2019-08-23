package com.ss.android.ugc.aweme.commercialize.coupon.views;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38640a;

    /* renamed from: b  reason: collision with root package name */
    private final CouponListActivity f38641b;

    c(CouponListActivity couponListActivity) {
        this.f38641b = couponListActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38640a, false, 30524, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38640a, false, 30524, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f38641b.b();
    }
}
