package anet.channel.util;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.taobao.android.dexposed.ClassUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class c {

    /* renamed from: a  reason: collision with root package name */
    static final byte[][] f1437a = {new byte[]{-64, 0, 0, -86}, new byte[]{-64, 0, 0, -85}};

    /* renamed from: b  reason: collision with root package name */
    static volatile String f1438b;

    /* renamed from: c  reason: collision with root package name */
    static f f1439c;

    /* renamed from: d  reason: collision with root package name */
    static ConcurrentHashMap<String, f> f1440d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    static ConcurrentHashMap<String, Integer> f1441e = new ConcurrentHashMap<>();

    public static boolean a() {
        return false;
    }

    public static f d() {
        f fVar = f1440d.get(f1438b);
        if (fVar == null) {
            return f1439c;
        }
        return fVar;
    }

    public static boolean b() {
        Integer num = f1441e.get(f1438b);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static int c() {
        Integer num = f1441e.get(f1438b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* access modifiers changed from: private */
    public static int i() {
        int i;
        try {
            i = h();
        } catch (Exception unused) {
            i = 0;
        }
        ALog.e("awcn.Inet64Util", "startIpStackDetect", null, "ip stack", Integer.valueOf(i));
        return i;
    }

    static {
        try {
            f1439c = new f((Inet6Address) InetAddress.getAllByName("64:ff9b::")[0], 96);
            f1438b = b(NetworkStatusHelper.getStatus());
        } catch (Exception unused) {
        }
    }

    public static void e() {
        f1438b = b(NetworkStatusHelper.getStatus());
        if (f1441e.putIfAbsent(f1438b, 0) == null) {
            int i = i();
            f1441e.put(f1438b, Integer.valueOf(i));
            NetTypeStat netTypeStat = new NetTypeStat();
            netTypeStat.ipStackType = i;
            String str = f1438b;
            if (i == 2 || i == 3) {
                ThreadPoolExecutorFactory.submitScheduledTask(new d(str, netTypeStat), 1500, TimeUnit.MILLISECONDS);
                return;
            }
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                AppMonitor.getInstance().commitStat(netTypeStat);
            }
        }
    }

    /* access modifiers changed from: private */
    public static f j() throws UnknownHostException {
        InetAddress inetAddress;
        boolean z;
        try {
            inetAddress = InetAddress.getByName("ipv4only.arpa");
        } catch (Exception unused) {
            inetAddress = null;
        }
        if (inetAddress instanceof Inet6Address) {
            ALog.i("awcn.Inet64Util", "Resolved AAAA: " + inetAddress.toString(), null, new Object[0]);
            byte[] address = inetAddress.getAddress();
            if (address.length != 16) {
                return null;
            }
            int i = 12;
            while (true) {
                z = true;
                if (i < 0) {
                    z = false;
                    break;
                }
                if ((address[i] & f1437a[0][0]) != 0 && address[i + 1] == 0 && address[i + 2] == 0) {
                    int i2 = i + 3;
                    if (address[i2] == f1437a[0][3] || address[i2] == f1437a[1][3]) {
                        break;
                    }
                }
                i--;
            }
            if (z) {
                address[i + 3] = 0;
                address[i + 2] = 0;
                address[i + 1] = 0;
                address[i] = 0;
                return new f(Inet6Address.getByAddress("ipv4only.arpa", address, 0), i * 8);
            }
        } else if (inetAddress instanceof Inet4Address) {
            ALog.i("awcn.Inet64Util", "Resolved A: " + inetAddress.toString(), null, new Object[0]);
        }
        return null;
    }

    private static int h() throws SocketException {
        String str;
        int i;
        TreeMap treeMap = new TreeMap();
        Iterator<T> it2 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
            str = null;
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            NetworkInterface networkInterface = (NetworkInterface) it2.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                ALog.i("awcn.Inet64Util", "find NetworkInterface:" + displayName, null, new Object[0]);
                int i2 = 0;
                for (InterfaceAddress address : networkInterface.getInterfaceAddresses()) {
                    InetAddress address2 = address.getAddress();
                    if (address2 instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address2;
                        if (!a((InetAddress) inet6Address)) {
                            ALog.e("awcn.Inet64Util", "Found IPv6 address:" + inet6Address.toString(), null, new Object[0]);
                            i2 |= 2;
                        }
                    } else if (address2 instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address2;
                        if (!a((InetAddress) inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            ALog.e("awcn.Inet64Util", "Found IPv4 address:" + inet4Address.toString(), null, new Object[0]);
                            i2 |= 1;
                        }
                    }
                }
                if (i2 != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i2));
                }
            }
        }
        if (treeMap.isEmpty()) {
            return 0;
        }
        if (treeMap.size() == 1) {
            return ((Integer) treeMap.firstEntry().getValue()).intValue();
        }
        if (NetworkStatusHelper.getStatus().isWifi()) {
            str = "wlan";
        } else if (NetworkStatusHelper.getStatus().isMobile()) {
            str = "rmnet";
        }
        if (str != null) {
            Iterator it3 = treeMap.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                if (((String) entry.getKey()).startsWith(str)) {
                    i = ((Integer) entry.getValue()).intValue();
                    break;
                }
            }
        }
        if (i == 2 && treeMap.containsKey("v4-wlan0")) {
            i |= ((Integer) treeMap.remove("v4-wlan0")).intValue();
        }
        return i;
    }

    public static String a(String str) throws Exception {
        return a((Inet4Address) Inet4Address.getByName(str));
    }

    private static boolean a(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static String b(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
            if (TextUtils.isEmpty(wifiBSSID)) {
                wifiBSSID = "";
            }
            return "WIFI$".concat(String.valueOf(wifiBSSID));
        } else if (!networkStatus.isMobile()) {
            return "UnknownNetwork";
        } else {
            return networkStatus.getType() + ClassUtils.INNER_CLASS_SEPARATOR + NetworkStatusHelper.getApn();
        }
    }

    public static String a(Inet4Address inet4Address) throws Exception {
        if (inet4Address != null) {
            f d2 = d();
            if (d2 != null) {
                byte[] address = inet4Address.getAddress();
                byte[] address2 = d2.f1446b.getAddress();
                int i = d2.f1445a / 8;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i2 + i;
                    if (i4 <= 15 && i3 < 4) {
                        if (i4 != 8) {
                            address2[i4] = (byte) (address[i3] | address2[i4]);
                            i3++;
                        }
                        i2++;
                    }
                }
                return InetAddress.getByAddress(address2).getHostAddress();
            }
            throw new Exception("cannot get nat64 prefix");
        }
        throw new InvalidParameterException("address in null");
    }
}
