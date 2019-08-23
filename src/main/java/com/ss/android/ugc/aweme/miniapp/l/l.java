package com.ss.android.ugc.aweme.miniapp.l;

import android.content.Context;
import com.bytedance.frameworks.plugin.pm.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppbrandHostConstants;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55851a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f55852b;

    public l(Context context) {
        this.f55852b = context;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55851a, false, 59581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55851a, false, 59581, new Class[0], Void.TYPE);
            return;
        }
        Context context = this.f55852b;
        if (AppbrandHostConstants.getProcessManager() != null) {
            AppbrandHostConstants.getProcessManager().preloadEmptyProcess(context, c.b("com.ss.android.ugc.aweme.miniappplugin"));
        }
    }
}
