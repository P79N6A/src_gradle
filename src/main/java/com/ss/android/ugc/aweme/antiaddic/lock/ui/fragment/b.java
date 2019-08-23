package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mobile.a.a;
import java.util.Map;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33518a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeLockAboutFragment f33519b;

    b(TimeLockAboutFragment timeLockAboutFragment) {
        this.f33519b = timeLockAboutFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33518a, false, 21961, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33518a, false, 21961, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        TimeLockAboutFragment timeLockAboutFragment = this.f33519b;
        r.a("open_teen_protection", (Map) d.a().f34114b);
        ((BaseLockActivity) timeLockAboutFragment.getActivity()).a(a.a(TimeLockSetFragment.class).a());
    }
}
