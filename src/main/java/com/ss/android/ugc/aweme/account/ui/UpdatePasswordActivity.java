package com.ss.android.ugc.aweme.account.ui;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.AccountOpeModel;

public class UpdatePasswordActivity extends BaseAccountActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32939a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32939a, false, 21186, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32939a, false, 21186, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32939a, false, 21187, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32939a, false, 21187, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32939a, false, 21185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32939a, false, 21185, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f32939a, false, 21184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32939a, false, 21184, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).init();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32939a, false, 21183, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32939a, false, 21183, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onCreate", true);
        super.onCreate(bundle);
        a(new UpdatePwdCommitPwdFragment());
        ((AccountOpeModel) ViewModelProviders.of((FragmentActivity) this).get(AccountOpeModel.class)).f32738a.observe(this, new r(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.UpdatePasswordActivity", "onCreate", false);
    }
}
