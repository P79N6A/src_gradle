package com.ss.android.ugc.aweme.setting.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64442a;

    /* renamed from: b  reason: collision with root package name */
    private final o f64443b;

    p(o oVar) {
        this.f64443b = oVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64442a, false, 72584, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64442a, false, 72584, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        o oVar = this.f64443b;
        if (oVar.o == null) {
            oVar.setChecked(true ^ oVar.c());
            return;
        }
        if (!oVar.o.a(oVar)) {
            oVar.setChecked(true ^ oVar.c());
        }
    }
}
