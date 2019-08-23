package com.ss.android.ugc.aweme.following.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.MultiTypeAdapter;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.following.ui.SimpleUserFragment;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.di;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/FollowerRelationFragment;", "Lcom/ss/android/ugc/aweme/following/ui/BaseRelationFragment;", "()V", "mFollowerListAdapter", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter;", "mFollowerRelationViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;", "getMFollowerRelationViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;", "mFollowerRelationViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "doInit", "", "getEmptyDescText", "", "getEmptyPlaceHolderRes", "getEmptyText", "getLayoutId", "initView", "initViewModel", "onLoadMore", "onRefresh", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowerRelationFragment extends BaseRelationFragment {
    public static ChangeQuickRedirect h;
    static final /* synthetic */ KProperty[] i = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FollowerRelationFragment.class), "mFollowerRelationViewModel", "getMFollowerRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;"))};
    public FollowListAdapter j;
    private final lifecycleAwareLazy k;
    private HashMap l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<FollowerRelationViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = fragment;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
        @NotNull
        public final FollowerRelationViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44950, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44950, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            n a2 = r0.f2282c.a(FollowerRelationViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<FollowerRelationState, FollowerRelationState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final FollowerRelationState invoke(@NotNull FollowerRelationState followerRelationState) {
                    if (PatchProxy.isSupport(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 44951, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 44951, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(followerRelationState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(followerRelationState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "loadMore"}, k = 3, mv = {1, 1, 15})
    static final class b implements LoadMoreRecyclerViewAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowerRelationFragment f48001b;

        b(FollowerRelationFragment followerRelationFragment) {
            this.f48001b = followerRelationFragment;
        }

        public final void loadMore() {
            if (PatchProxy.isSupport(new Object[0], this, f48000a, false, 44952, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48000a, false, 44952, new Class[0], Void.TYPE);
                return;
            }
            this.f48001b.a(this.f48001b.o(), new Function1<FollowerRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FollowerRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    if (PatchProxy.isSupport(new Object[]{followerRelationState2}, this, changeQuickRedirect, false, 44953, new Class[]{FollowerRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{followerRelationState2}, this, changeQuickRedirect, false, 44953, new Class[]{FollowerRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(followerRelationState2, AdvanceSetting.NETWORK_TYPE);
                    if (((com.ss.android.ugc.aweme.following.repository.i) followerRelationState.getListState().getPayload()).f47944c != 0) {
                        FollowerRelationFragment followerRelationFragment = this.this$0.f48001b;
                        if (PatchProxy.isSupport(new Object[0], followerRelationFragment, FollowerRelationFragment.h, false, 44944, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], followerRelationFragment, FollowerRelationFragment.h, false, 44944, new Class[0], Void.TYPE);
                            return;
                        }
                        followerRelationFragment.o().g.loadMore();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.bytedance.jedi.arch.ext.list.c<User, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f48002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f48003b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f48004c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f48005d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f48006e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> f48007f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f48005d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f48006e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> c() {
            return this.f48007f;
        }

        public c(Function1 function1, Function2 function2, Function2 function22) {
            this.f48002a = function1;
            this.f48003b = function2;
            this.f48004c = function22;
            this.f48005d = function1;
            this.f48006e = function2;
            this.f48007f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.jedi.arch.ext.list.c<User, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f48008a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f48009b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f48010c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f48011d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f48012e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> f48013f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f48011d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f48012e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> c() {
            return this.f48013f;
        }

        public d(Function1 function1, Function2 function2, Function2 function22) {
            this.f48008a = function1;
            this.f48009b = function2;
            this.f48010c = function22;
            this.f48011d = function1;
            this.f48012e = function2;
            this.f48013f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FollowerRelationFragment followerRelationFragment) {
            super(1);
            this.this$0 = followerRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 44954, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 44954, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "error", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FollowerRelationFragment followerRelationFragment) {
            super(2);
            this.this$0 = followerRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 44955, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 44955, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, "error");
            FollowerRelationFragment followerRelationFragment = this.this$0;
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a((int) C0906R.id.cvd);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
            followerRelationFragment.a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).f();
            FollowerRelationFragment.a(this.this$0).showLoadMoreEmpty();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "data", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(FollowerRelationFragment followerRelationFragment) {
            super(2);
            this.this$0 = followerRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends User> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 44956, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 44956, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "data");
            if (!CollectionUtils.isEmpty(list)) {
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
            }
            fVar.a(this.this$0.o(), new Function1<FollowerRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ g this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FollowerRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FollowerRelationState followerRelationState) {
                    if (PatchProxy.isSupport(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 44957, new Class[]{FollowerRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 44957, new Class[]{FollowerRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(followerRelationState, AdvanceSetting.NETWORK_TYPE);
                    if (!this.this$0.this$0.o().a(((com.ss.android.ugc.aweme.following.repository.i) followerRelationState.getListState().getPayload()).f21387a.f21351a, ((com.ss.android.ugc.aweme.following.repository.i) followerRelationState.getListState().getPayload()).f47946e, ((com.ss.android.ugc.aweme.following.repository.i) followerRelationState.getListState().getPayload()).f47947f) && CollectionUtils.isEmpty(followerRelationState.getListState().getList())) {
                        ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).e();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FollowerRelationFragment followerRelationFragment) {
            super(1);
            this.this$0 = followerRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 44958, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 44958, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a((int) C0906R.id.cvd);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
            if (!dmtStatusView.g()) {
                FollowerRelationFragment.a(this.this$0).showLoadMoreLoading();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(FollowerRelationFragment followerRelationFragment) {
            super(2);
            this.this$0 = followerRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 44959, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 44959, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            FollowerRelationFragment.a(this.this$0).showPullUpLoadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FollowerRelationFragment followerRelationFragment) {
            super(2);
            this.this$0 = followerRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends User> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 44960, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 44960, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            fVar.a(this.this$0.o(), new Function1<FollowerRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ j this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FollowerRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FollowerRelationState followerRelationState) {
                    if (PatchProxy.isSupport(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 44961, new Class[]{FollowerRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 44961, new Class[]{FollowerRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(followerRelationState, AdvanceSetting.NETWORK_TYPE);
                    if (!this.this$0.this$0.o().a(((com.ss.android.ugc.aweme.following.repository.i) followerRelationState.getListState().getPayload()).f21387a.f21351a, ((com.ss.android.ugc.aweme.following.repository.i) followerRelationState.getListState().getPayload()).f47946e, ((com.ss.android.ugc.aweme.following.repository.i) followerRelationState.getListState().getPayload()).f47947f)) {
                        if (CollectionUtils.isEmpty(followerRelationState.getListState().getList())) {
                            ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).e();
                            return;
                        }
                        ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).b();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(FollowerRelationFragment followerRelationFragment) {
            super(2);
            this.this$0 = followerRelationFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 44962, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 44962, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                FollowerRelationFragment.a(this.this$0).resetLoadMoreState();
            } else {
                FollowerRelationFragment.a(this.this$0).showLoadMoreEmpty();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationState;", "it", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<FollowerRelationState, Bundle, FollowerRelationState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(FollowerRelationFragment followerRelationFragment) {
            super(2);
            this.this$0 = followerRelationFragment;
        }

        @NotNull
        public final FollowerRelationState invoke(@NotNull FollowerRelationState followerRelationState, @Nullable Bundle bundle) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            if (PatchProxy.isSupport(new Object[]{followerRelationState2, bundle}, this, changeQuickRedirect, false, 44963, new Class[]{FollowerRelationState.class, Bundle.class}, FollowerRelationState.class)) {
                return (FollowerRelationState) PatchProxy.accessDispatch(new Object[]{followerRelationState2, bundle}, this, changeQuickRedirect, false, 44963, new Class[]{FollowerRelationState.class, Bundle.class}, FollowerRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(followerRelationState2, "$receiver");
            String str = this.this$0.f47949d;
            if (str == null) {
                str = "";
            }
            return FollowerRelationState.copy$default(followerRelationState2, str, null, 2, null);
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 44948, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 44948, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.l == null) {
            this.l = new HashMap();
        }
        View view = (View) this.l.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.l.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44949, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.clear();
        }
    }

    public final int i() {
        return C0906R.layout.nx;
    }

    public final FollowerRelationViewModel o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44938, new Class[0], FollowerRelationViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, h, false, 44938, new Class[0], FollowerRelationViewModel.class);
        } else {
            value = this.k.getValue();
        }
        return (FollowerRelationViewModel) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public FollowerRelationFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FollowerRelationViewModel.class);
        this.k = new lifecycleAwareLazy(this, new a(this, orCreateKotlinClass, new l(this), orCreateKotlinClass));
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44943, new Class[0], Void.TYPE);
            return;
        }
        o().g.refresh();
    }

    public final int l() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44945, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 44945, new Class[0], Integer.TYPE)).intValue();
        }
        j();
        return 2130839716;
    }

    public final int m() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44946, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 44946, new Class[0], Integer.TYPE)).intValue();
        } else if (j()) {
            if (com.ss.android.g.a.a()) {
                return C0906R.string.agy;
            }
            return C0906R.string.dmo;
        } else if (com.ss.android.g.a.a()) {
            return C0906R.string.agz;
        } else {
            return C0906R.string.dn4;
        }
    }

    public final int n() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44947, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 44947, new Class[0], Integer.TYPE)).intValue();
        } else if (j()) {
            if (com.ss.android.g.a.a()) {
                return C0906R.string.agx;
            }
            return C0906R.string.dmn;
        } else if (com.ss.android.g.a.a()) {
            return C0906R.string.agx;
        } else {
            return C0906R.string.dn3;
        }
    }

    public static final /* synthetic */ FollowListAdapter a(FollowerRelationFragment followerRelationFragment) {
        FollowListAdapter followListAdapter = followerRelationFragment.j;
        if (followListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowerListAdapter");
        }
        return followListAdapter;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, h, false, 44939, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, h, false, 44939, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44940, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44941, new Class[0], Void.TYPE);
        } else {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a((int) C0906R.id.ctw);
            Intrinsics.checkExpressionValueIsNotNull(swipeRefreshLayout, "srl_refresh");
            swipeRefreshLayout.setEnabled(false);
            DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvd);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
            a(dmtStatusView);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
            wrapLinearLayoutManager.setOrientation(1);
            RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.cip);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_list");
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            di.b((RecyclerView) a((int) C0906R.id.cip));
        }
        this.j = new FollowListAdapter(this, "follower_relation", j());
        if (com.ss.android.g.a.a()) {
            FollowListAdapter followListAdapter = this.j;
            if (followListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowerListAdapter");
            }
            followListAdapter.mTextColor = getResources().getColor(C0906R.color.yx);
        }
        RecyclerView recyclerView2 = (RecyclerView) a((int) C0906R.id.cip);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv_list");
        FollowListAdapter followListAdapter2 = this.j;
        if (followListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowerListAdapter");
        }
        recyclerView2.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.j;
        if (followListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowerListAdapter");
        }
        followListAdapter3.setLoadMoreListener(new b(this));
        FollowerCardViewHolder a2 = c.a(getContext(), (RecyclerView) a((int) C0906R.id.cip), new b(this.f47949d, j(), SimpleUserFragment.b.follower));
        Intrinsics.checkExpressionValueIsNotNull(a2, "FollowingHeaderViewFacto…      rv_list, pageParam)");
        if (a2.c()) {
            FollowListAdapter followListAdapter4 = this.j;
            if (followListAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowerListAdapter");
            }
            View b2 = a2.b();
            if (PatchProxy.isSupport(new Object[]{b2}, followListAdapter4, MultiTypeAdapter.f34643c, false, 24526, new Class[]{View.class}, Void.TYPE)) {
                FollowListAdapter followListAdapter5 = followListAdapter4;
                PatchProxy.accessDispatch(new Object[]{b2}, followListAdapter5, MultiTypeAdapter.f34643c, false, 24526, new Class[]{View.class}, Void.TYPE);
            } else if (b2 != null) {
                followListAdapter4.f34645d = b2;
                followListAdapter4.notifyItemInserted(0);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44942, new Class[0], Void.TYPE);
            return;
        }
        ListMiddleware<FollowerRelationState, User, com.ss.android.ugc.aweme.following.repository.i> listMiddleware = o().g;
        com.bytedance.jedi.arch.e eVar = this;
        FollowListAdapter followListAdapter6 = this.j;
        if (followListAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowerListAdapter");
        }
        ListMiddleware.a(listMiddleware, eVar, followListAdapter6, false, false, new c(new e(this), new f(this), new g(this)), new d(new h(this), new i(this), new j(this)), new k(this), null, 140);
    }
}
