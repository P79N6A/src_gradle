package com.ss.android.ugc.aweme.commercialize.coupon.views;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38642a;

    /* renamed from: b  reason: collision with root package name */
    private final CouponListActivity f38643b;

    d(CouponListActivity couponListActivity) {
        this.f38643b = couponListActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38642a, false, 30525, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38642a, false, 30525, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CouponListActivity couponListActivity = this.f38643b;
        r.a("enter_invalid_card_bag", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "card_bag").f34114b);
        Intent intent = new Intent(couponListActivity, CouponListActivity.class);
        intent.putExtra("is_coupon_valid", false);
        couponListActivity.startActivity(intent);
    }
}
