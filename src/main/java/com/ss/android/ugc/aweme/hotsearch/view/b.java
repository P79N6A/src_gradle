package com.ss.android.ugc.aweme.hotsearch.view;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49872a;

    /* renamed from: b  reason: collision with root package name */
    private final a f49873b;

    b(a aVar) {
        this.f49873b = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49872a, false, 49838, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49872a, false, 49838, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a aVar = this.f49873b;
        aVar.f49870e.b();
        aVar.f49869d.setVisibility(0);
        aVar.f49868c.j();
    }
}
