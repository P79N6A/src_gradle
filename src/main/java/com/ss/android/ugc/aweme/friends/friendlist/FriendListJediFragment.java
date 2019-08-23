package com.ss.android.ugc.aweme.friends.friendlist;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListJediFragment;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnTouchListener;", "()V", "friendListAdapter", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemWidgetAdapter;", "friendListViewModel", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;", "getFriendListViewModel", "()Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;", "friendListViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "onClick", "", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onTouch", "", "event", "Landroid/view/MotionEvent;", "onViewCreated", "view", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListJediFragment extends JediBaseFragment implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f48906c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f48907d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FriendListJediFragment.class), "friendListViewModel", "getFriendListViewModel()Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;"))};

    /* renamed from: e  reason: collision with root package name */
    public FriendListItemWidgetAdapter f48908e;

    /* renamed from: f  reason: collision with root package name */
    private final lifecycleAwareLazy f48909f;
    private HashMap g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<FriendListState, Bundle, FriendListState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.friends.friendlist.FriendListState, com.bytedance.jedi.arch.x] */
        @NotNull
        public final FriendListState invoke(@NotNull FriendListState friendListState, @Nullable Bundle bundle) {
            FriendListState friendListState2 = friendListState;
            if (PatchProxy.isSupport(new Object[]{friendListState2, bundle}, this, changeQuickRedirect, false, 46454, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{friendListState2, bundle}, this, changeQuickRedirect, false, 46454, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(friendListState2, "$receiver");
            return friendListState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<FriendListViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.friendlist.FriendListViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.friendlist.FriendListViewModel] */
        @NotNull
        public final FriendListViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46455, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46455, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            n a2 = r0.f2282c.a(FriendListViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<FriendListState, FriendListState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.friends.friendlist.FriendListState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.friends.friendlist.FriendListState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final FriendListState invoke(@NotNull FriendListState friendListState) {
                    if (PatchProxy.isSupport(new Object[]{friendListState}, this, changeQuickRedirect, false, 46456, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{friendListState}, this, changeQuickRedirect, false, 46456, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(friendListState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(friendListState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.friends.adapter.c, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f48910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f48911b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f48912c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f48913d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f48914e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, Unit> f48915f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f48913d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f48914e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, Unit> c() {
            return this.f48915f;
        }

        public c(Function1 function1, Function2 function2, Function2 function22) {
            this.f48910a = function1;
            this.f48911b = function2;
            this.f48912c = function22;
            this.f48913d = function1;
            this.f48914e = function2;
            this.f48915f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.friends.adapter.c, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f48916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f48917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f48918c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f48919d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f48920e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, Unit> f48921f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f48919d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f48920e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, Unit> c() {
            return this.f48921f;
        }

        public d(Function1 function1, Function2 function2, Function2 function22) {
            this.f48916a = function1;
            this.f48917b = function2;
            this.f48918c = function22;
            this.f48919d = function1;
            this.f48920e = function2;
            this.f48921f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/friends/friendlist/FriendListJediFragment$onViewCreated$9$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48922a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DmtStatusView f48923b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FriendListJediFragment f48924c;

        e(DmtStatusView dmtStatusView, FriendListJediFragment friendListJediFragment) {
            this.f48923b = dmtStatusView;
            this.f48924c = friendListJediFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48922a, false, 46457, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48922a, false, 46457, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f48923b.d();
            FriendListViewModel h = this.f48924c.h();
            if (PatchProxy.isSupport(new Object[]{h}, null, f.f48938a, true, 46496, new Class[]{FriendListViewModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{h}, null, f.f48938a, true, 46496, new Class[]{FriendListViewModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(h, "$this$friendListRefresh");
            h.friendListMiddleware.refresh();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class f extends FunctionReference implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f(FriendListViewModel friendListViewModel) {
            super(0, friendListViewModel);
        }

        public final String getName() {
            return "friendListLoadMore";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46459, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinPackage(f.class, "main_douyinCnRelease");
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46459, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "friendListLoadMore(Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;)V";
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46458, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46458, new Class[0], Void.TYPE);
                return;
            }
            FriendListViewModel friendListViewModel = (FriendListViewModel) this.receiver;
            if (PatchProxy.isSupport(new Object[]{friendListViewModel}, null, f.f48938a, true, 46495, new Class[]{FriendListViewModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{friendListViewModel}, null, f.f48938a, true, 46495, new Class[]{FriendListViewModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(friendListViewModel, "$this$friendListLoadMore");
            friendListViewModel.friendListMiddleware.loadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(FriendListJediFragment friendListJediFragment) {
            super(2);
            this.this$0 = friendListJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 46460, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 46460, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                FriendListJediFragment.a(this.this$0).resetLoadMoreState();
            } else {
                FriendListJediFragment.a(this.this$0).showLoadMoreEmpty();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FriendListJediFragment friendListJediFragment) {
            super(1);
            this.this$0 = friendListJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 46461, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 46461, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "data", "", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(FriendListJediFragment friendListJediFragment) {
            super(2);
            this.this$0 = friendListJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 46462, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 46462, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "data");
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
            if (list.isEmpty()) {
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).e();
                LinearLayout linearLayout = (LinearLayout) this.this$0.a((int) C0906R.id.bg4);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_content");
                linearLayout.setVisibility(4);
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.this$0.a((int) C0906R.id.bg4);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_content");
            linearLayout2.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FriendListJediFragment friendListJediFragment) {
            super(2);
            this.this$0 = friendListJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{fVar, th}, this, changeQuickRedirect, false, 46463, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th}, this, changeQuickRedirect, false, 46463, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).f();
            fVar.a(this.this$0.h(), new Function1<FriendListState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ j this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((FriendListState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull FriendListState friendListState) {
                    if (PatchProxy.isSupport(new Object[]{friendListState}, this, changeQuickRedirect, false, 46464, new Class[]{FriendListState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{friendListState}, this, changeQuickRedirect, false, 46464, new Class[]{FriendListState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(friendListState, "state");
                    if (friendListState.getListState().getList().isEmpty()) {
                        LinearLayout linearLayout = (LinearLayout) this.this$0.this$0.a((int) C0906R.id.bg4);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_content");
                        linearLayout.setVisibility(4);
                        return;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) this.this$0.this$0.a((int) C0906R.id.bg4);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "ll_content");
                    linearLayout2.setVisibility(0);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(FriendListJediFragment friendListJediFragment) {
            super(1);
            this.this$0 = friendListJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 46465, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 46465, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            FriendListJediFragment.a(this.this$0).showLoadMoreLoading();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, Unit> {
        public static final l INSTANCE = new l();
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
            super(2);
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list2 = list;
            if (PatchProxy.isSupport(new Object[]{fVar2, list2}, this, changeQuickRedirect, false, 46466, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, list2}, this, changeQuickRedirect, false, 46466, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(FriendListJediFragment friendListJediFragment) {
            super(2);
            this.this$0 = friendListJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 46467, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 46467, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            FriendListJediFragment.a(this.this$0).showPullUpLoadMore();
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48906c, false, 46452, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48906c, false, 46452, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        View view = (View) this.g.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.g.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f48906c, false, 46453, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48906c, false, 46453, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.clear();
        }
    }

    public final FriendListViewModel h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f48906c, false, 46447, new Class[0], FriendListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f48906c, false, 46447, new Class[0], FriendListViewModel.class);
        } else {
            value = this.f48909f.getValue();
        }
        return (FriendListViewModel) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public FriendListJediFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FriendListViewModel.class);
        this.f48909f = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
    }

    public static final /* synthetic */ FriendListItemWidgetAdapter a(FriendListJediFragment friendListJediFragment) {
        FriendListItemWidgetAdapter friendListItemWidgetAdapter = friendListJediFragment.f48908e;
        if (friendListItemWidgetAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
        }
        return friendListItemWidgetAdapter;
    }

    public final void onClick(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f48906c, false, 46450, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f48906c, false, 46450, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
        int id = view.getId();
        if (id == C0906R.id.bhu) {
            r.a("edit_remarks", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "friends_list").f34114b);
            LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.bhu);
            linearLayout.animate().alpha(0.0f).setDuration(100).start();
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.bhv);
            linearLayout2.setVisibility(0);
            linearLayout2.animate().alpha(1.0f).setDuration(200).start();
            h().a(true);
            return;
        }
        if (id == C0906R.id.bhv) {
            LinearLayout linearLayout3 = (LinearLayout) a((int) C0906R.id.bhv);
            linearLayout3.animate().alpha(0.0f).setDuration(100).start();
            linearLayout3.setVisibility(8);
            LinearLayout linearLayout4 = (LinearLayout) a((int) C0906R.id.bhu);
            linearLayout4.setVisibility(0);
            linearLayout4.animate().alpha(1.0f).setDuration(200).start();
            h().a(false);
        }
    }

    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f48906c, false, 46451, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f48906c, false, 46451, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
        Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
        int id = view.getId();
        if (id != C0906R.id.bhu && id != C0906R.id.bhv) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            an.a(view2, 1.0f, 0.5f);
        } else if (motionEvent.getAction() == 3) {
            an.a(view2, 0.5f, 1.0f);
        } else if (motionEvent.getAction() == 1) {
            an.a(view2, 0.5f, 1.0f);
        }
        return false;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f48906c, false, 46449, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f48906c, false, 46449, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        FriendListItemWidgetAdapter friendListItemWidgetAdapter = new FriendListItemWidgetAdapter(com.bytedance.widget.a.f22910e.a(this, view2), h().friendListMiddleware);
        friendListItemWidgetAdapter.setLoadMoreListener(new d(new f(h())));
        RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.cih);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(friendListItemWidgetAdapter);
        this.f48908e = friendListItemWidgetAdapter;
        FriendListViewModel h2 = h();
        com.bytedance.jedi.arch.e eVar = this;
        FriendListItemWidgetAdapter friendListItemWidgetAdapter2 = this.f48908e;
        if (friendListItemWidgetAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("friendListAdapter");
        }
        com.bytedance.jedi.arch.ext.list.a aVar = friendListItemWidgetAdapter2;
        Function2 gVar = new g(this);
        com.bytedance.jedi.arch.ext.list.c cVar = new c(new h(this), new j(this), new i(this));
        com.bytedance.jedi.arch.ext.list.c dVar = new d(new k(this), new m(this), l.INSTANCE);
        if (PatchProxy.isSupport(new Object[]{h2, eVar, aVar, cVar, dVar, gVar}, null, f.f48938a, true, 46497, new Class[]{FriendListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE)) {
            Object[] objArr = {h2, eVar, aVar, cVar, dVar, gVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f.f48938a, true, 46497, new Class[]{FriendListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(h2, "$this$friendListSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "subscriber");
            Intrinsics.checkParameterIsNotNull(aVar, "adapter");
            ListMiddleware.a(h2.friendListMiddleware, eVar, aVar, false, eVar.c(), cVar, dVar, gVar, null, SearchJediMixFeedAdapter.f42517f);
        }
        View.OnClickListener onClickListener = this;
        ((LinearLayout) a((int) C0906R.id.bhu)).setOnClickListener(onClickListener);
        ((LinearLayout) a((int) C0906R.id.bhv)).setOnClickListener(onClickListener);
        View.OnTouchListener onTouchListener = this;
        ((LinearLayout) a((int) C0906R.id.bhu)).setOnTouchListener(onTouchListener);
        ((LinearLayout) a((int) C0906R.id.bhv)).setOnTouchListener(onTouchListener);
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.cvd);
        dmtStatusView.setBuilder(DmtStatusView.a.a(dmtStatusView.getContext()).a().a(new c.a(dmtStatusView.getContext()).a(2130840140).b((int) C0906R.string.aam).c(C0906R.string.aal).f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new e(dmtStatusView, this)));
        dmtStatusView.d();
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f48906c, false, 46448, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f48906c, false, 46448, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.o1, viewGroup2, false);
    }
}
