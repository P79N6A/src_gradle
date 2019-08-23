package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68604a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnClickListener f68605b = new i();

    private i() {
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f68604a, false, 77965, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f68604a, false, 77965, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }
}
