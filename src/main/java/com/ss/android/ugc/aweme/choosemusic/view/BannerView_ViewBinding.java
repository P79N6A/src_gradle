package com.ss.android.ugc.aweme.choosemusic.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.widget.IndicatorView;

public class BannerView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36000a;

    /* renamed from: b  reason: collision with root package name */
    private BannerView f36001b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36000a, false, 26802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36000a, false, 26802, new Class[0], Void.TYPE);
            return;
        }
        BannerView bannerView = this.f36001b;
        if (bannerView != null) {
            this.f36001b = null;
            bannerView.mViewPager = null;
            bannerView.mIndicator = null;
            bannerView.mStatusBar = null;
            bannerView.mBannerLayout = null;
            bannerView.mLlBannerContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BannerView_ViewBinding(BannerView bannerView, View view) {
        this.f36001b = bannerView;
        bannerView.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", ViewPager.class);
        bannerView.mIndicator = (IndicatorView) Utils.findRequiredViewAsType(view, C0906R.id.a6b, "field 'mIndicator'", IndicatorView.class);
        bannerView.mStatusBar = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBar'");
        bannerView.mBannerLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.jf, "field 'mBannerLayout'", RelativeLayout.class);
        bannerView.mLlBannerContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.bgd, "field 'mLlBannerContainer'", ViewGroup.class);
    }
}
