package anet.channel.status;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Pair;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.g;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.concurrent.CopyOnWriteArraySet;

public class NetworkStatusHelper {
    static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners = new CopyOnWriteArraySet<>();

    public interface INetworkStatusChangeListener {
        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI;

        public final boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }

        public final String getType() {
            if (this == G2) {
                return "2G";
            }
            if (this == G3) {
                return "3G";
            }
            if (this == G4) {
                return "4G";
            }
            return toString();
        }

        public final boolean isMobile() {
            if (this == G2 || this == G3 || this == G4) {
                return true;
            }
            return false;
        }
    }

    public static String getApn() {
        return b.f1311e;
    }

    public static String getCarrier() {
        return b.h;
    }

    public static String getNetworkSubType() {
        return b.f1310d;
    }

    public static String getSimOp() {
        return b.i;
    }

    public static NetworkStatus getStatus() {
        return b.f1309c;
    }

    public static String getWifiBSSID() {
        return b.g;
    }

    public static String getWifiSSID() {
        return b.f1312f;
    }

    public static boolean isRoaming() {
        return b.k;
    }

    public static Pair<String, Integer> getWifiProxy() {
        if (b.f1309c != NetworkStatus.WIFI) {
            return null;
        }
        return b.j;
    }

    public static String getDnsServerAddress() {
        if (!b.l.isEmpty()) {
            return b.l.get(0).getHostAddress();
        }
        return b.f();
    }

    public static String getProxyType() {
        NetworkStatus networkStatus = b.f1309c;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return "proxy";
        }
        if (networkStatus.isMobile() && b.f1311e.contains("wap")) {
            return "wap";
        }
        if (!networkStatus.isMobile() || g.a() == null) {
            return "";
        }
        return "auth";
    }

    public static boolean isConnected() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (b.f1308b) {
                return true;
            }
        } else if (b.f1309c != NetworkStatus.NO) {
            return true;
        }
        try {
            NetworkInfo e2 = b.e();
            if (e2 == null || !e2.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isProxy() {
        NetworkStatus networkStatus = b.f1309c;
        String str = b.f1311e;
        if ((networkStatus != NetworkStatus.WIFI || getWifiProxy() == null) && (!networkStatus.isMobile() || (!str.contains("wap") && g.a() == null))) {
            return false;
        }
        return true;
    }

    public static void printNetworkDetail() {
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
            sb.append("\nNetwork detail*******************************\n");
            sb.append("Status: ");
            sb.append(status.getType());
            sb.append(10);
            sb.append("Subtype: ");
            sb.append(getNetworkSubType());
            sb.append(10);
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb.append("Apn: ");
                    sb.append(getApn());
                    sb.append(10);
                    sb.append("Carrier: ");
                    sb.append(getCarrier());
                    sb.append(10);
                } else {
                    sb.append("BSSID: ");
                    sb.append(getWifiBSSID());
                    sb.append(10);
                    sb.append("SSID: ");
                    sb.append(getWifiSSID());
                    sb.append(10);
                }
            }
            if (isProxy()) {
                sb.append("Proxy: ");
                sb.append(getProxyType());
                sb.append(10);
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb.append("ProxyHost: ");
                    sb.append((String) wifiProxy.first);
                    sb.append(10);
                    sb.append("ProxyPort: ");
                    sb.append(wifiProxy.second);
                    sb.append(10);
                }
            }
            sb.append("*********************************************");
            ALog.i("awcn.NetworkStatusHelper", sb.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void stopListener(Context context) {
        b.b();
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.add(iNetworkStatusChangeListener);
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.remove(iNetworkStatusChangeListener);
    }

    static void notifyStatusChanged(NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitScheduledTask(new a(networkStatus));
    }

    public static synchronized void startListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            if (context != null) {
                b.f1307a = context;
                b.a();
                b.c();
            } else {
                throw new NullPointerException("context is null");
            }
        }
    }
}
