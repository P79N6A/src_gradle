package com.ss.android.ugc.aweme.poi.ui.coupon;

import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60675a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiCouponLayout f60676b;

    /* renamed from: c  reason: collision with root package name */
    private final AbsFragment f60677c;

    f(PoiCouponLayout poiCouponLayout, AbsFragment absFragment) {
        this.f60676b = poiCouponLayout;
        this.f60677c = absFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60675a, false, 66346, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60675a, false, 66346, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PoiCouponLayout poiCouponLayout = this.f60676b;
        AbsFragment absFragment = this.f60677c;
        if (!a.a(poiCouponLayout) && absFragment != null && (absFragment instanceof AbsPoiAwemeFeedFragment)) {
            if (d.a().isLogin()) {
                poiCouponLayout.b();
                return;
            }
            e.a((Fragment) absFragment, "poi_page", "click_coupon", (com.ss.android.ugc.aweme.base.component.f) poiCouponLayout);
        }
    }
}
