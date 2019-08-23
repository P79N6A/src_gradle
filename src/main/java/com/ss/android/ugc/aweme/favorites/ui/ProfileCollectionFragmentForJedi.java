package com.ss.android.ugc.aweme.favorites.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJedi;
import com.ss.android.ugc.aweme.favorites.model.ProfileCollectionState;
import com.ss.android.ugc.aweme.favorites.model.ProfileCollectionViewModel;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.utils.bh;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020\tH\u0016J\u001a\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(H\u0002J\u0010\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020\tH\u0016J&\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u001a\u00103\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0006\u00104\u001a\u00020 J\b\u00105\u001a\u00020 H\u0016J\b\u00106\u001a\u00020 H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/ui/ProfileCollectionFragmentForJedi;", "Lcom/ss/android/ugc/aweme/music/util/ProfileListFragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "()V", "mAdapter", "Lcom/ss/android/ugc/aweme/favorites/adapter/ProfileCollectionAdapterForJedi;", "mIsPrivateAccount", "", "mNeedRefresh", "mPrivateAccountStub", "Landroid/view/ViewStub;", "mPrivateAccountView", "Landroid/view/View;", "mStatusViewBuilder", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView$Builder;", "viewModel", "Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionViewModel;", "viewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/base/arch/ReflectViewModelFactory;", "createStatusTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "strRes", "", "getScrollableView", "handlePageChanged", "", "initPrivateAndTeenView", "view", "initView", "initViewModel", "isEmpty", "mobProfileRequestEvent", "status", "", "errMsg", "monitorFailed", "needRefresh", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "refresh", "scrollToFirstItem", "setLazyData", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionFragmentForJedi extends ProfileListFragment implements ae<com.ss.android.ugc.aweme.base.arch.c>, h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44326a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f44327b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ProfileCollectionFragmentForJedi.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionViewModel;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.arch.c f44328c = new com.ss.android.ugc.aweme.base.arch.c();

    /* renamed from: d  reason: collision with root package name */
    public ProfileCollectionAdapterForJedi f44329d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f44330e = true;

    /* renamed from: f  reason: collision with root package name */
    public View f44331f;
    public boolean g;
    private final lifecycleAwareLazy h;
    private DmtStatusView.a l;
    private ViewStub m;
    private HashMap n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<ProfileCollectionState, Bundle, ProfileCollectionState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.favorites.model.ProfileCollectionState] */
        @NotNull
        public final ProfileCollectionState invoke(@NotNull ProfileCollectionState profileCollectionState, @Nullable Bundle bundle) {
            ProfileCollectionState profileCollectionState2 = profileCollectionState;
            if (PatchProxy.isSupport(new Object[]{profileCollectionState2, bundle}, this, changeQuickRedirect, false, 39627, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{profileCollectionState2, bundle}, this, changeQuickRedirect, false, 39627, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(profileCollectionState2, "$receiver");
            return profileCollectionState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<ProfileCollectionViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.favorites.model.ProfileCollectionViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.favorites.model.ProfileCollectionViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final ProfileCollectionViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39628, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39628, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            n a2 = r0.f2282c.a(ProfileCollectionViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<ProfileCollectionState, ProfileCollectionState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.favorites.model.ProfileCollectionState] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.bytedance.jedi.arch.x, com.ss.android.ugc.aweme.favorites.model.ProfileCollectionState] */
                @NotNull
                public final ProfileCollectionState invoke(@NotNull ProfileCollectionState profileCollectionState) {
                    if (PatchProxy.isSupport(new Object[]{profileCollectionState}, this, changeQuickRedirect, false, 39629, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{profileCollectionState}, this, changeQuickRedirect, false, 39629, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(profileCollectionState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(profileCollectionState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileCollectionFragmentForJedi f44333b;

        c(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            this.f44333b = profileCollectionFragmentForJedi;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f44332a, false, 39630, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f44332a, false, 39630, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f44333b.g().f44286e.refresh();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.favorites.a.f, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f44334a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f44335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f44336c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f44337d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f44338e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.favorites.a.f>, Unit> f44339f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f44337d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f44338e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.favorites.a.f>, Unit> c() {
            return this.f44339f;
        }

        public d(Function1 function1, Function2 function2, Function2 function22) {
            this.f44334a = function1;
            this.f44335b = function2;
            this.f44336c = function22;
            this.f44337d = function1;
            this.f44338e = function2;
            this.f44339f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ProfileCollectionFragmentForJedi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            super(1);
            this.this$0 = profileCollectionFragmentForJedi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            if (PatchProxy.isSupport(new Object[]{fVar}, this, changeQuickRedirect, false, 39631, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, changeQuickRedirect, false, 39631, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (this.this$0.isViewValid()) {
                this.this$0.b(PushConstants.PUSH_TYPE_NOTIFY, "");
                if (!NetworkUtils.isNetworkAvailable(this.this$0.getActivity())) {
                    this.this$0.f44330e = true;
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.this$0.getActivity(), (int) C0906R.string.bgf).a();
                    return;
                }
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                if (!TextUtils.isEmpty(a2.getCurUserId())) {
                    this.this$0.f44330e = false;
                    if (this.this$0.k()) {
                        ((DmtStatusView) this.this$0.a(C0906R.id.cvd)).d();
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "error", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ProfileCollectionFragmentForJedi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            super(2);
            this.this$0 = profileCollectionFragmentForJedi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 39632, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 39632, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, "error");
            this.this$0.b(PushConstants.PUSH_TYPE_UPLOAD_LOG, th.toString());
            ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi = this.this$0;
            String th3 = th.toString();
            if (PatchProxy.isSupport(new Object[]{th3}, profileCollectionFragmentForJedi, ProfileCollectionFragmentForJedi.f44326a, false, 39602, new Class[]{String.class}, Void.TYPE)) {
                ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi2 = profileCollectionFragmentForJedi;
                PatchProxy.accessDispatch(new Object[]{th3}, profileCollectionFragmentForJedi2, ProfileCollectionFragmentForJedi.f44326a, false, 39602, new Class[]{String.class}, Void.TYPE);
            } else {
                bh a2 = bh.a();
                a2.a("error_msg", th3);
                com.ss.android.ugc.aweme.app.n.a("poi_log", "profile_collection", a2.b());
            }
            this.this$0.f44330e = true;
            ((DmtStatusView) this.this$0.a(C0906R.id.cvd)).f();
            ProfileCollectionAdapterForJedi profileCollectionAdapterForJedi = this.this$0.f44329d;
            if (profileCollectionAdapterForJedi == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            profileCollectionAdapterForJedi.resetLoadMoreState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.favorites.a.f>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ProfileCollectionFragmentForJedi this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            super(2);
            this.this$0 = profileCollectionFragmentForJedi;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<com.ss.android.ugc.aweme.favorites.a.f> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 39633, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 39633, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            this.this$0.b(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "");
            fVar.a(this.this$0.g(), new Function1<ProfileCollectionState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ g this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ProfileCollectionState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ProfileCollectionState profileCollectionState) {
                    if (PatchProxy.isSupport(new Object[]{profileCollectionState}, this, changeQuickRedirect, false, 39634, new Class[]{ProfileCollectionState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{profileCollectionState}, this, changeQuickRedirect, false, 39634, new Class[]{ProfileCollectionState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(profileCollectionState, AdvanceSetting.NETWORK_TYPE);
                    if (CollectionUtils.isEmpty(profileCollectionState.getProfileCollectionItemStructListState().getList())) {
                        ((DmtStatusView) this.this$0.this$0.a(C0906R.id.cvd)).e();
                    } else {
                        ((DmtStatusView) this.this$0.this$0.a(C0906R.id.cvd)).b();
                    }
                }
            });
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44326a, false, 39625, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44326a, false, 39625, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final ProfileCollectionViewModel g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39588, new Class[0], ProfileCollectionViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39588, new Class[0], ProfileCollectionViewModel.class);
        } else {
            value = this.h.getValue();
        }
        return (ProfileCollectionViewModel) value;
    }

    public final boolean j() {
        return this.f44330e;
    }

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.f44328c;
    }

    public ProfileCollectionFragmentForJedi() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProfileCollectionViewModel.class);
        this.h = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
    }

    @NotNull
    public final k a() {
        if (!PatchProxy.isSupport(new Object[0], this, f44326a, false, 39603, new Class[0], k.class)) {
            return h.a.a(this);
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39603, new Class[0], k.class);
    }

    @NotNull
    public final r<com.bytedance.jedi.arch.f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f44326a, false, 39606, new Class[0], r.class)) {
            return h.a.b(this);
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39606, new Class[0], r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f44326a, false, 39607, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39607, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, f44326a, false, 39604, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39604, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        com.bytedance.jedi.arch.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39605, new Class[0], com.bytedance.jedi.arch.f.class)) {
            fVar = (com.bytedance.jedi.arch.f) PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39605, new Class[0], com.bytedance.jedi.arch.f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    @NotNull
    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39595, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39595, new Class[0], View.class);
        }
        RecyclerView recyclerView = (RecyclerView) a(C0906R.id.u9);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "collect_list");
        return recyclerView;
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39598, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39598, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ProfileCollectionAdapterForJedi profileCollectionAdapterForJedi = this.f44329d;
        if (profileCollectionAdapterForJedi == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        if (profileCollectionAdapterForJedi.getItemCount() == 0) {
            z = true;
        }
        return z;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39626, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.clear();
        }
    }

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39596, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            if (((DmtStatusView) a(C0906R.id.cvd)) == null || (!this.g && !TimeLockRuler.isTeenModeON())) {
                g().f44286e.refresh();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) a(C0906R.id.cvd);
                if (dmtStatusView == null) {
                    Intrinsics.throwNpe();
                }
                dmtStatusView.setVisibility(4);
                View view = this.f44331f;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
                }
                view.setVisibility(0);
            }
        }
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39597, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            RecyclerView recyclerView = (RecyclerView) a(C0906R.id.u9);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "collect_list");
            if (recyclerView.getChildCount() > 0) {
                ((RecyclerView) a(C0906R.id.u9)).smoothScrollToPosition(0);
            }
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39599, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint()) {
            if (((DmtStatusView) a(C0906R.id.cvd)) == null || (!this.g && !TimeLockRuler.isTeenModeON())) {
                g().f44286e.refresh();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) a(C0906R.id.cvd);
                if (dmtStatusView == null) {
                    Intrinsics.throwNpe();
                }
                dmtStatusView.setVisibility(4);
                View view = this.f44331f;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
                }
                view.setVisibility(0);
            }
        }
    }

    private final DmtTextView b(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44326a, false, 39593, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44326a, false, 39593, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        dmtTextView.setTextColor(getResources().getColor(C0906R.color.zv));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public final void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f44326a, false, 39601, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f44326a, false, 39601, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        a2.a("request_status", str3);
        if (!TextUtils.isEmpty(str4)) {
            a2.a("err_msg", str4);
        }
        com.ss.android.ugc.aweme.common.r.a("profile_collection_request", (Map) a2.f34114b);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f44326a, false, 39590, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f44326a, false, 39590, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39592, new Class[0], Void.TYPE);
        } else {
            DmtTextView b2 = b(C0906R.string.b6z);
            b2.setOnClickListener(new c(this));
            DmtStatusView.a c2 = new DmtStatusView.a(getContext()).a().b((View) b(C0906R.string.brq)).c((View) b2);
            Intrinsics.checkExpressionValueIsNotNull(c2, "DmtStatusView.Builder(co… .setErrorView(errorView)");
            this.l = c2;
            DmtStatusView dmtStatusView = (DmtStatusView) a(C0906R.id.cvd);
            DmtStatusView.a aVar = this.l;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusViewBuilder");
            }
            dmtStatusView.setBuilder(aVar);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity(), 1, false);
            RecyclerView recyclerView = (RecyclerView) a(C0906R.id.u9);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "collect_list");
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            this.f44329d = new ProfileCollectionAdapterForJedi(this);
            ProfileCollectionAdapterForJedi profileCollectionAdapterForJedi = this.f44329d;
            if (profileCollectionAdapterForJedi == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            profileCollectionAdapterForJedi.resetLoadMoreState();
            RecyclerView recyclerView2 = (RecyclerView) a(C0906R.id.u9);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "collect_list");
            ProfileCollectionAdapterForJedi profileCollectionAdapterForJedi2 = this.f44329d;
            if (profileCollectionAdapterForJedi2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            recyclerView2.setAdapter(profileCollectionAdapterForJedi2);
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, f44326a, false, 39591, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f44326a, false, 39591, new Class[]{View.class}, Void.TYPE);
        } else {
            View findViewById = view2.findViewById(C0906R.id.cx0);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.stub_private_account)");
            this.m = (ViewStub) findViewById;
            ViewStub viewStub = this.m;
            if (viewStub == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountStub");
            }
            View inflate = viewStub.inflate();
            Intrinsics.checkExpressionValueIsNotNull(inflate, "mPrivateAccountStub.inflate()");
            this.f44331f = inflate;
            if (TimeLockRuler.isTeenModeON()) {
                View view3 = this.f44331f;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
                }
                ((TextView) view3.findViewById(C0906R.id.title)).setText(C0906R.string.cit);
                View view4 = this.f44331f;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
                }
                ((TextView) view4.findViewById(C0906R.id.yp)).setText(C0906R.string.cii);
            }
            View view5 = this.f44331f;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrivateAccountView");
            }
            view5.setVisibility(4);
        }
        if (PatchProxy.isSupport(new Object[0], this, f44326a, false, 39594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44326a, false, 39594, new Class[0], Void.TYPE);
            return;
        }
        ListMiddleware<ProfileCollectionState, com.ss.android.ugc.aweme.favorites.a.f, com.bytedance.jedi.arch.ext.list.k> listMiddleware = g().f44286e;
        com.bytedance.jedi.arch.e eVar = this;
        ProfileCollectionAdapterForJedi profileCollectionAdapterForJedi3 = this.f44329d;
        if (profileCollectionAdapterForJedi3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        ListMiddleware.a(listMiddleware, eVar, profileCollectionAdapterForJedi3, false, false, new d(new e(this), new f(this), new g(this)), null, null, null, 236);
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, f44326a, false, 39608, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, f44326a, false, 39608, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f44326a, false, 39589, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f44326a, false, 39589, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.ac0, viewGroup2, false);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f44326a, false, 39624, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, f44326a, false, 39624, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f44326a, false, 39619, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, f44326a, false, 39619, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, f44326a, false, 39618, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, f44326a, false, 39618, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
