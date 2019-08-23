package com.ss.android.ugc.aweme.friends.friendlist;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.x;
import com.bytedance.widget.Widget;
import com.bytedance.widget.ext.list.ItemWidget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.bytedance.widget.ext.list.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.friendlist.FriendListItemViewModel;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import io.reactivex.disposables.Disposable;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0014\u0010\u001f\u001a\u00020\u0018*\u00020\u00032\u0006\u0010 \u001a\u00020!H\u0002J\u0014\u0010\"\u001a\u00020\u0018*\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0014R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemWidget;", "Lcom/bytedance/widget/ext/list/ItemWidget;", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemWidgetViewHolder;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemViewModelFactory;", "()V", "friendListViewModel", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;", "getFriendListViewModel", "()Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;", "friendListViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemViewModel;", "viewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemViewModelFactory;", "onAttachedToWindow", "", "holder", "onCreate", "onMobEvent", "eventName", "", "uid", "bindOnChange", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "onBindViewHolder", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListItemWidget extends ItemWidget<com.ss.android.ugc.aweme.friends.adapter.c, FriendListItemWidgetViewHolder> implements ae<a>, com.bytedance.jedi.arch.h {
    public static ChangeQuickRedirect g;
    static final /* synthetic */ KProperty[] h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FriendListItemWidget.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FriendListItemWidget.class), "friendListViewModel", "getFriendListViewModel()Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;"))};
    @NotNull
    public final a i = new a();
    private final lifecycleAwareLazy j;
    private final Lazy k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/LegeciesKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<FriendListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.friendlist.FriendListViewModel] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.friendlist.FriendListViewModel] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.friends.friendlist.FriendListViewModel invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r7 = com.bytedance.jedi.arch.JediViewModel.class
                r4 = 0
                r5 = 46431(0xb55f, float:6.5064E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 46431(0xb55f, float:6.5064E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r8 = com.bytedance.jedi.arch.JediViewModel.class
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x0028:
                com.bytedance.widget.Widget r0 = r9.$this_hostViewModel
                java.lang.Object r0 = r0.j()
                kotlin.reflect.KClass r1 = r9.$viewModelClass$inlined
                java.lang.Class r1 = kotlin.jvm.a.a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                r2 = 0
                boolean r3 = r0 instanceof android.support.v4.app.Fragment
                if (r3 == 0) goto L_0x007e
                android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
                r3 = r0
            L_0x0045:
                if (r3 == 0) goto L_0x0062
                android.arch.lifecycle.ViewModelProvider$Factory r4 = com.bytedance.jedi.arch.b.a()     // Catch:{ af -> 0x005d }
                android.arch.lifecycle.ViewModelProvider r4 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.Fragment) r3, (android.arch.lifecycle.ViewModelProvider.Factory) r4)     // Catch:{ af -> 0x005d }
                kotlin.reflect.KClass r5 = r9.$viewModelClass     // Catch:{ af -> 0x005d }
                java.lang.Class r5 = kotlin.jvm.a.a(r5)     // Catch:{ af -> 0x005d }
                android.arch.lifecycle.ViewModel r4 = r4.get(r1, r5)     // Catch:{ af -> 0x005d }
                com.bytedance.jedi.arch.JediViewModel r4 = (com.bytedance.jedi.arch.JediViewModel) r4     // Catch:{ af -> 0x005d }
                r2 = r4
                goto L_0x0062
            L_0x005d:
                android.support.v4.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0045
            L_0x0062:
                if (r2 != 0) goto L_0x007d
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                kotlin.reflect.KClass r2 = r9.$viewModelClass
                java.lang.Class r2 = kotlin.jvm.a.a(r2)
                android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                r2 = r0
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            L_0x007d:
                return r2
            L_0x007e:
                boolean r2 = r0 instanceof android.support.v4.app.FragmentActivity
                if (r2 == 0) goto L_0x009e
                android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
                android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                kotlin.reflect.KClass r2 = r9.$viewModelClass
                java.lang.Class r2 = kotlin.jvm.a.a(r2)
                android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x009e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.friendlist.FriendListItemWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u001c\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/ext/list/ItemWidget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/widget/ext/list/ExtensionsKt$listViewModel$3"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<FriendListItemViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $argumentsAcceptor;
        final /* synthetic */ ItemWidget $this_listViewModel;
        final /* synthetic */ ItemWidget $this_listViewModel$inlined;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ItemWidget itemWidget, KClass kClass, Function1 function1, ItemWidget itemWidget2, KClass kClass2) {
            super(0);
            this.$this_listViewModel = itemWidget;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function1;
            this.$this_listViewModel$inlined = itemWidget2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.friends.friendlist.FriendListItemViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.friends.friendlist.FriendListItemViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final FriendListItemViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46432, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46432, new Class[0], JediViewModel.class);
            }
            com.bytedance.widget.ext.list.a a2 = a.C0243a.a(((ae) this.$this_listViewModel).r_(), this.$this_listViewModel.m());
            ? r0 = (JediViewModel) a2.a(this.$this_listViewModel$inlined.getClass().getName() + '_' + kotlin.jvm.a.a(this.$viewModelClass$inlined).getName(), kotlin.jvm.a.a(this.$viewModelClass));
            n a3 = r0.f2282c.a(FriendListItemViewModel.class);
            if (a3 != null) {
                a3.binding(r0);
            }
            r0.a(this.$argumentsAcceptor);
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "friendListViewModel", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "viewModel", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<FriendListState, FriendListItemState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListItemWidgetViewHolder $this_apply;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FriendListItemWidgetViewHolder friendListItemWidgetViewHolder) {
            super(2);
            this.$this_apply = friendListItemWidgetViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((FriendListState) obj, (FriendListItemState) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull FriendListState friendListState, @NotNull FriendListItemState friendListItemState) {
            FriendListState friendListState2 = friendListState;
            FriendListItemState friendListItemState2 = friendListItemState;
            if (PatchProxy.isSupport(new Object[]{friendListState2, friendListItemState2}, this, changeQuickRedirect, false, 46433, new Class[]{FriendListState.class, FriendListItemState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{friendListState2, friendListItemState2}, this, changeQuickRedirect, false, 46433, new Class[]{FriendListState.class, FriendListItemState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(friendListState2, "friendListViewModel");
            Intrinsics.checkParameterIsNotNull(friendListItemState2, "viewModel");
            if (friendListState.getNickNameModifiable()) {
                User user = friendListItemState.getUser();
                this.$this_apply.h.setVisibility(0);
                this.$this_apply.i.setVisibility(8);
                s.a(user, user.getFollowStatus(), (TextView) this.$this_apply.f48904e, (View) this.$this_apply.h, "fans", false);
                return;
            }
            this.$this_apply.h.setVisibility(8);
            com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(this.$this_apply.i, 4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick", "com/ss/android/ugc/aweme/friends/friendlist/FriendListItemWidget$onBindViewHolder$2$1"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendListItemWidgetViewHolder f48892b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.friends.adapter.c f48893c;

        d(FriendListItemWidgetViewHolder friendListItemWidgetViewHolder, com.ss.android.ugc.aweme.friends.adapter.c cVar) {
            this.f48892b = friendListItemWidgetViewHolder;
            this.f48893c = cVar;
        }

        public final void onClick(@NotNull View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48891a, false, 46434, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48891a, false, 46434, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
            User user = this.f48893c.getUser();
            UserProfileActivity.a(view.getContext(), user);
            IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
            Intrinsics.checkExpressionValueIsNotNull(user, AllStoryActivity.f73306b);
            a2.cleanUpdateTagCount(user.getUid());
            com.ss.android.ugc.aweme.story.base.view.a.a.a(this.f48892b.f48905f, 1.0f, 0.0f);
            this.f48892b.f48905f.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendListItemWidget f48895b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FriendListItemWidgetViewHolder f48896c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.friends.adapter.c f48897d;

        e(FriendListItemWidget friendListItemWidget, FriendListItemWidgetViewHolder friendListItemWidgetViewHolder, com.ss.android.ugc.aweme.friends.adapter.c cVar) {
            this.f48895b = friendListItemWidget;
            this.f48896c = friendListItemWidgetViewHolder;
            this.f48897d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
            if (r0.b() == false) goto L_0x0049;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f48894a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 46435(0xb563, float:6.5069E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f48894a
                r3 = 0
                r4 = 46435(0xb563, float:6.5069E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
                com.ss.android.ugc.aweme.friends.friendlist.FriendListItemWidgetViewHolder r0 = r9.f48896c
                com.ss.android.ugc.aweme.story.api.b.b r0 = r0.m
                if (r0 == 0) goto L_0x0049
                com.ss.android.ugc.aweme.friends.friendlist.FriendListItemWidgetViewHolder r0 = r9.f48896c
                com.ss.android.ugc.aweme.story.api.b.b r0 = r0.m
                if (r0 == 0) goto L_0x0048
                boolean r0 = r0.b()
                if (r0 != 0) goto L_0x0084
                goto L_0x0049
            L_0x0048:
                return
            L_0x0049:
                com.ss.android.ugc.aweme.friends.adapter.c r0 = r9.f48897d
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
                com.ss.android.ugc.aweme.friends.friendlist.FriendListItemWidget r1 = r9.f48895b
                java.lang.String r2 = "enter_personal_detail"
                java.lang.String r3 = "user"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                java.lang.String r3 = r0.getUid()
                java.lang.String r4 = "user.uid"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r1 = "v"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r1)
                android.content.Context r1 = r10.getContext()
                com.ss.android.ugc.aweme.profile.ui.UserProfileActivity.a((android.content.Context) r1, (com.ss.android.ugc.aweme.profile.model.User) r0)
                com.ss.android.ugc.aweme.im.service.IIMService r1 = com.ss.android.ugc.aweme.im.b.a()
                java.lang.String r0 = r0.getUid()
                r1.cleanUpdateTagCount(r0)
                com.ss.android.ugc.aweme.friends.friendlist.FriendListItemWidgetViewHolder r0 = r9.f48896c
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f48905f
                r1 = 8
                r0.setVisibility(r1)
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.friendlist.FriendListItemWidget.e.onClick(android.view.View):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendListItemWidget f48899b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FriendListItemWidgetViewHolder f48900c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.friends.adapter.c f48901d;

        f(FriendListItemWidget friendListItemWidget, FriendListItemWidgetViewHolder friendListItemWidgetViewHolder, com.ss.android.ugc.aweme.friends.adapter.c cVar) {
            this.f48899b = friendListItemWidget;
            this.f48900c = friendListItemWidgetViewHolder;
            this.f48901d = cVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48898a, false, 46436, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48898a, false, 46436, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            User user = this.f48901d.getUser();
            FriendListItemWidget friendListItemWidget = this.f48899b;
            Intrinsics.checkExpressionValueIsNotNull(user, AllStoryActivity.f73306b);
            String uid = user.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
            friendListItemWidget.a("enter_chat", uid);
            IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
            View view2 = this.f48900c.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            a2.startChat(view2.getContext(), com.ss.android.ugc.aweme.im.b.a(user));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, User, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListItemWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(FriendListItemWidget friendListItemWidget) {
            super(2);
            this.this$0 = friendListItemWidget;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (User) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull User user) {
            if (PatchProxy.isSupport(new Object[]{fVar, user}, this, changeQuickRedirect, false, 46439, new Class[]{com.bytedance.jedi.arch.f.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, user}, this, changeQuickRedirect, false, 46439, new Class[]{com.bytedance.jedi.arch.f.class, User.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
            FriendListItemWidgetViewHolder friendListItemWidgetViewHolder = (FriendListItemWidgetViewHolder) this.this$0.f2338f;
            if (friendListItemWidgetViewHolder != null) {
                this.this$0.a(friendListItemWidgetViewHolder, user);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListItemWidget this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemState;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<FriendListItemState, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ FriendListItemWidgetViewHolder $this_apply;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(FriendListItemWidgetViewHolder friendListItemWidgetViewHolder) {
                super(1);
                this.$this_apply = friendListItemWidgetViewHolder;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FriendListItemState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull FriendListItemState friendListItemState) {
                if (PatchProxy.isSupport(new Object[]{friendListItemState}, this, changeQuickRedirect, false, 46443, new Class[]{FriendListItemState.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{friendListItemState}, this, changeQuickRedirect, false, 46443, new Class[]{FriendListItemState.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(friendListItemState, AdvanceSetting.NETWORK_TYPE);
                User user = friendListItemState.getUser();
                this.$this_apply.h.setVisibility(0);
                this.$this_apply.i.setVisibility(8);
                s.a(user, user.getFollowStatus(), (TextView) this.$this_apply.f48904e, (View) this.$this_apply.h, "fans", false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(FriendListItemWidget friendListItemWidget) {
            super(2);
            this.this$0 = friendListItemWidget;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 46442, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 46442, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            FriendListItemWidgetViewHolder friendListItemWidgetViewHolder = (FriendListItemWidgetViewHolder) this.this$0.f2338f;
            if (friendListItemWidgetViewHolder != null) {
                if (z) {
                    fVar.a(this.this$0.n(), new a(friendListItemWidgetViewHolder));
                } else {
                    friendListItemWidgetViewHolder.h.setVisibility(8);
                    com.ss.android.ugc.aweme.im.b.a().wrapperSendMessageSyncXIcon(friendListItemWidgetViewHolder.i, 4);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<FriendListItemState, FriendListItemState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListItemWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(FriendListItemWidget friendListItemWidget) {
            super(1);
            this.this$0 = friendListItemWidget;
        }

        @NotNull
        public final FriendListItemState invoke(@NotNull FriendListItemState friendListItemState) {
            FriendListItemState friendListItemState2 = friendListItemState;
            if (PatchProxy.isSupport(new Object[]{friendListItemState2}, this, changeQuickRedirect, false, 46444, new Class[]{FriendListItemState.class}, FriendListItemState.class)) {
                return (FriendListItemState) PatchProxy.accessDispatch(new Object[]{friendListItemState2}, this, changeQuickRedirect, false, 46444, new Class[]{FriendListItemState.class}, FriendListItemState.class);
            }
            Intrinsics.checkParameterIsNotNull(friendListItemState2, "$receiver");
            User user = ((com.ss.android.ugc.aweme.friends.adapter.c) this.this$0.l()).getUser();
            Intrinsics.checkExpressionValueIsNotNull(user, "item.user");
            return friendListItemState2.copy(user);
        }
    }

    private final FriendListViewModel o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 46403, new Class[0], FriendListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 46403, new Class[0], FriendListViewModel.class);
        } else {
            value = this.k.getValue();
        }
        return (FriendListViewModel) value;
    }

    public final FriendListItemViewModel n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 46402, new Class[0], FriendListItemViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 46402, new Class[0], FriendListItemViewModel.class);
        } else {
            value = this.j.getValue();
        }
        return (FriendListItemViewModel) value;
    }

    public final /* synthetic */ void a(ItemWidgetViewHolder itemWidgetViewHolder, Object obj) {
        FriendListItemWidgetViewHolder friendListItemWidgetViewHolder = (FriendListItemWidgetViewHolder) itemWidgetViewHolder;
        com.ss.android.ugc.aweme.friends.adapter.c cVar = (com.ss.android.ugc.aweme.friends.adapter.c) obj;
        if (PatchProxy.isSupport(new Object[]{friendListItemWidgetViewHolder, cVar}, this, g, false, 46404, new Class[]{FriendListItemWidgetViewHolder.class, com.ss.android.ugc.aweme.friends.adapter.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{friendListItemWidgetViewHolder, cVar}, this, g, false, 46404, new Class[]{FriendListItemWidgetViewHolder.class, com.ss.android.ugc.aweme.friends.adapter.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(friendListItemWidgetViewHolder, "$this$onBindViewHolder");
        Intrinsics.checkParameterIsNotNull(cVar, "item");
        User user = cVar.getUser();
        Intrinsics.checkExpressionValueIsNotNull(user, "item.user");
        a(friendListItemWidgetViewHolder, user);
        friendListItemWidgetViewHolder.f48903d.setData(cVar.getUser());
        com.ss.android.ugc.aweme.story.api.b.b bVar = friendListItemWidgetViewHolder.m;
        if (bVar != null) {
            User user2 = cVar.getUser();
            Intrinsics.checkExpressionValueIsNotNull(user2, AllStoryActivity.f73306b);
            bVar.a(user2, false, user2.getUid());
        }
        friendListItemWidgetViewHolder.itemView.setOnClickListener(new d(friendListItemWidgetViewHolder, cVar));
        friendListItemWidgetViewHolder.f48903d.setOnClickListener(new e(this, friendListItemWidgetViewHolder, cVar));
        friendListItemWidgetViewHolder.i.setOnClickListener(new f(this, friendListItemWidgetViewHolder, cVar));
    }

    public final void a(@NotNull FriendListItemWidgetViewHolder friendListItemWidgetViewHolder, User user) {
        FriendListItemWidgetViewHolder friendListItemWidgetViewHolder2 = friendListItemWidgetViewHolder;
        if (PatchProxy.isSupport(new Object[]{friendListItemWidgetViewHolder2, user}, this, g, false, 46407, new Class[]{FriendListItemWidgetViewHolder.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{friendListItemWidgetViewHolder2, user}, this, g, false, 46407, new Class[]{FriendListItemWidgetViewHolder.class, User.class}, Void.TYPE);
            return;
        }
        CharSequence signature = user.getSignature();
        if (TextUtils.isEmpty(signature)) {
            friendListItemWidgetViewHolder2.g.setVisibility(8);
        } else {
            friendListItemWidgetViewHolder2.g.setText(signature);
            friendListItemWidgetViewHolder2.g.setVisibility(0);
        }
        CharSequence remarkName = user.getRemarkName();
        if (TextUtils.isEmpty(remarkName)) {
            friendListItemWidgetViewHolder2.f48904e.setText(user.getNickname());
            friendListItemWidgetViewHolder2.f48903d.setContentDescription(user.getNickname());
            View view = friendListItemWidgetViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            view.setContentDescription(user.getNickname());
        } else {
            friendListItemWidgetViewHolder2.f48904e.setText(remarkName);
            friendListItemWidgetViewHolder2.f48903d.setContentDescription(remarkName);
            View view2 = friendListItemWidgetViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            view2.setContentDescription(remarkName);
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        User user2 = ((com.ss.android.ugc.aweme.friends.adapter.c) l()).getUser();
        Intrinsics.checkExpressionValueIsNotNull(user2, "item.user");
        int updateTagCount = a2.getUpdateTagCount(user2.getUid());
        if (updateTagCount > 0) {
            DmtTextView dmtTextView = friendListItemWidgetViewHolder2.f48905f;
            String b2 = o.b(C0906R.string.aia);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtils.getString(R.string.friend_update_count)");
            String format = String.format(b2, Arrays.copyOf(new Object[]{Integer.valueOf(updateTagCount)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            dmtTextView.setText(format);
            friendListItemWidgetViewHolder2.f48905f.setVisibility(0);
            return;
        }
        friendListItemWidgetViewHolder2.f48905f.setVisibility(8);
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, g, false, 46408, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, g, false, 46408, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        r.a(str3, (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "friends_list").a("to_user_id", str4).f34114b);
    }

    public final /* bridge */ /* synthetic */ ViewModelProvider.Factory r_() {
        return this.i;
    }

    @NotNull
    public final k a() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 46409, new Class[0], k.class)) {
            return h.a.a(this);
        }
        return (k) PatchProxy.accessDispatch(new Object[0], this, g, false, 46409, new Class[0], k.class);
    }

    @NotNull
    public final com.bytedance.jedi.arch.r<com.bytedance.jedi.arch.f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 46412, new Class[0], com.bytedance.jedi.arch.r.class)) {
            return h.a.b(this);
        }
        return (com.bytedance.jedi.arch.r) PatchProxy.accessDispatch(new Object[0], this, g, false, 46412, new Class[0], com.bytedance.jedi.arch.r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 46413, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 46413, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, g, false, 46410, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, g, false, 46410, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        com.bytedance.jedi.arch.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 46411, new Class[0], com.bytedance.jedi.arch.f.class)) {
            fVar = (com.bytedance.jedi.arch.f) PatchProxy.accessDispatch(new Object[0], this, g, false, 46411, new Class[0], com.bytedance.jedi.arch.f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    public FriendListItemWidget() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FriendListItemViewModel.class);
        b bVar = new b(this, orCreateKotlinClass, new i(this), this, orCreateKotlinClass);
        this.j = new lifecycleAwareLazy(this, bVar);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(FriendListViewModel.class);
        this.k = LazyKt.lazy(new a(this, orCreateKotlinClass2, orCreateKotlinClass2));
    }

    public final void aj_() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 46405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 46405, new Class[0], Void.TYPE);
            return;
        }
        super.aj_();
        FriendListItemViewModel n = n();
        if (PatchProxy.isSupport(new Object[0], n, FriendListItemViewModel.f48886d, false, 46397, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], n, FriendListItemViewModel.f48886d, false, 46397, new Class[0], Void.TYPE);
        } else {
            n.b(new FriendListItemViewModel.a(n));
        }
        Disposable unused = a(n(), b.INSTANCE, c(), false, new g(this));
        Disposable unused2 = a(o(), c.INSTANCE, c(), false, new h(this));
    }

    public final /* synthetic */ void a(ItemWidgetViewHolder itemWidgetViewHolder) {
        FriendListItemWidgetViewHolder friendListItemWidgetViewHolder = (FriendListItemWidgetViewHolder) itemWidgetViewHolder;
        if (PatchProxy.isSupport(new Object[]{friendListItemWidgetViewHolder}, this, g, false, 46406, new Class[]{FriendListItemWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{friendListItemWidgetViewHolder}, this, g, false, 46406, new Class[]{FriendListItemWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(friendListItemWidgetViewHolder, "holder");
        super.a(friendListItemWidgetViewHolder);
        JediViewModel o = o();
        JediViewModel n = n();
        Function2 cVar = new c(friendListItemWidgetViewHolder);
        if (PatchProxy.isSupport(new Object[]{o, n, cVar}, this, g, false, 46415, new Class[]{JediViewModel.class, JediViewModel.class, Function2.class}, Object.class)) {
            Object accessDispatch = PatchProxy.accessDispatch(new Object[]{o, n, cVar}, this, g, false, 46415, new Class[]{JediViewModel.class, JediViewModel.class, Function2.class}, Object.class);
        } else {
            Intrinsics.checkParameterIsNotNull(o, "viewModel1");
            Intrinsics.checkParameterIsNotNull(n, "viewModel2");
            Intrinsics.checkParameterIsNotNull(cVar, "block");
            h.a.a(this, o, n, cVar);
        }
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, g, false, 46414, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, g, false, 46414, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, g, false, 46430, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, g, false, 46430, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, g, false, 46425, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, g, false, 46425, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
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
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, g, false, 46424, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, g, false, 46424, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
