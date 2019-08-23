package com.ss.android.ugc.aweme.following.ui;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.friends.ui.CustomItemAnimator;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/ConnectedRelationFragment;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseFragment;", "()V", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "mBuilder", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView$Builder;", "mConnectedRelationAdapter", "Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter;", "getMConnectedRelationAdapter", "()Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter;", "mConnectedRelationAdapter$delegate", "Lkotlin/Lazy;", "mConnectedRelationViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;", "getMConnectedRelationViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;", "mConnectedRelationViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "mFollowRelationModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "getMFollowRelationModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "mFollowRelationModel$delegate", "mRootView", "Landroid/view/View;", "initView", "", "initViewModel", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationFragment extends JediBaseFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f47954c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f47955d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ConnectedRelationFragment.class), "mConnectedRelationViewModel", "getMConnectedRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ConnectedRelationFragment.class), "mFollowRelationModel", "getMFollowRelationModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ConnectedRelationFragment.class), "mConnectedRelationAdapter", "getMConnectedRelationAdapter()Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter;"))};

    /* renamed from: e  reason: collision with root package name */
    final Lazy f47956e;

    /* renamed from: f  reason: collision with root package name */
    private FragmentActivity f47957f;
    private View g;
    private DmtStatusView.a h;
    private final lifecycleAwareLazy i;
    private final Lazy j = LazyKt.lazy(new m(this));
    private HashMap k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<FollowRelationTabViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_activityViewModel = fragment;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final FollowRelationTabViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44861, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44861, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_activityViewModel.requireActivity(), com.bytedance.jedi.arch.b.a());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            return (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<ConnectedRelationListViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final ConnectedRelationListViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44862, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44862, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(ConnectedRelationListViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<ConnectedRelationState, ConnectedRelationState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final ConnectedRelationState invoke(@NotNull ConnectedRelationState connectedRelationState) {
                    if (PatchProxy.isSupport(new Object[]{connectedRelationState}, this, changeQuickRedirect, false, 44863, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{connectedRelationState}, this, changeQuickRedirect, false, 44863, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(connectedRelationState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(connectedRelationState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47958a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConnectedRelationFragment f47959b;

        c(ConnectedRelationFragment connectedRelationFragment) {
            this.f47959b = connectedRelationFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f47958a, false, 44864, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f47958a, false, 44864, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ((DmtStatusView) this.f47959b.a(C0906R.id.cvd)).d();
            this.f47959b.h().e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f47960a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f47961b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f47962c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f47963d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f47964e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> f47965f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f47963d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f47964e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> c() {
            return this.f47965f;
        }

        public d(Function1 function1, Function2 function2, Function2 function22) {
            this.f47960a = function1;
            this.f47961b = function2;
            this.f47962c = function22;
            this.f47963d = function1;
            this.f47964e = function2;
            this.f47965f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "RECEIVER", "it", "", "invoke", "(Ljava/lang/Object;Ljava/util/List;)V", "com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$3"}, k = 3, mv = {1, 1, 15})
    public static final class e extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        public e() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(com.bytedance.jedi.arch.f fVar, @NotNull List<? extends Object> list) {
            List<? extends Object> list2 = list;
            if (PatchProxy.isSupport(new Object[]{fVar, list2}, this, changeQuickRedirect, false, 44865, new Class[]{Object.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list2}, this, changeQuickRedirect, false, 44865, new Class[]{Object.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class f implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f47966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f47967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f47968c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f47969d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f47970e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> f47971f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f47969d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f47970e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> c() {
            return this.f47971f;
        }

        public f(Function1 function1, Function2 function2, Function2 function22) {
            this.f47966a = function1;
            this.f47967b = function2;
            this.f47968c = function22;
            this.f47969d = function1;
            this.f47970e = function2;
            this.f47971f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ConnectedRelationFragment connectedRelationFragment) {
            super(2);
            this.this$0 = connectedRelationFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 44866, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 44866, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                this.this$0.i().resetLoadMoreState();
            } else {
                this.this$0.i().showLoadMoreEmpty();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ConnectedRelationFragment connectedRelationFragment) {
            super(1);
            this.this$0 = connectedRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 44867, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 44867, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            ((DmtStatusView) this.this$0.a(C0906R.id.cvd)).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "data", "", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ConnectedRelationFragment connectedRelationFragment) {
            super(2);
            this.this$0 = connectedRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends Object> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 44868, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 44868, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "data");
            if (list.isEmpty()) {
                ((DmtStatusView) this.this$0.a(C0906R.id.cvd)).e();
            } else {
                ((DmtStatusView) this.this$0.a(C0906R.id.cvd)).b();
            }
            fVar.a(this.this$0.h(), new Function1<ConnectedRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ i this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ConnectedRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ConnectedRelationState connectedRelationState) {
                    Object value;
                    ConnectedRelationState connectedRelationState2 = connectedRelationState;
                    if (PatchProxy.isSupport(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 44869, new Class[]{ConnectedRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 44869, new Class[]{ConnectedRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(connectedRelationState2, AdvanceSetting.NETWORK_TYPE);
                    ConnectedRelationFragment connectedRelationFragment = this.this$0.this$0;
                    if (PatchProxy.isSupport(new Object[0], connectedRelationFragment, ConnectedRelationFragment.f47954c, false, 44852, new Class[0], FollowRelationTabViewModel.class)) {
                        value = PatchProxy.accessDispatch(new Object[0], connectedRelationFragment, ConnectedRelationFragment.f47954c, false, 44852, new Class[0], FollowRelationTabViewModel.class);
                    } else {
                        value = connectedRelationFragment.f47956e.getValue();
                    }
                    FollowRelationTabViewModel followRelationTabViewModel = (FollowRelationTabViewModel) value;
                    int i = ((com.ss.android.ugc.aweme.following.ui.viewmodel.b) connectedRelationState.getListState().getPayload()).f48211d;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, followRelationTabViewModel, FollowRelationTabViewModel.f48190d, false, 45222, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        FollowRelationTabViewModel followRelationTabViewModel2 = followRelationTabViewModel;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, followRelationTabViewModel2, FollowRelationTabViewModel.f48190d, false, 45222, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    followRelationTabViewModel.c(new FollowRelationTabViewModel.a(i));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ConnectedRelationFragment connectedRelationFragment) {
            super(2);
            this.this$0 = connectedRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 44870, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 44870, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            ((DmtStatusView) this.this$0.a(C0906R.id.cvd)).f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ConnectedRelationFragment connectedRelationFragment) {
            super(1);
            this.this$0 = connectedRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 44871, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 44871, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            this.this$0.i().showLoadMoreLoading();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ConnectedRelationFragment connectedRelationFragment) {
            super(2);
            this.this$0 = connectedRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 44872, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 44872, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.i().showPullUpLoadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<ConnectedRelationAdapter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationFragment this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "loadMore", "com/ss/android/ugc/aweme/following/ui/ConnectedRelationFragment$mConnectedRelationAdapter$2$1$1"}, k = 3, mv = {1, 1, 15})
        static final class a implements LoadMoreRecyclerViewAdapter.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47972a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m f47973b;

            a(m mVar) {
                this.f47973b = mVar;
            }

            public final void loadMore() {
                if (PatchProxy.isSupport(new Object[0], this, f47972a, false, 44874, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47972a, false, 44874, new Class[0], Void.TYPE);
                    return;
                }
                ConnectedRelationListViewModel h = this.f47973b.this$0.h();
                if (PatchProxy.isSupport(new Object[0], h, ConnectedRelationListViewModel.f48169d, false, 45193, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], h, ConnectedRelationListViewModel.f48169d, false, 45193, new Class[0], Void.TYPE);
                    return;
                }
                h.g.loadMore();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ConnectedRelationFragment connectedRelationFragment) {
            super(0);
            this.this$0 = connectedRelationFragment;
        }

        @NotNull
        public final ConnectedRelationAdapter invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 44873, new Class[0], ConnectedRelationAdapter.class)) {
                return (ConnectedRelationAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 44873, new Class[0], ConnectedRelationAdapter.class);
            }
            ConnectedRelationAdapter connectedRelationAdapter = new ConnectedRelationAdapter(this.this$0, null, 2);
            connectedRelationAdapter.setLoadMoreListener(new a(this));
            connectedRelationAdapter.setLoadEmptyTextResId(C0906R.string.a3f);
            return connectedRelationAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationState;", "it", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function2<ConnectedRelationState, Bundle, ConnectedRelationState> {
        public static final n INSTANCE = new n();
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0057, code lost:
            if (r1 == null) goto L_0x0059;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState invoke(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r20, @org.jetbrains.annotations.Nullable android.os.Bundle r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r4 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                r8[r10] = r4
                java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                r8[r11] = r4
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r9 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                r6 = 0
                r7 = 44875(0xaf4b, float:6.2883E-41)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x004a
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
                r15 = 0
                r16 = 44875(0xaf4b, float:6.2883E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r1 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                r0[r10] = r1
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                r0[r11] = r1
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r18 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r0 = (com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState) r0
                return r0
            L_0x004a:
                java.lang.String r2 = "$receiver"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                if (r1 == 0) goto L_0x0059
                java.lang.String r2 = "uid"
                java.lang.String r1 = r1.getString(r2)
                if (r1 != 0) goto L_0x005b
            L_0x0059:
                java.lang.String r1 = ""
            L_0x005b:
                r2 = 0
                r3 = 0
                r4 = 6
                r5 = 0
                r0 = r20
                com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r0 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.copy$default(r0, r1, r2, r3, r4, r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment.n.invoke(com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState, android.os.Bundle):com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState");
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47954c, false, 44859, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47954c, false, 44859, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.k == null) {
            this.k = new HashMap();
        }
        View view = (View) this.k.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.k.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f47954c, false, 44860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47954c, false, 44860, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.clear();
        }
    }

    public final ConnectedRelationListViewModel h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f47954c, false, 44851, new Class[0], ConnectedRelationListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f47954c, false, 44851, new Class[0], ConnectedRelationListViewModel.class);
        } else {
            value = this.i.getValue();
        }
        return (ConnectedRelationListViewModel) value;
    }

    public final ConnectedRelationAdapter i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f47954c, false, 44853, new Class[0], ConnectedRelationAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f47954c, false, 44853, new Class[0], ConnectedRelationAdapter.class);
        } else {
            value = this.j.getValue();
        }
        return (ConnectedRelationAdapter) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public ConnectedRelationFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConnectedRelationListViewModel.class);
        this.i = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, n.INSTANCE, orCreateKotlinClass));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(FollowRelationTabViewModel.class);
        this.f47956e = LazyKt.lazy(new a(this, orCreateKotlinClass2, orCreateKotlinClass2));
    }

    public final void onAttach(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f47954c, false, 44856, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f47954c, false, 44856, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        if (context != null) {
            this.f47957f = (FragmentActivity) context;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f47954c, false, 44855, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f47954c, false, 44855, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f47954c, false, 44857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47954c, false, 44857, new Class[0], Void.TYPE);
        } else {
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext()).a();
            FragmentActivity fragmentActivity = this.f47957f;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            this.h = a2.a(new c.a(fragmentActivity).a(2130839574).b((int) C0906R.string.a1i).c(C0906R.string.a1h).f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new c(this));
            ((DmtStatusView) a(C0906R.id.cvd)).setBuilder(this.h);
            RecyclerView recyclerView = (RecyclerView) a(C0906R.id.ccc);
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setItemAnimator(new CustomItemAnimator());
            recyclerView.setAdapter(i());
            recyclerView.bringToFront();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) a(C0906R.id.ccw);
            Intrinsics.checkExpressionValueIsNotNull(swipeRefreshLayout, "refresh_layout");
            swipeRefreshLayout.setEnabled(false);
        }
        if (PatchProxy.isSupport(new Object[0], this, f47954c, false, 44858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47954c, false, 44858, new Class[0], Void.TYPE);
            return;
        }
        ConnectedRelationListViewModel h2 = h();
        com.bytedance.jedi.arch.e eVar = this;
        com.bytedance.jedi.arch.ext.list.a i2 = i();
        Function2 gVar = new g(this);
        com.bytedance.jedi.arch.ext.list.c dVar = new d(new h(this), new j(this), new i(this));
        com.bytedance.jedi.arch.ext.list.c fVar = new f(new k(this), new l(this), e.INSTANCE);
        if (PatchProxy.isSupport(new Object[]{eVar, i2, dVar, fVar, gVar}, h2, ConnectedRelationListViewModel.f48169d, false, 45195, new Class[]{com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE)) {
            Object[] objArr = {eVar, i2, dVar, fVar, gVar};
            ChangeQuickRedirect changeQuickRedirect = ConnectedRelationListViewModel.f48169d;
            PatchProxy.accessDispatch(objArr, h2, changeQuickRedirect, false, 45195, new Class[]{com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(eVar, "subscriber");
            Intrinsics.checkParameterIsNotNull(i2, "adapter");
            ListMiddleware.a(h2.g, eVar, i2, false, eVar.c(), dVar, fVar, gVar, null, SearchJediMixFeedAdapter.f42517f);
        }
        h().e();
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47954c, false, 44854, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f47954c, false, 44854, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.n9, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…n_list, container, false)");
        this.g = inflate;
        View view = this.g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }
}
