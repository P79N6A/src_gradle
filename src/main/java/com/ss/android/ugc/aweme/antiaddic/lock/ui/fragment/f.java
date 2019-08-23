package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity;
import com.ss.android.ugc.aweme.mobile.a.a;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33526a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeLockOptionsFragment f33527b;

    f(TimeLockOptionsFragment timeLockOptionsFragment) {
        this.f33527b = timeLockOptionsFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33526a, false, 21983, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33526a, false, 21983, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TimeLockOptionsFragment timeLockOptionsFragment = this.f33527b;
        ((BaseLockActivity) timeLockOptionsFragment.getActivity()).a(a.a(TimeLockSetFragment.class).a("from_change_pwd", true).a());
    }
}
