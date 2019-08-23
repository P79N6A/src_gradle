package com.ss.android.ugc.aweme.ttplatformapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.c.b;
import com.ss.android.ttplatformsdk.b.a;
import com.ss.android.ttplatformsdk.d.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.AwemeSSOPlatformUtils;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public class TtAuthorizeActivity extends a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f4273c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f4274d = "TtAuthorizeActivity";

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4273c, false, 87340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87340, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4273c, false, 87341, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4273c, false, 87341, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4273c, false, 87333, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87333, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            z = d.a().isLogin();
        } catch (Exception unused) {
        }
        return z;
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f4273c, false, 87334, new Class[0], Boolean.TYPE)) {
            return NetworkUtils.isNetworkAvailable(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87334, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f4273c, false, 87335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87335, new Class[0], Void.TYPE);
            return;
        }
        c.b().showLoginAndRegisterView(new IAccountService.d().a((Activity) this).a("toutiao").a());
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f4273c, false, 87337, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87337, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.hx).a();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4273c, false, 87338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87338, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f4273c, false, 87330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87330, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
    }

    public final com.ss.android.ttplatformsdk.b.a a() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f4273c, false, 87332, new Class[0], com.ss.android.ttplatformsdk.b.a.class)) {
            return (com.ss.android.ttplatformsdk.b.a) PatchProxy.accessDispatch(new Object[0], this, f4273c, false, 87332, new Class[0], com.ss.android.ttplatformsdk.b.a.class);
        }
        String str3 = "";
        CookieManager instance = CookieManager.getInstance();
        if (instance == null) {
            str = "";
        } else {
            str = instance.getCookie(b.f2437f);
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String[] split2 = split[i].split("=");
                if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                    str3 = split2[1];
                    break;
                }
                i++;
            }
        }
        String str4 = "";
        String str5 = "";
        String str6 = "";
        User curUser = d.a().getCurUser();
        if (curUser != null) {
            str4 = String.valueOf(curUser.getUid());
            str5 = curUser.getNickname();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().size() <= 0) {
                str2 = "";
            } else {
                str2 = avatarMedium.getUrlList().get(0);
            }
            str6 = str2;
        }
        a.C0393a aVar = new a.C0393a();
        aVar.f31131a.f31130f = Uri.encode(str3);
        aVar.f31131a.g = Uri.encode(str4);
        aVar.f31131a.h = Uri.encode(str5);
        aVar.f31131a.i = Uri.encode(str6);
        String string = getString(C0906R.string.cc8);
        if (!TextUtils.isEmpty(string)) {
            aVar.f31131a.f31126b = string;
            return aVar.f31131a;
        }
        throw new IllegalArgumentException("titleBarTitleText is empty");
    }

    @Subscribe
    public void onUpdateUserEvent(com.ss.android.ugc.aweme.base.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4273c, false, 87339, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f4273c, false, 87339, new Class[]{com.ss.android.ugc.aweme.base.a.b.class}, Void.TYPE);
            return;
        }
        AwemeSSOPlatformUtils.a();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4273c, false, 87329, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4273c, false, 87329, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onCreate", true);
        bg.c(this);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttplatformapi.TtAuthorizeActivity", "onCreate", false);
    }

    public final void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f4273c, false, 87336, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f4273c, false, 87336, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, str2).a();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f4273c, false, 87331, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f4273c, false, 87331, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
