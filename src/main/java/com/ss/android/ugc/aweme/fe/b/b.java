package com.ss.android.ugc.aweme.fe.b;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.AppContext;
import com.ss.android.common.applog.z;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44409a;

    public static Map<String, String> a() {
        if (PatchProxy.isSupport(new Object[0], null, f44409a, true, 39881, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], null, f44409a, true, 39881, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        AppContext c2 = AwemeAppData.p().c();
        if (c2 == null) {
            return null;
        }
        hashMap.put("appVersion", c2.getVersion());
        hashMap.put("device_id", z.a());
        hashMap.put("netType", NetworkUtils.getNetworkAccessType(c2.getContext()));
        hashMap.put("appName", c2.getAppName());
        hashMap.put("aid", String.valueOf(c2.getAid()));
        hashMap.put("user_id", c.d().getCurUserId());
        hashMap.put("versionCode", String.valueOf(c2.getVersionCode()));
        hashMap.put("channel", a.b().f3304b);
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("device_platform", "android");
        hashMap.put("device_type", Build.MODEL);
        if (c2.getContext() != null) {
            hashMap.put("ironManSupported", String.valueOf(((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).checkMiniAppEnable(c2.getContext())));
        }
        return hashMap;
    }
}
