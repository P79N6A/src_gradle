package com.ss.android.ugc.aweme.im.sdk.g;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51468a;

    public static IIMService a() {
        return IMService.inst;
    }

    public static <T> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, f51468a, true, 53169, new Class[]{Class.class}, Object.class)) {
            return ServiceManager.get().getService(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, null, f51468a, true, 53169, new Class[]{Class.class}, Object.class);
    }
}
