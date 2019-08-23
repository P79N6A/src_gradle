package com.ss.android.ugc.aweme.discover.ui;

import android.annotation.SuppressLint;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.adapter.GuessWordsViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.ss.android.ugc.aweme.discover.adapter.SearchSugAdapter;
import com.ss.android.ugc.aweme.discover.delegate.a.e;
import com.ss.android.ugc.aweme.discover.mob.i;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.discover.presenter.e;
import com.ss.android.ugc.aweme.discover.presenter.v;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 p*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002pqB\u0005¢\u0006\u0002\u0010\u0007J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f03H\u0002J\n\u00104\u001a\u0004\u0018\u00010%H&J\b\u00105\u001a\u00020\tH&J\u001c\u00106\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%072\u0006\u00108\u001a\u000209H\u0002J\n\u0010:\u001a\u0004\u0018\u00010%H\u0002J\b\u0010;\u001a\u00020<H\u0016J\u0018\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\tH\u0016J\u0018\u0010@\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\tH\u0016J \u0010A\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020%2\u0006\u0010?\u001a\u00020\tH\u0016J\b\u0010E\u001a\u00020<H\u0016J\b\u0010F\u001a\u00020<H\u0016J\b\u0010G\u001a\u00020<H\u0016J\u0010\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020LH\u0016J\u0012\u0010M\u001a\u00020<2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J&\u0010P\u001a\u0004\u0018\u00010J2\u0006\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010U\u001a\u00020<H\u0016J\u0010\u0010V\u001a\u00020<2\u0006\u00108\u001a\u000209H\u0017J\b\u0010W\u001a\u00020<H\u0016J\u0010\u0010X\u001a\u00020<2\u0006\u0010Y\u001a\u00020ZH\u0007J\u001a\u0010[\u001a\u00020<2\u0006\u0010I\u001a\u00020J2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0010\u0010\\\u001a\u00020<2\u0006\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020<H\u0016J\b\u0010`\u001a\u00020<H\u0016J\b\u0010a\u001a\u00020LH\u0016J\b\u0010b\u001a\u00020<H\u0002J\u0018\u0010c\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020\tH\u0002J\u0018\u0010e\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020\tH\u0002J\b\u0010f\u001a\u00020<H\u0002J\b\u0010g\u001a\u00020<H\u0002J \u0010h\u001a\u00020<2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020%2\u0006\u0010d\u001a\u00020\tH\u0002J\b\u0010i\u001a\u00020<H\u0002J$\u0010j\u001a\u00020<2\u0006\u00108\u001a\u0002092\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%07H\u0002J\u0010\u0010l\u001a\u00020<2\u0006\u0010m\u001a\u00020LH\u0016J\f\u0010n\u001a\u00020o*\u00020oH\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b!\u0010\"R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R!\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'8DX\u0002¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b-\u0010.R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000¨\u0006r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateFragment;", "SuggestType", "", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchSugHandler;", "Lcom/ss/android/ugc/aweme/discover/presenter/ISearchSugContract$IView;", "()V", "mCurrentState", "", "mHistoryManager", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistoryManager;", "kotlin.jvm.PlatformType", "getMHistoryManager", "()Lcom/ss/android/ugc/aweme/discover/model/SearchHistoryManager;", "mHistoryManager$delegate", "Lkotlin/Lazy;", "mIntermediateViewModel", "Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel;", "getMIntermediateViewModel", "()Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel;", "setMIntermediateViewModel", "(Lcom/ss/android/ugc/aweme/discover/model/SearchIntermediateViewModel;)V", "mListView", "Landroid/support/v7/widget/RecyclerView;", "getMListView", "()Landroid/support/v7/widget/RecyclerView;", "setMListView", "(Landroid/support/v7/widget/RecyclerView;)V", "mSearchHistories", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "Lkotlin/collections/ArrayList;", "getMSearchHistories", "()Ljava/util/ArrayList;", "mSearchHistories$delegate", "mSearchKeyword", "", "mSearchSquareAdapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "getMSearchSquareAdapter", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "mSearchSquareAdapter$delegate", "mSearchSugAdapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSugAdapter;", "getMSearchSugAdapter", "()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSugAdapter;", "mSearchSugAdapter$delegate", "mSugPresenter", "Lcom/ss/android/ugc/aweme/discover/presenter/SearchSugPresenter;", "getFilteredSearchHistories", "", "getLabelName", "getPageIndex", "getRecommendMobExtraParam", "", "response", "Lcom/ss/android/ugc/aweme/discover/model/SearchSugResponse;", "getSearchPosition", "handleDeleteAllSearchHistory", "", "handleDeleteSearchHistoryItem", "history", "position", "handleSearchHistoryItemClick", "handleSearchSugItemClick", "entity", "Lcom/ss/android/ugc/aweme/discover/model/SearchSugEntity;", "requestId", "handleShowAllSearchHistory", "initAdapter", "initPresenter", "initView", "view", "Landroid/view/View;", "isRegisterEventBus", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onGetSearchSugListFailed", "onGetSearchSugListSuccess", "onResume", "onSearchHistoryChangedEvent", "event", "Lcom/ss/android/ugc/aweme/discover/event/SearchHistoryChangedEvent;", "onViewCreated", "openSearch", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "openSearchSquare", "openSearchSug", "refreshIntermediate", "sendSearchHistoryClearAllEvent", "sendSearchHistoryClearEvent", "order", "sendSearchHistoryClickEvent", "sendSearchHistoryShowAllEvent", "sendSearchHistoryShowEvent", "sendSearchSugClickEvent", "sendSearchSugShowEvent", "sendTrendingShowEvent", "extraParam", "setUserVisibleHint", "isVisibleToUser", "appendSearchType", "Lcom/ss/android/ugc/aweme/app/event/EventMapBuilder;", "Companion", "SimpleItemDecoration", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class SearchIntermediateFragment<SuggestType> extends AmeBaseFragment implements e.a, ak.c, ak.d {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3066b;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3067c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateFragment.class), "mSearchSquareAdapter", "getMSearchSquareAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateFragment.class), "mSearchSugAdapter", "getMSearchSugAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSugAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateFragment.class), "mHistoryManager", "getMHistoryManager()Lcom/ss/android/ugc/aweme/discover/model/SearchHistoryManager;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchIntermediateFragment.class), "mSearchHistories", "getMSearchHistories()Ljava/util/ArrayList;"))};
    public static final a g = new a((byte) 0);
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f3068a = ao.a(new d(this));
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    protected RecyclerView f3069d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    protected SearchIntermediateViewModel f3070e;

    /* renamed from: f  reason: collision with root package name */
    public String f3071f;
    private final Lazy h = ao.a(new e(this));
    private final Lazy i = ao.a(b.INSTANCE);
    private final Lazy j = ao.a(c.INSTANCE);
    private v k;
    private int l;
    private HashMap m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateFragment$SimpleItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onDraw", "c", "Landroid/graphics/Canvas;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class SimpleItemDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42994a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f42995b = new a((byte) 0);

        /* renamed from: c  reason: collision with root package name */
        private final Drawable f42996c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateFragment$SimpleItemDecoration$Companion;", "", "()V", "HORIZONTAL_MARGIN", "", "SIZE_VIEW_HOLDER", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public SimpleItemDecoration(@NotNull Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "drawable");
            this.f42996c = drawable;
        }

        public final void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Canvas canvas2 = canvas;
            RecyclerView recyclerView2 = recyclerView;
            RecyclerView.State state2 = state;
            if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, state2}, this, f42994a, false, 37960, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, state2}, this, f42994a, false, 37960, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(canvas2, "c");
            Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
            Intrinsics.checkParameterIsNotNull(state2, "state");
            if (recyclerView.getChildCount() >= 2) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
                    if ((findViewHolderForAdapterPosition instanceof HotSearchWordViewHolder) || (findViewHolderForAdapterPosition instanceof GuessWordsViewHolder)) {
                        int findFirstVisibleItemPosition = (findLastVisibleItemPosition - linearLayoutManager.findFirstVisibleItemPosition()) - 1;
                        if (findFirstVisibleItemPosition >= 0) {
                            int paddingLeft = recyclerView.getPaddingLeft() + ((int) UIUtils.dip2Px(recyclerView.getContext(), 16.0f));
                            int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - ((int) UIUtils.dip2Px(recyclerView.getContext(), 16.0f));
                            View childAt = recyclerView2.getChildAt(findFirstVisibleItemPosition);
                            Intrinsics.checkExpressionValueIsNotNull(childAt, "target");
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            if (layoutParams != null) {
                                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) layoutParams).bottomMargin;
                                this.f42996c.setBounds(paddingLeft, bottom, width, this.f42996c.getIntrinsicHeight() + bottom);
                                this.f42996c.draw(canvas2);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
                        }
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }

        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Rect rect2 = rect;
            View view2 = view;
            RecyclerView recyclerView2 = recyclerView;
            RecyclerView.State state2 = state;
            if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f42994a, false, 37959, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                Object[] objArr = {rect2, view2, recyclerView2, state2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f42994a, false, 37959, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(rect2, "outRect");
            Intrinsics.checkParameterIsNotNull(view2, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
            Intrinsics.checkParameterIsNotNull(state2, "state");
            rect2.set(0, 0, 0, this.f42996c.getIntrinsicHeight());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchIntermediateFragment$Companion;", "", "()V", "TAG", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistoryManager;", "kotlin.jvm.PlatformType", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<SearchHistoryManager> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        public final SearchHistoryManager invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37962, new Class[0], SearchHistoryManager.class)) {
                return SearchHistoryManager.inst();
            }
            return (SearchHistoryManager) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37962, new Class[0], SearchHistoryManager.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "Lkotlin/collections/ArrayList;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<ArrayList<SearchHistory>> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(0);
        }

        @NotNull
        public final ArrayList<SearchHistory> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37963, new Class[0], ArrayList.class)) {
                return new ArrayList<>();
            }
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37963, new Class[0], ArrayList.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<SearchSquareAdapter<SuggestType>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchIntermediateFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchIntermediateFragment searchIntermediateFragment) {
            super(0);
            this.this$0 = searchIntermediateFragment;
        }

        @NotNull
        public final SearchSquareAdapter<SuggestType> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37964, new Class[0], SearchSquareAdapter.class)) {
                return new SearchSquareAdapter<>(this.this$0);
            }
            return (SearchSquareAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37964, new Class[0], SearchSquareAdapter.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSugAdapter;", "SuggestType", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<SearchSugAdapter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchIntermediateFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SearchIntermediateFragment searchIntermediateFragment) {
            super(0);
            this.this$0 = searchIntermediateFragment;
        }

        @NotNull
        public final SearchSugAdapter invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37965, new Class[0], SearchSugAdapter.class)) {
                return (SearchSugAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37965, new Class[0], SearchSugAdapter.class);
            }
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            return new SearchSugAdapter(activity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "SuggestType", "", "it", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Observer<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SearchIntermediateFragment f42997a;

        f(SearchIntermediateFragment searchIntermediateFragment) {
            this.f42997a = searchIntermediateFragment;
        }

        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f42997a.f3071f = (String) obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "SuggestType", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIntermediateFragment f42999b;

        g(SearchIntermediateFragment searchIntermediateFragment) {
            this.f42999b = searchIntermediateFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f42998a, false, 37966, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f42998a, false, 37966, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            this.f42999b.l();
        }
    }

    private final SearchSugAdapter m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37920, new Class[0], SearchSugAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37920, new Class[0], SearchSugAdapter.class);
        } else {
            value = this.h.getValue();
        }
        return (SearchSugAdapter) value;
    }

    private final SearchHistoryManager n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37921, new Class[0], SearchHistoryManager.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37921, new Class[0], SearchHistoryManager.class);
        } else {
            value = this.i.getValue();
        }
        return (SearchHistoryManager) value;
    }

    private final ArrayList<SearchHistory> o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37922, new Class[0], ArrayList.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37922, new Class[0], ArrayList.class);
        } else {
            value = this.j.getValue();
        }
        return (ArrayList) value;
    }

    @Nullable
    public abstract String b();

    public abstract int c();

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37958, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37958, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.clear();
        }
    }

    @NotNull
    public final SearchSquareAdapter<SuggestType> h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37919, new Class[0], SearchSquareAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37919, new Class[0], SearchSquareAdapter.class);
        } else {
            value = this.f3068a.getValue();
        }
        return (SearchSquareAdapter) value;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    @NotNull
    public final SearchIntermediateViewModel i() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37923, new Class[0], SearchIntermediateViewModel.class)) {
            return (SearchIntermediateViewModel) PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37923, new Class[0], SearchIntermediateViewModel.class);
        }
        SearchIntermediateViewModel searchIntermediateViewModel = this.f3070e;
        if (searchIntermediateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37931, new Class[0], Void.TYPE);
            return;
        }
        this.k = new v();
        v vVar = this.k;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSugPresenter");
        }
        vVar.a(this);
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37935, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f3069d;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListView");
        }
        recyclerView.setAdapter(m());
        v vVar = this.k;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSugPresenter");
        }
        vVar.a(this.f3071f, i.a(c()));
        this.l = 2;
    }

    private final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37947, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "show");
        Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…ION_TYPE, Mob.Value.SHOW)");
        r.a("search_history", (Map) a(a2).f34114b);
    }

    private final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37952, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "show").a("sug_keyword", this.f3071f).a("log_pb", ai.a().a(m().f41882b));
        Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…am(Mob.Key.LOG_PB, logPb)");
        r.a("search_sug", (Map) a(a2).f34114b);
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37934, new Class[0], Void.TYPE);
            return;
        }
        o().clear();
        o().addAll(q());
        h().a(o(), true);
        RecyclerView recyclerView = this.f3069d;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListView");
        }
        recyclerView.setAdapter(h());
        if (!o().isEmpty()) {
            r();
        }
        this.l = 1;
    }

    public final boolean l() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37933, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37933, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || !getUserVisibleHint()) {
            return false;
        } else {
            SearchIntermediateViewModel searchIntermediateViewModel = this.f3070e;
            if (searchIntermediateViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
            }
            Integer num = (Integer) searchIntermediateViewModel.getIntermediateState().getValue();
            if (num == null) {
                return false;
            }
            if (num.intValue() == 1) {
                d();
            } else if (num.intValue() == 2) {
                p();
            } else if (num.intValue() == 0) {
                this.l = 0;
            }
            return true;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37928, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.l != 0) {
            RecyclerView recyclerView = this.f3069d;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListView");
            }
            if ((recyclerView.getAdapter() instanceof SearchSquareAdapter) && o().size() > 0) {
                r();
            }
            RecyclerView recyclerView2 = this.f3069d;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListView");
            }
            if (recyclerView2.getAdapter() instanceof SearchSugAdapter) {
                RecyclerView recyclerView3 = this.f3069d;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mListView");
                }
                RecyclerView.Adapter adapter = recyclerView3.getAdapter();
                if (adapter == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.SearchSugAdapter");
                } else if (((SearchSugAdapter) adapter).getItemCount() > 0) {
                    s();
                }
            }
        }
    }

    private final List<SearchHistory> q() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37945, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37945, new Class[0], List.class);
        }
        SearchHistoryManager n = n();
        Intrinsics.checkExpressionValueIsNotNull(n, "mHistoryManager");
        List<SearchHistory> searchHistory = n.getSearchHistory();
        Intrinsics.checkExpressionValueIsNotNull(searchHistory, "mHistoryManager.searchHistory");
        if (CollectionUtils.isEmpty(searchHistory)) {
            return CollectionsKt.emptyList();
        }
        int c2 = c();
        if (this instanceof SingleIntermediateFragment) {
            c2 = Integer.MIN_VALUE;
        }
        int historyType = SearchHistory.toHistoryType(c2);
        Collection arrayList = new ArrayList();
        for (Object next : searchHistory) {
            SearchHistory searchHistory2 = (SearchHistory) next;
            Intrinsics.checkExpressionValueIsNotNull(searchHistory2, AdvanceSetting.NETWORK_TYPE);
            if (searchHistory2.type == historyType) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37944, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
            if (!activity.isFinishing()) {
                Context context = getContext();
                Context context2 = getContext();
                if (context2 == null) {
                    Intrinsics.throwNpe();
                }
                com.bytedance.ies.dmt.ui.d.a.b(context, context2.getString(C0906R.string.b85)).a();
            }
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37939, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37948, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "show_all");
            Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…TYPE, Mob.Value.SHOW_ALL)");
            r.a("search_history", (Map) a(a2).f34114b);
        }
        SearchSquareAdapter h2 = h();
        List o = o();
        e.b bVar = e.b.TYPE_CLEAR_ALL;
        if (PatchProxy.isSupport(new Object[]{o, bVar}, h2, SearchSquareAdapter.f41869a, false, 35876, new Class[]{List.class, e.b.class}, Void.TYPE)) {
            SearchSquareAdapter searchSquareAdapter = h2;
            PatchProxy.accessDispatch(new Object[]{o, bVar}, searchSquareAdapter, SearchSquareAdapter.f41869a, false, 35876, new Class[]{List.class, e.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(o, "rawHistoryList");
        Intrinsics.checkParameterIsNotNull(bVar, "last");
        ArrayList arrayList = new ArrayList();
        h2.f41874f.a(o, arrayList, bVar);
        h2.a().b(arrayList);
        h2.a().a(bVar);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37940, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37951, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "clear_all");
            Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…YPE, Mob.Value.CLEAR_ALL)");
            r.a("search_history", (Map) a(a2).f34114b);
        }
        if (com.ss.android.ugc.aweme.discover.helper.b.c()) {
            SearchHistoryManager.inst().clearSearchHistory(SearchHistory.toHistoryType(c()));
        } else {
            SearchHistoryManager.inst().clearSearchHistory();
        }
    }

    public void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37930, new Class[0], Void.TYPE);
            return;
        }
        SearchSquareAdapter h2 = h();
        ak.c cVar = this;
        if (PatchProxy.isSupport(new Object[]{cVar}, h2, SearchSquareAdapter.f41869a, false, 35872, new Class[]{ak.c.class}, Void.TYPE)) {
            Object[] objArr = {cVar};
            SearchSquareAdapter searchSquareAdapter = h2;
            PatchProxy.accessDispatch(objArr, searchSquareAdapter, SearchSquareAdapter.f41869a, false, 35872, new Class[]{ak.c.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(cVar, "handler");
            com.ss.android.ugc.aweme.discover.delegate.a.d dVar = h2.f41873e;
            if (PatchProxy.isSupport(new Object[]{cVar}, dVar, com.ss.android.ugc.aweme.discover.delegate.a.d.f42250a, false, 36237, new Class[]{ak.c.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.discover.delegate.a.d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{cVar}, dVar2, com.ss.android.ugc.aweme.discover.delegate.a.d.f42250a, false, 36237, new Class[]{ak.c.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(cVar, "handler");
                dVar.f42251b = cVar;
            }
            com.ss.android.ugc.aweme.discover.delegate.a.f fVar = h2.f41871c;
            if (PatchProxy.isSupport(new Object[]{cVar}, fVar, com.ss.android.ugc.aweme.discover.delegate.a.f.f42255a, false, 36251, new Class[]{ak.c.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.discover.delegate.a.f fVar2 = fVar;
                PatchProxy.accessDispatch(new Object[]{cVar}, fVar2, com.ss.android.ugc.aweme.discover.delegate.a.f.f42255a, false, 36251, new Class[]{ak.c.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(cVar, "handler");
                fVar.f42256b = cVar;
            }
            com.ss.android.ugc.aweme.discover.delegate.a.e eVar = h2.f41874f;
            if (PatchProxy.isSupport(new Object[]{cVar}, eVar, com.ss.android.ugc.aweme.discover.delegate.a.e.f42252a, false, 36245, new Class[]{ak.c.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.discover.delegate.a.e eVar2 = eVar;
                PatchProxy.accessDispatch(new Object[]{cVar}, eVar2, com.ss.android.ugc.aweme.discover.delegate.a.e.f42252a, false, 36245, new Class[]{ak.c.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(cVar, "handler");
                eVar.f42254b = cVar;
            }
        }
        m().f41883c = this;
    }

    private final com.ss.android.ugc.aweme.app.d.d a(@NotNull com.ss.android.ugc.aweme.app.d.d dVar) {
        com.ss.android.ugc.aweme.app.d.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3066b, false, 37946, new Class[]{com.ss.android.ugc.aweme.app.d.d.class}, com.ss.android.ugc.aweme.app.d.d.class)) {
            return (com.ss.android.ugc.aweme.app.d.d) PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3066b, false, 37946, new Class[]{com.ss.android.ugc.aweme.app.d.d.class}, com.ss.android.ugc.aweme.app.d.d.class);
        }
        if (!TextUtils.isEmpty(b())) {
            dVar2.a("search_type", b());
        }
        return dVar2;
    }

    @SuppressLint({"notifyDataSetChanged"})
    @Subscribe
    public final void onSearchHistoryChangedEvent(@NotNull com.ss.android.ugc.aweme.discover.a.f fVar) {
        com.ss.android.ugc.aweme.discover.a.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f3066b, false, 37942, new Class[]{com.ss.android.ugc.aweme.discover.a.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f3066b, false, 37942, new Class[]{com.ss.android.ugc.aweme.discover.a.f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "event");
        o().clear();
        o().addAll(q());
        if (isViewValid()) {
            RecyclerView recyclerView = this.f3069d;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListView");
            }
            if (recyclerView.getAdapter() instanceof SearchSquareAdapter) {
                h().a(o(), false);
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3066b, false, 37932, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3066b, false, 37932, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            l();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3066b, false, 37925, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3066b, false, 37925, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(SearchIntermediateViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        this.f3070e = (SearchIntermediateViewModel) viewModel;
        SearchIntermediateViewModel searchIntermediateViewModel = this.f3070e;
        if (searchIntermediateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        searchIntermediateViewModel.getSearchKeyword().observe(lifecycleOwner, new f(this));
        SearchIntermediateViewModel searchIntermediateViewModel2 = this.f3070e;
        if (searchIntermediateViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
        }
        searchIntermediateViewModel2.getIntermediateState().observe(lifecycleOwner, new g(this));
    }

    public final void a(@NotNull SearchResultParam searchResultParam) {
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchResultParam2}, this, f3066b, false, 37936, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam2}, this, f3066b, false, 37936, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
        SearchIntermediateViewModel searchIntermediateViewModel = this.f3070e;
        if (searchIntermediateViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIntermediateViewModel");
        }
        searchIntermediateViewModel.openSearch(searchResultParam2);
    }

    @SuppressLint({"notifyDataSetChanged"})
    public final void a(@NotNull SearchSugResponse searchSugResponse) {
        String str;
        String str2;
        String str3;
        Map<String, String> map;
        Integer num;
        if (PatchProxy.isSupport(new Object[]{searchSugResponse}, this, f3066b, false, 37943, new Class[]{SearchSugResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchSugResponse}, this, f3066b, false, 37943, new Class[]{SearchSugResponse.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchSugResponse, "response");
        if (isViewValid()) {
            RecyclerView recyclerView = this.f3069d;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListView");
            }
            if (recyclerView.getAdapter() instanceof SearchSugAdapter) {
                m().f41882b = searchSugResponse.requestId;
                m().a(searchSugResponse.sugList);
                m().notifyDataSetChanged();
                if (!CollectionUtils.isEmpty(searchSugResponse.sugList)) {
                    s();
                    String str4 = null;
                    if (PatchProxy.isSupport(new Object[]{searchSugResponse}, this, f3066b, false, 37953, new Class[]{SearchSugResponse.class}, Map.class)) {
                        map = (Map) PatchProxy.accessDispatch(new Object[]{searchSugResponse}, this, f3066b, false, 37953, new Class[]{SearchSugResponse.class}, Map.class);
                    } else {
                        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("raw_query", this.f3071f);
                        RecommendWordMob recommendWordMob = searchSugResponse.recommendWordMob;
                        if (recommendWordMob != null) {
                            str = recommendWordMob.getInfo();
                        } else {
                            str = null;
                        }
                        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("info", str).a("sug_session_id", "");
                        LogPbBean logPbBean = searchSugResponse.logPb;
                        if (logPbBean != null) {
                            str2 = logPbBean.getImprId();
                        } else {
                            str2 = null;
                        }
                        com.ss.android.ugc.aweme.app.d.d a4 = a3.a("impr_id", str2);
                        if (PatchProxy.isSupport(new Object[0], this, f3066b, false, 37955, new Class[0], String.class)) {
                            str3 = (String) PatchProxy.accessDispatch(new Object[0], this, f3066b, false, 37955, new Class[0], String.class);
                        } else if (getActivity() instanceof DiscoverActivity) {
                            str3 = "discovery";
                        } else {
                            if (getActivity() instanceof SearchResultActivity) {
                                int c2 = c();
                                if (c2 == aw.f43134b) {
                                    str3 = "general";
                                } else if (c2 == aw.f43135c) {
                                    str3 = "video";
                                } else if (c2 == aw.f43136d) {
                                    str3 = AllStoryActivity.f73306b;
                                } else if (c2 == aw.f43138f) {
                                    str3 = "music";
                                } else if (c2 == aw.g) {
                                    str3 = "challenge";
                                } else if (c2 == aw.f43137e) {
                                    str3 = "poi";
                                } else if (c2 == aw.h) {
                                    str3 = "goods";
                                }
                            }
                            str3 = null;
                        }
                        map = a4.a("search_position", str3).f34114b;
                        Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
                    }
                    Map<String, String> map2 = map;
                    int size = searchSugResponse.sugList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        SearchSugEntity searchSugEntity = searchSugResponse.sugList.get(i2);
                        Intrinsics.checkExpressionValueIsNotNull(searchSugEntity, "response.sugList[i]");
                        searchSugEntity.extraParam = map2;
                    }
                    if (PatchProxy.isSupport(new Object[]{searchSugResponse, map2}, this, f3066b, false, 37954, new Class[]{SearchSugResponse.class, Map.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{searchSugResponse, map2}, this, f3066b, false, 37954, new Class[]{SearchSugResponse.class, Map.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.discover.mob.a.a aVar = new com.ss.android.ugc.aweme.discover.mob.a.a();
                    List<SearchSugEntity> list = searchSugResponse.sugList;
                    if (list != null) {
                        num = Integer.valueOf(list.size());
                    } else {
                        num = null;
                    }
                    com.ss.android.ugc.aweme.discover.mob.a.a a5 = aVar.a(num);
                    RecommendWordMob recommendWordMob2 = searchSugResponse.recommendWordMob;
                    if (recommendWordMob2 != null) {
                        str4 = recommendWordMob2.getWordsSource();
                    }
                    a5.a(str4).a(map2).e();
                }
            }
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f3066b, false, 37927, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f3066b, false, 37927, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        k();
        l();
    }

    public final void b(@NotNull SearchHistory searchHistory, int i2) {
        SearchHistory searchHistory2 = searchHistory;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{searchHistory2, Integer.valueOf(i2)}, this, f3066b, false, 37938, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchHistory2, Integer.valueOf(i2)}, this, f3066b, false, 37938, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchHistory2, "history");
        if (i3 >= 0 && i3 < o().size()) {
            if (PatchProxy.isSupport(new Object[]{searchHistory2, Integer.valueOf(i2)}, this, f3066b, false, 37950, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{searchHistory2, Integer.valueOf(i2)}, this, f3066b, false, 37950, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "clear").a("order", i3).a("search_keyword", searchHistory2.keyword);
                Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…KEYWORD, history.keyword)");
                r.a("search_history", (Map) a(a2).f34114b);
            }
            SearchHistoryManager.inst().deleteSearchHistory(searchHistory2);
        }
    }

    public final void a(@NotNull SearchHistory searchHistory, int i2) {
        if (PatchProxy.isSupport(new Object[]{searchHistory, Integer.valueOf(i2)}, this, f3066b, false, 37937, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchHistory, Integer.valueOf(i2)}, this, f3066b, false, 37937, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchHistory, "history");
        if (PatchProxy.isSupport(new Object[]{searchHistory, Integer.valueOf(i2)}, this, f3066b, false, 37949, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchHistory, Integer.valueOf(i2)}, this, f3066b, false, 37949, new Class[]{SearchHistory.class, Integer.TYPE}, Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "click").a("order", i2).a("search_keyword", searchHistory.keyword);
            Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…KEYWORD, history.keyword)");
            r.a("search_history", (Map) a(a2).f34114b);
        }
        SearchResultParam openNewSearchContainer = new SearchResultParam().setKeyword(searchHistory.keyword).setSearchFrom(1).setEnterFrom("search_history").setOpenNewSearchContainer(!com.ss.android.g.a.a());
        Intrinsics.checkExpressionValueIsNotNull(openNewSearchContainer, "param");
        a(openNewSearchContainer);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3066b, false, 37926, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3066b, false, 37926, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.q2, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f3066b, false, 37929, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f3066b, false, 37929, new Class[]{View.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(inflate, "view");
            View findViewById = inflate.findViewById(C0906R.id.ccc);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.recycler_view)");
            this.f3069d = (RecyclerView) findViewById;
            RecyclerView recyclerView = this.f3069d;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListView");
            }
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
            RecyclerView recyclerView2 = this.f3069d;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListView");
            }
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838559);
            Intrinsics.checkExpressionValueIsNotNull(a2, "resources.getDrawable(R.…tion_search_intermediate)");
            recyclerView2.addItemDecoration(new SimpleItemDecoration(a2));
            RecyclerView recyclerView3 = this.f3069d;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mListView");
            }
            recyclerView3.addOnScrollListener(new SearchIntermediateFragment$initView$1());
        }
        j();
        return inflate;
    }

    public final void a(@NotNull SearchSugEntity searchSugEntity, @NotNull String str, int i2) {
        SearchSugEntity searchSugEntity2 = searchSugEntity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{searchSugEntity2, str2, Integer.valueOf(i2)}, this, f3066b, false, 37941, new Class[]{SearchSugEntity.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchSugEntity2, str2, Integer.valueOf(i2)}, this, f3066b, false, 37941, new Class[]{SearchSugEntity.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchSugEntity, "entity");
        Intrinsics.checkParameterIsNotNull(str2, "requestId");
        if (PatchProxy.isSupport(new Object[]{searchSugEntity2, str2, Integer.valueOf(i2)}, this, f3066b, false, 37956, new Class[]{SearchSugEntity.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchSugEntity2, str2, Integer.valueOf(i2)}, this, f3066b, false, 37956, new Class[]{SearchSugEntity.class, String.class, Integer.TYPE}, Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "click").a("order", i2).a("log_pb", ai.a().a(str2)).a("sug_keyword", this.f3071f).a("search_keyword", searchSugEntity2.content);
            Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…_KEYWORD, entity.content)");
            r.a("search_sug", (Map) a(a2).f34114b);
        }
        SearchResultParam searchFrom = new SearchResultParam().setKeyword(searchSugEntity2.content).setEnterFrom("search_sug").setSearchFrom(3);
        Intrinsics.checkExpressionValueIsNotNull(searchFrom, "param");
        a(searchFrom);
    }
}
