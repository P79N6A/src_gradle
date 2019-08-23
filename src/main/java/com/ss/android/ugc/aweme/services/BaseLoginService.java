package com.ss.android.ugc.aweme.services;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.account.api.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.bean.a;
import com.ss.android.ugc.aweme.account.j.b;
import com.ss.android.ugc.aweme.account.login.g;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.terminal.a;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.main.h.e;
import com.ss.android.ugc.aweme.p;
import com.ss.android.ugc.aweme.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public abstract class BaseLoginService implements LifecycleObserver, p {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mKeepCallback;
    private IAccountService.c mLoginParam;

    public p keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public String getLoginMobEnterFrom() {
        return i.f32242b;
    }

    public String getLoginMobEnterMethod() {
        return i.f32241a;
    }

    @Nullable
    public IAccountService.c getLoginParam() {
        return this.mLoginParam;
    }

    @NonNull
    public List<a> getAllSupportedLoginPlatform() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71346, new Class[0], List.class)) {
            return Collections.singletonList(new a("Phone", 2130839185, "mobile"));
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71346, new Class[0], List.class);
    }

    public void retryLogin() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71348, new Class[0], Void.TYPE);
            return;
        }
        retryLogin(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71347, new Class[0], Void.TYPE);
            return;
        }
        if (this.mLoginParam != null && (this.mLoginParam.f31560a instanceof LifecycleOwner)) {
            ((LifecycleOwner) this.mLoginParam.f31560a).getLifecycle().removeObserver(this);
        }
        this.mLoginParam = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$retryLogin$0$BaseLoginService(boolean z) {
        g.a(new BaseLoginMethod());
        if (this.mLoginParam != null) {
            this.mLoginParam.f31563d.putBoolean("from_third_party_login", z);
            showLoginAndRegisterView(this.mLoginParam);
        }
    }

    public String platform(LoginMethodName loginMethodName) {
        LoginMethodName loginMethodName2 = loginMethodName;
        if (PatchProxy.isSupport(new Object[]{loginMethodName2}, this, changeQuickRedirect, false, 71349, new Class[]{LoginMethodName.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{loginMethodName2}, this, changeQuickRedirect, false, 71349, new Class[]{LoginMethodName.class}, String.class);
        } else if (loginMethodName2 == LoginMethodName.EMAIL_PASS) {
            return "email";
        } else {
            if (loginMethodName2 == LoginMethodName.USER_NAME_PASS) {
                return "handle";
            }
            if (loginMethodName2 == LoginMethodName.PHONE_NUMBER_PASS) {
                return "phone";
            }
            if (loginMethodName2 == LoginMethodName.PHONE_SMS) {
                return "sms_verification";
            }
            if (loginMethodName2 == LoginMethodName.THIRD_PARTY) {
                return ((TPLoginMethod) g.c()).getPlatform();
            }
            return "";
        }
    }

    public void retryLogin(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71341, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 71341, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        new Handler().postDelayed(new BaseLoginService$$Lambda$0(this, z), 300);
    }

    public void showLoginView(@NonNull IAccountService.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 71342, new Class[]{IAccountService.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 71342, new Class[]{IAccountService.c.class}, Void.TYPE);
            return;
        }
        this.mLoginParam = cVar;
        i.f32241a = cVar.f31563d.getString("enter_method", "");
        i.f32242b = cVar.f31563d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f31560a instanceof LifecycleOwner)) {
            ((LifecycleOwner) cVar.f31560a).getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    public void logout(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71344, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71344, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.j.a a2 = com.ss.android.ugc.aweme.account.j.a.a();
        if (PatchProxy.isSupport(new Object[]{str}, a2, com.ss.android.ugc.aweme.account.j.a.f31994a, false, 20877, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, a2, com.ss.android.ugc.aweme.account.j.a.f31994a, false, 20877, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (a2.f31996b.isLogin()) {
            g.b().c(new b(System.currentTimeMillis(), a2.f31996b.getCurUser()));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                str2 = "other";
            } else {
                str2 = str;
            }
            jSONObject.put("type", str2);
            jSONObject.put("exception", Log.getStackTraceString(new Exception()));
            n.b("aweme_user_logout", "", jSONObject);
        } catch (Exception unused) {
        }
        a2.f31997c = a2.f31996b.getCurUserId();
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.ugc.aweme.account.j.a.f31994a, false, 20878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.ugc.aweme.account.j.a.f31994a, false, 20878, new Class[0], Void.TYPE);
            return;
        }
        m.a().a(a2.f31998d, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32000a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f32000a, false, 20885, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f32000a, false, 20885, new Class[0], Object.class);
                }
                ((e) w.a(e.class)).b("https://aweme.snssdk.com/aweme/v1/check/out/");
                return null;
            }
        }, 123);
    }

    @CallSuper
    public void showLoginAndRegisterView(@NonNull IAccountService.c cVar) {
        boolean z;
        IAccountService.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71340, new Class[]{IAccountService.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71340, new Class[]{IAccountService.c.class}, Void.TYPE);
            return;
        }
        this.mLoginParam = cVar2;
        if (!this.mLoginParam.f31563d.getBoolean("is_multi_account", false)) {
            if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.account.util.n.f33102a, true, 21392, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.account.util.n.f33102a, true, 21392, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = com.ss.android.ugc.aweme.account.util.n.f().getBoolean("account_terminal_app_has_logged_out", true);
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.account.terminal.a.f32775a, true, 20929, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, com.ss.android.ugc.aweme.account.terminal.a.f32775a, true, 20929, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                a.C0415a aVar = com.ss.android.ugc.aweme.account.terminal.a.f32778d;
                Object[] objArr = {Byte.valueOf(z)};
                if (PatchProxy.isSupport(objArr, aVar, a.C0415a.f32779a, false, 20936, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    Object[] objArr2 = {Byte.valueOf(z)};
                    Object[] objArr3 = objArr2;
                    a.C0415a aVar2 = aVar;
                    PatchProxy.accessDispatch(objArr3, aVar2, a.C0415a.f32779a, false, 20936, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else if (!z) {
                    if (com.ss.android.ugc.aweme.g.a.a()) {
                        Locale locale = Locale.US;
                        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                        Intrinsics.checkExpressionValueIsNotNull(String.format(locale, "monitorAutoLogout(%b)", Arrays.copyOf(new Object[]{Boolean.valueOf(z)}, 1)), "java.lang.String.format(locale, format, *args)");
                    }
                    com.ss.android.ugc.aweme.account.util.n.g(true);
                    n.a("monitor_account_business", 1, aVar.a("auto_logout", com.ss.android.ugc.aweme.account.terminal.a.f32777c));
                }
            }
        }
        com.ss.android.ugc.aweme.account.terminal.a.a("OpenLogin");
        if (!this.mKeepCallback && (cVar2.f31560a instanceof LifecycleOwner)) {
            ((LifecycleOwner) cVar2.f31560a).getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    @CallSuper
    public void loginByPlatform(@NonNull IAccountService.c cVar, @NonNull com.ss.android.ugc.aweme.account.bean.a aVar) {
        if (PatchProxy.isSupport(new Object[]{cVar, aVar}, this, changeQuickRedirect, false, 71343, new Class[]{IAccountService.c.class, com.ss.android.ugc.aweme.account.bean.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, aVar}, this, changeQuickRedirect, false, 71343, new Class[]{IAccountService.c.class, com.ss.android.ugc.aweme.account.bean.a.class}, Void.TYPE);
            return;
        }
        this.mLoginParam = cVar;
        i.f32241a = cVar.f31563d.getString("enter_method", "");
        i.f32242b = cVar.f31563d.getString("enter_from", "");
        if (!this.mKeepCallback && (cVar.f31560a instanceof LifecycleOwner)) {
            ((LifecycleOwner) cVar.f31560a).getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    public boolean needIntercept(@IAccountService.ActionType int i, @Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj}, this, changeQuickRedirect, false, 71351, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj}, this, changeQuickRedirect, false, 71351, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this.mLoginParam == null || this.mLoginParam.f31565f == null || !this.mLoginParam.f31565f.a(i, obj)) {
            return false;
        } else {
            return true;
        }
    }

    public void notifyProgress(@IAccountService.ViewPage int i, @IAccountService.ActionProgress int i2, @Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 71352, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, changeQuickRedirect, false, 71352, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (!(this.mLoginParam == null || this.mLoginParam.g == null)) {
            int i3 = i;
            int i4 = i2;
            this.mLoginParam.g.a(i, i2, str2);
        }
    }

    public void returnResult(@IAccountService.ActionType int i, @IAccountService.ActionResult int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71350, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71350, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (!(this.mLoginParam == null || this.mLoginParam.f31564e == null)) {
            int i3 = i;
            int i4 = i2;
            this.mLoginParam.f31564e.a(i, i2, obj2);
            this.mLoginParam = null;
        }
    }

    public void switchAccount(String str, @Nullable Bundle bundle, @Nullable f fVar) {
        String str2 = str;
        Bundle bundle2 = bundle;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{str2, bundle2, fVar2}, this, changeQuickRedirect, false, 71345, new Class[]{String.class, Bundle.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bundle2, fVar2}, this, changeQuickRedirect, false, 71345, new Class[]{String.class, Bundle.class, f.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.j.a.a().a(str2, bundle2, fVar2);
    }
}
