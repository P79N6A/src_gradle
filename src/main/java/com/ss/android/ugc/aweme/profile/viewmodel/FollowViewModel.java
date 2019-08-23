package com.ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.api.FollowApi;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.y;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J?\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000e2\u0010\b\u0001\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012H\u0001Jw\u0010\u0013\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000e2H\b\u0001\u0010\u0014\u001aB\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00120\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00120\u0012 \u0010* \u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00120\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00160\u0015H\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0007J?\u0010\u0019\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001b0\u001b \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u001b0\u001b\u0018\u00010\u001a0\u001a2\u0010\b\u0001\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00120\u0012H\u0001J,\u0010\u0019\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001dR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/viewmodel/FollowViewModel;", "Lcom/ss/android/ugc/aweme/profile/api/FollowApi$FollowService;", "Landroid/arch/lifecycle/LifecycleObserver;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "api", "(Landroid/arch/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/aweme/profile/api/FollowApi$FollowService;)V", "getApi", "()Lcom/ss/android/ugc/aweme/profile/api/FollowApi$FollowService;", "getLifecycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "removeDisposable", "Lio/reactivex/disposables/Disposable;", "face2FaceFollow", "Lcom/bytedance/retrofit2/Call;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "kotlin.jvm.PlatformType", "uid", "", "follow", "map", "", "", "onDestroy", "", "remove", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "onNext", "Lio/reactivex/functions/Consumer;", "onError", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowViewModel implements LifecycleObserver, FollowApi.FollowService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3821a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f3822d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final LifecycleOwner f3823b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final FollowApi.FollowService f3824c;

    /* renamed from: e  reason: collision with root package name */
    private Disposable f3825e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/viewmodel/FollowViewModel$Companion;", "", "()V", "retrofitService", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63169a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Consumer<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Consumer f63171b;

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
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70066, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70066, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "getFansCount()I";
            }

            public final int invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70065, new Class[0], Integer.TYPE)) {
                    return ((User) this.receiver).getFansCount();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70065, new Class[0], Integer.TYPE)).intValue();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "p0", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$b$b  reason: collision with other inner class name */
        static final /* synthetic */ class C0680b extends FunctionReference implements Function1<Integer, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            C0680b(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFansCount";
            }

            public final KDeclarationContainer getOwner() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70068, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70068, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "setFansCount(I)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 70067, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 70067, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                ((User) this.receiver).setFansCount(i);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final /* synthetic */ class c extends FunctionReference implements Function0<Integer> {
            public static ChangeQuickRedirect changeQuickRedirect;

            c(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFollowerCount";
            }

            public final KDeclarationContainer getOwner() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70070, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70070, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "getFollowerCount()I";
            }

            public final int invoke() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70069, new Class[0], Integer.TYPE)) {
                    return ((User) this.receiver).getFollowerCount();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70069, new Class[0], Integer.TYPE)).intValue();
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
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 70072, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(User.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 70072, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "setFollowerCount(I)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 70071, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 70071, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                ((User) this.receiver).setFollowerCount(i);
            }
        }

        b(Consumer consumer) {
            this.f63171b = consumer;
        }

        public final /* synthetic */ void accept(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f63170a, false, 70063, new Class[]{BaseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f63170a, false, 70063, new Class[]{BaseResponse.class}, Void.TYPE);
                return;
            }
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            User curUser = a2.getCurUser();
            Function2 function2 = AnonymousClass1.INSTANCE;
            if (y.a(curUser)) {
                function2.invoke(new a(curUser), new C0680b(curUser));
            } else {
                function2.invoke(new c(curUser), new d(curUser));
            }
            this.f63171b.accept(baseResponse);
        }
    }

    @JvmOverloads
    public FollowViewModel(@NotNull LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, null, 2);
    }

    @GET("/aweme/v3/f2f/follow/")
    public final Call<FollowStatus> face2FaceFollow(@Query(a = "user_id") String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f3821a, false, 70059, new Class[]{String.class}, Call.class)) {
            return this.f3824c.face2FaceFollow(str2);
        }
        return (Call) PatchProxy.accessDispatch(new Object[]{str2}, this, f3821a, false, 70059, new Class[]{String.class}, Call.class);
    }

    @GET("/aweme/v1/commit/follow/user/")
    public final Call<FollowStatus> follow(@QueryMap Map<String, String> map) {
        Map<String, String> map2 = map;
        if (!PatchProxy.isSupport(new Object[]{map2}, this, f3821a, false, 70060, new Class[]{Map.class}, Call.class)) {
            return this.f3824c.follow(map2);
        }
        return (Call) PatchProxy.accessDispatch(new Object[]{map2}, this, f3821a, false, 70060, new Class[]{Map.class}, Call.class);
    }

    @GET("/aweme/v1/remove/follower/")
    public final Observable<BaseResponse> remove(@Query(a = "user_id") String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f3821a, false, 70061, new Class[]{String.class}, Observable.class)) {
            return this.f3824c.remove(str2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, this, f3821a, false, 70061, new Class[]{String.class}, Observable.class);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3821a, false, 70058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3821a, false, 70058, new Class[0], Void.TYPE);
            return;
        }
        Disposable disposable = this.f3825e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @JvmOverloads
    private FollowViewModel(@NotNull LifecycleOwner lifecycleOwner, @NotNull FollowApi.FollowService followService) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(followService, "api");
        this.f3823b = lifecycleOwner;
        this.f3824c = followService;
        this.f3823b.getLifecycle().addObserver(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ FollowViewModel(android.arch.lifecycle.LifecycleOwner r8, com.ss.android.ugc.aweme.profile.api.FollowApi.FollowService r9, int r10) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a r9 = f3822d
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel.a.f63169a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r6 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
            r3 = 0
            r4 = 70062(0x111ae, float:9.8178E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel.a.f63169a
            r3 = 0
            r4 = 70062(0x111ae, float:9.8178E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r6 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
            r1 = r9
            java.lang.Object r9 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0037
        L_0x0028:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r9 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r10 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
            java.lang.Object r9 = r9.getService(r10)
            if (r9 != 0) goto L_0x0037
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0037:
            com.ss.android.ugc.aweme.framework.services.IRetrofitService r9 = (com.ss.android.ugc.aweme.framework.services.IRetrofitService) r9
            java.lang.String r10 = com.ss.android.c.b.k
            com.ss.android.ugc.aweme.framework.services.IRetrofit r9 = r9.createNewRetrofit(r10)
            java.lang.Class<com.ss.android.ugc.aweme.profile.api.FollowApi$FollowService> r10 = com.ss.android.ugc.aweme.profile.api.FollowApi.FollowService.class
            java.lang.Object r9 = r9.create(r10)
            java.lang.String r10 = "retrofitService().create…ollowService::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r9, r10)
            com.ss.android.ugc.aweme.profile.api.FollowApi$FollowService r9 = (com.ss.android.ugc.aweme.profile.api.FollowApi.FollowService) r9
            r7.<init>(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel.<init>(android.arch.lifecycle.LifecycleOwner, com.ss.android.ugc.aweme.profile.api.FollowApi$FollowService, int):void");
    }

    public final void a(@Nullable String str, @NotNull Consumer<BaseResponse> consumer, @NotNull Consumer<Throwable> consumer2) {
        String str2 = str;
        Consumer<BaseResponse> consumer3 = consumer;
        Consumer<Throwable> consumer4 = consumer2;
        if (PatchProxy.isSupport(new Object[]{str2, consumer3, consumer4}, this, f3821a, false, 70057, new Class[]{String.class, Consumer.class, Consumer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, consumer3, consumer4}, this, f3821a, false, 70057, new Class[]{String.class, Consumer.class, Consumer.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(consumer3, "onNext");
        Intrinsics.checkParameterIsNotNull(consumer4, "onError");
        Disposable disposable = this.f3825e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f3825e = this.f3824c.remove(str2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(consumer3), consumer4);
    }
}
