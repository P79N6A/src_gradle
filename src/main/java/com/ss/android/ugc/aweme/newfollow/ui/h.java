package com.ss.android.ugc.aweme.newfollow.ui;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57308a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendTabFragment f57309b;

    h(FriendTabFragment friendTabFragment) {
        this.f57309b = friendTabFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f57308a, false, 61600, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f57308a, false, 61600, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FriendTabFragment friendTabFragment = this.f57309b;
        Integer num = (Integer) obj;
        if (friendTabFragment.mViewPager != null && num != null && num.intValue() >= 0 && num.intValue() < friendTabFragment.mViewPager.getChildCount()) {
            friendTabFragment.mViewPager.setCurrentItem(num.intValue());
        }
    }
}
