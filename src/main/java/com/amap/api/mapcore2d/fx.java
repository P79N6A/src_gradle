package com.amap.api.mapcore2d;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public final class fx {

    /* renamed from: e  reason: collision with root package name */
    static long f6196e;

    /* renamed from: f  reason: collision with root package name */
    static long f6197f;
    static long g;
    static long h;

    /* renamed from: a  reason: collision with root package name */
    WifiManager f6198a;

    /* renamed from: b  reason: collision with root package name */
    Object f6199b = new Object();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<ScanResult> f6200c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<ScanResult> f6201d = new ArrayList<>();
    Context i;
    boolean j = false;
    StringBuilder k = null;
    boolean l = true;
    boolean m = true;
    String n = "isScanAlwaysAvailable";
    String o = null;
    TreeMap<Integer, ScanResult> p = null;
    public boolean q = true;
    ConnectivityManager r = null;
    private volatile WifiInfo s = null;

    public fx(Context context, WifiManager wifiManager) {
        this.f6198a = wifiManager;
        this.i = context;
    }

    private static boolean a(int i2) {
        int i3;
        try {
            i3 = WifiManager.calculateSignalLevel(i2, 20);
        } catch (ArithmeticException e2) {
            gc.a(e2, "APS", "wifiSigFine");
            i3 = 20;
        }
        return i3 > 0;
    }

    public static boolean a(WifiInfo wifiInfo) {
        return wifiInfo != null && !TextUtils.isEmpty(wifiInfo.getSSID()) && gf.a(wifiInfo.getBSSID());
    }

    public static String i() {
        return String.valueOf(gf.b() - h);
    }

    private List<ScanResult> j() {
        if (this.f6198a != null) {
            try {
                List<ScanResult> scanResults = this.f6198a.getScanResults();
                this.o = null;
                return scanResults;
            } catch (SecurityException e2) {
                this.o = e2.getMessage();
            } catch (Throwable th) {
                this.o = null;
                gc.a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    private WifiInfo k() {
        try {
            if (this.f6198a != null) {
                return this.f6198a.getConnectionInfo();
            }
        } catch (Throwable th) {
            gc.a(th, "WifiManagerWrapper", "getConnectionInfo");
        }
        return null;
    }

    private int l() {
        if (this.f6198a != null) {
            return this.f6198a.getWifiState();
        }
        return 4;
    }

    private boolean m() {
        if (gf.b() - f6196e < 4900) {
            return false;
        }
        if ((n() && gf.b() - f6196e < 9900) || this.f6198a == null) {
            return false;
        }
        f6196e = gf.b();
        return this.f6198a.startScan();
    }

    private boolean n() {
        if (this.r == null) {
            this.r = (ConnectivityManager) gf.a(this.i, "connectivity");
        }
        return a(this.r);
    }

    private boolean o() {
        boolean z;
        boolean z2;
        WifiManager wifiManager = this.f6198a;
        if (wifiManager == null) {
            return false;
        }
        try {
            z = wifiManager.isWifiEnabled();
        } catch (Throwable th) {
            gc.a(th, "WifiManagerWrapper", "wifiEnabled1");
            z = false;
        }
        if (!z && gf.c() > 17) {
            try {
                z2 = String.valueOf(gd.a(wifiManager, this.n, new Object[0])).equals("true");
            } catch (Throwable th2) {
                gc.a(th2, "WifiManagerWrapper", "wifiEnabled");
            }
            return z2;
        }
        z2 = z;
        return z2;
    }

    private void p() {
        String str;
        if (this.f6200c != null && !this.f6200c.isEmpty()) {
            if (gf.b() - h > 3600000) {
                b();
                this.f6200c.clear();
            }
            if (this.p == null) {
                this.p = new TreeMap<>(Collections.reverseOrder());
            }
            this.p.clear();
            int size = this.f6200c.size();
            for (int i2 = 0; i2 < size; i2++) {
                ScanResult scanResult = this.f6200c.get(i2);
                if (gf.a(scanResult != null ? scanResult.BSSID : "") && (size <= 20 || a(scanResult.level))) {
                    if (!TextUtils.isEmpty(scanResult.SSID)) {
                        if (!"<unknown ssid>".equals(scanResult.SSID)) {
                            str = String.valueOf(i2);
                        }
                        this.p.put(Integer.valueOf((scanResult.level * 25) + i2), scanResult);
                    } else {
                        str = "unkwn";
                    }
                    scanResult.SSID = str;
                    this.p.put(Integer.valueOf((scanResult.level * 25) + i2), scanResult);
                }
            }
            this.f6200c.clear();
            for (ScanResult add : this.p.values()) {
                this.f6200c.add(add);
            }
            this.p.clear();
        }
    }

    private void q() {
        if (t()) {
            long b2 = gf.b();
            if (b2 - f6197f >= 10000) {
                synchronized (this.f6199b) {
                    this.f6201d.clear();
                }
            }
            s();
            if (b2 - f6197f >= 10000) {
                for (int i2 = 20; i2 > 0 && this.f6201d.isEmpty(); i2--) {
                    try {
                        Thread.sleep(150);
                    } catch (Throwable unused) {
                    }
                }
            }
            synchronized (this.f6199b) {
            }
        }
    }

    private void r() {
        ArrayList<ScanResult> arrayList = this.f6200c;
        ArrayList<ScanResult> arrayList2 = this.f6201d;
        arrayList.clear();
        synchronized (this.f6199b) {
            if (arrayList2 != null) {
                try {
                    if (arrayList2.size() > 0) {
                        arrayList.addAll(arrayList2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void s() {
        if (t()) {
            try {
                if (m()) {
                    g = gf.b();
                }
            } catch (Throwable th) {
                gc.a(th, "APS", "updateWifi");
            }
        }
    }

    private boolean t() {
        this.q = o();
        if (!this.q || !this.l) {
            return false;
        }
        if (g != 0) {
            if (gf.b() - g < 4900 || gf.b() - h < 1500) {
                return false;
            }
            int i2 = ((gf.b() - h) > 4900 ? 1 : ((gf.b() - h) == 4900 ? 0 : -1));
        }
        return true;
    }

    public final ArrayList<ScanResult> a() {
        return this.f6200c;
    }

    public final void a(boolean z) {
        Context context = this.i;
        if (this.f6198a != null && context != null && z && gf.c() > 17) {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                if (((Integer) gd.a("android.provider.Settings$Global", "getInt", new Object[]{contentResolver, "wifi_scan_always_enabled"}, (Class<?>[]) new Class[]{ContentResolver.class, String.class})).intValue() == 0) {
                    gd.a("android.provider.Settings$Global", "putInt", new Object[]{contentResolver, "wifi_scan_always_enabled", 1}, (Class<?>[]) new Class[]{ContentResolver.class, String.class, Integer.TYPE});
                }
            } catch (Throwable th) {
                gc.a(th, "WifiManagerWrapper", "enableWifiAlwaysScan");
            }
        }
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        WifiManager wifiManager = this.f6198a;
        boolean z = false;
        if (wifiManager == null) {
            return false;
        }
        try {
            if (gf.a(connectivityManager.getActiveNetworkInfo()) == 1 && a(wifiManager.getConnectionInfo())) {
                z = true;
            }
        } catch (Throwable th) {
            gc.a(th, "WifiManagerWrapper", "wifiAccess");
        }
        return z;
    }

    public final void b() {
        this.s = null;
        synchronized (this.f6199b) {
            this.f6201d.clear();
        }
    }

    public final void b(boolean z) {
        if (z) {
            q();
        } else {
            s();
        }
        if (gf.b() - h > 20000) {
            synchronized (this.f6199b) {
                this.f6201d.clear();
            }
        }
        f6197f = gf.b();
        if (this.f6201d.isEmpty()) {
            h = gf.b();
            List<ScanResult> j2 = j();
            if (j2 != null) {
                synchronized (this.f6199b) {
                    this.f6201d.addAll(j2);
                }
            }
            r();
            p();
        }
    }

    public final void c() {
        if (this.f6198a != null && gf.b() - h > 4900) {
            List<ScanResult> list = null;
            try {
                list = j();
            } catch (Throwable th) {
                gc.a(th, "APS", "onReceive part1");
            }
            if (list != null) {
                synchronized (this.f6199b) {
                    this.f6201d.clear();
                    this.f6201d.addAll(list);
                    h = gf.b();
                }
            } else {
                synchronized (this.f6199b) {
                    this.f6201d.clear();
                }
            }
            r();
            p();
        }
    }

    public final void c(boolean z) {
        this.l = z;
        this.m = true;
    }

    public final void d() {
        int i2;
        if (this.f6198a != null) {
            try {
                i2 = l();
            } catch (Throwable th) {
                gc.a(th, "APS", "onReceive part");
                i2 = 4;
            }
            if (this.f6201d == null) {
                this.f6201d = new ArrayList<>();
            }
            if (i2 != 4) {
                switch (i2) {
                    case 0:
                        b();
                        return;
                    case 1:
                        b();
                        return;
                }
            } else {
                b();
            }
        }
    }

    public final boolean e() {
        return this.q;
    }

    public final WifiInfo f() {
        this.s = k();
        return this.s;
    }

    public final boolean g() {
        return this.j;
    }

    public final void h() {
        b();
        this.f6200c.clear();
    }
}
