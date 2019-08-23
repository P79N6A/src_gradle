package com.ss.android.ugc.aweme.newfollow.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;

public final /* synthetic */ class g implements CommonTabLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57306a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendTabFragment f57307b;

    g(FriendTabFragment friendTabFragment) {
        this.f57307b = friendTabFragment;
    }

    public final void a(CommonTabLayout.e eVar) {
        CommonTabLayout.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f57306a, false, 61599, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f57306a, false, 61599, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
            return;
        }
        FriendTabFragment friendTabFragment = this.f57307b;
        int i = eVar2.f40629f;
        if (i != friendTabFragment.mViewPager.getCurrentItem()) {
            eVar2.a((Object) "from_click");
        } else {
            friendTabFragment.a(i, true);
        }
        eVar.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, friendTabFragment, FriendTabFragment.f3654a, false, 61591, new Class[]{Integer.TYPE}, Void.TYPE)) {
            FriendTabFragment friendTabFragment2 = friendTabFragment;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, friendTabFragment2, FriendTabFragment.f3654a, false, 61591, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 0 && friendTabFragment.mFollowYellowDot.getVisibility() == 0) {
            friendTabFragment.a(true, false);
        } else {
            if (i == 1 && friendTabFragment.mFriendYellowDot.getVisibility() == 0) {
                friendTabFragment.a(false, false);
            }
        }
    }
}
