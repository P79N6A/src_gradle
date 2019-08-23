package com.ss.android.ugc.aweme.newfollow.vh;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.IFollowFeedFetchTrigger;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.c.a;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.newfollow.f.f;
import com.ss.android.ugc.aweme.newfollow.ui.j;
import com.ss.android.ugc.aweme.newfollow.util.FeedImpressionReporter;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class FlowFeedViewHolder<T extends FeedAdapter, D extends b> implements SwipeRefreshLayout.b, LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.common.d.b<RecyclerView.ViewHolder>, o, j {
    public static ChangeQuickRedirect i;

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.newfollow.b.b f57528a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f57529b;
    @BindDimen(2131231021)
    int feedSpaceSize;
    public T j;
    public LinearLayoutManager k;
    public AbsFragment l;
    public f m;
    @BindView(2131497326)
    public DmtStatusView mLoadingStatusView;
    @Nullable
    @BindView(2131494357)
    NoticeView mNoticeGuideView;
    @BindView(2131495411)
    public NestedScrollingRecyclerView mRecyclerView;
    @Nullable
    @BindView(2131496683)
    protected SwipeRefreshLayout mRefreshLayout;
    @Nullable
    @BindView(2131494362)
    public DmtTextView mTvTopPrompt;
    public boolean n;
    protected HeaderAndFooterWrapper o;

    public abstract void R_();

    public void a(@IFollowFeedFetchTrigger.ILoadMoreType Integer num) {
    }

    public boolean b(List<D> list) {
        return true;
    }

    public abstract void c();

    public abstract T d();

    public void k() {
    }

    public void a(List<D> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 62160, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, i, false, 62160, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.mLoadingStatusView != null) {
                this.mLoadingStatusView.b();
                this.mLoadingStatusView.setVisibility(8);
            }
            this.mRecyclerView.setVisibility(0);
            if (this.j != null && b(list)) {
                this.j.setData(list);
            }
            c(z);
        }
    }

    public void a(List<D> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, i, false, 62162, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, i, false, 62162, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.setData(list);
        }
    }

    public void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, i, false, 62168, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, i, false, 62168, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.j != null && aVar.f57079a == 1) {
            this.j.b(aVar.f57080b);
        }
    }

    public final void a(String str, String str2, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i2)}, this, i, false, 62175, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i2)}, this, i, false, 62175, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j.a(str3, str4, i2);
    }

    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, i, false, 62179, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, i, false, 62179, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int c2 = this.j.c(str);
        if (c2 >= 0) {
            this.j.b(c2);
        }
    }

    public void a(String str, ForwardDetail forwardDetail) {
        if (PatchProxy.isSupport(new Object[]{str, forwardDetail}, this, i, false, 62180, new Class[]{String.class, ForwardDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, forwardDetail}, this, i, false, 62180, new Class[]{String.class, ForwardDetail.class}, Void.TYPE);
        } else if (forwardDetail != null) {
            this.j.a(str, forwardDetail.getAweme(), 0);
            this.j.a(str, forwardDetail.getComment());
        }
    }

    public final void a(final Exception exc, final Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{exc, aweme}, this, i, false, 62181, new Class[]{Exception.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, aweme}, this, i, false, 62181, new Class[]{Exception.class, Aweme.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                com.ss.android.ugc.aweme.captcha.c.b.a(this.l.getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57535a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f57535a, false, 62201, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f57535a, false, 62201, new Class[0], Void.TYPE);
                            return;
                        }
                        FlowFeedViewHolder.this.m.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f57535a, false, 62202, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f57535a, false, 62202, new Class[0], Void.TYPE);
                            return;
                        }
                        FlowFeedViewHolder.this.j.a(exc, aweme, FlowFeedViewHolder.this.m.c());
                    }
                });
            } else {
                this.j.a(exc, aweme, this.m.c());
            }
        }
    }

    public void a(boolean z, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aweme2}, this, i, false, 62188, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aweme2}, this, i, false, 62188, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE);
        } else if (!y.a()) {
            this.j.a(z, aweme2);
        }
    }

    public final void a(Aweme aweme, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str2}, this, i, false, 62189, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str2}, this, i, false, 62189, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        this.j.a(aweme2, str2);
    }

    public final void a(Aweme aweme, boolean z, String str, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0), str, new Long(j3)}, this, i, false, 62190, new Class[]{Aweme.class, Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {aweme, Byte.valueOf(z), str, new Long(j3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, i, false, 62190, new Class[]{Aweme.class, Boolean.TYPE, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        this.j.a(aweme, z, str, j2);
    }

    public com.ss.android.ugc.aweme.forward.a.a b() {
        if (!PatchProxy.isSupport(new Object[0], this, i, false, 62158, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class)) {
            return new com.ss.android.ugc.aweme.forward.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57533a;

                public final String e() {
                    return "key_container_default";
                }

                public final Object a() {
                    return FlowFeedViewHolder.this.j;
                }

                public final boolean b() {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, f57533a, false, 62198, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57533a, false, 62198, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (FlowFeedViewHolder.this.l != null && FlowFeedViewHolder.this.l.isViewValid()) {
                        z = true;
                    }
                    return z;
                }

                public final Context d() {
                    if (PatchProxy.isSupport(new Object[0], this, f57533a, false, 62200, new Class[0], Context.class)) {
                        return (Context) PatchProxy.accessDispatch(new Object[0], this, f57533a, false, 62200, new Class[0], Context.class);
                    } else if (FlowFeedViewHolder.this.l != null) {
                        return FlowFeedViewHolder.this.l.getActivity();
                    } else {
                        return FlowFeedViewHolder.this.mRecyclerView.getContext();
                    }
                }

                public final boolean c() {
                    if (PatchProxy.isSupport(new Object[0], this, f57533a, false, 62199, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57533a, false, 62199, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (FlowFeedViewHolder.this.l == null || !FlowFeedViewHolder.this.l.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED) || !FlowFeedViewHolder.this.l.getUserVisibleHint()) {
                        return false;
                    } else {
                        return true;
                    }
                }
            };
        }
        return (com.ss.android.ugc.aweme.forward.a.a) PatchProxy.accessDispatch(new Object[0], this, i, false, 62158, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class);
    }

    public Context getContext() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62171, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, i, false, 62171, new Class[0], Context.class);
        } else if (this.l != null) {
            return this.l.getActivity();
        } else {
            return null;
        }
    }

    public boolean isViewValid() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62183, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, i, false, 62183, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.l != null && this.l.isViewValid()) {
            z = true;
        }
        return z;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 62184, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57528a != null) {
            this.f57528a.B_();
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 62185, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57528a != null) {
            this.f57528a.d();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 62186, new Class[0], Void.TYPE);
            return;
        }
        this.l = null;
        if (this.f57528a != null) {
            this.f57528a.e();
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 62194, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.h();
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 62195, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.i();
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 62159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 62159, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!NetworkUtils.isNetworkAvailable(getContext())) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgf).a();
            } else {
                R_();
            }
        }
    }

    public final void a(f fVar) {
        this.m = fVar;
    }

    public final void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, i, false, 62182, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, i, false, 62182, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.j.d(aweme2);
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 62177, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 62177, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.j.b(str2);
    }

    private boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 62170, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 62170, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if ("homepage_follow".equals(str2) || "homepage_friends".equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 62166, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 62166, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n = z;
        if (this.j != null) {
            this.j.setShowFooter(true);
            if (z) {
                this.j.resetLoadMoreState();
                return;
            }
            this.j.showLoadMoreEmpty();
        }
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 62187, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 62187, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f57528a != null) {
            if (z) {
                this.f57528a.B_();
                return;
            }
            this.f57528a.d();
        }
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 62163, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 62163, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            switch (i2) {
                case 1:
                    if (this.mLoadingStatusView != null) {
                        this.mLoadingStatusView.setVisibility(0);
                        this.mRecyclerView.setVisibility(4);
                        this.mLoadingStatusView.f();
                    }
                    if (this.j != null) {
                        this.j.showLoadMoreEmpty();
                        return;
                    }
                    break;
                case 2:
                    if (!(this.j == null || this.mLoadingStatusView == null)) {
                        this.mLoadingStatusView.setVisibility(0);
                        this.mLoadingStatusView.d();
                        return;
                    }
                case 3:
                    a((List<D>) null);
                    if (this.mLoadingStatusView != null) {
                        this.mLoadingStatusView.setVisibility(8);
                    }
                    if (this.j != null) {
                        this.j.showLoadMoreEmpty();
                        return;
                    }
                    break;
                case 4:
                    if (this.mLoadingStatusView != null) {
                        this.mLoadingStatusView.b();
                        this.mLoadingStatusView.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }

    public boolean c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 62165, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 62165, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return true;
        } else {
            switch (i2) {
                case 1:
                    if (this.j != null) {
                        this.j.showPullUpLoadMore();
                    }
                    return true;
                case 2:
                    if (this.j != null) {
                        this.j.showLoadMoreLoading();
                    }
                    return true;
                case 3:
                    if (this.j != null) {
                        this.j.showLoadMoreEmpty();
                    }
                    return true;
                default:
                    return false;
            }
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder) {
        String str;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, i, false, 62169, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, i, false, 62169, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (viewHolder instanceof BaseFollowViewHolder) {
            BaseFollowViewHolder baseFollowViewHolder = (BaseFollowViewHolder) viewHolder;
            if (baseFollowViewHolder.j != null && b(baseFollowViewHolder.d())) {
                FeedImpressionReporter.a("feed").b(baseFollowViewHolder.j.getAid());
            }
        }
        if (viewHolder instanceof BaseForwardViewHolder) {
            BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) viewHolder;
            if (baseForwardViewHolder.f48319d != null && b(baseForwardViewHolder.t())) {
                FeedImpressionReporter.a("feed").b(baseForwardViewHolder.f48319d.getAid());
            }
        }
        if (viewHolder instanceof RecommendFriendItemViewV2Holder) {
            User a2 = ((RecommendFriendItemViewV2Holder) viewHolder).a();
            int adapterPosition = viewHolder.getAdapterPosition() - 2;
            if (this.f57529b == null) {
                this.f57529b = new ArrayList();
            }
            if (a2 != null && !this.f57529b.contains(a2.getUid())) {
                if (a2.isNewRecommend()) {
                    str = "new";
                } else {
                    str = "past";
                }
                k.a().a(3, a2.getUid());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("rec_uid", a2.getUid());
                    jSONObject.put("enter_from", "homepage_friends");
                    jSONObject.put("event_type", "impression");
                    jSONObject.put("impr_order", adapterPosition);
                    jSONObject.put("req_id", a2.getRequestId());
                    jSONObject.put("page_status", "empty");
                    jSONObject.put("rec_reason", a2.getRecommendReason());
                    jSONObject.put("card_type", str);
                } catch (JSONException unused) {
                }
                r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("homepage_follow").setJsonObject(jSONObject));
                r.a("follow_card", jSONObject);
                this.f57529b.add(a2.getUid());
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 62164, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 62164, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mRefreshLayout != null) {
            this.mRefreshLayout.setRefreshing(z);
        }
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, i, false, 62174, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, i, false, 62174, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.j.a(str3, str4);
    }

    public void b(List<D> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 62161, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, i, false, 62161, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.j != null) {
                this.j.setDataAfterLoadMore(list);
            }
            c(z);
        }
    }

    public final void a(AbsFragment absFragment, View view, com.ss.android.ugc.aweme.newfollow.f.b bVar, com.ss.android.ugc.aweme.newfollow.b.a aVar, String str, int i2, String str2) {
        if (PatchProxy.isSupport(new Object[]{absFragment, view, bVar, aVar, str, Integer.valueOf(i2), str2}, this, i, false, 62156, new Class[]{AbsFragment.class, View.class, com.ss.android.ugc.aweme.newfollow.f.b.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absFragment, view, bVar, aVar, str, Integer.valueOf(i2), str2}, this, i, false, 62156, new Class[]{AbsFragment.class, View.class, com.ss.android.ugc.aweme.newfollow.f.b.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(absFragment, view, bVar, aVar, str, i2, "", str2);
    }

    @SuppressLint({"TooManyMethodParam"})
    public final void a(AbsFragment absFragment, View view, com.ss.android.ugc.aweme.newfollow.f.b bVar, com.ss.android.ugc.aweme.newfollow.b.a aVar, String str, int i2, String str2, String str3) {
        AbsFragment absFragment2 = absFragment;
        View view2 = view;
        com.ss.android.ugc.aweme.newfollow.f.b bVar2 = bVar;
        com.ss.android.ugc.aweme.newfollow.b.a aVar2 = aVar;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{absFragment2, view2, bVar2, aVar2, str4, Integer.valueOf(i2), str5, str6}, this, i, false, 62157, new Class[]{AbsFragment.class, View.class, com.ss.android.ugc.aweme.newfollow.f.b.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absFragment2, view2, bVar2, aVar2, str4, Integer.valueOf(i2), str5, str6}, this, i, false, 62157, new Class[]{AbsFragment.class, View.class, com.ss.android.ugc.aweme.newfollow.f.b.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        this.l = absFragment2;
        ButterKnife.bind((Object) this, view2);
        this.k = new WrapLinearLayoutManager(this.l.getContext());
        this.k.setOrientation(1);
        this.mRecyclerView.setLayoutManager(this.k);
        this.j = d();
        this.j.m = bVar2;
        this.j.n = bVar2;
        this.j.o = aVar2;
        this.j.r = b();
        this.j.setLoadMoreListener(this);
        this.j.p = this;
        this.j.u = str4;
        this.j.v = str5;
        this.j.x = i2;
        this.j.t = str6;
        this.o = new HeaderAndFooterWrapper(this.j);
        this.mRecyclerView.setAdapter(this.o);
        this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57530a;

            /* renamed from: b  reason: collision with root package name */
            boolean f57531b;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57530a, false, 62196, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57530a, false, 62196, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (this.f57531b && FlowFeedViewHolder.this.k.findLastVisibleItemPosition() >= FlowFeedViewHolder.this.k.getItemCount() - 5 && FlowFeedViewHolder.this.n) {
                    FlowFeedViewHolder.this.a((Integer) 5);
                }
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57530a, false, 62197, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57530a, false, 62197, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (i2 > 0) {
                    z = true;
                }
                this.f57531b = z;
            }
        });
        if (this.mRefreshLayout != null) {
            this.mRefreshLayout.setOnRefreshListener(this);
        }
        this.f57528a = this.j.g();
        c();
    }
}
