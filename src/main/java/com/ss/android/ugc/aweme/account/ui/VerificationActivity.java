package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;

public class VerificationActivity extends BaseAccountActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32945a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32945a, false, 21198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32945a, false, 21198, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.VerificationActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.VerificationActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32945a, false, 21199, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32945a, false, 21199, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.VerificationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32945a, false, 21197, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32945a, false, 21197, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.VerificationActivity", "onCreate", true);
        super.onCreate(bundle);
        ((AccountOpeModel) ViewModelProviders.of((FragmentActivity) this).get(AccountOpeModel.class)).f32738a.observe(this, new s(this));
        int intExtra = getIntent().getIntExtra("verify_type", 1024);
        if (intExtra == 1024) {
            a(VerifyIDCardFragment.a(""));
        } else if (intExtra == 2048) {
            User k = w.k();
            if (k != null) {
                str = k.getBindPhone();
            } else {
                str = "";
            }
            a(VerificationCodeFragment.b(6, str, "", "", ""));
        } else if (intExtra == 3072) {
            a(VerifyIDCardFragment.a(getIntent().getStringExtra("shark_ticket")));
        } else if (intExtra == 4096) {
            a(VerificationCodeFragment.b(7, getIntent().getStringExtra("phone"), "", getIntent().getStringExtra("shark_ticket"), ""));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.VerificationActivity", "onCreate", false);
    }
}
