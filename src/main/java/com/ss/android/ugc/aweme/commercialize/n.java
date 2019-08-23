package com.ss.android.ugc.aweme.commercialize;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39402a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCouponRedeemActivity f39403b;

    n(PoiCouponRedeemActivity poiCouponRedeemActivity) {
        this.f39403b = poiCouponRedeemActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39402a, false, 30367, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39402a, false, 30367, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f39403b.a();
    }
}
