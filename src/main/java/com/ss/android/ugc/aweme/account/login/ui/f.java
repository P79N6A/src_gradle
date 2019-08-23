package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.b;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32616a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseResetPasswordFragment f32617b;

    f(BaseResetPasswordFragment baseResetPasswordFragment) {
        this.f32617b = baseResetPasswordFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32616a, false, 20504, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32616a, false, 20504, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        BaseResetPasswordFragment baseResetPasswordFragment = this.f32617b;
        if (view.getId() == C0906R.id.as6) {
            ((b) baseResetPasswordFragment.getActivity()).b();
        }
    }
}
