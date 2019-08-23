package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33516a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeLockAboutFragment f33517b;

    a(TimeLockAboutFragment timeLockAboutFragment) {
        this.f33517b = timeLockAboutFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33516a, false, 21960, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33516a, false, 21960, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f33517b.getActivity().onBackPressed();
    }
}
