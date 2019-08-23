package com.ss.android.ugc.aweme.profile.ui.widget;

import a.g;
import a.i;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.RemarkApi;
import java.util.Map;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63156a;

    /* renamed from: b  reason: collision with root package name */
    private final RemarkEditDialog f63157b;

    l(RemarkEditDialog remarkEditDialog) {
        this.f63157b = remarkEditDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f63156a, false, 69859, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f63156a, false, 69859, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        RemarkEditDialog remarkEditDialog = this.f63157b;
        if (remarkEditDialog.i == 1) {
            r.a("remark_toast", (Map) d.a().a("action_type", "confirm").f34114b);
        }
        String obj = remarkEditDialog.f63092c.getText().toString();
        if (PatchProxy.isSupport(new Object[]{obj}, remarkEditDialog, RemarkEditDialog.f63090a, false, 69857, new Class[]{String.class}, Void.TYPE)) {
            RemarkEditDialog remarkEditDialog2 = remarkEditDialog;
            PatchProxy.accessDispatch(new Object[]{obj}, remarkEditDialog2, RemarkEditDialog.f63090a, false, 69857, new Class[]{String.class}, Void.TYPE);
        } else if (!(remarkEditDialog.g == null || remarkEditDialog.f63091b == null)) {
            ((RemarkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RemarkApi.class)).commitRemarkName(obj, remarkEditDialog.g.getUid(), remarkEditDialog.g.getSecUid()).a((g<TResult, TContinuationResult>) new o<TResult,TContinuationResult>(remarkEditDialog, obj), i.f1052b);
        }
        remarkEditDialog.dismiss();
    }
}
