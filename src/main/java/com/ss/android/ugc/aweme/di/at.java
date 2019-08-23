package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.u;
import com.ss.android.ugc.aweme.conan.IConanService;
import com.ss.android.ugc.aweme.util.h;
import dagger.internal.c;
import dagger.internal.e;

public final class at implements c<IConanService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41416a;

    /* renamed from: b  reason: collision with root package name */
    static final at f41417b = new at();

    public final /* synthetic */ Object get() {
        IConanService iConanService;
        if (PatchProxy.isSupport(new Object[0], this, f41416a, false, 35393, new Class[0], IConanService.class)) {
            return (IConanService) PatchProxy.accessDispatch(new Object[0], this, f41416a, false, 35393, new Class[0], IConanService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41416a, true, 35394, new Class[0], IConanService.class)) {
            return (IConanService) PatchProxy.accessDispatch(new Object[0], null, f41416a, true, 35394, new Class[0], IConanService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41416a, true, 35395, new Class[0], IConanService.class)) {
                return (IConanService) PatchProxy.accessDispatch(new Object[0], null, f41416a, true, 35395, new Class[0], IConanService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, as.f41415a, true, 35392, new Class[0], IConanService.class)) {
                iConanService = (IConanService) PatchProxy.accessDispatch(new Object[0], null, as.f41415a, true, 35392, new Class[0], IConanService.class);
            } else {
                iConanService = (IConanService) u.a("com.ss.android.ugc.aweme.conan.ConanService", h.class);
            }
            return (IConanService) e.a(iConanService, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
