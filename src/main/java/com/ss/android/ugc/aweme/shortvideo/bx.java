package com.ss.android.ugc.aweme.shortvideo;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bx implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65850a;

    /* renamed from: b  reason: collision with root package name */
    private final bw f65851b;

    bx(bw bwVar) {
        this.f65851b = bwVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65850a, false, 74161, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65850a, false, 74161, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        bw bwVar = this.f65851b;
        bwVar.a(bwVar.f65844d.substring(bwVar.f65844d.lastIndexOf(35) + 1, bwVar.f65844d.length()));
    }
}
