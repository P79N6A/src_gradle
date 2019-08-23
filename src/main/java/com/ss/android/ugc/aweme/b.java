package com.ss.android.ugc.aweme;

import android.annotation.SuppressLint;
import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020 H\u0007J!\u0010/\u001a\u0002H0\"\u0004\b\u0000\u001002\f\u00101\u001a\b\u0012\u0004\u0012\u0002H00\u001dH\u0007¢\u0006\u0002\u00102R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/AccountSdkInitializer;", "", "()V", "sAccountConfig", "Lcom/ss/android/TTAccountConfig;", "getSAccountConfig", "()Lcom/ss/android/TTAccountConfig;", "setSAccountConfig", "(Lcom/ss/android/TTAccountConfig;)V", "sAccountUserChangeListener", "Lcom/ss/android/ugc/aweme/IAccountUserService$IAccountUserChangeListener;", "getSAccountUserChangeListener", "()Lcom/ss/android/ugc/aweme/IAccountUserService$IAccountUserChangeListener;", "setSAccountUserChangeListener", "(Lcom/ss/android/ugc/aweme/IAccountUserService$IAccountUserChangeListener;)V", "sAuthorize", "Lcom/ss/android/ugc/aweme/IThirdAuthorize;", "getSAuthorize", "()Lcom/ss/android/ugc/aweme/IThirdAuthorize;", "setSAuthorize", "(Lcom/ss/android/ugc/aweme/IThirdAuthorize;)V", "sContext", "Landroid/app/Application;", "getSContext", "()Landroid/app/Application;", "setSContext", "(Landroid/app/Application;)V", "sNeedServices", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lcom/ss/android/ugc/aweme/framework/services/ServiceProvider;", "sServiceProvider", "Lcom/ss/android/ugc/aweme/AccountServiceProvider;", "sUserOperator", "Lcom/ss/android/ugc/aweme/IAccountService$IUserOperateCallback;", "getSUserOperator", "()Lcom/ss/android/ugc/aweme/IAccountService$IUserOperateCallback;", "setSUserOperator", "(Lcom/ss/android/ugc/aweme/IAccountService$IUserOperateCallback;)V", "fastInitialize", "", "appContext", "accountConfig", "userOperator", "authorize", "accountUserChangeListener", "serviceProvider", "getService", "T", "clazz", "(Ljava/lang/Class;)Ljava/lang/Object;", "accountapi_release"}, k = 1, mv = {1, 1, 13})
@SuppressLint({"StaticFieldLeak"})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34449a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static Application f34450b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static com.ss.android.b f34451c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static IAccountService.b f34452d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static t f34453e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static IAccountUserService.a f34454f;
    public static final b g = new b();
    private static ConcurrentHashMap<Class<?>, ServiceProvider<?>> h;
    private static c i;

    private b() {
    }

    @JvmStatic
    public static final <T> T a(@NotNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, null, f34449a, true, 19323, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2}, null, f34449a, true, 19323, new Class[]{Class.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "clazz");
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap = h;
        if (concurrentHashMap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sNeedServices");
        }
        if (concurrentHashMap.contains(cls2)) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap2 = h;
            if (concurrentHashMap2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sNeedServices");
            }
            ServiceProvider<?> serviceProvider = concurrentHashMap2.get(cls2);
            if (serviceProvider == null) {
                Intrinsics.throwNpe();
            }
            return serviceProvider.get();
        }
        c cVar = i;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sServiceProvider");
        }
        ServiceProvider a2 = cVar.a(cls2);
        if (a2 != null) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap3 = h;
            if (concurrentHashMap3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sNeedServices");
            }
            concurrentHashMap3.put(cls2, a2);
            return a2.get();
        }
        throw new RuntimeException("你没有在AccountSdkInitializer初始化中注册" + cls.getCanonicalName());
    }

    @JvmStatic
    public static final void a(@NotNull Application application, @NotNull com.ss.android.b bVar, @NotNull IAccountService.b bVar2, @NotNull t tVar, @NotNull IAccountUserService.a aVar, @NotNull c cVar) {
        Application application2 = application;
        com.ss.android.b bVar3 = bVar;
        IAccountService.b bVar4 = bVar2;
        t tVar2 = tVar;
        IAccountUserService.a aVar2 = aVar;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{application2, bVar3, bVar4, tVar2, aVar2, cVar2}, null, f34449a, true, 19322, new Class[]{Application.class, com.ss.android.b.class, IAccountService.b.class, t.class, IAccountUserService.a.class, c.class}, Void.TYPE)) {
            Object[] objArr = {application2, bVar3, bVar4, tVar2, aVar2, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f34449a, true, 19322, new Class[]{Application.class, com.ss.android.b.class, IAccountService.b.class, t.class, IAccountUserService.a.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(application2, "appContext");
        Intrinsics.checkParameterIsNotNull(bVar3, "accountConfig");
        Intrinsics.checkParameterIsNotNull(bVar4, "userOperator");
        Intrinsics.checkParameterIsNotNull(tVar2, "authorize");
        Intrinsics.checkParameterIsNotNull(aVar2, "accountUserChangeListener");
        Intrinsics.checkParameterIsNotNull(cVar2, "serviceProvider");
        f34450b = application2;
        f34451c = bVar3;
        f34452d = bVar4;
        f34453e = tVar2;
        f34454f = aVar2;
        h = new ConcurrentHashMap<>();
        i = cVar2;
        GlobalContext.setContext(application2);
    }
}
