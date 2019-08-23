package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class al implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62467a;

    /* renamed from: b  reason: collision with root package name */
    private final MusAbsProfileFragment f62468b;

    al(MusAbsProfileFragment musAbsProfileFragment) {
        this.f62468b = musAbsProfileFragment;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f62467a, false, 68230, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f62467a, false, 68230, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f62468b.d(view2);
    }
}
