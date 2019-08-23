package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.UserService;
import dagger.internal.c;
import dagger.internal.e;

public final class ak implements c<IUserService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41401a;

    /* renamed from: b  reason: collision with root package name */
    static final ak f41402b = new ak();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41401a, false, 35313, new Class[0], IUserService.class)) {
            return (IUserService) PatchProxy.accessDispatch(new Object[0], this, f41401a, false, 35313, new Class[0], IUserService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41401a, true, 35314, new Class[0], IUserService.class)) {
            return (IUserService) PatchProxy.accessDispatch(new Object[0], null, f41401a, true, 35314, new Class[0], IUserService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41401a, true, 35315, new Class[0], IUserService.class)) {
                return (IUserService) PatchProxy.accessDispatch(new Object[0], null, f41401a, true, 35315, new Class[0], IUserService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35181, new Class[0], IUserService.class)) {
                obj = (IUserService) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35181, new Class[0], IUserService.class);
            } else {
                obj = new UserService();
            }
            return (IUserService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
