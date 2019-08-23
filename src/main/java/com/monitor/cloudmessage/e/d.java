package com.monitor.cloudmessage.e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static long f27354a;

    /* renamed from: b  reason: collision with root package name */
    public static long f27355b;

    /* renamed from: c  reason: collision with root package name */
    public static long f27356c;

    /* renamed from: d  reason: collision with root package name */
    public static long f27357d;

    enum a {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        private a(int i) {
            this.nativeInt = i;
        }
    }

    public static String a() {
        String str = "none";
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                String name = nextElement.getName();
                if (name != null && (TextUtils.equals(name.toLowerCase(), "eth0") || TextUtils.equals(name.toLowerCase(), "wlan0"))) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if ((nextElement2 instanceof Inet4Address) && !nextElement2.isLoopbackAddress()) {
                            str = nextElement2.getHostAddress();
                        }
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return str;
    }

    public static List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            if (allByName != null && allByName.length > 0) {
                for (InetAddress hostAddress : allByName) {
                    arrayList.add(hostAddress.getHostAddress());
                }
            }
        } catch (UnknownHostException unused) {
        }
        return arrayList;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a(a aVar) {
        String str = "";
        try {
            switch (aVar) {
                case WIFI:
                    return "wifi";
                case MOBILE_2G:
                    return "2g";
                case MOBILE_3G:
                    return "3g";
                case MOBILE_4G:
                    return "4g";
                case MOBILE:
                    str = "mobile";
                    break;
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context != null && Build.VERSION.SDK_INT >= 21) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                for (Network network : connectivityManager.getAllNetworks()) {
                    if (connectivityManager.getNetworkInfo(network).getType() == activeNetworkInfo.getType()) {
                        for (InetAddress hostAddress : connectivityManager.getLinkProperties(network).getDnsServers()) {
                            arrayList.add(hostAddress.getHostAddress());
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static List<String> d(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context != null && Build.VERSION.SDK_INT >= 21) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                for (Network network : connectivityManager.getAllNetworks()) {
                    if (connectivityManager.getNetworkInfo(network).getType() == activeNetworkInfo.getType()) {
                        for (RouteInfo gateway : connectivityManager.getLinkProperties(network).getRoutes()) {
                            InetAddress gateway2 = gateway.getGateway();
                            if (gateway2 != null) {
                                arrayList.add(gateway2.getHostAddress());
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static a e(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (1 == type) {
                        return a.WIFI;
                    }
                    if (type != 0) {
                        return a.MOBILE;
                    }
                    switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                        case 1:
                        case 2:
                        case 4:
                        case e.l /*?: ONE_ARG  (7 int)*/:
                        case 11:
                            return a.MOBILE_2G;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        case 14:
                        case 15:
                            return a.MOBILE_3G;
                        case 13:
                            return a.MOBILE_4G;
                        default:
                            return a.MOBILE;
                    }
                }
            }
            return a.NONE;
        } catch (Throwable unused) {
            return a.MOBILE;
        }
    }

    public static boolean a(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    if (1 == activeNetworkInfo.getType()) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        r3.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v2 java.net.HttpURLConnection) = (r2v0 java.net.HttpURLConnection), (r2v1 java.net.HttpURLConnection), (r2v1 java.net.HttpURLConnection), (r2v0 java.net.HttpURLConnection) binds: [B:1:0x0007, B:18:0x005d, B:19:?, B:2:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.lang.String r2 = "GET"
            r3.setRequestMethod(r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r3.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r3.setDoOutput(r2)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r3.setUseCaches(r1)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            java.lang.String r4 = "Charset"
            java.lang.String r5 = com.monitor.cloudmessage.d.c.a.f27350b     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r3.setRequestProperty(r4, r5)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            int r4 = r3.getResponseCode()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            java.lang.String r5 = "statusCode"
            r0.put(r5, r4)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            java.lang.String r5 = "header"
            java.util.Map r6 = r3.getHeaderFields()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            org.json.JSONObject r6 = com.monitor.cloudmessage.e.e.a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r6)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r8.put(r7, r0)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r4 != r7) goto L_0x004e
            r1 = 1
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r3.disconnect()
        L_0x0053:
            return r1
        L_0x0054:
            r7 = move-exception
            goto L_0x006a
        L_0x0056:
            r0 = move-exception
            r2 = r3
            goto L_0x005d
        L_0x0059:
            r7 = move-exception
            r3 = r2
            goto L_0x006a
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x0070, all -> 0x0059 }
            r8.put(r7, r0)     // Catch:{ JSONException -> 0x0070, all -> 0x0059 }
            if (r2 == 0) goto L_0x0069
            r2.disconnect()
        L_0x0069:
            return r1
        L_0x006a:
            if (r3 == 0) goto L_0x006f
            r3.disconnect()
        L_0x006f:
            throw r7
        L_0x0070:
            if (r2 == 0) goto L_0x0075
            r2.disconnect()
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.e.d.a(java.lang.String, org.json.JSONObject):boolean");
    }
}
