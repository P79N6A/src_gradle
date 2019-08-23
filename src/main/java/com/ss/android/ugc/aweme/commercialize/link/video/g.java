package com.ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39006a;

    /* renamed from: b  reason: collision with root package name */
    private final f f39007b;

    g(f fVar) {
        this.f39007b = fVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39006a, false, 30929, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39006a, false, 30929, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        f fVar = this.f39007b;
        if (fVar.f39003b != null) {
            fVar.f39003b.b();
        }
    }
}
