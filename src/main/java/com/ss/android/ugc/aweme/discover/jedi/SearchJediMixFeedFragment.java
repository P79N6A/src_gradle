package com.ss.android.ugc.aweme.discover.jedi;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchGridSpacingItemDecoration;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0005H\u0014J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/SearchJediMixFeedFragment;", "Lcom/ss/android/ugc/aweme/discover/jedi/SearchJediFragment;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "()V", "labelName", "", "getLabelName", "()Ljava/lang/String;", "searchViewModel", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;", "getSearchViewModel", "()Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;", "searchViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "initAdapter", "", "initPresenter", "initView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "loadMoreData", "mobRefreshDataForV3", "isSuccess", "", "needToSetClipPadding", "onVideoEvent", "event", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "refreshData", "refreshType", "", "setKeyword", "keyword", "shouldShowSearchAdH5", "inI18n", "showLoadEmpty", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchJediMixFeedFragment extends SearchJediFragment<com.ss.android.ugc.aweme.discover.mixfeed.a> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f3037c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3038d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchJediMixFeedFragment.class), "searchViewModel", "getSearchViewModel()Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchJediViewModel;"))};
    private final lifecycleAwareLazy G;
    private HashMap H;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<SearchState, Bundle, SearchState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState] */
        @NotNull
        public final SearchState invoke(@NotNull SearchState searchState, @Nullable Bundle bundle) {
            SearchState searchState2 = searchState;
            if (PatchProxy.isSupport(new Object[]{searchState2, bundle}, this, changeQuickRedirect, false, 36701, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{searchState2, bundle}, this, changeQuickRedirect, false, 36701, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(searchState2, "$receiver");
            return searchState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<SearchJediViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final SearchJediViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36702, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36702, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(SearchJediViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<SearchState, SearchState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState] */
                @NotNull
                public final SearchState invoke(@NotNull SearchState searchState) {
                    if (PatchProxy.isSupport(new Object[]{searchState}, this, changeQuickRedirect, false, 36703, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{searchState}, this, changeQuickRedirect, false, 36703, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(searchState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(searchState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/discover/jedi/SearchJediMixFeedFragment$initAdapter$1", "Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;", "onClick", "", "view", "Landroid/view/View;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "label", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.aweme.challenge.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42492a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchJediMixFeedFragment f42493b;

        c(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            this.f42493b = searchJediMixFeedFragment;
        }

        public final void a(@Nullable View view, @Nullable Aweme aweme, @Nullable String str) {
            View view2 = view;
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{view2, aweme2, str}, this, f42492a, false, 36704, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, aweme2, str}, this, f42492a, false, 36704, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
                return;
            }
            if (!(com.ss.android.ugc.aweme.c.a.a.a(view) || aweme2 == null || this.f42493b.getActivity() == null)) {
                com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AwemeManager.inst()");
                a2.f44611d = this.f42493b.h();
                com.ss.android.ugc.aweme.ag.h.a().a((Activity) this.f42493b.getActivity(), com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", this.f42493b.i()).a("video_from", a.f42507a).a("profile_enterprise_type", aweme.getEnterpriseType()).a("page_type", 9).a("search_keyword", this.f42493b.h).a(), view);
                com.ss.android.ugc.aweme.feed.b.b.a(aweme);
                com.ss.android.ugc.aweme.discover.mob.k.a(this.f42493b.i(), aweme2, this.f42493b.h);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.discover.mixfeed.a, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f42494a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f42495b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f42496c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f42497d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f42498e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> f42499f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f42497d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f42498e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> c() {
            return this.f42499f;
        }

        public d(Function1 function1, Function2 function2, Function2 function22) {
            this.f42494a = function1;
            this.f42495b = function2;
            this.f42496c = function22;
            this.f42497d = function1;
            this.f42498e = function2;
            this.f42499f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.discover.mixfeed.a, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f42500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f42501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f42502c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f42503d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f42504e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> f42505f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f42503d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f42504e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> c() {
            return this.f42505f;
        }

        public e(Function1 function1, Function2 function2, Function2 function22) {
            this.f42500a = function1;
            this.f42501b = function2;
            this.f42502c = function22;
            this.f42503d = function1;
            this.f42504e = function2;
            this.f42505f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "throwable", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            super(2);
            this.this$0 = searchJediMixFeedFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 36705, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 36705, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            if (th instanceof Exception) {
                this.this$0.b((Exception) th);
            } else {
                this.this$0.b(new Exception(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            super(2);
            this.this$0 = searchJediMixFeedFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull final List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 36706, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 36706, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            fVar.a(this.this$0.h(), new Function1<SearchState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ g this$0;

                {
                    this.this$0 = r1;
                }

                @Nullable
                public final Unit invoke(@NotNull SearchState searchState) {
                    if (PatchProxy.isSupport(new Object[]{searchState}, this, changeQuickRedirect, false, 36707, new Class[]{SearchState.class}, Unit.class)) {
                        return (Unit) PatchProxy.accessDispatch(new Object[]{searchState}, this, changeQuickRedirect, false, 36707, new Class[]{SearchState.class}, Unit.class);
                    }
                    Intrinsics.checkParameterIsNotNull(searchState, AdvanceSetting.NETWORK_TYPE);
                    com.bytedance.jedi.arch.ext.list.b bVar = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f21387a;
                    List b2 = com.ss.android.ugc.aweme.discover.base.f.f42170b.b(com.ss.android.ugc.aweme.discover.base.f.f42170b.a(searchState.getListState().getList()));
                    if (searchState.getListState().getList().isEmpty() || list.isEmpty()) {
                        this.this$0.this$0.y_();
                    } else {
                        this.this$0.this$0.a(b2, bVar.f21351a);
                    }
                    SearchApiResult searchApiResult = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f42533d;
                    if (searchApiResult == null) {
                        return null;
                    }
                    this.this$0.this$0.a(searchApiResult.suicidePrevent);
                    this.this$0.this$0.a(searchApiResult.queryCorrectInfo);
                    this.this$0.this$0.a(searchApiResult.adInfo);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            super(1);
            this.this$0 = searchJediMixFeedFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 36708, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 36708, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            this.this$0.n_();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "throwable", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            super(2);
            this.this$0 = searchJediMixFeedFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 36709, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 36709, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, "throwable");
            this.this$0.c(new Exception(th2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeed;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            super(2);
            this.this$0 = searchJediMixFeedFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends com.ss.android.ugc.aweme.discover.mixfeed.a> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 36710, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 36710, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            fVar.a(this.this$0.h(), new Function1<SearchState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ j this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SearchState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SearchState searchState) {
                    SearchState searchState2 = searchState;
                    if (PatchProxy.isSupport(new Object[]{searchState2}, this, changeQuickRedirect, false, 36711, new Class[]{SearchState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{searchState2}, this, changeQuickRedirect, false, 36711, new Class[]{SearchState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(searchState2, AdvanceSetting.NETWORK_TYPE);
                    com.bytedance.jedi.arch.ext.list.b bVar = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f21387a;
                    this.this$0.this$0.b(com.ss.android.ugc.aweme.discover.base.f.f42170b.b(com.ss.android.ugc.aweme.discover.base.f.f42170b.a(searchState.getListState().getList())), bVar.f21351a);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            super(1);
            this.this$0 = searchJediMixFeedFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 36712, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 36712, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            this.this$0.s_();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static final l INSTANCE = new l();
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
            super(2);
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 36713, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 36713, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function1<SearchState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $isSuccess;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SearchJediMixFeedFragment searchJediMixFeedFragment, boolean z) {
            super(1);
            this.this$0 = searchJediMixFeedFragment;
            this.$isSuccess = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SearchState searchState) {
            o oVar;
            if (PatchProxy.isSupport(new Object[]{searchState}, this, changeQuickRedirect, false, 36714, new Class[]{SearchState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{searchState}, this, changeQuickRedirect, false, 36714, new Class[]{SearchState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(searchState, AdvanceSetting.NETWORK_TYPE);
            SearchJediMixFeedFragment searchJediMixFeedFragment = this.this$0;
            String i = this.this$0.i();
            String str = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f42532c;
            String str2 = this.this$0.h;
            boolean z = this.$isSuccess;
            SearchApiResult searchApiResult = ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f42533d;
            if (searchApiResult != null) {
                oVar = searchApiResult.adInfo;
            } else {
                oVar = null;
            }
            searchJediMixFeedFragment.a(i, str, str2, z, oVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function1<SearchState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchJediMixFeedFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(SearchJediMixFeedFragment searchJediMixFeedFragment) {
            super(1);
            this.this$0 = searchJediMixFeedFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SearchState searchState) {
            if (PatchProxy.isSupport(new Object[]{searchState}, this, changeQuickRedirect, false, 36715, new Class[]{SearchState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{searchState}, this, changeQuickRedirect, false, 36715, new Class[]{SearchState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(searchState, AdvanceSetting.NETWORK_TYPE);
            com.bytedance.ies.dmt.ui.widget.c a2 = com.ss.android.ugc.aweme.discover.ui.a.c.a(this.this$0.z(), ((com.ss.android.ugc.aweme.discover.jedi.viewmodel.e) searchState.getListState().getPayload()).f42533d, null, 2);
            if (a2 != null) {
                this.this$0.a(a2);
            } else {
                this.this$0.x_();
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3037c, false, 36699, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ame)}, this, f3037c, false, 36699, new Class[]{Integer.TYPE}, View.class);
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

    public final boolean a(boolean z) {
        return z;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3037c, false, 36700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3037c, false, 36700, new Class[0], Void.TYPE);
            return;
        }
        if (this.H != null) {
            this.H.clear();
        }
    }

    public final SearchJediViewModel h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3037c, false, 36690, new Class[0], SearchJediViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3037c, false, 36690, new Class[0], SearchJediViewModel.class);
        } else {
            value = this.G.getValue();
        }
        return (SearchJediViewModel) value;
    }

    @NotNull
    public final String i() {
        return "general_search";
    }

    public final void k() {
    }

    public final boolean m() {
        return false;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public SearchJediMixFeedFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SearchJediViewModel.class);
        this.G = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3037c, false, 36697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3037c, false, 36697, new Class[0], Void.TYPE);
            return;
        }
        a(h(), new n(this));
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3037c, false, 36692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3037c, false, 36692, new Class[0], Void.TYPE);
            return;
        }
        SearchJediViewModel h2 = h();
        com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(D(), 1, this.l, x(), this.o, null, 32);
        h2.a(fVar);
        com.ss.android.ugc.aweme.discover.jedi.viewmodel.b.a(h());
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3037c, false, 36695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3037c, false, 36695, new Class[0], Void.TYPE);
            return;
        }
        a((BaseAdapter<D>) new SearchJediMixFeedAdapter<D>(q(), this.f3055f, new c(this)));
        q().setLayoutManager(new SearchJediMixFeedFragment$initAdapter$layoutManager$1(this, getContext(), 2));
        q().addItemDecoration(new SearchGridSpacingItemDecoration(2, (int) UIUtils.dip2Px(getContext(), 1.0f), false));
    }

    public final void a_(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3037c, false, 36694, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3037c, false, 36694, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(h(), new m(this, z));
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3037c, false, 36693, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3037c, false, 36693, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i2);
        if (NetworkUtils.isNetworkAvailable(getActivity())) {
            SearchJediViewModel h2 = h();
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f(this.h, i2, this.l, x(), this.o, null, 32);
            h2.a(fVar);
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.b.b(h());
            return;
        }
        f();
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3037c, false, 36691, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3037c, false, 36691, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        BaseAdapter v = v();
        if (v != null) {
            SearchJediMixFeedAdapter searchJediMixFeedAdapter = (SearchJediMixFeedAdapter) v;
            SearchResultParam searchResultParam = this.f3055f;
            if (searchResultParam == null) {
                Intrinsics.throwNpe();
            }
            if (PatchProxy.isSupport(new Object[]{searchResultParam}, searchJediMixFeedAdapter, SearchJediMixFeedAdapter.f42513a, false, 36720, new Class[]{SearchResultParam.class}, Void.TYPE)) {
                SearchJediMixFeedAdapter searchJediMixFeedAdapter2 = searchJediMixFeedAdapter;
                PatchProxy.accessDispatch(new Object[]{searchResultParam}, searchJediMixFeedAdapter2, SearchJediMixFeedAdapter.f42513a, false, 36720, new Class[]{SearchResultParam.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(searchResultParam, "param");
            searchJediMixFeedAdapter.f42518b = searchResultParam;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6 A[LOOP:0: B:22:0x00b1->B:36:0x00e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4 A[SYNTHETIC] */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onVideoEvent(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.feed.f.ar r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f3037c
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.ar> r3 = com.ss.android.ugc.aweme.feed.f.ar.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 36698(0x8f5a, float:5.1425E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f3037c
            r13 = 0
            r14 = 36698(0x8f5a, float:5.1425E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.ar> r0 = com.ss.android.ugc.aweme.feed.f.ar.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            boolean r2 = r17.isViewValid()
            if (r2 != 0) goto L_0x0042
            return
        L_0x0042:
            int r2 = r0.f45292b
            r3 = 13
            if (r2 == r3) goto L_0x0114
            r3 = 21
            if (r2 == r3) goto L_0x004e
            goto L_0x013a
        L_0x004e:
            java.lang.Object r0 = r0.f45293c
            if (r0 == 0) goto L_0x010c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 != 0) goto L_0x0057
            return
        L_0x0057:
            com.ss.android.ugc.aweme.common.adapter.BaseAdapter r2 = r17.v()
            if (r2 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter r2 = (com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter) r2
            java.lang.String r0 = r0.getAid()
            java.lang.String r3 = "awemeScrollTo.aid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter.f42513a
            r13 = 0
            r14 = 36721(0x8f71, float:5.1457E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r15[r9] = r3
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11 = r2
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r4 = -1
            if (r3 == 0) goto L_0x00a0
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter.f42513a
            r13 = 0
            r14 = 36721(0x8f71, float:5.1457E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x00ea
        L_0x00a0:
            java.lang.String r3 = "awemeId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.util.List r2 = r2.mItems
            java.lang.String r3 = "mItems"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x00b1:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00e9
            java.lang.Object r5 = r2.next()
            com.ss.android.ugc.aweme.discover.mixfeed.a r5 = (com.ss.android.ugc.aweme.discover.mixfeed.a) r5
            java.lang.String r6 = "it"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            boolean r6 = r5.a()
            if (r6 == 0) goto L_0x00e1
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.getAweme()
            if (r5 == 0) goto L_0x00d6
            java.lang.String r5 = r5.getAid()
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto L_0x00e1
            r5 = 1
            goto L_0x00e2
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            if (r5 == 0) goto L_0x00e6
            r0 = r3
            goto L_0x00ea
        L_0x00e6:
            int r3 = r3 + 1
            goto L_0x00b1
        L_0x00e9:
            r0 = -1
        L_0x00ea:
            if (r0 == r4) goto L_0x013a
            android.support.v7.widget.RecyclerView r1 = r17.q()
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            if (r1 == 0) goto L_0x00fc
            android.support.v7.widget.GridLayoutManager r1 = (android.support.v7.widget.GridLayoutManager) r1
            r1.scrollToPositionWithOffset(r0, r9)
            goto L_0x013a
        L_0x00fc:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager"
            r0.<init>(r1)
            throw r0
        L_0x0104:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter"
            r0.<init>(r1)
            throw r0
        L_0x010c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme"
            r0.<init>(r1)
            throw r0
        L_0x0114:
            android.support.v7.widget.RecyclerView r0 = r17.q()
            int r0 = r0.getChildCount()
        L_0x011c:
            if (r9 >= r0) goto L_0x013a
            android.support.v7.widget.RecyclerView r1 = r17.q()
            android.view.View r1 = r1.getChildAt(r9)
            android.support.v7.widget.RecyclerView r2 = r17.q()
            android.support.v7.widget.RecyclerView$ViewHolder r1 = r2.getChildViewHolder(r1)
            boolean r2 = r1 instanceof com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder
            if (r2 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder r1 = (com.ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder) r1
            r1.l()
        L_0x0137:
            int r9 = r9 + 1
            goto L_0x011c
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.jedi.SearchJediMixFeedFragment.onVideoEvent(com.ss.android.ugc.aweme.feed.f.ar):void");
    }

    public final void a(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3037c, false, 36696, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3037c, false, 36696, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.a(view, bundle);
        SearchJediViewModel h2 = h();
        com.bytedance.jedi.arch.e eVar = this;
        BaseAdapter v = v();
        if (v != null) {
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.b.a(h2, eVar, (com.bytedance.jedi.arch.ext.list.a) v, new d(new h(this), new f(this), new g(this)), new e(new k(this), new i(this), new j(this)), l.INSTANCE);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.ext.list.DiffableAdapter<com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeed>");
    }
}
