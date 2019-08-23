package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.BridgeService;
import dagger.internal.c;
import dagger.internal.e;

public final class k implements c<IBridgeService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41450a;

    /* renamed from: b  reason: collision with root package name */
    static final k f41451b = new k();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41450a, false, 35235, new Class[0], IBridgeService.class)) {
            return (IBridgeService) PatchProxy.accessDispatch(new Object[0], this, f41450a, false, 35235, new Class[0], IBridgeService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41450a, true, 35236, new Class[0], IBridgeService.class)) {
            return (IBridgeService) PatchProxy.accessDispatch(new Object[0], null, f41450a, true, 35236, new Class[0], IBridgeService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41450a, true, 35237, new Class[0], IBridgeService.class)) {
                return (IBridgeService) PatchProxy.accessDispatch(new Object[0], null, f41450a, true, 35237, new Class[0], IBridgeService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35174, new Class[0], IBridgeService.class)) {
                obj = (IBridgeService) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35174, new Class[0], IBridgeService.class);
            } else {
                obj = new BridgeService();
            }
            return (IBridgeService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
