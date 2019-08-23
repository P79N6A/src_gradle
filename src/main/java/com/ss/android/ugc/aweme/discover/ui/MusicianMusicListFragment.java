package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.discover.adapter.SearchMusicAdapter;
import com.ss.android.ugc.aweme.discover.adapter.s;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 32\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u00013B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001e\u0010$\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)H\u0002J\u001e\u0010*\u001a\u00020\u00162\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)H\u0002J\u001a\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010-\u001a\u00020\u0016H\u0002J\b\u0010.\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/MusicianMusicListFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicAdapter;", "cardDetailPosition", "", "musicAuthor", "", "viewModel", "Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel;", "viewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "finishRefresh", "", "initStatusView", "initView", "listSubscribe", "loadMoreData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadMoreResult", "list", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "hasMore", "", "onRefreshResult", "onViewCreated", "view", "refreshData", "showLoadEmpty", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "showNetworkError", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicianMusicListFragment extends AmeBaseFragment implements ae<com.ss.android.ugc.aweme.base.arch.c>, com.bytedance.jedi.arch.h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42940a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f42941b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MusicianMusicListFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicViewModel;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final c f42942e = new c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    SearchMusicAdapter f42943c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.c f42944d = new com.ss.android.ugc.aweme.base.arch.c();

    /* renamed from: f  reason: collision with root package name */
    private String f42945f;
    private int g;
    private final lifecycleAwareLazy h;
    private HashMap i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<SearchMusicListState, Bundle, SearchMusicListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState, com.bytedance.jedi.arch.x] */
        @NotNull
        public final SearchMusicListState invoke(@NotNull SearchMusicListState searchMusicListState, @Nullable Bundle bundle) {
            SearchMusicListState searchMusicListState2 = searchMusicListState;
            if (PatchProxy.isSupport(new Object[]{searchMusicListState2, bundle}, this, changeQuickRedirect, false, 37753, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{searchMusicListState2, bundle}, this, changeQuickRedirect, false, 37753, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(searchMusicListState2, "$receiver");
            return searchMusicListState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<SearchMusicViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = fragment;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final SearchMusicViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37754, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37754, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(SearchMusicViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<SearchMusicListState, SearchMusicListState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final SearchMusicListState invoke(@NotNull SearchMusicListState searchMusicListState) {
                    if (PatchProxy.isSupport(new Object[]{searchMusicListState}, this, changeQuickRedirect, false, 37755, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{searchMusicListState}, this, changeQuickRedirect, false, 37755, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(searchMusicListState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(searchMusicListState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/MusicianMusicListFragment$Companion;", "", "()V", "PARAM_CARD_DETAIL_POSITION", "", "PARAM_MUSIC_AUTHOR", "create", "Lcom/ss/android/ugc/aweme/discover/ui/MusicianMusicListFragment;", "author", "holderPosition", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42946a;

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicianMusicListFragment f42948b;

        d(MusicianMusicListFragment musicianMusicListFragment) {
            this.f42948b = musicianMusicListFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42947a, false, 37757, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42947a, false, 37757, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f42948b.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicianMusicListFragment f42950b;

        e(MusicianMusicListFragment musicianMusicListFragment) {
            this.f42950b = musicianMusicListFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42949a, false, 37758, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42949a, false, 37758, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f42950b.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "loadMore"}, k = 3, mv = {1, 1, 15})
    static final class f implements LoadMoreRecyclerViewAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42951a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicianMusicListFragment f42952b;

        f(MusicianMusicListFragment musicianMusicListFragment) {
            this.f42952b = musicianMusicListFragment;
        }

        public final void loadMore() {
            if (PatchProxy.isSupport(new Object[0], this, f42951a, false, 37759, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42951a, false, 37759, new Class[0], Void.TYPE);
                return;
            }
            MusicianMusicListFragment musicianMusicListFragment = this.f42952b;
            if (PatchProxy.isSupport(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37719, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37719, new Class[0], Void.TYPE);
                return;
            }
            SearchMusicViewModel g = musicianMusicListFragment.g();
            if (PatchProxy.isSupport(new Object[]{g}, null, com.ss.android.ugc.aweme.discover.jedi.viewmodel.d.f42531a, true, 36762, new Class[]{SearchMusicViewModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{g}, null, com.ss.android.ugc.aweme.discover.jedi.viewmodel.d.f42531a, true, 36762, new Class[]{SearchMusicViewModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(g, "$this$listLoadMore");
            g.f43252e.loadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 1, 15})
    static final class g implements SwipeRefreshLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicianMusicListFragment f42954b;

        g(MusicianMusicListFragment musicianMusicListFragment) {
            this.f42954b = musicianMusicListFragment;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f42953a, false, 37760, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42953a, false, 37760, new Class[0], Void.TYPE);
                return;
            }
            this.f42954b.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class h implements com.bytedance.jedi.arch.ext.list.c<SearchMusic, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f42955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f42956b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f42957c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f42958d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f42959e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends SearchMusic>, Unit> f42960f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f42958d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f42959e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends SearchMusic>, Unit> c() {
            return this.f42960f;
        }

        public h(Function1 function1, Function2 function2, Function2 function22) {
            this.f42955a = function1;
            this.f42956b = function2;
            this.f42957c = function22;
            this.f42958d = function1;
            this.f42959e = function2;
            this.f42960f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class i implements com.bytedance.jedi.arch.ext.list.c<SearchMusic, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f42961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f42962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f42963c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f42964d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f42965e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends SearchMusic>, Unit> f42966f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f42964d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f42965e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends SearchMusic>, Unit> c() {
            return this.f42966f;
        }

        public i(Function1 function1, Function2 function2, Function2 function22) {
            this.f42961a = function1;
            this.f42962b = function2;
            this.f42963c = function22;
            this.f42964d = function1;
            this.f42965e = function2;
            this.f42966f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends SearchMusic>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MusicianMusicListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(MusicianMusicListFragment musicianMusicListFragment) {
            super(2);
            this.this$0 = musicianMusicListFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends SearchMusic> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 37761, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 37761, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            fVar.a(this.this$0.g(), new Function1<SearchMusicListState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ j this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SearchMusicListState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SearchMusicListState searchMusicListState) {
                    SearchMusicListState searchMusicListState2 = searchMusicListState;
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[]{searchMusicListState2}, this, changeQuickRedirect, false, 37762, new Class[]{SearchMusicListState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{searchMusicListState2}, this, changeQuickRedirect, false, 37762, new Class[]{SearchMusicListState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(searchMusicListState2, AdvanceSetting.NETWORK_TYPE);
                    MusicianMusicListFragment musicianMusicListFragment = this.this$0.this$0;
                    List list = searchMusicListState.getListState().getList();
                    boolean z2 = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchMusicListState.getListState().getPayload()).f21387a.f21351a;
                    if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37720, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                        MusicianMusicListFragment musicianMusicListFragment2 = musicianMusicListFragment;
                        PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, musicianMusicListFragment2, MusicianMusicListFragment.f42940a, false, 37720, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (musicianMusicListFragment.isViewValid()) {
                        Collection collection = list;
                        if (collection == null || collection.isEmpty()) {
                            z = true;
                        }
                        if (z) {
                            musicianMusicListFragment.j();
                            return;
                        }
                        musicianMusicListFragment.i();
                        SearchMusicAdapter searchMusicAdapter = musicianMusicListFragment.f42943c;
                        if (searchMusicAdapter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        }
                        searchMusicAdapter.setShowFooter(true);
                        if (z2) {
                            searchMusicAdapter.resetLoadMoreState();
                        } else {
                            searchMusicAdapter.showLoadMoreEmpty();
                        }
                        ((DmtStatusView) musicianMusicListFragment.a(C0906R.id.cuz)).b();
                        SearchMusicAdapter searchMusicAdapter2 = musicianMusicListFragment.f42943c;
                        if (searchMusicAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        }
                        List arrayList = new ArrayList();
                        arrayList.addAll(collection);
                        searchMusicAdapter2.setData(arrayList);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MusicianMusicListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(MusicianMusicListFragment musicianMusicListFragment) {
            super(1);
            this.this$0 = musicianMusicListFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 37763, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 37763, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            MusicianMusicListFragment musicianMusicListFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37723, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37723, new Class[0], Void.TYPE);
                return;
            }
            NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) musicianMusicListFragment.a(C0906R.id.cc5);
            Intrinsics.checkExpressionValueIsNotNull(nestedScrollingRecyclerView, "recyclerView");
            if (nestedScrollingRecyclerView.getChildCount() > 0) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) musicianMusicListFragment.a(C0906R.id.ccu);
                Intrinsics.checkExpressionValueIsNotNull(swipeRefreshLayout, "refreshLayout");
                swipeRefreshLayout.setRefreshing(true);
                return;
            }
            ((DmtStatusView) musicianMusicListFragment.a(C0906R.id.cuz)).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MusicianMusicListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(MusicianMusicListFragment musicianMusicListFragment) {
            super(2);
            this.this$0 = musicianMusicListFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 37764, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 37764, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends SearchMusic>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MusicianMusicListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(MusicianMusicListFragment musicianMusicListFragment) {
            super(2);
            this.this$0 = musicianMusicListFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends SearchMusic> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 37765, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 37765, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            fVar.a(this.this$0.g(), new Function1<SearchMusicListState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ m this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SearchMusicListState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SearchMusicListState searchMusicListState) {
                    SearchMusicListState searchMusicListState2 = searchMusicListState;
                    if (PatchProxy.isSupport(new Object[]{searchMusicListState2}, this, changeQuickRedirect, false, 37766, new Class[]{SearchMusicListState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{searchMusicListState2}, this, changeQuickRedirect, false, 37766, new Class[]{SearchMusicListState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(searchMusicListState2, AdvanceSetting.NETWORK_TYPE);
                    MusicianMusicListFragment musicianMusicListFragment = this.this$0.this$0;
                    List list = searchMusicListState.getListState().getList();
                    boolean z = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchMusicListState.getListState().getPayload()).f21387a.f21351a;
                    if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37721, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
                        MusicianMusicListFragment musicianMusicListFragment2 = musicianMusicListFragment;
                        PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, musicianMusicListFragment2, MusicianMusicListFragment.f42940a, false, 37721, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (musicianMusicListFragment.isViewValid()) {
                        musicianMusicListFragment.i();
                        SearchMusicAdapter searchMusicAdapter = musicianMusicListFragment.f42943c;
                        if (searchMusicAdapter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        }
                        if (z) {
                            searchMusicAdapter.resetLoadMoreState();
                        } else {
                            searchMusicAdapter.showLoadMoreEmpty();
                        }
                        searchMusicAdapter.setDataAfterLoadMore(list);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MusicianMusicListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(MusicianMusicListFragment musicianMusicListFragment) {
            super(1);
            this.this$0 = musicianMusicListFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 37767, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 37767, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            MusicianMusicListFragment musicianMusicListFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37724, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37724, new Class[0], Void.TYPE);
                return;
            }
            SearchMusicAdapter searchMusicAdapter = musicianMusicListFragment.f42943c;
            if (searchMusicAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            searchMusicAdapter.showLoadMoreLoading();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MusicianMusicListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(MusicianMusicListFragment musicianMusicListFragment) {
            super(2);
            this.this$0 = musicianMusicListFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 37768, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 37768, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            MusicianMusicListFragment musicianMusicListFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37726, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37726, new Class[0], Void.TYPE);
                return;
            }
            if (musicianMusicListFragment.isViewValid()) {
                musicianMusicListFragment.i();
                SearchMusicAdapter searchMusicAdapter = musicianMusicListFragment.f42943c;
                if (searchMusicAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                }
                searchMusicAdapter.showLoadMoreError();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class p extends FunctionReference implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        p(MusicianMusicListFragment musicianMusicListFragment) {
            super(0, musicianMusicListFragment);
        }

        public final String getName() {
            return "showNetworkError";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37770, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(MusicianMusicListFragment.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37770, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "showNetworkError()V";
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37769, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37769, new Class[0], Void.TYPE);
                return;
            }
            MusicianMusicListFragment musicianMusicListFragment = (MusicianMusicListFragment) this.receiver;
            if (PatchProxy.isSupport(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37727, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], musicianMusicListFragment, MusicianMusicListFragment.f42940a, false, 37727, new Class[0], Void.TYPE);
                return;
            }
            if (musicianMusicListFragment.isViewValid()) {
                musicianMusicListFragment.i();
                SearchMusicAdapter searchMusicAdapter = musicianMusicListFragment.f42943c;
                if (searchMusicAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                }
                searchMusicAdapter.setShowFooter(false);
                SearchMusicAdapter searchMusicAdapter2 = musicianMusicListFragment.f42943c;
                if (searchMusicAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                }
                searchMusicAdapter2.setData(null);
                ((DmtStatusView) musicianMusicListFragment.a(C0906R.id.cuz)).f();
                com.bytedance.ies.dmt.ui.d.a.b(musicianMusicListFragment.getContext(), (int) C0906R.string.bgf).a();
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f42940a, false, 37750, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f42940a, false, 37750, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        View view = (View) this.i.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.i.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final SearchMusicViewModel g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37711, new Class[0], SearchMusicViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37711, new Class[0], SearchMusicViewModel.class);
        } else {
            value = this.h.getValue();
        }
        return (SearchMusicViewModel) value;
    }

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.f42944d;
    }

    public MusicianMusicListFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SearchMusicViewModel.class);
        this.h = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
    }

    @NotNull
    public final com.bytedance.jedi.arch.k a() {
        if (!PatchProxy.isSupport(new Object[0], this, f42940a, false, 37728, new Class[0], com.bytedance.jedi.arch.k.class)) {
            return h.a.a(this);
        }
        return (com.bytedance.jedi.arch.k) PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37728, new Class[0], com.bytedance.jedi.arch.k.class);
    }

    @NotNull
    public final r<com.bytedance.jedi.arch.f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f42940a, false, 37731, new Class[0], r.class)) {
            return h.a.b(this);
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37731, new Class[0], r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f42940a, false, 37732, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37732, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, f42940a, false, 37729, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37729, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        com.bytedance.jedi.arch.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37730, new Class[0], com.bytedance.jedi.arch.f.class)) {
            fVar = (com.bytedance.jedi.arch.f) PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37730, new Class[0], com.bytedance.jedi.arch.f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37722, new Class[0], Void.TYPE);
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(C0906R.id.ccu);
        if (!isViewValid()) {
            swipeRefreshLayout = null;
        }
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37751, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.clear();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37718, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37718, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
            com.ss.android.b.a.a.a.a(new ah(new p(this)), 100);
        } else {
            SearchMusicViewModel g2 = g();
            String str = this.f42945f;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("musicAuthor");
            }
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(str, 1, null, 0, 0, null, 44);
            g2.a(fVar);
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.d.a(g());
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37725, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            i();
            SearchMusicAdapter searchMusicAdapter = this.f42943c;
            if (searchMusicAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            searchMusicAdapter.setShowFooter(false);
            SearchMusicAdapter searchMusicAdapter2 = this.f42943c;
            if (searchMusicAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            searchMusicAdapter2.setData(null);
            ((DmtStatusView) a(C0906R.id.cuz)).e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r0 == null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42940a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 37712(0x9350, float:5.2846E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42940a
            r3 = 0
            r4 = 37712(0x9350, float:5.2846E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.onCreate(r10)
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = "param_music_author"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            java.lang.String r0 = ""
        L_0x0045:
            r9.f42945f = r0
            android.os.Bundle r0 = r9.getArguments()
            if (r0 == 0) goto L_0x0053
            java.lang.String r1 = "param_holder_postion"
            int r8 = r0.getInt(r1, r8)
        L_0x0053:
            r9.g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.MusicianMusicListFragment.onCreate(android.os.Bundle):void");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f42940a, false, 37714, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f42940a, false, 37714, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37715, new Class[0], Void.TYPE);
            return;
        }
        NormalTitleBar normalTitleBar = (NormalTitleBar) a(C0906R.id.d3b);
        Intrinsics.checkExpressionValueIsNotNull(normalTitleBar, "titleBar");
        DmtTextView titleView = normalTitleBar.getTitleView();
        Intrinsics.checkExpressionValueIsNotNull(titleView, "titleBar.titleView");
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Object[] objArr = new Object[1];
        String str = this.f42945f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicAuthor");
        }
        objArr[0] = str;
        String string = context.getString(C0906R.string.bek, objArr);
        Intrinsics.checkExpressionValueIsNotNull(string, "context!!.getString(R.st….music_from, musicAuthor)");
        String format = String.format(string, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        titleView.setText(format);
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) a(C0906R.id.d3b);
        Intrinsics.checkExpressionValueIsNotNull(normalTitleBar2, "titleBar");
        normalTitleBar2.getStartBtn().setOnClickListener(new e(this));
        ((NormalTitleBar) a(C0906R.id.d3b)).showDividerLine(true);
        s sVar = new s(false);
        sVar.f41973e = "artist_card_detail";
        sVar.f41972d = this.g;
        String str2 = this.f42945f;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicAuthor");
        }
        this.f42943c = new SearchMusicAdapter(null, sVar, str2);
        SearchMusicAdapter searchMusicAdapter = this.f42943c;
        if (searchMusicAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        searchMusicAdapter.mTextColor = getResources().getColor(C0906R.color.yx);
        SearchMusicAdapter searchMusicAdapter2 = this.f42943c;
        if (searchMusicAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        searchMusicAdapter2.setLoadMoreListener(new f(this));
        ((SwipeRefreshLayout) a(C0906R.id.ccu)).setOnRefreshListener(new g(this));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(C0906R.id.ccu);
        Intrinsics.checkExpressionValueIsNotNull(swipeRefreshLayout, "refreshLayout");
        swipeRefreshLayout.setEnabled(false);
        NestedScrollingRecyclerView nestedScrollingRecyclerView = (NestedScrollingRecyclerView) a(C0906R.id.cc5);
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollingRecyclerView, "recyclerView");
        nestedScrollingRecyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext(), 1, false));
        NestedScrollingRecyclerView nestedScrollingRecyclerView2 = (NestedScrollingRecyclerView) a(C0906R.id.cc5);
        Intrinsics.checkExpressionValueIsNotNull(nestedScrollingRecyclerView2, "recyclerView");
        SearchMusicAdapter searchMusicAdapter3 = this.f42943c;
        if (searchMusicAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        nestedScrollingRecyclerView2.setAdapter(searchMusicAdapter3);
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37717, new Class[0], Void.TYPE);
        } else {
            MtEmptyView a2 = MtEmptyView.a(getContext());
            a2.setStatus(new c.a(a2.getContext()).a(2130839718).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a);
            ((DmtStatusView) a(C0906R.id.cuz)).setBuilder(DmtStatusView.a.a(getContext()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new d(this)).b((View) a2));
        }
        if (PatchProxy.isSupport(new Object[0], this, f42940a, false, 37716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42940a, false, 37716, new Class[0], Void.TYPE);
        } else {
            SearchMusicViewModel g2 = g();
            com.bytedance.jedi.arch.e eVar = this;
            SearchMusicAdapter searchMusicAdapter4 = this.f42943c;
            if (searchMusicAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            com.bytedance.jedi.arch.ext.list.a aVar = searchMusicAdapter4;
            com.bytedance.jedi.arch.ext.list.c hVar = new h(new k(this), new l(this), new j(this));
            com.bytedance.jedi.arch.ext.list.c iVar = new i(new n(this), new o(this), new m(this));
            if (PatchProxy.isSupport(new Object[]{g2, eVar, aVar, hVar, iVar, null}, null, com.ss.android.ugc.aweme.discover.jedi.viewmodel.d.f42531a, true, 36768, new Class[]{SearchMusicViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE)) {
                Object[] objArr2 = {g2, eVar, aVar, hVar, iVar, null};
                Object[] objArr3 = objArr2;
                PatchProxy.accessDispatch(objArr3, null, com.ss.android.ugc.aweme.discover.jedi.viewmodel.d.f42531a, true, 36768, new Class[]{SearchMusicViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(g2, "$this$listSubscribe");
                Intrinsics.checkParameterIsNotNull(eVar, "subscriber");
                Intrinsics.checkParameterIsNotNull(aVar, "adapter");
                ListMiddleware.a(g2.f43252e, eVar, aVar, false, eVar.c(), hVar, iVar, null, null, SearchJediMixFeedAdapter.f42517f);
            }
        }
        h();
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, f42940a, false, 37733, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, f42940a, false, 37733, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f42940a, false, 37713, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f42940a, false, 37713, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.ow, viewGroup2, false);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f42940a, false, 37749, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, f42940a, false, 37749, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, z, z2, function2);
    }

    @NotNull
    public final <S extends x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends A> kProperty12 = kProperty1;
        Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f42940a, false, 37744, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, f42940a, false, 37744, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop1");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2);
    }

    @NotNull
    public final <S extends x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super Throwable, Unit> function2, @Nullable Function1<? super com.bytedance.jedi.arch.f, Unit> function1, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super T, Unit> function22) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty12 = kProperty1;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, f42940a, false, 37743, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, f42940a, false, 37743, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
