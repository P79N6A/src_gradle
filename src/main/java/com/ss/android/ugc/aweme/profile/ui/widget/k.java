package com.ss.android.ugc.aweme.profile.ui.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63154a;

    /* renamed from: b  reason: collision with root package name */
    private final RemarkEditDialog f63155b;

    k(RemarkEditDialog remarkEditDialog) {
        this.f63155b = remarkEditDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f63154a, false, 69858, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63154a, false, 69858, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        RemarkEditDialog remarkEditDialog = this.f63155b;
        if (remarkEditDialog.i == 1) {
            r.a("remark_toast", (Map) d.a().a("action_type", "cancel").f34114b);
        }
        remarkEditDialog.dismiss();
    }
}
