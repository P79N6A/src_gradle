package com.ss.android.ugc.aweme.profile.ui.widget;

import a.g;
import a.i;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class n implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63160a;

    /* renamed from: b  reason: collision with root package name */
    private final RemarkEditDialog f63161b;

    n(RemarkEditDialog remarkEditDialog) {
        this.f63161b = remarkEditDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f63160a, false, 69861, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f63160a, false, 69861, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        RemarkEditDialog remarkEditDialog = this.f63161b;
        if (remarkEditDialog.i == 1) {
            r.a("remark_toast", (Map) d.a().a("action_type", "show").f34114b);
        }
        i.a(100).a((g<TResult, TContinuationResult>) new p<TResult,TContinuationResult>(remarkEditDialog), i.f1052b);
    }
}
