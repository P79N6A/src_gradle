package com.ss.android.ugc.aweme.follow;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a;
import com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.h.x;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.k;
import com.ss.android.ugc.aweme.follow.FollowFeedAdapter;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.ui.FollowTabGridItemDecoration;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.bk;
import com.ss.android.ugc.aweme.main.story.e;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class FollowCellFeedFragmentPanel extends k implements b<AbsCellViewHolder>, c<FollowFeed>, d, x, FollowFeedAdapter.a, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3249a;

    /* renamed from: b  reason: collision with root package name */
    a f3250b;

    /* renamed from: c  reason: collision with root package name */
    FollowFeedAdapter f3251c;

    /* renamed from: d  reason: collision with root package name */
    public n f3252d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3253e = true;

    /* renamed from: f  reason: collision with root package name */
    protected String f3254f;
    protected boolean g;
    public int h;
    public WrapGridLayoutManager i;
    private com.ss.android.ugc.aweme.feed.guide.b j;
    private e k;
    private m l;
    private com.ss.android.ugc.aweme.common.d.a m;
    @BindView(2131495411)
    RecyclerView mListView;
    @BindView(2131496683)
    SwipeRefreshLayout mRefreshLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    private FollowTabGridItemDecoration n;

    public final void a(List list, int i2) {
    }

    public final boolean h() {
        return true;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44518, new Class[0], Void.TYPE);
            return;
        }
        FeedImpressionReporter.a("feed").d();
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44528, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.a();
        }
    }

    public final void ay() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44512, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44512, new Class[0], Void.TYPE);
            return;
        }
        super.ay();
        if (this.aq) {
            this.f3253e = false;
            m();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44538, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44538, new Class[0], Void.TYPE);
            return;
        }
        this.f3253e = false;
        m();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44511, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        if (((MainActivity) this.ar).isUnderSecondTab() && this.aq) {
            j();
            e(true);
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44519, new Class[0], Void.TYPE);
        } else if (bc()) {
            this.f3251c.showLoadMoreLoading();
        }
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44522, new Class[0], Void.TYPE);
            return;
        }
        if (bc() && !this.g) {
            this.f3250b.setRefreshing(true);
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44527, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f3251c == null || this.f3253e || this.mListView == null)) {
            int childCount = this.mListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(this.mListView.getChildAt(i2));
                if (childViewHolder.getItemViewType() == 0) {
                    a((AbsCellViewHolder) childViewHolder);
                }
            }
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44542, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44542, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3251c == null || this.f3251c.mItems == null || this.f3251c.mItems.size() <= 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44514, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (this.f3251c.getItemCount() == 0) {
                this.f3250b.setRefreshing(false);
                this.mStatusView.setVisibility(0);
                this.mStatusView.d();
                return;
            }
            this.f3250b.setRefreshing(true);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44516, new Class[0], Void.TYPE);
        } else if (bc()) {
            this.f3251c.setData(null);
            this.f3250b.setRefreshing(false);
            this.mStatusView.setVisibility(0);
            this.mStatusView.e();
            this.j.b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44537, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3249a, false, 44526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3249a, false, 44526, new Class[0], Void.TYPE);
        } else if (bc()) {
            int childCount = this.mListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(this.mListView.getChildAt(i2));
                if (childViewHolder.getItemViewType() == 0) {
                    AbsCellViewHolder absCellViewHolder = (AbsCellViewHolder) childViewHolder;
                    if (absCellViewHolder != null && !absCellViewHolder.k()) {
                        absCellViewHolder.b();
                        absCellViewHolder.d(true);
                    }
                }
            }
        }
        e(false);
        j();
    }

    public final void d(boolean z) {
        this.g = z;
    }

    public final void c(boolean z) {
        if (this.n != null && this.mListView != null) {
            this.n.f47799b = z;
        }
    }

    /* access modifiers changed from: private */
    public void a(AbsCellViewHolder absCellViewHolder) {
        if (PatchProxy.isSupport(new Object[]{absCellViewHolder}, this, f3249a, false, 44539, new Class[]{AbsCellViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absCellViewHolder}, this, f3249a, false, 44539, new Class[]{AbsCellViewHolder.class}, Void.TYPE);
        } else if (absCellViewHolder != null && bc()) {
            this.f3253e = true;
            JSONObject b2 = com.ss.android.ugc.aweme.feed.a.a().b(absCellViewHolder.c(), this.h);
            try {
                b2.put("display", "dual");
                b2.put("style", "text");
            } catch (JSONException unused) {
            }
            r.a((Context) this.ar, "show", "homepage_follow", absCellViewHolder.j(), 0, b2);
            FeedImpressionReporter.a("feed").b(absCellViewHolder.j());
        }
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f3249a, false, 44525, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f3249a, false, 44525, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.mListView.post(new Runnable(0) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47702a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f47702a, false, 44545, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47702a, false, 44545, new Class[0], Void.TYPE);
                    return;
                }
                FollowCellFeedFragmentPanel.this.mListView.scrollToPosition(0);
            }
        });
    }

    private void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3249a, false, 44534, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3249a, false, 44534, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.a(false, z);
        }
    }

    public final void a_(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3249a, false, 44540, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3249a, false, 44540, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (bc()) {
            this.f3251c.notifyItemRemoved(i2);
        }
    }

    public final void b_(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3249a, false, 44544, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3249a, false, 44544, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3251c != null) {
            int a2 = this.f3251c.a();
            if (a2 >= 0) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.mListView.findViewHolderForAdapterPosition(a2);
                if (findViewHolderForAdapterPosition != null && e.class.isAssignableFrom(findViewHolderForAdapterPosition.getClass())) {
                    ((e) findViewHolderForAdapterPosition).b_(z);
                }
            }
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3249a, false, 44520, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3249a, false, 44520, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.f3251c.showLoadMoreError();
        }
    }

    public final void d(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3249a, false, 44523, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3249a, false, 44523, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.f3250b.setRefreshing(false);
            if (!this.g) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.b6v).a();
            }
        }
    }

    @Subscribe
    public void onDeleteItemEvent(com.ss.android.ugc.aweme.newfollow.c.a aVar) {
        com.ss.android.ugc.aweme.newfollow.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3249a, false, 44529, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3249a, false, 44529, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE);
            return;
        }
        if (aVar2.f57079a == 2) {
            this.f3251c.a(false);
        }
    }

    @Subscribe
    public void onDynamicEvent(com.ss.android.ugc.aweme.challenge.a.c cVar) {
        com.ss.android.ugc.aweme.challenge.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3249a, false, 44532, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3249a, false, 44532, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE);
        } else if (cVar2.f35317a == 0) {
            e(true);
        } else {
            m();
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3249a, false, 44515, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3249a, false, 44515, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.f3251c.setData(null);
            this.f3250b.setRefreshing(false);
            this.mStatusView.setVisibility(0);
            this.mStatusView.f();
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3249a, false, 44531, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3249a, false, 44531, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        if (bc() && !g()) {
            FollowFeedAdapter followFeedAdapter = this.f3251c;
            if (PatchProxy.isSupport(new Object[]{followStatus2}, followFeedAdapter, FollowFeedAdapter.f47707a, false, 44551, new Class[]{FollowStatus.class}, Void.TYPE)) {
                FollowFeedAdapter followFeedAdapter2 = followFeedAdapter;
                PatchProxy.accessDispatch(new Object[]{followStatus2}, followFeedAdapter2, FollowFeedAdapter.f47707a, false, 44551, new Class[]{FollowStatus.class}, Void.TYPE);
            } else if (followFeedAdapter.mItems != null && !followFeedAdapter.mItems.isEmpty() && followStatus2 != null && !TextUtils.isEmpty(followStatus2.userId)) {
                int size = followFeedAdapter.mItems.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((FollowFeed) followFeedAdapter.mItems.get(i2)).getFeedType() == 65280) {
                        Aweme aweme = ((FollowFeed) followFeedAdapter.mItems.get(i2)).getAweme();
                        if (aweme != null) {
                            User author = aweme.getAuthor();
                            if (author != null && followStatus2.userId.equals(author.getUid())) {
                                author.setFollowStatus(followStatus2.followStatus);
                            }
                        }
                    } else if (((FollowFeed) followFeedAdapter.mItems.get(i2)).getFeedType() == 65281) {
                        List<User> user = ((FollowFeed) followFeedAdapter.mItems.get(i2)).getUser();
                        if (user != null) {
                            for (User next : user) {
                                if (next != null && followStatus2.userId.equals(next.getUid())) {
                                    next.setFollowStatus(followStatus2.followStatus);
                                    followFeedAdapter.notifyItemChanged(i2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3249a, false, 44530, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3249a, false, 44530, new Class[]{ar.class}, Void.TYPE);
        } else if (bc()) {
            switch (arVar.f45292b) {
                case 2:
                    String str = (String) arVar.f45293c;
                    if (!TextUtils.isEmpty(str)) {
                        int a2 = this.f3251c.a(str);
                        if (a2 >= 0 && !CollectionUtils.isEmpty(this.f3251c.mItems)) {
                            this.f3251c.mItems.remove(a2);
                            this.f3251c.notifyItemRemoved(a2);
                            if (this.f3251c.getItemCount() == 0) {
                                this.mStatusView.setVisibility(0);
                                this.mStatusView.e();
                                this.f3251c.showLoadMoreEmpty();
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
                case 13:
                    int childCount = this.mListView.getChildCount();
                    while (i2 < childCount) {
                        RecyclerView.ViewHolder childViewHolder = this.mListView.getChildViewHolder(this.mListView.getChildAt(i2));
                        if (childViewHolder.getItemViewType() == 0) {
                            ((AbsCellViewHolder) childViewHolder).l();
                        }
                        i2++;
                    }
                    return;
                case 14:
                    if (AbTestManager.a().v() == 2) {
                        int childCount2 = this.mListView.getChildCount();
                        while (i2 < childCount2) {
                            RecyclerView.ViewHolder childViewHolder2 = this.mListView.getChildViewHolder(this.mListView.getChildAt(i2));
                            if (childViewHolder2.getItemViewType() == 0) {
                                ((AbsCellViewHolder) childViewHolder2).l();
                            }
                            i2++;
                        }
                        break;
                    }
                    break;
                case 21:
                    Aweme aweme = (Aweme) arVar.f45293c;
                    if (aweme != null) {
                        int a3 = this.f3251c.a(aweme.getAid());
                        if (a3 != -1) {
                            this.i.scrollToPositionWithOffset(a3, 0);
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
                case 22:
                    this.f3251c.notifyDataSetChanged();
                    if (this.f3251c.getItemCount() == 0) {
                        this.mStatusView.setVisibility(0);
                        this.mStatusView.e();
                        this.f3251c.showLoadMoreEmpty();
                        return;
                    }
                    break;
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3249a, false, 44533, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3249a, false, 44533, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f3251c.resetLoadMoreState();
        } else {
            this.f3251c.showLoadMoreEmpty();
        }
    }

    public final void a(List<FollowFeed> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3249a, false, 44517, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3249a, false, 44517, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.mStatusView.b();
            this.mStatusView.setVisibility(8);
            this.f3250b.setRefreshing(false);
            this.f3251c.setData(list);
            b(z);
            if (this.f3252d != null) {
                this.f3252d.p();
            }
            e(true);
            i();
            com.ss.android.ugc.aweme.newfollow.util.k.a().c();
        }
    }

    public final void c(List<FollowFeed> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3249a, false, 44524, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3249a, false, 44524, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            if (z || this.g) {
                this.f3251c.setDataAfterLoadLatest(list);
                if (!this.g && bq()) {
                    b(0);
                    e(true);
                }
            } else if (this.aq && this.ar != null && ((MainActivity) this.ar).isUnderMainTab()) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) this.ar, (int) C0906R.string.a3f).a();
                b(0);
            }
            this.f3250b.setRefreshing(false);
            i();
        }
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3249a, false, 44510, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3249a, false, 44510, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        Bundle bs = bs();
        if (bs != null && bs.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0) == 0) {
            AbTestManager.a().v();
        }
        if (this.h == 7) {
            AbTestManager.a().E();
        }
        this.f3251c = new FollowFeedAdapter(this, this.f3254f, this.k, this);
        this.f3251c.f47709c = this;
        this.i = new WrapGridLayoutManager((Context) this.ar, 2, 1, false);
        this.mListView.setLayoutManager(this.i);
        this.n = new FollowTabGridItemDecoration(2, (int) UIUtils.dip2Px(this.ar, 1.0f), false);
        this.n.f47799b = true;
        this.mListView.addItemDecoration(this.n);
        this.mListView.setAdapter(this.f3251c);
        OnAnimatedScrollListener onAnimatedScrollListener = new OnAnimatedScrollListener();
        this.mListView.addOnScrollListener(onAnimatedScrollListener);
        this.mListView = df.a(this.mListView, this.l);
        this.m = new com.ss.android.ugc.aweme.common.d.a(this.mListView, onAnimatedScrollListener);
        this.f3250b = new bk(this.mRefreshLayout);
        this.j = new com.ss.android.ugc.aweme.feed.guide.b(this.ar);
        com.ss.android.ugc.aweme.feed.guide.b bVar = this.j;
        Fragment fragment = this.as;
        if (PatchProxy.isSupport(new Object[]{fragment}, bVar, com.ss.android.ugc.aweme.feed.guide.b.f45380a, false, 41171, new Class[]{Fragment.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.feed.guide.b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{fragment}, bVar2, com.ss.android.ugc.aweme.feed.guide.b.f45380a, false, 41171, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        bVar.g = fragment;
        if (bVar.g instanceof FollowTabFragment) {
            bVar.h = AbTestManager.a().R();
        }
    }

    public final void b(List<FollowFeed> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3249a, false, 44521, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3249a, false, 44521, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.f3250b.setRefreshing(false);
            b(z);
            this.f3251c.setDataAfterLoadMore(list);
            e(true);
            i();
        }
    }

    public FollowCellFeedFragmentPanel(String str, e eVar, m mVar, int i2) {
        this.f3254f = str;
        this.k = eVar;
        this.l = mVar;
        this.h = i2;
    }
}
