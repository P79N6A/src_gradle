package com.ss.android.ugc.aweme.dmt_integration;

import android.app.Application;
import android.support.annotation.Keep;
import com.google.common.a.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.services.IAVInitializer;

@Keep
public class AVInitializerImpl implements IAVInitializer {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void initialize(Application application) {
        if (PatchProxy.isSupport(new Object[]{application}, this, changeQuickRedirect, false, 38335, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, this, changeQuickRedirect, false, 38335, new Class[]{Application.class}, Void.TYPE);
            return;
        }
        a aVar = new a();
        if (PatchProxy.isSupport(new Object[]{application, aVar}, null, l.f61141a, true, 67157, new Class[]{Application.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application, aVar}, null, l.f61141a, true, 67157, new Class[]{Application.class, k.class}, Void.TYPE);
            return;
        }
        l.f61142b = (Application) m.a(application);
        l.f61143c = (k) m.a(aVar);
    }
}
