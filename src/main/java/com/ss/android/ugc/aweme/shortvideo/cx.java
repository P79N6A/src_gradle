package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.n;

public final /* synthetic */ class cx implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66721a;

    /* renamed from: b  reason: collision with root package name */
    private final cw f66722b;

    cx(cw cwVar) {
        this.f66722b = cwVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f66721a, false, 74238, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f66721a, false, 74238, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        cw cwVar = this.f66722b;
        cwVar.f66711b.q().a((Object) cwVar.f66711b, (bc) new n());
    }
}
