package com.ss.android.ugc.aweme.newfollow.userstate;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.comment.CommentInputManager;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.forward.c.a;
import com.ss.android.ugc.aweme.newfollow.f.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class c extends b<a, UserStateFeedViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3668a;

    /* renamed from: b  reason: collision with root package name */
    public UserStateFragment f3669b;
    public String s;
    public String t;

    public final /* bridge */ /* synthetic */ Fragment c() {
        return this.f3669b;
    }

    public String getEventType() {
        return this.s;
    }

    /* renamed from: d */
    public final a i() {
        return (a) this.f2978e;
    }

    private boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, f3668a, false, 61778, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3668a, false, 61778, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ("personal_homepage".equals(this.s)) {
            return true;
        } else {
            return false;
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3668a, false, 61774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3668a, false, 61774, new Class[0], Void.TYPE);
            return;
        }
        if (this.m == null) {
            this.m = new CommentInputManager(this.f3669b, hashCode(), this);
        }
        this.m.e();
    }

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3668a, false, 61772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3668a, false, 61772, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2978e != null && this.f2979f != null && ((UserStateFeedViewHolder) this.f2979f).isViewValid()) {
            int i = ((a) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    UserStateFeedViewHolder userStateFeedViewHolder = (UserStateFeedViewHolder) this.f2979f;
                    List<FollowFeed> items = ((a) this.f2978e).getItems();
                    if (((a) this.f2978e).isHasMore() && !((a) this.f2978e).isNewDataEmpty()) {
                        z = true;
                    }
                    userStateFeedViewHolder.b(items, z);
                }
            } else if (((a) this.f2978e).isDataEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (!AbTestManager.a().aU() || !s()) {
                    ((UserStateFeedViewHolder) this.f2979f).a(3);
                    return;
                }
                FollowFeed followFeed = new FollowFeed();
                followFeed.setFeedType(65287);
                arrayList.add(0, followFeed);
                ((a) this.f2978e).setItems(arrayList);
                ((UserStateFeedViewHolder) this.f2979f).a((List<D>) arrayList, ((a) this.f2978e).isHasMore());
            } else {
                List<FollowFeed> items2 = ((a) this.f2978e).getItems();
                if (AbTestManager.a().aU() && s()) {
                    FollowFeed followFeed2 = new FollowFeed();
                    followFeed2.setFeedType(65287);
                    items2.add(0, followFeed2);
                }
                ((UserStateFeedViewHolder) this.f2979f).a(items2, ((a) this.f2978e).isHasMore());
            }
        }
    }

    c(UserStateFragment userStateFragment) {
        this.f3669b = userStateFragment;
    }

    public final String a(boolean z) {
        return this.f3669b.f57362d;
    }

    private boolean a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3668a, false, 61779, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f3668a, false, 61779, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (s() || TextUtils.equals(this.t, d.a().getCurUserId()) || user == null || TextUtils.equals(this.t, user.getUid())) {
            return false;
        } else {
            return true;
        }
    }

    @Subscribe
    public void onEvent(a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3668a, false, 61775, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3668a, false, 61775, new Class[]{a.class}, Void.TYPE);
        } else if (aVar != null) {
            if (aVar.f48271e == 1) {
                if (aVar.f48272f == hashCode()) {
                    String a2 = a(true);
                    Aweme aweme = aVar.f48270d;
                    if (this.p) {
                        str = "click_repost_button";
                    } else {
                        str = "click_comment";
                    }
                    com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme, "list", str, true);
                    if (this.m != null) {
                        this.m.g();
                    }
                }
                if (this.f3669b != null && this.f3669b.e()) {
                    ((UserStateFeedViewHolder) this.f2979f).a(aVar.f48269c, aVar.f48268b);
                }
            } else if (aVar.f48271e == 2) {
                ((UserStateFeedViewHolder) this.f2979f).a(aVar.f48269c);
            }
            this.q = true;
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, f3668a, false, 61773, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, f3668a, false, 61773, new Class[]{ar.class}, Void.TYPE);
        } else if (this.f2979f != null && ((UserStateFeedViewHolder) this.f2979f).isViewValid()) {
            int i = arVar2.f45292b;
            if (i != 2) {
                if (i == 13) {
                    ((UserStateFeedViewHolder) this.f2979f).c((String) arVar2.f45293c);
                } else if (i != 15) {
                    if (i == 21 && (arVar2.f45293c instanceof Aweme)) {
                        Aweme aweme = (Aweme) arVar2.f45293c;
                        ((UserStateFeedViewHolder) this.f2979f).a(aweme, arVar2.f45296f);
                        ((UserStateFeedViewHolder) this.f2979f).a(aweme, !arVar2.j, arVar2.f45296f, arVar2.g);
                    }
                } else if (this.f3669b != null && this.f3669b.e()) {
                    Aweme aweme2 = (Aweme) arVar2.f45293c;
                    UserStateFeedViewHolder userStateFeedViewHolder = (UserStateFeedViewHolder) this.f2979f;
                    if (PatchProxy.isSupport(new Object[]{aweme2}, userStateFeedViewHolder, UserStateFeedViewHolder.f57340a, false, 61789, new Class[]{Aweme.class}, Void.TYPE)) {
                        UserStateFeedViewHolder userStateFeedViewHolder2 = userStateFeedViewHolder;
                        PatchProxy.accessDispatch(new Object[]{aweme2}, userStateFeedViewHolder2, UserStateFeedViewHolder.f57340a, false, 61789, new Class[]{Aweme.class}, Void.TYPE);
                    } else if (aweme2 != null && aweme2.getAwemeType() == 0) {
                        FollowFeed followFeed = new FollowFeed(aweme2);
                        d.a().updateCurDongtaiCount(1);
                        if (userStateFeedViewHolder.mLoadingStatusView.getVisibility() == 0) {
                            userStateFeedViewHolder.mLoadingStatusView.setVisibility(8);
                        }
                        ((UserStateFeedAdapter) userStateFeedViewHolder.j).insertData(followFeed, 0);
                    }
                }
            } else if (this.f3669b != null && this.f3669b.e()) {
                String str = (String) arVar2.f45293c;
                if (!TextUtils.isEmpty(str)) {
                    ((UserStateFeedViewHolder) this.f2979f).a(str);
                }
            }
        }
    }

    public final void a(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f3668a, false, 61776, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f3668a, false, 61776, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (a(user2) && com.ss.android.ugc.aweme.newfollow.a.a.a(aweme2, user2, r(), a(true)) && !com.ss.android.ugc.aweme.newfollow.a.b.a(user)) {
            com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, a(true));
            com.ss.android.ugc.aweme.newfollow.g.a.a(aweme2, user.getUid(), "head", a(true), "list");
        }
    }

    public final void b(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f3668a, false, 61777, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f3668a, false, 61777, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (a(user2) && com.ss.android.ugc.aweme.newfollow.a.a.b(aweme2, user2, r(), a(true))) {
            com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, a(true));
            com.ss.android.ugc.aweme.newfollow.g.a.a(aweme2, user.getUid(), "name", a(true), "list");
        }
    }
}
