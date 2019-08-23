package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import com.ss.android.ugc.aweme.q.c;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ck {
    public static DhcpInfo a(Context context) {
        if (context == null) {
            return null;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            return null;
        }
        try {
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) == 0) {
                return wifiManager.getDhcpInfo();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m165a(Context context) {
        try {
            DhcpInfo a2 = a(context);
            if (a2 == null) {
                return null;
            }
            return a(a2.gateway).getHostAddress();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r4, int r5) {
        /*
            r0 = 0
            java.lang.String r1 = "wifi"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch:{ Exception -> 0x0046 }
            android.net.wifi.WifiManager r1 = (android.net.wifi.WifiManager) r1     // Catch:{ Exception -> 0x0046 }
            if (r1 == 0) goto L_0x0046
            boolean r2 = r1.isWifiEnabled()     // Catch:{ Exception -> 0x0046 }
            if (r2 != 0) goto L_0x0012
            goto L_0x0046
        L_0x0012:
            android.content.pm.PackageManager r2 = r4.getPackageManager()     // Catch:{ Exception -> 0x0027 }
            java.lang.String r3 = "android.permission.ACCESS_WIFI_STATE"
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x0027 }
            int r4 = r2.checkPermission(r3, r4)     // Catch:{ Exception -> 0x0027 }
            if (r4 != 0) goto L_0x0027
            android.net.wifi.WifiInfo r4 = r1.getConnectionInfo()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0028
        L_0x0027:
            r4 = r0
        L_0x0028:
            if (r4 == 0) goto L_0x0046
            if (r5 != 0) goto L_0x0032
            java.lang.String r4 = r4.getMacAddress()     // Catch:{ Exception -> 0x0046 }
        L_0x0030:
            r0 = r4
            goto L_0x0046
        L_0x0032:
            r1 = 1
            if (r5 != r1) goto L_0x003a
            java.lang.String r4 = r4.getBSSID()     // Catch:{ Exception -> 0x0046 }
            goto L_0x0030
        L_0x003a:
            r1 = 2
            if (r5 != r1) goto L_0x0046
            java.lang.String r4 = r4.getSSID()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r4 = a((java.lang.String) r4)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0030
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ck.a(android.content.Context, int):java.lang.String");
    }

    public static String a(Context context, String str, String str2) {
        return c.a(context, "devicediscover", 0).getString(str, str2);
    }

    private static String a(String str) {
        return (!str.startsWith("\"") || !str.endsWith("\"")) ? str : str.substring(1, str.length() - 1);
    }

    public static InetAddress a(int i) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m166a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = c.a(context, "devicediscover", 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static String b(Context context) {
        try {
            DhcpInfo a2 = a(context);
            if (a2 == null) {
                return null;
            }
            return a(a2.serverAddress).getHostAddress();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r6) {
        /*
            r0 = 0
            java.lang.String r6 = a(r6, r0)
            if (r6 == 0) goto L_0x0015
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "02:00:00:00:00:00"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004a
        L_0x0015:
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 0
            char[] r3 = new char[r1]     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x0041, all -> 0x003a }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x0041, all -> 0x003a }
            java.lang.String r5 = "/sys/class/net/wlan0/address"
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0047, Exception -> 0x0041, all -> 0x003a }
            int r1 = r4.read(r3, r0, r1)     // Catch:{ FileNotFoundException -> 0x0038, Exception -> 0x0036, all -> 0x0033 }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0038, Exception -> 0x0036, all -> 0x0033 }
            r2.<init>(r3, r0, r1)     // Catch:{ FileNotFoundException -> 0x0038, Exception -> 0x0036, all -> 0x0033 }
            java.lang.String r0 = r2.trim()     // Catch:{ FileNotFoundException -> 0x0038, Exception -> 0x0036, all -> 0x0033 }
            r4.close()     // Catch:{ Exception -> 0x0031 }
        L_0x0031:
            r6 = r0
            goto L_0x004a
        L_0x0033:
            r6 = move-exception
            r2 = r4
            goto L_0x003b
        L_0x0036:
            r2 = r4
            goto L_0x0041
        L_0x0038:
            r2 = r4
            goto L_0x0047
        L_0x003a:
            r6 = move-exception
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r6
        L_0x0041:
            if (r2 == 0) goto L_0x004a
        L_0x0043:
            r2.close()     // Catch:{ Exception -> 0x004a }
            goto L_0x004a
        L_0x0047:
            if (r2 == 0) goto L_0x004a
            goto L_0x0043
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ck.c(android.content.Context):java.lang.String");
    }
}
