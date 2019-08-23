package com.ss.android.ugc.aweme.following.ui;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowingSearchAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\u001a\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u001cH\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0012H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/FollowingRelationFragment;", "Lcom/ss/android/ugc/aweme/following/ui/BaseRelationFragment;", "()V", "mFollowRelationTabViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "getMFollowRelationTabViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "mFollowRelationTabViewModel$delegate", "Lkotlin/Lazy;", "mFollowingListAdapter", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowListAdapter;", "mFollowingRelationViewModel", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;", "getMFollowingRelationViewModel", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;", "mFollowingRelationViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "mNeedReportSearch", "", "mSearchIMUserAdapter", "Lcom/ss/android/ugc/aweme/following/ui/adapter/FollowingSearchAdapter;", "mSearchIMUserManager", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/SearchIMUserManager;", "mSearchKeyWord", "", "mSearchUserBuilder", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView$Builder;", "doInit", "", "getEmptyDescText", "", "getEmptyPlaceHolderRes", "getEmptyText", "getLayoutId", "initSearchList", "initView", "initViewModel", "onLoadMore", "onRefresh", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "resetSearchList", "searchKeyWord", "setUserVisibleHint", "isVisibleToUser", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowingRelationFragment extends BaseRelationFragment {
    public static ChangeQuickRedirect h;
    static final /* synthetic */ KProperty[] i = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FollowingRelationFragment.class), "mFollowingRelationViewModel", "getMFollowingRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FollowingRelationFragment.class), "mFollowRelationTabViewModel", "getMFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;"))};
    public FollowListAdapter j;
    public final com.ss.android.ugc.aweme.following.ui.viewmodel.g k = new com.ss.android.ugc.aweme.following.ui.viewmodel.g();
    public final FollowingSearchAdapter l = new FollowingSearchAdapter();
    public String m = "";
    public DmtStatusView.a n;
    public boolean o = true;
    private final lifecycleAwareLazy p;
    private final Lazy q;
    private HashMap r;

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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45004, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45004, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_activityViewModel.requireActivity(), com.bytedance.jedi.arch.b.a());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            return (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<FollowingRelationViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final FollowingRelationViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45005, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45005, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(FollowingRelationViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<FollowingRelationState, FollowingRelationState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState] */
                @NotNull
                public final FollowingRelationState invoke(@NotNull FollowingRelationState followingRelationState) {
                    if (PatchProxy.isSupport(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45006, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45006, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(followingRelationState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(followingRelationState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "loadMore"}, k = 3, mv = {1, 1, 15})
    static final class c implements LoadMoreRecyclerViewAdapter.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowingRelationFragment f48033b;

        c(FollowingRelationFragment followingRelationFragment) {
            this.f48033b = followingRelationFragment;
        }

        public final void loadMore() {
            if (PatchProxy.isSupport(new Object[0], this, f48032a, false, 45007, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48032a, false, 45007, new Class[0], Void.TYPE);
                return;
            }
            this.f48033b.a(this.f48033b.o(), new Function1<FollowingRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ c this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FollowingRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FollowingRelationState followingRelationState) {
                    FollowingRelationState followingRelationState2 = followingRelationState;
                    if (PatchProxy.isSupport(new Object[]{followingRelationState2}, this, changeQuickRedirect, false, 45008, new Class[]{FollowingRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{followingRelationState2}, this, changeQuickRedirect, false, 45008, new Class[]{FollowingRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(followingRelationState2, AdvanceSetting.NETWORK_TYPE);
                    if (((com.ss.android.ugc.aweme.following.repository.i) followingRelationState.getListState().getPayload()).f47944c != 0) {
                        FollowingRelationFragment followingRelationFragment = this.this$0.f48033b;
                        if (PatchProxy.isSupport(new Object[0], followingRelationFragment, FollowingRelationFragment.h, false, 44995, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], followingRelationFragment, FollowingRelationFragment.h, false, 44995, new Class[0], Void.TYPE);
                            return;
                        }
                        followingRelationFragment.o().g.loadMore();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowingRelationFragment f48035b;

        d(FollowingRelationFragment followingRelationFragment) {
            this.f48035b = followingRelationFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48034a, false, 45009, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48034a, false, 45009, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            DmtEditText dmtEditText = (DmtEditText) this.f48035b.a((int) C0906R.id.aai);
            if (dmtEditText != null) {
                dmtEditText.setText("");
                this.f48035b.r();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowingRelationFragment f48037b;

        e(FollowingRelationFragment followingRelationFragment) {
            this.f48037b = followingRelationFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48036a, false, 45010, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48036a, false, 45010, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f48037b.a(this.f48037b.p(), new Function1<FollowRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ e this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FollowRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FollowRelationState followRelationState) {
                    FollowRelationState followRelationState2 = followRelationState;
                    if (PatchProxy.isSupport(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45011, new Class[]{FollowRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45011, new Class[]{FollowRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(followRelationState2, AdvanceSetting.NETWORK_TYPE);
                    if (followRelationState.isSearching()) {
                        this.this$0.f48037b.p().a(false);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowingRelationFragment f48039b;

        f(FollowingRelationFragment followingRelationFragment) {
            this.f48039b = followingRelationFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f48038a, false, 45012, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f48038a, false, 45012, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 1) {
                this.f48039b.a(this.f48039b.p(), new Function1<FollowRelationState, Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ f this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((FollowRelationState) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull FollowRelationState followRelationState) {
                        FollowRelationState followRelationState2 = followRelationState;
                        if (PatchProxy.isSupport(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45013, new Class[]{FollowRelationState.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45013, new Class[]{FollowRelationState.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull(followRelationState2, AdvanceSetting.NETWORK_TYPE);
                        if (!followRelationState.isSearching()) {
                            this.this$0.f48039b.p().a(true);
                        }
                    }
                });
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/following/ui/FollowingRelationFragment$initSearchList$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowingRelationFragment f48041b;

        public final void afterTextChanged(@NotNull Editable editable) {
            Editable editable2 = editable;
            if (PatchProxy.isSupport(new Object[]{editable2}, this, f48040a, false, 45016, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable2}, this, f48040a, false, 45016, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(editable2, NotifyType.SOUND);
        }

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48040a, false, 45014, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48040a, false, 45014, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
        }

        g(FollowingRelationFragment followingRelationFragment) {
            this.f48041b = followingRelationFragment;
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48040a, false, 45015, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f48040a, false, 45015, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence, NotifyType.SOUND);
            if (!TextUtils.isEmpty(charSequence)) {
                ImageButton imageButton = (ImageButton) this.f48041b.a((int) C0906R.id.ns);
                Intrinsics.checkExpressionValueIsNotNull(imageButton, "btn_clear");
                imageButton.setVisibility(0);
                this.f48041b.m = charSequence.toString();
                if (this.f48041b.o) {
                    com.ss.android.ugc.aweme.common.r.a("search_friends", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                    this.f48041b.o = false;
                }
                this.f48041b.q();
                return;
            }
            this.f48041b.r();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 1, 15})
    static final class h implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowingRelationFragment f48043b;

        h(FollowingRelationFragment followingRelationFragment) {
            this.f48043b = followingRelationFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f48042a, false, 45017, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f48042a, false, 45017, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (i == 3) {
                this.f48043b.q();
                return true;
            } else {
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class i implements com.bytedance.jedi.arch.ext.list.c<User, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f48044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f48045b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f48046c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f48047d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f48048e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> f48049f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f48047d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f48048e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> c() {
            return this.f48049f;
        }

        public i(Function1 function1, Function2 function2, Function2 function22) {
            this.f48044a = function1;
            this.f48045b = function2;
            this.f48046c = function22;
            this.f48047d = function1;
            this.f48048e = function2;
            this.f48049f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class j implements com.bytedance.jedi.arch.ext.list.c<User, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f48050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f48051b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f48052c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f48053d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f48054e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> f48055f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f48053d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f48054e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> c() {
            return this.f48055f;
        }

        public j(Function1 function1, Function2 function2, Function2 function22) {
            this.f48050a = function1;
            this.f48051b = function2;
            this.f48052c = function22;
            this.f48053d = function1;
            this.f48054e = function2;
            this.f48055f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(FollowingRelationFragment followingRelationFragment) {
            super(2);
            this.this$0 = followingRelationFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 45020, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 45020, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                DmtEditText dmtEditText = (DmtEditText) this.this$0.a((int) C0906R.id.aai);
                Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "et_search_kw");
                dmtEditText.setCursorVisible(true);
                DmtTextView dmtTextView = (DmtTextView) this.this$0.a((int) C0906R.id.d9w);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_cancel_btn");
                dmtTextView.setVisibility(0);
                RecyclerView recyclerView = (RecyclerView) this.this$0.a((int) C0906R.id.cip);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_list");
                recyclerView.setAdapter(this.this$0.l);
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).setBuilder(this.this$0.n);
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
                this.this$0.k.a();
                return;
            }
            DmtEditText dmtEditText2 = (DmtEditText) this.this$0.a((int) C0906R.id.aai);
            Intrinsics.checkExpressionValueIsNotNull(dmtEditText2, "et_search_kw");
            dmtEditText2.setCursorVisible(false);
            ((DmtEditText) this.this$0.a((int) C0906R.id.aai)).clearFocus();
            DmtEditText dmtEditText3 = (DmtEditText) this.this$0.a((int) C0906R.id.aai);
            if (dmtEditText3 != null) {
                dmtEditText3.setText("");
                DmtTextView dmtTextView2 = (DmtTextView) this.this$0.a((int) C0906R.id.d9w);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "tv_cancel_btn");
                dmtTextView2.setVisibility(8);
                com.ss.android.ugc.aweme.common.ui.b.a((Activity) this.this$0.getActivity(), (View) (DmtEditText) this.this$0.a((int) C0906R.id.aai));
                RecyclerView recyclerView2 = (RecyclerView) this.this$0.a((int) C0906R.id.cip);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv_list");
                recyclerView2.setAdapter(FollowingRelationFragment.a(this.this$0));
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).setBuilder(this.this$0.h());
                this.this$0.r();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(FollowingRelationFragment followingRelationFragment) {
            super(1);
            this.this$0 = followingRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 45021, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 45021, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "error", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(FollowingRelationFragment followingRelationFragment) {
            super(2);
            this.this$0 = followingRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 45022, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 45022, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, "error");
            FollowingRelationFragment followingRelationFragment = this.this$0;
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a((int) C0906R.id.cvd);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
            followingRelationFragment.a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).f();
            FollowingRelationFragment.a(this.this$0).showLoadMoreEmpty();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "data", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(FollowingRelationFragment followingRelationFragment) {
            super(2);
            this.this$0 = followingRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends User> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 45023, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 45023, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "data");
            if (!CollectionUtils.isEmpty(list)) {
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
            }
            fVar.a(this.this$0.o(), new Function1<FollowingRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ n this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FollowingRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FollowingRelationState followingRelationState) {
                    if (PatchProxy.isSupport(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45024, new Class[]{FollowingRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45024, new Class[]{FollowingRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(followingRelationState, AdvanceSetting.NETWORK_TYPE);
                    if (!this.this$0.this$0.o().a(((com.ss.android.ugc.aweme.following.repository.i) followingRelationState.getListState().getPayload()).f21387a.f21351a, ((com.ss.android.ugc.aweme.following.repository.i) followingRelationState.getListState().getPayload()).f47946e, ((com.ss.android.ugc.aweme.following.repository.i) followingRelationState.getListState().getPayload()).f47947f) && CollectionUtils.isEmpty(followingRelationState.getListState().getList())) {
                        ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).e();
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(FollowingRelationFragment followingRelationFragment) {
            super(1);
            this.this$0 = followingRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 45025, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 45025, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            DmtStatusView dmtStatusView = (DmtStatusView) this.this$0.a((int) C0906R.id.cvd);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "status_view");
            if (!dmtStatusView.g()) {
                FollowingRelationFragment.a(this.this$0).showLoadMoreLoading();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(FollowingRelationFragment followingRelationFragment) {
            super(2);
            this.this$0 = followingRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 45026, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 45026, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            FollowingRelationFragment.a(this.this$0).showPullUpLoadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class q extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends User>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(FollowingRelationFragment followingRelationFragment) {
            super(2);
            this.this$0 = followingRelationFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends User> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 45027, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 45027, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            fVar.a(this.this$0.o(), new Function1<FollowingRelationState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ q this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FollowingRelationState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FollowingRelationState followingRelationState) {
                    if (PatchProxy.isSupport(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45028, new Class[]{FollowingRelationState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45028, new Class[]{FollowingRelationState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(followingRelationState, AdvanceSetting.NETWORK_TYPE);
                    if (!this.this$0.this$0.o().a(((com.ss.android.ugc.aweme.following.repository.i) followingRelationState.getListState().getPayload()).f21387a.f21351a, ((com.ss.android.ugc.aweme.following.repository.i) followingRelationState.getListState().getPayload()).f47946e, ((com.ss.android.ugc.aweme.following.repository.i) followingRelationState.getListState().getPayload()).f47947f)) {
                        if (CollectionUtils.isEmpty(followingRelationState.getListState().getList())) {
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
    static final class r extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(FollowingRelationFragment followingRelationFragment) {
            super(2);
            this.this$0 = followingRelationFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 45029, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 45029, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                FollowingRelationFragment.a(this.this$0).resetLoadMoreState();
            } else {
                FollowingRelationFragment.a(this.this$0).showLoadMoreEmpty();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationState;", "it", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class s extends Lambda implements Function2<FollowingRelationState, Bundle, FollowingRelationState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(FollowingRelationFragment followingRelationFragment) {
            super(2);
            this.this$0 = followingRelationFragment;
        }

        @NotNull
        public final FollowingRelationState invoke(@NotNull FollowingRelationState followingRelationState, @Nullable Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{followingRelationState, bundle}, this, changeQuickRedirect, false, 45030, new Class[]{FollowingRelationState.class, Bundle.class}, FollowingRelationState.class)) {
                return (FollowingRelationState) PatchProxy.accessDispatch(new Object[]{followingRelationState, bundle}, this, changeQuickRedirect, false, 45030, new Class[]{FollowingRelationState.class, Bundle.class}, FollowingRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(followingRelationState, "$receiver");
            String str = this.this$0.f47949d;
            if (str == null) {
                str = "";
            }
            return FollowingRelationState.copy$default(followingRelationState, str, this.this$0.j(), null, 4, null);
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, h, false, 45002, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, h, false, 45002, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.r == null) {
            this.r = new HashMap();
        }
        View view = (View) this.r.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.r.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 45003, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 45003, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.clear();
        }
    }

    public final int i() {
        return C0906R.layout.nz;
    }

    public final FollowingRelationViewModel o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44987, new Class[0], FollowingRelationViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, h, false, 44987, new Class[0], FollowingRelationViewModel.class);
        } else {
            value = this.p.getValue();
        }
        return (FollowingRelationViewModel) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public final FollowRelationTabViewModel p() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44988, new Class[0], FollowRelationTabViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, h, false, 44988, new Class[0], FollowRelationTabViewModel.class);
        } else {
            value = this.q.getValue();
        }
        return (FollowRelationTabViewModel) value;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44994, new Class[0], Void.TYPE);
            return;
        }
        o().g.refresh();
    }

    public final int l() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44996, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 44996, new Class[0], Integer.TYPE)).intValue();
        }
        j();
        return 2130839716;
    }

    public FollowingRelationFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FollowingRelationViewModel.class);
        this.p = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, new s(this), orCreateKotlinClass));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(FollowRelationTabViewModel.class);
        this.q = LazyKt.lazy(new a(this, orCreateKotlinClass2, orCreateKotlinClass2));
    }

    public final int m() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44997, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 44997, new Class[0], Integer.TYPE)).intValue();
        } else if (j()) {
            if (com.ss.android.g.a.a()) {
                return C0906R.string.ah3;
            }
            return C0906R.string.dmq;
        } else if (com.ss.android.g.a.a()) {
            return C0906R.string.ah4;
        } else {
            return C0906R.string.dn2;
        }
    }

    public final int n() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44998, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 44998, new Class[0], Integer.TYPE)).intValue();
        } else if (j()) {
            if (com.ss.android.g.a.a()) {
                return C0906R.string.ah2;
            }
            return C0906R.string.dmp;
        } else if (com.ss.android.g.a.a()) {
            return C0906R.string.ah2;
        } else {
            return C0906R.string.dn1;
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 45000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 45000, new Class[0], Void.TYPE);
            return;
        }
        ((DmtStatusView) a((int) C0906R.id.cvd)).b();
        this.m = "";
        ImageButton imageButton = (ImageButton) a((int) C0906R.id.ns);
        Intrinsics.checkExpressionValueIsNotNull(imageButton, "btn_clear");
        imageButton.setVisibility(8);
        this.l.setData(new ArrayList());
        this.l.f48112c = this.m;
    }

    public final void q() {
        List<IMUser> list;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44999, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44999, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.following.ui.viewmodel.g gVar = this.k;
        String str = this.m;
        if (PatchProxy.isSupport(new Object[]{str}, gVar, com.ss.android.ugc.aweme.following.ui.viewmodel.g.f48219a, false, 45280, new Class[]{String.class}, List.class)) {
            Object[] objArr = {str};
            com.ss.android.ugc.aweme.following.ui.viewmodel.g gVar2 = gVar;
            list = (List) PatchProxy.accessDispatch(objArr, gVar2, com.ss.android.ugc.aweme.following.ui.viewmodel.g.f48219a, false, 45280, new Class[]{String.class}, List.class);
        } else {
            Intrinsics.checkParameterIsNotNull(str, "keyWord");
            if (TextUtils.isEmpty(str)) {
                list = new ArrayList<>();
            } else {
                list = com.ss.android.ugc.aweme.im.b.a().searchFollowIMUser(gVar.f48220b, str);
                Intrinsics.checkExpressionValueIsNotNull(list, "IM.get().searchFollowIMUser(mIMUserList, keyWord)");
            }
        }
        if (CollectionUtils.isEmpty(list)) {
            ((DmtStatusView) a((int) C0906R.id.cvd)).e();
        } else {
            ((DmtStatusView) a((int) C0906R.id.cvd)).b();
        }
        this.l.setData(list);
        this.l.f48112c = this.m;
    }

    public static final /* synthetic */ FollowListAdapter a(FollowingRelationFragment followingRelationFragment) {
        FollowListAdapter followListAdapter = followingRelationFragment.j;
        if (followListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowingListAdapter");
        }
        return followListAdapter;
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 45001, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 45001, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z && ((DmtEditText) a((int) C0906R.id.aai)) != null) {
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) getActivity(), (View) (DmtEditText) a((int) C0906R.id.aai));
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, h, false, 44989, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, h, false, 44989, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44990, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44991, new Class[0], Void.TYPE);
        } else {
            if (com.ss.android.g.a.b() || !j()) {
                LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.cld);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "search_group");
                linearLayout.setVisibility(8);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.cld);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "search_group");
                linearLayout2.setVisibility(0);
            }
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
        }
        this.j = new FollowListAdapter(this, "following_relation", j());
        if (com.ss.android.g.a.a()) {
            FollowListAdapter followListAdapter = this.j;
            if (followListAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFollowingListAdapter");
            }
            followListAdapter.mTextColor = getResources().getColor(C0906R.color.yx);
        }
        RecyclerView recyclerView2 = (RecyclerView) a((int) C0906R.id.cip);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv_list");
        FollowListAdapter followListAdapter2 = this.j;
        if (followListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowingListAdapter");
        }
        recyclerView2.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.j;
        if (followListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowingListAdapter");
        }
        followListAdapter3.setLoadMoreListener(new c(this));
        if (!com.ss.android.g.a.b() && j()) {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 44992, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 44992, new Class[0], Void.TYPE);
            } else {
                this.n = DmtStatusView.a.a(getContext()).a(new c.a(getContext()).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a);
                ((ImageButton) a((int) C0906R.id.ns)).setOnClickListener(new d(this));
                ((DmtTextView) a((int) C0906R.id.d9w)).setOnClickListener(new e(this));
                ((DmtEditText) a((int) C0906R.id.aai)).setOnTouchListener(new f(this));
                ((DmtEditText) a((int) C0906R.id.aai)).addTextChangedListener(new g(this));
                ((DmtEditText) a((int) C0906R.id.aai)).setOnEditorActionListener(new h(this));
                this.k.a();
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 44993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 44993, new Class[0], Void.TYPE);
            return;
        }
        Disposable unused = a(p(), d.INSTANCE, c(), false, new k(this));
        ListMiddleware<FollowingRelationState, User, com.ss.android.ugc.aweme.following.repository.i> listMiddleware = o().g;
        com.bytedance.jedi.arch.e eVar = this;
        FollowListAdapter followListAdapter4 = this.j;
        if (followListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFollowingListAdapter");
        }
        ListMiddleware.a(listMiddleware, eVar, followListAdapter4, false, false, new i(new l(this), new m(this), new n(this)), new j(new o(this), new p(this), new q(this)), new r(this), null, 140);
    }
}
