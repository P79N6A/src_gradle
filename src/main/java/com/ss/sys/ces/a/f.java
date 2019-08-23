package com.ss.sys.ces.a;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    static class a implements Comparator<Object> {
        a() {
        }

        public final int compare(Object obj, Object obj2) {
            int abs = Math.abs(((ScanResult) obj).level);
            int abs2 = Math.abs(((ScanResult) obj2).level);
            if (abs > abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }
    }

    public static String a(Context context) {
        String str;
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            String bssid = connectionInfo.getBSSID();
            String trim = bssid == null ? "" : bssid.trim();
            String ssid = connectionInfo.getSSID();
            String replace = (ssid == null ? "" : ssid.trim()).replace(' ', ' ').replace('\'', ' ').replace('\"', ' ');
            String num = Integer.toString(connectionInfo.getIpAddress());
            String trim2 = num == null ? "" : num.trim();
            str = trim + "[<!>]" + replace + "[<!>]" + trim2 + "[<!>]";
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String b(Context context) {
        String str;
        JSONArray jSONArray = new JSONArray();
        if (context == null) {
            return jSONArray.toString();
        }
        try {
            List<ScanResult> scanResults = ((WifiManager) context.getSystemService("wifi")).getScanResults();
            if (scanResults != null) {
                if (scanResults.size() > 0) {
                    Collections.sort(scanResults, new a());
                    int i = 0;
                    while (i < scanResults.size() && i < 10) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("ss", scanResults.get(i).SSID);
                            jSONObject.put(NotificationStyle.BASE_STYLE, scanResults.get(i).BSSID);
                            jSONArray.put(jSONObject);
                        } catch (JSONException unused) {
                        }
                        i++;
                    }
                    str = jSONArray.toString();
                    return str == null ? "[]" : str.trim();
                }
            }
            return jSONArray.toString();
        } catch (Throwable unused2) {
            str = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r4) {
        /*
            r0 = 0
            java.lang.String r1 = "location"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch:{ Throwable -> 0x0071 }
            android.location.LocationManager r4 = (android.location.LocationManager) r4     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r1 = "gps"
            android.location.Location r1 = r4.getLastKnownLocation(r1)     // Catch:{ Throwable -> 0x0071 }
            if (r1 == 0) goto L_0x002e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0071 }
            r4.<init>()     // Catch:{ Throwable -> 0x0071 }
            double r2 = r1.getLongitude()     // Catch:{ Throwable -> 0x0071 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r2 = ","
            r4.append(r2)     // Catch:{ Throwable -> 0x0071 }
            double r1 = r1.getLatitude()     // Catch:{ Throwable -> 0x0071 }
        L_0x0026:
            r4.append(r1)     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0071 }
            goto L_0x0072
        L_0x002e:
            java.lang.String r1 = "network"
            android.location.Location r1 = r4.getLastKnownLocation(r1)     // Catch:{ Throwable -> 0x0071 }
            if (r1 == 0) goto L_0x004c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0071 }
            r4.<init>()     // Catch:{ Throwable -> 0x0071 }
            double r2 = r1.getLongitude()     // Catch:{ Throwable -> 0x0071 }
            r4.append(r2)     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r2 = ","
            r4.append(r2)     // Catch:{ Throwable -> 0x0071 }
            double r1 = r1.getLatitude()     // Catch:{ Throwable -> 0x0071 }
            goto L_0x0026
        L_0x004c:
            java.lang.String r1 = "passive"
            android.location.Location r4 = r4.getLastKnownLocation(r1)     // Catch:{ Throwable -> 0x0071 }
            if (r4 == 0) goto L_0x0071
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0071 }
            r1.<init>()     // Catch:{ Throwable -> 0x0071 }
            double r2 = r4.getLongitude()     // Catch:{ Throwable -> 0x0071 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r2 = ","
            r1.append(r2)     // Catch:{ Throwable -> 0x0071 }
            double r2 = r4.getLatitude()     // Catch:{ Throwable -> 0x0071 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r4 = r1.toString()     // Catch:{ Throwable -> 0x0071 }
            r0 = r4
        L_0x0071:
            r4 = r0
        L_0x0072:
            if (r4 != 0) goto L_0x0077
            java.lang.String r4 = ""
            goto L_0x007b
        L_0x0077:
            java.lang.String r4 = r4.trim()
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.a.f.c(android.content.Context):java.lang.String");
    }
}
