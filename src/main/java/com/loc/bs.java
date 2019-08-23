package com.loc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

public final class bs {

    /* renamed from: c  reason: collision with root package name */
    static long f25577c;

    /* renamed from: d  reason: collision with root package name */
    static long f25578d;

    /* renamed from: e  reason: collision with root package name */
    static long f25579e;

    /* renamed from: f  reason: collision with root package name */
    static long f25580f;
    static long g;

    /* renamed from: a  reason: collision with root package name */
    WifiManager f25581a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<ScanResult> f25582b = new ArrayList<>();
    Context h;
    public boolean i = false;
    StringBuilder j = null;
    boolean k = true;
    boolean l = true;
    public String m = null;
    TreeMap<Integer, ScanResult> n = null;
    public boolean o = true;
    ConnectivityManager p = null;
    volatile boolean q = false;
    private volatile WifiInfo r = null;

    public bs(Context context, WifiManager wifiManager) {
        this.f25581a = wifiManager;
        this.h = context;
    }

    private static boolean a(int i2) {
        int i3;
        try {
            i3 = WifiManager.calculateSignalLevel(i2, 20);
        } catch (ArithmeticException e2) {
            ce.a(e2, "Aps", "wifiSigFine");
            i3 = 20;
        }
        return i3 > 0;
    }

    public static boolean a(WifiInfo wifiInfo) {
        return wifiInfo != null && !TextUtils.isEmpty(wifiInfo.getSSID()) && cn.a(wifiInfo.getBSSID());
    }

    private List<ScanResult> f() {
        if (this.f25581a != null) {
            try {
                List<ScanResult> scanResults = this.f25581a.getScanResults();
                this.m = null;
                return scanResults;
            } catch (SecurityException e2) {
                this.m = e2.getMessage();
            } catch (Throwable th) {
                this.m = null;
                ce.a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    private WifiInfo g() {
        try {
            if (this.f25581a != null) {
                return this.f25581a.getConnectionInfo();
            }
        } catch (Throwable th) {
            ce.a(th, "WifiManagerWrapper", "getConnectionInfo");
        }
        return null;
    }

    private List<WifiConfiguration> h() {
        if (this.f25581a != null) {
            return this.f25581a.getConfiguredNetworks();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[Catch:{ Throwable -> 0x0055 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
            r5 = this;
            boolean r0 = r5.j()
            if (r0 == 0) goto L_0x005d
            long r0 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0055 }
            long r2 = f25577c     // Catch:{ Throwable -> 0x0055 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 4900(0x1324, double:2.421E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x004b
            android.net.ConnectivityManager r0 = r5.p     // Catch:{ Throwable -> 0x0055 }
            if (r0 != 0) goto L_0x0024
            android.content.Context r0 = r5.h     // Catch:{ Throwable -> 0x0055 }
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = com.loc.cn.a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ Throwable -> 0x0055 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Throwable -> 0x0055 }
            r5.p = r0     // Catch:{ Throwable -> 0x0055 }
        L_0x0024:
            android.net.ConnectivityManager r0 = r5.p     // Catch:{ Throwable -> 0x0055 }
            boolean r0 = r5.a((android.net.ConnectivityManager) r0)     // Catch:{ Throwable -> 0x0055 }
            if (r0 == 0) goto L_0x003a
            long r0 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0055 }
            long r2 = f25577c     // Catch:{ Throwable -> 0x0055 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 9900(0x26ac, double:4.8912E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x004b
        L_0x003a:
            android.net.wifi.WifiManager r0 = r5.f25581a     // Catch:{ Throwable -> 0x0055 }
            if (r0 == 0) goto L_0x004b
            long r0 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0055 }
            f25577c = r0     // Catch:{ Throwable -> 0x0055 }
            android.net.wifi.WifiManager r0 = r5.f25581a     // Catch:{ Throwable -> 0x0055 }
            boolean r0 = r0.startScan()     // Catch:{ Throwable -> 0x0055 }
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x0054
            long r0 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0055 }
            f25579e = r0     // Catch:{ Throwable -> 0x0055 }
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = "WifiManager"
            java.lang.String r2 = "wifiScan"
            com.loc.ce.a(r0, r1, r2)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bs.i():void");
    }

    private boolean j() {
        this.o = this.f25581a == null ? false : cn.g(this.h);
        if (!this.o || !this.k) {
            return false;
        }
        if (f25579e != 0) {
            if (cn.b() - f25579e < 4900 || cn.b() - f25580f < 1500) {
                return false;
            }
            int i2 = ((cn.b() - f25580f) > 4900 ? 1 : ((cn.b() - f25580f) == 4900 ? 0 : -1));
        }
        return true;
    }

    public final ArrayList<ScanResult> a() {
        if (this.f25582b == null) {
            return null;
        }
        ArrayList<ScanResult> arrayList = new ArrayList<>();
        if (!this.f25582b.isEmpty()) {
            arrayList.addAll(this.f25582b);
        }
        return arrayList;
    }

    public final void a(boolean z) {
        String str;
        if (!z) {
            i();
        } else if (j()) {
            long b2 = cn.b();
            if (b2 - f25578d >= 10000) {
                this.f25582b.clear();
                g = f25580f;
            }
            i();
            if (b2 - f25578d >= 10000) {
                for (int i2 = 20; i2 > 0 && f25580f == g; i2--) {
                    try {
                        Thread.sleep(150);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.q) {
            this.q = false;
            b();
        }
        if (g != f25580f) {
            List<ScanResult> list = null;
            try {
                list = f();
            } catch (Throwable th) {
                ce.a(th, "WifiManager", "updateScanResult");
            }
            g = f25580f;
            if (list != null) {
                this.f25582b.clear();
                this.f25582b.addAll(list);
            } else {
                this.f25582b.clear();
            }
        }
        if (cn.b() - f25580f > 20000) {
            this.f25582b.clear();
        }
        f25578d = cn.b();
        if (this.f25582b.isEmpty()) {
            f25580f = cn.b();
            List<ScanResult> f2 = f();
            if (f2 != null) {
                this.f25582b.addAll(f2);
            }
        }
        if (this.f25582b != null && !this.f25582b.isEmpty()) {
            if (cn.b() - f25580f > 3600000) {
                b();
            }
            if (this.n == null) {
                this.n = new TreeMap<>(Collections.reverseOrder());
            }
            this.n.clear();
            int size = this.f25582b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ScanResult scanResult = this.f25582b.get(i3);
                if (cn.a(scanResult != null ? scanResult.BSSID : "") && (size <= 20 || a(scanResult.level))) {
                    if (!TextUtils.isEmpty(scanResult.SSID)) {
                        if (!"<unknown ssid>".equals(scanResult.SSID)) {
                            str = String.valueOf(i3);
                        }
                        this.n.put(Integer.valueOf((scanResult.level * 25) + i3), scanResult);
                    } else {
                        str = "unkwn";
                    }
                    scanResult.SSID = str;
                    this.n.put(Integer.valueOf((scanResult.level * 25) + i3), scanResult);
                }
            }
            this.f25582b.clear();
            for (ScanResult add : this.n.values()) {
                this.f25582b.add(add);
            }
            this.n.clear();
        }
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        WifiManager wifiManager = this.f25581a;
        boolean z = false;
        if (wifiManager == null) {
            return false;
        }
        try {
            if (cn.a(connectivityManager.getActiveNetworkInfo()) == 1 && a(wifiManager.getConnectionInfo())) {
                z = true;
            }
        } catch (Throwable th) {
            ce.a(th, "WifiManagerWrapper", "wifiAccess");
        }
        return z;
    }

    public final void b() {
        this.r = null;
        this.f25582b.clear();
    }

    public final WifiInfo c() {
        this.r = g();
        return this.r;
    }

    public final String d() {
        int i2 = 0;
        if (this.j == null) {
            this.j = new StringBuilder(700);
        } else {
            this.j.delete(0, this.j.length());
        }
        this.i = false;
        String str = "";
        this.r = c();
        if (a(this.r)) {
            str = this.r.getBSSID();
        }
        int size = this.f25582b.size();
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = this.f25582b.get(i3).BSSID;
            if (!this.l && !"<unknown ssid>".equals(this.f25582b.get(i3).SSID)) {
                z = true;
            }
            String str3 = "nb";
            if (str.equals(str2)) {
                str3 = "access";
                z2 = true;
            }
            this.j.append(String.format(Locale.US, "#%s,%s", new Object[]{str2, str3}));
        }
        if (this.f25582b.size() == 0) {
            z = true;
        }
        try {
            if (!this.l && !z) {
                List<WifiConfiguration> h2 = h();
                int i4 = 0;
                while (h2 != null) {
                    try {
                        if (i2 >= h2.size()) {
                            break;
                        }
                        if (this.j.toString().contains(h2.get(i2).BSSID)) {
                            i4 = 1;
                        }
                        i2++;
                    } catch (Throwable unused) {
                    }
                }
                i2 = i4;
            }
        } catch (Throwable unused2) {
        }
        if (!this.l && !z && i2 == 0) {
            this.i = true;
        }
        if (!z2 && !TextUtils.isEmpty(str)) {
            StringBuilder sb = this.j;
            sb.append("#");
            sb.append(str);
            this.j.append(",access");
        }
        return this.j.toString();
    }

    public final boolean e() {
        try {
            List<WifiConfiguration> h2 = h();
            return h2 != null && !h2.isEmpty();
        } catch (Throwable unused) {
            return false;
        }
    }
}
