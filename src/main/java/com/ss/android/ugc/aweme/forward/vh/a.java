package com.ss.android.ugc.aweme.forward.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48401a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseForwardViewHolder f48402b;

    a(BaseForwardViewHolder baseForwardViewHolder) {
        this.f48402b = baseForwardViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48401a, false, 45597, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48401a, false, 45597, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f48402b.M();
    }
}
