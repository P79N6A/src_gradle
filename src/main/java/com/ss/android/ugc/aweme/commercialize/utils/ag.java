package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.smartphone.a;
import com.ss.android.ad.smartphone.a.b;
import com.ss.android.common.AppContext;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.d;

public final /* synthetic */ class ag implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39691a;

    /* renamed from: b  reason: collision with root package name */
    private final AppContext f39692b;

    ag(AppContext appContext) {
        this.f39692b = appContext;
    }

    public final a a() {
        if (PatchProxy.isSupport(new Object[0], this, f39691a, false, 32563, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f39691a, false, 32563, new Class[0], a.class);
        }
        AppContext appContext = this.f39692b;
        a.C0238a aVar = new a.C0238a();
        aVar.g = String.valueOf(AppLog.getAppId());
        aVar.f22710e = appContext.getVersion();
        aVar.f22706a = AppLog.getServerDeviceId();
        aVar.f22709d = d.a().getCurUser().getShortId();
        aVar.f22711f = String.valueOf(appContext.getVersionCode());
        return new a(aVar, (byte) 0);
    }
}
