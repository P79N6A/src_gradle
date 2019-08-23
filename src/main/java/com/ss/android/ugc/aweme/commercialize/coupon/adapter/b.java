package com.ss.android.ugc.aweme.commercialize.coupon.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.commercialize.coupon.adapter.CouponListAdapter;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38580a;

    /* renamed from: b  reason: collision with root package name */
    private final CouponListAdapter.ShowExpiredCouponHolder f38581b;

    b(CouponListAdapter.ShowExpiredCouponHolder showExpiredCouponHolder) {
        this.f38581b = showExpiredCouponHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38580a, false, 30440, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38580a, false, 30440, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CouponListAdapter.ShowExpiredCouponHolder showExpiredCouponHolder = this.f38581b;
        if (showExpiredCouponHolder.f38574c.get() != null) {
            r.a("enter_invalid_card_bag", (Map) d.a().a("enter_from", "card_bag").f34114b);
            Intent intent = new Intent((Context) showExpiredCouponHolder.f38574c.get(), CouponListActivity.class);
            intent.putExtra("is_coupon_valid", false);
            ((Activity) showExpiredCouponHolder.f38574c.get()).startActivity(intent);
        }
    }
}
