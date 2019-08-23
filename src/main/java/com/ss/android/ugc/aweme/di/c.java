package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IAVService;
import dagger.internal.e;

public final class c implements dagger.internal.c<IAVService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41434a;

    /* renamed from: b  reason: collision with root package name */
    static final c f41435b = new c();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41434a, false, 35211, new Class[0], IAVService.class)) {
            return (IAVService) PatchProxy.accessDispatch(new Object[0], this, f41434a, false, 35211, new Class[0], IAVService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41434a, true, 35212, new Class[0], IAVService.class)) {
            return (IAVService) PatchProxy.accessDispatch(new Object[0], null, f41434a, true, 35212, new Class[0], IAVService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41434a, true, 35213, new Class[0], IAVService.class)) {
                return (IAVService) PatchProxy.accessDispatch(new Object[0], null, f41434a, true, 35213, new Class[0], IAVService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35175, new Class[0], IAVService.class)) {
                obj = (IAVService) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35175, new Class[0], IAVService.class);
            } else {
                obj = new AVServiceImpl();
            }
            return (IAVService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
