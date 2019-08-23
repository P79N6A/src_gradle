package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public abstract /* synthetic */ class ca {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75666a;

    public static GsonProvider a() {
        return PatchProxy.isSupport(new Object[0], null, f75666a, true, 88347, new Class[0], GsonProvider.class) ? (GsonProvider) PatchProxy.accessDispatch(new Object[0], null, f75666a, true, 88347, new Class[0], GsonProvider.class) : (GsonProvider) ServiceManager.get().getService(GsonProvider.class);
    }
}
