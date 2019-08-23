package com.ss.android.ugc.aweme.following.ui.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48141a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowingAdapter.ViewHolder f48142b;

    /* renamed from: c  reason: collision with root package name */
    private final User f48143c;

    f(FollowingAdapter.ViewHolder viewHolder, User user) {
        this.f48142b = viewHolder;
        this.f48143c = user;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f48141a, false, 45120, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f48141a, false, 45120, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FollowingAdapter.ViewHolder viewHolder = this.f48142b;
        User user = this.f48143c;
        user.setFollowerStatus(0);
        if (user.getFollowStatus() == 2) {
            user.setFollowStatus(1);
        }
        int indexOf = FollowingAdapter.this.getData().indexOf(user);
        FollowingAdapter.this.getData().remove(indexOf);
        FollowingAdapter.this.notifyItemRemoved(indexOf);
    }
}
