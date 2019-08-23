package anet.channel.strategy.dispatch;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.c;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.Map;
import java.util.Set;

public class e {
    e() {
    }

    private static int a() {
        switch (c.c()) {
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 1;
            default:
                return 4;
        }
    }

    private static String b(Map map) {
        StringBuilder sb = new StringBuilder();
        for (String append : (Set) map.remove("hosts")) {
            sb.append(append);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static Map a(Map<String, Object> map) {
        String str;
        IAmdcSign b2 = a.b();
        if (b2 == null || TextUtils.isEmpty(b2.getAppkey())) {
            ALog.e("amdc.DispatchParamBuilder", "amdc sign is null or appkey is empty", null, new Object[0]);
            return null;
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (!NetworkStatusHelper.isConnected()) {
            ALog.e("amdc.DispatchParamBuilder", "no network, don't send amdc request", null, new Object[0]);
            return null;
        }
        map.put("appkey", b2.getAppkey());
        map.put(NotifyType.VIBRATE, "5.0");
        map.put("platform", "android");
        map.put("platformVersion", Build.VERSION.RELEASE);
        if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUserId())) {
            map.put("sid", GlobalAppRuntimeInfo.getUserId());
        }
        if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUtdid())) {
            map.put("deviceId", GlobalAppRuntimeInfo.getUtdid());
        }
        map.put("netType", status.toString());
        if (status.isWifi()) {
            map.put("bssid", NetworkStatusHelper.getWifiBSSID());
        }
        map.put("carrier", NetworkStatusHelper.getCarrier());
        map.put("mnc", NetworkStatusHelper.getSimOp());
        map.put("lat", String.valueOf(a.f1363a));
        map.put("lng", String.valueOf(a.f1364b));
        map.putAll(a.c());
        map.put("channel", a.f1365c);
        map.put("appName", a.f1366d);
        map.put("appVersion", a.f1367e);
        map.put("stackType", Integer.toString(a()));
        map.put("domain", b(map));
        if (b2.useSecurityGuard()) {
            str = "sec";
        } else {
            str = "noSec";
        }
        map.put("signType", str);
        map.put("t", String.valueOf(System.currentTimeMillis()));
        String a2 = a(b2, map);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        map.put("sign", a2);
        return map;
    }

    static String a(IAmdcSign iAmdcSign, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
        sb.append(anet.channel.strategy.utils.c.d(map.get("appkey")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("domain")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("appName")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("appVersion")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("bssid")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("channel")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("deviceId")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("lat")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("lng")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("machine")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("netType")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("other")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("platform")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("platformVersion")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("preIp")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("sid")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("t")));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get(NotifyType.VIBRATE)));
        sb.append("&");
        sb.append(anet.channel.strategy.utils.c.d(map.get("signType")));
        try {
            return iAmdcSign.sign(sb.toString());
        } catch (Exception e2) {
            ALog.e("amdc.DispatchParamBuilder", "get sign failed", null, e2, new Object[0]);
            return null;
        }
    }
}
