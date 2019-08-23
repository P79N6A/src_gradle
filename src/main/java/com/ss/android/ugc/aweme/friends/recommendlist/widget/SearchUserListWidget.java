package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.widget.Widget;
import com.bytedance.widget.ext.list.ItemWidget;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.bytedance.widget.ext.list.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidget;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.ay;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Arrays;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0014\u0010\u0018\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0003H\u0002J\f\u0010\u001a\u001a\u00020\u0014*\u00020\u0003H\u0002J\u0014\u0010\u001b\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/SearchUserListWidget;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidget;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/SearchUserWidgetViewHolder;", "()V", "mIsDouYin", "", "mSearchUserListViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;", "getMSearchUserListViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;", "mSearchUserListViewModel$delegate", "Lkotlin/Lazy;", "mSearchUserViewModel", "Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "getMSearchUserViewModel", "()Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "mSearchUserViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "onCreate", "", "bind", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "displayLiveStatus", "enterUserProfile", "initListener", "onBindViewHolder", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserListWidget extends JediBaseItemWidget<SearchUser, SearchUserWidgetViewHolder> {
    public static ChangeQuickRedirect i;
    static final /* synthetic */ KProperty[] j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchUserListWidget.class), "mSearchUserViewModel", "getMSearchUserViewModel()Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SearchUserListWidget.class), "mSearchUserListViewModel", "getMSearchUserListViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;"))};
    private final boolean k = (!com.ss.android.g.a.a());
    private final lifecycleAwareLazy l;
    private final Lazy m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/LegeciesKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<SearchUserListViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r7 = com.bytedance.jedi.arch.JediViewModel.class
                r4 = 0
                r5 = 46993(0xb791, float:6.5851E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 46993(0xb791, float:6.5851E-41)
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.SearchUserListWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u001c\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/ext/list/ItemWidget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/widget/ext/list/ExtensionsKt$listViewModel$3"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<UserViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.user.repository.UserViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.user.repository.UserViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final UserViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46994, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46994, new Class[0], JediViewModel.class);
            }
            com.bytedance.widget.ext.list.a a2 = a.C0243a.a(((ae) this.$this_listViewModel).r_(), this.$this_listViewModel.m());
            ? r0 = (JediViewModel) a2.a(this.$this_listViewModel$inlined.getClass().getName() + '_' + kotlin.jvm.a.a(this.$viewModelClass$inlined).getName(), kotlin.jvm.a.a(this.$viewModelClass));
            n a3 = r0.f2282c.a(UserViewModel.class);
            if (a3 != null) {
                a3.binding(r0);
            }
            r0.a(this.$argumentsAcceptor);
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<SearchUserListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchUserWidgetViewHolder $this_displayLiveStatus;
        final /* synthetic */ User $user;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchUserWidgetViewHolder searchUserWidgetViewHolder, User user) {
            super(1);
            this.$this_displayLiveStatus = searchUserWidgetViewHolder;
            this.$user = user;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchUserListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46995, new Class[]{SearchUserListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46995, new Class[]{SearchUserListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, AdvanceSetting.NETWORK_TYPE);
            if (!this.$user.isLive() || !com.ss.android.ugc.aweme.story.a.a()) {
                this.$this_displayLiveStatus.f49130d.a(false);
                this.$this_displayLiveStatus.f49131e.setVisibility(8);
                return;
            }
            com.ss.android.ugc.aweme.story.live.b.a(this.$user.getUid(), this.$user.roomId, searchUserListState.getEnterFrom(), "video_head", this.$user.getRequestId(), -1, com.ss.android.g.a.b(), "");
            this.$this_displayLiveStatus.f49130d.a(true);
            this.$this_displayLiveStatus.f49131e.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "searchUserState", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "searchUserListState", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<UserState, SearchUserListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchUserWidgetViewHolder $this_enterUserProfile;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchUserWidgetViewHolder searchUserWidgetViewHolder) {
            super(2);
            this.$this_enterUserProfile = searchUserWidgetViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((UserState) obj, (SearchUserListState) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull UserState userState, @NotNull SearchUserListState searchUserListState) {
            UserState userState2 = userState;
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{userState2, searchUserListState2}, this, changeQuickRedirect, false, 46996, new Class[]{UserState.class, SearchUserListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userState2, searchUserListState2}, this, changeQuickRedirect, false, 46996, new Class[]{UserState.class, SearchUserListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userState, "searchUserState");
            Intrinsics.checkParameterIsNotNull(searchUserListState2, "searchUserListState");
            User user = userState.getUser();
            if (user != null) {
                if (user.isLive()) {
                    View view = this.$this_enterUserProfile.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    com.ss.android.ugc.aweme.story.live.f.a(view.getContext(), user, searchUserListState.getEnterFrom());
                    return;
                }
                k.a(this.$this_enterUserProfile.getAdapterPosition(), searchUserListState.getSearchKeyWord(), 0, user.getRequestId(), user.getUid(), k.a(searchUserListState.getSearchKeyWord()));
                View view2 = this.$this_enterUserProfile.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                UserProfileActivity.a(view2.getContext(), user, "find_friends", "", "main_head");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchUserListWidget f49124b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SearchUserWidgetViewHolder f49125c;

        e(SearchUserListWidget searchUserListWidget, SearchUserWidgetViewHolder searchUserWidgetViewHolder) {
            this.f49124b = searchUserListWidget;
            this.f49125c = searchUserWidgetViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49123a, false, 46997, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49123a, false, 46997, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            SearchUserListWidget searchUserListWidget = this.f49124b;
            SearchUserWidgetViewHolder searchUserWidgetViewHolder = this.f49125c;
            if (PatchProxy.isSupport(new Object[]{searchUserWidgetViewHolder}, searchUserListWidget, SearchUserListWidget.i, false, 46992, new Class[]{SearchUserWidgetViewHolder.class}, Void.TYPE)) {
                Object[] objArr = {searchUserWidgetViewHolder};
                SearchUserListWidget searchUserListWidget2 = searchUserListWidget;
                ChangeQuickRedirect changeQuickRedirect = SearchUserListWidget.i;
                PatchProxy.accessDispatch(objArr, searchUserListWidget2, changeQuickRedirect, false, 46992, new Class[]{SearchUserWidgetViewHolder.class}, Void.TYPE);
                return;
            }
            searchUserListWidget.a(searchUserListWidget.n(), searchUserListWidget.o(), new d(searchUserWidgetViewHolder));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49126a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchUserListWidget f49127b;

        f(SearchUserListWidget searchUserListWidget) {
            this.f49127b = searchUserListWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49126a, false, 46998, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49126a, false, 46998, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49127b.a(this.f49127b.n(), new Function1<UserState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ f this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((UserState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull UserState userState) {
                    UserState userState2 = userState;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 46999, new Class[]{UserState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 46999, new Class[]{UserState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(userState2, AdvanceSetting.NETWORK_TYPE);
                    if (userState.getUser().getFollowStatus() == 0) {
                        i = 1;
                    }
                    UserViewModel n = this.this$0.f49127b.n();
                    com.ss.android.ugc.aweme.profile.presenter.h a2 = new i.a().a(userState.getUser().getUid()).b(userState.getUser().getSecUid()).a(i).c("search_result").b(14).a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "FollowPresenter.FollowPa…                 .build()");
                    n.a(a2);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<UserState, UserState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchUserListWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SearchUserListWidget searchUserListWidget) {
            super(1);
            this.this$0 = searchUserListWidget;
        }

        @NotNull
        public final UserState invoke(@NotNull UserState userState) {
            UserState userState2 = userState;
            if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 47000, new Class[]{UserState.class}, UserState.class)) {
                return (UserState) PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 47000, new Class[]{UserState.class}, UserState.class);
            }
            Intrinsics.checkParameterIsNotNull(userState2, "$receiver");
            User user = ((SearchUser) this.this$0.l()).user;
            Intrinsics.checkExpressionValueIsNotNull(user, "item.user");
            return UserState.copy$default(userState, user, false, null, null, 14, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<User, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchUserListWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SearchUserListWidget searchUserListWidget) {
            super(1);
            this.this$0 = searchUserListWidget;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((User) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull User user) {
            if (PatchProxy.isSupport(new Object[]{user}, this, changeQuickRedirect, false, 47001, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user}, this, changeQuickRedirect, false, 47001, new Class[]{User.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(user, AdvanceSetting.NETWORK_TYPE);
            SearchUserWidgetViewHolder searchUserWidgetViewHolder = (SearchUserWidgetViewHolder) this.this$0.f2338f;
            if (searchUserWidgetViewHolder != null) {
                this.this$0.a(searchUserWidgetViewHolder, user);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/friends/recommendlist/widget/SearchUserListWidget$onCreate$2", "Lcom/ss/android/ugc/aweme/base/arch/JediAsyncListener;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "onError", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i implements com.ss.android.ugc.aweme.base.arch.a<FollowStatus> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchUserListWidget f49129b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<UserState, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ SearchUserWidgetViewHolder $this_apply;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(SearchUserWidgetViewHolder searchUserWidgetViewHolder) {
                super(1);
                this.$this_apply = searchUserWidgetViewHolder;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull UserState userState) {
                UserState userState2 = userState;
                if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 47005, new Class[]{UserState.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 47005, new Class[]{UserState.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(userState2, AdvanceSetting.NETWORK_TYPE);
                if (userState.getFollowStatus() instanceof com.bytedance.jedi.arch.c) {
                    Throwable th = ((com.bytedance.jedi.arch.c) userState.getFollowStatus()).f21347a;
                    View view = this.$this_apply.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    com.ss.android.ugc.aweme.app.api.a.a.a(view.getContext(), th, C0906R.string.afx);
                }
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f49128a, false, 47003, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49128a, false, 47003, new Class[0], Void.TYPE);
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f49128a, false, 47002, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49128a, false, 47002, new Class[0], Void.TYPE);
                return;
            }
            SearchUserWidgetViewHolder searchUserWidgetViewHolder = (SearchUserWidgetViewHolder) this.f49129b.f2338f;
            if (searchUserWidgetViewHolder != null) {
                this.f49129b.a(this.f49129b.n(), new a(searchUserWidgetViewHolder));
            }
        }

        i(SearchUserListWidget searchUserListWidget) {
            this.f49129b = searchUserListWidget;
        }

        public final /* synthetic */ void a(Object obj) {
            FollowStatus followStatus = (FollowStatus) obj;
            if (PatchProxy.isSupport(new Object[]{followStatus}, this, f49128a, false, 47004, new Class[]{FollowStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followStatus}, this, f49128a, false, 47004, new Class[]{FollowStatus.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(followStatus, "data");
        }
    }

    public final UserViewModel n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46985, new Class[0], UserViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46985, new Class[0], UserViewModel.class);
        } else {
            value = this.l.getValue();
        }
        return (UserViewModel) value;
    }

    /* access modifiers changed from: package-private */
    public final SearchUserListViewModel o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46986, new Class[0], SearchUserListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46986, new Class[0], SearchUserListViewModel.class);
        } else {
            value = this.m.getValue();
        }
        return (SearchUserListViewModel) value;
    }

    public final void aj_() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46987, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 46987, new Class[0], Void.TYPE);
            return;
        }
        super.aj_();
        n().a(new h(this), new i(this), null);
    }

    public SearchUserListWidget() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserViewModel.class);
        b bVar = new b(this, orCreateKotlinClass, new g(this), this, orCreateKotlinClass);
        this.l = new lifecycleAwareLazy(this, bVar);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SearchUserListViewModel.class);
        this.m = LazyKt.lazy(new a(this, orCreateKotlinClass2, orCreateKotlinClass2));
    }

    private final void a(@NotNull SearchUserWidgetViewHolder searchUserWidgetViewHolder) {
        if (PatchProxy.isSupport(new Object[]{searchUserWidgetViewHolder}, this, i, false, 46988, new Class[]{SearchUserWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchUserWidgetViewHolder}, this, i, false, 46988, new Class[]{SearchUserWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        searchUserWidgetViewHolder.itemView.setOnClickListener(new e(this, searchUserWidgetViewHolder));
        searchUserWidgetViewHolder.f49132f.setOnClickListener(new f(this));
    }

    private final void b(@NotNull SearchUserWidgetViewHolder searchUserWidgetViewHolder, User user) {
        SearchUserWidgetViewHolder searchUserWidgetViewHolder2 = searchUserWidgetViewHolder;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{searchUserWidgetViewHolder2, user2}, this, i, false, 46991, new Class[]{SearchUserWidgetViewHolder.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchUserWidgetViewHolder2, user2}, this, i, false, 46991, new Class[]{SearchUserWidgetViewHolder.class, User.class}, Void.TYPE);
            return;
        }
        a(o(), new c(searchUserWidgetViewHolder2, user2));
    }

    public final /* synthetic */ void a(ItemWidgetViewHolder itemWidgetViewHolder, Object obj) {
        SearchUserWidgetViewHolder searchUserWidgetViewHolder = (SearchUserWidgetViewHolder) itemWidgetViewHolder;
        SearchUser searchUser = (SearchUser) obj;
        if (PatchProxy.isSupport(new Object[]{searchUserWidgetViewHolder, searchUser}, this, i, false, 46989, new Class[]{SearchUserWidgetViewHolder.class, SearchUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchUserWidgetViewHolder, searchUser}, this, i, false, 46989, new Class[]{SearchUserWidgetViewHolder.class, SearchUser.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchUserWidgetViewHolder, "$this$onBindViewHolder");
        Intrinsics.checkParameterIsNotNull(searchUser, "item");
        User user = searchUser.user;
        Intrinsics.checkExpressionValueIsNotNull(user, "item.user");
        a(searchUserWidgetViewHolder, user);
    }

    public final void a(@NotNull SearchUserWidgetViewHolder searchUserWidgetViewHolder, User user) {
        CharSequence charSequence;
        String str;
        SearchUserWidgetViewHolder searchUserWidgetViewHolder2 = searchUserWidgetViewHolder;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{searchUserWidgetViewHolder2, user2}, this, i, false, 46990, new Class[]{SearchUserWidgetViewHolder.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchUserWidgetViewHolder2, user2}, this, i, false, 46990, new Class[]{SearchUserWidgetViewHolder.class, User.class}, Void.TYPE);
            return;
        }
        a(searchUserWidgetViewHolder);
        SearchUser searchUser = (SearchUser) l();
        TextView textView = searchUserWidgetViewHolder2.g;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            charSequence = com.ss.android.ugc.aweme.base.utils.a.a(searchUserWidgetViewHolder2.f49130d.getContext(), user.getRemarkName(), searchUser.remarkPosition);
        } else {
            charSequence = com.ss.android.ugc.aweme.base.utils.a.a(searchUserWidgetViewHolder2.f49130d.getContext(), user.getNickname(), searchUser.position);
        }
        textView.setText(charSequence);
        if (TextUtils.isEmpty(user.getUniqueId())) {
            str = user.getShortId();
        } else {
            str = user.getUniqueId();
        }
        View view = searchUserWidgetViewHolder2.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        String a2 = ay.a(view.getContext());
        Intrinsics.checkExpressionValueIsNotNull(a2, "format");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) a2, "%1", 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            indexOf$default = 0;
        }
        String format = String.format(a2, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        searchUserWidgetViewHolder2.h.setText(com.ss.android.ugc.aweme.base.utils.a.a(searchUserWidgetViewHolder2.f49130d.getContext(), format, searchUser.uniqidPosition, indexOf$default));
        View view2 = searchUserWidgetViewHolder2.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        String b2 = ay.b(view2.getContext());
        TextView textView2 = searchUserWidgetViewHolder2.i;
        Intrinsics.checkExpressionValueIsNotNull(b2, "fans");
        String format2 = String.format(b2, Arrays.copyOf(new Object[]{com.ss.android.ugc.aweme.i18n.b.a((long) user.getFollowerCount())}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(format, *args)");
        textView2.setText(format2);
        searchUserWidgetViewHolder2.f49130d.setData(user2);
        searchUserWidgetViewHolder2.j.setVisibility(0);
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            searchUserWidgetViewHolder2.j.setText(spannableStringBuilder.append(new SpannableString(v.c(searchUserWidgetViewHolder2.itemView).getString(C0906R.string.agn))).append(com.ss.android.ugc.aweme.base.utils.a.a(searchUserWidgetViewHolder2.f49130d.getContext(), user.getNickname(), searchUser.position)));
        } else if (!TextUtils.isEmpty(user.getSignature())) {
            searchUserWidgetViewHolder2.j.setText(user.getSignature());
        } else if (this.k) {
            searchUserWidgetViewHolder2.j.setVisibility(8);
        } else {
            searchUserWidgetViewHolder2.j.setText(C0906R.string.c8g);
        }
        if (ex.b()) {
            searchUserWidgetViewHolder2.f49132f.setVisibility(8);
        }
        searchUserWidgetViewHolder2.f49132f.a(user.getFollowStatus(), user.getFollowerStatus());
        b(searchUserWidgetViewHolder, user);
    }
}
