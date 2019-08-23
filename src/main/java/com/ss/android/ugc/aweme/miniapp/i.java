package com.ss.android.ugc.aweme.miniapp;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.views.a;
import com.tt.miniapphost.permission.IPermissionsResultAction;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55775a;

    /* renamed from: b  reason: collision with root package name */
    private final IPermissionsResultAction f55776b;

    /* renamed from: c  reason: collision with root package name */
    private final String f55777c;

    /* renamed from: d  reason: collision with root package name */
    private final a f55778d;

    public i(IPermissionsResultAction iPermissionsResultAction, String str, a aVar) {
        this.f55776b = iPermissionsResultAction;
        this.f55777c = str;
        this.f55778d = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55775a, false, 59023, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55775a, false, 59023, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        IPermissionsResultAction iPermissionsResultAction = this.f55776b;
        String str = this.f55777c;
        a aVar = this.f55778d;
        iPermissionsResultAction.onDenied(str);
        aVar.dismiss();
    }
}
