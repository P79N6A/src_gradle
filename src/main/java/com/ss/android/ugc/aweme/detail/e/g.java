package com.ss.android.ugc.aweme.detail.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.newfollow.userstate.a;
import com.ss.android.ugc.aweme.u.aa;
import java.util.List;

public final class g extends c<a, FollowFeed> {
    public static ChangeQuickRedirect h;

    public final List<FollowFeed> c() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35018, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, h, false, 35018, new Class[0], List.class);
        } else if (this.f2978e == null) {
            return null;
        } else {
            return ((a) this.f2978e).getItems();
        }
    }

    public final List<Aweme> d() {
        if (!PatchProxy.isSupport(new Object[0], this, h, false, 35019, new Class[0], List.class)) {
            return b.a(((a) this.f2978e).getItems());
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, h, false, 35019, new Class[0], List.class);
    }

    public final /* synthetic */ String b(Object obj) {
        FollowFeed followFeed = (FollowFeed) obj;
        if (PatchProxy.isSupport(new Object[]{followFeed}, this, h, false, 35017, new Class[]{FollowFeed.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{followFeed}, this, h, false, 35017, new Class[]{FollowFeed.class}, String.class);
        } else if (followFeed == null) {
            return "";
        } else {
            return aa.m(followFeed.getAweme());
        }
    }
}