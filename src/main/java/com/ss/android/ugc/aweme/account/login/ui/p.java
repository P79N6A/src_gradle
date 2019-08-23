package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32639a;

    /* renamed from: b  reason: collision with root package name */
    private final OneLoginFragment f32640b;

    p(OneLoginFragment oneLoginFragment) {
        this.f32640b = oneLoginFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32639a, false, 20644, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32639a, false, 20644, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        OneLoginFragment oneLoginFragment = this.f32640b;
        if (view.getId() == C0906R.id.dms && oneLoginFragment.getActivity() != null) {
            oneLoginFragment.getActivity().onBackPressed();
        }
    }
}
