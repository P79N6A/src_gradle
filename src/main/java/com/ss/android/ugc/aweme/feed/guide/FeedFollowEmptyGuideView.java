package com.ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.FeedFollowEmptyGuideAdapter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.newfollow.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007:\u0001IB\u001d\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010!\u001a\u00020\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010$\u001a\u00020\u001cJ\u0006\u0010%\u001a\u00020\rJ\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020'H\u0002J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020\u0014H\u0016J\b\u0010-\u001a\u00020'H\u0016J6\u0010.\u001a\u00020'2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0016J\b\u00105\u001a\u00020'H\u0007J\b\u00106\u001a\u00020'H\u0007J\u0018\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u000203H\u0016J\u0006\u0010:\u001a\u00020'J0\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020\u00062\u0006\u00109\u001a\u0002032\u0006\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\rH\u0016J\b\u0010@\u001a\u00020'H\u0016J\u0010\u0010A\u001a\u00020'2\u0006\u0010B\u001a\u000203H\u0016J\b\u0010C\u001a\u00020'H\u0016J\b\u0010D\u001a\u00020'H\u0016J\b\u0010E\u001a\u00020'H\u0016J\b\u0010F\u001a\u00020'H\u0016J\b\u0010G\u001a\u00020'H\u0016J\b\u0010H\u001a\u00020'H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/guide/FeedFollowEmptyGuideView;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/ugc/aweme/newfollow/ui/IRecommendView;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/base/activity/ViewEventListener;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/friends/adapter/RecommendAwemeViewHolder$RecommendAwemeClickListener;", "context", "Landroid/content/Context;", "fragment", "Landroid/support/v4/app/Fragment;", "enterFrom", "", "(Landroid/content/Context;Landroid/support/v4/app/Fragment;Ljava/lang/String;)V", "getEnterFrom", "()Ljava/lang/String;", "getFragment", "()Landroid/support/v4/app/Fragment;", "hasRecommendUser", "", "isViewValid", "mAdapter", "Lcom/ss/android/ugc/aweme/feed/adapter/FeedFollowEmptyGuideAdapter;", "mDefaultView", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultView;", "mIsRecommendLoadingMore", "mLine", "Landroid/view/View;", "mRecommendListPresenter", "Lcom/ss/android/ugc/aweme/newfollow/IRecommendListPresenter;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "buildHeaderView", "getActivity", "Landroid/app/Activity;", "getEmptyView", "getRequestId", "hideLoading", "", "initDefaultView", "initUnLoginView", "initUnUploadContactsView", "initView", "isEmpty", "loadMore", "onChangeItems", "feedList", "", "recentFansList", "cursor", "", "newUserCount", "onCreate", "onDestroy", "onRecommendAwemeItemClick", "aid", "position", "onUploadContactResult", "onViewEvent", "actionId", "user", "view", "enterMethod", "resetLoadMoreState", "setVisibility", "visibility", "showError", "showLoadEmpty", "showLoadMoreEmpty", "showLoadMoreError", "showLoadingMore", "updateUI", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FeedFollowEmptyGuideView extends LinearLayout implements LifecycleObserver, h<User>, LoadMoreRecyclerViewAdapter.a, RecommendAwemeViewHolder.a, k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3151a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f3152c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public FeedFollowEmptyGuideAdapter f3153b;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f3154d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.newfollow.a f3155e;

    /* renamed from: f  reason: collision with root package name */
    private DmtDefaultView f3156f;
    private View g;
    private boolean h;
    private boolean i;
    private boolean j;
    @NotNull
    private final Fragment k;
    @NotNull
    private final String l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/guide/FeedFollowEmptyGuideView$Companion;", "", "()V", "RECYCLER_VIEW_BOTTOM_MARGIN", "", "RECYCLER_VIEW_TOP_MARGIN", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeedFollowEmptyGuideView f45359b;

        b(FeedFollowEmptyGuideView feedFollowEmptyGuideView) {
            this.f45359b = feedFollowEmptyGuideView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f45358a, false, 41210, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f45358a, false, 41210, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            e.a((Activity) this.f45359b.getFragment().getActivity(), "homepage_follow", "click_follow_tab");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45360a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeedFollowEmptyGuideView f45361b;

        c(FeedFollowEmptyGuideView feedFollowEmptyGuideView) {
            this.f45361b = feedFollowEmptyGuideView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f45360a, false, 41211, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f45360a, false, 41211, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.newfollow.a.a.a(this.f45361b.getFragment(), (a.C0649a) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeedFollowEmptyGuideView f45363b;

        d(FeedFollowEmptyGuideView feedFollowEmptyGuideView) {
            this.f45363b = feedFollowEmptyGuideView;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f45362a, false, 41212, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f45362a, false, 41212, new Class[0], Void.TYPE);
                return;
            }
            FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter = this.f45363b.f3153b;
            if (feedFollowEmptyGuideAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            feedFollowEmptyGuideAdapter.showLoadMoreLoading();
        }
    }

    public final boolean S_() {
        return false;
    }

    public final void T_() {
        this.j = false;
    }

    public final void f() {
        this.j = false;
    }

    public final void g() {
        this.j = false;
    }

    @NotNull
    public final View getEmptyView() {
        return this;
    }

    public final void h() {
        this.j = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.i = true;
    }

    public final void y_() {
        this.j = false;
    }

    @NotNull
    public final String getEnterFrom() {
        return this.l;
    }

    @NotNull
    public final Fragment getFragment() {
        return this.k;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41200, new Class[0], Void.TYPE);
            return;
        }
        FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter = this.f3153b;
        if (feedFollowEmptyGuideAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        feedFollowEmptyGuideAdapter.resetLoadMoreState();
        this.j = false;
    }

    @Nullable
    public final Activity getActivity() {
        if (!PatchProxy.isSupport(new Object[0], this, f3151a, false, 41201, new Class[0], Activity.class)) {
            return this.k.getActivity();
        }
        return (Activity) PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41201, new Class[0], Activity.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r0 == null) goto L_0x0036;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getRequestId() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3151a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 41206(0xa0f6, float:5.7742E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3151a
            r5 = 0
            r6 = 41206(0xa0f6, float:5.7742E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.newfollow.a r0 = r9.f3155e
            if (r0 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r0.b()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.rid
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            java.lang.String r0 = ""
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.guide.FeedFollowEmptyGuideView.getRequestId():java.lang.String");
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41202, new Class[0], Void.TYPE);
            return;
        }
        this.f3154d.post(new d(this));
        this.j = true;
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41203, new Class[0], Void.TYPE);
            return;
        }
        if (this.i && !this.j) {
            com.ss.android.ugc.aweme.newfollow.a aVar = this.f3155e;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41204, new Class[0], Void.TYPE);
            return;
        }
        this.i = false;
        com.ss.android.ugc.aweme.newfollow.a aVar = this.f3155e;
        if (aVar != null) {
            aVar.a((k) null);
        }
    }

    private final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41192, new Class[0], Void.TYPE);
            return;
        }
        View view = this.g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLine");
        }
        view.setVisibility(4);
        DmtDefaultView dmtDefaultView = this.f3156f;
        if (dmtDefaultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        ViewGroup.LayoutParams layoutParams = dmtDefaultView.getLayoutParams();
        layoutParams.height = com.ss.android.ugc.aweme.framework.e.b.a(getContext(), 460.0f);
        DmtDefaultView dmtDefaultView2 = this.f3156f;
        if (dmtDefaultView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        dmtDefaultView2.setLayoutParams(layoutParams);
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840139).b((int) C0906R.string.agd).c(C0906R.string.ag6).a(com.bytedance.ies.dmt.ui.widget.a.SOLID, C0906R.string.a1l, new c(this)).f20493a;
        DmtDefaultView dmtDefaultView3 = this.f3156f;
        if (dmtDefaultView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        dmtDefaultView3.setStatus(cVar);
    }

    private final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41193, new Class[0], Void.TYPE);
            return;
        }
        View view = this.g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLine");
        }
        view.setVisibility(4);
        DmtDefaultView dmtDefaultView = this.f3156f;
        if (dmtDefaultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        ViewGroup.LayoutParams layoutParams = dmtDefaultView.getLayoutParams();
        layoutParams.height = com.ss.android.ugc.aweme.framework.e.b.a(getContext(), 460.0f);
        DmtDefaultView dmtDefaultView2 = this.f3156f;
        if (dmtDefaultView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        dmtDefaultView2.setLayoutParams(layoutParams);
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840145).b((int) C0906R.string.bi_).c(C0906R.string.ag7).a(com.bytedance.ies.dmt.ui.widget.a.SOLID, C0906R.string.dmv, new b(this)).f20493a;
        DmtDefaultView dmtDefaultView3 = this.f3156f;
        if (dmtDefaultView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        dmtDefaultView3.setStatus(cVar);
    }

    private final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41194, new Class[0], Void.TYPE);
            return;
        }
        View view = this.g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLine");
        }
        view.setVisibility(0);
        DmtDefaultView dmtDefaultView = this.f3156f;
        if (dmtDefaultView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        ViewGroup.LayoutParams layoutParams = dmtDefaultView.getLayoutParams();
        layoutParams.height = com.ss.android.ugc.aweme.framework.e.b.a(getContext(), 360.0f);
        DmtDefaultView dmtDefaultView2 = this.f3156f;
        if (dmtDefaultView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        dmtDefaultView2.setLayoutParams(layoutParams);
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840139).b((int) C0906R.string.agd).c(C0906R.string.bhd).f20493a;
        DmtDefaultView dmtDefaultView3 = this.f3156f;
        if (dmtDefaultView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDefaultView");
        }
        dmtDefaultView3.setStatus(cVar);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41197, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            k();
        } else {
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<Boolean> isContactsUploaded = inst.getIsContactsUploaded();
            Intrinsics.checkExpressionValueIsNotNull(isContactsUploaded, "SharePrefCache.inst().isContactsUploaded");
            Object c2 = isContactsUploaded.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().isContactsUploaded.cache");
            if (((Boolean) c2).booleanValue()) {
                l();
                if (!this.h) {
                    this.f3155e = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createRecommendListPresenter();
                    com.ss.android.ugc.aweme.newfollow.a aVar = this.f3155e;
                    if (aVar != null) {
                        aVar.a(2);
                        aVar.a((k) this);
                        aVar.a();
                    }
                    FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter = this.f3153b;
                    if (feedFollowEmptyGuideAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    }
                    feedFollowEmptyGuideAdapter.showLoadMoreLoading();
                }
            } else {
                j();
            }
        }
    }

    public final void setVisibility(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3151a, false, 41196, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3151a, false, 41196, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0) {
            a();
        }
    }

    public final void a(@NotNull String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f3151a, false, 41207, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f3151a, false, 41207, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "aid");
        com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
        a2.a(j.a("aweme://aweme/detail/" + str2).a("refer", "find_friends").a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFollowEmptyGuideView(@NotNull Context context, @NotNull Fragment fragment, @NotNull String str) {
        super(context);
        View view;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(str, "enterFrom");
        this.k = fragment;
        this.l = str;
        this.k.getLifecycle().addObserver(this);
        this.f3154d = new RecyclerView(context);
        if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41191, new Class[0], Void.TYPE);
        } else {
            setOrientation(1);
            addView(this.f3154d, new ViewGroup.LayoutParams(-1, -1));
            ViewGroup.LayoutParams layoutParams = this.f3154d.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) UIUtils.dip2Px(getContext(), 88.0f);
                marginLayoutParams.bottomMargin = (int) UIUtils.dip2Px(getContext(), 47.0f);
                this.f3153b = new FeedFollowEmptyGuideAdapter();
                FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter = this.f3153b;
                if (feedFollowEmptyGuideAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                if (PatchProxy.isSupport(new Object[0], this, f3151a, false, 41195, new Class[0], View.class)) {
                    view = (View) PatchProxy.accessDispatch(new Object[0], this, f3151a, false, 41195, new Class[0], View.class);
                } else {
                    view = LayoutInflater.from(getContext()).inflate(C0906R.layout.aqu, null);
                    View findViewById = view.findViewById(C0906R.id.a38);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById, "layout.findViewById(R.id.default_view)");
                    this.f3156f = (DmtDefaultView) findViewById;
                    View findViewById2 = view.findViewById(C0906R.id.bby);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "layout.findViewById(R.id.line_view)");
                    this.g = findViewById2;
                    Intrinsics.checkExpressionValueIsNotNull(view, "layout");
                }
                feedFollowEmptyGuideAdapter.a(view);
                FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter2 = this.f3153b;
                if (feedFollowEmptyGuideAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                String str2 = this.l;
                if (PatchProxy.isSupport(new Object[]{str2}, feedFollowEmptyGuideAdapter2, FeedFollowEmptyGuideAdapter.f44686f, false, 40357, new Class[]{String.class}, Void.TYPE)) {
                    FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter3 = feedFollowEmptyGuideAdapter2;
                    PatchProxy.accessDispatch(new Object[]{str2}, feedFollowEmptyGuideAdapter3, FeedFollowEmptyGuideAdapter.f44686f, false, 40357, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
                    feedFollowEmptyGuideAdapter2.i = str2;
                }
                FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter4 = this.f3153b;
                if (feedFollowEmptyGuideAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                feedFollowEmptyGuideAdapter4.setLoadMoreListener(this);
                FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter5 = this.f3153b;
                if (feedFollowEmptyGuideAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                h<User> hVar = this;
                if (PatchProxy.isSupport(new Object[]{hVar}, feedFollowEmptyGuideAdapter5, FeedFollowEmptyGuideAdapter.f44686f, false, 40358, new Class[]{h.class}, Void.TYPE)) {
                    FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter6 = feedFollowEmptyGuideAdapter5;
                    PatchProxy.accessDispatch(new Object[]{hVar}, feedFollowEmptyGuideAdapter6, FeedFollowEmptyGuideAdapter.f44686f, false, 40358, new Class[]{h.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(hVar, "recommendItemListener");
                    feedFollowEmptyGuideAdapter5.g = hVar;
                }
                FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter7 = this.f3153b;
                if (feedFollowEmptyGuideAdapter7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                RecommendAwemeViewHolder.a aVar = this;
                if (PatchProxy.isSupport(new Object[]{aVar}, feedFollowEmptyGuideAdapter7, FeedFollowEmptyGuideAdapter.f44686f, false, 40359, new Class[]{RecommendAwemeViewHolder.a.class}, Void.TYPE)) {
                    FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter8 = feedFollowEmptyGuideAdapter7;
                    PatchProxy.accessDispatch(new Object[]{aVar}, feedFollowEmptyGuideAdapter8, FeedFollowEmptyGuideAdapter.f44686f, false, 40359, new Class[]{RecommendAwemeViewHolder.a.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(aVar, "recommendAwemeListener");
                    feedFollowEmptyGuideAdapter7.h = aVar;
                }
                RecyclerView recyclerView = this.f3154d;
                FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter9 = this.f3153b;
                if (feedFollowEmptyGuideAdapter9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                recyclerView.setAdapter(feedFollowEmptyGuideAdapter9);
                this.f3154d.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Lifecycle lifecycle = this.k.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "fragment.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.i = true;
        }
    }

    public final void a(@Nullable List<User> list, @NotNull List<User> list2, int i2, int i3) {
        List<User> list3 = list;
        List<User> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, list4, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3151a, false, 41199, new Class[]{List.class, List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3151a, false, 41199, new Class[]{List.class, List.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list4, "recentFansList");
        this.h = true;
        FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter = this.f3153b;
        if (feedFollowEmptyGuideAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        feedFollowEmptyGuideAdapter.addData(list3);
        FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter2 = this.f3153b;
        if (feedFollowEmptyGuideAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (CollectionUtils.isEmpty(feedFollowEmptyGuideAdapter2.getData())) {
            View view = this.g;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLine");
            }
            view.setVisibility(4);
        }
    }

    public final /* synthetic */ void a(int i2, Object obj, int i3, View view, String str) {
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        int i4 = i2;
        int i5 = i3;
        View view2 = view;
        String str8 = str;
        User user = (User) obj;
        int i6 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), user, Integer.valueOf(i3), view2, str8}, this, f3151a, false, 41205, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), user, Integer.valueOf(i3), view2, str8}, this, f3151a, false, 41205, new Class[]{Integer.TYPE, User.class, Integer.TYPE, View.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(str8, "enterMethod");
        if (i4 == 101) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", getRequestId());
                jSONObject.put("enter_from", "invite_friend");
                jSONObject.put("enter_method", "click_head");
                jSONObject.put("enter_type", "normal_way");
            } catch (Exception unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("rec_uid", user.getUid());
                jSONObject2.put("enter_from", this.l);
                jSONObject2.put("event_type", "enter_profile");
                jSONObject2.put("impr_order", i5);
                jSONObject2.put("req_id", getRequestId());
                jSONObject2.put("trigger_reason", "friend_rec_message");
                jSONObject2.put("rec_reason", user.getRecommendReason());
                if (user.isNewRecommend()) {
                    str7 = "new";
                } else {
                    str7 = "past";
                }
                jSONObject2.put("card_type", str7);
            } catch (Exception unused2) {
            }
            r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject2));
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.l).a("to_user_id", user.getUid()).a("group_id", "").a("request_id", getRequestId()).a("enter_method", "click_card");
            FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter = this.f3153b;
            if (feedFollowEmptyGuideAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (feedFollowEmptyGuideAdapter != null) {
                bool = Boolean.valueOf(feedFollowEmptyGuideAdapter.j);
            } else {
                bool = null;
            }
            if (bool.booleanValue()) {
                str5 = "empty";
            } else {
                str5 = "nonempty";
            }
            r.a("enter_personal_detail_backup", (Map) a2.a("page_status", str5).f34114b);
            ((q) new q().k(user.getUid()).b("find_friends").a(str8)).l(getRequestId()).e();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("to_user_id", user.getUid());
                jSONObject3.put("request_id", getRequestId());
            } catch (Exception unused3) {
            }
            if (Intrinsics.areEqual((Object) "click_name", (Object) str8)) {
                str6 = "name";
            } else {
                str6 = "head";
            }
            r.onEvent(MobClick.obtain().setEventName(str6).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
            UserProfileActivity.a(getContext(), user, getRequestId());
            return;
        }
        if (i4 == 100 && this.i) {
            if (!NetworkUtils.isNetworkAvailable(this.k.getActivity())) {
                FragmentActivity activity = this.k.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bgf).a();
                return;
            }
            if (user.getFollowStatus() != 0) {
                i6 = 1;
            }
            int i7 = i6 ^ 1;
            bg.a(new com.ss.android.ugc.aweme.challenge.a.a(i7, user));
            if (i7 == 0) {
                r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow_cancel").setValue(user.getUid().toString()));
            } else {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("request_id", getRequestId());
                } catch (Exception unused4) {
                }
                r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow").setValue(user.getUid().toString()).setJsonObject(jSONObject4));
                JSONObject jSONObject5 = new JSONObject();
                try {
                    jSONObject5.put("rec_uid", user.getUid());
                    jSONObject5.put("enter_from", this.l);
                    jSONObject5.put("event_type", "follow");
                    jSONObject5.put("impr_order", i5);
                    jSONObject5.put("req_id", getRequestId());
                    jSONObject5.put("trigger_reason", "friend_rec_message");
                    jSONObject5.put("rec_reason", user.getRecommendReason());
                    if (user.isNewRecommend()) {
                        str4 = "new";
                    } else {
                        str4 = "past";
                    }
                    jSONObject5.put("card_type", str4);
                } catch (Exception unused5) {
                }
                r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(user.getUid().toString()));
            }
            if (i7 == 0) {
                str2 = "follow_cancel";
            } else {
                str2 = "follow";
            }
            s b2 = new s(str2).g("other_places").b("homepage_friends");
            FeedFollowEmptyGuideAdapter feedFollowEmptyGuideAdapter2 = this.f3153b;
            if (feedFollowEmptyGuideAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (feedFollowEmptyGuideAdapter2.j) {
                str3 = "empty";
            } else {
                str3 = "nonempty";
            }
            b2.e(str3).c("follow_button").k(user.getRequestId()).h(user.getUid()).e();
        }
    }
}
