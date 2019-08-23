package com.ss.android.ugc.aweme.share;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65213a;

    /* renamed from: b  reason: collision with root package name */
    private final e f65214b;

    l(e eVar) {
        this.f65214b = eVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65213a, false, 72943, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65213a, false, 72943, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f65214b.dismiss();
    }
}
