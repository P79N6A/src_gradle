package com.ss.android.ugc.aweme.o;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58157a;

    /* renamed from: b  reason: collision with root package name */
    boolean f58158b;

    private static IUserService f() {
        if (PatchProxy.isSupport(new Object[0], null, f58157a, true, 54500, new Class[0], IUserService.class)) {
            return (IUserService) PatchProxy.accessDispatch(new Object[0], null, f58157a, true, 54500, new Class[0], IUserService.class);
        }
        return (IUserService) ServiceManager.get().getService(IUserService.class);
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f58157a, false, 54492, new Class[0], Boolean.TYPE)) {
            return ex.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58157a, false, 54492, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f58157a, false, 54501, new Class[0], Boolean.TYPE)) {
            return TimeLockRuler.isTeenModeON();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58157a, false, 54501, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f58157a, false, 54493, new Class[0], Boolean.TYPE)) {
            return f().isLogin();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58157a, false, 54493, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f58157a, false, 54494, new Class[0], String.class)) {
            return f().getCurrentUserID();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f58157a, false, 54494, new Class[0], String.class);
    }

    @Nullable
    public final e e() {
        if (PatchProxy.isSupport(new Object[0], this, f58157a, false, 54495, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f58157a, false, 54495, new Class[0], e.class);
        }
        User currentUser = f().getCurrentUser();
        if (currentUser != null) {
            return new r(currentUser);
        }
        return null;
    }

    @NotNull
    public final e a(@NotNull String str) throws Exception {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f58157a, false, 54491, new Class[]{String.class}, e.class)) {
            return new r(d.a(com.ss.android.ugc.aweme.app.api.a.a(str), false, null));
        }
        return (e) PatchProxy.accessDispatch(new Object[]{str}, this, f58157a, false, 54491, new Class[]{String.class}, e.class);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f58157a, false, 54496, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f58157a, false, 54496, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f().setIsOldUser(true);
    }

    public final void a(@NotNull Activity activity, @NotNull String str, @Nullable f.a aVar) {
        Activity activity2 = activity;
        String str2 = str;
        f.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, aVar2}, this, f58157a, false, 54499, new Class[]{Activity.class, String.class, f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2, aVar2}, this, f58157a, false, 54499, new Class[]{Activity.class, String.class, f.a.class}, Void.TYPE);
            return;
        }
        IAccountService.c a2 = new IAccountService.d().a((IAccountService.h) new d(this, aVar2, activity2)).a(activity2).b(str2).a();
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.setLoginMob(str2);
            iAccountService.login(a2);
        }
    }

    public final void a(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @Nullable Bundle bundle, @Nullable f.a aVar) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        Bundle bundle2 = bundle;
        f.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, bundle2, aVar2}, this, f58157a, false, 54498, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.a.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, str4, bundle2, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f58157a, false, 54498, new Class[]{Activity.class, String.class, String.class, Bundle.class, f.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.login.e.a(activity2, str3, str4, bundle2, (com.ss.android.ugc.aweme.base.component.f) new c(aVar2));
    }

    public final void a(@NotNull Fragment fragment, @NotNull String str, @NotNull String str2, @Nullable Bundle bundle, @Nullable f.a aVar) {
        Fragment fragment2 = fragment;
        String str3 = str;
        String str4 = str2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{fragment2, str3, str4, bundle2, null}, this, f58157a, false, 54497, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.a.class}, Void.TYPE)) {
            Object[] objArr = {fragment2, str3, str4, bundle2, null};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f58157a, false, 54497, new Class[]{Fragment.class, String.class, String.class, Bundle.class, f.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.login.e.a(fragment2, str3, str4, bundle2, (com.ss.android.ugc.aweme.base.component.f) new b(null));
    }
}
