package com.ss.android.ugc.aweme.di;

import com.bytedance.debugbox.base.IDebugBoxService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.u;
import com.ss.android.ugc.aweme.util.i;
import dagger.internal.c;
import dagger.internal.e;

public final class au implements c<IDebugBoxService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41418a;

    /* renamed from: b  reason: collision with root package name */
    static final au f41419b = new au();

    public final /* synthetic */ Object get() {
        IDebugBoxService iDebugBoxService;
        if (PatchProxy.isSupport(new Object[0], this, f41418a, false, 35396, new Class[0], IDebugBoxService.class)) {
            return (IDebugBoxService) PatchProxy.accessDispatch(new Object[0], this, f41418a, false, 35396, new Class[0], IDebugBoxService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41418a, true, 35397, new Class[0], IDebugBoxService.class)) {
            return (IDebugBoxService) PatchProxy.accessDispatch(new Object[0], null, f41418a, true, 35397, new Class[0], IDebugBoxService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41418a, true, 35398, new Class[0], IDebugBoxService.class)) {
                return (IDebugBoxService) PatchProxy.accessDispatch(new Object[0], null, f41418a, true, 35398, new Class[0], IDebugBoxService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, as.f41415a, true, 35391, new Class[0], IDebugBoxService.class)) {
                iDebugBoxService = (IDebugBoxService) PatchProxy.accessDispatch(new Object[0], null, as.f41415a, true, 35391, new Class[0], IDebugBoxService.class);
            } else {
                iDebugBoxService = (IDebugBoxService) u.a("com.bytedance.debugbox.base.DebugBoxService", i.class);
            }
            return (IDebugBoxService) e.a(iDebugBoxService, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
