package com.ss.android.ugc.aweme.share;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65209a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnClickListener f65210b = new j();

    private j() {
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65209a, false, 72941, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65209a, false, 72941, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
    }
}
