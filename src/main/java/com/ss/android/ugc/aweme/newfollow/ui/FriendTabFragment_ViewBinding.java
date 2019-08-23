package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.main.base.FriendTabStrip;

public class FriendTabFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57242a;

    /* renamed from: b  reason: collision with root package name */
    private FriendTabFragment f57243b;

    /* renamed from: c  reason: collision with root package name */
    private View f57244c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57242a, false, 61607, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57242a, false, 61607, new Class[0], Void.TYPE);
            return;
        }
        FriendTabFragment friendTabFragment = this.f57243b;
        if (friendTabFragment != null) {
            this.f57243b = null;
            friendTabFragment.mViewPager = null;
            friendTabFragment.mTitleLayout = null;
            friendTabFragment.mFriendTabStrip = null;
            friendTabFragment.mFriendList = null;
            friendTabFragment.mFollowYellowDot = null;
            friendTabFragment.mFriendYellowDot = null;
            friendTabFragment.mStatusBar = null;
            friendTabFragment.mStoryIconView = null;
            friendTabFragment.mStoryTextView = null;
            this.f57244c.setOnClickListener(null);
            this.f57244c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FriendTabFragment_ViewBinding(final FriendTabFragment friendTabFragment, View view) {
        this.f57243b = friendTabFragment;
        friendTabFragment.mViewPager = (ViewPager) Utils.findRequiredViewAsType(view, C0906R.id.duu, "field 'mViewPager'", ViewPager.class);
        friendTabFragment.mTitleLayout = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.d3v, "field 'mTitleLayout'", RelativeLayout.class);
        friendTabFragment.mFriendTabStrip = (FriendTabStrip) Utils.findRequiredViewAsType(view, C0906R.id.aiu, "field 'mFriendTabStrip'", FriendTabStrip.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.dc3, "field 'mFriendList' and method 'onClickFriendList'");
        friendTabFragment.mFriendList = (TextView) Utils.castView(findRequiredView, C0906R.id.dc3, "field 'mFriendList'", TextView.class);
        this.f57244c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57245a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f57245a, false, 61608, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f57245a, false, 61608, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                friendTabFragment.onClickFriendList();
            }
        });
        friendTabFragment.mFollowYellowDot = Utils.findRequiredView(view, C0906R.id.ah9, "field 'mFollowYellowDot'");
        friendTabFragment.mFriendYellowDot = Utils.findRequiredView(view, C0906R.id.air, "field 'mFriendYellowDot'");
        friendTabFragment.mStatusBar = Utils.findRequiredView(view, C0906R.id.cv0, "field 'mStatusBar'");
        friendTabFragment.mStoryIconView = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b5m, "field 'mStoryIconView'", ImageView.class);
        friendTabFragment.mStoryTextView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.djy, "field 'mStoryTextView'", TextView.class);
    }
}
