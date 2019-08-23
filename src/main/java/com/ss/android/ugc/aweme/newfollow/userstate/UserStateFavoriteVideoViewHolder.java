package com.ss.android.ugc.aweme.newfollow.userstate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.vh.FavoriteVideoViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class UserStateFavoriteVideoViewHolder extends FavoriteVideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57338a;

    public UserStateFavoriteVideoViewHolder(FollowFeedLayout followFeedLayout) {
        super(followFeedLayout);
    }

    public final void a(FollowFeed followFeed) {
        if (PatchProxy.isSupport(new Object[]{followFeed}, this, f57338a, false, 61750, new Class[]{FollowFeed.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeed}, this, f57338a, false, 61750, new Class[]{FollowFeed.class}, Void.TYPE);
        } else if (a.c()) {
            this.mCreateTime.setText(eo.c(this.f57506e, followFeed.getBlockFavoriteTime() * 1000));
        } else {
            super.a(followFeed);
        }
    }
}
