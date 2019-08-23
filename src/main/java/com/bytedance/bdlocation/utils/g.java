package com.bytedance.bdlocation.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.ss.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g {
    public static WifiInfo a(Context context) {
        if (context != null && c(context)) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
                if (((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED && connectionInfo.getSSID() != null) {
                    return connectionInfo;
                }
            } catch (Throwable th) {
                a.b("BDLocation", th);
            }
        }
        return null;
    }

    private static boolean c(Context context) {
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

    public static List<ScanResult> b(Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (ScanResult next : ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getScanResults()) {
                if (!(next.SSID == null || next.SSID.length() == 0 || next.capabilities.contains("[IBSS]"))) {
                    boolean z = false;
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ScanResult scanResult = (ScanResult) it2.next();
                        if (scanResult.SSID.equals(next.SSID) && scanResult.capabilities.equals(next.capabilities)) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        arrayList.add(next);
                    }
                }
            }
            return arrayList;
        } catch (Exception e2) {
            a.b("BDLocation", (Throwable) e2);
            return null;
        }
    }
}
