package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.authorize.f;
import com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerActivity;
import com.ss.android.ugc.aweme.account.ui.BindMobileActivity;
import com.ss.android.ugc.aweme.ag.h;

@Keep
public class AccountService extends h {
    public static ChangeQuickRedirect changeQuickRedirect;

    public f<?> getAuthSdkInstance(String str) {
        return null;
    }

    public Class<? extends Activity> getThirdPartyCustomLoginActivity(String str) {
        return null;
    }

    public void initAuthSdk(String str, String str2) {
    }

    public void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 19324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 19324, new Class[0], Void.TYPE);
            return;
        }
        super.init();
        h.a("aweme://bind/mobile/", BindMobileActivity.class);
        h.a("aweme://login_device_manager", LoginDeviceManagerActivity.class);
    }
}
