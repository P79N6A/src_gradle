package com.ss.android.ugc.aweme.legoImp.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

public final /* synthetic */ class c implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53147a;

    /* renamed from: b  reason: collision with root package name */
    static final ServiceProvider f53148b = new c();

    private c() {
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f53147a, false, 55269, new Class[0], Object.class)) {
            return IndexServiceRouterTask.lambda$initServiceManager$0$IndexServiceRouterTask();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f53147a, false, 55269, new Class[0], Object.class);
    }
}
