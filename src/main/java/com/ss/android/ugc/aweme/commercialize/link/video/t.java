package com.ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39046a;

    /* renamed from: b  reason: collision with root package name */
    private final s f39047b;

    t(s sVar) {
        this.f39047b = sVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39046a, false, 30950, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39046a, false, 30950, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        s sVar = this.f39047b;
        if (sVar.f39041b != null) {
            sVar.f39041b.b();
        }
    }
}
