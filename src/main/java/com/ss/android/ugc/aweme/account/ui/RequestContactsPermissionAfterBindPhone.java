package com.ss.android.ugc.aweme.account.ui;

import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public class RequestContactsPermissionAfterBindPhone extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32924a;

    /* renamed from: b  reason: collision with root package name */
    private String f32925b;

    public final int a() {
        return C0906R.layout.cr;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32924a, false, 21160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32924a, false, 21160, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32924a, false, 21161, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32924a, false, 21161, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32924a, false, 21159, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32924a, false, 21159, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone", "onCreate", true);
        super.onCreate(bundle);
        this.f32925b = getIntent().getStringExtra("ENTER_REASON");
        Dialog requestContactsPermissionAfterBindMobile = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).requestContactsPermissionAfterBindMobile(this, this.f32925b);
        if (requestContactsPermissionAfterBindMobile == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone", "onCreate", false);
            return;
        }
        requestContactsPermissionAfterBindMobile.setOnDismissListener(new q(this));
        requestContactsPermissionAfterBindMobile.show();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone", "onCreate", false);
    }
}
