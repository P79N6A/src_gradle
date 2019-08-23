package com.ss.android.ugc.aweme.profile.ui.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63158a;

    /* renamed from: b  reason: collision with root package name */
    private final RemarkEditDialog f63159b;

    m(RemarkEditDialog remarkEditDialog) {
        this.f63159b = remarkEditDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f63158a, false, 69860, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63158a, false, 69860, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        RemarkEditDialog remarkEditDialog = this.f63159b;
        if (remarkEditDialog.f63092c != null) {
            remarkEditDialog.f63092c.setText("");
        }
    }
}
