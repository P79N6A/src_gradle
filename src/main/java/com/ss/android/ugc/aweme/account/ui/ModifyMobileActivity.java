package com.ss.android.ugc.aweme.account.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.w;

public class ModifyMobileActivity extends BaseAccountActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32896a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32896a, false, 21127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32896a, false, 21127, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32896a, false, 21128, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32896a, false, 21128, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32896a, false, 21126, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32896a, false, 21126, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onCreate", true);
        super.onCreate(bundle);
        ((AccountOpeModel) ViewModelProviders.of((FragmentActivity) this).get(AccountOpeModel.class)).f32738a.observe(this, new p(this));
        a(BindMobileInputPhoneFragment.a("", 3));
        r.a((Context) this, "modify_phone_in", "phone", w.e(), 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity", "onCreate", false);
    }
}
