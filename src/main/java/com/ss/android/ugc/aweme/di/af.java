package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import dagger.internal.c;
import dagger.internal.e;

public final class af implements c<IRetrofitService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41391a;

    /* renamed from: b  reason: collision with root package name */
    static final af f41392b = new af();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41391a, false, 35298, new Class[0], IRetrofitService.class)) {
            return (IRetrofitService) PatchProxy.accessDispatch(new Object[0], this, f41391a, false, 35298, new Class[0], IRetrofitService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41391a, true, 35299, new Class[0], IRetrofitService.class)) {
            return (IRetrofitService) PatchProxy.accessDispatch(new Object[0], null, f41391a, true, 35299, new Class[0], IRetrofitService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41391a, true, 35300, new Class[0], IRetrofitService.class)) {
                return (IRetrofitService) PatchProxy.accessDispatch(new Object[0], null, f41391a, true, 35300, new Class[0], IRetrofitService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35179, new Class[0], IRetrofitService.class)) {
                obj = (IRetrofitService) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35179, new Class[0], IRetrofitService.class);
            } else {
                obj = new RetrofitService();
            }
            return (IRetrofitService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
