package com.ss.android.ugc.aweme.friends.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public final /* synthetic */ class o implements LoadMoreRecyclerViewAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49473a;

    /* renamed from: b  reason: collision with root package name */
    private final FindFriendsFragment f49474b;

    o(FindFriendsFragment findFriendsFragment) {
        this.f49474b = findFriendsFragment;
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f49473a, false, 47172, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49473a, false, 47172, new Class[0], Void.TYPE);
            return;
        }
        FindFriendsFragment findFriendsFragment = this.f49474b;
        if (PatchProxy.isSupport(new Object[0], findFriendsFragment, FindFriendsFragment.f3335b, false, 47153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], findFriendsFragment, FindFriendsFragment.f3335b, false, 47153, new Class[0], Void.TYPE);
            return;
        }
        findFriendsFragment.f3339f.a(4, findFriendsFragment.f3338e, 1);
    }
}
