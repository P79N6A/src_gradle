package com.ss.android.ugc.aweme.newfollow.userstate;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.forward.model.UserDynamicList;
import com.ss.android.ugc.aweme.forward.model.c;
import java.util.ArrayList;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57386a;

    /* renamed from: b  reason: collision with root package name */
    private final a f57387b;

    b(a aVar) {
        this.f57387b = aVar;
    }

    public final Object then(i iVar) {
        FollowFeed followFeed;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f57386a, false, 61771, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f57386a, false, 61771, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f57387b;
        UserDynamicList userDynamicList = (UserDynamicList) iVar.e();
        if (PatchProxy.isSupport(new Object[]{userDynamicList}, aVar, a.f57385a, false, 61763, new Class[]{UserDynamicList.class}, FollowFeedList.class)) {
            return (FollowFeedList) PatchProxy.accessDispatch(new Object[]{userDynamicList}, aVar, a.f57385a, false, 61763, new Class[]{UserDynamicList.class}, FollowFeedList.class);
        } else if (userDynamicList == null || userDynamicList.getDynamicList() == null) {
            return new FollowFeedList();
        } else {
            FollowFeedList followFeedList = new FollowFeedList();
            ArrayList arrayList = new ArrayList();
            for (c next : userDynamicList.getDynamicList()) {
                if (PatchProxy.isSupport(new Object[]{next}, aVar, a.f57385a, false, 61764, new Class[]{c.class}, FollowFeed.class)) {
                    a aVar2 = aVar;
                    followFeed = (FollowFeed) PatchProxy.accessDispatch(new Object[]{next}, aVar2, a.f57385a, false, 61764, new Class[]{c.class}, FollowFeed.class);
                } else {
                    FollowFeed followFeed2 = new FollowFeed();
                    if (next != null) {
                        if (next.getItemType() != 1) {
                            followFeed2.setAweme(next.getAweme());
                            followFeed2.setCommentList(next.getComments());
                            followFeed2.setFeedType(65280);
                        } else {
                            followFeed2.setLikeCount(next.getLikeCount());
                            followFeed2.setFavorites(next.getFavorites());
                            followFeed2.setBlockFavoriteTime(next.getBlockFavoriteTime());
                            followFeed2.setFeedType(65286);
                            followFeed2.setFavoriteIds(next.getFavoriteIds());
                        }
                    }
                    followFeed = followFeed2;
                }
                arrayList.add(followFeed);
            }
            followFeedList.setItems(arrayList);
            followFeedList.setHasMore(userDynamicList.getHasMore());
            followFeedList.setMaxCursor(userDynamicList.getMaxCursor());
            followFeedList.setMinCursor(userDynamicList.getMinCursor());
            return followFeedList;
        }
    }
}
