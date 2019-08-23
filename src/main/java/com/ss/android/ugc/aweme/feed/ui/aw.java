package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.i.a;

public final /* synthetic */ class aw implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46530a;

    /* renamed from: b  reason: collision with root package name */
    private final PrivateDialog f46531b;

    aw(PrivateDialog privateDialog) {
        this.f46531b = privateDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46530a, false, 42947, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46530a, false, 42947, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PrivateDialog privateDialog = this.f46531b;
        new a().a(privateDialog.f46238f, privateDialog.f46235c, privateDialog.f46237e);
        privateDialog.dismiss();
    }
}
