package com.ss.android.ugc.aweme.app;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

public final /* synthetic */ class t implements ServiceProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2688a;

    /* renamed from: b  reason: collision with root package name */
    static final ServiceProvider f2689b = new t();

    private t() {
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f2688a, false, 22345, new Class[0], Object.class)) {
            return (IPluginService) ServiceManager.get().getService(IPluginService.class, true);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f2688a, false, 22345, new Class[0], Object.class);
    }
}
