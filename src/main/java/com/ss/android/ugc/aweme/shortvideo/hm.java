package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.vesdk.i;

public final class hm {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68160a;

    public final i a() {
        if (PatchProxy.isSupport(new Object[0], this, f68160a, false, 74857, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f68160a, false, 74857, new Class[0], i.class);
        }
        i iVar = new i();
        iVar.f77999a = a.f61121d.d();
        iVar.f78001c = AppLog.getServerDeviceId();
        iVar.f78000b = AppLog.getUserId();
        return iVar;
    }
}
