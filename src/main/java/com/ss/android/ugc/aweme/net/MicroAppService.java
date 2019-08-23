package com.ss.android.ugc.aweme.net;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.plugin.g.b;
import com.ss.android.ugc.aweme.services.IMicroAppService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;

@Keep
public class MicroAppService implements IMicroAppService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean isMiniAppPluginInstalled() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60749, new Class[0], Boolean.TYPE)) {
            return b.a("com.ss.android.ugc.aweme.miniappplugin");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60749, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean enableJssdkCheck() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 60750, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 60750, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 72016, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 72016, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestModel d2 = a2.d();
        if (d2 == null) {
            return false;
        }
        return d2.enableJssdkCheck;
    }
}
