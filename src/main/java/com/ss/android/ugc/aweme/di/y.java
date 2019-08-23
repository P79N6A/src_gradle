package com.ss.android.ugc.aweme.di;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.plugin.PluginService;
import dagger.internal.c;
import dagger.internal.e;

public final class y implements c<IPluginService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41478a;

    /* renamed from: b  reason: collision with root package name */
    static final y f41479b = new y();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41478a, false, 35277, new Class[0], IPluginService.class)) {
            return (IPluginService) PatchProxy.accessDispatch(new Object[0], this, f41478a, false, 35277, new Class[0], IPluginService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41478a, true, 35278, new Class[0], IPluginService.class)) {
            return (IPluginService) PatchProxy.accessDispatch(new Object[0], null, f41478a, true, 35278, new Class[0], IPluginService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41478a, true, 35279, new Class[0], IPluginService.class)) {
                return (IPluginService) PatchProxy.accessDispatch(new Object[0], null, f41478a, true, 35279, new Class[0], IPluginService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35176, new Class[0], IPluginService.class)) {
                obj = (IPluginService) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35176, new Class[0], IPluginService.class);
            } else {
                obj = new PluginService();
            }
            return (IPluginService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
