package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32656a;

    /* renamed from: b  reason: collision with root package name */
    private final PhonePassLoginView f32657b;

    y(PhonePassLoginView phonePassLoginView) {
        this.f32657b = phonePassLoginView;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32656a, false, 20734, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32656a, false, 20734, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhonePassLoginView phonePassLoginView = this.f32657b;
        if (!phonePassLoginView.f32555e) {
            phonePassLoginView.c();
        }
        phonePassLoginView.a(true ^ phonePassLoginView.f32555e);
    }
}
