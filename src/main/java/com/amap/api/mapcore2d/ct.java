package com.amap.api.mapcore2d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ct {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static String f5888a = "";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5889b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f5890c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f5891d = "";

    /* renamed from: e  reason: collision with root package name */
    private static String f5892e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f5893f = "";
    private static String g = "";

    static class a extends DefaultHandler {
        a() {
        }

        public void endElement(String str, String str2, String str3) throws SAXException {
            boolean unused = ct.f5889b = false;
        }

        public void characters(char[] cArr, int i, int i2) throws SAXException {
            if (ct.f5889b) {
                String unused = ct.f5888a = new String(cArr, i, i2);
            }
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            if (str2.equals("string") && "UTDID".equals(attributes.getValue("name"))) {
                boolean unused = ct.f5889b = true;
            }
        }
    }

    public static String a() {
        return f5890c;
    }

    public static void b() {
        try {
            if (Build.VERSION.SDK_INT > 14) {
                TrafficStats.class.getDeclaredMethod("setThreadStatsTag", new Class[]{Integer.TYPE}).invoke(null, new Object[]{40964});
            }
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "setTraficTag");
        }
    }

    private static String d() {
        try {
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (t.getName().equalsIgnoreCase("wlan0")) {
                    byte[] bArr = null;
                    if (Build.VERSION.SDK_INT >= 9) {
                        bArr = t.getHardwareAddress();
                    }
                    if (bArr == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : bArr) {
                        String upperCase = Integer.toHexString(b2 & 255).toUpperCase();
                        if (upperCase.length() == 1) {
                            sb.append(PushConstants.PUSH_TYPE_NOTIFY);
                        }
                        sb.append(upperCase);
                        sb.append(":");
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e2) {
            dd.a((Throwable) e2, "DeviceInfo", "getMacAddr");
        }
        return "";
    }

    public static String a(Context context) {
        try {
            return u(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        try {
            return x(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int c(Context context) {
        try {
            return y(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int d(Context context) {
        try {
            return v(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String e(Context context) {
        try {
            return t(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int l(Context context) {
        try {
            return y(context);
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getNetWorkType");
            return -1;
        }
    }

    public static int m(Context context) {
        try {
            return v(context);
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getActiveNetWorkType");
            return -1;
        }
    }

    public static String r(Context context) {
        try {
            return t(context);
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getSubscriberId");
            return "";
        }
    }

    static String s(Context context) {
        try {
            return u(context);
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getNetworkOperatorName");
            return "";
        }
    }

    private static ConnectivityManager w(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static TelephonyManager z(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static NetworkInfo n(Context context) {
        if (!a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return null;
        }
        ConnectivityManager w = w(context);
        if (w == null) {
            return null;
        }
        return w.getActiveNetworkInfo();
    }

    static String o(Context context) {
        String str;
        try {
            NetworkInfo n = n(context);
            if (n == null) {
                return null;
            }
            str = n.getExtraInfo();
            return str;
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getNetworkExtraInfo");
            str = null;
        }
    }

    private static int v(Context context) {
        if (context == null || !a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return -1;
        }
        ConnectivityManager w = w(context);
        if (w == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = w.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    private static String x(Context context) {
        String r = r(context);
        if (r == null || r.length() < 5) {
            return "";
        }
        return r.substring(3, 5);
    }

    private static int y(Context context) {
        if (!a(context, "android.permission.READ_PHONE_STATE")) {
            return -1;
        }
        TelephonyManager z = z(context);
        if (z == null) {
            return -1;
        }
        return z.getNetworkType();
    }

    private static List<ScanResult> a(List<ScanResult> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int i2 = 1; i2 < size - i; i2++) {
                int i3 = i2 - 1;
                if (list.get(i3).level > list.get(i2).level) {
                    list.set(i3, list.get(i2));
                    list.set(i2, list.get(i3));
                }
            }
        }
        return list;
    }

    static String g(Context context) {
        String str = "";
        if (context != null) {
            try {
                if (a(context, "android.permission.ACCESS_WIFI_STATE")) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager == null) {
                        return str;
                    }
                    if (wifiManager.isWifiEnabled()) {
                        str = wifiManager.getConnectionInfo().getBSSID();
                    }
                    return str;
                }
            } catch (Throwable th) {
                dd.a(th, "DeviceInfo", "getWifiMacs");
            }
        }
        return str;
    }

    static String k(Context context) {
        String str;
        try {
            if (!a(context, "android.permission.READ_PHONE_STATE")) {
                return "";
            }
            TelephonyManager z = z(context);
            if (z == null) {
                return "";
            }
            String networkOperator = z.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                if (networkOperator.length() >= 3) {
                    str = networkOperator.substring(3);
                    return str;
                }
            }
            return "";
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getMNC");
            str = "";
        }
    }

    public static String q(Context context) {
        try {
            if (f5893f != null && !"".equals(f5893f)) {
                return f5893f;
            }
            if (!a(context, "android.permission.READ_PHONE_STATE")) {
                return f5893f;
            }
            TelephonyManager z = z(context);
            if (z == null) {
                return "";
            }
            String deviceId = z.getDeviceId();
            f5893f = deviceId;
            if (deviceId == null) {
                f5893f = "";
            }
            return f5893f;
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getDeviceID");
        }
    }

    private static String t(Context context) {
        if (g != null && !"".equals(g)) {
            return g;
        }
        if (!a(context, "android.permission.READ_PHONE_STATE")) {
            return g;
        }
        TelephonyManager z = z(context);
        if (z == null) {
            return "";
        }
        String subscriberId = z.getSubscriberId();
        g = subscriberId;
        if (subscriberId == null) {
            g = "";
        }
        return g;
    }

    private static String u(Context context) {
        if (!a(context, "android.permission.READ_PHONE_STATE")) {
            return null;
        }
        TelephonyManager z = z(context);
        if (z == null) {
            return "";
        }
        String simOperatorName = z.getSimOperatorName();
        if (TextUtils.isEmpty(simOperatorName)) {
            simOperatorName = z.getNetworkOperatorName();
        }
        return simOperatorName;
    }

    public static String f(Context context) {
        try {
            if (f5888a != null && !"".equals(f5888a)) {
                return f5888a;
            }
            if (a(context, "android.permission.WRITE_SETTINGS")) {
                f5888a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            if (f5888a != null && !"".equals(f5888a)) {
                return f5888a;
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    File file = new File(absolutePath + "/.UTSystemConfig/Global/Alvin2.xml");
                    if (file.exists()) {
                        SAXParserFactory.newInstance().newSAXParser().parse(file, new a());
                    }
                }
            } catch (Throwable unused) {
            }
            if (f5888a == null) {
                return "";
            }
            return f5888a;
        } catch (Throwable unused2) {
        }
    }

    static String h(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context != null) {
            try {
                if (a(context, "android.permission.ACCESS_WIFI_STATE")) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager == null) {
                        return "";
                    }
                    if (wifiManager.isWifiEnabled()) {
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults != null) {
                            if (scanResults.size() != 0) {
                                List<ScanResult> a2 = a(scanResults);
                                int i = 0;
                                boolean z = true;
                                while (i < a2.size() && i < 7) {
                                    ScanResult scanResult = a2.get(i);
                                    if (z) {
                                        z = false;
                                    } else {
                                        sb.append(";");
                                    }
                                    sb.append(scanResult.BSSID);
                                    i++;
                                }
                            }
                        }
                        return sb.toString();
                    }
                    return sb.toString();
                }
            } catch (Throwable th) {
                dd.a(th, "DeviceInfo", "getWifiMacs");
            }
        }
        return sb.toString();
    }

    public static String i(Context context) {
        try {
            if (f5891d != null && !"".equals(f5891d)) {
                return f5891d;
            }
            if (!a(context, "android.permission.ACCESS_WIFI_STATE")) {
                return f5891d;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return "";
            }
            f5891d = wifiManager.getConnectionInfo().getMacAddress();
            if ("02:00:00:00:00:00".equals(f5891d) || "00:00:00:00:00:00".equals(f5891d)) {
                f5891d = d();
            }
            return f5891d;
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getDeviceMac");
        }
    }

    static String p(Context context) {
        StringBuilder sb;
        try {
            if (f5892e != null && !"".equals(f5892e)) {
                return f5892e;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return "";
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i2 > i) {
                sb = new StringBuilder();
                sb.append(i);
                sb.append("*");
                sb.append(i2);
            } else {
                sb = new StringBuilder();
                sb.append(i2);
                sb.append("*");
                sb.append(i);
            }
            f5892e = sb.toString();
            return f5892e;
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "getReslution");
        }
    }

    static String[] j(Context context) {
        try {
            if (a(context, "android.permission.READ_PHONE_STATE")) {
                if (a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        return new String[]{"", ""};
                    }
                    CellLocation cellLocation = telephonyManager.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        int cid = gsmCellLocation.getCid();
                        int lac = gsmCellLocation.getLac();
                        return new String[]{lac + "||" + cid, "gsm"};
                    }
                    if (cellLocation instanceof CdmaCellLocation) {
                        CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                        int systemId = cdmaCellLocation.getSystemId();
                        int networkId = cdmaCellLocation.getNetworkId();
                        int baseStationId = cdmaCellLocation.getBaseStationId();
                        return new String[]{systemId + "||" + networkId + "||" + baseStationId, "cdma"};
                    }
                    return new String[]{"", ""};
                }
            }
            return new String[]{"", ""};
        } catch (Throwable th) {
            dd.a(th, "DeviceInfo", "cellInfo");
        }
    }

    private static boolean a(Context context, String str) {
        if (context == null || context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }
}
