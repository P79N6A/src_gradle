package com.ss.android.ugc.aweme.share;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64700a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractDownloadedVideoShareDialog f64701b;

    b(AbstractDownloadedVideoShareDialog abstractDownloadedVideoShareDialog) {
        this.f64701b = abstractDownloadedVideoShareDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64700a, false, 72914, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64700a, false, 72914, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f64701b.dismiss();
    }
}
