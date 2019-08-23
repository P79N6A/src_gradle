package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.app.Activity;
import android.support.design.widget.CoordinatorLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.a.a;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60090a;

    /* renamed from: b  reason: collision with root package name */
    private final PoiRankListActivity f60091b;

    d(PoiRankListActivity poiRankListActivity) {
        this.f60091b = poiRankListActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60090a, false, 65299, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60090a, false, 65299, new Class[0], Void.TYPE);
            return;
        }
        PoiRankListActivity poiRankListActivity = this.f60091b;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) poiRankListActivity.mPoiRankBg.getLayoutParams();
        layoutParams.height = (int) UIUtils.dip2Px(poiRankListActivity, 20.0f);
        poiRankListActivity.mPoiRankBg.setLayoutParams(layoutParams);
        CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) poiRankListActivity.mScrollLayout.getLayoutParams();
        if (a.a((Activity) poiRankListActivity) || a.b((Activity) poiRankListActivity)) {
            layoutParams2.height = (int) UIUtils.dip2Px(poiRankListActivity, 220.0f);
        } else {
            layoutParams2.height = (int) UIUtils.dip2Px(poiRankListActivity, 200.0f);
        }
        poiRankListActivity.mScrollLayout.setLayoutParams(layoutParams2);
    }
}
