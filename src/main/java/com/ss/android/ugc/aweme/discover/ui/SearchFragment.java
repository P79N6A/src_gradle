package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.CallSuper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.k;
import com.ss.android.ugc.aweme.commercialize.model.i;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.commercialize.utils.p;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchEnterParam;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import com.ss.android.ugc.aweme.discover.ui.a.b;
import com.ss.android.ugc.aweme.discover.ui.a.c;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.di;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0016J\b\u0010Q\u001a\u00020NH\u0002J\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u00020UH\u0004J\b\u0010V\u001a\u00020NH$J\b\u0010W\u001a\u00020NH$J\b\u0010X\u001a\u00020NH\u0004J\u001a\u0010Y\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0010\u0010\\\u001a\u00020N2\u0006\u0010]\u001a\u00020\u001eH\u0004J\u0010\u0010^\u001a\u00020N2\u0006\u0010]\u001a\u00020\u001eH\u0014J\b\u0010_\u001a\u00020NH\u0014J\u0014\u0010`\u001a\u00020N2\n\u0010a\u001a\u00060bj\u0002`cH\u0004J\b\u0010d\u001a\u00020NH\u0004J\b\u0010e\u001a\u00020NH\u0004J\b\u0010f\u001a\u00020NH\u0004J\b\u0010g\u001a\u00020NH\u0014J\b\u0010h\u001a\u00020NH\u0016J\b\u0010i\u001a\u00020NH$J\b\u0010j\u001a\u00020NH\u0004J\u0010\u0010k\u001a\u00020N2\u0006\u0010l\u001a\u00020\u001eH$J\u0006\u0010m\u001a\u00020NJ\u0006\u0010n\u001a\u00020NJ\u0010\u0010o\u001a\u00020N2\u0006\u0010p\u001a\u00020'H\u0004J\b\u0010q\u001a\u00020NH\u0002J\b\u0010r\u001a\u00020\u001eH\u0014J\u0012\u0010s\u001a\u00020N2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J&\u0010t\u001a\u0004\u0018\u00010P2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010x2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\b\u0010y\u001a\u00020NH\u0016J\u0018\u0010z\u001a\u00020N2\u0006\u0010{\u001a\u00020S2\u0006\u0010|\u001a\u00020SH\u0004J\u001e\u0010}\u001a\u00020N2\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u000002\u0006\u0010]\u001a\u00020\u001eH\u0016J!\u0010\u0001\u001a\u00020N2\u000e\u0010~\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u000102\u0006\u0010]\u001a\u00020\u001eH\u0016J\u001f\u0010\u0001\u001a\u00020N2\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u000002\u0006\u0010]\u001a\u00020\u001eH\u0016J\u0013\u0010\u0001\u001a\u00020N2\b\u0010\u0001\u001a\u00030\u0001H\u0017J\u001b\u0010\u0001\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0013\u0010\u0001\u001a\u00020N2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020SH\u0017J\t\u0010\u0001\u001a\u00020NH\u0004J:\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020U2\t\u0010\u0001\u001a\u0004\u0018\u00010U2\u0007\u0010\u0001\u001a\u00020U2\u0006\u0010l\u001a\u00020\u001e2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0004J\u0015\u0010\u0001\u001a\u00020N2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u001b\u0010\u0001\u001a\u00020N2\u0010\u0010\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u00010H\u0016J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020UH$J\u0015\u0010\u0001\u001a\u00020N2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0014\u0010\u0001\u001a\u00020N2\t\u0010\u0001\u001a\u0004\u0018\u00010%H\u0016J\u0015\u0010\u0001\u001a\u00020N2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0013\u0010\u0001\u001a\u00020N2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0012\u0010 \u0001\u001a\u00020N2\u0007\u0010¡\u0001\u001a\u00020\u001eH\u0016J\u0012\u0010¢\u0001\u001a\u00020\u001e2\u0007\u0010£\u0001\u001a\u00020\u001eH&J\t\u0010¤\u0001\u001a\u00020NH\u0016J\u0015\u0010¥\u0001\u001a\u00020N2\n\u0010a\u001a\u00060bj\u0002`cH\u0016J\u0015\u0010¦\u0001\u001a\u00020N2\n\u0010a\u001a\u00060bj\u0002`cH\u0016J\t\u0010§\u0001\u001a\u00020NH\u0016J\u0015\u0010¨\u0001\u001a\u00020N2\n\u0010a\u001a\u00060bj\u0002`cH\u0016J\t\u0010©\u0001\u001a\u00020NH\u0016J\t\u0010ª\u0001\u001a\u00020NH\u0016J\u0013\u0010«\u0001\u001a\u00020N2\b\u0010¬\u0001\u001a\u00030­\u0001H\u0004J\u0012\u0010®\u0001\u001a\u00020N2\u0007\u0010¯\u0001\u001a\u00020\u001eH\u0004J\u0011\u0010°\u0001\u001a\u00020\u001e2\u0006\u0010p\u001a\u00020'H\u0002R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148DX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00102\u001a\b\u0012\u0004\u0012\u00028\u000003X.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000209X.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX.¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020CX.¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001b\u0010H\u001a\u00020I8DX\u0002¢\u0006\f\n\u0004\bL\u0010\u0018\u001a\u0004\bJ\u0010K¨\u0006±\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchFragment;", "D", "Lcom/ss/android/ugc/aweme/discover/ui/SearchBaseFragment;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/discover/ui/ISearchBaseView;", "()V", "mContentTopContainer", "Landroid/widget/FrameLayout;", "getMContentTopContainer", "()Landroid/widget/FrameLayout;", "setMContentTopContainer", "(Landroid/widget/FrameLayout;)V", "mGuideSearchBar", "Lcom/ss/android/ugc/aweme/discover/ui/GuideSearchBar;", "getMGuideSearchBar", "()Lcom/ss/android/ugc/aweme/discover/ui/GuideSearchBar;", "setMGuideSearchBar", "(Lcom/ss/android/ugc/aweme/discover/ui/GuideSearchBar;)V", "mGuideSearchBarView", "Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;", "getMGuideSearchBarView", "()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;", "mGuideSearchBarView$delegate", "Lkotlin/Lazy;", "mGuideSearchHeadView", "getMGuideSearchHeadView", "setMGuideSearchHeadView", "(Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;)V", "mIsInResult", "", "mNeedRefresh", "getMNeedRefresh", "()Z", "setMNeedRefresh", "(Z)V", "mQueryCorrectInfo", "Lcom/ss/android/ugc/aweme/discover/model/QueryCorrectInfo;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "getMRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "setMRecyclerView", "(Landroid/support/v7/widget/RecyclerView;)V", "mRefreshLayout", "Lcom/ss/android/ugc/aweme/base/opensourcemodified/android/support/v4/widget/SwipeRefreshLayout;", "getMRefreshLayout", "()Lcom/ss/android/ugc/aweme/base/opensourcemodified/android/support/v4/widget/SwipeRefreshLayout;", "setMRefreshLayout", "(Lcom/ss/android/ugc/aweme/base/opensourcemodified/android/support/v4/widget/SwipeRefreshLayout;)V", "mSearchAdapter", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "getMSearchAdapter", "()Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "setMSearchAdapter", "(Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;)V", "mSearchAdapterWrapper", "Lcom/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper;", "getMSearchAdapterWrapper", "()Lcom/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper;", "setMSearchAdapterWrapper", "(Lcom/ss/android/ugc/aweme/discover/base/HeaderAndFooterWrapper;)V", "mSearchCorrectHeadView", "Lcom/ss/android/ugc/aweme/discover/widget/SearchCorrectHeadView;", "mStateViewModel", "Lcom/ss/android/ugc/aweme/discover/model/SearchStateViewModel;", "mStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "getMStatusView", "()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "setMStatusView", "(Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;)V", "statusViewFactory", "Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;", "getStatusViewFactory", "()Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;", "statusViewFactory$delegate", "findViews", "", "view", "Landroid/view/View;", "finishRefresh", "getHotSearchSource", "", "getLoadMoreQueryWord", "", "initAdapter", "initPresenter", "initStatusView", "initView", "savedInstanceState", "Landroid/os/Bundle;", "invokeLoadMoreResult", "hasMore", "invokeRefreshResult", "invokeShowLoadEmpty", "invokeShowLoadError", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invokeShowLoadMoreError", "invokeShowLoading", "invokeShowMoreLoading", "invokeShowNetWorkError", "loadMore", "loadMoreData", "mobRefreshData", "mobRefreshDataForV3", "isSuccess", "mobSearchHitLimitEvent", "mobUserRefresh", "monitorRecycleShownStatus", "recyclerView", "monitorSearchState", "needToSetClipPadding", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onItemShown", "startPos", "endPos", "onLoadLatestResult", "list", "", "onLoadMoreResult", "onRefreshResult", "onSearchAfterLogin", "searchAfterLoginEvent", "Lcom/ss/android/ugc/aweme/discover/event/SearchAfterLoginEvent;", "onViewCreated", "parseParams", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "refreshData", "refreshType", "scrollToTop", "sendV3SearchLog", "labelName", "searchRid", "keyword", "searchAdInfo", "Lcom/ss/android/ugc/aweme/commercialize/model/SearchAdInfo;", "setApiResult", "apiResult", "Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "setGuideSearchWordList", "info", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "setKeyword", "setPreventSuicide", "searchPreventSuicide", "Lcom/ss/android/ugc/aweme/discover/model/SearchPreventSuicide;", "setQueryCorrectInfo", "setSearchAdInfo", "setSearchKeyword", "searchResultParam", "setUserVisibleHint", "isVisibleToUser", "shouldShowSearchAdH5", "inI18n", "showLoadEmpty", "showLoadError", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "showStatus", "status", "Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;", "tryToRefreshData", "fromVisibilityChange", "updateItemShown", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class SearchFragment<D> extends SearchBaseFragment implements LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.common.f.c<D>, af {
    public static ChangeQuickRedirect u;
    static final /* synthetic */ KProperty[] v = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchFragment.class), "mGuideSearchBarView", "getMGuideSearchBarView()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchFragment.class), "statusViewFactory", "getStatusViewFactory()Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;"))};
    @Nullable
    public GuideSearchBar A;
    @Nullable
    public GuideSearchHeadView B;
    @NotNull
    public BaseAdapter<D> C;
    @NotNull
    public HeaderAndFooterWrapper D;
    public boolean E = true;
    public boolean F = true;
    @NotNull
    private final Lazy G = an.a(new g(this));
    private HashMap H;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f3062a = an.a(new d(this));

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.widget.b f3063b;

    /* renamed from: c  reason: collision with root package name */
    private SearchStateViewModel f3064c;

    /* renamed from: d  reason: collision with root package name */
    private QueryCorrectInfo f3065d;
    @NotNull
    protected RecyclerView w;
    @NotNull
    protected DmtStatusView x;
    @NotNull
    protected SwipeRefreshLayout y;
    @NotNull
    protected FrameLayout z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "D", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchFragment f42982b;

        a(SearchFragment searchFragment) {
            this.f42982b = searchFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42981a, false, 37904, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42981a, false, 37904, new Class[0], Void.TYPE);
                return;
            }
            if (this.f42982b.isViewValid()) {
                this.f42982b.s().setRefreshing(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "D", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchFragment f42984b;

        b(SearchFragment searchFragment) {
            this.f42984b = searchFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42983a, false, 37905, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42983a, false, 37905, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f42984b.b(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "D", "onRefresh"}, k = 3, mv = {1, 1, 15})
    static final class c implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchFragment f42986b;

        c(SearchFragment searchFragment) {
            this.f42986b = searchFragment;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f42985a, false, 37906, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42985a, false, 37906, new Class[0], Void.TYPE);
                return;
            }
            this.f42986b.y();
            this.f42986b.o = 1;
            this.f42986b.b(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView;", "kotlin.jvm.PlatformType", "D", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<GuideSearchHeadView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchFragment searchFragment) {
            super(0);
            this.this$0 = searchFragment;
        }

        public final GuideSearchHeadView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37907, new Class[0], GuideSearchHeadView.class)) {
                return (GuideSearchHeadView) this.this$0.a((int) C0906R.id.ame);
            }
            return (GuideSearchHeadView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37907, new Class[0], GuideSearchHeadView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/SearchFragment$monitorRecycleShownStatus$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchFragment f42988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView f42989c;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f42987a, false, 37909, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42987a, false, 37909, new Class[0], Void.TYPE);
                return;
            }
            if (this.f42988b.getUserVisibleHintCompat() && this.f42988b.b(this.f42989c)) {
                this.f42989c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        e(SearchFragment searchFragment, RecyclerView recyclerView) {
            this.f42988b = searchFragment;
            this.f42989c = recyclerView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "D", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchFragment f42991b;

        f(SearchFragment searchFragment) {
            this.f42991b = searchFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f42990a, false, 37910, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f42990a, false, 37910, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num != null) {
                if (!this.f42991b.F && num.intValue() == 2) {
                    this.f42991b.F = true;
                    if (this.f42991b.E) {
                        this.f42991b.d(false);
                    }
                } else if (num.intValue() != 2) {
                    this.f42991b.F = false;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/ui/status/StatusViewFactory;", "D", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<com.ss.android.ugc.aweme.discover.ui.a.c> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SearchFragment searchFragment) {
            super(0);
            this.this$0 = searchFragment;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.discover.ui.a.c invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37911, new Class[0], com.ss.android.ugc.aweme.discover.ui.a.c.class)) {
                return (com.ss.android.ugc.aweme.discover.ui.a.c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37911, new Class[0], com.ss.android.ugc.aweme.discover.ui.a.c.class);
            }
            c.a aVar = com.ss.android.ugc.aweme.discover.ui.a.c.f43081c;
            Context context = this.this$0.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
            return aVar.a(context, this.this$0);
        }
    }

    public View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, u, false, 37902, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, u, false, 37902, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.H == null) {
            this.H = new HashMap();
        }
        View view = (View) this.H.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.H.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public abstract void a(@NotNull String str);

    public void a(@Nullable List<GuideSearchWord> list) {
    }

    public abstract boolean a(boolean z2);

    public abstract void a_(boolean z2);

    public void c(@NotNull List<? extends D> list, boolean z2) {
        List<? extends D> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 37897, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z2)}, this, u, false, 37897, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "list");
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37903, new Class[0], Void.TYPE);
            return;
        }
        if (this.H != null) {
            this.H.clear();
        }
    }

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public boolean m() {
        return true;
    }

    @NotNull
    public final GuideSearchHeadView u() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37848, new Class[0], GuideSearchHeadView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, u, false, 37848, new Class[0], GuideSearchHeadView.class);
        } else {
            value = this.f3062a.getValue();
        }
        return (GuideSearchHeadView) value;
    }

    @NotNull
    public final com.ss.android.ugc.aweme.discover.ui.a.c z() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37862, new Class[0], com.ss.android.ugc.aweme.discover.ui.a.c.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, u, false, 37862, new Class[0], com.ss.android.ugc.aweme.discover.ui.a.c.class);
        } else {
            value = this.G.getValue();
        }
        return (com.ss.android.ugc.aweme.discover.ui.a.c) value;
    }

    public void a(@NotNull SearchResultParam searchResultParam) {
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, this, u, false, 37871, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam}, this, u, false, 37871, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchResultParam, "searchResultParam");
        this.E = true;
        b(searchResultParam);
        a(this.h);
        d(false);
    }

    public final void a(@NotNull String str, @Nullable String str2, @NotNull String str3, boolean z2, @Nullable o oVar) {
        SearchEnterParam searchEnterParam;
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, Byte.valueOf(z2 ? (byte) 1 : 0), oVar}, this, u, false, 37875, new Class[]{String.class, String.class, String.class, Boolean.TYPE, o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str7, Byte.valueOf(z2), oVar}, this, u, false, 37875, new Class[]{String.class, String.class, String.class, Boolean.TYPE, o.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str5, "labelName");
        Intrinsics.checkParameterIsNotNull(str7, "keyword");
        String str8 = Intrinsics.areEqual((Object) "general_search", (Object) str5) ? "general" : str5;
        FragmentActivity activity = getActivity();
        String str9 = null;
        if (activity != null) {
            SearchEnterViewModel.a aVar = SearchEnterViewModel.f43247b;
            Intrinsics.checkExpressionValueIsNotNull(activity, AdvanceSetting.NETWORK_TYPE);
            searchEnterParam = aVar.a(activity).f43248a;
        } else {
            searchEnterParam = null;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("search_keyword", str7).a("request_id", str6).a("log_pb", ai.a().a(str6)).a("search_type", str8).a("enter_from", searchEnterParam != null ? searchEnterParam.getEnterSearchFrom() : null).a("previous_page", searchEnterParam != null ? searchEnterParam.getPreviousPage() : null);
        if (searchEnterParam != null) {
            str9 = searchEnterParam.getGroupId();
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("group_id", str9).a("is_success", z2 ? 1 : 0);
        if (!(oVar == null || oVar.getEasterEggInfo() == null)) {
            a3.a("is_bonus", 1);
        }
        if (this.k == 2) {
            if (TextUtils.equals(this.h, this.i)) {
                a3.a("enter_method", this.l);
            } else {
                a3.a("enter_method", "normal_search");
            }
        } else if (this.k == 7 || this.k == 6) {
            a3.a("enter_method", this.l);
        } else {
            if (com.ss.android.ugc.aweme.discover.mob.e.a().f42661b) {
                com.ss.android.ugc.aweme.discover.mob.e.a().f42661b = false;
                str4 = "click_more_general_list";
            } else if (this.k == 1) {
                str4 = "search_history";
            } else if (this.k == 3) {
                str4 = "search_sug";
            } else if (this.k == 4) {
                str4 = "related_search_keywords";
            } else if (this.k == 5) {
                str4 = "default_search_keyword";
            } else if (this.k == 9) {
                str4 = "search_guide";
            } else {
                str4 = this.k == 16 ? "recom_search" : "normal_search";
            }
            a3.a("enter_method", str4);
        }
        r.a("search", aa.a(a3.f34114b));
    }

    public void a(@NotNull List<? extends D> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 37890, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, u, false, 37890, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (isViewValid()) {
            c(z2);
            v().setData(list);
            a_(true);
        }
    }

    public final void a(@Nullable SearchPreventSuicide searchPreventSuicide) {
        if (PatchProxy.isSupport(new Object[]{searchPreventSuicide}, this, u, false, 37898, new Class[]{SearchPreventSuicide.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchPreventSuicide}, this, u, false, 37898, new Class[]{SearchPreventSuicide.class}, Void.TYPE);
            return;
        }
        if (searchPreventSuicide != null) {
            bg.a(searchPreventSuicide);
        }
    }

    public final void a(@Nullable QueryCorrectInfo queryCorrectInfo) {
        if (PatchProxy.isSupport(new Object[]{queryCorrectInfo}, this, u, false, 37899, new Class[]{QueryCorrectInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{queryCorrectInfo}, this, u, false, 37899, new Class[]{QueryCorrectInfo.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f3065d = queryCorrectInfo;
            if (queryCorrectInfo == null) {
                w().b((View) this.f3063b);
                this.f3063b = null;
                return;
            }
            w().b((View) this.B);
            if (this.f3063b == null) {
                Context context = getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                this.f3063b = new com.ss.android.ugc.aweme.discover.widget.b(context);
                HeaderAndFooterWrapper w2 = w();
                com.ss.android.ugc.aweme.discover.widget.b bVar = this.f3063b;
                if (bVar == null) {
                    Intrinsics.throwNpe();
                }
                w2.a((View) bVar);
            }
            com.ss.android.ugc.aweme.discover.widget.b bVar2 = this.f3063b;
            if (bVar2 == null) {
                Intrinsics.throwNpe();
            }
            bVar2.a(queryCorrectInfo, this.h);
            if (this.B != null) {
                HeaderAndFooterWrapper w3 = w();
                GuideSearchHeadView guideSearchHeadView = this.B;
                if (guideSearchHeadView == null) {
                    Intrinsics.throwNpe();
                }
                w3.a((View) guideSearchHeadView);
            }
        }
    }

    private final void o() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37882, new Class[0], Void.TYPE);
            return;
        }
        new Handler().postDelayed(new a(this), 500);
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37891, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView.scrollToPosition(0);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37872, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            j();
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37887, new Class[0], Void.TYPE);
            return;
        }
        n();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37877, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        bg.d(this);
        g();
    }

    @NotNull
    public final RecyclerView q() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37840, new Class[0], RecyclerView.class)) {
            return (RecyclerView) PatchProxy.accessDispatch(new Object[0], this, u, false, 37840, new Class[0], RecyclerView.class);
        }
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        return recyclerView;
    }

    @NotNull
    public final DmtStatusView r() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37842, new Class[0], DmtStatusView.class)) {
            return (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, u, false, 37842, new Class[0], DmtStatusView.class);
        }
        DmtStatusView dmtStatusView = this.x;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
        }
        return dmtStatusView;
    }

    @NotNull
    public final SwipeRefreshLayout s() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37844, new Class[0], SwipeRefreshLayout.class)) {
            return (SwipeRefreshLayout) PatchProxy.accessDispatch(new Object[0], this, u, false, 37844, new Class[0], SwipeRefreshLayout.class);
        }
        SwipeRefreshLayout swipeRefreshLayout = this.y;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRefreshLayout");
        }
        return swipeRefreshLayout;
    }

    @NotNull
    public final FrameLayout t() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37846, new Class[0], FrameLayout.class)) {
            return (FrameLayout) PatchProxy.accessDispatch(new Object[0], this, u, false, 37846, new Class[0], FrameLayout.class);
        }
        FrameLayout frameLayout = this.z;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentTopContainer");
        }
        return frameLayout;
    }

    @NotNull
    public final BaseAdapter<D> v() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37849, new Class[0], BaseAdapter.class)) {
            return (BaseAdapter) PatchProxy.accessDispatch(new Object[0], this, u, false, 37849, new Class[0], BaseAdapter.class);
        }
        BaseAdapter<D> baseAdapter = this.C;
        if (baseAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapter");
        }
        return baseAdapter;
    }

    @NotNull
    public final HeaderAndFooterWrapper w() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37851, new Class[0], HeaderAndFooterWrapper.class)) {
            return (HeaderAndFooterWrapper) PatchProxy.accessDispatch(new Object[0], this, u, false, 37851, new Class[0], HeaderAndFooterWrapper.class);
        }
        HeaderAndFooterWrapper headerAndFooterWrapper = this.D;
        if (headerAndFooterWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchAdapterWrapper");
        }
        return headerAndFooterWrapper;
    }

    public void x_() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37880, new Class[0], Void.TYPE);
            return;
        }
        a(z().a());
    }

    public void y_() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37889, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            x_();
        }
    }

    public final void z_() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37895, new Class[0], Void.TYPE);
            return;
        }
        n();
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37878, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        if (recyclerView.getChildCount() > 0) {
            SwipeRefreshLayout swipeRefreshLayout = this.y;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRefreshLayout");
            }
            swipeRefreshLayout.setRefreshing(true);
            return;
        }
        DmtStatusView dmtStatusView = this.x;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
        }
        dmtStatusView.d();
    }

    public final void A() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37863, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new b(this));
        if (!com.ss.android.g.a.a()) {
            Context context = getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
            view = new com.ss.android.ugc.aweme.discover.widget.c(context, this.n);
        } else {
            MtEmptyView a3 = MtEmptyView.a(getContext());
            Intrinsics.checkExpressionValueIsNotNull(a3, "MtEmptyView.newInstance(context)");
            view = a3;
        }
        a2.b(view);
        DmtStatusView dmtStatusView = this.x;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
        }
        dmtStatusView.setBuilder(a2);
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37876, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        com.ss.android.ugc.aweme.user.c a3 = com.ss.android.ugc.aweme.user.c.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "UserManager.inst()");
        r.a("search_freq_control_show", (Map) a2.a("is_login", a3.c() ? 1 : 0).f34114b);
    }

    @NotNull
    public final String D() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37900, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, u, false, 37900, new Class[0], String.class);
        }
        QueryCorrectInfo queryCorrectInfo = this.f3065d;
        if (queryCorrectInfo == null || queryCorrectInfo.getCorrectedLevel() != 2) {
            return this.h;
        }
        QueryCorrectInfo queryCorrectInfo2 = this.f3065d;
        if (queryCorrectInfo2 == null) {
            Intrinsics.throwNpe();
        }
        String correctedKeyword = queryCorrectInfo2.getCorrectedKeyword();
        Intrinsics.checkExpressionValueIsNotNull(correctedKeyword, "mQueryCorrectInfo!!.correctedKeyword");
        return correctedKeyword;
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37879, new Class[0], Void.TYPE);
            return;
        }
        if (v().mShowFooter) {
            v().setShowFooter(false);
            v().notifyDataSetChanged();
        }
        v().setData(null);
        DmtStatusView dmtStatusView = this.x;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
        }
        dmtStatusView.f();
        com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37892, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (PatchProxy.isSupport(new Object[0], this, u, false, 37883, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, u, false, 37883, new Class[0], Void.TYPE);
                return;
            }
            v().showLoadMoreLoading();
        }
    }

    public final int x() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37855, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, u, false, 37855, new Class[0], Integer.TYPE)).intValue();
        } else if ((this.k == 2 || this.k == 5) && TextUtils.equals(this.i, this.h)) {
            return SearchBaseFragment.a.a();
        } else {
            return 0;
        }
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37860, new Class[0], Void.TYPE);
            return;
        }
        r.a("search_pull_down_refresh", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", i()).a("search_keyword", this.h).f34114b);
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37874, new Class[0], Void.TYPE);
        } else if (!TextUtils.isEmpty(this.h)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key_word", this.h);
                if (this.k == 2) {
                    if (TextUtils.equals(this.h, this.i)) {
                        jSONObject.put("enter_from", "hot_search");
                        jSONObject.put("enter_method", this.l);
                    } else {
                        jSONObject.put("enter_from", "normal_search");
                    }
                    jSONObject.put("key_word_type", "general_word");
                } else {
                    if (this.k == 1) {
                        d("search_history");
                    } else if (this.k == 3) {
                        d("search_sug");
                    } else {
                        d("normal_search");
                    }
                    jSONObject.put("enter_from", this.m);
                }
            } catch (JSONException unused) {
            }
            r.onEvent(MobClick.obtain().setEventName("search").setLabelName(i()).setJsonObject(jSONObject));
        }
    }

    public final void a(@Nullable SearchApiResult searchApiResult) {
        this.g.f41971c = searchApiResult;
    }

    public final void a(@NotNull BaseAdapter<D> baseAdapter) {
        BaseAdapter<D> baseAdapter2 = baseAdapter;
        if (PatchProxy.isSupport(new Object[]{baseAdapter2}, this, u, false, 37850, new Class[]{BaseAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseAdapter2}, this, u, false, 37850, new Class[]{BaseAdapter.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseAdapter2, "<set-?>");
        this.C = baseAdapter2;
    }

    public final void d(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, u, false, 37896, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, u, false, 37896, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        e(exc);
    }

    @CallSuper
    public void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, u, false, 37873, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, u, false, 37873, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        j.f42669b.a(i(), this.h);
    }

    public final void c(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, u, false, 37893, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, u, false, 37893, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        if (isViewValid()) {
            if (PatchProxy.isSupport(new Object[0], this, u, false, 37884, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, u, false, 37884, new Class[0], Void.TYPE);
                return;
            }
            o();
            v().showLoadMoreError();
        }
    }

    public final void e(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, u, false, 37886, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, u, false, 37886, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        com.bytedance.ies.dmt.ui.widget.c a2 = com.ss.android.ugc.aweme.discover.ui.a.c.a(z(), null, exc2, 1);
        if (a2 != null) {
            a(a2);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), (Throwable) exc2);
        x_();
    }

    @Subscribe
    public void onSearchAfterLogin(@NotNull com.ss.android.ugc.aweme.discover.a.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, u, false, 37868, new Class[]{com.ss.android.ugc.aweme.discover.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, u, false, 37868, new Class[]{com.ss.android.ugc.aweme.discover.a.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar, "searchAfterLoginEvent");
        if (dVar.f41491a && isViewValid()) {
            DmtStatusView dmtStatusView = this.x;
            if (dmtStatusView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
            }
            if (dmtStatusView.j()) {
                DmtStatusView dmtStatusView2 = this.x;
                if (dmtStatusView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
                }
                dmtStatusView2.b();
                this.E = true;
                d(false);
            }
        }
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 37867, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, u, false, 37867, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        d(true);
    }

    public final void a(@NotNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, u, false, 37864, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, u, false, 37864, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        recyclerView.addOnScrollListener(new SearchFragment$monitorRecycleShownStatus$1(this));
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, recyclerView));
    }

    public void b(@NotNull SearchResultParam searchResultParam) {
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, this, u, false, 37854, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam}, this, u, false, 37854, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchResultParam, "param");
        this.f3055f = searchResultParam;
        this.g.f41970b = this.f3055f;
        String keyword = searchResultParam.getKeyword();
        Intrinsics.checkExpressionValueIsNotNull(keyword, "param.keyword");
        c(keyword);
        this.k = searchResultParam.getSearchFrom();
        if (8 == this.k) {
            this.o = 0;
        } else {
            this.o = 1;
        }
        String enterFrom = searchResultParam.getEnterFrom();
        Intrinsics.checkExpressionValueIsNotNull(enterFrom, "param.enterFrom");
        if (PatchProxy.isSupport(new Object[]{enterFrom}, this, SearchBaseFragment.f3053e, false, 37793, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{enterFrom}, this, SearchBaseFragment.f3053e, false, 37793, new Class[]{String.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(enterFrom, "<set-?>");
            this.l = enterFrom;
        }
        if (this.k == 2 || this.k == 5) {
            String keyword2 = searchResultParam.getKeyword();
            Intrinsics.checkExpressionValueIsNotNull(keyword2, "param.keyword");
            if (PatchProxy.isSupport(new Object[]{keyword2}, this, SearchBaseFragment.f3053e, false, 37792, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{keyword2}, this, SearchBaseFragment.f3053e, false, 37792, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(keyword2, "<set-?>");
            this.i = keyword2;
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 37870, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, u, false, 37870, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid() && getUserVisibleHint() && this.F) {
            h();
            if (this.E) {
                b(z2 ? 1 : 0);
                this.E = false;
                if (com.ss.android.ugc.aweme.discover.helper.b.c()) {
                    SearchHistoryManager.inst().recordSearchHistory(new SearchHistory(this.h, SearchHistory.toHistoryType(this.j)));
                }
            } else {
                a_(!CollectionUtils.isEmpty(v().getData()));
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, u, false, 37853, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, u, false, 37853, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable(SearchBaseFragment.q);
            if (serializable != null) {
                b((SearchResultParam) serializable);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchResultParam");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, u, false, 37869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 37869, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(SearchStateViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f3064c = (SearchStateViewModel) viewModel;
        SearchStateViewModel searchStateViewModel = this.f3064c;
        if (searchStateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStateViewModel");
        }
        searchStateViewModel.searchState.observe(this, new f(this));
    }

    public void b(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, u, false, 37888, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, u, false, 37888, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        if (isViewValid()) {
            e(exc);
        }
    }

    public void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 37881, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, u, false, 37881, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        o();
        v().setShowFooter(true);
        if (!z2) {
            v().showLoadMoreEmpty();
        } else {
            v().resetLoadMoreState();
        }
        DmtStatusView dmtStatusView = this.x;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
        }
        dmtStatusView.b();
    }

    public final void a(@NotNull com.bytedance.ies.dmt.ui.widget.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, u, false, 37861, new Class[]{com.bytedance.ies.dmt.ui.widget.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, u, false, 37861, new Class[]{com.bytedance.ies.dmt.ui.widget.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar, "status");
        o();
        if (v().mShowFooter) {
            v().setShowFooter(false);
            v().notifyDataSetChanged();
        }
        v().setData(null);
        b.a aVar = com.ss.android.ugc.aweme.discover.ui.a.b.f43078b;
        DmtStatusView dmtStatusView = this.x;
        if (dmtStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusView");
        }
        aVar.a(dmtStatusView, cVar);
        a_(false);
    }

    public final void a(@Nullable o oVar) {
        if (PatchProxy.isSupport(new Object[]{oVar}, this, u, false, 37901, new Class[]{o.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{oVar}, this, u, false, 37901, new Class[]{o.class}, Void.TYPE);
            return;
        }
        if (!(oVar == null || oVar.getEasterEggInfo() == null)) {
            if (a(com.ss.android.ugc.aweme.i18n.c.a())) {
                i easterEggInfo = oVar.getEasterEggInfo();
                Intrinsics.checkExpressionValueIsNotNull(easterEggInfo, "searchAdInfo.easterEggInfo");
                if (easterEggInfo.isH5()) {
                    i easterEggInfo2 = oVar.getEasterEggInfo();
                    Intrinsics.checkExpressionValueIsNotNull(easterEggInfo2, "searchAdInfo.easterEggInfo");
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trySetJumpToFissionH5(easterEggInfo2.getWebUrl());
                    Intent intent = new Intent(requireContext(), CrossPlatformActivity.class);
                    i easterEggInfo3 = oVar.getEasterEggInfo();
                    Intrinsics.checkExpressionValueIsNotNull(easterEggInfo3, "searchAdInfo.easterEggInfo");
                    intent.setData(Uri.parse(easterEggInfo3.getWebUrl()));
                    i easterEggInfo4 = oVar.getEasterEggInfo();
                    Intrinsics.checkExpressionValueIsNotNull(easterEggInfo4, "searchAdInfo.easterEggInfo");
                    String webTitle = easterEggInfo4.getWebTitle();
                    if (!StringUtils.isEmpty(webTitle)) {
                        intent.putExtra(PushConstants.TITLE, webTitle);
                    } else {
                        intent.putExtra(PushConstants.TITLE, " ");
                        intent.putExtra("bundle_user_webview_title", true);
                    }
                    intent.putExtra("hide_more", false);
                    intent.putExtra("enter_from", "search_ad");
                    i easterEggInfo5 = oVar.getEasterEggInfo();
                    Intrinsics.checkExpressionValueIsNotNull(easterEggInfo5, "searchAdInfo.easterEggInfo");
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).jumpToH5(easterEggInfo5.getWebUrl(), requireActivity(), intent);
                    return;
                }
            }
            k kVar = new k();
            kVar.setEasterEggInfo(oVar.getEasterEggInfo());
            kVar.setKeyWords(this.h);
            kVar.setEnterFrom(this.m);
            kVar.setEnterMethod(this.l);
            p.a(getActivity(), kVar, -1);
        }
    }

    public final boolean b(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, u, false, 37865, new Class[]{RecyclerView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, u, false, 37865, new Class[]{RecyclerView.class}, Boolean.TYPE)).booleanValue();
        }
        Pair a2 = di.a(recyclerView);
        if (!(a2.first == null || a2.second == null)) {
            Integer num = (Integer) a2.first;
            if (num == null || num.intValue() != -1) {
                Integer num2 = (Integer) a2.second;
                if (num2 == null || num2.intValue() != -1) {
                    F f2 = a2.first;
                    if (f2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(f2, "range.first!!");
                    int intValue = ((Number) f2).intValue();
                    S s = a2.second;
                    if (s == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(s, "range.second!!");
                    int intValue2 = ((Number) s).intValue();
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, this, u, false, 37866, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, this, u, false, 37866, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else if (intValue <= intValue2 && intValue >= 0) {
                        try {
                            if (intValue2 <= v().getData().size()) {
                                j.f42669b.a(v().getData().subList(intValue, intValue2));
                            }
                        } catch (Exception unused) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(@NotNull HeaderAndFooterWrapper headerAndFooterWrapper) {
        HeaderAndFooterWrapper headerAndFooterWrapper2 = headerAndFooterWrapper;
        if (PatchProxy.isSupport(new Object[]{headerAndFooterWrapper2}, this, u, false, 37852, new Class[]{HeaderAndFooterWrapper.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{headerAndFooterWrapper2}, this, u, false, 37852, new Class[]{HeaderAndFooterWrapper.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(headerAndFooterWrapper2, "<set-?>");
        this.D = headerAndFooterWrapper2;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, u, false, 37857, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, u, false, 37857, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view}, this, u, false, 37858, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, u, false, 37858, new Class[]{View.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(view, "view");
            View findViewById = view.findViewById(C0906R.id.bcz);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.list_view)");
            this.w = (RecyclerView) findViewById;
            View findViewById2 = view.findViewById(C0906R.id.cuy);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.status)");
            this.x = (DmtStatusView) findViewById2;
            View findViewById3 = view.findViewById(C0906R.id.ccw);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.refresh_layout)");
            this.y = (SwipeRefreshLayout) findViewById3;
            View findViewById4 = view.findViewById(C0906R.id.zb);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.content_top_container)");
            this.z = (FrameLayout) findViewById4;
        }
        a(view, bundle);
        k();
        if (this.f3055f != null) {
            SearchResultParam searchResultParam = this.f3055f;
            if (searchResultParam == null) {
                Intrinsics.throwNpe();
            }
            a(searchResultParam);
        }
        bg.c(this);
    }

    public void a(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, u, false, 37859, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, u, false, 37859, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        A();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = this.w;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        l();
        a(new HeaderAndFooterWrapper(v()));
        v().mTextColor = getResources().getColor(C0906R.color.zx);
        if (com.ss.android.g.a.a()) {
            v().mTextColor = getResources().getColor(C0906R.color.yx);
        }
        v().setLoadMoreListener(this);
        RecyclerView recyclerView2 = this.w;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView2.setAdapter(w());
        RecyclerView recyclerView3 = this.w;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView3.setOverScrollMode(2);
        RecyclerView recyclerView4 = this.w;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(itemAnimator, "mRecyclerView.itemAnimator!!");
        itemAnimator.setChangeDuration(0);
        if (Build.VERSION.SDK_INT <= 17) {
            SwipeRefreshLayout swipeRefreshLayout = this.y;
            if (swipeRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRefreshLayout");
            }
            swipeRefreshLayout.setDoNotCatchException(true);
        }
        RecyclerView recyclerView5 = this.w;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        a(recyclerView5);
        SwipeRefreshLayout swipeRefreshLayout2 = this.y;
        if (swipeRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRefreshLayout");
        }
        swipeRefreshLayout2.setOnRefreshListener(new c(this));
        if (m()) {
            RecyclerView recyclerView6 = this.w;
            if (recyclerView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            }
            RecyclerView recyclerView7 = this.w;
            if (recyclerView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            }
            recyclerView6.setPadding(0, (int) UIUtils.dip2Px(recyclerView7.getContext(), 8.0f), 0, 0);
            RecyclerView recyclerView8 = this.w;
            if (recyclerView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            }
            recyclerView8.setClipToPadding(false);
        }
    }

    public void b(@Nullable List<? extends D> list, boolean z2) {
        boolean z3;
        List<? extends D> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 37894, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z2)}, this, u, false, 37894, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (list2 == null || list.isEmpty()) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z3 ? (byte) 1 : 0)}, this, u, false, 37885, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z3)}, this, u, false, 37885, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                o();
                if (!z3) {
                    v().showLoadMoreEmpty();
                } else {
                    v().resetLoadMoreState();
                }
            }
            v().setDataAfterLoadMore(list2);
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, u, false, 37856, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, u, false, 37856, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.q0, viewGroup2, false);
    }
}
