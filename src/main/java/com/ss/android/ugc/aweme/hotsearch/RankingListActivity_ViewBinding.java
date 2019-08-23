package com.ss.android.ugc.aweme.hotsearch;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;

public class RankingListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49633a;

    /* renamed from: b  reason: collision with root package name */
    private RankingListActivity f49634b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49633a, false, 49551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49633a, false, 49551, new Class[0], Void.TYPE);
            return;
        }
        RankingListActivity rankingListActivity = this.f49634b;
        if (rankingListActivity != null) {
            this.f49634b = null;
            rankingListActivity.mAwemeViewPagerNavigator = null;
            rankingListActivity.mViewPager = null;
            rankingListActivity.mScrollLayout = null;
            rankingListActivity.mImageHeaderContainer = null;
            rankingListActivity.mImageHeader = null;
            rankingListActivity.mImageHeaderAd = null;
            rankingListActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RankingListActivity_ViewBinding(RankingListActivity rankingListActivity, View view) {
        this.f49634b = rankingListActivity;
        rankingListActivity.mAwemeViewPagerNavigator = (AwemeViewPagerNavigator) Utils.findRequiredViewAsType(view, C0906R.id.ap2, "field 'mAwemeViewPagerNavigator'", AwemeViewPagerNavigator.class);
        rankingListActivity.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duv, "field 'mViewPager'", ViewPager.class);
        rankingListActivity.mScrollLayout = (AppBarLayout) Utils.findRequiredViewAsType(view, C0906R.id.ck9, "field 'mScrollLayout'", AppBarLayout.class);
        rankingListActivity.mImageHeaderContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.asn, "field 'mImageHeaderContainer'", ViewGroup.class);
        rankingListActivity.mImageHeader = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.asl, "field 'mImageHeader'", RemoteImageView.class);
        rankingListActivity.mImageHeaderAd = Utils.findRequiredView(view, C0906R.id.asm, "field 'mImageHeaderAd'");
        rankingListActivity.mTitleBar = (NormalTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", NormalTitleBar.class);
    }
}
