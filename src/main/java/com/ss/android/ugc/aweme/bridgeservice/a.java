package com.ss.android.ugc.aweme.bridgeservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35249a;

    public static IBridgeService a() {
        return PatchProxy.isSupport(new Object[0], null, f35249a, true, 25711, new Class[0], IBridgeService.class) ? (IBridgeService) PatchProxy.accessDispatch(new Object[0], null, f35249a, true, 25711, new Class[0], IBridgeService.class) : (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
    }
}
