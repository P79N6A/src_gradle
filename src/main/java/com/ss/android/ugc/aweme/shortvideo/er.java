package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.services.IAVService;

public final class er {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67595a;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f67595a, true, 74504, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f67595a, true, 74504, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c.a() || a.x.c() || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
            return false;
        }
        return true;
    }
}
