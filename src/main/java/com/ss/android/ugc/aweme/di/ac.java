package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import dagger.internal.c;
import dagger.internal.e;

public final class ac implements c<IPushApi> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41385a;

    /* renamed from: b  reason: collision with root package name */
    static final ac f41386b = new ac();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41385a, false, 35289, new Class[0], IPushApi.class)) {
            return (IPushApi) PatchProxy.accessDispatch(new Object[0], this, f41385a, false, 35289, new Class[0], IPushApi.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41385a, true, 35290, new Class[0], IPushApi.class)) {
            return (IPushApi) PatchProxy.accessDispatch(new Object[0], null, f41385a, true, 35290, new Class[0], IPushApi.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41385a, true, 35291, new Class[0], IPushApi.class)) {
                return (IPushApi) PatchProxy.accessDispatch(new Object[0], null, f41385a, true, 35291, new Class[0], IPushApi.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35178, new Class[0], IPushApi.class)) {
                obj = (IPushApi) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35178, new Class[0], IPushApi.class);
            } else {
                obj = new PushService();
            }
            return (IPushApi) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
