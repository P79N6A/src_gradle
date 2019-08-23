package com.ss.android.ugc.aweme.miniapp;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.views.a;
import com.tt.miniapphost.permission.IPermissionsResultAction;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55799a;

    /* renamed from: b  reason: collision with root package name */
    private final IPermissionsResultAction f55800b;

    /* renamed from: c  reason: collision with root package name */
    private final a f55801c;

    public j(IPermissionsResultAction iPermissionsResultAction, a aVar) {
        this.f55800b = iPermissionsResultAction;
        this.f55801c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55799a, false, 59024, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55799a, false, 59024, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        IPermissionsResultAction iPermissionsResultAction = this.f55800b;
        a aVar = this.f55801c;
        iPermissionsResultAction.onGranted();
        aVar.dismiss();
    }
}
