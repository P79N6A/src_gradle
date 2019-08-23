package com.ss.android.ugc.aweme.choosemusic.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;

public class NewMusicTabFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35962a;

    /* renamed from: b  reason: collision with root package name */
    private NewMusicTabFragment f35963b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35962a, false, 26715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35962a, false, 26715, new Class[0], Void.TYPE);
            return;
        }
        NewMusicTabFragment newMusicTabFragment = this.f35963b;
        if (newMusicTabFragment != null) {
            this.f35963b = null;
            newMusicTabFragment.mDmtStatusView = null;
            newMusicTabFragment.tabLayout = null;
            newMusicTabFragment.mVpFragmentContainer = null;
            newMusicTabFragment.mScrollableLayout = null;
            newMusicTabFragment.mVwDivideLine = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public NewMusicTabFragment_ViewBinding(NewMusicTabFragment newMusicTabFragment, View view) {
        this.f35963b = newMusicTabFragment;
        newMusicTabFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mDmtStatusView'", DmtStatusView.class);
        newMusicTabFragment.tabLayout = (CommonTabLayout) Utils.findRequiredViewAsType(view, C0906R.id.cyz, "field 'tabLayout'", CommonTabLayout.class);
        newMusicTabFragment.mVpFragmentContainer = (ViewPager) Utils.findRequiredViewAsType(view, C0906R.id.afi, "field 'mVpFragmentContainer'", ViewPager.class);
        newMusicTabFragment.mScrollableLayout = (ScrollableLayout) Utils.findRequiredViewAsType(view, C0906R.id.ck9, "field 'mScrollableLayout'", ScrollableLayout.class);
        newMusicTabFragment.mVwDivideLine = Utils.findRequiredView(view, C0906R.id.a5r, "field 'mVwDivideLine'");
    }
}
