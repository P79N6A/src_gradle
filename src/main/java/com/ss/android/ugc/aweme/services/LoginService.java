package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.sdk.account.i.c.b;
import com.bytedance.sdk.account.i.c.c;
import com.bytedance.sdk.account.i.c.d;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.bean.a;
import com.ss.android.ugc.aweme.account.login.g;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity;
import com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerActivity;
import com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.b;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LoginService extends BaseLoginService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public LoginService() {
        initOneLogin(b.f34450b);
    }

    @NonNull
    public List<a> getAllSupportedLoginPlatform() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71400, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71400, new Class[0], List.class);
        }
        LinkedList linkedList = new LinkedList(super.getAllSupportedLoginPlatform());
        linkedList.add(new a("头条", 2130839827, "toutiao_v2"));
        linkedList.add(new a("QQ", 2130839822, "qzone_sns"));
        linkedList.add(new a("微信", 2130839829, "weixin"));
        linkedList.add(new a("微博", 2130839824, "sina_weibo"));
        return linkedList;
    }

    public boolean isLoginActivity(Activity activity) {
        return activity instanceof LoginOrRegisterActivity;
    }

    public void showLoginView(@NonNull IAccountService.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 71399, new Class[]{IAccountService.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 71399, new Class[]{IAccountService.c.class}, Void.TYPE);
            return;
        }
        showLoginAndRegisterView(cVar);
    }

    private void initOneLogin(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 71406, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 71406, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.bytedance.sdk.account.i.c.b bVar = new com.bytedance.sdk.account.i.c.b();
        bVar.f22448a = new b.a("300011868753", "F97E4FAA9B4741B38EDCDD46F6CEE81E", 3000);
        bVar.f22450c = new b.c("99166000000000000307", "8cac9cb3369e3a8f8e41d167df66cd81", 3000);
        b.C0234b bVar2 = new b.C0234b("8025433306", "ZFtFN8fq01hdiq0ygEaG4BYvRQt24CrE", 3000, 3000, 3000);
        bVar.f22449b = bVar2;
        c cVar = new c(context2, new d(bVar).f22494a);
        com.bytedance.sdk.account.i.b.c.f22436a.put(com.bytedance.sdk.account.i.a.b.class, cVar);
    }

    private boolean isPlatformBanned(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71407, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71407, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        ArrayList<String> stringArrayList = w.c().f31563d.getStringArrayList("authorize_hide_platforms");
        if (CollectionUtils.isEmpty(stringArrayList)) {
            return false;
        }
        return stringArrayList.contains(str2);
    }

    public void openPrivacyPolicy(@NonNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, changeQuickRedirect, false, 71403, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, changeQuickRedirect, false, 71403, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        ((v) w.a(v.class)).a((Context) w.b(), "https://www.douyin.com/falcon/douyin_falcon/privacy_agreement/", true);
    }

    public void openTermsOfUseProtocol(@NonNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, changeQuickRedirect, false, 71402, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, changeQuickRedirect, false, 71402, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        ((v) w.a(v.class)).a((Context) w.b(), "https://www.douyin.com/falcon/douyin_falcon/user_agreement/", true);
    }

    public void showLoginDeviceManagerPage(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 71405, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 71405, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        activity2.startActivity(new Intent(activity2, LoginDeviceManagerActivity.class));
    }

    public void showLoginAndRegisterView(@NonNull IAccountService.c cVar) {
        IAccountService.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71398, new Class[]{IAccountService.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71398, new Class[]{IAccountService.c.class}, Void.TYPE);
            return;
        }
        super.showLoginAndRegisterView(cVar);
        AnonymousClass1 r0 = new k<String>() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onFailure(Throwable th) {
            }

            public void onSuccess(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71410, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71410, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (PatchProxy.isSupport(new Object[]{str2}, null, n.f33102a, true, 21394, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, null, n.f33102a, true, 21394, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                n.h().edit().putString("aweme_login_setting_content", str2).commit();
            }
        };
        if (PatchProxy.isSupport(new Object[]{r0}, null, LoginSettingApi.f32698a, true, 20871, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{r0}, null, LoginSettingApi.f32698a, true, 20871, new Class[]{k.class}, Void.TYPE);
        } else {
            l.a(((LoginSettingApi.Api) ((IRetrofitService) w.a(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(LoginSettingApi.Api.class)).getLoginSetting(), r0, com.ss.android.ugc.aweme.e.a.b());
        }
        i.f32241a = cVar2.f31563d.getString("enter_method", "");
        i.f32242b = cVar2.f31563d.getString("enter_from", "");
        g.b().c(new LoginService$$Lambda$0(this, cVar2), a.i.f1052b).a((a.g<TResult, TContinuationResult>) new LoginService$$Lambda$1<TResult,TContinuationResult>(this, cVar2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ List lambda$showLoginAndRegisterView$0$LoginService(@NonNull IAccountService.c cVar, a.i iVar) throws Exception {
        int i;
        if (!cVar.f31563d.getBoolean("from_third_party_login")) {
            LoginMethodName loginMethodName = g.c().getLoginMethodName();
            String str = i.f32241a;
            String str2 = i.f32242b;
            String platform = platform(loginMethodName);
            if (loginMethodName == LoginMethodName.DEFAULT) {
                i = 0;
            } else {
                i = 1;
            }
            i.a(str, str2, platform, i);
        }
        return (List) iVar.e();
    }

    public void loginByPlatform(@NonNull IAccountService.c cVar, @NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{cVar, aVar}, this, changeQuickRedirect, false, 71401, new Class[]{IAccountService.c.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, aVar}, this, changeQuickRedirect, false, 71401, new Class[]{IAccountService.c.class, a.class}, Void.TYPE);
            return;
        }
        super.loginByPlatform(cVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void lambda$showLoginAndRegisterView$1$LoginService(@NonNull IAccountService.c cVar, a.i iVar) throws Exception {
        BaseLoginMethod baseLoginMethod;
        int i;
        if (cVar.f31563d.getBoolean("force_use_default_login_method", false)) {
            baseLoginMethod = new BaseLoginMethod();
        } else {
            baseLoginMethod = g.c();
        }
        if ((baseLoginMethod instanceof TPLoginMethod) && isPlatformBanned(((TPLoginMethod) baseLoginMethod).getPlatform())) {
            baseLoginMethod = new BaseLoginMethod();
        }
        if (cVar.f31560a != null && !cVar.f31560a.isFinishing()) {
            LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
            Intent intent = new Intent(cVar.f31560a, LoginOrRegisterActivity.class);
            intent.putExtras(cVar.f31563d);
            switch (loginMethodName) {
                case PHONE_NUMBER_PASS:
                case PHONE_SMS:
                    if (loginMethodName == LoginMethodName.PHONE_SMS) {
                        i = LoginOrRegisterActivity.q;
                    } else {
                        i = LoginOrRegisterActivity.r;
                    }
                    intent.putExtra("bundle_flow_type", i);
                    break;
                case THIRD_PARTY:
                    intent.putExtra("bundle_flow_type", LoginOrRegisterActivity.s);
                    intent.putExtra("bundle_login_method", (TPLoginMethod) baseLoginMethod);
                    break;
            }
            cVar.f31560a.startActivity(intent);
        }
        return null;
    }

    public void openFeedback(@NonNull Activity activity, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{activity, str, str2}, this, changeQuickRedirect, false, 71404, new Class[]{Activity.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, str, str2}, this, changeQuickRedirect, false, 71404, new Class[]{Activity.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.l.b.a(activity, str, str2);
    }
}
