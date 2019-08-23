package com.ss.android.ugc.aweme.newfollow.f;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.a.a;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.b.d;
import com.ss.android.ugc.aweme.newfollow.c.c;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment;
import com.ss.android.ugc.aweme.newfollow.vh.n;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class e extends b<b, n> implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3644a;

    /* renamed from: b  reason: collision with root package name */
    public FollowFeedFragment f3645b;
    public boolean s;

    public final /* bridge */ /* synthetic */ Fragment c() {
        return this.f3645b;
    }

    public String getEventType() {
        return this.f3645b.n;
    }

    /* renamed from: s */
    public final b i() {
        return (b) this.f2978e;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3644a, false, 61288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3644a, false, 61288, new Class[0], Void.TYPE);
            return;
        }
        a.a((Fragment) this.f3645b, (a.C0649a) null);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3644a, false, 61284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3644a, false, 61284, new Class[0], Void.TYPE);
            return;
        }
        if (this.s) {
            this.s = false;
            ((b) this.f2978e).f47767d = false;
            bg.a(new ae("FOLLOW"));
        }
    }

    public final void b() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3644a, false, 61285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3644a, false, 61285, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2978e != null && this.f2979f != null && ((n) this.f2979f).isViewValid()) {
            d();
            ((n) this.f2979f).b(false);
            int i = ((b) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    n nVar = (n) this.f2979f;
                    List<FollowFeed> items = ((b) this.f2978e).getItems();
                    if (((b) this.f2978e).isHasMore() && !((b) this.f2978e).isNewDataEmpty()) {
                        z2 = true;
                    }
                    nVar.b(items, z2);
                }
                return;
            }
            bg.a(new c(0));
            if (((b) this.f2978e).isDataEmpty()) {
                ((n) this.f2979f).a(3);
                ((n) this.f2979f).e(false);
                return;
            }
            ((n) this.f2979f).g = ((b) this.f2978e).i;
            ((n) this.f2979f).a(((b) this.f2978e).getItems(), ((b) this.f2978e).isHasMore());
            n nVar2 = (n) this.f2979f;
            b bVar = (b) this.f2978e;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f47764a, false, 44649, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar, b.f47764a, false, 44649, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (bVar.mData == null || ((FollowFeedList) bVar.mData).getUpPhoneNotice() != 1) {
                z = false;
            } else {
                z = true;
            }
            nVar2.e(z);
            n nVar3 = (n) this.f2979f;
            b bVar2 = (b) this.f2978e;
            if (PatchProxy.isSupport(new Object[0], bVar2, b.f47764a, false, 44665, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], bVar2, b.f47764a, false, 44665, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (bVar2.mData != null && ((FollowFeedList) bVar2.mData).getIsRecommend() == 1) {
                z2 = true;
            }
            nVar3.u = z2;
        }
    }

    public e(FollowFeedFragment followFeedFragment) {
        this.f3645b = followFeedFragment;
    }

    public final String a(boolean z) {
        return this.f3645b.n;
    }

    @Subscribe
    public void onHideUploadRecoverEvent(com.ss.android.ugc.aweme.shortvideo.f.d dVar) {
        com.ss.android.ugc.aweme.shortvideo.f.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3644a, false, 61289, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3644a, false, 61289, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.d.class}, Void.TYPE);
            return;
        }
        f(dVar2.f67639a);
    }

    @Subscribe
    public void onLogoutEvent(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3644a, false, 61290, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3644a, false, 61290, new Class[]{g.class}, Void.TYPE);
            return;
        }
        f(false);
    }

    private void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3644a, false, 61291, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3644a, false, 61291, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.getPublishService().setUploadRecoverPath(null);
        }
        if (this.f2979f != null && ((n) this.f2979f).isViewValid()) {
            ((n) this.f2979f).f(z);
        }
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f3644a, false, 61286, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f3644a, false, 61286, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        d();
        if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            r.a("homepage_follow_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("error_type", "follow_feed_error").a("error_code", ((com.ss.android.ugc.aweme.base.api.a.b.a) exc2).getErrorCode()).f34114b);
        } else {
            r.a("homepage_follow_monitor", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("error_type", "follow_feed_error").a("error_code", 4).f34114b);
        }
    }

    public final void b(Aweme aweme) {
        String str;
        Aweme aweme2 = aweme;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f3644a, false, 61287, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f3644a, false, 61287, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme.getAuthor().getFollowStatus() != 0) {
            z = true;
        }
        if (z) {
            str = "follow_cancel";
        } else {
            str = "follow";
        }
        com.ss.android.ugc.aweme.newfollow.g.a.a(str, a(true), aweme2);
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3644a, false, 61292, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3644a, false, 61292, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (this.f2979f != null && ((n) this.f2979f).isViewValid() && !TextUtils.isEmpty(followStatus2.userId)) {
            n nVar = (n) this.f2979f;
            if (PatchProxy.isSupport(new Object[]{followStatus2}, nVar, n.f57731a, false, 62268, new Class[]{FollowStatus.class}, Void.TYPE)) {
                n nVar2 = nVar;
                PatchProxy.accessDispatch(new Object[]{followStatus2}, nVar2, n.f57731a, false, 62268, new Class[]{FollowStatus.class}, Void.TYPE);
                return;
            }
            FollowFeedAdapter followFeedAdapter = (FollowFeedAdapter) nVar.j;
            if (PatchProxy.isSupport(new Object[]{followStatus2}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61103, new Class[]{FollowStatus.class}, Void.TYPE)) {
                FollowFeedAdapter followFeedAdapter2 = followFeedAdapter;
                PatchProxy.accessDispatch(new Object[]{followStatus2}, followFeedAdapter2, FollowFeedAdapter.f57068f, false, 61103, new Class[]{FollowStatus.class}, Void.TYPE);
                return;
            }
            if (!CollectionUtils.isEmpty(followFeedAdapter.getData())) {
                for (com.ss.android.ugc.aweme.newfollow.e.b bVar : followFeedAdapter.getData()) {
                    FollowFeed followFeed = (FollowFeed) bVar;
                    if (followFeed.getFeedType() == 65281 && !CollectionUtils.isEmpty(followFeed.getUser())) {
                        for (User next : followFeed.getUser()) {
                            if (TextUtils.equals(next.getUid(), followStatus2.userId) && next.getFollowStatus() != followStatus2.followStatus) {
                                next.setFollowStatus(followStatus2.followStatus);
                                next.setWatchStatus(followStatus2.watchStatus);
                                List<User> user = followFeed.getUser();
                                if (PatchProxy.isSupport(new Object[]{user}, followFeedAdapter, FollowFeedAdapter.f57068f, false, 61102, new Class[]{List.class}, Void.TYPE)) {
                                    FollowFeedAdapter followFeedAdapter3 = followFeedAdapter;
                                    PatchProxy.accessDispatch(new Object[]{user}, followFeedAdapter3, FollowFeedAdapter.f57068f, false, 61102, new Class[]{List.class}, Void.TYPE);
                                } else if (followFeedAdapter.L != null && !CollectionUtils.isEmpty(followFeedAdapter.mItems) && followFeedAdapter.mItems.contains(followFeedAdapter.J)) {
                                    int indexOf = followFeedAdapter.mItems.indexOf(followFeedAdapter.J);
                                    followFeedAdapter.L.a(user, followFeedAdapter.J.getRequestId());
                                    followFeedAdapter.notifyItemChanged(indexOf);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
