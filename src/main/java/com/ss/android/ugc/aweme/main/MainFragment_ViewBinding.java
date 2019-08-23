package com.ss.android.ugc.aweme.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.common.widget.FlippableViewPager;
import com.ss.android.ugc.aweme.common.widget.MainTabStrip;
import com.ss.android.ugc.aweme.feed.ui.CustomInterceptTouchEventFrameLayout;
import com.ss.android.ugc.aweme.views.HotRightSearchGuideView;

public class MainFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54214a;

    /* renamed from: b  reason: collision with root package name */
    private MainFragment f54215b;

    /* renamed from: c  reason: collision with root package name */
    private View f54216c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f54214a, false, 57368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54214a, false, 57368, new Class[0], Void.TYPE);
            return;
        }
        MainFragment mainFragment = this.f54215b;
        if (mainFragment != null) {
            this.f54215b = null;
            mainFragment.mFlContainerStoryPanel = null;
            mainFragment.mFlContentContainer = null;
            mainFragment.mSwipeRefreshLayoutWhenStoryOpen = null;
            mainFragment.mViewPager = null;
            mainFragment.mPagerTabStrip = null;
            mainFragment.mStatusBarView = null;
            mainFragment.mIvBtnStorySwitch = null;
            mainFragment.mTvLive = null;
            mainFragment.mIvBtnSearch = null;
            mainFragment.mFlSerach = null;
            mainFragment.mSearchText = null;
            mainFragment.mVTabBg = null;
            mainFragment.mTitleBarContainer = null;
            mainFragment.mTitleShadow = null;
            mainFragment.mCommonTitleBar = null;
            mainFragment.mVgRightContainer = null;
            mainFragment.mTeenagerModeTitleBarStub = null;
            mainFragment.mFollowPillNotice = null;
            mainFragment.mHotRightSearchGuideView = null;
            this.f54216c.setOnClickListener(null);
            this.f54216c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MainFragment_ViewBinding(final MainFragment mainFragment, View view) {
        this.f54215b = mainFragment;
        mainFragment.mFlContainerStoryPanel = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.afc, "field 'mFlContainerStoryPanel'", ViewGroup.class);
        mainFragment.mFlContentContainer = (CustomInterceptTouchEventFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.afe, "field 'mFlContentContainer'", CustomInterceptTouchEventFrameLayout.class);
        mainFragment.mSwipeRefreshLayoutWhenStoryOpen = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ctx, "field 'mSwipeRefreshLayoutWhenStoryOpen'", SwipeRefreshLayout.class);
        mainFragment.mViewPager = (FlippableViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", FlippableViewPager.class);
        mainFragment.mPagerTabStrip = (MainTabStrip) Utils.findRequiredViewAsType(view, C0906R.id.bw7, "field 'mPagerTabStrip'", MainTabStrip.class);
        mainFragment.mStatusBarView = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBarView'");
        mainFragment.mIvBtnStorySwitch = (AnimationImageView) Utils.findRequiredViewAsType(view, C0906R.id.azf, "field 'mIvBtnStorySwitch'", AnimationImageView.class);
        mainFragment.mTvLive = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.ddt, "field 'mTvLive'", DmtTextView.class);
        mainFragment.mIvBtnSearch = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.azc, "field 'mIvBtnSearch'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.afo, "field 'mFlSerach' and method 'onSearchClick'");
        mainFragment.mFlSerach = (LinearLayout) Utils.castView(findRequiredView, C0906R.id.afo, "field 'mFlSerach'", LinearLayout.class);
        this.f54216c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54217a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f54217a, false, 57369, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f54217a, false, 57369, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                mainFragment.onSearchClick();
            }
        });
        mainFragment.mSearchText = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.di0, "field 'mSearchText'", DmtTextView.class);
        mainFragment.mVTabBg = Utils.findRequiredView(view, C0906R.id.dqw, "field 'mVTabBg'");
        mainFragment.mTitleBarContainer = Utils.findRequiredView(view, C0906R.id.d3n, "field 'mTitleBarContainer'");
        mainFragment.mTitleShadow = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.d3y, "field 'mTitleShadow'", ImageView.class);
        mainFragment.mCommonTitleBar = Utils.findRequiredView(view, C0906R.id.xv, "field 'mCommonTitleBar'");
        mainFragment.mVgRightContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.biu, "field 'mVgRightContainer'", ViewGroup.class);
        mainFragment.mTeenagerModeTitleBarStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.czy, "field 'mTeenagerModeTitleBarStub'", ViewStub.class);
        mainFragment.mFollowPillNotice = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bgo, "field 'mFollowPillNotice'", LinearLayout.class);
        mainFragment.mHotRightSearchGuideView = (HotRightSearchGuideView) Utils.findRequiredViewAsType(view, C0906R.id.dvu, "field 'mHotRightSearchGuideView'", HotRightSearchGuideView.class);
    }
}
