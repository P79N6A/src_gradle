package com.ss.android.ugc.aweme.user.repository;

import android.content.Context;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.aa;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.y;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0014J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tJD\u0010\u0013\u001a\u00020\u00072\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/UserViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "()V", "userRepository", "Lcom/ss/android/ugc/aweme/user/repository/UserRepository;", "commitRemarkName", "", "uid", "", "remarkName", "defaultState", "follow", "param", "Lcom/ss/android/ugc/aweme/profile/presenter/FollowParam;", "observeUser", "onStart", "removeFollower", "Lio/reactivex/disposables/Disposable;", "subscribe", "userListener", "Lkotlin/Function1;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "followStatusListener", "Lcom/ss/android/ugc/aweme/base/arch/JediAsyncListener;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "remarkNameListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserViewModel extends JediViewModel<UserState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f4281d;

    /* renamed from: e  reason: collision with root package name */
    public final h f4282e = com.ss.android.ugc.aweme.base.arch.b.b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "follow", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<UserState, com.bytedance.jedi.arch.a<? extends FollowStatus>, UserState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final UserState invoke(@NotNull UserState userState, @NotNull com.bytedance.jedi.arch.a<? extends FollowStatus> aVar) {
            UserState userState2 = userState;
            com.bytedance.jedi.arch.a<? extends FollowStatus> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{userState2, aVar2}, this, changeQuickRedirect, false, 87702, new Class[]{UserState.class, com.bytedance.jedi.arch.a.class}, UserState.class)) {
                return (UserState) PatchProxy.accessDispatch(new Object[]{userState2, aVar2}, this, changeQuickRedirect, false, 87702, new Class[]{UserState.class, com.bytedance.jedi.arch.a.class}, UserState.class);
            }
            Intrinsics.checkParameterIsNotNull(userState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(aVar2, "follow");
            if (!(aVar2 instanceof aa)) {
                return UserState.copy$default(userState, null, false, aVar, null, 11, null);
            }
            User clone = userState.getUser().clone();
            Intrinsics.checkExpressionValueIsNotNull(clone, AdvanceSetting.NETWORK_TYPE);
            clone.setFollowStatus(((FollowStatus) ((aa) aVar2).a()).followStatus);
            Intrinsics.checkExpressionValueIsNotNull(clone, "user.clone().also { it.f…w.invoke().followStatus }");
            return UserState.copy$default(userState, clone, false, aVar, null, 10, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<UserState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserViewModel userViewModel) {
            super(1);
            this.this$0 = userViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull UserState userState) {
            if (PatchProxy.isSupport(new Object[]{userState}, this, changeQuickRedirect, false, 87703, new Class[]{UserState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userState}, this, changeQuickRedirect, false, 87703, new Class[]{UserState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userState, AdvanceSetting.NETWORK_TYPE);
            UserViewModel userViewModel = this.this$0;
            h hVar = this.this$0.f4282e;
            String uid = userState.getUser().getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "it.user.uid");
            Disposable subscribe = hVar.a(uid).subscribe((Consumer<? super T>) new Consumer<com.bytedance.jedi.model.c.f<? extends User>>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75360a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f75361b;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "invoke"}, k = 3, mv = {1, 1, 15})
                /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$b$1$a */
                static final class a extends Lambda implements Function1<UserState, UserState> {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ User $user;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(User user) {
                        super(1);
                        this.$user = user;
                    }

                    @NotNull
                    public final UserState invoke(@NotNull UserState userState) {
                        UserState userState2 = userState;
                        if (PatchProxy.isSupport(new Object[]{userState2}, this, changeQuickRedirect, false, 87705, new Class[]{UserState.class}, UserState.class)) {
                            return (UserState) PatchProxy.accessDispatch(new Object[]{userState2}, this, changeQuickRedirect, false, 87705, new Class[]{UserState.class}, UserState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(userState2, "$receiver");
                        return UserState.copy$default(userState, this.$user, false, null, null, 14, null);
                    }
                }

                {
                    this.f75361b = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
                    if (PatchProxy.isSupport(new Object[]{fVar}, this, f75360a, false, 87704, new Class[]{com.bytedance.jedi.model.c.f.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{fVar}, this, f75360a, false, 87704, new Class[]{com.bytedance.jedi.model.c.f.class}, Void.TYPE);
                        return;
                    }
                    User user = (User) fVar.a();
                    if (user != null) {
                        this.f75361b.this$0.c(new a(user));
                    }
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(subscribe, "userRepository.observeUs…  }\n                    }");
            userViewModel.a(subscribe);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/user/repository/UserState;", "res", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function2<UserState, com.bytedance.jedi.arch.a<? extends BaseResponse>, UserState> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final /* synthetic */ class a extends FunctionReference implements Function0<Integer> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFansCount";
            }

            public final KDeclarationContainer getOwner() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87709, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87709, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "getFansCount()I";
            }

            public final int invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87708, new Class[0], Integer.TYPE)) {
                    return ((User) this.receiver).getFansCount();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87708, new Class[0], Integer.TYPE)).intValue();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "p0", "invoke"}, k = 3, mv = {1, 1, 15})
        static final /* synthetic */ class b extends FunctionReference implements Function1<Integer, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            b(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFansCount";
            }

            public final KDeclarationContainer getOwner() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87711, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87711, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "setFansCount(I)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 87710, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 87710, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                ((User) this.receiver).setFansCount(i);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$c  reason: collision with other inner class name */
        static final /* synthetic */ class C0789c extends FunctionReference implements Function0<Integer> {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0789c(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFollowerCount";
            }

            public final KDeclarationContainer getOwner() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87713, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87713, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "getFollowerCount()I";
            }

            public final int invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87712, new Class[0], Integer.TYPE)) {
                    return ((User) this.receiver).getFollowerCount();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87712, new Class[0], Integer.TYPE)).intValue();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "p0", "invoke"}, k = 3, mv = {1, 1, 15})
        static final /* synthetic */ class d extends FunctionReference implements Function1<Integer, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            d(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFollowerCount";
            }

            public final KDeclarationContainer getOwner() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87715, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87715, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "setFollowerCount(I)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 87714, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 87714, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                ((User) this.receiver).setFollowerCount(i);
            }
        }

        c() {
            super(2);
        }

        @NotNull
        public final UserState invoke(@NotNull UserState userState, @NotNull com.bytedance.jedi.arch.a<? extends BaseResponse> aVar) {
            UserState userState2 = userState;
            com.bytedance.jedi.arch.a<? extends BaseResponse> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{userState2, aVar2}, this, changeQuickRedirect, false, 87706, new Class[]{UserState.class, com.bytedance.jedi.arch.a.class}, UserState.class)) {
                return (UserState) PatchProxy.accessDispatch(new Object[]{userState2, aVar2}, this, changeQuickRedirect, false, 87706, new Class[]{UserState.class, com.bytedance.jedi.arch.a.class}, UserState.class);
            }
            Intrinsics.checkParameterIsNotNull(userState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(aVar2, "res");
            if (aVar2 instanceof aa) {
                Object a2 = aVar.a();
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                if (((BaseResponse) a2).status_code == 0) {
                    IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
                    User curUser = a3.getCurUser();
                    Function2 function2 = AnonymousClass1.INSTANCE;
                    if (y.a(curUser)) {
                        function2.invoke(new a(curUser), new b(curUser));
                    } else {
                        function2.invoke(new C0789c(curUser), new d(curUser));
                    }
                    return UserState.copy$default(userState, null, true, null, null, 13, null);
                }
            }
            if (!(aVar2 instanceof com.bytedance.jedi.arch.c)) {
                return userState2;
            }
            com.bytedance.jedi.arch.c cVar = (com.bytedance.jedi.arch.c) aVar2;
            if (cVar.f21347a instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                Context a4 = k.a();
                Throwable th = cVar.f21347a;
                if (th != null) {
                    com.ss.android.ugc.aweme.app.api.a.a.a(a4, (com.ss.android.ugc.aweme.base.api.a.b.a) th);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                }
            } else {
                com.ss.android.ugc.aweme.framework.a.a.a(cVar.f21347a);
            }
            return userState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/profile/model/User;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<User, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Function1 function1) {
            super(1);
            this.$listener = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((User) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull User user) {
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{user2}, this, changeQuickRedirect, false, 87718, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user2}, this, changeQuickRedirect, false, 87718, new Class[]{User.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(user2, AdvanceSetting.NETWORK_TYPE);
            this.$listener.invoke(user2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<FollowStatus, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.base.arch.a $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.ss.android.ugc.aweme.base.arch.a aVar) {
            super(1);
            this.$listener = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FollowStatus) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            if (PatchProxy.isSupport(new Object[]{followStatus2}, this, changeQuickRedirect, false, 87721, new Class[]{FollowStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followStatus2}, this, changeQuickRedirect, false, 87721, new Class[]{FollowStatus.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(followStatus2, AdvanceSetting.NETWORK_TYPE);
            this.$listener.a(followStatus2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.base.arch.a $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(com.ss.android.ugc.aweme.base.arch.a aVar) {
            super(0);
            this.$listener = aVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87722, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87722, new Class[0], Void.TYPE);
                return;
            }
            this.$listener.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.base.arch.a $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.ss.android.ugc.aweme.base.arch.a aVar) {
            super(1);
            this.$listener = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, changeQuickRedirect, false, 87723, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, changeQuickRedirect, false, 87723, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            this.$listener.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.base.arch.a $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(com.ss.android.ugc.aweme.base.arch.a aVar) {
            super(1);
            this.$listener = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 87726, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 87726, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, AdvanceSetting.NETWORK_TYPE);
            this.$listener.a(str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.base.arch.a $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(com.ss.android.ugc.aweme.base.arch.a aVar) {
            super(0);
            this.$listener = aVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87727, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87727, new Class[0], Void.TYPE);
                return;
            }
            this.$listener.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.base.arch.a $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.ss.android.ugc.aweme.base.arch.a aVar) {
            super(1);
            this.$listener = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, changeQuickRedirect, false, 87728, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, changeQuickRedirect, false, 87728, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            this.$listener.b();
        }
    }

    public final /* synthetic */ x c() {
        UserState userState;
        if (PatchProxy.isSupport(new Object[0], this, f4281d, false, 87694, new Class[0], UserState.class)) {
            userState = (UserState) PatchProxy.accessDispatch(new Object[0], this, f4281d, false, 87694, new Class[0], UserState.class);
        } else {
            userState = new UserState(null, false, null, null, 15, null);
        }
        return userState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f4281d, false, 87695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4281d, false, 87695, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (PatchProxy.isSupport(new Object[0], this, f4281d, false, 87699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4281d, false, 87699, new Class[0], Void.TYPE);
            return;
        }
        b(new b(this));
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.profile.presenter.h hVar) {
        com.ss.android.ugc.aweme.profile.presenter.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f4281d, false, 87696, new Class[]{com.ss.android.ugc.aweme.profile.presenter.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2}, this, f4281d, false, 87696, new Class[]{com.ss.android.ugc.aweme.profile.presenter.h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar2, "param");
        a(this.f4282e.a(hVar2.f61625a, hVar2.f61626b, hVar2.f61627c, com.ss.android.ugc.aweme.app.constants.a.a(hVar2.f61630f), hVar2.f61628d, hVar2.g, hVar2.f61629e), a.INSTANCE);
    }

    /* access modifiers changed from: private */
    @Deprecated(message = "use selectSubscribe or asyncSubscribe")
    public void a(@Nullable Function1<? super User, Unit> function1, @Nullable com.ss.android.ugc.aweme.base.arch.a<FollowStatus> aVar, @Nullable com.ss.android.ugc.aweme.base.arch.a<String> aVar2) {
        Function1<? super User, Unit> function12 = function1;
        com.ss.android.ugc.aweme.base.arch.a<FollowStatus> aVar3 = aVar;
        com.ss.android.ugc.aweme.base.arch.a<String> aVar4 = aVar2;
        if (function12 != null) {
            JediViewModel.a((JediViewModel) this, i.INSTANCE, false, (Function1) new d(function12), 2, (Object) null);
        }
        if (aVar3 != null) {
            Function0 fVar = new f(aVar3);
            JediViewModel.a(this, j.INSTANCE, false, new g(aVar3), fVar, new e(aVar3), 2, null);
        }
        if (aVar4 != null) {
            Function0 iVar = new i(aVar4);
            JediViewModel.a(this, k.INSTANCE, false, new j(aVar4), iVar, new h(aVar4), 2, null);
        }
    }
}
