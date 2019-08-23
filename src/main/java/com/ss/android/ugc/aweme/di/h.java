package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.services.ApiNetworkServiceForAccount;
import com.ss.android.ugc.aweme.main.h.e;
import dagger.internal.c;

public final class h implements c<e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41444a;

    /* renamed from: b  reason: collision with root package name */
    static final h f41445b = new h();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41444a, false, 35226, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f41444a, false, 35226, new Class[0], e.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41444a, true, 35227, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f41444a, true, 35227, new Class[0], e.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41444a, true, 35228, new Class[0], e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[0], null, f41444a, true, 35228, new Class[0], e.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35208, new Class[0], e.class)) {
                obj = (e) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35208, new Class[0], e.class);
            } else {
                obj = new ApiNetworkServiceForAccount();
            }
            return (e) dagger.internal.e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
