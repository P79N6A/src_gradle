package com.ss.android.ugc.aweme.notification;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.notification.adapter.FansAdapter;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import com.ss.android.ugc.aweme.notification.model.FansModel;
import com.ss.android.ugc.aweme.notification.model.FansRecommendModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\u00020\b2\u00020\tB\u0005¢\u0006\u0002\u0010\nJ\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020<H\u0002J\b\u0010A\u001a\u00020>H\u0002J\u0018\u0010B\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020<H\u0002J\u0018\u0010C\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020<H\u0002J\b\u0010D\u001a\u00020>H\u0016J\b\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020<H\u0014J\b\u0010H\u001a\u00020>H\u0002J\b\u0010I\u001a\u00020>H\u0002J\b\u0010J\u001a\u00020>H\u0002J\b\u0010K\u001a\u00020>H\u0002J\b\u0010L\u001a\u00020>H\u0002J\b\u0010M\u001a\u00020>H\u0002J\b\u0010N\u001a\u00020>H\u0016J \u0010O\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020<2\u0006\u0010P\u001a\u00020QH\u0002J\u0012\u0010R\u001a\u00020>2\b\u0010S\u001a\u0004\u0018\u00010TH\u0014J\b\u0010U\u001a\u00020>H\u0014J\u001e\u0010V\u001a\u00020>2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070X2\u0006\u0010Y\u001a\u00020\u0019H\u0016J\u0018\u0010Z\u001a\u00020>2\u000e\u0010[\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016J\u0012\u0010^\u001a\u00020>2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J \u0010a\u001a\u00020>2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010X2\u0006\u0010Y\u001a\u00020\u0019H\u0016J\u0010\u0010b\u001a\u00020>2\u0006\u0010c\u001a\u00020dH\u0007J\u001a\u0010e\u001a\u00020>2\b\u0010f\u001a\u0004\u0018\u00010Q2\u0006\u0010g\u001a\u00020<H\u0016J\b\u0010h\u001a\u00020>H\u0016J\u0018\u0010i\u001a\u00020>2\u000e\u0010[\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016J\u0012\u0010j\u001a\u00020>2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\u001e\u0010k\u001a\u00020>2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00070X2\u0006\u0010Y\u001a\u00020\u0019H\u0016J0\u0010l\u001a\u00020>2\u0006\u0010m\u001a\u00020<2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010g\u001a\u00020<2\u0006\u0010n\u001a\u00020(2\u0006\u0010o\u001a\u00020QH\u0016J\b\u0010p\u001a\u00020>H\u0014J\b\u0010q\u001a\u00020>H\u0016J\u0018\u0010r\u001a\u00020>2\u000e\u0010[\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016J\u0018\u0010s\u001a\u00020>2\u000e\u0010[\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016J\b\u0010t\u001a\u00020>H\u0016J\u0018\u0010u\u001a\u00020>2\u000e\u0010[\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016J\b\u0010v\u001a\u00020>H\u0016J\b\u0010w\u001a\u00020>H\u0016J\b\u0010x\u001a\u00020>H\u0016J\u0018\u0010y\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020<H\u0002J\b\u0010z\u001a\u00020>H\u0016R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R#\u0010'\u001a\n !*\u0004\u0018\u00010(0(8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b)\u0010*R#\u0010,\u001a\n !*\u0004\u0018\u00010-0-8BX\u0002¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b.\u0010/R#\u00101\u001a\n !*\u0004\u0018\u000102028BX\u0002¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b3\u00104R#\u00106\u001a\n !*\u0004\u0018\u000107078BX\u0002¢\u0006\f\n\u0004\b:\u0010\u0012\u001a\u0004\b8\u00109R\u000e\u0010;\u001a\u00020<X\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/FansDetailActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "Lcom/ss/android/ugc/aweme/base/activity/ViewEventListener;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/friends/adapter/RecommendAwemeViewHolder$RecommendAwemeClickListener;", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/notification/bean/BaseNotice;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Lcom/ss/android/ugc/aweme/notification/view/IFansRecommendView;", "()V", "mAdapter", "Lcom/ss/android/ugc/aweme/notification/adapter/FansAdapter;", "mFansPresenter", "Lcom/ss/android/ugc/aweme/notification/presenter/FansPresenter;", "getMFansPresenter", "()Lcom/ss/android/ugc/aweme/notification/presenter/FansPresenter;", "mFansPresenter$delegate", "Lkotlin/Lazy;", "mFollowPresenter", "Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "getMFollowPresenter", "()Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "mFollowPresenter$delegate", "mFromPush", "", "mRecommendPresenter", "Lcom/ss/android/ugc/aweme/notification/presenter/FansRecommendPresenter;", "getMRecommendPresenter", "()Lcom/ss/android/ugc/aweme/notification/presenter/FansRecommendPresenter;", "mRecommendPresenter$delegate", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "getMRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "mRecyclerView$delegate", "mRefreshingCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "mStatusBarView", "Landroid/view/View;", "getMStatusBarView", "()Landroid/view/View;", "mStatusBarView$delegate", "mStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "getMStatusView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "mStatusView$delegate", "mSwipeRefreshLayout", "Landroid/support/v4/widget/SwipeRefreshLayout;", "getMSwipeRefreshLayout", "()Landroid/support/v4/widget/SwipeRefreshLayout;", "mSwipeRefreshLayout$delegate", "mTBar", "Lcom/bytedance/ies/dmt/ui/titlebar/TextTitleBar;", "getMTBar", "()Lcom/bytedance/ies/dmt/ui/titlebar/TextTitleBar;", "mTBar$delegate", "mUnReadMessageCount", "", "changeFollow", "", "user", "recommendIndex", "clearFollowUnreadCount", "deleteRecommend", "enterProfile", "finish", "getAnalysis", "Lcom/ss/android/ugc/aweme/analysis/Analysis;", "getLayout", "initData", "initEvent", "initStatusView", "initView", "loadAllFans", "loadFansIfColdPush", "loadMore", "mobRecommendUserEvent", "eventType", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLoadLatestResult", "list", "", "hasMore", "onLoadMoreRecommendFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onLoadMoreRecommendListResult", "data", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "onLoadMoreResult", "onProfileFollowEvent", "event", "Lcom/ss/android/ugc/aweme/challenge/event/ProfileFollowEvent;", "onRecommendAwemeItemClick", "aid", "position", "onRefresh", "onRefreshRecommendFailed", "onRefreshRecommendListResult", "onRefreshResult", "onViewEvent", "actionId", "view", "enterMethod", "setStatusBarColor", "showLoadEmpty", "showLoadError", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "showLoadingMoreRecommendList", "showRecommend", "showRefreshingRecommendList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FansDetailActivity extends AmeBaseActivity implements SwipeRefreshLayout.OnRefreshListener, com.ss.android.ugc.aweme.base.activity.h<User>, LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.common.f.c<BaseNotice>, RecommendAwemeViewHolder.a, com.ss.android.ugc.aweme.notification.view.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3686a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3687b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mRecyclerView", "getMRecyclerView()Landroid/support/v7/widget/RecyclerView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mSwipeRefreshLayout", "getMSwipeRefreshLayout()Landroid/support/v4/widget/SwipeRefreshLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mTBar", "getMTBar()Lcom/bytedance/ies/dmt/ui/titlebar/TextTitleBar;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mStatusBarView", "getMStatusBarView()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mFansPresenter", "getMFansPresenter()Lcom/ss/android/ugc/aweme/notification/presenter/FansPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mRecommendPresenter", "getMRecommendPresenter()Lcom/ss/android/ugc/aweme/notification/presenter/FansRecommendPresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FansDetailActivity.class), "mFollowPresenter", "getMFollowPresenter()Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;"))};
    private final AtomicInteger A = new AtomicInteger(2);
    private HashMap B;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f3688c = LazyKt.lazy(new g(this));

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f3689d = LazyKt.lazy(new j(this));

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f3690e = LazyKt.lazy(new k(this));

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f3691f = LazyKt.lazy(new i(this));
    private final Lazy g = LazyKt.lazy(new h(this));
    private FansAdapter u;
    private final Lazy v = LazyKt.lazy(d.INSTANCE);
    private final Lazy w = LazyKt.lazy(f.INSTANCE);
    private final Lazy x = LazyKt.lazy(e.INSTANCE);
    private int y;
    private boolean z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/notification/FansDetailActivity$initData$1", "Lcom/bytedance/ies/dmt/ui/titlebar/listener/OnTitleBarClickListener;", "onBackClick", "", "view", "Landroid/view/View;", "onEndBtnClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57792a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FansDetailActivity f57793b;

        public final void b(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f57792a, false, 62761, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f57792a, false, 62761, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
        }

        a(FansDetailActivity fansDetailActivity) {
            this.f57793b = fansDetailActivity;
        }

        public final void a(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f57792a, false, 62760, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f57792a, false, 62760, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            this.f57793b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57794a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FansDetailActivity f57795b;

        b(FansDetailActivity fansDetailActivity) {
            this.f57795b = fansDetailActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f57794a, false, 62762, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f57794a, false, 62762, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f57795b.onRefresh();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class c extends FunctionReference implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FansDetailActivity fansDetailActivity) {
            super(0, fansDetailActivity);
        }

        public final String getName() {
            return "loadAllFans";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62764, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(FansDetailActivity.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62764, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "loadAllFans()V";
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62763, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62763, new Class[0], Void.TYPE);
                return;
            }
            ((FansDetailActivity) this.receiver).j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/notification/presenter/FansPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<com.ss.android.ugc.aweme.notification.b.a> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.notification.b.a invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62765, new Class[0], com.ss.android.ugc.aweme.notification.b.a.class)) {
                return new com.ss.android.ugc.aweme.notification.b.a();
            }
            return (com.ss.android.ugc.aweme.notification.b.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62765, new Class[0], com.ss.android.ugc.aweme.notification.b.a.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/presenter/FollowPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<com.ss.android.ugc.aweme.profile.presenter.i> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.profile.presenter.i invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62766, new Class[0], com.ss.android.ugc.aweme.profile.presenter.i.class)) {
                return new com.ss.android.ugc.aweme.profile.presenter.i();
            }
            return (com.ss.android.ugc.aweme.profile.presenter.i) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62766, new Class[0], com.ss.android.ugc.aweme.profile.presenter.i.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/notification/presenter/FansRecommendPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<com.ss.android.ugc.aweme.notification.b.b> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(0);
        }

        @NotNull
        public final com.ss.android.ugc.aweme.notification.b.b invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62767, new Class[0], com.ss.android.ugc.aweme.notification.b.b.class)) {
                return new com.ss.android.ugc.aweme.notification.b.b();
            }
            return (com.ss.android.ugc.aweme.notification.b.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62767, new Class[0], com.ss.android.ugc.aweme.notification.b.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/support/v7/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<RecyclerView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(FansDetailActivity fansDetailActivity) {
            super(0);
            this.this$0 = fansDetailActivity;
        }

        public final RecyclerView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62768, new Class[0], RecyclerView.class)) {
                return (RecyclerView) this.this$0.a((int) C0906R.id.bti);
            }
            return (RecyclerView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62768, new Class[0], RecyclerView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FansDetailActivity fansDetailActivity) {
            super(0);
            this.this$0 = fansDetailActivity;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62769, new Class[0], View.class)) {
                return this.this$0.a((int) C0906R.id.cv0);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62769, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<DmtStatusView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(FansDetailActivity fansDetailActivity) {
            super(0);
            this.this$0 = fansDetailActivity;
        }

        public final DmtStatusView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62770, new Class[0], DmtStatusView.class)) {
                return (DmtStatusView) this.this$0.a((int) C0906R.id.cvd);
            }
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62770, new Class[0], DmtStatusView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/support/v4/widget/SwipeRefreshLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<SwipeRefreshLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FansDetailActivity fansDetailActivity) {
            super(0);
            this.this$0 = fansDetailActivity;
        }

        public final SwipeRefreshLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62771, new Class[0], SwipeRefreshLayout.class)) {
                return (SwipeRefreshLayout) this.this$0.a((int) C0906R.id.btv);
            }
            return (SwipeRefreshLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62771, new Class[0], SwipeRefreshLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/titlebar/TextTitleBar;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<TextTitleBar> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FansDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(FansDetailActivity fansDetailActivity) {
            super(0);
            this.this$0 = fansDetailActivity;
        }

        public final TextTitleBar invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 62772, new Class[0], TextTitleBar.class)) {
                return (TextTitleBar) this.this$0.a((int) C0906R.id.d3m);
            }
            return (TextTitleBar) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 62772, new Class[0], TextTitleBar.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FansDetailActivity f57797b;

        l(FansDetailActivity fansDetailActivity) {
            this.f57797b = fansDetailActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f57796a, false, 62773, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57796a, false, 62773, new Class[0], Void.TYPE);
            } else if (this.f57797b.isViewValid()) {
                this.f57797b.h().f();
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f57797b, (int) C0906R.string.bgf).a();
            }
        }
    }

    private final RecyclerView k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62713, new Class[0], RecyclerView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62713, new Class[0], RecyclerView.class);
        } else {
            value = this.f3688c.getValue();
        }
        return (RecyclerView) value;
    }

    private final SwipeRefreshLayout l() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62714, new Class[0], SwipeRefreshLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62714, new Class[0], SwipeRefreshLayout.class);
        } else {
            value = this.f3689d.getValue();
        }
        return (SwipeRefreshLayout) value;
    }

    private final TextTitleBar m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62715, new Class[0], TextTitleBar.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62715, new Class[0], TextTitleBar.class);
        } else {
            value = this.f3690e.getValue();
        }
        return (TextTitleBar) value;
    }

    private final com.ss.android.ugc.aweme.notification.b.a n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62718, new Class[0], com.ss.android.ugc.aweme.notification.b.a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62718, new Class[0], com.ss.android.ugc.aweme.notification.b.a.class);
        } else {
            value = this.v.getValue();
        }
        return (com.ss.android.ugc.aweme.notification.b.a) value;
    }

    private final com.ss.android.ugc.aweme.notification.b.b o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62719, new Class[0], com.ss.android.ugc.aweme.notification.b.b.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62719, new Class[0], com.ss.android.ugc.aweme.notification.b.b.class);
        } else {
            value = this.w.getValue();
        }
        return (com.ss.android.ugc.aweme.notification.b.b) value;
    }

    public final int a() {
        return C0906R.layout.cq;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3686a, false, 62756, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3686a, false, 62756, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.B == null) {
            this.B = new HashMap();
        }
        View view = (View) this.B.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.B.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void c(@NotNull List<? extends BaseNotice> list, boolean z2) {
        List<? extends BaseNotice> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3686a, false, 62742, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z2)}, this, f3686a, false, 62742, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "list");
    }

    public final void d(@Nullable Exception exc) {
    }

    public final DmtStatusView h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62716, new Class[0], DmtStatusView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62716, new Class[0], DmtStatusView.class);
        } else {
            value = this.f3691f.getValue();
        }
        return (DmtStatusView) value;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62758, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.FansDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.FansDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3686a, false, 62759, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3686a, false, 62759, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.FansDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void z_() {
    }

    public final void a(@NotNull List<? extends BaseNotice> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3686a, false, 62732, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f3686a, false, 62732, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (this.A.decrementAndGet() <= 0) {
            SwipeRefreshLayout l2 = l();
            Intrinsics.checkExpressionValueIsNotNull(l2, "mSwipeRefreshLayout");
            l2.setRefreshing(false);
            h().b();
        } else {
            FansAdapter fansAdapter = this.u;
            if (fansAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (fansAdapter.getBasicItemCount() > 0) {
                FansAdapter fansAdapter2 = this.u;
                if (fansAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter2.clearData();
            }
        }
        FansAdapter fansAdapter3 = this.u;
        if (fansAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter3.a(list);
        if (this.A.get() == 0) {
            FansAdapter fansAdapter4 = this.u;
            if (fansAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (fansAdapter4.a() < 0) {
                FansAdapter fansAdapter5 = this.u;
                if (fansAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                if (fansAdapter5.b() > 0) {
                    j();
                    q();
                }
            }
        }
        p();
        q();
    }

    private final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62745, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62745, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.message.c.c.a().a(7);
        bg.a(new a(7, 0));
        bg.a(new com.ss.android.ugc.aweme.message.b.c(7, 0));
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62752, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        com.ss.android.ugc.aweme.ae.c.a(this);
    }

    @NotNull
    public final Analysis getAnalysis() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62750, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62750, new Class[0], Analysis.class);
        }
        Analysis labelName = new Analysis().setLabelName("fans");
        Intrinsics.checkExpressionValueIsNotNull(labelName, "Analysis().setLabelName(Mob.Value.FANS)");
        return labelName;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62740, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62740, new Class[0], Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter.showLoadMoreLoading();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62729, new Class[0], Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (fansAdapter.getItemCount() == 0) {
            h().d();
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62751, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        n().k();
        o().k();
        bg.d(this);
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62733, new Class[0], Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter.showLoadMoreLoading();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62726, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    private final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62744, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62744, new Class[0], Void.TYPE);
            return;
        }
        if (this.A.get() <= 0 && this.z && this.y == 0) {
            FansAdapter fansAdapter = this.u;
            if (fansAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (fansAdapter.getBasicItemCount() > 1) {
                j();
            }
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62743, new Class[0], Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter.d();
        com.ss.android.ugc.aweme.notification.b.b o = o();
        FansAdapter fansAdapter2 = this.u;
        if (fansAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        o.a(fansAdapter2.c());
        n().c();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62731, new Class[0], Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (fansAdapter.mShowFooter) {
            FansAdapter fansAdapter2 = this.u;
            if (fansAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            fansAdapter2.setShowFooter(false);
            FansAdapter fansAdapter3 = this.u;
            if (fansAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            fansAdapter3.notifyDataSetChanged();
            FansAdapter fansAdapter4 = this.u;
            if (fansAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            fansAdapter4.showLoadMoreEmpty();
        }
        SwipeRefreshLayout l2 = l();
        Intrinsics.checkExpressionValueIsNotNull(l2, "mSwipeRefreshLayout");
        l2.setRefreshing(false);
        FansAdapter fansAdapter5 = this.u;
        if (fansAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (fansAdapter5.getItemCount() == 0) {
            h().e();
        }
    }

    public final void loadMore() {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62728, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62728, new Class[0], Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (PatchProxy.isSupport(new Object[0], fansAdapter, FansAdapter.f57869a, false, 62942, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], fansAdapter, FansAdapter.f57869a, false, 62942, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (fansAdapter.b() >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            com.ss.android.ugc.aweme.notification.b.a n = n();
            if (PatchProxy.isSupport(new Object[0], n, com.ss.android.ugc.aweme.notification.b.a.f57960a, false, 63130, new Class[0], Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], n, com.ss.android.ugc.aweme.notification.b.a.f57960a, false, 63130, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                FansModel fansModel = (FansModel) n.f2978e;
                if (fansModel != null) {
                    Notice notice = (Notice) fansModel.getData();
                    if (notice != null) {
                        z3 = notice.hasMore;
                    }
                }
            }
            if (z3) {
                n().c();
                return;
            }
        }
        o().c();
    }

    public final void onRefresh() {
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62727, new Class[0], Void.TYPE);
            return;
        }
        if (NetworkUtils.b(this)) {
            this.A.set(2);
            FansAdapter fansAdapter = this.u;
            if (fansAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (fansAdapter.getBasicItemCount() > 0) {
                FansAdapter fansAdapter2 = this.u;
                if (fansAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter2.setShowFooter(false);
                FansAdapter fansAdapter3 = this.u;
                if (fansAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter3.showLoadMoreEmpty();
                FansAdapter fansAdapter4 = this.u;
                if (fansAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter4.f57871b = 0;
                fansAdapter4.f57872c = false;
            }
            com.ss.android.ugc.aweme.notification.b.a n = n();
            if (PatchProxy.isSupport(new Object[0], n, com.ss.android.ugc.aweme.notification.b.a.f57960a, false, 63131, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], n, com.ss.android.ugc.aweme.notification.b.a.f57960a, false, 63131, new Class[0], Void.TYPE);
            } else {
                FansModel fansModel = (FansModel) n.f2978e;
                if (fansModel != null) {
                    fansModel.refresh();
                }
                FansModel fansModel2 = (FansModel) n.f2978e;
                if (fansModel2 != null) {
                    Notice notice = (Notice) fansModel2.getData();
                    if (notice != null) {
                        notice.hasMore = false;
                    }
                }
                n.n_();
            }
            com.ss.android.ugc.aweme.notification.b.b o = o();
            if (PatchProxy.isSupport(new Object[0], o, com.ss.android.ugc.aweme.notification.b.b.f57961a, false, 63137, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], o, com.ss.android.ugc.aweme.notification.b.b.f57961a, false, 63137, new Class[0], Void.TYPE);
            } else {
                FansRecommendModel fansRecommendModel = (FansRecommendModel) o.f2978e;
                if (fansRecommendModel != null) {
                    fansRecommendModel.refreshRecommendList();
                }
                o.n_();
            }
        } else {
            FansAdapter fansAdapter5 = this.u;
            if (fansAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (fansAdapter5.getItemCount() == 0) {
                h().postDelayed(new l(this), 100);
            }
        }
    }

    public final void b(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3686a, false, 62730, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3686a, false, 62730, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (fansAdapter.mShowFooter) {
            FansAdapter fansAdapter2 = this.u;
            if (fansAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            fansAdapter2.setShowFooter(false);
        }
        this.A.decrementAndGet();
        SwipeRefreshLayout l2 = l();
        Intrinsics.checkExpressionValueIsNotNull(l2, "mSwipeRefreshLayout");
        l2.setRefreshing(false);
        FansAdapter fansAdapter3 = this.u;
        if (fansAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter3.clearData();
        h().f();
    }

    public final void c(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3686a, false, 62734, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3686a, false, 62734, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter.showPullUpLoadMore();
    }

    public final void e(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3686a, false, 62738, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3686a, false, 62738, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter.showPullUpLoadMore();
    }

    @Subscribe
    public final void onProfileFollowEvent(@NotNull com.ss.android.ugc.aweme.challenge.a.d dVar) {
        com.ss.android.ugc.aweme.challenge.a.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3686a, false, 62741, new Class[]{com.ss.android.ugc.aweme.challenge.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3686a, false, 62741, new Class[]{com.ss.android.ugc.aweme.challenge.a.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "event");
        Object obj = dVar2.f35319b;
        if (obj == null || !(obj instanceof User)) {
            return;
        }
        int i2 = dVar2.f35318a;
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        User user = (User) obj;
        int i3 = 2;
        if (!(i2 == 1 || i2 == 2)) {
            i3 = 0;
        }
        fansAdapter.a(user, i3);
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3686a, false, 62736, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3686a, false, 62736, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.A.decrementAndGet() <= 0) {
            FansAdapter fansAdapter = this.u;
            if (fansAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (fansAdapter.getBasicItemCount() > 0) {
                SwipeRefreshLayout l2 = l();
                Intrinsics.checkExpressionValueIsNotNull(l2, "mSwipeRefreshLayout");
                l2.setRefreshing(false);
                h().b();
            }
        }
        if (this.A.get() == 0) {
            FansAdapter fansAdapter2 = this.u;
            if (fansAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (fansAdapter2.a() < 0) {
                FansAdapter fansAdapter3 = this.u;
                if (fansAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                if (fansAdapter3.b() > 0) {
                    j();
                    return;
                }
            }
        }
        p();
    }

    public final void b(@Nullable RecommendList recommendList) {
        RecommendList recommendList2 = recommendList;
        if (PatchProxy.isSupport(new Object[]{recommendList2}, this, f3686a, false, 62739, new Class[]{RecommendList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendList2}, this, f3686a, false, 62739, new Class[]{RecommendList.class}, Void.TYPE);
            return;
        }
        if (recommendList2 != null) {
            if (recommendList.getUserList() == null || recommendList.getUserList().isEmpty() || !recommendList2.hasMore) {
                FansAdapter fansAdapter = this.u;
                if (fansAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter.setShowFooter(false);
                FansAdapter fansAdapter2 = this.u;
                if (fansAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter2.showLoadMoreEmpty();
            } else {
                FansAdapter fansAdapter3 = this.u;
                if (fansAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter3.setShowFooter(true);
                FansAdapter fansAdapter4 = this.u;
                if (fansAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                fansAdapter4.resetLoadMoreState();
            }
            FansAdapter fansAdapter5 = this.u;
            if (fansAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            List<User> userList = recommendList.getUserList();
            if (PatchProxy.isSupport(new Object[]{userList}, fansAdapter5, FansAdapter.f57869a, false, 62956, new Class[]{List.class}, Void.TYPE)) {
                FansAdapter fansAdapter6 = fansAdapter5;
                PatchProxy.accessDispatch(new Object[]{userList}, fansAdapter6, FansAdapter.f57869a, false, 62956, new Class[]{List.class}, Void.TYPE);
            } else {
                if (userList != null) {
                    fansAdapter5.b(userList);
                }
            }
        } else {
            e(null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        if (r3 == null) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.friends.model.RecommendList r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.friends.model.RecommendList> r1 = com.ss.android.ugc.aweme.friends.model.RecommendList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62737(0xf511, float:8.7913E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62737(0xf511, float:8.7913E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.friends.model.RecommendList> r1 = com.ss.android.ugc.aweme.friends.model.RecommendList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A
            int r0 = r0.decrementAndGet()
            if (r0 > 0) goto L_0x0054
            android.support.v4.widget.SwipeRefreshLayout r0 = r18.l()
            java.lang.String r1 = "mSwipeRefreshLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setRefreshing(r10)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r18.h()
            r0.b()
            goto L_0x006f
        L_0x0054:
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x005d
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x005d:
            int r0 = r0.getBasicItemCount()
            if (r0 <= 0) goto L_0x006f
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x006c
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x006c:
            r0.clearData()
        L_0x006f:
            if (r8 == 0) goto L_0x012d
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x007a
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x007a:
            java.util.List r1 = r19.getUserList()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.notification.adapter.FansAdapter.f57869a
            r14 = 0
            r15 = 62954(0xf5ea, float:8.8217E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r3 = java.util.List.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00b2
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.notification.adapter.FansAdapter.f57869a
            r14 = 0
            r15 = 62954(0xf5ea, float:8.8217E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00f8
        L_0x00b2:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x00c0
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r3 = 0
            goto L_0x00c1
        L_0x00c0:
            r3 = 1
        L_0x00c1:
            if (r3 != 0) goto L_0x00f8
            java.util.List r3 = r0.mItems
            if (r3 == 0) goto L_0x00cf
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r3)
            if (r3 != 0) goto L_0x00d6
        L_0x00cf:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
        L_0x00d6:
            int r4 = r0.b()
            if (r4 < 0) goto L_0x00ea
            int r4 = r0.b()
            int r4 = r4 + r9
            if (r1 != 0) goto L_0x00e6
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00e6:
            r3.addAll(r4, r2)
            goto L_0x00f2
        L_0x00ea:
            if (r1 != 0) goto L_0x00ef
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00ef:
            r3.addAll(r2)
        L_0x00f2:
            r0.setData(r3)
            r0.e()
        L_0x00f8:
            boolean r0 = r8.hasMore
            if (r0 == 0) goto L_0x0115
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x0105
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0105:
            r0.setShowFooter(r9)
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x0111
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0111:
            r0.resetLoadMoreState()
            goto L_0x012d
        L_0x0115:
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x011e
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x011e:
            r0.setShowFooter(r10)
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x012a
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x012a:
            r0.showLoadMoreEmpty()
        L_0x012d:
            java.util.concurrent.atomic.AtomicInteger r0 = r7.A
            int r0 = r0.get()
            if (r0 != 0) goto L_0x0172
            if (r8 == 0) goto L_0x0160
            java.util.List r0 = r19.getUserList()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0147
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r9 = 0
        L_0x0147:
            if (r9 == 0) goto L_0x015c
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x0152
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0152:
            int r0 = r0.b()
            if (r0 <= 0) goto L_0x015c
            r18.j()
            return
        L_0x015c:
            r18.p()
            return
        L_0x0160:
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r0 = r7.u
            if (r0 != 0) goto L_0x0169
            java.lang.String r1 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0169:
            int r0 = r0.b()
            if (r0 <= 0) goto L_0x0172
            r18.j()
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.FansDetailActivity.a(com.ss.android.ugc.aweme.friends.model.RecommendList):void");
    }

    public final void onCreate(@Nullable Bundle bundle) {
        String str;
        Object value;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3686a, false, 62721, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3686a, false, 62721, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.FansDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.z = getIntent().getBooleanExtra("push", false);
            if (this.z) {
                this.y = com.ss.android.ugc.aweme.message.c.c.a().b(7);
                q();
            } else {
                this.y = getIntent().getIntExtra("unRead_message_count", 0);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62724, new Class[0], Void.TYPE);
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62717, new Class[0], View.class)) {
                    value = PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62717, new Class[0], View.class);
                } else {
                    value = this.g.getValue();
                }
                View view = (View) value;
                Intrinsics.checkExpressionValueIsNotNull(view, "mStatusBarView");
                view.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
            }
            if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62725, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62725, new Class[0], Void.TYPE);
            } else {
                Context context = this;
                h().setBuilder(DmtStatusView.a.a(context).a().a(new c.a(context).b((int) C0906R.string.arf).c(C0906R.string.are).f20493a).a(2130840142, C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new b(this)));
            }
            RecyclerView k2 = k();
            Intrinsics.checkExpressionValueIsNotNull(k2, "mRecyclerView");
            RecyclerView.ItemAnimator itemAnimator = k2.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
                if (this.z) {
                    str = "push";
                } else {
                    str = "message_fans";
                }
                FansAdapter fansAdapter = new FansAdapter(this, this.y, new c(this), this, this, str);
                this.u = fansAdapter;
                RecyclerView k3 = k();
                Intrinsics.checkExpressionValueIsNotNull(k3, "mRecyclerView");
                k3.setLayoutManager(new LinearLayoutManager(this));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62723, new Class[0], Void.TYPE);
        } else {
            l().setOnRefreshListener(this);
            k().addOnScrollListener(new FrescoRecycleViewScrollListener(this));
            n().a(new FansModel(this.z, this.y));
            o oVar = this;
            n().a(oVar);
            o().a(new FansRecommendModel(com.ss.android.ugc.aweme.utils.permission.e.a(), com.ss.android.ugc.aweme.utils.permission.e.b()));
            o().a(oVar);
            FansAdapter fansAdapter2 = this.u;
            if (fansAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            fansAdapter2.setLoadMoreListener(this);
            FansAdapter fansAdapter3 = this.u;
            if (fansAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            fansAdapter3.setShowFooter(false);
            FansAdapter fansAdapter4 = this.u;
            if (fansAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            fansAdapter4.showLoadMoreEmpty();
            RecyclerView k4 = k();
            Intrinsics.checkExpressionValueIsNotNull(k4, "mRecyclerView");
            FansAdapter fansAdapter5 = this.u;
            if (fansAdapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            k4.setAdapter(fansAdapter5);
            h().d();
            bg.c(this);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3686a, false, 62722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3686a, false, 62722, new Class[0], Void.TYPE);
        } else {
            m().setTitle((CharSequence) getString(C0906R.string.agu));
            m().setOnTitleBarClickListener(new a(this));
            onRefresh();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.FansDetailActivity", "onCreate", false);
    }

    public final void b(@Nullable List<? extends BaseNotice> list, boolean z2) {
        List<? extends BaseNotice> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3686a, false, 62735, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z2)}, this, f3686a, false, 62735, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        FansAdapter fansAdapter = this.u;
        if (fansAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter.setShowFooter(true);
        FansAdapter fansAdapter2 = this.u;
        if (fansAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        fansAdapter2.resetLoadMoreState();
        FansAdapter fansAdapter3 = this.u;
        if (fansAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (PatchProxy.isSupport(new Object[]{list2}, fansAdapter3, FansAdapter.f57869a, false, 62953, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, fansAdapter3, FansAdapter.f57869a, false, 62953, new Class[]{List.class}, Void.TYPE);
        } else if (list2 != null && !list.isEmpty()) {
            int size = fansAdapter3.mItems.size();
            int a2 = fansAdapter3.a();
            int b2 = fansAdapter3.b();
            if (a2 >= 0 || b2 >= 0) {
                if (a2 < 0) {
                    a2 = fansAdapter3.mItems.size();
                }
                if (b2 >= 0) {
                    a2--;
                }
                if (a2 > 0) {
                    List list3 = fansAdapter3.mItems;
                    Intrinsics.checkExpressionValueIsNotNull(list3, "mItems");
                    fansAdapter3.mItems = CollectionsKt.toMutableList((Collection<? extends T>) CollectionsKt.take(list3, a2));
                }
                fansAdapter3.mItems.addAll(list2);
                fansAdapter3.f();
                int size2 = fansAdapter3.mItems.size();
                int abs = Math.abs(size2 - size);
                if (size2 > size) {
                    fansAdapter3.notifyItemRangeChanged(a2, size - a2);
                    fansAdapter3.notifyItemRangeInserted(size, abs);
                } else if (size2 == size) {
                    fansAdapter3.notifyItemRangeChanged(a2, size - a2);
                } else {
                    fansAdapter3.notifyItemRangeChanged(a2, size2 - a2);
                    fansAdapter3.notifyItemRangeRemoved(size2, abs);
                }
            } else {
                fansAdapter3.b(list2);
            }
        }
        if (!z2) {
            o().c();
        }
    }

    public final void a(@Nullable String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f3686a, false, 62754, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f3686a, false, 62754, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
        a2.a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + str2).a("refer", "find_friends").a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (r2 == null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.ss.android.ugc.aweme.profile.model.User r21, int r22, java.lang.String r23) {
        /*
            r20 = this;
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r21
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            r11 = 1
            r3[r11] = r4
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f3686a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r4 = com.ss.android.ugc.aweme.profile.model.User.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 62755(0xf523, float:8.7938E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005b
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r21
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r13[r11] = r0
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = f3686a
            r16 = 0
            r17 = 62755(0xf523, float:8.7938E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005b:
            com.ss.android.ugc.aweme.notification.b.b r2 = r20.o()
            com.ss.android.ugc.aweme.common.a r2 = r2.i()
            com.ss.android.ugc.aweme.notification.model.FansRecommendModel r2 = (com.ss.android.ugc.aweme.notification.model.FansRecommendModel) r2
            if (r2 == 0) goto L_0x0073
            java.lang.Object r2 = r2.getData()
            com.ss.android.ugc.aweme.friends.model.RecommendList r2 = (com.ss.android.ugc.aweme.friends.model.RecommendList) r2
            if (r2 == 0) goto L_0x0073
            java.lang.String r2 = r2.rid
            if (r2 != 0) goto L_0x0075
        L_0x0073:
            java.lang.String r2 = ""
        L_0x0075:
            r3 = r2
            r2 = r20
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r4 = r2.u
            if (r4 != 0) goto L_0x0081
            java.lang.String r5 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x0081:
            int r4 = r4.b()
            if (r4 != 0) goto L_0x008a
            java.lang.String r4 = "empty"
            goto L_0x008c
        L_0x008a:
            java.lang.String r4 = "nonempty"
        L_0x008c:
            com.ss.android.ugc.aweme.common.MobClick r5 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r6 = "follow_card"
            com.ss.android.ugc.aweme.common.MobClick r5 = r5.setEventName(r6)
            java.lang.String r6 = "find_friends"
            com.ss.android.ugc.aweme.common.MobClick r5 = r5.setLabelName(r6)
            java.lang.String r6 = r21.getUid()
            com.ss.android.ugc.aweme.common.MobClick r5 = r5.setValue(r6)
            com.ss.android.ugc.aweme.app.d.c r6 = new com.ss.android.ugc.aweme.app.d.c
            r6.<init>()
            java.lang.String r7 = "rec_uid"
            java.lang.String r8 = r21.getUid()
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "enter_from"
            java.lang.String r8 = "message_card"
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "event_type"
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r1)
            java.lang.String r7 = "impr_order"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.Integer) r8)
            java.lang.String r7 = "previous_page"
            java.lang.String r8 = "message"
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "page_status"
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r4)
            java.lang.String r7 = "req_id"
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r3)
            java.lang.String r7 = "rec_reason"
            java.lang.String r8 = r21.getRecommendReason()
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            java.lang.String r7 = "card_type"
            java.lang.String r8 = "total"
            com.ss.android.ugc.aweme.app.d.c r6 = r6.a((java.lang.String) r7, (java.lang.String) r8)
            org.json.JSONObject r6 = r6.b()
            com.ss.android.ugc.aweme.common.MobClick r5 = r5.setJsonObject(r6)
            com.ss.android.ugc.aweme.common.r.onEvent(r5)
            java.lang.String r5 = "follow_card"
            com.ss.android.ugc.aweme.app.d.d r6 = new com.ss.android.ugc.aweme.app.d.d
            r6.<init>()
            java.lang.String r7 = "req_id"
            com.ss.android.ugc.aweme.app.d.d r3 = r6.a((java.lang.String) r7, (java.lang.String) r3)
            java.lang.String r6 = "event_type"
            com.ss.android.ugc.aweme.app.d.d r1 = r3.a((java.lang.String) r6, (java.lang.String) r1)
            java.lang.String r3 = "enter_from"
            java.lang.String r6 = "message_card"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r3, (java.lang.String) r6)
            java.lang.String r3 = "trigger_reason"
            java.lang.String r6 = "cold_launch"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r3, (java.lang.String) r6)
            java.lang.String r3 = "card_type"
            java.lang.String r6 = "total"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r3, (java.lang.String) r6)
            java.lang.String r3 = "rec_reason"
            java.lang.String r6 = r21.getRecommendReason()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r3, (java.lang.String) r6)
            java.lang.String r3 = "rec_uid"
            java.lang.String r0 = r21.getUid()
            com.ss.android.ugc.aweme.app.d.d r0 = r1.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r1 = "impr_order"
            r3 = r22
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (int) r3)
            java.lang.String r1 = "previous_page"
            java.lang.String r3 = "message"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r3)
            java.lang.String r1 = "page_status"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r4)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r5, (java.util.Map) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.FansDetailActivity.a(com.ss.android.ugc.aweme.profile.model.User, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x025c, code lost:
        if (r4 == null) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x033d, code lost:
        if (r0 == null) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03b9, code lost:
        if (r0 == null) goto L_0x03bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(int r23, java.lang.Object r24, int r25, android.view.View r26, java.lang.String r27) {
        /*
            r22 = this;
            r7 = r22
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r24
            com.ss.android.ugc.aweme.profile.model.User r11 = (com.ss.android.ugc.aweme.profile.model.User) r11
            r12 = 5
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r13 = 0
            r0[r13] = r1
            r14 = 1
            r0[r14] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r15 = 2
            r0[r15] = r1
            r16 = 3
            r0[r16] = r9
            r17 = 4
            r0[r17] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r17] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 62753(0xf521, float:8.7936E-41)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0086
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r0[r13] = r1
            r0[r14] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r15] = r1
            r0[r16] = r9
            r0[r17] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62753(0xf521, float:8.7936E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r17] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0086:
            java.lang.String r0 = "user"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "enterMethod"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            r9 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            switch(r23) {
                case 100: goto L_0x02a8;
                case 101: goto L_0x01ae;
                case 102: goto L_0x00ea;
                case 103: goto L_0x009d;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x0404
        L_0x009d:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62746(0xf51a, float:8.7926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62746(0xf51a, float:8.7926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0404
        L_0x00e4:
            java.lang.String r0 = "impression"
            r7.a(r11, r8, r0)
            return
        L_0x00ea:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62749(0xf51d, float:8.793E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0130
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62749(0xf51d, float:8.793E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0130:
            boolean r0 = r22.isViewValid()
            if (r0 == 0) goto L_0x0404
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = com.ss.android.ad.splash.utils.NetworkUtils.b(r0)
            if (r1 != 0) goto L_0x0147
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r9)
            r0.a()
            return
        L_0x0147:
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r1 = r7.u
            if (r1 != 0) goto L_0x0150
            java.lang.String r2 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0150:
            r1.a((com.ss.android.ugc.aweme.profile.model.User) r11)
            com.ss.android.ugc.aweme.notification.b.b r1 = r22.o()
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r13] = r11
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.notification.b.b.f57961a
            r18 = 0
            r19 = 63136(0xf6a0, float:8.8472E-41)
            java.lang.Class[] r2 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r13] = r3
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r2 == 0) goto L_0x018f
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r15[r13] = r11
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.notification.b.b.f57961a
            r18 = 0
            r19 = 63136(0xf6a0, float:8.8472E-41)
            java.lang.Class[] r2 = new java.lang.Class[r14]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r2[r13] = r3
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x019d
        L_0x018f:
            java.lang.String r2 = "user"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r2)
            com.ss.android.ugc.aweme.common.a r1 = r1.f2978e
            com.ss.android.ugc.aweme.notification.model.FansRecommendModel r1 = (com.ss.android.ugc.aweme.notification.model.FansRecommendModel) r1
            if (r1 == 0) goto L_0x019d
            r1.blockRecommend(r11)
        L_0x019d:
            r1 = 2131558974(0x7f0d023e, float:1.8743279E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.c((android.content.Context) r0, (int) r1)
            r0.a()
            java.lang.String r0 = "delete"
            r7.a(r11, r8, r0)
            goto L_0x0404
        L_0x01ae:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62747(0xf51b, float:8.7927E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f5
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62747(0xf51b, float:8.7927E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0404
        L_0x01f5:
            com.ss.android.ugc.aweme.ag.h r0 = com.ss.android.ugc.aweme.ag.h.a()
            r1 = r7
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "aweme://user/profile/"
            r2.<init>(r3)
            java.lang.String r3 = r11.getUid()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.aweme.ag.j r2 = com.ss.android.ugc.aweme.ag.j.a(r2)
            java.lang.String r3 = "sec_user_id"
            java.lang.String r4 = r11.getSecUid()
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "message_fans"
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "extra_previous_page_position"
            java.lang.String r4 = "recommend_card"
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "need_track_compare_recommend_reason"
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (int) r14)
            java.lang.String r3 = "previous_recommend_reason"
            java.lang.String r4 = r11.getRecommendReason()
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "recommend_from_type"
            java.lang.String r4 = "list"
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_from_request_id"
            com.ss.android.ugc.aweme.notification.b.b r4 = r22.o()
            com.ss.android.ugc.aweme.common.a r4 = r4.i()
            com.ss.android.ugc.aweme.notification.model.FansRecommendModel r4 = (com.ss.android.ugc.aweme.notification.model.FansRecommendModel) r4
            if (r4 == 0) goto L_0x025e
            java.lang.Object r4 = r4.getData()
            com.ss.android.ugc.aweme.friends.model.RecommendList r4 = (com.ss.android.ugc.aweme.friends.model.RecommendList) r4
            if (r4 == 0) goto L_0x025e
            java.lang.String r4 = r4.rid
            if (r4 != 0) goto L_0x0260
        L_0x025e:
            java.lang.String r4 = ""
        L_0x0260:
            com.ss.android.ugc.aweme.ag.j r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r2 = r2.a()
            r0.a((android.app.Activity) r1, (java.lang.String) r2)
            java.lang.String r0 = "enter_profile"
            r7.a(r11, r8, r0)
            java.lang.String r0 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "message_card"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = "message"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "to_user_id"
            java.lang.String r3 = r11.getUid()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "rec_uid"
            java.lang.String r3 = r11.getUid()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "click_head"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        L_0x02a8:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62748(0xf51c, float:8.7929E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02ef
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3686a
            r3 = 0
            r4 = 62748(0xf51c, float:8.7929E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0404
        L_0x02ef:
            boolean r0 = r22.isViewValid()
            if (r0 == 0) goto L_0x0403
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = com.ss.android.ad.splash.utils.NetworkUtils.b(r0)
            if (r1 != 0) goto L_0x0307
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r9)
            r0.a()
            goto L_0x0404
        L_0x0307:
            int r0 = r11.getFollowStatus()
            if (r0 == 0) goto L_0x030f
            r0 = 1
            goto L_0x0310
        L_0x030f:
            r0 = 0
        L_0x0310:
            r0 = r0 ^ r14
            com.ss.android.ugc.aweme.notification.adapter.FansAdapter r1 = r7.u
            if (r1 != 0) goto L_0x031a
            java.lang.String r2 = "mAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x031a:
            if (r0 != r14) goto L_0x031d
            r13 = 2
        L_0x031d:
            r1.a((com.ss.android.ugc.aweme.profile.model.User) r11, (int) r13)
            if (r0 != r14) goto L_0x039e
            java.lang.String r0 = "follow"
            r7.a(r11, r8, r0)
            com.ss.android.ugc.aweme.notification.b.b r0 = r22.o()
            com.ss.android.ugc.aweme.common.a r0 = r0.i()
            com.ss.android.ugc.aweme.notification.model.FansRecommendModel r0 = (com.ss.android.ugc.aweme.notification.model.FansRecommendModel) r0
            if (r0 == 0) goto L_0x033f
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = (com.ss.android.ugc.aweme.friends.model.RecommendList) r0
            if (r0 == 0) goto L_0x033f
            java.lang.String r0 = r0.rid
            if (r0 != 0) goto L_0x0341
        L_0x033f:
            java.lang.String r0 = ""
        L_0x0341:
            java.lang.String r1 = "follow"
            com.ss.android.ugc.aweme.app.d.d r2 = new com.ss.android.ugc.aweme.app.d.d
            r2.<init>()
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.ai r4 = com.ss.android.ugc.aweme.feed.ai.a()
            java.lang.String r0 = r4.a((java.lang.String) r0)
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "message_card"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = "message"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "rec_reason"
            java.lang.String r3 = r11.getRecommendReason()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "to_user_id"
            java.lang.String r3 = r11.getUid()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "rec_uid"
            java.lang.String r3 = r11.getUid()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "impr_order"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (int) r8)
            java.lang.String r2 = "enter_method"
            java.lang.String r3 = "follow_button"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            goto L_0x0404
        L_0x039e:
            java.lang.String r0 = "follow_cancel"
            r7.a(r11, r8, r0)
            com.ss.android.ugc.aweme.notification.b.b r0 = r22.o()
            com.ss.android.ugc.aweme.common.a r0 = r0.i()
            com.ss.android.ugc.aweme.notification.model.FansRecommendModel r0 = (com.ss.android.ugc.aweme.notification.model.FansRecommendModel) r0
            if (r0 == 0) goto L_0x03bb
            java.lang.Object r0 = r0.getData()
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = (com.ss.android.ugc.aweme.friends.model.RecommendList) r0
            if (r0 == 0) goto L_0x03bb
            java.lang.String r0 = r0.rid
            if (r0 != 0) goto L_0x03bd
        L_0x03bb:
            java.lang.String r0 = ""
        L_0x03bd:
            java.lang.String r1 = "follow_cancel"
            com.ss.android.ugc.aweme.app.d.d r2 = new com.ss.android.ugc.aweme.app.d.d
            r2.<init>()
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "message_card"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "previous_page"
            java.lang.String r3 = "message"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "rec_reason"
            java.lang.String r3 = r11.getRecommendReason()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "rec_uid"
            java.lang.String r3 = r11.getUid()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "to_user_id"
            java.lang.String r3 = r11.getUid()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "impr_order"
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (int) r8)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
        L_0x0403:
            return
        L_0x0404:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.FansDetailActivity.a(int, java.lang.Object, int, android.view.View, java.lang.String):void");
    }
}
