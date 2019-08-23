package com.ss.android.ugc.aweme.app.application.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.statistic.a;
import com.ss.android.statistic.d;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33932a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33933b;

    f(String str) {
        this.f33933b = str;
    }

    public final void run() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33932a, false, 23243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33932a, false, 23243, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f33933b;
        a aVar = d.a().f2563b;
        if (aVar != null) {
            aVar.f2560e = str;
            d.a().a(aVar);
        }
        AwemeAppData.p().b(false);
        String installId = AppLog.getInstallId();
        if (installId == null) {
            installId = "";
        }
        com.ss.android.ugc.aweme.sec.a.a(str, installId);
        if (AwemeAppData.p().b() != i.a().getVersionCode()) {
            z = true;
        }
        if (z) {
            com.ss.android.ugc.aweme.sec.a.a("install");
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new GeckoCheckInRequest()).a();
    }
}
