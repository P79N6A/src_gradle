package com.ss.android.ugc.aweme.live.hostbusiness;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.a.a;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53416a;

    /* renamed from: b  reason: collision with root package name */
    private final b f53417b;

    c(b bVar) {
        this.f53417b = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f53416a, false, 55687, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f53416a, false, 55687, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        b bVar = this.f53417b;
        bVar.dismiss();
        bVar.f3434e.a(a.f53187c);
    }
}
