package com.ss.android.ugc.aweme.following.ui.viewholder;

import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter;
import com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.f;
import com.ss.android.ugc.aweme.friends.ui.an;
import com.ss.android.ugc.aweme.newfollow.util.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.h;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.ag;
import com.ss.android.ugc.aweme.u.q;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.ad;
import io.reactivex.disposables.Disposable;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0016J \u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationViewHolder;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewHolder;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/RelationUser;", "recommendView", "Lcom/ss/android/ugc/aweme/friends/ui/RecommendUserItemView;", "(Lcom/ss/android/ugc/aweme/friends/ui/RecommendUserItemView;)V", "mRelationListViewMode", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;", "getMRelationListViewMode", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;", "mRelationListViewMode$delegate", "Lkotlin/Lazy;", "mUserViewModel", "Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "getMUserViewModel", "()Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "bind", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "logEnterPersonalDetailEvent", "logFollowEvent", "logRecommendEvent", "eventType", "", "order", "", "onCreate", "onViewEvent", "actionId", "extra", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationViewHolder extends JediBaseViewHolder<ConnectedRelationViewHolder, f> {
    public static ChangeQuickRedirect g;
    static final /* synthetic */ KProperty[] h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ConnectedRelationViewHolder.class), "mRelationListViewMode", "getMRelationListViewMode()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;"))};
    private final Lazy i;
    private final an j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0003\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/ext/adapter/ExtensionsKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<ConnectedRelationListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r2v13, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r4v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r7 = com.bytedance.jedi.arch.JediViewModel.class
                r4 = 0
                r5 = 45178(0xb07a, float:6.3308E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0028
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 45178(0xb07a, float:6.3308E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r8 = com.bytedance.jedi.arch.JediViewModel.class
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            L_0x0028:
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r9.$this_hostViewModel
                android.arch.lifecycle.LifecycleOwner r0 = r0.k()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.a.a(r0)
                kotlin.reflect.KClass r1 = r9.$viewModelClass$inlined
                java.lang.Class r1 = kotlin.jvm.a.a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                r2 = 0
                boolean r3 = r0 instanceof android.support.v4.app.Fragment
                if (r3 == 0) goto L_0x0082
                android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
                r3 = r0
            L_0x0049:
                if (r3 == 0) goto L_0x0066
                android.arch.lifecycle.ViewModelProvider$Factory r4 = com.bytedance.jedi.arch.b.a()     // Catch:{ af -> 0x0061 }
                android.arch.lifecycle.ViewModelProvider r4 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.Fragment) r3, (android.arch.lifecycle.ViewModelProvider.Factory) r4)     // Catch:{ af -> 0x0061 }
                kotlin.reflect.KClass r5 = r9.$viewModelClass     // Catch:{ af -> 0x0061 }
                java.lang.Class r5 = kotlin.jvm.a.a(r5)     // Catch:{ af -> 0x0061 }
                android.arch.lifecycle.ViewModel r4 = r4.get(r1, r5)     // Catch:{ af -> 0x0061 }
                com.bytedance.jedi.arch.JediViewModel r4 = (com.bytedance.jedi.arch.JediViewModel) r4     // Catch:{ af -> 0x0061 }
                r2 = r4
                goto L_0x0066
            L_0x0061:
                android.support.v4.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0049
            L_0x0066:
                if (r2 != 0) goto L_0x0081
                android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                android.arch.lifecycle.ViewModelProvider$Factory r2 = com.bytedance.jedi.arch.b.a()
                android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0, (android.arch.lifecycle.ViewModelProvider.Factory) r2)
                kotlin.reflect.KClass r2 = r9.$viewModelClass
                java.lang.Class r2 = kotlin.jvm.a.a(r2)
                android.arch.lifecycle.ViewModel r0 = r0.get(r1, r2)
                r2 = r0
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
            L_0x0081:
                return r2
            L_0x0082:
                boolean r2 = r0 instanceof android.support.v4.app.FragmentActivity
                if (r2 == 0) goto L_0x00a2
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
            L_0x00a2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewholder.ConnectedRelationViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "actionId", "", "extra", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<Integer, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ User $user;
        final /* synthetic */ ConnectedRelationViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ConnectedRelationViewHolder connectedRelationViewHolder, User user) {
            super(2);
            this.this$0 = connectedRelationViewHolder;
            this.$user = user;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, @NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 45179, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 45179, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, PushConstants.EXTRA);
            this.this$0.a(this.$user, i, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<UserState, UserState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ConnectedRelationViewHolder connectedRelationViewHolder) {
            super(1);
            this.this$0 = connectedRelationViewHolder;
        }

        @NotNull
        public final UserState invoke(@NotNull UserState userState) {
            UserState userState2 = userState;
            if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 45180, new Class[]{UserState.class}, UserState.class)) {
                return (UserState) PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 45180, new Class[]{UserState.class}, UserState.class);
            }
            Intrinsics.checkParameterIsNotNull(userState2, "$receiver");
            return UserState.copy$default(userState, ((f) this.this$0.e()).f48217c, false, null, null, 14, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationViewHolder;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<ConnectedRelationViewHolder, User, Unit> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ConnectedRelationViewHolder) obj, (User) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ConnectedRelationViewHolder connectedRelationViewHolder, @NotNull User user) {
            ConnectedRelationViewHolder connectedRelationViewHolder2 = connectedRelationViewHolder;
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{connectedRelationViewHolder2, user2}, this, changeQuickRedirect, false, 45183, new Class[]{ConnectedRelationViewHolder.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{connectedRelationViewHolder2, user2}, this, changeQuickRedirect, false, 45183, new Class[]{ConnectedRelationViewHolder.class, User.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(connectedRelationViewHolder2, "$receiver");
            Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
            if (((f) connectedRelationViewHolder.e()).f48216b == 0) {
                User clone = user.clone();
                Intrinsics.checkExpressionValueIsNotNull(clone, AdvanceSetting.NETWORK_TYPE);
                clone.setRecommendReason(((f) connectedRelationViewHolder.e()).f48217c.getRecommendReason());
                Intrinsics.checkExpressionValueIsNotNull(clone, "user.clone().also { it.r…em.user.recommendReason }");
                connectedRelationViewHolder2.a(clone);
                return;
            }
            user2.setRecommendReason(((f) connectedRelationViewHolder.e()).f48217c.getRecommendReason());
            user2.setFollowerCount(((f) connectedRelationViewHolder.e()).f48217c.getFollowerCount());
            user2.setAwemeCount(((f) connectedRelationViewHolder.e()).f48217c.getAwemeCount());
            connectedRelationViewHolder.a(user);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/following/ui/viewholder/ConnectedRelationViewHolder;", "throwable", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<ConnectedRelationViewHolder, Throwable, Unit> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ConnectedRelationViewHolder) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ConnectedRelationViewHolder connectedRelationViewHolder, @NotNull Throwable th) {
            ConnectedRelationViewHolder connectedRelationViewHolder2 = connectedRelationViewHolder;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{connectedRelationViewHolder2, th2}, this, changeQuickRedirect, false, 45186, new Class[]{ConnectedRelationViewHolder.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{connectedRelationViewHolder2, th2}, this, changeQuickRedirect, false, 45186, new Class[]{ConnectedRelationViewHolder.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(connectedRelationViewHolder2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, "throwable");
            View view = connectedRelationViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            com.ss.android.ugc.aweme.app.api.a.a.a(view.getContext(), th2, C0906R.string.afx);
        }
    }

    private final ConnectedRelationListViewModel m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 45171, new Class[0], ConnectedRelationListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, g, false, 45171, new Class[0], ConnectedRelationListViewModel.class);
        } else {
            value = this.i.getValue();
        }
        return (ConnectedRelationListViewModel) value;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 45172, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 45172, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        Disposable unused = a(l(), b.INSTANCE, c(), false, d.INSTANCE);
        e.a.a(this, l(), c.INSTANCE, false, false, e.INSTANCE, null, null, 54, null);
        a(((f) e()).f48217c, an.a.e(), "");
    }

    private final UserViewModel l() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 45170, new Class[0], UserViewModel.class)) {
            return (UserViewModel) PatchProxy.accessDispatch(new Object[0], this, g, false, 45170, new Class[0], UserViewModel.class);
        }
        Function1 cVar = new c(this);
        Class<UserViewModel> cls = UserViewModel.class;
        com.bytedance.jedi.ext.adapter.b g2 = g();
        if (g2 != null) {
            g a2 = g.a.a(r_(), g2.b());
            JediViewModel jediViewModel = (JediViewModel) a2.a(getClass().getName() + '_' + cls.getName(), cls);
            n a3 = jediViewModel.f2282c.a(UserViewModel.class);
            if (a3 != null) {
                a3.binding(jediViewModel);
            }
            jediViewModel.a(cVar);
            return (UserViewModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectedRelationViewHolder(@NotNull an anVar) {
        super(anVar);
        Intrinsics.checkParameterIsNotNull(anVar, "recommendView");
        this.j = anVar;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConnectedRelationListViewModel.class);
        this.i = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
    }

    private final void b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, g, false, 45175, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, g, false, 45175, new Class[]{User.class}, Void.TYPE);
            return;
        }
        new q().k(user.getUid()).b("common_relation").i("others_homepage").h("1044").e();
    }

    private final void c(User user) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{user}, this, g, false, 45176, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, g, false, 45176, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (user.getFollowStatus() == 0) {
            str = "follow";
        } else {
            str = "follow_cancel";
        }
        s c2 = new s(str).f("others_homepage").b("common_relation").c("follow_button");
        if (user.getFollowStatus() == 0) {
            str2 = "1007";
        } else {
            str2 = "1036";
        }
        c2.a(str2).h(user.getUid()).e();
    }

    public final void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, g, false, 45173, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, g, false, 45173, new Class[]{User.class}, Void.TYPE);
            return;
        }
        this.j.a(user);
        this.j.setAdapterPosition(getAdapterPosition());
        this.j.setActionEventListener(new b(this, user));
    }

    private final void a(User user, String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{user, str2, Integer.valueOf(i2)}, this, g, false, 45177, new Class[]{User.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, str2, Integer.valueOf(i2)}, this, g, false, 45177, new Class[]{User.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (((f) e()).f48216b == ConnectedRelationAdapter.a.a()) {
            new ag(null, 1).a(user.getUid()).b("common_relation").c(str2).a(Integer.valueOf(i2)).e(user.getRequestId()).f(user.getRecommendReason()).g("total").h("nonempty").i("1007").e();
        }
    }

    public final void a(User user, int i2, String str) {
        String str2;
        User user2 = user;
        int i3 = i2;
        String str3 = str;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i2), str3}, this, g, false, 45174, new Class[]{User.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i2), str3}, this, g, false, 45174, new Class[]{User.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (i3 == an.a.e()) {
            if (((f) e()).f48216b == ConnectedRelationAdapter.a.a()) {
                a(user2, "impression", ((f) e()).f48218d);
                k.a().a(3, user.getUid());
                ConnectedRelationListViewModel m = m();
                k a2 = k.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "RecUserImpressionReporter.getInstance()");
                String b2 = a2.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "RecUserImpressionReporte…getInstance().toReportIds");
                m.a(b2);
            }
        } else if (i3 == 0 || i3 == an.a.a()) {
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            UserProfileActivity.a(view.getContext(), ad.a().a("uid", user.getUid()).a("sec_user_id", user.getSecUid()).a("enter_from", "common_relation").a("need_track_compare_recommend_reason", 1).a("previous_recommend_reason", user.getRecommendReason()).a("recommend_from_type", "list").f75487b);
            b(user);
            a(user2, "enter_profile", ((f) e()).f48218d);
        } else if (i3 == an.a.b()) {
            if (user.getFollowStatus() == 0) {
                i4 = 1;
            }
            UserViewModel l = l();
            h a3 = new i.a().a(user.getUid()).b(user.getSecUid()).a(i4).c("common_relation").b(12).a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "FollowPresenter.FollowPa…                 .build()");
            l.a(a3);
            c(user);
            if (user.getFollowStatus() == 0) {
                str2 = "follow";
            } else {
                str2 = "follow_cancel";
            }
            a(user2, str2, ((f) e()).f48218d);
        } else if (i3 == an.a.c()) {
            m().a(((f) e()).f48217c);
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            com.bytedance.ies.dmt.ui.d.a.c(view2.getContext(), (int) C0906R.string.nx).a();
            a(user2, "delete", ((f) e()).f48218d);
        } else if (i3 == an.a.d()) {
            com.ss.android.ugc.aweme.ag.h a4 = com.ss.android.ugc.aweme.ag.h.a();
            a4.a(j.a("aweme://aweme/detail/" + str3).a("refer", "find_friends").a());
        }
    }
}
