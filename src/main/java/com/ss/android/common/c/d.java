package com.ss.android.common.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.c.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28248a;

    /* renamed from: b  reason: collision with root package name */
    private static d f28249b;

    /* renamed from: c  reason: collision with root package name */
    private static WifiManager f28250c;

    @SuppressLint({"MissingPermission"})
    public final c a() {
        if (PatchProxy.isSupport(new Object[0], this, f28248a, false, 15799, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f28248a, false, 15799, new Class[0], c.class);
        }
        try {
            if (!f28250c.isWifiEnabled()) {
                return null;
            }
            WifiInfo connectionInfo = f28250c.getConnectionInfo();
            if (connectionInfo == null) {
                return null;
            }
            return new c.a().b(connectionInfo.getBSSID()).a(connectionInfo.getSSID()).a(connectionInfo.getRssi()).a();
        } catch (Exception unused) {
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public List<ScanResult> b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f28248a, false, 15800, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f28248a, false, 15800, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (!f28250c.isWifiEnabled()) {
                return arrayList;
            }
            for (ScanResult next : f28250c.getScanResults()) {
                if (!(next == null || next.SSID == null || next.SSID.length() == 0 || next.capabilities.contains("[IBSS]"))) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
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
        } catch (Exception unused) {
            return null;
        }
    }

    private d(Context context) {
        try {
            f28250c = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        } catch (Exception unused) {
        }
    }

    public static d a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f28248a, true, 15796, new Class[]{Context.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{context2}, null, f28248a, true, 15796, new Class[]{Context.class}, d.class);
        }
        if (f28249b == null) {
            synchronized (d.class) {
                if (f28249b == null) {
                    f28249b = new d(context2);
                }
            }
        }
        return f28249b;
    }

    public List<c> a(List<ScanResult> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f28248a, false, 15798, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f28248a, false, 15798, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (ScanResult next : list) {
            if (next != null) {
                try {
                    arrayList.add(new c.a().a(next.SSID).b(next.BSSID).a(next.level).a());
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}
