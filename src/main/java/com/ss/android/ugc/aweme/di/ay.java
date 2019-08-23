package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import dagger.internal.c;
import dagger.internal.e;

public final class ay implements c<IMiniAppService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41424a;

    /* renamed from: b  reason: collision with root package name */
    static final ay f41425b = new ay();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41424a, false, 35406, new Class[0], IMiniAppService.class)) {
            return (IMiniAppService) PatchProxy.accessDispatch(new Object[0], this, f41424a, false, 35406, new Class[0], IMiniAppService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41424a, true, 35407, new Class[0], IMiniAppService.class)) {
            return (IMiniAppService) PatchProxy.accessDispatch(new Object[0], null, f41424a, true, 35407, new Class[0], IMiniAppService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41424a, true, 35408, new Class[0], IMiniAppService.class)) {
                return (IMiniAppService) PatchProxy.accessDispatch(new Object[0], null, f41424a, true, 35408, new Class[0], IMiniAppService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, ax.f41423a, true, 35405, new Class[0], IMiniAppService.class)) {
                obj = (IMiniAppService) PatchProxy.accessDispatch(new Object[0], null, ax.f41423a, true, 35405, new Class[0], IMiniAppService.class);
            } else {
                obj = q.a();
            }
            return (IMiniAppService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
