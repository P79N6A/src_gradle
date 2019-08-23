package com.ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39020a;

    /* renamed from: b  reason: collision with root package name */
    private final j f39021b;

    k(j jVar) {
        this.f39021b = jVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39020a, false, 30938, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39020a, false, 30938, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        j jVar = this.f39021b;
        if (jVar.f39015b != null) {
            jVar.f39015b.b();
        }
    }
}
