package com.ss.android.ugc.aweme.discover.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.ss.android.ugc.aweme.discover.helper.RecyclerViewScrollSynchronizer;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.GuideSearchBar;
import com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.ss.android.ugc.aweme.feed.listener.OnGradualScrollListener;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.t;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.common.component.fragment.b;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00020\u00052\u00020\u00062\u00020\u0007B\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0014J\b\u0010*\u001a\u00020&H\u0014J\u001a\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020(H\u0014J\"\u00101\u001a\u00020&2\u0006\u0010,\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\u00022\u0006\u00103\u001a\u00020\nH\u0016J\b\u00104\u001a\u00020&H\u0016J\u001e\u00105\u001a\u00020&2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002072\u0006\u0010'\u001a\u00020(H\u0016J \u00108\u001a\u00020&2\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001072\u0006\u0010'\u001a\u00020(H\u0016J\b\u00109\u001a\u00020&H\u0016J\u001e\u00109\u001a\u00020&2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002072\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020&H\u0016J\b\u0010>\u001a\u00020&H\u0002J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0016J\u0018\u0010B\u001a\u00020&2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u000107H\u0016J\u0010\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020\nH\u0014J\u0010\u0010G\u001a\u00020&2\u0006\u0010H\u001a\u00020(H\u0016J\u0010\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020(H\u0016R\u0014\u0010\t\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8DX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\n8DX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0014\u0010#\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0010¨\u0006K"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchFeedFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/SearchOriginalFragment;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;", "Lcom/ss/android/ugc/aweme/feed/listener/OnPreloadListener;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Lcom/ss/android/ugc/aweme/feed/listener/OnRefreshResultListener;", "()V", "eventLable", "", "getEventLable", "()Ljava/lang/String;", "feedStyle", "", "getFeedStyle", "()I", "fragmentPanel", "Lcom/ss/android/ugc/aweme/feed/panel/CellFeedFragmentPanel;", "getFragmentPanel", "()Lcom/ss/android/ugc/aweme/feed/panel/CellFeedFragmentPanel;", "fromValue", "getFromValue", "labelName", "getLabelName", "labelOfShow", "getLabelOfShow", "mAwemeModel", "Lcom/ss/android/ugc/aweme/discover/presenter/SearchAwemeModel;", "mFragmentPanel", "getMFragmentPanel", "setMFragmentPanel", "(Lcom/ss/android/ugc/aweme/feed/panel/CellFeedFragmentPanel;)V", "monitorLabel", "getMonitorLabel", "pageType", "getPageType", "handleHasMore", "", "hasMore", "", "initAdapter", "initPresenter", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "needToSetClipPadding", "onClick", "aweme", "label", "onDestroyView", "onLoadLatestResult", "list", "", "onLoadMoreResult", "onRefreshResult", "parseParams", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "preload", "refreshSearchSource", "registerComponents", "Landroid/util/SparseArray;", "Lcom/ss/android/ugc/common/component/fragment/IFragmentComponent;", "setGuideSearchWordList", "wordList", "Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "setKeyword", "keyword", "setUserVisibleHint", "isVisibleToUser", "shouldShowSearchAdH5", "inI18n", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class SearchFeedFragment extends SearchOriginalFragment<Aweme> implements d, LoadMoreRecyclerViewAdapter.a, c<Aweme>, m, n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42676a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public CellFeedFragmentPanel f42677b = b();

    /* renamed from: c  reason: collision with root package name */
    private h f42678c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f42679d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 1, 15})
    static final class a implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchFeedFragment f42681b;

        a(SearchFeedFragment searchFeedFragment) {
            this.f42681b = searchFeedFragment;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f42680a, false, 37248, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42680a, false, 37248, new Class[0], Void.TYPE);
                return;
            }
            this.f42681b.y();
            this.f42681b.b(1);
        }
    }

    public View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42676a, false, 37246, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f42676a, false, 37246, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f42679d == null) {
            this.f42679d = new HashMap();
        }
        View view = (View) this.f42679d.get(Integer.valueOf(C0906R.id.ame));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(C0906R.id.ame);
            this.f42679d.put(Integer.valueOf(C0906R.id.ame), view);
        }
        return view;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f42676a, false, 37241, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f42676a, false, 37241, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
    }

    public final boolean a(boolean z) {
        return false;
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37247, new Class[0], Void.TYPE);
            return;
        }
        if (this.f42679d != null) {
            this.f42679d.clear();
        }
    }

    @NotNull
    public String i() {
        return "video";
    }

    @NotNull
    public String n() {
        return "search_result";
    }

    public final void p() {
    }

    public SearchFeedFragment() {
        this.j = aw.f43135c;
    }

    private final void F() {
        String str;
        h hVar = this.f42678c;
        if (hVar != null) {
            if (this.k == 9) {
                str = "guide_search";
            } else {
                str = "video_search";
            }
            hVar.f42707c = str;
        }
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37240, new Class[0], Void.TYPE);
            return;
        }
        loadMore();
    }

    public final boolean m() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37245, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37245, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().aw() != 0) {
            return true;
        } else {
            return false;
        }
    }

    @NotNull
    public SparseArray<b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37229, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37229, new Class[0], SparseArray.class);
        }
        SparseArray<b> registerComponents = super.registerComponents();
        Intrinsics.checkExpressionValueIsNotNull(registerComponents, "super.registerComponents()");
        registerComponents.append(b.a.f34652b, this.f42677b);
        return registerComponents;
    }

    @NotNull
    public CellFeedFragmentPanel b() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37227, new Class[0], CellFeedFragmentPanel.class)) {
            return (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37227, new Class[0], CellFeedFragmentPanel.class);
        }
        if (this.f42677b == null) {
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (a2.N() || AbTestManager.a().aw() != 0) {
                this.f42677b = new t(n(), this, this, o());
            } else {
                this.f42677b = new CellFeedFragmentPanel(n(), this, this, o());
            }
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        return cellFeedFragmentPanel;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37238, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37238, new Class[0], Boolean.TYPE)).booleanValue();
        }
        j jVar = (j) E().i();
        if (jVar != null) {
            return jVar.isHasMore();
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
    }

    public void k() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37231, new Class[0], Void.TYPE);
            return;
        }
        a((k<?>) new i<Object>());
        E().a(this);
        E().g = this;
        E().a((com.ss.android.ugc.aweme.common.f.d) this.f42677b);
        this.f42678c = new h();
        k<?> E = E();
        if (E != null) {
            ((i) E).a(this.f42678c);
            F();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchAwemePresenter");
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37233, new Class[0], Void.TYPE);
            return;
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        CellFeedAdapter g = cellFeedFragmentPanel.g();
        Intrinsics.checkExpressionValueIsNotNull(g, "mFragmentPanel!!.cellFeedAdapter");
        a((BaseAdapter<D>) g);
        CellFeedFragmentPanel cellFeedFragmentPanel2 = this.f42677b;
        if (cellFeedFragmentPanel2 == null) {
            Intrinsics.throwNpe();
        }
        HeaderAndFooterWrapper headerAndFooterWrapper = cellFeedFragmentPanel2.f3162f;
        Intrinsics.checkExpressionValueIsNotNull(headerAndFooterWrapper, "mFragmentPanel!!.cellFeedAdapterWrapper");
        a(headerAndFooterWrapper);
    }

    public int o() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37228, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37228, new Class[0], Integer.TYPE)).intValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (a2.N() || AbTestManager.a().aw() != 0) {
            return 15;
        }
        return 9;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f42676a, false, 37234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42676a, false, 37234, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (E() != null) {
            E().k();
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel.n();
        g();
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42676a, false, 37235, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42676a, false, 37235, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel.f(z);
        if (!z) {
            CellFeedFragmentPanel cellFeedFragmentPanel2 = this.f42677b;
            if (cellFeedFragmentPanel2 == null) {
                Intrinsics.throwNpe();
            }
            cellFeedFragmentPanel2.o();
            return;
        }
        CellFeedFragmentPanel cellFeedFragmentPanel3 = this.f42677b;
        if (cellFeedFragmentPanel3 == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel3.m();
    }

    public final void b(@NotNull SearchResultParam searchResultParam) {
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchResultParam2}, this, f42676a, false, 37230, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam2}, this, f42676a, false, 37230, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
        super.b(searchResultParam);
        F();
    }

    public final void a(@Nullable List<GuideSearchWord> list) {
        List<GuideSearchWord> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f42676a, false, 37237, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f42676a, false, 37237, new Class[]{List.class}, Void.TYPE);
        } else if (isViewValid() && com.ss.android.ugc.aweme.discover.helper.b.h()) {
            RecyclerView recyclerView = null;
            if (CollectionUtils.isEmpty(list2)) {
                w().b((View) this.B);
                this.B = null;
                GuideSearchBar guideSearchBar = this.A;
                if (guideSearchBar != null) {
                    guideSearchBar.a(list2, this.h);
                }
            } else {
                if (this.A == null) {
                    this.A = new GuideSearchBar(u());
                    GuideSearchBar guideSearchBar2 = this.A;
                    if (guideSearchBar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
                    if (cellFeedFragmentPanel != null) {
                        recyclerView = cellFeedFragmentPanel.mListView;
                    }
                    if (recyclerView == null) {
                        Intrinsics.throwNpe();
                    }
                    if (PatchProxy.isSupport(new Object[]{recyclerView}, guideSearchBar2, GuideSearchBar.f42895a, false, 37596, new Class[]{RecyclerView.class}, Void.TYPE)) {
                        GuideSearchBar guideSearchBar3 = guideSearchBar2;
                        PatchProxy.accessDispatch(new Object[]{recyclerView}, guideSearchBar3, GuideSearchBar.f42895a, false, 37596, new Class[]{RecyclerView.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(recyclerView, "view");
                        recyclerView.addOnScrollListener(guideSearchBar2);
                    }
                }
                GuideSearchBar guideSearchBar4 = this.A;
                if (guideSearchBar4 != null) {
                    guideSearchBar4.a(list2, this.h);
                }
                if (this.B == null) {
                    Context context = getContext();
                    if (context == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                    GuideSearchHeadView guideSearchHeadView = new GuideSearchHeadView(context, null, 0, 6, null);
                    this.B = guideSearchHeadView;
                    w().a((View) this.B);
                }
                GuideSearchHeadView guideSearchHeadView2 = this.B;
                if (guideSearchHeadView2 == null) {
                    Intrinsics.throwNpe();
                }
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                guideSearchHeadView2.a(list2, this.h, i(), true);
                GuideSearchHeadView guideSearchHeadView3 = this.B;
                if (guideSearchHeadView3 == null) {
                    Intrinsics.throwNpe();
                }
                GuideSearchHeadView u = u();
                if (PatchProxy.isSupport(new Object[]{u}, guideSearchHeadView3, GuideSearchHeadView.f43288a, false, 38227, new Class[]{GuideSearchHeadView.class}, Void.TYPE)) {
                    GuideSearchHeadView guideSearchHeadView4 = guideSearchHeadView3;
                    PatchProxy.accessDispatch(new Object[]{u}, guideSearchHeadView4, GuideSearchHeadView.f43288a, false, 38227, new Class[]{GuideSearchHeadView.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(u, "that");
                if (guideSearchHeadView3.f43290c == null) {
                    RecyclerView listView = guideSearchHeadView3.getListView();
                    Intrinsics.checkExpressionValueIsNotNull(listView, "this.listView");
                    RecyclerView listView2 = u.getListView();
                    Intrinsics.checkExpressionValueIsNotNull(listView2, "that.listView");
                    guideSearchHeadView3.f43290c = new RecyclerViewScrollSynchronizer(listView, listView2);
                }
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42676a, false, 37239, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42676a, false, 37239, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel.a(z);
    }

    public final void c(@NotNull List<? extends Aweme> list, boolean z) {
        List<? extends Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42676a, false, 37244, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f42676a, false, 37244, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "list");
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel.b(list2, z);
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f42676a, false, 37232, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f42676a, false, 37232, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        A();
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel.a(view, bundle);
        l();
        BaseAdapter v = v();
        if (v == null) {
            Intrinsics.throwNpe();
        }
        v.mTextColor = getResources().getColor(C0906R.color.zx);
        CellFeedFragmentPanel cellFeedFragmentPanel2 = this.f42677b;
        if (cellFeedFragmentPanel2 == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel2.n = o();
        CellFeedFragmentPanel cellFeedFragmentPanel3 = this.f42677b;
        if (cellFeedFragmentPanel3 == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel3.a((RecyclerView.OnScrollListener) new OnGradualScrollListener());
        CellFeedFragmentPanel cellFeedFragmentPanel4 = this.f42677b;
        if (cellFeedFragmentPanel4 == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel4.a((LoadMoreRecyclerViewAdapter.a) this);
        CellFeedFragmentPanel cellFeedFragmentPanel5 = this.f42677b;
        if (cellFeedFragmentPanel5 == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel5.j = this;
        CellFeedFragmentPanel cellFeedFragmentPanel6 = this.f42677b;
        if (cellFeedFragmentPanel6 == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel6.b("");
        s().setOnRefreshListener(new a(this));
        if (m()) {
            q().setPadding(0, (int) UIUtils.dip2Px(q().getContext(), 8.0f), 0, 0);
            q().setClipToPadding(false);
        }
    }

    public final void b(@Nullable List<? extends Aweme> list, boolean z) {
        List<? extends Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42676a, false, 37243, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f42676a, false, 37243, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
        if (cellFeedFragmentPanel == null) {
            Intrinsics.throwNpe();
        }
        cellFeedFragmentPanel.b(list2, z);
    }

    public final void a(@NotNull List<? extends Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42676a, false, 37242, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f42676a, false, 37242, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (isViewValid()) {
            CellFeedFragmentPanel cellFeedFragmentPanel = this.f42677b;
            if (cellFeedFragmentPanel == null) {
                Intrinsics.throwNpe();
            }
            cellFeedFragmentPanel.a(list, z);
            r().b();
            a_(true);
        }
    }

    public final void a(@NotNull View view, @Nullable Aweme aweme, @NotNull String str) {
        View view2 = view;
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, aweme2, str2}, this, f42676a, false, 37236, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aweme2, str2}, this, f42676a, false, 37236, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(str2, "label");
        if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (aweme2 != null && getActivity() != null) {
                com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeManager.inst()");
                j jVar = (j) E().i();
                if (jVar != null) {
                    a2.f44610c = jVar;
                    Bundle bundle = new Bundle();
                    bundle.putString("id", aweme.getAid());
                    bundle.putString("refer", str2);
                    bundle.putString("video_from", "from_search");
                    bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                    bundle.putInt("page_type", o());
                    bundle.putString("search_keyword", this.h);
                    DetailActivity.a((Activity) getActivity(), bundle, view2);
                    com.ss.android.ugc.aweme.feed.b.b.a(aweme);
                    k.a(n(), aweme2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
                }
            }
        }
    }
}
