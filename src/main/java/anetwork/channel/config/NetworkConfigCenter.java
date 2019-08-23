package anetwork.channel.config;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import anet.channel.util.b;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.http.NetworkSdkSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkConfigCenter {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f1502a = true;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f1503b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f1504c = true;

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f1505d = 5;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f1506e = true;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f1507f = true;
    private static volatile boolean g;
    private static volatile long h;
    private static volatile boolean i;
    private static volatile ConcurrentHashMap<String, List<String>> j;
    private static final List<String> k = new ArrayList();
    private static volatile int l = 10000;
    private static volatile boolean m = true;
    private static volatile boolean n = false;
    private static volatile int o = 60000;
    private static volatile CopyOnWriteArrayList<String> p = null;
    private static volatile ConcurrentHashMap<String, List<String>> q = null;
    private static volatile boolean r = true;
    private static volatile IRemoteConfig s;

    public static int getBgForbidRequestThreshold() {
        return o;
    }

    public static int getRequestStatisticSampleRate() {
        return l;
    }

    public static int getServiceBindWaitTime() {
        return f1505d;
    }

    public static boolean isBgRequestForbidden() {
        return i;
    }

    public static boolean isGetSessionAsyncEnable() {
        return n;
    }

    public static boolean isHttpCacheEnable() {
        return f1507f;
    }

    public static boolean isHttpSessionEnable() {
        return f1506e;
    }

    public static boolean isRemoteNetworkServiceEnable() {
        return f1504c;
    }

    public static boolean isRequestDelayRetryForNoNetwork() {
        return r;
    }

    public static boolean isResponseBufferEnable() {
        return m;
    }

    public static boolean isSSLEnabled() {
        return f1502a;
    }

    public static boolean isSpdyEnabled() {
        return f1503b;
    }

    public static boolean isAllowHttpIpRetry() {
        if (!f1506e || !g) {
            return false;
        }
        return true;
    }

    public static void init() {
        h = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).getLong("Cache.Flag", 0);
    }

    public static void setAllowHttpIpRetry(boolean z) {
        g = z;
    }

    public static void setBgForbidRequestThreshold(int i2) {
        o = i2;
    }

    public static void setBgRequestForbidden(boolean z) {
        i = z;
    }

    public static void setGetSessionAsyncEnable(boolean z) {
        n = z;
    }

    public static void setHttpCacheEnable(boolean z) {
        f1507f = z;
    }

    public static void setHttpSessionEnable(boolean z) {
        f1506e = z;
    }

    public static void setRemoteNetworkServiceEnable(boolean z) {
        f1504c = z;
    }

    public static void setRequestDelayRetryForNoNetwork(boolean z) {
        r = z;
    }

    public static void setRequestStatisticSampleRate(int i2) {
        l = i2;
    }

    public static void setResponseBufferEnable(boolean z) {
        m = z;
    }

    public static void setSSLEnabled(boolean z) {
        f1502a = z;
    }

    public static void setServiceBindWaitTime(int i2) {
        f1505d = i2;
    }

    public static void setSpdyEnabled(boolean z) {
        f1503b = z;
    }

    public static void enableNetworkSdkOptimizeTest(boolean z) {
        if (z) {
            setGetSessionAsyncEnable(true);
            ThreadPoolExecutorFactory.setNormalExecutorPoolSize(16);
            AwcnConfig.registerPresetSessions("[{\"host\":\"trade-acs.m.taobao.com\", \"protocol\":\"http2\", \"rtt\":\"0rtt\", \"publicKey\": \"acs\", \"isKeepAlive\":true}]");
            return;
        }
        setGetSessionAsyncEnable(false);
        ThreadPoolExecutorFactory.setNormalExecutorPoolSize(6);
    }

    public static void setHttpsValidationEnabled(boolean z) {
        if (!z) {
            b.a(b.ALLOW_ALL_HOSTNAME_VERIFIER);
            b.a(b.TRUST_ALL_SSL_SOCKET_FACTORY);
            return;
        }
        b.a((HostnameVerifier) null);
        b.a((SSLSocketFactory) null);
    }

    public static void setRemoteConfig(IRemoteConfig iRemoteConfig) {
        if (s != null) {
            s.unRegister();
        }
        if (iRemoteConfig != null) {
            iRemoteConfig.register();
        }
        s = iRemoteConfig;
    }

    public static boolean isRequestInMonitorList(RequestStatistic requestStatistic) {
        if (requestStatistic == null) {
            return false;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = p;
        if (copyOnWriteArrayList == null || TextUtils.isEmpty(requestStatistic.host)) {
            return false;
        }
        Iterator<String> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            if (requestStatistic.host.equalsIgnoreCase(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUrlInDegradeList(HttpUrl httpUrl) {
        if (httpUrl == null) {
            return false;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = q;
        if (concurrentHashMap == null) {
            return false;
        }
        List<String> list = concurrentHashMap.get(httpUrl.host());
        if (list == null) {
            return false;
        }
        if (list == k) {
            return true;
        }
        for (String startsWith : list) {
            if (httpUrl.path().startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUrlInWhiteList(HttpUrl httpUrl) {
        if (httpUrl == null) {
            return false;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = j;
        if (concurrentHashMap == null) {
            return false;
        }
        List<String> list = concurrentHashMap.get(httpUrl.host());
        if (list == null) {
            return false;
        }
        if (list == k) {
            return true;
        }
        for (String startsWith : list) {
            if (httpUrl.path().startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static void setAmdcPresetHosts(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    String string = jSONArray.getString(i2);
                    if (c.c(string)) {
                        arrayList.add(string);
                    }
                }
                HttpDispatcher.getInstance().addHosts(arrayList);
            } catch (JSONException e2) {
                ALog.e("anet.NetworkConfigCenter", "parse hosts failed", null, e2, new Object[0]);
            }
        }
    }

    public static void setMonitorRequestList(String str) {
        if (TextUtils.isEmpty(str)) {
            p = null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("host");
            int length = jSONArray.length();
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                if (c.c(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            p = copyOnWriteArrayList;
        } catch (JSONException e2) {
            ALog.e("anet.NetworkConfigCenter", "parse hosts failed", null, e2, new Object[0]);
        }
    }

    public static void setCacheFlag(long j2) {
        if (j2 != h) {
            ALog.i("anet.NetworkConfigCenter", "set cache flag", null, "old", Long.valueOf(h), "new", Long.valueOf(j2));
            h = j2;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.getContext()).edit();
            edit.putLong("Cache.Flag", h);
            edit.apply();
            CacheManager.clearAllCache();
        }
    }

    public static void setDegradeRequestList(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.NetworkConfigCenter", "setDegradeRequestList", null, "Degrade List", str);
        }
        if (TextUtils.isEmpty(str)) {
            q = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, k);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            Object obj2 = jSONArray.get(i2);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e2) {
            ALog.e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e2, new Object[0]);
        }
        q = concurrentHashMap;
    }

    public static void updateWhiteListMap(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.NetworkConfigCenter", "updateWhiteUrlList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            j = null;
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if ("*".equals(obj)) {
                        concurrentHashMap.put(next, k);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            Object obj2 = jSONArray.get(i2);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e2) {
            ALog.e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e2, new Object[0]);
        }
        j = concurrentHashMap;
    }
}
