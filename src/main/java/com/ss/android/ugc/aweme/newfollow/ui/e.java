package com.ss.android.ugc.aweme.newfollow.ui;

import android.arch.lifecycle.Observer;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57302a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendTabFragment f57303b;

    e(FriendTabFragment friendTabFragment) {
        this.f57303b = friendTabFragment;
    }

    public final void onChanged(Object obj) {
        int i;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f57302a, false, 61597, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f57302a, false, 61597, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FriendTabFragment friendTabFragment = this.f57303b;
        m mVar = (m) obj;
        if (!mVar.f57317e.booleanValue()) {
            if (mVar.f57315c.intValue() > 0) {
                i = friendTabFragment.f3657d * -1;
                if (PatchProxy.isSupport(new Object[0], friendTabFragment, FriendTabFragment.f3654a, false, 61556, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], friendTabFragment, FriendTabFragment.f3654a, false, 61556, new Class[0], Void.TYPE);
                } else if (friendTabFragment.mTitleLayout != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) friendTabFragment.mTitleLayout.getLayoutParams();
                    layoutParams.topMargin = -friendTabFragment.f3657d;
                    friendTabFragment.mTitleLayout.setLayoutParams(layoutParams);
                    friendTabFragment.mTitleLayout.setVisibility(8);
                }
            } else if (friendTabFragment.mTitleLayout.getAlpha() != 0.0f) {
                friendTabFragment.f();
                i = 0;
            }
            if (mVar.f57316d.intValue() <= friendTabFragment.f3657d) {
                FollowFeedFragment followFeedFragment = (FollowFeedFragment) friendTabFragment.f3655b.get(friendTabFragment.mViewPager.getCurrentItem());
                if (PatchProxy.isSupport(new Object[]{0, Integer.valueOf(i)}, followFeedFragment, FollowFeedFragment.f3648a, false, 61494, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{0, Integer.valueOf(i)}, followFeedFragment, FollowFeedFragment.f3648a, false, 61494, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                followFeedFragment.f3649b.a(0, i);
            }
        } else if (!mVar.f57318f.booleanValue() || friendTabFragment.mTitleLayout.getAlpha() != 0.0f || mVar.f57316d.intValue() <= friendTabFragment.f3657d) {
            int intValue = mVar.f57315c.intValue();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue)}, friendTabFragment, FriendTabFragment.f3654a, false, 61554, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue)}, friendTabFragment, FriendTabFragment.f3654a, false, 61554, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                if (friendTabFragment.mTitleLayout != null) {
                    if (friendTabFragment.mTitleLayout.getVisibility() != 0) {
                        friendTabFragment.mTitleLayout.setVisibility(0);
                    }
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) friendTabFragment.mTitleLayout.getLayoutParams();
                    layoutParams2.topMargin -= intValue;
                    float abs = 1.0f - (((float) Math.abs(layoutParams2.topMargin)) / ((float) friendTabFragment.f3657d));
                    if (layoutParams2.topMargin > 0) {
                        layoutParams2.topMargin = 0;
                        abs = 1.0f;
                    } else if (layoutParams2.topMargin < (-(friendTabFragment.f3657d + UIUtils.getStatusBarHeight(friendTabFragment.getContext())))) {
                        layoutParams2.topMargin = -(friendTabFragment.f3657d + UIUtils.getStatusBarHeight(friendTabFragment.getContext()));
                        abs = 0.0f;
                    }
                    friendTabFragment.mTitleLayout.setAlpha(abs);
                    friendTabFragment.mTitleLayout.setLayoutParams(layoutParams2);
                }
            }
        }
    }
}
