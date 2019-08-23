package com.ss.android.ugc.aweme.feed.panel;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;

public class BaseListFragmentPanel_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f45680b;

    /* renamed from: a  reason: collision with root package name */
    private BaseListFragmentPanel f45681a;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f45680b, false, 41762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45680b, false, 41762, new Class[0], Void.TYPE);
            return;
        }
        BaseListFragmentPanel baseListFragmentPanel = this.f45681a;
        if (baseListFragmentPanel != null) {
            this.f45681a = null;
            baseListFragmentPanel.mLoadMoreLayout = null;
            baseListFragmentPanel.mViewPager = null;
            baseListFragmentPanel.mTopSpace = null;
            baseListFragmentPanel.mBottomSpace = null;
            baseListFragmentPanel.mRefreshLayout = null;
            baseListFragmentPanel.mDiggLayout = null;
            baseListFragmentPanel.topFakeAdaptation = null;
            baseListFragmentPanel.bottomFakeAdaptation = null;
            baseListFragmentPanel.topFakeAdaptationContainer = null;
            baseListFragmentPanel.bottomFakeAdaptationContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseListFragmentPanel_ViewBinding(BaseListFragmentPanel baseListFragmentPanel, View view) {
        this.f45681a = baseListFragmentPanel;
        baseListFragmentPanel.mLoadMoreLayout = (LoadMoreFrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.bjm, "field 'mLoadMoreLayout'", LoadMoreFrameLayout.class);
        baseListFragmentPanel.mViewPager = (VerticalViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", VerticalViewPager.class);
        baseListFragmentPanel.mTopSpace = Utils.findRequiredView(view, C0906R.id.d5u, "field 'mTopSpace'");
        baseListFragmentPanel.mBottomSpace = Utils.findRequiredView(view, C0906R.id.ms, "field 'mBottomSpace'");
        baseListFragmentPanel.mRefreshLayout = (FeedSwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", FeedSwipeRefreshLayout.class);
        baseListFragmentPanel.mDiggLayout = (DiggLayout) Utils.findRequiredViewAsType(view, C0906R.id.a51, "field 'mDiggLayout'", DiggLayout.class);
        baseListFragmentPanel.topFakeAdaptation = view.findViewById(C0906R.id.d59);
        baseListFragmentPanel.bottomFakeAdaptation = view.findViewById(C0906R.id.mc);
        baseListFragmentPanel.topFakeAdaptationContainer = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.d5_, "field 'topFakeAdaptationContainer'", ViewGroup.class);
        baseListFragmentPanel.bottomFakeAdaptationContainer = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.md, "field 'bottomFakeAdaptationContainer'", ViewGroup.class);
    }
}
