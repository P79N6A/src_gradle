package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.c;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class b {

    /* renamed from: a  reason: collision with root package name */
    static volatile Context f1307a;

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f1308b;

    /* renamed from: c  reason: collision with root package name */
    static volatile NetworkStatusHelper.NetworkStatus f1309c = NetworkStatusHelper.NetworkStatus.NONE;

    /* renamed from: d  reason: collision with root package name */
    static volatile String f1310d = "unknown";

    /* renamed from: e  reason: collision with root package name */
    static volatile String f1311e = "";

    /* renamed from: f  reason: collision with root package name */
    static volatile String f1312f = "";
    static volatile String g = "";
    static volatile String h = "unknown";
    static volatile String i = "";
    static volatile Pair<String, Integer> j;
    static volatile boolean k;
    static volatile List<InetAddress> l = Collections.EMPTY_LIST;
    private static String[] m = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
    private static volatile boolean n;
    private static ConnectivityManager o;
    private static TelephonyManager p;
    private static WifiManager q;
    private static SubscriptionManager r;
    private static Method s;
    private static BroadcastReceiver t = new NetworkStatusMonitor$2();

    b() {
    }

    static void b() {
        if (f1307a != null) {
            f1307a.unregisterReceiver(t);
        }
    }

    static NetworkInfo e() {
        if (o == null) {
            o = (ConnectivityManager) f1307a.getSystemService("connectivity");
        }
        return o.getActiveNetworkInfo();
    }

    static void a() {
        if (!n && f1307a != null) {
            synchronized (f1307a) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                try {
                    f1307a.registerReceiver(t, intentFilter);
                } catch (Exception unused) {
                    ALog.e("awcn.NetworkStatusMonitor", "registerReceiver failed", null, new Object[0]);
                }
            }
            d();
            n = true;
        }
    }

    static void c() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            NetworkInfo e2 = e();
            if (e2 == null || !e2.isConnected()) {
                z = false;
            } else {
                z = true;
            }
            f1308b = z;
            o.registerDefaultNetworkCallback(new c());
        }
    }

    static String f() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
            for (String str : m) {
                String str2 = (String) method.invoke(null, new Object[]{str});
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static WifiInfo h() {
        try {
            if (q == null) {
                q = (WifiManager) f1307a.getSystemService("wifi");
            }
            return q.getConnectionInfo();
        } catch (Throwable th) {
            ALog.e("awcn.NetworkStatusMonitor", "getWifiInfo", null, th, new Object[0]);
            return null;
        }
    }

    private static Pair<String, Integer> i() {
        try {
            String property = System.getProperty("http.proxyHost");
            if (!TextUtils.isEmpty(property)) {
                return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty("http.proxyPort"))));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    private static void g() {
        try {
            if (p == null) {
                p = (TelephonyManager) f1307a.getSystemService("phone");
            }
            i = p.getSimOperator();
            if (Build.VERSION.SDK_INT >= 22) {
                if (r == null) {
                    SubscriptionManager from = SubscriptionManager.from(f1307a);
                    r = from;
                    s = from.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                if (s != null) {
                    h = ((SubscriptionInfo) s.invoke(r, new Object[0])).getCarrierName().toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    static void d() {
        NetworkInfo networkInfo;
        boolean z;
        String str;
        ALog.d("awcn.NetworkStatusMonitor", "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = f1309c;
        String str2 = f1311e;
        String str3 = f1312f;
        try {
            networkInfo = e();
            z = false;
        } catch (Exception e2) {
            try {
                ALog.e("awcn.NetworkStatusMonitor", "getNetworkInfo exception", null, e2, new Object[0]);
                a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfo = null;
                z = true;
            } catch (Exception e3) {
                ALog.e("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, e3, new Object[0]);
                return;
            }
        }
        if (!z) {
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    ALog.i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfo.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfo.isAvailable()));
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str = subtypeName.replace(" ", "");
                        } else {
                            str = "";
                        }
                        a(a(networkInfo.getSubtype(), str), str);
                        f1311e = a(networkInfo.getExtraInfo());
                        g();
                    } else if (networkInfo.getType() == 1) {
                        a(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        WifiInfo h2 = h();
                        if (h2 != null) {
                            g = h2.getBSSID();
                            f1312f = h2.getSSID();
                        }
                        h = "wifi";
                        i = "wifi";
                        j = i();
                    } else {
                        a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    k = networkInfo.isRoaming();
                    c.e();
                }
            }
            a(NetworkStatusHelper.NetworkStatus.NO, "no network");
            ALog.i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "no network");
        }
        if (f1309c != networkStatus || !f1311e.equalsIgnoreCase(str2) || !f1312f.equalsIgnoreCase(str3)) {
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            NetworkStatusHelper.notifyStatusChanged(f1309c);
        }
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.contains("cmwap")) {
            return "cmwap";
        }
        if (lowerCase.contains("uniwap")) {
            return "uniwap";
        }
        if (lowerCase.contains("3gwap")) {
            return "3gwap";
        }
        if (lowerCase.contains("ctwap")) {
            return "ctwap";
        }
        if (lowerCase.contains("cmnet")) {
            return "cmnet";
        }
        if (lowerCase.contains("uninet")) {
            return "uninet";
        }
        if (lowerCase.contains("3gnet")) {
            return "3gnet";
        }
        if (lowerCase.contains("ctnet")) {
            return "ctnet";
        }
        return "unknown";
    }

    private static void a(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        f1309c = networkStatus;
        f1310d = str;
        f1311e = "";
        f1312f = "";
        g = "";
        j = null;
        h = "";
        i = "";
    }

    private static NetworkStatusHelper.NetworkStatus a(int i2, String str) {
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case e.l /*7*/:
            case 11:
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
            case 14:
            case 15:
            case 17:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case 19:
                return NetworkStatusHelper.NetworkStatus.G4;
            default:
                if (str.equalsIgnoreCase("TD-SCDMA") || str.equalsIgnoreCase("WCDMA") || str.equalsIgnoreCase("CDMA2000")) {
                    return NetworkStatusHelper.NetworkStatus.G3;
                }
                return NetworkStatusHelper.NetworkStatus.NONE;
        }
    }
}
