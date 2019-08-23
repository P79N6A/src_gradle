package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class fd extends ex {

    /* renamed from: a  reason: collision with root package name */
    private Comparator<ScanResult> f82007a = new fe(this);

    public fd(Context context, int i) {
        super(context, i);
    }

    private boolean c() {
        PackageManager packageManager = this.f321a.getPackageManager();
        String packageName = this.f321a.getPackageName();
        if (Build.VERSION.SDK_INT >= 23) {
            if (packageManager.checkPermission("android.permission.ACCESS_WIFI_STATE", packageName) == 0 && (packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packageName) == 0 || packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", packageName) == 0)) {
                return true;
            }
        } else if (packageManager.checkPermission("android.permission.ACCESS_WIFI_STATE", packageName) == 0) {
            return true;
        }
        return false;
    }

    public int a() {
        return 8;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m225a() {
        return im.WIFI;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m226a() {
        StringBuilder sb = new StringBuilder();
        WifiManager wifiManager = (WifiManager) this.f321a.getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        if (wifiManager.isWifiEnabled()) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                String ssid = connectionInfo.getSSID();
                String bssid = connectionInfo.getBSSID();
                if (!c()) {
                    if (TextUtils.isEmpty(ssid)) {
                        ssid = "<unknown ssid>";
                    }
                    try {
                        if (TextUtils.isEmpty(bssid) || bssid.length() != 17 || "ff:ff:ff:ff:ff:ff".equals(bssid)) {
                            bssid = "02:00:00:00:00:00";
                        }
                    } catch (Throwable unused) {
                    }
                } else if (TextUtils.isEmpty(bssid) || bssid.length() != 17 || "ff:ff:ff:ff:ff:ff".equals(bssid)) {
                    bssid = "00:00:00:00:00:00";
                }
                sb.append(ssid);
                sb.append(",");
                sb.append(az.c(bssid));
                sb.append("|");
            }
        }
        b.c("MAC_FIX mac ssid and mac: " + sb.toString());
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (!ae.a(scanResults)) {
            Collections.sort(scanResults, this.f82007a);
            for (int i = 0; i < Math.min(10, scanResults.size()); i++) {
                ScanResult scanResult = scanResults.get(i);
                if (i > 0) {
                    sb.append(";");
                }
                if (scanResult != null) {
                    sb.append(scanResult.SSID);
                    sb.append(",");
                    sb.append(az.c(scanResult.BSSID));
                    sb.append(",");
                    sb.append(scanResult.level);
                }
            }
        }
        b.c("MAC_FIX mac ssid group : " + sb.toString());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }
}
