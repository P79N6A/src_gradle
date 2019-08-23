package com.ss.android.ugc.aweme.account.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31953a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseBindMobileInputPhoneFragmentV2 f31954b;

    a(BaseBindMobileInputPhoneFragmentV2 baseBindMobileInputPhoneFragmentV2) {
        this.f31954b = baseBindMobileInputPhoneFragmentV2;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f31953a, false, 19899, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f31953a, false, 19899, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f31954b.onClick(view2);
    }
}
