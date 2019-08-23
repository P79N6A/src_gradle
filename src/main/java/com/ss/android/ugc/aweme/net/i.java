package com.ss.android.ugc.aweme.net;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.ttnet.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.n;
import com.ttnet.org.chromium.base.Logger;
import java.util.HashMap;
import org.json.JSONObject;

public final class i extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f56947b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f56948c = new i();

    public final String getGetDomainDefaultJSON() {
        return "{    \"data\": {         \"chromium_open\": 1,         \"ttnet_http_dns_enabled\": 1,         \"ttnet_http_dns_google\":1,         \"ttnet_http_dns_prefer\":0,         \"ttnet_local_dns_time_out\":2,         \"ttnet_http_dns_addr\": {             \"api.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api.tiktokv.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"api16.hypstar.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"i.byteoversea.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"log.byteoversea.com\":\"47.74.175.185,47.74.175.17,47.74.171.52,47.74.171.93\",             \"dns.google.com\":\"172.217.160.110\"         }    },    \"message\":\"success\"}";
    }

    public final String getAbClient() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60704, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.app.i.a().getAbClient();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60704, new Class[0], String.class);
    }

    public final String getAbFeature() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60706, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.app.i.a().getAbFeature();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60706, new Class[0], String.class);
    }

    public final String getAbFlag() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60705, new Class[0], String.class)) {
            return String.valueOf(com.ss.android.ugc.aweme.app.i.a().getAbFlag());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60705, new Class[0], String.class);
    }

    public final String getAbVersion() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60703, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.app.i.a().getAbVersion();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60703, new Class[0], String.class);
    }

    public final String getAppId() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60696, new Class[0], String.class)) {
            return String.valueOf(AppLog.getAppId());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60696, new Class[0], String.class);
    }

    public final String getAppName() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60697, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.app.i.a().getAppName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60697, new Class[0], String.class);
    }

    public final String getChannel() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60698, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.app.i.a().getChannel();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60698, new Class[0], String.class);
    }

    public final String getDeviceId() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60694, new Class[0], String.class)) {
            return AppLog.getServerDeviceId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60694, new Class[0], String.class);
    }

    public final String getManifestVersionCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60702, new Class[0], String.class)) {
            return String.valueOf(com.ss.android.ugc.aweme.app.i.a().getManifestVersionCode());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60702, new Class[0], String.class);
    }

    public final String getUUID() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60707, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.app.i.a().getDeviceId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60707, new Class[0], String.class);
    }

    public final String getUpdateVersionCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60701, new Class[0], String.class)) {
            return String.valueOf(com.ss.android.ugc.aweme.app.i.a().getUpdateVersionCode());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60701, new Class[0], String.class);
    }

    public final String getUserId() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60695, new Class[0], String.class)) {
            return AppLog.getUserId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60695, new Class[0], String.class);
    }

    public final String getVersionCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60699, new Class[0], String.class)) {
            return String.valueOf(com.ss.android.ugc.aweme.app.i.a().getVersionCode());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60699, new Class[0], String.class);
    }

    public final String getVersionName() {
        if (!PatchProxy.isSupport(new Object[0], this, f56947b, false, 60700, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.app.i.a().getVersion();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60700, new Class[0], String.class);
    }

    public final String getOpenUdid() {
        if (PatchProxy.isSupport(new Object[0], this, f56947b, false, 60708, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60708, new Class[0], String.class);
        }
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        String str = (String) hashMap.get("openudid");
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        return str;
    }

    public final boolean loggerDebug() {
        if (PatchProxy.isSupport(new Object[0], this, f56947b, false, 60693, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f56947b, false, 60693, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Logger.debug() || "local_test".equals(com.ss.android.ugc.aweme.app.i.a().getChannel())) {
            return true;
        } else {
            return false;
        }
    }

    public final void sendAppMonitorEvent(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f56947b, false, 60692, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f56947b, false, 60692, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            if (Logger.debug()) {
                Logger.d("CronetDependAdapter", "Get monitor json = " + str3 + " logType = " + str4);
            }
            n.a(str4, new JSONObject(str3));
        } catch (Throwable unused) {
        }
    }
}
