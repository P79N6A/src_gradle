package com.ss.android.ugc.aweme.commerce.collection;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
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
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import io.reactivex.disposables.Disposable;
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
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\u001a\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010'\u001a\u00020\u0017H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J\u0006\u0010)\u001a\u00020\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/GoodsCollectFragment;", "Lcom/ss/android/ugc/aweme/music/util/ProfileListFragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "()V", "mAdapter", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodListAdapter;", "mViewModel", "Lcom/ss/android/ugc/aweme/commerce/collection/GoodListViewModel;", "getMViewModel", "()Lcom/ss/android/ugc/aweme/commerce/collection/GoodListViewModel;", "mViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "setViewModelFactory", "(Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;)V", "createEmptyView", "Landroid/view/View;", "getScrollableView", "handlePageChanged", "", "initView", "initViewModel", "isEmpty", "", "needRefresh", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "scrollToFirstItem", "setLazyData", "tryRefreshList", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GoodsCollectFragment extends ProfileListFragment implements ae<com.ss.android.ugc.aweme.base.arch.c>, com.bytedance.jedi.arch.h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36858a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f36859b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(GoodsCollectFragment.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/commerce/collection/GoodListViewModel;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.arch.c f36860c = new com.ss.android.ugc.aweme.base.arch.c();

    /* renamed from: d  reason: collision with root package name */
    public CollectionGoodListAdapter f36861d;

    /* renamed from: e  reason: collision with root package name */
    private final lifecycleAwareLazy f36862e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f36863f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<GoodListState, Bundle, GoodListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.commerce.collection.GoodListState, com.bytedance.jedi.arch.x] */
        @NotNull
        public final GoodListState invoke(@NotNull GoodListState goodListState, @Nullable Bundle bundle) {
            GoodListState goodListState2 = goodListState;
            if (PatchProxy.isSupport(new Object[]{goodListState2, bundle}, this, changeQuickRedirect, false, 28134, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{goodListState2, bundle}, this, changeQuickRedirect, false, 28134, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(goodListState2, "$receiver");
            return goodListState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<GoodListViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final GoodListViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28135, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28135, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(GoodListViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<GoodListState, GoodListState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.commerce.collection.GoodListState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.commerce.collection.GoodListState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final GoodListState invoke(@NotNull GoodListState goodListState) {
                    if (PatchProxy.isSupport(new Object[]{goodListState}, this, changeQuickRedirect, false, 28136, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{goodListState}, this, changeQuickRedirect, false, 28136, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(goodListState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(goodListState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "loadMore"}, k = 3, mv = {1, 1, 15})
    static final class c implements LoadMoreRecyclerViewAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GoodsCollectFragment f36865b;

        c(GoodsCollectFragment goodsCollectFragment) {
            this.f36865b = goodsCollectFragment;
        }

        public final void loadMore() {
            if (PatchProxy.isSupport(new Object[0], this, f36864a, false, 28137, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36864a, false, 28137, new Class[0], Void.TYPE);
                return;
            }
            this.f36865b.a(this.f36865b.g(), new Function1<GoodListState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ c this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GoodListState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GoodListState goodListState) {
                    GoodListState goodListState2 = goodListState;
                    if (PatchProxy.isSupport(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28138, new Class[]{GoodListState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28138, new Class[]{GoodListState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(goodListState2, AdvanceSetting.NETWORK_TYPE);
                    this.this$0.f36865b.g().h.loadMore();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GoodsCollectFragment f36867b;

        d(GoodsCollectFragment goodsCollectFragment) {
            this.f36867b = goodsCollectFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36866a, false, 28139, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36866a, false, 28139, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            GoodsCollectFragment goodsCollectFragment = this.f36867b;
            if (PatchProxy.isSupport(new Object[0], goodsCollectFragment, GoodsCollectFragment.f36858a, false, 28104, new Class[0], Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[0], goodsCollectFragment, GoodsCollectFragment.f36858a, false, 28104, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                goodsCollectFragment.g().h.refresh();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.bytedance.jedi.arch.ext.list.c<CollectionGood, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f36868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f36869b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f36870c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f36871d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f36872e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends CollectionGood>, Unit> f36873f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f36871d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f36872e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends CollectionGood>, Unit> c() {
            return this.f36873f;
        }

        public e(Function1 function1, Function2 function2, Function2 function22) {
            this.f36868a = function1;
            this.f36869b = function2;
            this.f36870c = function22;
            this.f36871d = function1;
            this.f36872e = function2;
            this.f36873f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class f implements com.bytedance.jedi.arch.ext.list.c<CollectionGood, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f36874a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f36875b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f36876c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f36877d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f36878e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends CollectionGood>, Unit> f36879f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f36877d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f36878e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends CollectionGood>, Unit> c() {
            return this.f36879f;
        }

        public f(Function1 function1, Function2 function2, Function2 function22) {
            this.f36874a = function1;
            this.f36875b = function2;
            this.f36876c = function22;
            this.f36877d = function1;
            this.f36878e = function2;
            this.f36879f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(GoodsCollectFragment goodsCollectFragment) {
            super(1);
            this.this$0 = goodsCollectFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 28140, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 28140, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            GoodsCollectFragment.a(this.this$0).a((List<? extends T>) null);
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "error", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(GoodsCollectFragment goodsCollectFragment) {
            super(2);
            this.this$0 = goodsCollectFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 28141, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 28141, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, "error");
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).f();
            GoodsCollectFragment.a(this.this$0).showLoadMoreEmpty();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "data", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends CollectionGood>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(GoodsCollectFragment goodsCollectFragment) {
            super(2);
            this.this$0 = goodsCollectFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<CollectionGood> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 28142, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 28142, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "data");
            if (!CollectionUtils.isEmpty(list)) {
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
            }
            fVar.a(this.this$0.g(), new Function1<GoodListState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ i this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GoodListState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GoodListState goodListState) {
                    GoodListState goodListState2 = goodListState;
                    if (PatchProxy.isSupport(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28143, new Class[]{GoodListState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28143, new Class[]{GoodListState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(goodListState2, AdvanceSetting.NETWORK_TYPE);
                    if (CollectionUtils.isEmpty(goodListState.getListState().getList())) {
                        ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).e();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(GoodsCollectFragment goodsCollectFragment) {
            super(1);
            this.this$0 = goodsCollectFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 28144, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 28144, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a((int) C0906R.id.cvd);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
            if (!dmtStatusView.g()) {
                GoodsCollectFragment.a(this.this$0).showLoadMoreLoading();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(GoodsCollectFragment goodsCollectFragment) {
            super(2);
            this.this$0 = goodsCollectFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 28145, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 28145, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            GoodsCollectFragment.a(this.this$0).showPullUpLoadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends CollectionGood>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(GoodsCollectFragment goodsCollectFragment) {
            super(2);
            this.this$0 = goodsCollectFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<CollectionGood> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 28146, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 28146, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            fVar.a(this.this$0.g(), new Function1<GoodListState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ l this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GoodListState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GoodListState goodListState) {
                    if (PatchProxy.isSupport(new Object[]{goodListState}, this, changeQuickRedirect, false, 28147, new Class[]{GoodListState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{goodListState}, this, changeQuickRedirect, false, 28147, new Class[]{GoodListState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(goodListState, AdvanceSetting.NETWORK_TYPE);
                    if (CollectionUtils.isEmpty(goodListState.getListState().getList())) {
                        ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).e();
                    } else {
                        ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).b();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(GoodsCollectFragment goodsCollectFragment) {
            super(2);
            this.this$0 = goodsCollectFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 28148, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 28148, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                GoodsCollectFragment.a(this.this$0).resetLoadMoreState();
            } else {
                GoodsCollectFragment.a(this.this$0).showLoadMoreEmpty();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/commerce/collection/GoodListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function1<GoodListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodsCollectFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(GoodsCollectFragment goodsCollectFragment) {
            super(1);
            this.this$0 = goodsCollectFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GoodListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull GoodListState goodListState) {
            if (PatchProxy.isSupport(new Object[]{goodListState}, this, changeQuickRedirect, false, 28149, new Class[]{GoodListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{goodListState}, this, changeQuickRedirect, false, 28149, new Class[]{GoodListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(goodListState, AdvanceSetting.NETWORK_TYPE);
            if ((!goodListState.getListState().getList().isEmpty()) && this.this$0.isViewValid()) {
                ((RecyclerView) this.this$0.a((int) C0906R.id.u9)).smoothScrollToPosition(0);
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36858a, false, 28132, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36858a, false, 28132, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f36863f == null) {
            this.f36863f = new HashMap();
        }
        View view = (View) this.f36863f.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.f36863f.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final GoodListViewModel g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28098, new Class[0], GoodListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28098, new Class[0], GoodListViewModel.class);
        } else {
            value = this.f36862e.getValue();
        }
        return (GoodListViewModel) value;
    }

    public final boolean j() {
        return true;
    }

    public final void l() {
    }

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.f36860c;
    }

    public GoodsCollectFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoodListViewModel.class);
        this.f36862e = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
    }

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28106, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            g().e();
        }
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28107, new Class[0], Void.TYPE);
            return;
        }
        a(g(), new n(this));
    }

    @NotNull
    public final com.bytedance.jedi.arch.k a() {
        if (!PatchProxy.isSupport(new Object[0], this, f36858a, false, 28110, new Class[0], com.bytedance.jedi.arch.k.class)) {
            return h.a.a(this);
        }
        return (com.bytedance.jedi.arch.k) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28110, new Class[0], com.bytedance.jedi.arch.k.class);
    }

    @NotNull
    public final r<com.bytedance.jedi.arch.f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f36858a, false, 28113, new Class[0], r.class)) {
            return h.a.b(this);
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28113, new Class[0], r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f36858a, false, 28114, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28114, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, f36858a, false, 28111, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28111, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        com.bytedance.jedi.arch.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28112, new Class[0], com.bytedance.jedi.arch.f.class)) {
            fVar = (com.bytedance.jedi.arch.f) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28112, new Class[0], com.bytedance.jedi.arch.f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    @NotNull
    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28105, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28105, new Class[0], View.class);
        }
        RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.u9);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "collect_list");
        return recyclerView;
    }

    public final boolean k() {
        if (!PatchProxy.isSupport(new Object[0], this, f36858a, false, 28108, new Class[0], Boolean.TYPE)) {
            return g().f36853f;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28108, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28133, new Class[0], Void.TYPE);
            return;
        }
        if (this.f36863f != null) {
            this.f36863f.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f36858a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 28109(0x6dcd, float:3.9389E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f36858a
            r5 = 0
            r6 = 28109(0x6dcd, float:3.9389E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            super.onResume()
            com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel r1 = r9.g()
            boolean r2 = com.ss.android.ugc.aweme.commerce.service.l.j.f38035f
            if (r2 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.commerce.service.l.j.f38035f = r0
            boolean r2 = r1.g
            if (r2 == 0) goto L_0x0037
            r1.g = r0
            goto L_0x0039
        L_0x0037:
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x007a
            r1 = 2131165967(0x7f07030f, float:1.7946166E38)
            android.view.View r1 = r9.a((int) r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            r1.scrollToPosition(r0)
            com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel r1 = r9.g()
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel.f36851d
            r5 = 0
            r6 = 28082(0x6db2, float:3.9351E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x006e
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel.f36851d
            r5 = 0
            r6 = 28082(0x6db2, float:3.9351E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x006e:
            com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel$h r0 = com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel.h.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r1.c(r0)
            com.bytedance.jedi.arch.ext.list.ListMiddleware<com.ss.android.ugc.aweme.commerce.collection.GoodListState, com.ss.android.ugc.aweme.commerce.collection.CollectionGood, com.bytedance.jedi.arch.ext.list.k> r0 = r1.h
            r0.refresh()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.collection.GoodsCollectFragment.onResume():void");
    }

    public static final /* synthetic */ CollectionGoodListAdapter a(GoodsCollectFragment goodsCollectFragment) {
        CollectionGoodListAdapter collectionGoodListAdapter = goodsCollectFragment.f36861d;
        if (collectionGoodListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return collectionGoodListAdapter;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2;
        View view3 = view;
        if (PatchProxy.isSupport(new Object[]{view3, bundle}, this, f36858a, false, 28100, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, bundle}, this, f36858a, false, 28100, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view3, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28102, new Class[0], Void.TYPE);
        } else {
            RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.u9);
            recyclerView.setOverScrollMode(2);
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
            RecyclerView recyclerView2 = (RecyclerView) a((int) C0906R.id.u9);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "collect_list");
            int a2 = com.ss.android.ugc.aweme.framework.e.b.a(recyclerView2.getContext(), 6.0f);
            RecyclerView recyclerView3 = (RecyclerView) a((int) C0906R.id.u9);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "collect_list");
            ((RecyclerView) a((int) C0906R.id.u9)).setPadding(a2, 0, com.ss.android.ugc.aweme.framework.e.b.a(recyclerView3.getContext(), 6.0f), 0);
            this.f36861d = new CollectionGoodListAdapter(this);
            RecyclerView recyclerView4 = (RecyclerView) a((int) C0906R.id.u9);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "collect_list");
            CollectionGoodListAdapter collectionGoodListAdapter = this.f36861d;
            if (collectionGoodListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            recyclerView4.setAdapter(collectionGoodListAdapter);
            CollectionGoodListAdapter collectionGoodListAdapter2 = this.f36861d;
            if (collectionGoodListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            collectionGoodListAdapter2.setLoadMoreListener(new c(this));
            CollectionGoodListAdapter collectionGoodListAdapter3 = this.f36861d;
            if (collectionGoodListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            collectionGoodListAdapter3.setLoadEmptyTextResId(C0906R.string.a3f);
            com.bytedance.ies.dmt.ui.widget.c a3 = com.ss.android.ugc.aweme.views.e.a(getContext(), new d(this));
            DmtStatusView.a a4 = new DmtStatusView.a(getContext()).a();
            if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28103, new Class[0], View.class)) {
                view2 = (View) PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28103, new Class[0], View.class);
            } else {
                View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aqm, null);
                if (inflate != null) {
                    TextView textView = (TextView) inflate;
                    textView.setGravity(1);
                    textView.setText(C0906R.string.aaf);
                    view2 = textView;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            ((DmtStatusView) a((int) C0906R.id.cvd)).setBuilder(a4.b(view2).b(a3));
        }
        if (PatchProxy.isSupport(new Object[0], this, f36858a, false, 28101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36858a, false, 28101, new Class[0], Void.TYPE);
        } else {
            ListMiddleware<GoodListState, CollectionGood, com.bytedance.jedi.arch.ext.list.k> listMiddleware = g().h;
            com.bytedance.jedi.arch.e eVar = this;
            CollectionGoodListAdapter collectionGoodListAdapter4 = this.f36861d;
            if (collectionGoodListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            ListMiddleware.a(listMiddleware, eVar, collectionGoodListAdapter4, false, false, new e(new g(this), new h(this), new i(this)), new f(new j(this), new k(this), new l(this)), new m(this), null, 140);
        }
        if (this.j) {
            g().e();
        }
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, f36858a, false, 28115, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, f36858a, false, 28115, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f36858a, false, 28099, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f36858a, false, 28099, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.n8, viewGroup2, false);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f36858a, false, 28131, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, f36858a, false, 28131, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f36858a, false, 28126, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, f36858a, false, 28126, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, f36858a, false, 28125, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, f36858a, false, 28125, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
