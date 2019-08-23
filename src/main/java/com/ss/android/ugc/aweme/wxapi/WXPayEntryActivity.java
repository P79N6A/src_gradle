package com.ss.android.ugc.aweme.wxapi;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.a;
import com.ss.android.ugc.aweme.sdk.IWalletService;

public class WXPayEntryActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76937a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f76937a, false, 90154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76937a, false, 90154, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (a.a().g != null) {
            a.a().g.a();
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76937a, false, 90153, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76937a, false, 90153, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.onWxIntent(this, getIntent());
        }
        if (a.a().g == null) {
            finish();
        }
    }
}
