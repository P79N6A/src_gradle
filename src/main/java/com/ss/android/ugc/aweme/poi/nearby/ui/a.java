package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60084a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRankListActivity f60085b;

    a(PoiRankListActivity poiRankListActivity) {
        this.f60085b = poiRankListActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60084a, false, 65296, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60084a, false, 65296, new Class[0], Void.TYPE);
            return;
        }
        PoiRankListActivity poiRankListActivity = this.f60085b;
        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) poiRankListActivity.mHeadImgContainer.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) poiRankListActivity.mScrollLayout.getLayoutParams();
        if (com.ss.android.ugc.aweme.app.a.a.a((Activity) poiRankListActivity) || com.ss.android.ugc.aweme.app.a.a.b((Activity) poiRankListActivity)) {
            layoutParams.height = (int) UIUtils.dip2Px(poiRankListActivity, 220.0f);
            layoutParams2.height = (int) UIUtils.dip2Px(poiRankListActivity, 260.5f);
        } else {
            layoutParams.height = (int) UIUtils.dip2Px(poiRankListActivity, 200.0f);
            layoutParams2.height = (int) UIUtils.dip2Px(poiRankListActivity, 240.5f);
        }
        poiRankListActivity.mHeadImgContainer.setLayoutParams(layoutParams);
        poiRankListActivity.mScrollLayout.setLayoutParams(layoutParams2);
    }
}
