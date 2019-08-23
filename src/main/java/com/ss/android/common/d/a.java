package com.ss.android.common.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28251a;

    static double b(double d2) {
        return (d2 * 3.141592653589793d) / 180.0d;
    }

    static double a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, null, f28251a, true, 15830, new Class[]{Double.TYPE}, Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, null, f28251a, true, 15830, new Class[]{Double.TYPE}, Double.TYPE)).doubleValue();
        }
        double sin = Math.sin(d2 / 2.0d);
        return sin * sin;
    }

    @SuppressLint({"MissingPermission"})
    public static List<String> a(Context context) {
        Context context2 = context;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f28251a, true, 15828, new Class[]{Context.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{context2}, null, f28251a, true, 15828, new Class[]{Context.class}, List.class);
        }
        WifiManager wifiManager = (WifiManager) context2.getSystemService("wifi");
        if (!wifiManager.isWifiEnabled()) {
            return Collections.EMPTY_LIST;
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (CollectionUtils.isEmpty(scanResults)) {
            return Collections.EMPTY_LIST;
        }
        Collections.sort(scanResults, new Comparator<ScanResult>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28252a;

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                ScanResult scanResult = (ScanResult) obj;
                ScanResult scanResult2 = (ScanResult) obj2;
                if (PatchProxy.isSupport(new Object[]{scanResult, scanResult2}, this, f28252a, false, 15832, new Class[]{ScanResult.class, ScanResult.class}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{scanResult, scanResult2}, this, f28252a, false, 15832, new Class[]{ScanResult.class, ScanResult.class}, Integer.TYPE)).intValue();
                }
                int calculateSignalLevel = WifiManager.calculateSignalLevel(scanResult.level, 10);
                int calculateSignalLevel2 = WifiManager.calculateSignalLevel(scanResult2.level, 10);
                if (calculateSignalLevel < calculateSignalLevel2) {
                    return 1;
                }
                if (calculateSignalLevel > calculateSignalLevel2) {
                    return -1;
                }
                return 0;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (ScanResult next : scanResults) {
            if (i >= 10) {
                break;
            }
            arrayList.add(next.BSSID);
            i++;
        }
        a("scanWifi result >>>>>>>>>>>>>> size " + scanResults.size());
        return arrayList;
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f28251a, true, 15827, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f28251a, true, 15827, new Class[]{String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (PatchProxy.isSupport(new Object[]{str2}, a2, d.f28268a, false, 15872, new Class[]{String.class}, d.class)) {
            d dVar = (d) PatchProxy.accessDispatch(new Object[]{str2}, a2, d.f28268a, false, 15872, new Class[]{String.class}, d.class);
        } else if (a2.f28271c) {
            StringBuilder sb = a2.f28270b;
            sb.append(str2);
            sb.append("\n");
        }
    }
}
