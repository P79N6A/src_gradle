package com.ss.android.ugc.aweme.newfollow.vh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.base.api.a.a.c;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.newfollow.b.d;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.profile.presenter.y;
import com.ss.android.ugc.aweme.profile.ui.RecommendUserActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserAdapter;
import com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserCardViewHolder;
import java.util.ArrayList;
import java.util.List;

public class FollowFeedEmptyItemViewHolder extends RecyclerView.ViewHolder implements b<RecommendUserCardViewHolder>, o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57551a;

    /* renamed from: b  reason: collision with root package name */
    public Context f57552b;

    /* renamed from: c  reason: collision with root package name */
    public DmtDefaultView f57553c;

    /* renamed from: d  reason: collision with root package name */
    public RecommendCommonUserView f57554d;

    /* renamed from: e  reason: collision with root package name */
    public y f57555e;

    /* renamed from: f  reason: collision with root package name */
    public d f57556f;
    public String g;
    public String h = "";
    public boolean i;
    private List<String> j;

    public void onLoadMoreRecommendSuccess(RecommendList recommendList) {
    }

    public final int a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f57551a, false, 62215, new Class[]{User.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{user}, this, f57551a, false, 62215, new Class[]{User.class}, Integer.TYPE)).intValue();
        } else if (user != null) {
            return this.f57555e.a(user.getUid());
        } else {
            return 0;
        }
    }

    public void onRecommendFailed(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f57551a, false, 62212, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f57551a, false, 62212, new Class[]{Exception.class}, Void.TYPE);
        } else if (exc instanceof c) {
            this.f57554d.setVisibility(8);
        } else {
            a.a(this.f57552b, (Throwable) exc);
        }
    }

    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder) {
        RecommendUserCardViewHolder recommendUserCardViewHolder = (RecommendUserCardViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{recommendUserCardViewHolder}, this, f57551a, false, 62214, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendUserCardViewHolder}, this, f57551a, false, 62214, new Class[]{RecommendUserCardViewHolder.class}, Void.TYPE);
            return;
        }
        if (recommendUserCardViewHolder != null) {
            User user = recommendUserCardViewHolder.f63087d;
            if (user != null) {
                if (this.j == null) {
                    this.j = new ArrayList();
                }
                if (!this.j.contains(user.getUid())) {
                    k.a().a(2, user.getUid());
                    if (com.ss.android.g.a.a()) {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "impression", a(user), this.g);
                    } else {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "impression", a(user), this.g, "empty", this.h);
                    }
                    this.j.add(user.getUid());
                }
            }
        }
    }

    public void onRefreshRecommendSuccess(RecommendList recommendList) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{recommendList}, this, f57551a, false, 62213, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList}, this, f57551a, false, 62213, new Class[]{RecommendList.class}, Void.TYPE);
        } else if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() < 3) {
            this.f57554d.setVisibility(8);
        } else {
            this.g = recommendList.rid;
            RecommendCommonUserView recommendCommonUserView = this.f57554d;
            if (recommendList.getUserList().size() < 10) {
                z = false;
            }
            recommendCommonUserView.setShowLookMore(z);
            this.f57554d.a(recommendList.getUserList(), this.g);
            this.f57554d.setOnItemOperationListener(new RecommendUserAdapter.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57557a;

                public final void b(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62218, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62218, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    FollowFeedEmptyItemViewHolder.this.f57554d.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f57559a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f57559a, false, 62221, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f57559a, false, 62221, new Class[0], Void.TYPE);
                                return;
                            }
                            FollowFeedEmptyItemViewHolder.this.f57554d.setVisibility(8);
                        }
                    });
                }

                public final void a(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62217, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62217, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (com.ss.android.g.a.a()) {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "delete", FollowFeedEmptyItemViewHolder.this.a(user), FollowFeedEmptyItemViewHolder.this.g);
                    } else {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "delete", FollowFeedEmptyItemViewHolder.this.a(user), FollowFeedEmptyItemViewHolder.this.g, "empty", FollowFeedEmptyItemViewHolder.this.h);
                    }
                    if (FollowFeedEmptyItemViewHolder.this.f57555e != null) {
                        FollowFeedEmptyItemViewHolder.this.f57555e.a(user);
                    }
                }

                public final void c(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62219, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62219, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                    } else if (com.ss.android.g.a.a()) {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "follow", FollowFeedEmptyItemViewHolder.this.a(user), FollowFeedEmptyItemViewHolder.this.g);
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user);
                    } else {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "follow", FollowFeedEmptyItemViewHolder.this.a(user), FollowFeedEmptyItemViewHolder.this.g, "empty", FollowFeedEmptyItemViewHolder.this.h);
                        com.ss.android.ugc.aweme.newfollow.g.a.a(FollowFeedEmptyItemViewHolder.this.g, user.getUid(), true, user.getFollowStatus());
                    }
                }

                public final void d(User user, int i) {
                    if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62220, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f57557a, false, 62220, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                    } else if (com.ss.android.g.a.a()) {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "enter_profile", FollowFeedEmptyItemViewHolder.this.a(user), FollowFeedEmptyItemViewHolder.this.g);
                        com.ss.android.ugc.aweme.newfollow.g.a.a(FollowFeedEmptyItemViewHolder.this.g, user);
                    } else {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user, "enter_profile", FollowFeedEmptyItemViewHolder.this.a(user), FollowFeedEmptyItemViewHolder.this.g, "empty", FollowFeedEmptyItemViewHolder.this.h);
                        com.ss.android.ugc.aweme.newfollow.g.a.a(user.getUid(), FollowFeedEmptyItemViewHolder.this.g, true);
                    }
                }
            });
            this.f57554d.setOnLookMoreUserListener(new RecommendCommonUserView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57561a;

                public final void a(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f57561a, false, 62222, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f57561a, false, 62222, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    RecommendUserActivity.a(FollowFeedEmptyItemViewHolder.this.f57552b, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), 2, "homepage_follow", str2);
                    if (com.ss.android.g.a.a()) {
                        com.ss.android.ugc.aweme.newfollow.g.a.c();
                    } else {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(true);
                    }
                }
            });
            this.f57554d.setVisibility(0);
        }
    }

    public FollowFeedEmptyItemViewHolder(View view, Context context, String str) {
        super(view);
        this.h = str;
        this.f57552b = context;
        this.f57553c = (DmtDefaultView) view.findViewById(C0906R.id.a38);
        this.f57554d = (RecommendCommonUserView) view.findViewById(C0906R.id.duf);
        this.f57554d.setBackgroundResource(C0906R.color.ano);
        this.f57554d.setOnViewAttachedToWindowListener(this);
    }
}
