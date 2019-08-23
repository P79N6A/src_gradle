package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.sdk.account.k.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.model.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseBindService;
import com.ss.android.ugc.aweme.services.BaseLoginService;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.LoginService;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50726a;

    /* renamed from: b  reason: collision with root package name */
    static List<IAccountService.a> f50727b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static h f50728c;

    /* renamed from: d  reason: collision with root package name */
    public static Activity f50729d = null;

    /* renamed from: e  reason: collision with root package name */
    private static LoginService f50730e;

    /* renamed from: f  reason: collision with root package name */
    private static BindService f50731f;
    private static IWXAPI g = null;

    public static Application b() {
        return b.f34450b;
    }

    public static boolean a(@IAccountService.ActionType int i, @Nullable Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj2}, null, f50726a, true, 19481, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)) {
            return f50728c.needIntercept(i, obj2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj2}, null, f50726a, true, 19481, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)).booleanValue();
    }

    public static void a(@Nullable b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f50726a, true, 19483, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f50726a, true, 19483, new Class[]{b.class}, Void.TYPE);
            return;
        }
        f50728c.userService().updateUserInfo(bVar2);
    }

    public static void a(String str, boolean z) {
        BaseBindService baseBindService;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f50726a, true, 19484, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f50726a, true, 19484, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19492, new Class[0], BaseBindService.class)) {
            baseBindService = (BaseBindService) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19492, new Class[0], BaseBindService.class);
        } else {
            if (f50731f == null) {
                f50731f = (BindService) f50728c.bindService();
            }
            baseBindService = f50731f;
        }
        baseBindService.returnAuthorizeResult(str2, z);
    }

    public static void a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f50726a, true, 19489, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, null, f50726a, true, 19489, new Class[]{User.class}, Void.TYPE);
            return;
        }
        a().updateCurUser(user2);
    }

    public static void a(boolean z, @Nullable User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), user2}, null, f50726a, true, 19496, new Class[]{Boolean.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), user2}, null, f50726a, true, 19496, new Class[]{Boolean.TYPE, User.class}, Void.TYPE);
            return;
        }
        for (IAccountService.a a2 : f50727b) {
            a2.a(2, z, 0, user2);
        }
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f50726a, true, 19497, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f50726a, true, 19497, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (IAccountService.a a2 : f50727b) {
            a2.a(3, z, 0, null);
        }
    }

    public static IAccountUserService a() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19467, new Class[0], IAccountUserService.class)) {
            return (IAccountUserService) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19467, new Class[0], IAccountUserService.class);
        }
        return f50728c.userService();
    }

    public static IAccountService.c c() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19468, new Class[0], IAccountService.c.class)) {
            return (IAccountService.c) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19468, new Class[0], IAccountService.c.class);
        }
        return m().getLoginParam();
    }

    public static IWXAPI d() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19471, new Class[0], IWXAPI.class)) {
            return (IWXAPI) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19471, new Class[0], IWXAPI.class);
        }
        if (g == null) {
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(b.f34450b, "wx76fdd06dde311af3", false);
            g = createWXAPI;
            createWXAPI.registerApp("wx76fdd06dde311af3");
        }
        return g;
    }

    public static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19473, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19473, new Class[0], String.class);
        }
        return a().getCurUserId();
    }

    public static IAccountService.b f() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19474, new Class[0], IAccountService.b.class)) {
            return (IAccountService.b) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19474, new Class[0], IAccountService.b.class);
        }
        f50728c.getModuleContext();
        return b.f34452d;
    }

    public static t g() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19476, new Class[0], t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19476, new Class[0], t.class);
        }
        f50728c.getModuleContext();
        return b.f34453e;
    }

    public static boolean h() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19477, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19477, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return f50728c.userService().isLogin();
    }

    public static boolean j() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19486, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19486, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a().isNewUser();
    }

    public static User k() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19487, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19487, new Class[0], User.class);
        }
        return a().getCurUser();
    }

    public static void l() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19488, new Class[0], Void.TYPE);
        } else {
            a().queryUser();
        }
    }

    public static BaseLoginService m() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19491, new Class[0], BaseLoginService.class)) {
            return (BaseLoginService) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19491, new Class[0], BaseLoginService.class);
        }
        if (f50730e == null) {
            f50730e = (LoginService) f50728c.loginService();
        }
        return f50730e;
    }

    public static f i() {
        if (PatchProxy.isSupport(new Object[0], null, f50726a, true, 19478, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f50726a, true, 19478, new Class[0], f.class);
        }
        v moduleContext = f50728c.getModuleContext();
        if (!PatchProxy.isSupport(new Object[0], moduleContext, v.f50725a, false, 19464, new Class[0], f.class)) {
            return b.f34452d.a();
        }
        return (f) PatchProxy.accessDispatch(new Object[0], moduleContext, v.f50725a, false, 19464, new Class[0], f.class);
    }

    public static void a(Activity activity) {
        f50729d = activity;
    }

    public static <T> T a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, null, f50726a, true, 19469, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls}, null, f50726a, true, 19469, new Class[]{Class.class}, Object.class);
        }
        v moduleContext = f50728c.getModuleContext();
        if (!PatchProxy.isSupport(new Object[]{cls}, moduleContext, v.f50725a, false, 19466, new Class[]{Class.class}, Object.class)) {
            return b.a(cls);
        }
        return PatchProxy.accessDispatch(new Object[]{cls}, moduleContext, v.f50725a, false, 19466, new Class[]{Class.class}, Object.class);
    }

    public static void b(@NonNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, null, f50726a, true, 19495, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, null, f50726a, true, 19495, new Class[]{User.class}, Void.TYPE);
            return;
        }
        for (IAccountService.a a2 : f50727b) {
            a2.a(1, true, 0, user2);
        }
    }

    public static void a(Handler handler, boolean z) {
        Handler handler2 = handler;
        if (PatchProxy.isSupport(new Object[]{handler2, (byte) 0}, null, f50726a, true, 19490, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, (byte) 0}, null, f50726a, true, 19490, new Class[]{Handler.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a().updateSecret(handler2, false);
    }

    public static void a(@IAccountService.ActionType int i, @IAccountService.ActionResult int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, null, f50726a, true, 19480, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, null, f50726a, true, 19480, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        f50728c.returnResult(i, i2, obj2);
    }

    public static void a(@IAccountService.ViewPage int i, @IAccountService.ActionProgress int i2, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, f50726a, true, 19482, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, null, f50726a, true, 19482, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        f50728c.notifyProgress(i, i2, str2);
    }

    public static void a(int i, String str, @Nullable IAccountService.h hVar) {
        String str2 = str;
        IAccountService.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, hVar2}, null, f50726a, true, 19470, new Class[]{Integer.TYPE, String.class, IAccountService.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, hVar2}, null, f50726a, true, 19470, new Class[]{Integer.TYPE, String.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        f50728c.proAccountService().switchProAccount(i, str2, hVar2);
    }
}
