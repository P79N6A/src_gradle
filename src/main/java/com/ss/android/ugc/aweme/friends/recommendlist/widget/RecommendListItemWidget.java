package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
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
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidget;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeAdapter;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.recommendlist.adapter.RecommendListWidgetAdapter;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel;
import com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListWidgetViewHolder;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
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
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0014\u0010\u0016\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0003H\u0002J\u0014\u0010\u001a\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0014J\u001c\u0010\u001c\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\f\u0010 \u001a\u00020\u0014*\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendListItemWidget;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidget;", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendListWidgetViewHolder;", "()V", "actionShow", "", "mRecommendListViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "getMRecommendListViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "mRecommendListViewModel$delegate", "Lkotlin/Lazy;", "mRecommendUserViewModel", "Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "getMRecommendUserViewModel", "()Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "mRecommendUserViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "notifyHideRecommendMask", "", "onCreate", "bind", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "initListener", "onBindViewHolder", "item", "onViewEvent", "actionId", "enterMethod", "", "showNewFriendRecommendMask", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendListItemWidget extends JediBaseItemWidget<com.ss.android.ugc.aweme.user.repository.l, RecommendListWidgetViewHolder> {
    public static ChangeQuickRedirect i;
    static final /* synthetic */ KProperty[] j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecommendListItemWidget.class), "mRecommendUserViewModel", "getMRecommendUserViewModel()Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RecommendListItemWidget.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;"))};
    public final int k;
    private final lifecycleAwareLazy l;
    private final Lazy m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/LegeciesKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<RecommendListViewModel> {
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

        /* JADX WARNING: type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v14, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r7 = com.bytedance.jedi.arch.JediViewModel.class
                r4 = 0
                r5 = 46943(0xb75f, float:6.5781E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 46943(0xb75f, float:6.5781E-41)
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.widget.RecommendListItemWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
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
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46944, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46944, new Class[0], JediViewModel.class);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "aid", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onRecommendAwemeItemClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements RecommendAwemeViewHolder.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListItemWidget f49085b;

        c(RecommendListItemWidget recommendListItemWidget) {
            this.f49085b = recommendListItemWidget;
        }

        public final void a(String str, int i) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f49084a, false, 46945, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f49084a, false, 46945, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            a2.a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + str2).a("refer", "find_friends").a());
            this.f49085b.p();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendAwemeAdapter $adapter;
        final /* synthetic */ RecommendListItemWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(RecommendListItemWidget recommendListItemWidget, RecommendAwemeAdapter recommendAwemeAdapter) {
            super(1);
            this.this$0 = recommendListItemWidget;
            this.$adapter = recommendAwemeAdapter;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46946, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46946, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState, AdvanceSetting.NETWORK_TYPE);
            RecommendAwemeAdapter recommendAwemeAdapter = this.$adapter;
            Integer num = recommendListState.getAdapterPositionMap().get(((com.ss.android.ugc.aweme.user.repository.l) this.this$0.l()).f75398b.getUid());
            if (num != null) {
                i = num.intValue();
            }
            recommendAwemeAdapter.f48745b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListItemWidget f49087b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecommendListWidgetViewHolder f49088c;

        e(RecommendListItemWidget recommendListItemWidget, RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
            this.f49087b = recommendListItemWidget;
            this.f49088c = recommendListWidgetViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49086a, false, 46947, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49086a, false, 46947, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49087b.a(this.f49088c, BaseLoginOrRegisterActivity.o, "click_head");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49089a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListItemWidget f49090b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecommendListWidgetViewHolder f49091c;

        f(RecommendListItemWidget recommendListItemWidget, RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
            this.f49090b = recommendListItemWidget;
            this.f49091c = recommendListWidgetViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49089a, false, 46948, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49089a, false, 46948, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49090b.a(this.f49091c, 100, "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListItemWidget f49093b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecommendListWidgetViewHolder f49094c;

        g(RecommendListItemWidget recommendListItemWidget, RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
            this.f49093b = recommendListItemWidget;
            this.f49094c = recommendListWidgetViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49092a, false, 46949, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49092a, false, 46949, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49093b.a(this.f49094c, 102, "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListItemWidget f49096b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecommendListWidgetViewHolder f49097c;

        h(RecommendListItemWidget recommendListItemWidget, RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
            this.f49096b = recommendListItemWidget;
            this.f49097c = recommendListWidgetViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49095a, false, 46950, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49095a, false, 46950, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49096b.a(this.f49097c, BaseLoginOrRegisterActivity.o, "click_name");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<UserState, UserState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListItemWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(RecommendListItemWidget recommendListItemWidget) {
            super(1);
            this.this$0 = recommendListItemWidget;
        }

        @NotNull
        public final UserState invoke(@NotNull UserState userState) {
            UserState userState2 = userState;
            if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 46951, new Class[]{UserState.class}, UserState.class)) {
                return (UserState) PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 46951, new Class[]{UserState.class}, UserState.class);
            }
            Intrinsics.checkParameterIsNotNull(userState2, "$receiver");
            return UserState.copy$default(userState, ((com.ss.android.ugc.aweme.user.repository.l) this.this$0.l()).f75398b, false, null, null, 14, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<User, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListItemWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(RecommendListItemWidget recommendListItemWidget) {
            super(1);
            this.this$0 = recommendListItemWidget;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((User) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull User user) {
            if (PatchProxy.isSupport(new Object[]{user}, this, changeQuickRedirect, false, 46952, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user}, this, changeQuickRedirect, false, 46952, new Class[]{User.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(user, AdvanceSetting.NETWORK_TYPE);
            RecommendListWidgetViewHolder recommendListWidgetViewHolder = (RecommendListWidgetViewHolder) this.this$0.f2338f;
            if (recommendListWidgetViewHolder != null) {
                this.this$0.a(recommendListWidgetViewHolder, user);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendListItemWidget$onCreate$2", "Lcom/ss/android/ugc/aweme/base/arch/JediAsyncListener;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "onError", "", "onSuccess", "data", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class k implements com.ss.android.ugc.aweme.base.arch.a<FollowStatus> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendListItemWidget f49099b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<UserState, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ RecommendListWidgetViewHolder $this_apply;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
                super(1);
                this.$this_apply = recommendListWidgetViewHolder;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull UserState userState) {
                UserState userState2 = userState;
                if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 46956, new Class[]{UserState.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 46956, new Class[]{UserState.class}, Void.TYPE);
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
            if (PatchProxy.isSupport(new Object[0], this, f49098a, false, 46955, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49098a, false, 46955, new Class[0], Void.TYPE);
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f49098a, false, 46953, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f49098a, false, 46953, new Class[0], Void.TYPE);
                return;
            }
            RecommendListWidgetViewHolder recommendListWidgetViewHolder = (RecommendListWidgetViewHolder) this.f49099b.f2338f;
            if (recommendListWidgetViewHolder != null) {
                this.f49099b.a(this.f49099b.n(), new a(recommendListWidgetViewHolder));
            }
        }

        k(RecommendListItemWidget recommendListItemWidget) {
            this.f49099b = recommendListItemWidget;
        }

        public final /* synthetic */ void a(Object obj) {
            FollowStatus followStatus = (FollowStatus) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{followStatus}, this, f49098a, false, 46954, new Class[]{FollowStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followStatus}, this, f49098a, false, 46954, new Class[]{FollowStatus.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(followStatus, "data");
            RecommendListWidgetViewHolder recommendListWidgetViewHolder = (RecommendListWidgetViewHolder) this.f49099b.f2338f;
            if (recommendListWidgetViewHolder != null) {
                if (PatchProxy.isSupport(new Object[]{followStatus}, recommendListWidgetViewHolder, RecommendListWidgetViewHolder.f49100d, false, 46967, new Class[]{FollowStatus.class}, Void.TYPE)) {
                    RecommendListWidgetViewHolder recommendListWidgetViewHolder2 = recommendListWidgetViewHolder;
                    PatchProxy.accessDispatch(new Object[]{followStatus}, recommendListWidgetViewHolder2, RecommendListWidgetViewHolder.f49100d, false, 46967, new Class[]{FollowStatus.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(followStatus, "followStatus");
                    View view = recommendListWidgetViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    Context context = view.getContext();
                    if (context != null) {
                        User user = recommendListWidgetViewHolder.f49101e;
                        if (user != null) {
                            if (com.ss.android.ugc.aweme.profile.d.i.a(context, user, followStatus)) {
                                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(context);
                                remarkEditDialog.g = user;
                                remarkEditDialog.h = followStatus.contactName;
                                remarkEditDialog.i = 1;
                                remarkEditDialog.f63095f = new RecommendListWidgetViewHolder.a(recommendListWidgetViewHolder, user);
                                remarkEditDialog.show();
                            }
                            if (followStatus.followStatus == 0) {
                                CharSequence remarkName = user.getRemarkName();
                                if (!(remarkName == null || remarkName.length() == 0)) {
                                    z = false;
                                }
                                if (!z) {
                                    user.setRemarkName("");
                                    recommendListWidgetViewHolder.b(user);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "userListState", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "userState", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<RecommendListState, UserState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $actionId;
        final /* synthetic */ String $enterMethod;
        final /* synthetic */ RecommendListWidgetViewHolder $this_onViewEvent;
        final /* synthetic */ RecommendListItemWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(RecommendListItemWidget recommendListItemWidget, RecommendListWidgetViewHolder recommendListWidgetViewHolder, int i, String str) {
            super(2);
            this.this$0 = recommendListItemWidget;
            this.$this_onViewEvent = recommendListWidgetViewHolder;
            this.$actionId = i;
            this.$enterMethod = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RecommendListState) obj, (UserState) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState, @NotNull UserState userState) {
            boolean z;
            boolean z2;
            String str;
            String str2;
            int i;
            String str3;
            String str4;
            RecommendListState recommendListState2 = recommendListState;
            UserState userState2 = userState;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{recommendListState2, userState2}, this, changeQuickRedirect, false, 46957, new Class[]{RecommendListState.class, UserState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState2, userState2}, this, changeQuickRedirect, false, 46957, new Class[]{RecommendListState.class, UserState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "userListState");
            Intrinsics.checkParameterIsNotNull(userState2, "userState");
            String str5 = ((com.ss.android.ugc.aweme.user.repository.l) this.this$0.l()).f75399c;
            User user = userState.getUser();
            if (((com.ss.android.ugc.aweme.user.repository.l) this.this$0.l()).f75400d == 0) {
                z = true;
            } else {
                z = false;
            }
            if (((com.ss.android.ugc.aweme.user.repository.l) this.this$0.l()).f75400d == RecommendListWidgetAdapter.a.a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            Integer num = recommendListState.getAdapterPositionMap().get(user.getUid());
            switch (recommendListState.getRecommendUserType()) {
                case 5:
                    str = "following";
                    break;
                case 6:
                    str = "fans";
                    break;
                default:
                    str = "personal_homepage";
                    break;
            }
            if (z) {
                str2 = "recent_fans";
            } else if (z2) {
                str2 = "new";
            } else {
                str2 = "past";
            }
            int i3 = this.$actionId;
            if (i3 == this.this$0.k) {
                com.ss.android.ugc.aweme.newfollow.util.k.a().a(3, user.getUid());
                RecommendListViewModel o = this.this$0.o();
                com.ss.android.ugc.aweme.newfollow.util.k a2 = com.ss.android.ugc.aweme.newfollow.util.k.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "RecUserImpressionReporter.getInstance()");
                String b2 = a2.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "RecUserImpressionReporte…getInstance().toReportIds");
                if (PatchProxy.isSupport(new Object[]{b2}, o, RecommendListViewModel.f49017d, false, 46817, new Class[]{String.class}, Void.TYPE)) {
                    RecommendListViewModel recommendListViewModel = o;
                    PatchProxy.accessDispatch(new Object[]{b2}, recommendListViewModel, RecommendListViewModel.f49017d, false, 46817, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(b2, "reportId");
                    if (!TextUtils.isEmpty(b2)) {
                        o.c(new RecommendListViewModel.n(b2));
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("rec_uid", user.getUid());
                    jSONObject.put("enter_from", "find_friends");
                    jSONObject.put("previous_page", str);
                    jSONObject.put("event_type", "impression");
                    jSONObject.put("impr_order", num);
                    jSONObject.put("req_id", str5);
                    jSONObject.put("is_direct", 1);
                    jSONObject.put("trigger_reason", "friend_rec_message");
                    jSONObject.put("rec_reason", user.getRecommendReason());
                    jSONObject.put("card_type", str2);
                } catch (JSONException unused) {
                }
                r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject));
                r.a("follow_card", jSONObject);
            } else if (i3 == 101) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("group_id", "");
                    jSONObject2.put("request_id", str5);
                    jSONObject2.put("enter_from", "invite_friend");
                    jSONObject2.put("enter_method", "click_head");
                    jSONObject2.put("enter_type", "normal_way");
                } catch (Exception unused2) {
                }
                r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject2));
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("rec_uid", user.getUid());
                    jSONObject3.put("enter_from", "find_friends");
                    jSONObject3.put("previous_page", str);
                    jSONObject3.put("event_type", "enter_profile");
                    jSONObject3.put("impr_order", num);
                    jSONObject3.put("req_id", str5);
                    jSONObject3.put("trigger_reason", "friend_rec_message");
                    jSONObject3.put("rec_reason", user.getRecommendReason());
                    jSONObject3.put("card_type", str2);
                } catch (Exception unused3) {
                }
                r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject3));
                r.a("follow_card", jSONObject3);
                r.a("enter_personal_detail_backup", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str).a("to_user_id", user.getUid()).a("group_id", "").a("request_id", str5).a("enter_method", "click_card").f34114b);
                ((q) new q().k(user.getUid()).b("find_friends").a(this.$enterMethod)).l(str5).e();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("to_user_id", user.getUid());
                    jSONObject4.put("request_id", str5);
                } catch (Exception unused4) {
                }
                if (Intrinsics.areEqual((Object) "click_name", (Object) this.$enterMethod)) {
                    str4 = "name";
                } else {
                    str4 = "head";
                }
                r.onEvent(MobClick.obtain().setEventName(str4).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject4));
                View view = this.$this_onViewEvent.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                UserProfileActivity.a(view.getContext(), ad.a().a("uid", user.getUid()).a("sec_user_id", user.getSecUid()).a("enter_from", "find_friends").a("enter_from_request_id", str5).a("need_track_compare_recommend_reason", 1).a("previous_recommend_reason", user.getRecommendReason()).a("recommend_from_type", "list").f75487b);
                this.this$0.p();
            } else if (i3 == 100) {
                View view2 = this.$this_onViewEvent.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                if (!NetworkUtils.isNetworkAvailable(view2.getContext())) {
                    View view3 = this.$this_onViewEvent.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
                    com.bytedance.ies.dmt.ui.d.a.b(view3.getContext(), (int) C0906R.string.bgf).a();
                    return;
                }
                if (user.getFollowStatus() != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                int i4 = i ^ 1;
                bg.a(new com.ss.android.ugc.aweme.challenge.a.a(i4, user));
                if (i4 == 0) {
                    r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow_cancel").setValue(user.getUid()));
                } else {
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("request_id", str5);
                    } catch (Exception unused5) {
                    }
                    r.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow").setValue(user.getUid().toString()).setJsonObject(jSONObject5));
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("rec_uid", user.getUid());
                        jSONObject6.put("enter_from", "find_friends");
                        jSONObject6.put("previous_page", str);
                        jSONObject6.put("event_type", "follow");
                        jSONObject6.put("impr_order", num);
                        jSONObject6.put("req_id", str5);
                        jSONObject6.put("trigger_reason", "friend_rec_message");
                        jSONObject6.put("rec_reason", user.getRecommendReason());
                        jSONObject6.put("card_type", str2);
                    } catch (Exception unused6) {
                    }
                    r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject6));
                    r.a("follow_card", jSONObject6);
                    r.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(user.getUid().toString()));
                }
                if (i4 == 0) {
                    str3 = "follow_cancel";
                } else {
                    str3 = "follow";
                }
                new s(str3).f(str).g("other_places").b("find_friends").c("follow_button").k(user.getRequestId()).h(user.getUid()).e();
                if (user.getFollowStatus() == 0) {
                    i2 = 1;
                }
                UserViewModel n = this.this$0.n();
                com.ss.android.ugc.aweme.profile.presenter.h a3 = new i.a().a(user.getUid()).b(user.getSecUid()).a(i2).c("find_friends").b(12).a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "FollowPresenter.FollowPa…                 .build()");
                n.a(a3);
            } else {
                if (i3 == 102) {
                    View view4 = this.$this_onViewEvent.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
                    if (!NetworkUtils.isNetworkAvailable(view4.getContext())) {
                        View view5 = this.$this_onViewEvent.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
                        com.bytedance.ies.dmt.ui.d.a.b(view5.getContext(), (int) C0906R.string.bgf).a();
                        return;
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    try {
                        jSONObject7.put("rec_uid", user.getUid());
                        jSONObject7.put("enter_from", "find_friends");
                        jSONObject7.put("previous_page", str);
                        jSONObject7.put("event_type", "delete");
                        jSONObject7.put("impr_order", num);
                        jSONObject7.put("req_id", str5);
                        jSONObject7.put("trigger_reason", "friend_rec_message");
                        jSONObject7.put("rec_reason", user.getRecommendReason());
                        jSONObject7.put("card_type", str2);
                    } catch (Exception unused7) {
                    }
                    r.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject7));
                    r.a("follow_card", jSONObject7);
                    RecommendListViewModel o2 = this.this$0.o();
                    if (PatchProxy.isSupport(new Object[]{user, Byte.valueOf(z ? (byte) 1 : 0)}, o2, RecommendListViewModel.f49017d, false, 46814, new Class[]{User.class, Boolean.TYPE}, Void.TYPE)) {
                        RecommendListViewModel recommendListViewModel2 = o2;
                        PatchProxy.accessDispatch(new Object[]{user, Byte.valueOf(z)}, recommendListViewModel2, RecommendListViewModel.f49017d, false, 46814, new Class[]{User.class, Boolean.TYPE}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
                        o2.b(new RecommendListViewModel.d(o2, z, user));
                    }
                    View view6 = this.$this_onViewEvent.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
                    com.bytedance.ies.dmt.ui.d.a.c(view6.getContext(), (int) C0906R.string.nx).a();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function1<RecommendListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ RecommendListWidgetViewHolder $this_showNewFriendRecommendMask;
        final /* synthetic */ RecommendListItemWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(RecommendListItemWidget recommendListItemWidget, RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
            super(1);
            this.this$0 = recommendListItemWidget;
            this.$this_showNewFriendRecommendMask = recommendListWidgetViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RecommendListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RecommendListState recommendListState) {
            if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46958, new Class[]{RecommendListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 46958, new Class[]{RecommendListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(recommendListState, AdvanceSetting.NETWORK_TYPE);
            if (!((com.ss.android.ugc.aweme.user.repository.l) this.this$0.l()).f75398b.isNewRecommend() || recommendListState.getRecommendUserType() == 5 || recommendListState.getRecommendUserType() == 6) {
                View view = this.$this_showNewFriendRecommendMask.m;
                Intrinsics.checkExpressionValueIsNotNull(view, "viewNewFriendRecommendMask");
                view.setVisibility(8);
                return;
            }
            View view2 = this.$this_showNewFriendRecommendMask.m;
            Intrinsics.checkExpressionValueIsNotNull(view2, "viewNewFriendRecommendMask");
            view2.setVisibility(0);
        }
    }

    public final UserViewModel n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46934, new Class[0], UserViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46934, new Class[0], UserViewModel.class);
        } else {
            value = this.l.getValue();
        }
        return (UserViewModel) value;
    }

    public final RecommendListViewModel o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46935, new Class[0], RecommendListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, i, false, 46935, new Class[0], RecommendListViewModel.class);
        } else {
            value = this.m.getValue();
        }
        return (RecommendListViewModel) value;
    }

    public RecommendListItemWidget() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserViewModel.class);
        b bVar = new b(this, orCreateKotlinClass, new i(this), this, orCreateKotlinClass);
        this.l = new lifecycleAwareLazy(this, bVar);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(RecommendListViewModel.class);
        this.m = LazyKt.lazy(new a(this, orCreateKotlinClass2, orCreateKotlinClass2));
    }

    public final void aj_() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 46936, new Class[0], Void.TYPE);
            return;
        }
        super.aj_();
        n().a(new j(this), new k(this), null);
        RecommendListWidgetViewHolder recommendListWidgetViewHolder = (RecommendListWidgetViewHolder) this.f2338f;
        if (recommendListWidgetViewHolder != null) {
            a(recommendListWidgetViewHolder, this.k, "");
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 46940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 46940, new Class[0], Void.TYPE);
            return;
        }
        if (((com.ss.android.ugc.aweme.user.repository.l) l()).f75400d == RecommendListWidgetAdapter.a.a()) {
            RecommendListViewModel o = o();
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, o, RecommendListViewModel.f49017d, false, 46813, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                RecommendListViewModel recommendListViewModel = o;
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, recommendListViewModel, RecommendListViewModel.f49017d, false, 46813, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            o.c(new RecommendListViewModel.e(true));
        }
    }

    private final void a(@NotNull RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
        if (PatchProxy.isSupport(new Object[]{recommendListWidgetViewHolder}, this, i, false, 46937, new Class[]{RecommendListWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendListWidgetViewHolder}, this, i, false, 46937, new Class[]{RecommendListWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        recommendListWidgetViewHolder.itemView.setOnClickListener(new e(this, recommendListWidgetViewHolder));
        recommendListWidgetViewHolder.i.setOnClickListener(new f(this, recommendListWidgetViewHolder));
        recommendListWidgetViewHolder.l.setOnClickListener(new g(this, recommendListWidgetViewHolder));
        recommendListWidgetViewHolder.f49102f.setOnClickListener(new h(this, recommendListWidgetViewHolder));
    }

    private final void b(@NotNull RecommendListWidgetViewHolder recommendListWidgetViewHolder) {
        if (PatchProxy.isSupport(new Object[]{recommendListWidgetViewHolder}, this, i, false, 46941, new Class[]{RecommendListWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendListWidgetViewHolder}, this, i, false, 46941, new Class[]{RecommendListWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        a(o(), new m(this, recommendListWidgetViewHolder));
    }

    public final /* synthetic */ void a(ItemWidgetViewHolder itemWidgetViewHolder, Object obj) {
        RecommendListWidgetViewHolder recommendListWidgetViewHolder = (RecommendListWidgetViewHolder) itemWidgetViewHolder;
        com.ss.android.ugc.aweme.user.repository.l lVar = (com.ss.android.ugc.aweme.user.repository.l) obj;
        if (PatchProxy.isSupport(new Object[]{recommendListWidgetViewHolder, lVar}, this, i, false, 46938, new Class[]{RecommendListWidgetViewHolder.class, com.ss.android.ugc.aweme.user.repository.l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendListWidgetViewHolder, lVar}, this, i, false, 46938, new Class[]{RecommendListWidgetViewHolder.class, com.ss.android.ugc.aweme.user.repository.l.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recommendListWidgetViewHolder, "$this$onBindViewHolder");
        Intrinsics.checkParameterIsNotNull(lVar, "item");
        a(recommendListWidgetViewHolder, lVar.f75398b);
    }

    public final void a(@NotNull RecommendListWidgetViewHolder recommendListWidgetViewHolder, User user) {
        if (PatchProxy.isSupport(new Object[]{recommendListWidgetViewHolder, user}, this, i, false, 46939, new Class[]{RecommendListWidgetViewHolder.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendListWidgetViewHolder, user}, this, i, false, 46939, new Class[]{RecommendListWidgetViewHolder.class, User.class}, Void.TYPE);
            return;
        }
        recommendListWidgetViewHolder.f49101e = user;
        a(recommendListWidgetViewHolder);
        recommendListWidgetViewHolder.b(user);
        AvatarImageWithVerify avatarImageWithVerify = recommendListWidgetViewHolder.g;
        Intrinsics.checkExpressionValueIsNotNull(avatarImageWithVerify, "ivAvatar");
        avatarImageWithVerify.setData(user);
        recommendListWidgetViewHolder.a(user.getFollowStatus(), user.getFollowerStatus());
        recommendListWidgetViewHolder.a(user, user.getFollowStatus());
        if (!CollectionUtils.isEmpty(user.getRecommendAwemeItems())) {
            RecyclerView recyclerView = recommendListWidgetViewHolder.n;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRecViewRecommendItem");
            recyclerView.setVisibility(0);
            RecommendAwemeAdapter recommendAwemeAdapter = new RecommendAwemeAdapter();
            recommendAwemeAdapter.f48746c = new c(this);
            recommendAwemeAdapter.setData(user.getRecommendAwemeItems());
            a(o(), new d(this, recommendAwemeAdapter));
            RecyclerView recyclerView2 = recommendListWidgetViewHolder.n;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRecViewRecommendItem");
            recyclerView2.setAdapter(recommendAwemeAdapter);
        } else {
            RecyclerView recyclerView3 = recommendListWidgetViewHolder.n;
            Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "mRecViewRecommendItem");
            recyclerView3.setVisibility(8);
        }
        b(recommendListWidgetViewHolder);
        TextView textView = recommendListWidgetViewHolder.j;
        Intrinsics.checkExpressionValueIsNotNull(textView, "txtDesc");
        recommendListWidgetViewHolder.a(user, textView);
        recommendListWidgetViewHolder.a(user);
    }

    public final void a(@NotNull RecommendListWidgetViewHolder recommendListWidgetViewHolder, int i2, String str) {
        RecommendListWidgetViewHolder recommendListWidgetViewHolder2 = recommendListWidgetViewHolder;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{recommendListWidgetViewHolder2, Integer.valueOf(i2), str2}, this, i, false, 46942, new Class[]{RecommendListWidgetViewHolder.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recommendListWidgetViewHolder2, Integer.valueOf(i2), str2}, this, i, false, 46942, new Class[]{RecommendListWidgetViewHolder.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(o(), n(), new l(this, recommendListWidgetViewHolder, i2, str2));
    }
}
