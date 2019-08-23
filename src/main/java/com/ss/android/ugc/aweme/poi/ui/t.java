package com.ss.android.ugc.aweme.poi.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60897a;

    /* renamed from: b  reason: collision with root package name */
    private final s f60898b;

    t(s sVar) {
        this.f60898b = sVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60897a, false, 66107, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60897a, false, 66107, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        s sVar = this.f60898b;
        sVar.a("click");
        sVar.dismiss();
    }
}
