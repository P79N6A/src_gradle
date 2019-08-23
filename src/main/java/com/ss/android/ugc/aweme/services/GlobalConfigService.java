package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.framework.services.IGlobalConfigService;

public class GlobalConfigService implements IGlobalConfigService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean isDeviceMonitor() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71385, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71385, new Class[0], Boolean.TYPE)).booleanValue();
        }
        an<Boolean> deviceMonitor = SharePrefCache.inst().getDeviceMonitor();
        if (deviceMonitor == null) {
            return false;
        }
        Boolean bool = (Boolean) deviceMonitor.c();
        if (bool != null) {
            z = bool.booleanValue();
        }
        return z;
    }

    public boolean getConfig(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71386, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71386, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        throw new UnsupportedOperationException("暂时还没想好怎么支持");
    }
}
