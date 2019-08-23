package com.ss.android.ugc.aweme.commercialize.api;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38498a;

    public static <T> T a(@NonNull Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, null, f38498a, true, 30406, new Class[]{Class.class}, Object.class)) {
            return ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, null, f38498a, true, 30406, new Class[]{Class.class}, Object.class);
    }
}
