package com.loc;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import java.util.ArrayList;

@SuppressLint({"NewApi"})
public final class cm {
    static int E = -1;
    public static boolean I = true;
    private static int M = -1;
    public boolean A = false;
    int B = 12;
    bn C = null;
    boolean D = false;
    bm F = null;
    String G = null;
    br H = null;
    IntentFilter J = null;
    private int K = 0;
    private String L = null;
    private boolean N = true;

    /* renamed from: a  reason: collision with root package name */
    Context f25674a;

    /* renamed from: b  reason: collision with root package name */
    ConnectivityManager f25675b;

    /* renamed from: c  reason: collision with root package name */
    bs f25676c;

    /* renamed from: d  reason: collision with root package name */
    bq f25677d;

    /* renamed from: e  reason: collision with root package name */
    bu f25678e;

    /* renamed from: f  reason: collision with root package name */
    bl f25679f;
    cb g;
    ArrayList<ScanResult> h = new ArrayList<>();
    a i = null;
    AMapLocationClientOption j = new AMapLocationClientOption();
    AMapLocationServer k = null;
    long l = 0;
    cc m = null;
    boolean n = false;
    bz o = null;
    StringBuilder p = new StringBuilder();
    boolean q = true;
    boolean r = true;
    AMapLocationClientOption.GeoLanguage s = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean t = true;
    boolean u = false;
    WifiInfo v = null;
    boolean w = true;
    String x = null;
    StringBuilder y = null;
    boolean z = false;

    class a extends BroadcastReceiver {
        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x006b A[Catch:{ Throwable -> 0x005e, Throwable -> 0x007c }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0074 A[Catch:{ Throwable -> 0x005e, Throwable -> 0x007c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r4, android.content.Intent r5) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x0085
                if (r5 != 0) goto L_0x0006
                goto L_0x0085
            L_0x0006:
                java.lang.String r4 = r5.getAction()     // Catch:{ Throwable -> 0x007c }
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x007c }
                if (r5 == 0) goto L_0x0011
                return
            L_0x0011:
                java.lang.String r5 = "android.net.wifi.SCAN_RESULTS"
                boolean r5 = r4.equals(r5)     // Catch:{ Throwable -> 0x007c }
                if (r5 == 0) goto L_0x003c
                com.loc.cm r4 = com.loc.cm.this     // Catch:{ Throwable -> 0x007c }
                com.loc.bs r4 = r4.f25676c     // Catch:{ Throwable -> 0x007c }
                if (r4 == 0) goto L_0x007b
                com.loc.cm r4 = com.loc.cm.this     // Catch:{ Throwable -> 0x007c }
                com.loc.bs r4 = r4.f25676c     // Catch:{ Throwable -> 0x007c }
                android.net.wifi.WifiManager r4 = r4.f25581a     // Catch:{ Throwable -> 0x007c }
                if (r4 == 0) goto L_0x003b
                long r4 = com.loc.cn.b()     // Catch:{ Throwable -> 0x007c }
                long r0 = com.loc.bs.f25580f     // Catch:{ Throwable -> 0x007c }
                r2 = 0
                long r4 = r4 - r0
                r0 = 4900(0x1324, double:2.421E-320)
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 <= 0) goto L_0x003b
                long r4 = com.loc.cn.b()     // Catch:{ Throwable -> 0x007c }
                com.loc.bs.f25580f = r4     // Catch:{ Throwable -> 0x007c }
            L_0x003b:
                return
            L_0x003c:
                java.lang.String r5 = "android.net.wifi.WIFI_STATE_CHANGED"
                boolean r4 = r4.equals(r5)     // Catch:{ Throwable -> 0x007c }
                if (r4 == 0) goto L_0x007b
                com.loc.cm r4 = com.loc.cm.this     // Catch:{ Throwable -> 0x007c }
                com.loc.bs r4 = r4.f25676c     // Catch:{ Throwable -> 0x007c }
                if (r4 == 0) goto L_0x007b
                com.loc.cm r4 = com.loc.cm.this     // Catch:{ Throwable -> 0x007c }
                com.loc.bs r4 = r4.f25676c     // Catch:{ Throwable -> 0x007c }
                android.net.wifi.WifiManager r5 = r4.f25581a     // Catch:{ Throwable -> 0x007c }
                if (r5 == 0) goto L_0x007b
                r5 = 4
                android.net.wifi.WifiManager r0 = r4.f25581a     // Catch:{ Throwable -> 0x005e }
                if (r0 == 0) goto L_0x0066
                android.net.wifi.WifiManager r0 = r4.f25581a     // Catch:{ Throwable -> 0x005e }
                int r0 = r0.getWifiState()     // Catch:{ Throwable -> 0x005e }
                goto L_0x0067
            L_0x005e:
                r0 = move-exception
                java.lang.String r1 = "Aps"
                java.lang.String r2 = "onReceive part"
                com.loc.ce.a(r0, r1, r2)     // Catch:{ Throwable -> 0x007c }
            L_0x0066:
                r0 = 4
            L_0x0067:
                java.util.ArrayList<android.net.wifi.ScanResult> r1 = r4.f25582b     // Catch:{ Throwable -> 0x007c }
                if (r1 != 0) goto L_0x0072
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x007c }
                r1.<init>()     // Catch:{ Throwable -> 0x007c }
                r4.f25582b = r1     // Catch:{ Throwable -> 0x007c }
            L_0x0072:
                if (r0 == r5) goto L_0x0078
                switch(r0) {
                    case 0: goto L_0x0078;
                    case 1: goto L_0x0078;
                    default: goto L_0x0077;
                }     // Catch:{ Throwable -> 0x007c }
            L_0x0077:
                goto L_0x007b
            L_0x0078:
                r5 = 1
                r4.q = r5     // Catch:{ Throwable -> 0x007c }
            L_0x007b:
                return
            L_0x007c:
                r4 = move-exception
                java.lang.String r5 = "Aps"
                java.lang.String r0 = "onReceive"
                com.loc.ce.a(r4, r5, r0)
                return
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.cm.a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    static AMapLocationServer a(int i2, String str) {
        AMapLocationServer aMapLocationServer = new AMapLocationServer("");
        aMapLocationServer.setErrorCode(i2);
        aMapLocationServer.setLocationDetail(str);
        if (i2 == 15) {
            cj.a((String) null, 2151);
        }
        return aMapLocationServer;
    }

    private AMapLocationServer a(AMapLocationServer aMapLocationServer, am amVar) {
        if (amVar != null) {
            try {
                if (amVar.f25472a != null) {
                    if (amVar.f25472a.length != 0) {
                        cb cbVar = new cb();
                        String str = new String(amVar.f25472a, "UTF-8");
                        if (str.contains("\"status\":\"0\"")) {
                            AMapLocationServer a2 = cbVar.a(str, this.f25674a, amVar);
                            try {
                                a2.h(this.y.toString());
                                return a2;
                            } catch (Throwable th) {
                                AMapLocationServer aMapLocationServer2 = a2;
                                th = th;
                                aMapLocationServer = aMapLocationServer2;
                                aMapLocationServer.setErrorCode(4);
                                ce.a(th, "Aps", "checkResponseEntity");
                                StringBuilder sb = this.p;
                                sb.append("check response exception ex is" + th.getMessage() + "#0403");
                                aMapLocationServer.setLocationDetail(this.p.toString());
                                return aMapLocationServer;
                            }
                        } else if (!str.contains("</body></html>")) {
                            return null;
                        } else {
                            aMapLocationServer.setErrorCode(5);
                            if (this.f25676c == null || !this.f25676c.a(this.f25675b)) {
                                this.p.append("请求可能被劫持了#0502");
                                cj.a((String) null, 2052);
                            } else {
                                this.p.append("您连接的是一个需要登录的网络，请确认已经登入网络#0501");
                                cj.a((String) null, 2051);
                            }
                            aMapLocationServer.setLocationDetail(this.p.toString());
                            return aMapLocationServer;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                aMapLocationServer.setErrorCode(4);
                ce.a(th, "Aps", "checkResponseEntity");
                StringBuilder sb2 = this.p;
                sb2.append("check response exception ex is" + th.getMessage() + "#0403");
                aMapLocationServer.setLocationDetail(this.p.toString());
                return aMapLocationServer;
            }
        }
        aMapLocationServer.setErrorCode(4);
        this.p.append("网络异常,请求异常#0403");
        aMapLocationServer.h(this.y.toString());
        aMapLocationServer.setLocationDetail(this.p.toString());
        if (amVar != null) {
            cj.a(amVar.f25475d, 2041);
        }
        return aMapLocationServer;
    }

    private StringBuilder a(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        sb.append(this.f25677d.d());
        sb.append(this.f25676c.d());
        return sb;
    }

    public static void b(Context context) {
        try {
            if (M == -1 || cd.g(context)) {
                M = 1;
                cd.a(context);
            }
        } catch (Throwable th) {
            ce.a(th, "Aps", "initAuth");
        }
    }

    private void i() {
        if (this.o != null) {
            try {
                if (this.j == null) {
                    this.j = new AMapLocationClientOption();
                }
                int i2 = 0;
                if (this.j.getGeoLanguage() != null) {
                    switch (this.j.getGeoLanguage()) {
                        case DEFAULT:
                            break;
                        case ZH:
                            i2 = 1;
                            break;
                        case EN:
                            i2 = 2;
                            break;
                    }
                }
                this.o.a(this.j.getHttpTimeOut(), this.j.getLocationProtocol().equals(AMapLocationClientOption.AMapLocationProtocol.HTTPS), i2);
            } catch (Throwable unused) {
            }
        }
    }

    private void j() {
        try {
            if (this.i == null) {
                this.i = new a();
            }
            if (this.J == null) {
                this.J = new IntentFilter();
                this.J.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                this.J.addAction("android.net.wifi.SCAN_RESULTS");
            }
            this.f25674a.registerReceiver(this.i, this.J);
        } catch (Throwable th) {
            ce.a(th, "Aps", "initBroadcastListener");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0295, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x029b, code lost:
        if (r0.startsWith("#") != false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x029d, code lost:
        r0 = "#" + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ac, code lost:
        r0 = com.loc.cn.d() + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02bf, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018c, code lost:
        if (r11.w == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d0, code lost:
        if (r11.w == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d3, code lost:
        r1 = "cgi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d6, code lost:
        r1 = "cgiwifi";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d8, code lost:
        r0.append(r1);
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String k() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "network"
            com.loc.bq r2 = r11.f25677d
            int r2 = r2.b()
            com.loc.bq r3 = r11.f25677d
            com.loc.bp r3 = r3.a()
            java.util.ArrayList<android.net.wifi.ScanResult> r4 = r11.h
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0021
            java.util.ArrayList<android.net.wifi.ScanResult> r4 = r11.h
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r4 = 0
            goto L_0x0022
        L_0x0021:
            r4 = 1
        L_0x0022:
            r7 = 0
            if (r3 != 0) goto L_0x011c
            if (r4 == 0) goto L_0x011c
            android.net.ConnectivityManager r1 = r11.f25675b
            if (r1 != 0) goto L_0x0037
            android.content.Context r1 = r11.f25674a
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = com.loc.cn.a((android.content.Context) r1, (java.lang.String) r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r11.f25675b = r1
        L_0x0037:
            android.content.Context r1 = r11.f25674a
            boolean r1 = com.loc.cn.f((android.content.Context) r1)
            r2 = 2121(0x849, float:2.972E-42)
            r3 = 12
            if (r1 != 0) goto L_0x0050
            r11.B = r3
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r3 = "定位权限被禁用,请授予应用定位权限#1201"
            r1.append(r3)
            com.loc.cj.a((java.lang.String) r7, (int) r2)
            return r0
        L_0x0050:
            int r1 = com.loc.cn.c()
            r4 = 24
            if (r1 < r4) goto L_0x0073
            android.content.Context r1 = r11.f25674a
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r4 = "location_mode"
            int r1 = android.provider.Settings.Secure.getInt(r1, r4, r6)
            if (r1 != 0) goto L_0x0073
            r11.B = r3
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r3 = "定位服务没有开启，请在设置中打开定位服务开关#1206"
            r1.append(r3)
            com.loc.cj.a((java.lang.String) r7, (int) r2)
            return r0
        L_0x0073:
            com.loc.bq r1 = r11.f25677d
            java.lang.String r1 = r1.n
            com.loc.bs r4 = r11.f25676c
            java.lang.String r4 = r4.m
            com.loc.bs r5 = r11.f25676c
            android.net.ConnectivityManager r6 = r11.f25675b
            boolean r5 = r5.a((android.net.ConnectivityManager) r6)
            if (r5 != 0) goto L_0x0107
            com.loc.bs r5 = r11.f25676c
            boolean r5 = r5.e()
            if (r5 != 0) goto L_0x0107
            if (r4 == 0) goto L_0x0091
            goto L_0x0107
        L_0x0091:
            if (r1 == 0) goto L_0x00ac
            r11.B = r3
            com.loc.bs r1 = r11.f25676c
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x00a3
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r3 = "WIFI开关关闭，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限或者打开WIFI开关#1204"
        L_0x009f:
            r1.append(r3)
            goto L_0x00a8
        L_0x00a3:
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r3 = "获取的WIFI列表为空，并且获取基站权限被禁用，请在安全软件中打开应用的定位权限#1205"
            goto L_0x009f
        L_0x00a8:
            com.loc.cj.a((java.lang.String) r7, (int) r2)
            return r0
        L_0x00ac:
            android.content.Context r1 = r11.f25674a
            boolean r1 = com.loc.cn.a((android.content.Context) r1)
            if (r1 == 0) goto L_0x00cb
            com.loc.bs r1 = r11.f25676c
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x00cb
            r1 = 18
            r11.B = r1
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关#1801"
            r1.append(r2)
            r1 = 2132(0x854, float:2.988E-42)
            com.loc.cj.a((java.lang.String) r7, (int) r1)
            return r0
        L_0x00cb:
            com.loc.bs r1 = r11.f25676c
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x00ea
            com.loc.bq r1 = r11.f25677d
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x00ea
            r1 = 19
            r11.B = r1
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "没有检查到SIM卡，并且WIFI开关关闭，请打开WIFI开关或者插入SIM卡#1901"
            r1.append(r2)
            r1 = 2133(0x855, float:2.989E-42)
            com.loc.cj.a((java.lang.String) r7, (int) r1)
            return r0
        L_0x00ea:
            com.loc.bs r1 = r11.f25676c
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x00f8
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "获取到的基站为空，并且关闭了WIFI开关，请您打开WIFI开关在发起定位#1301"
        L_0x00f4:
            r1.append(r2)
            goto L_0x00fd
        L_0x00f8:
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "获取到的基站与WIFI为空，请移动到有WIFI的区域，若确定当前区域有WIFI，请检查是否授予APP定位权限#1302"
            goto L_0x00f4
        L_0x00fd:
            r1 = 13
            r11.B = r1
            r1 = 2131(0x853, float:2.986E-42)
            com.loc.cj.a((java.lang.String) r7, (int) r1)
            return r0
        L_0x0107:
            r11.B = r3
            if (r1 == 0) goto L_0x0113
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r3 = "获取基站与获取WIFI的权限都被禁用，请在安全软件中打开应用的定位权限#1202"
        L_0x010f:
            r1.append(r3)
            goto L_0x0118
        L_0x0113:
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r3 = "获取到的基站为空，并且获取WIFI权限被禁用,请在安全软件中打开应用的定位权限#1203"
            goto L_0x010f
        L_0x0118:
            com.loc.cj.a((java.lang.String) r7, (int) r2)
            return r0
        L_0x011c:
            com.loc.bs r4 = r11.f25676c
            android.net.wifi.WifiInfo r4 = r4.c()
            r11.v = r4
            android.net.wifi.WifiInfo r4 = r11.v
            boolean r4 = com.loc.bs.a((android.net.wifi.WifiInfo) r4)
            r11.w = r4
            switch(r2) {
                case 0: goto L_0x01e1;
                case 1: goto L_0x018f;
                case 2: goto L_0x0141;
                default: goto L_0x012f;
            }
        L_0x012f:
            r1 = 11
            r11.B = r1
            r1 = 2111(0x83f, float:2.958E-42)
            com.loc.cj.a((java.lang.String) r7, (int) r1)
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "get cgi failure#1101"
            r1.append(r2)
            goto L_0x028f
        L_0x0141:
            if (r3 == 0) goto L_0x028f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f25557a
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            int r2 = r3.f25558b
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            int r2 = r3.g
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            int r2 = r3.h
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            int r2 = r3.i
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.util.ArrayList<android.net.wifi.ScanResult> r1 = r11.h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01d6
            boolean r1 = r11.w
            if (r1 == 0) goto L_0x01d3
            goto L_0x01d6
        L_0x018f:
            if (r3 == 0) goto L_0x028f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r3.f25557a
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            int r2 = r3.f25558b
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            int r2 = r3.f25559c
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            int r2 = r3.f25560d
            r0.append(r2)
            java.lang.String r2 = "#"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.util.ArrayList<android.net.wifi.ScanResult> r1 = r11.h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x01d6
            boolean r1 = r11.w
            if (r1 == 0) goto L_0x01d3
            goto L_0x01d6
        L_0x01d3:
            java.lang.String r1 = "cgi"
            goto L_0x01d8
        L_0x01d6:
            java.lang.String r1 = "cgiwifi"
        L_0x01d8:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x028f
        L_0x01e1:
            java.util.ArrayList<android.net.wifi.ScanResult> r2 = r11.h
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x01f0
            boolean r2 = r11.w
            if (r2 == 0) goto L_0x01ee
            goto L_0x01f0
        L_0x01ee:
            r2 = 0
            goto L_0x01f1
        L_0x01f0:
            r2 = 1
        L_0x01f1:
            boolean r3 = r11.w
            r4 = 2021(0x7e5, float:2.832E-42)
            r8 = 2
            if (r3 == 0) goto L_0x020d
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r11.h
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x020d
            r11.B = r8
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "当前基站为伪基站，并且WIFI权限被禁用，请在安全软件中打开应用的定位权限#0201"
            r1.append(r2)
            com.loc.cj.a((java.lang.String) r7, (int) r4)
            return r0
        L_0x020d:
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r11.h
            int r3 = r3.size()
            r9 = 2022(0x7e6, float:2.833E-42)
            if (r3 != r5) goto L_0x024d
            r11.B = r8
            boolean r3 = r11.w
            if (r3 != 0) goto L_0x0228
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202"
            r1.append(r2)
            com.loc.cj.a((java.lang.String) r7, (int) r9)
            return r0
        L_0x0228:
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r11.h
            java.lang.Object r3 = r3.get(r6)
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3
            java.lang.String r3 = r3.BSSID
            com.loc.bs r10 = r11.f25676c
            android.net.wifi.WifiInfo r10 = r10.c()
            java.lang.String r10 = r10.getBSSID()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x024d
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "当前基站为伪基站，并且搜到的WIFI数量不足，请移动到WIFI比较丰富的区域#0202"
            r1.append(r2)
            com.loc.cj.a((java.lang.String) r7, (int) r4)
            return r0
        L_0x024d:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r3 = "#%s#"
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r6] = r1
            java.lang.String r0 = java.lang.String.format(r0, r3, r4)
            if (r2 == 0) goto L_0x026d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "wifi"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x028f
        L_0x026d:
            java.lang.String r2 = "network"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x028f
            java.lang.String r0 = ""
            r11.B = r8
            com.loc.bs r1 = r11.f25676c
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x0287
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "当前基站为伪基站,并且关闭了WIFI开关，请在设置中打开WIFI开关#0203"
        L_0x0283:
            r1.append(r2)
            goto L_0x028c
        L_0x0287:
            java.lang.StringBuilder r1 = r11.p
            java.lang.String r2 = "当前基站为伪基站,并且没有搜索到WIFI，请移动到WIFI比较丰富的区域#0204"
            goto L_0x0283
        L_0x028c:
            com.loc.cj.a((java.lang.String) r7, (int) r9)
        L_0x028f:
            java.lang.String r1 = "#"
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x02bf
            boolean r2 = r0.startsWith(r1)
            if (r2 != 0) goto L_0x02ac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x02ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.loc.cn.d()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x02bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cm.k():java.lang.String");
    }

    private boolean l() {
        this.h = this.f25676c.a();
        return this.h == null || this.h.size() <= 0;
    }

    public final AMapLocationServer a(double d2, double d3) {
        try {
            String a2 = this.o.a(this.f25674a, d2, d3);
            if (a2.contains("\"status\":\"1\"")) {
                AMapLocationServer a3 = this.g.a(a2);
                a3.setLatitude(d2);
                a3.setLongitude(d3);
                return a3;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final AMapLocationServer a(boolean z2) {
        int i2;
        String str;
        if (this.f25674a == null) {
            this.p.append("context is null#0101");
            cj.a((String) null, 2011);
            i2 = 1;
        } else if (this.f25676c.i) {
            i2 = 15;
            str = "networkLocation has been mocked!#1502";
            return a(i2, str);
        } else {
            a();
            if (TextUtils.isEmpty(this.x)) {
                i2 = this.B;
            } else {
                AMapLocationServer a2 = a(false, z2);
                if (cn.a(a2)) {
                    this.f25678e.f25591f = this.y.toString();
                    this.f25678e.g = this.f25677d.a();
                    a(a2);
                }
                return a2;
            }
        }
        str = this.p.toString();
        return a(i2, str);
    }

    /* access modifiers changed from: package-private */
    public void a(AMapLocationServer aMapLocationServer) {
        if (aMapLocationServer != null) {
            this.k = aMapLocationServer;
        }
    }

    public final void b(AMapLocationServer aMapLocationServer) {
        if (cn.a(aMapLocationServer)) {
            this.f25678e.a(this.x, this.y, aMapLocationServer, this.f25674a, true);
        }
    }

    public final void c() {
        if (this.p.length() > 0) {
            this.p.delete(0, this.p.length());
        }
    }

    public final void e() {
        try {
            a(this.f25674a);
            a(this.j);
            g();
            b(a(true, true));
        } catch (Throwable th) {
            ce.a(th, "Aps", "doFusionLocation");
        }
    }

    public final void g() {
        try {
            if (!this.z) {
                if (this.x != null) {
                    this.x = null;
                }
                if (this.y != null) {
                    this.y.delete(0, this.y.length());
                }
                if (this.u) {
                    j();
                }
                this.f25676c.a(this.u);
                this.h = this.f25676c.a();
                this.f25677d.a(true, l());
                this.x = k();
                if (!TextUtils.isEmpty(this.x)) {
                    this.y = a(this.y);
                }
                this.z = true;
            }
        } catch (Throwable th) {
            ce.a(th, "Aps", "initFirstLocateParam");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b9 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2 A[Catch:{ Throwable -> 0x0024, Throwable -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d9 A[Catch:{ Throwable -> 0x0024, Throwable -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6 A[Catch:{ Throwable -> 0x0024, Throwable -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1 A[Catch:{ Throwable -> 0x0024, Throwable -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc A[Catch:{ Throwable -> 0x0024, Throwable -> 0x0106 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r5) {
        /*
            r4 = this;
            android.content.Context r0 = r4.f25674a     // Catch:{ Throwable -> 0x0106 }
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            com.loc.bm r0 = new com.loc.bm     // Catch:{ Throwable -> 0x0106 }
            r0.<init>()     // Catch:{ Throwable -> 0x0106 }
            r4.F = r0     // Catch:{ Throwable -> 0x0106 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Throwable -> 0x0106 }
            r4.f25674a = r5     // Catch:{ Throwable -> 0x0106 }
            android.content.Context r5 = r4.f25674a     // Catch:{ Throwable -> 0x0106 }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "exception"
            boolean r2 = com.loc.cd.l     // Catch:{ Throwable -> 0x0024 }
            boolean r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x0024 }
            com.loc.cd.l = r0     // Catch:{ Throwable -> 0x0024 }
            com.loc.cd.e(r5)     // Catch:{ Throwable -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r0 = move-exception
            java.lang.String r1 = "AuthUtil"
            java.lang.String r2 = "loadLastAbleState p1"
            com.loc.ce.a(r0, r1, r2)     // Catch:{ Throwable -> 0x0106 }
        L_0x002c:
            java.lang.String r0 = "pref"
            java.lang.String r1 = "fn"
            int r2 = com.loc.cd.m     // Catch:{ Throwable -> 0x0065 }
            int r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (int) r2)     // Catch:{ Throwable -> 0x0065 }
            com.loc.cd.m = r0     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "mpn"
            int r2 = com.loc.cd.n     // Catch:{ Throwable -> 0x0065 }
            int r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (int) r2)     // Catch:{ Throwable -> 0x0065 }
            com.loc.cd.n = r0     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "igu"
            boolean r2 = com.loc.cd.o     // Catch:{ Throwable -> 0x0065 }
            boolean r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x0065 }
            com.loc.cd.o = r0     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "ms"
            int r2 = com.loc.cd.p     // Catch:{ Throwable -> 0x0065 }
            int r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (int) r2)     // Catch:{ Throwable -> 0x0065 }
            com.loc.cd.p = r0     // Catch:{ Throwable -> 0x0065 }
            int r0 = com.loc.cd.m     // Catch:{ Throwable -> 0x0065 }
            boolean r1 = com.loc.cd.o     // Catch:{ Throwable -> 0x0065 }
            int r2 = com.loc.cd.p     // Catch:{ Throwable -> 0x0065 }
            com.loc.at.a(r0, r1, r2)     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            java.lang.String r0 = "pref"
            java.lang.String r1 = "ca"
            boolean r2 = com.loc.cd.w     // Catch:{ Throwable -> 0x007d }
            boolean r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x007d }
            com.loc.cd.w = r0     // Catch:{ Throwable -> 0x007d }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "ct"
            long r2 = com.loc.cd.x     // Catch:{ Throwable -> 0x007d }
            long r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (long) r2)     // Catch:{ Throwable -> 0x007d }
            com.loc.cd.x = r0     // Catch:{ Throwable -> 0x007d }
        L_0x007d:
            java.lang.String r0 = "pref"
            java.lang.String r1 = "fr"
            boolean r2 = com.loc.cd.F     // Catch:{ Throwable -> 0x0089 }
            boolean r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x0089 }
            com.loc.cd.F = r0     // Catch:{ Throwable -> 0x0089 }
        L_0x0089:
            java.lang.String r0 = "pref"
            java.lang.String r1 = "ok0"
            boolean r2 = com.loc.cd.G     // Catch:{ Throwable -> 0x00b9 }
            boolean r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x00b9 }
            com.loc.cd.G = r0     // Catch:{ Throwable -> 0x00b9 }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "ok1"
            boolean r2 = com.loc.cd.J     // Catch:{ Throwable -> 0x00b9 }
            boolean r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x00b9 }
            com.loc.cd.J = r0     // Catch:{ Throwable -> 0x00b9 }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "ok2"
            boolean r2 = com.loc.cd.H     // Catch:{ Throwable -> 0x00b9 }
            boolean r0 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x00b9 }
            com.loc.cd.H = r0     // Catch:{ Throwable -> 0x00b9 }
            java.lang.String r0 = "pref"
            java.lang.String r1 = "ok3"
            boolean r2 = com.loc.cd.I     // Catch:{ Throwable -> 0x00b9 }
            boolean r5 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r0, (java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x00b9 }
            com.loc.cd.I = r5     // Catch:{ Throwable -> 0x00b9 }
        L_0x00b9:
            android.content.Context r5 = r4.f25674a     // Catch:{ Throwable -> 0x0106 }
            com.loc.cn.b((android.content.Context) r5)     // Catch:{ Throwable -> 0x0106 }
            com.loc.bs r5 = r4.f25676c     // Catch:{ Throwable -> 0x0106 }
            if (r5 != 0) goto L_0x00d5
            android.content.Context r5 = r4.f25674a     // Catch:{ Throwable -> 0x0106 }
            java.lang.String r0 = "wifi"
            java.lang.Object r5 = com.loc.cn.a((android.content.Context) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x0106 }
            android.net.wifi.WifiManager r5 = (android.net.wifi.WifiManager) r5     // Catch:{ Throwable -> 0x0106 }
            com.loc.bs r0 = new com.loc.bs     // Catch:{ Throwable -> 0x0106 }
            android.content.Context r1 = r4.f25674a     // Catch:{ Throwable -> 0x0106 }
            r0.<init>(r1, r5)     // Catch:{ Throwable -> 0x0106 }
            r4.f25676c = r0     // Catch:{ Throwable -> 0x0106 }
        L_0x00d5:
            com.loc.bq r5 = r4.f25677d     // Catch:{ Throwable -> 0x0106 }
            if (r5 != 0) goto L_0x00e2
            com.loc.bq r5 = new com.loc.bq     // Catch:{ Throwable -> 0x0106 }
            android.content.Context r0 = r4.f25674a     // Catch:{ Throwable -> 0x0106 }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x0106 }
            r4.f25677d = r5     // Catch:{ Throwable -> 0x0106 }
        L_0x00e2:
            com.loc.bu r5 = r4.f25678e     // Catch:{ Throwable -> 0x0106 }
            if (r5 != 0) goto L_0x00ed
            com.loc.bu r5 = new com.loc.bu     // Catch:{ Throwable -> 0x0106 }
            r5.<init>()     // Catch:{ Throwable -> 0x0106 }
            r4.f25678e = r5     // Catch:{ Throwable -> 0x0106 }
        L_0x00ed:
            com.loc.cb r5 = r4.g     // Catch:{ Throwable -> 0x0106 }
            if (r5 != 0) goto L_0x00f8
            com.loc.cb r5 = new com.loc.cb     // Catch:{ Throwable -> 0x0106 }
            r5.<init>()     // Catch:{ Throwable -> 0x0106 }
            r4.g = r5     // Catch:{ Throwable -> 0x0106 }
        L_0x00f8:
            com.loc.br r5 = r4.H     // Catch:{ Throwable -> 0x0106 }
            if (r5 != 0) goto L_0x0105
            com.loc.br r5 = new com.loc.br     // Catch:{ Throwable -> 0x0106 }
            android.content.Context r0 = r4.f25674a     // Catch:{ Throwable -> 0x0106 }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x0106 }
            r4.H = r5     // Catch:{ Throwable -> 0x0106 }
        L_0x0105:
            return
        L_0x0106:
            r5 = move-exception
            java.lang.String r0 = "Aps"
            java.lang.String r1 = "initBase"
            com.loc.ce.a(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cm.a(android.content.Context):void");
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        boolean z2;
        boolean z3;
        boolean z4;
        AMapLocationClientOption.GeoLanguage geoLanguage;
        this.j = aMapLocationClientOption;
        if (this.j == null) {
            this.j = new AMapLocationClientOption();
        }
        if (this.f25676c != null) {
            bs bsVar = this.f25676c;
            this.j.isWifiActiveScan();
            boolean isWifiScan = this.j.isWifiScan();
            boolean isMockEnable = this.j.isMockEnable();
            bsVar.k = isWifiScan;
            bsVar.l = isMockEnable;
        }
        i();
        if (this.f25678e != null) {
            bu buVar = this.f25678e;
            AMapLocationClientOption aMapLocationClientOption2 = this.j;
            buVar.j = aMapLocationClientOption2.isNeedAddress();
            buVar.i = aMapLocationClientOption2.isOffset();
            buVar.f25589d = aMapLocationClientOption2.isLocationCacheEnable();
            buVar.k = String.valueOf(aMapLocationClientOption2.getGeoLanguage());
        }
        if (this.g != null) {
            cb cbVar = this.g;
            AMapLocationClientOption aMapLocationClientOption3 = this.j;
            if (aMapLocationClientOption3 == null) {
                aMapLocationClientOption3 = new AMapLocationClientOption();
            }
            cbVar.f25626a = aMapLocationClientOption3;
        }
        try {
            geoLanguage = this.j.getGeoLanguage();
            try {
                z2 = this.j.isNeedAddress();
                try {
                    z4 = this.j.isOffset();
                } catch (Throwable unused) {
                    z4 = true;
                    z3 = true;
                    this.r = z4;
                    this.q = z2;
                    this.t = z3;
                    this.s = geoLanguage;
                }
                try {
                    z3 = this.j.isLocationCacheEnable();
                    try {
                        this.u = this.j.isOnceLocationLatest();
                        this.D = this.j.isSensorEnable();
                        if (!(z4 == this.r && z2 == this.q && z3 == this.t && geoLanguage == this.s)) {
                            if (this.f25678e != null) {
                                bu buVar2 = this.f25678e;
                                buVar2.f25590e = 0;
                                buVar2.f25591f = null;
                            }
                            a((AMapLocationServer) null);
                            this.N = false;
                            if (this.F != null) {
                                this.F.a();
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z3 = true;
                    this.r = z4;
                    this.q = z2;
                    this.t = z3;
                    this.s = geoLanguage;
                }
            } catch (Throwable unused4) {
                z2 = true;
                z4 = true;
                z3 = true;
                this.r = z4;
                this.q = z2;
                this.t = z3;
                this.s = geoLanguage;
            }
        } catch (Throwable unused5) {
            geoLanguage = AMapLocationClientOption.GeoLanguage.DEFAULT;
            z2 = true;
            z4 = true;
            z3 = true;
            this.r = z4;
            this.q = z2;
            this.t = z3;
            this.s = geoLanguage;
        }
        this.r = z4;
        this.q = z2;
        this.t = z3;
        this.s = geoLanguage;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(35:130|(1:132)|133|138|(1:140)|141|(2:(1:146)|147)|148|149|150|(1:152)|153|154|(1:156)|157|158|159|160|161|162|(6:163|164|165|166|(1:168)(2:170|(1:172)(1:173))|169)|178|179|180|181|(1:183)(1:(2:185|(2:187|(1:189)(6:190|(1:192)(1:193)|194|(2:198|(1:200))|201|(1:203)))))|204|205|(1:211)|212|(5:214|(1:216)|217|(1:219)|220)(1:221)|222|(2:224|(1:226)(2:227|(2:229|230)(2:231|(7:233|(1:235)(1:237)|236|238|(1:240)(1:241)|242|243)(3:244|(3:248|(1:261)(1:260)|262)|263))))(1:264)|265|266) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x048c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x049a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:204:0x0577 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:284:0x076c */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x042e A[Catch:{ Throwable -> 0x00c1, Throwable -> 0x081a }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0434 A[ADDED_TO_REGION, Catch:{ Throwable -> 0x00c1, Throwable -> 0x081a }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0486 A[Catch:{ Throwable -> 0x048c }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0494 A[Catch:{ Throwable -> 0x049a }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04bf A[Catch:{ Throwable -> 0x04d2, Throwable -> 0x072c }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04c4 A[Catch:{ Throwable -> 0x04d2, Throwable -> 0x072c }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04f7 A[Catch:{ Throwable -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04f9 A[Catch:{ Throwable -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x060e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0779 A[Catch:{ Throwable -> 0x0793, Throwable -> 0x07aa, Throwable -> 0x076c }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0787 A[Catch:{ Throwable -> 0x0793, Throwable -> 0x07aa, Throwable -> 0x076c }] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.autonavi.aps.amapapi.model.AMapLocationServer a(boolean r38, boolean r39) {
        /*
            r37 = this;
            r1 = r37
            com.autonavi.aps.amapapi.model.AMapLocationServer r2 = new com.autonavi.aps.amapapi.model.AMapLocationServer
            java.lang.String r0 = ""
            r2.<init>(r0)
            com.loc.cc r0 = r1.m     // Catch:{ Throwable -> 0x081e }
            if (r0 != 0) goto L_0x0014
            com.loc.cc r0 = new com.loc.cc     // Catch:{ Throwable -> 0x081e }
            r0.<init>()     // Catch:{ Throwable -> 0x081e }
            r1.m = r0     // Catch:{ Throwable -> 0x081e }
        L_0x0014:
            com.amap.api.location.AMapLocationClientOption r0 = r1.j     // Catch:{ Throwable -> 0x081e }
            if (r0 != 0) goto L_0x001f
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption     // Catch:{ Throwable -> 0x081e }
            r0.<init>()     // Catch:{ Throwable -> 0x081e }
            r1.j = r0     // Catch:{ Throwable -> 0x081e }
        L_0x001f:
            com.loc.br r0 = r1.H     // Catch:{ Throwable -> 0x081e }
            if (r0 == 0) goto L_0x002b
            com.loc.br r0 = r1.H     // Catch:{ Throwable -> 0x081e }
            java.lang.String r0 = r0.a()     // Catch:{ Throwable -> 0x081e }
            r5 = r0
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            com.loc.cc r6 = r1.m     // Catch:{ Throwable -> 0x081e }
            android.content.Context r7 = r1.f25674a     // Catch:{ Throwable -> 0x081e }
            com.amap.api.location.AMapLocationClientOption r0 = r1.j     // Catch:{ Throwable -> 0x081e }
            boolean r8 = r0.isNeedAddress()     // Catch:{ Throwable -> 0x081e }
            com.amap.api.location.AMapLocationClientOption r0 = r1.j     // Catch:{ Throwable -> 0x081e }
            boolean r0 = r0.isOffset()     // Catch:{ Throwable -> 0x081e }
            com.loc.bq r9 = r1.f25677d     // Catch:{ Throwable -> 0x081e }
            com.loc.bs r10 = r1.f25676c     // Catch:{ Throwable -> 0x081e }
            android.net.ConnectivityManager r11 = r1.f25675b     // Catch:{ Throwable -> 0x081e }
            java.lang.String r12 = r1.G     // Catch:{ Throwable -> 0x081e }
            java.lang.String r13 = "0"
            java.lang.String r14 = "0"
            java.lang.String r15 = "0"
            java.lang.String r4 = "0"
            java.lang.String r3 = "0"
            r16 = r13
            java.lang.String r13 = com.loc.cy.f(r7)     // Catch:{ Throwable -> 0x081e }
            r17 = r2
            java.util.Random r2 = new java.util.Random     // Catch:{ Throwable -> 0x081e }
            r2.<init>()     // Catch:{ Throwable -> 0x081e }
            r1 = 65536(0x10000, float:9.18355E-41)
            int r1 = r2.nextInt(r1)     // Catch:{ Throwable -> 0x081a }
            int r1 = r1 + -32768
            java.lang.String r2 = ""
            java.lang.String r18 = ""
            java.lang.String r19 = ""
            r6.K = r12     // Catch:{ Throwable -> 0x081a }
            java.lang.String r12 = "api_serverSDK_130905"
            java.lang.String r20 = "S128DF1572465B890OE3F7A13167KLEI"
            if (r0 != 0) goto L_0x0075
            java.lang.String r12 = "UC_nlp_20131029"
            java.lang.String r20 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U"
        L_0x0075:
            r21 = r2
            r22 = r5
            r2 = r12
            r12 = r20
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x081a }
            r5.<init>()     // Catch:{ Throwable -> 0x081a }
            r23 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x081a }
            r1.<init>()     // Catch:{ Throwable -> 0x081a }
            r24 = r13
            int r13 = r9.f25563a     // Catch:{ Throwable -> 0x081a }
            r25 = r3
            int r3 = r9.b()     // Catch:{ Throwable -> 0x081a }
            r26 = r4
            android.telephony.TelephonyManager r4 = r9.f25568f     // Catch:{ Throwable -> 0x081a }
            r27 = r15
            java.util.ArrayList<com.loc.bp> r15 = r9.f25564b     // Catch:{ Throwable -> 0x081a }
            r28 = r14
            java.util.ArrayList<com.loc.bp> r14 = r9.f25566d     // Catch:{ Throwable -> 0x081a }
            r29 = r9
            java.util.ArrayList r9 = r10.a()     // Catch:{ Throwable -> 0x081a }
            r30 = r12
            r12 = 2
            if (r3 != r12) goto L_0x00ae
            java.lang.String r0 = "1"
            r31 = r0
            goto L_0x00b0
        L_0x00ae:
            r31 = r16
        L_0x00b0:
            if (r4 == 0) goto L_0x00fe
            java.lang.String r0 = com.loc.ce.f25647d     // Catch:{ Throwable -> 0x081a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x081a }
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = com.loc.dc.u(r7)     // Catch:{ Throwable -> 0x00c1 }
            com.loc.ce.f25647d = r0     // Catch:{ Throwable -> 0x00c1 }
            goto L_0x00cc
        L_0x00c1:
            r0 = move-exception
            java.lang.String r12 = "Aps"
            r32 = r7
            java.lang.String r7 = "getApsReq part4"
            com.loc.ce.a(r0, r12, r7)     // Catch:{ Throwable -> 0x081a }
            goto L_0x00ce
        L_0x00cc:
            r32 = r7
        L_0x00ce:
            java.lang.String r0 = com.loc.ce.f25647d     // Catch:{ Throwable -> 0x081a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x081a }
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "888888888888888"
            com.loc.ce.f25647d = r0     // Catch:{ Throwable -> 0x081a }
        L_0x00da:
            java.lang.String r0 = com.loc.ce.f25648e     // Catch:{ Throwable -> 0x081a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x081a }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r4.getSubscriberId()     // Catch:{ SecurityException -> 0x00f1, Throwable -> 0x00e9 }
            com.loc.ce.f25648e = r0     // Catch:{ SecurityException -> 0x00f1, Throwable -> 0x00e9 }
            goto L_0x00f1
        L_0x00e9:
            r0 = move-exception
            java.lang.String r7 = "Aps"
            java.lang.String r12 = "getApsReq part2"
            com.loc.ce.a(r0, r7, r12)     // Catch:{ Throwable -> 0x081a }
        L_0x00f1:
            java.lang.String r0 = com.loc.ce.f25648e     // Catch:{ Throwable -> 0x081a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x081a }
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "888888888888888"
            com.loc.ce.f25648e = r0     // Catch:{ Throwable -> 0x081a }
            goto L_0x0100
        L_0x00fe:
            r32 = r7
        L_0x0100:
            android.net.NetworkInfo r0 = r11.getActiveNetworkInfo()     // Catch:{ Throwable -> 0x0105 }
            goto L_0x010f
        L_0x0105:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Aps"
            java.lang.String r11 = "getApsReq part"
            com.loc.ce.a(r7, r0, r11)     // Catch:{ Throwable -> 0x081a }
            r0 = 0
        L_0x010f:
            android.net.wifi.WifiInfo r7 = r10.c()     // Catch:{ Throwable -> 0x081a }
            boolean r11 = com.loc.bs.a((android.net.wifi.WifiInfo) r7)     // Catch:{ Throwable -> 0x081a }
            int r0 = com.loc.cn.a((android.net.NetworkInfo) r0)     // Catch:{ Throwable -> 0x081a }
            r12 = -1
            if (r0 == r12) goto L_0x01d5
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            if (r0 != 0) goto L_0x01b2
            android.util.SparseArray r0 = new android.util.SparseArray     // Catch:{ Throwable -> 0x081a }
            r0.<init>()     // Catch:{ Throwable -> 0x081a }
            com.loc.cn.f25683b = r0     // Catch:{ Throwable -> 0x081a }
            java.lang.String r12 = "UNKWN"
            r33 = r2
            r2 = 0
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "GPRS"
            r12 = 1
            r0.append(r12, r2)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "EDGE"
            r12 = 2
            r0.append(r12, r2)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "UMTS"
            r12 = 3
            r0.append(r12, r2)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "CDMA"
            r12 = 4
            r0.append(r12, r2)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "EVDO_0"
            r12 = 5
            r0.append(r12, r2)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "EVDO_A"
            r12 = 6
            r0.append(r12, r2)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 7
            java.lang.String r12 = "1xRTT"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 8
            java.lang.String r12 = "HSDPA"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 9
            java.lang.String r12 = "HSUPA"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 10
            java.lang.String r12 = "HSPA"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 11
            java.lang.String r12 = "IDEN"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "EVDO_B"
            r12 = 12
            r0.append(r12, r2)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 13
            java.lang.String r12 = "LTE"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 14
            java.lang.String r12 = "EHRPD"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            r2 = 15
            java.lang.String r12 = "HSPAP"
            r0.append(r2, r12)     // Catch:{ Throwable -> 0x081a }
            goto L_0x01b4
        L_0x01b2:
            r33 = r2
        L_0x01b4:
            if (r4 == 0) goto L_0x01bb
            int r12 = r4.getNetworkType()     // Catch:{ Throwable -> 0x081a }
            goto L_0x01bc
        L_0x01bb:
            r12 = 0
        L_0x01bc:
            android.util.SparseArray<java.lang.String> r0 = com.loc.cn.f25683b     // Catch:{ Throwable -> 0x081a }
            java.lang.String r2 = "UNKWN"
            java.lang.Object r0 = r0.get(r12, r2)     // Catch:{ Throwable -> 0x081a }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x081a }
            if (r11 == 0) goto L_0x01d0
            boolean r0 = r10.o     // Catch:{ Throwable -> 0x081a }
            if (r0 == 0) goto L_0x01d0
            java.lang.String r18 = "2"
            goto L_0x01d2
        L_0x01d0:
            java.lang.String r18 = "1"
        L_0x01d2:
            r0 = r18
            goto L_0x01db
        L_0x01d5:
            r33 = r2
            r0 = r18
            r2 = r21
        L_0x01db:
            boolean r4 = r15.isEmpty()     // Catch:{ Throwable -> 0x081a }
            if (r4 != 0) goto L_0x031c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x081a }
            r4.<init>()     // Catch:{ Throwable -> 0x081a }
            switch(r3) {
                case 1: goto L_0x0276;
                case 2: goto L_0x01ed;
                default: goto L_0x01e9;
            }     // Catch:{ Throwable -> 0x081a }
        L_0x01e9:
            r34 = r0
            goto L_0x0313
        L_0x01ed:
            r3 = 0
            java.lang.Object r12 = r15.get(r3)     // Catch:{ Throwable -> 0x081a }
            com.loc.bp r12 = (com.loc.bp) r12     // Catch:{ Throwable -> 0x081a }
            int r15 = r4.length()     // Catch:{ Throwable -> 0x081a }
            r4.delete(r3, r15)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "<mcc>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.f25557a     // Catch:{ Throwable -> 0x081a }
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "</mcc>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "<sid>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.g     // Catch:{ Throwable -> 0x081a }
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "</sid>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "<nid>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.h     // Catch:{ Throwable -> 0x081a }
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "</nid>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "<bid>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.i     // Catch:{ Throwable -> 0x081a }
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "</bid>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.f25562f     // Catch:{ Throwable -> 0x081a }
            if (r3 <= 0) goto L_0x025d
            int r3 = r12.f25561e     // Catch:{ Throwable -> 0x081a }
            if (r3 <= 0) goto L_0x025d
            java.lang.String r3 = "<lon>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.f25562f     // Catch:{ Throwable -> 0x081a }
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "</lon>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "<lat>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.f25561e     // Catch:{ Throwable -> 0x081a }
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "</lat>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
        L_0x025d:
            java.lang.String r3 = "<signal>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            int r3 = r12.j     // Catch:{ Throwable -> 0x081a }
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "</signal>"
            r4.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x081a }
            r34 = r0
            r19 = r3
            goto L_0x0313
        L_0x0276:
            r3 = 0
            java.lang.Object r12 = r15.get(r3)     // Catch:{ Throwable -> 0x081a }
            com.loc.bp r12 = (com.loc.bp) r12     // Catch:{ Throwable -> 0x081a }
            r34 = r0
            int r0 = r4.length()     // Catch:{ Throwable -> 0x081a }
            r4.delete(r3, r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "<mcc>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r12.f25557a     // Catch:{ Throwable -> 0x081a }
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "</mcc>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "<mnc>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r12.f25558b     // Catch:{ Throwable -> 0x081a }
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "</mnc>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "<lac>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r12.f25559c     // Catch:{ Throwable -> 0x081a }
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "</lac>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "<cellid>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r12.f25560d     // Catch:{ Throwable -> 0x081a }
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "</cellid>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "<signal>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r12.j     // Catch:{ Throwable -> 0x081a }
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = "</signal>"
            r4.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = r4.toString()     // Catch:{ Throwable -> 0x081a }
            r3 = 1
        L_0x02d6:
            int r12 = r15.size()     // Catch:{ Throwable -> 0x081a }
            if (r3 >= r12) goto L_0x030f
            java.lang.Object r12 = r15.get(r3)     // Catch:{ Throwable -> 0x081a }
            com.loc.bp r12 = (com.loc.bp) r12     // Catch:{ Throwable -> 0x081a }
            r35 = r0
            int r0 = r12.f25559c     // Catch:{ Throwable -> 0x081a }
            r5.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = ","
            r5.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r12.f25560d     // Catch:{ Throwable -> 0x081a }
            r5.append(r0)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = ","
            r5.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r12.j     // Catch:{ Throwable -> 0x081a }
            r5.append(r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r15.size()     // Catch:{ Throwable -> 0x081a }
            r12 = 1
            int r0 = r0 - r12
            if (r3 >= r0) goto L_0x030a
            java.lang.String r0 = "*"
            r5.append(r0)     // Catch:{ Throwable -> 0x081a }
        L_0x030a:
            int r3 = r3 + 1
            r0 = r35
            goto L_0x02d6
        L_0x030f:
            r35 = r0
            r19 = r35
        L_0x0313:
            int r0 = r4.length()     // Catch:{ Throwable -> 0x081a }
            r3 = 0
            r4.delete(r3, r0)     // Catch:{ Throwable -> 0x081a }
            goto L_0x031e
        L_0x031c:
            r34 = r0
        L_0x031e:
            r0 = r19
            r3 = r13 & 4
            r4 = 4
            if (r3 != r4) goto L_0x0336
            boolean r3 = r14.isEmpty()     // Catch:{ Throwable -> 0x081a }
            if (r3 != 0) goto L_0x0336
            java.util.ArrayList<com.loc.bp> r3 = r6.C     // Catch:{ Throwable -> 0x081a }
            r3.clear()     // Catch:{ Throwable -> 0x081a }
            java.util.ArrayList<com.loc.bp> r3 = r6.C     // Catch:{ Throwable -> 0x081a }
            r3.addAll(r14)     // Catch:{ Throwable -> 0x081a }
            goto L_0x033b
        L_0x0336:
            java.util.ArrayList<com.loc.bp> r3 = r6.C     // Catch:{ Throwable -> 0x081a }
            r3.clear()     // Catch:{ Throwable -> 0x081a }
        L_0x033b:
            boolean r3 = r10.o     // Catch:{ Throwable -> 0x081a }
            if (r3 == 0) goto L_0x03a0
            if (r11 == 0) goto L_0x038f
            android.net.wifi.WifiInfo r3 = r10.c()     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = r3.getBSSID()     // Catch:{ Throwable -> 0x081a }
            r1.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = ","
            r1.append(r3)     // Catch:{ Throwable -> 0x081a }
            android.net.wifi.WifiInfo r3 = r10.c()     // Catch:{ Throwable -> 0x081a }
            int r12 = r3.getRssi()     // Catch:{ Throwable -> 0x081a }
            r3 = -128(0xffffffffffffff80, float:NaN)
            if (r12 >= r3) goto L_0x035f
        L_0x035d:
            r12 = 0
            goto L_0x0364
        L_0x035f:
            r3 = 127(0x7f, float:1.78E-43)
            if (r12 <= r3) goto L_0x0364
            goto L_0x035d
        L_0x0364:
            r1.append(r12)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = ","
            r1.append(r3)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = r7.getSSID()     // Catch:{ Throwable -> 0x081a }
            r4 = 32
            java.lang.String r7 = r7.getSSID()     // Catch:{ Exception -> 0x037e }
            java.lang.String r10 = "UTF-8"
            byte[] r7 = r7.getBytes(r10)     // Catch:{ Exception -> 0x037e }
            int r7 = r7.length     // Catch:{ Exception -> 0x037e }
            goto L_0x0380
        L_0x037e:
            r7 = 32
        L_0x0380:
            if (r7 < r4) goto L_0x0384
            java.lang.String r3 = "unkwn"
        L_0x0384:
            java.lang.String r4 = "*"
            java.lang.String r7 = "."
            java.lang.String r3 = r3.replace(r4, r7)     // Catch:{ Throwable -> 0x081a }
            r1.append(r3)     // Catch:{ Throwable -> 0x081a }
        L_0x038f:
            if (r9 == 0) goto L_0x03ac
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r6.F     // Catch:{ Throwable -> 0x081a }
            if (r3 == 0) goto L_0x03ac
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r6.F     // Catch:{ Throwable -> 0x081a }
            r3.clear()     // Catch:{ Throwable -> 0x081a }
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r6.F     // Catch:{ Throwable -> 0x081a }
            r3.addAll(r9)     // Catch:{ Throwable -> 0x081a }
            goto L_0x03ac
        L_0x03a0:
            r10.b()     // Catch:{ Throwable -> 0x081a }
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r6.F     // Catch:{ Throwable -> 0x081a }
            if (r3 == 0) goto L_0x03ac
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r6.F     // Catch:{ Throwable -> 0x081a }
            r3.clear()     // Catch:{ Throwable -> 0x081a }
        L_0x03ac:
            if (r8 != 0) goto L_0x03b2
            r3 = 2
            r6.f25629b = r3     // Catch:{ Throwable -> 0x081a }
            goto L_0x03b5
        L_0x03b2:
            r3 = 0
            r6.f25629b = r3     // Catch:{ Throwable -> 0x081a }
        L_0x03b5:
            r12 = r33
            r6.f25630c = r12     // Catch:{ Throwable -> 0x081a }
            r3 = r30
            r6.f25631d = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x081a }
            r6.f25633f = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x081a }
            java.lang.String r4 = "android"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ Throwable -> 0x081a }
            r3.append(r4)     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x081a }
            r6.g = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = com.loc.cn.b((android.content.Context) r32)     // Catch:{ Throwable -> 0x081a }
            r6.h = r3     // Catch:{ Throwable -> 0x081a }
            r3 = r31
            r6.i = r3     // Catch:{ Throwable -> 0x081a }
            r3 = r28
            r6.j = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "0"
            r6.k = r3     // Catch:{ Throwable -> 0x081a }
            r3 = r27
            r6.l = r3     // Catch:{ Throwable -> 0x081a }
            r3 = r26
            r6.m = r3     // Catch:{ Throwable -> 0x081a }
            r3 = r25
            r6.n = r3     // Catch:{ Throwable -> 0x081a }
            r3 = r24
            r6.o = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = com.loc.ce.f25647d     // Catch:{ Throwable -> 0x081a }
            r6.p = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = com.loc.ce.f25648e     // Catch:{ Throwable -> 0x081a }
            r6.q = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = java.lang.String.valueOf(r23)     // Catch:{ Throwable -> 0x081a }
            r6.s = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = com.loc.dc.l(r32)     // Catch:{ Throwable -> 0x081a }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x081a }
            if (r4 != 0) goto L_0x0419
            java.lang.String r4 = "00:00:00:00:00:00"
            boolean r4 = r3.equals(r4)     // Catch:{ Throwable -> 0x081a }
            if (r4 == 0) goto L_0x0416
            goto L_0x0419
        L_0x0416:
            r8 = r32
            goto L_0x0428
        L_0x0419:
            java.lang.String r3 = "00:00:00:00:00:00"
            if (r32 != 0) goto L_0x041e
            goto L_0x0416
        L_0x041e:
            java.lang.String r4 = "pref"
            java.lang.String r7 = "smac"
            r8 = r32
            java.lang.String r3 = com.loc.cl.b((android.content.Context) r8, (java.lang.String) r4, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Throwable -> 0x081a }
        L_0x0428:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x081a }
            if (r4 == 0) goto L_0x0430
            java.lang.String r3 = "00:00:00:00:00:00"
        L_0x0430:
            boolean r4 = com.loc.cn.f25685d     // Catch:{ Throwable -> 0x081a }
            if (r4 != 0) goto L_0x0446
            if (r8 == 0) goto L_0x0443
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x081a }
            if (r4 != 0) goto L_0x0443
            java.lang.String r4 = "pref"
            java.lang.String r7 = "smac"
            com.loc.cl.a((android.content.Context) r8, (java.lang.String) r4, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Throwable -> 0x081a }
        L_0x0443:
            r4 = 1
            com.loc.cn.f25685d = r4     // Catch:{ Throwable -> 0x081a }
        L_0x0446:
            r6.t = r3     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = "4.2.0"
            r6.v = r3     // Catch:{ Throwable -> 0x081a }
            r4 = r22
            r6.w = r4     // Catch:{ Throwable -> 0x081a }
            java.lang.String r3 = ""
            r6.u = r3     // Catch:{ Throwable -> 0x081a }
            r6.x = r2     // Catch:{ Throwable -> 0x081a }
            r2 = r34
            r6.y = r2     // Catch:{ Throwable -> 0x081a }
            r6.z = r13     // Catch:{ Throwable -> 0x081a }
            r6.A = r0     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = r5.toString()     // Catch:{ Throwable -> 0x081a }
            r6.B = r0     // Catch:{ Throwable -> 0x081a }
            r2 = r29
            java.lang.String r0 = r2.f25565c     // Catch:{ Throwable -> 0x081a }
            r6.D = r0     // Catch:{ Throwable -> 0x081a }
            long r2 = com.loc.cn.b()     // Catch:{ Throwable -> 0x081a }
            long r9 = com.loc.bs.f25580f     // Catch:{ Throwable -> 0x081a }
            r0 = 0
            long r2 = r2 - r9
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x081a }
            r6.G = r0     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x081a }
            r6.E = r0     // Catch:{ Throwable -> 0x081a }
            java.lang.String r0 = com.loc.cc.J     // Catch:{ Throwable -> 0x048c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x048c }
            if (r0 == 0) goto L_0x048c
            java.lang.String r0 = com.loc.dc.h(r8)     // Catch:{ Throwable -> 0x048c }
            com.loc.cc.J = r0     // Catch:{ Throwable -> 0x048c }
        L_0x048c:
            java.lang.String r0 = com.loc.cc.L     // Catch:{ Throwable -> 0x049a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049a }
            if (r0 == 0) goto L_0x049a
            java.lang.String r0 = com.loc.dc.b(r8)     // Catch:{ Throwable -> 0x049a }
            com.loc.cc.L = r0     // Catch:{ Throwable -> 0x049a }
        L_0x049a:
            int r0 = r5.length()     // Catch:{ Throwable -> 0x081a }
            r2 = 0
            r5.delete(r2, r0)     // Catch:{ Throwable -> 0x081a }
            int r0 = r1.length()     // Catch:{ Throwable -> 0x081a }
            r1.delete(r2, r0)     // Catch:{ Throwable -> 0x081a }
            r1 = r37
            com.loc.cc r0 = r1.m     // Catch:{ Throwable -> 0x081e }
            byte[] r2 = r0.a()     // Catch:{ Throwable -> 0x081e }
            long r3 = com.loc.cn.b()
            r1.l = r3
            android.content.Context r0 = r1.f25674a     // Catch:{ Throwable -> 0x072c }
            boolean r0 = com.loc.di.b((android.content.Context) r0)     // Catch:{ Throwable -> 0x04d2 }
            if (r0 == 0) goto L_0x04c4
            java.lang.String r0 = "http://abroad.apilocate.amap.com/mobile/binary"
        L_0x04c1:
            com.loc.ce.f25644a = r0     // Catch:{ Throwable -> 0x04d2 }
            goto L_0x04da
        L_0x04c4:
            java.lang.String r0 = com.loc.ce.f25645b     // Catch:{ Throwable -> 0x04d2 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x04d2 }
            if (r0 == 0) goto L_0x04cf
            java.lang.String r0 = "http://apilocate.amap.com/mobile/binary"
            goto L_0x04c1
        L_0x04cf:
            java.lang.String r0 = com.loc.ce.f25645b     // Catch:{ Throwable -> 0x04d2 }
            goto L_0x04c1
        L_0x04d2:
            r0 = move-exception
            java.lang.String r3 = "CoreUtil"
            java.lang.String r4 = "changeUrl"
            com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x072c }
        L_0x04da:
            com.loc.bz r0 = r1.o     // Catch:{ Throwable -> 0x072c }
            android.content.Context r3 = r1.f25674a     // Catch:{ Throwable -> 0x072c }
            java.lang.String r4 = com.loc.ce.a()     // Catch:{ Throwable -> 0x072c }
            r5 = r39
            com.loc.ca r0 = r0.a(r3, r2, r4, r5)     // Catch:{ Throwable -> 0x072c }
            android.content.Context r2 = r1.f25674a     // Catch:{ Throwable -> 0x072c }
            com.loc.bx r2 = com.loc.bx.a((android.content.Context) r2)     // Catch:{ Throwable -> 0x072c }
            r3 = 0
            r2.f25601d = r3     // Catch:{ Throwable -> 0x0577 }
            boolean r3 = r2.a()     // Catch:{ Throwable -> 0x0577 }
            if (r3 != 0) goto L_0x04f9
            goto L_0x0577
        L_0x04f9:
            if (r0 == 0) goto L_0x0577
            r2.f25603f = r0     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r3 = r0.c()     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r4 = ":"
            int r4 = r3.indexOf(r4)     // Catch:{ Throwable -> 0x0577 }
            r5 = 0
            java.lang.String r4 = r3.substring(r5, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r5 = "https"
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ Throwable -> 0x0577 }
            if (r4 != 0) goto L_0x0577
            java.lang.String r4 = "http://abroad.apilocate.amap.com/mobile/binary"
            boolean r4 = r4.equals(r3)     // Catch:{ Throwable -> 0x0577 }
            if (r4 == 0) goto L_0x051d
            goto L_0x0577
        L_0x051d:
            java.lang.String r4 = "http://apilocate.amap.com/mobile/binary"
            boolean r4 = r3.contains(r4)     // Catch:{ Throwable -> 0x0577 }
            if (r4 == 0) goto L_0x052a
            java.lang.String r3 = "apilocatesrc.amap.com"
            java.lang.String r4 = "http://apilocatesrc.amap.com/mobile/binary"
            goto L_0x0538
        L_0x052a:
            java.net.URL r4 = new java.net.URL     // Catch:{ Throwable -> 0x0577 }
            r4.<init>(r3)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r4 = r4.getHost()     // Catch:{ Throwable -> 0x0577 }
            r36 = r4
            r4 = r3
            r3 = r36
        L_0x0538:
            java.lang.String r5 = r2.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x0577 }
            boolean r6 = r2.f25602e     // Catch:{ Throwable -> 0x0577 }
            if (r6 == 0) goto L_0x055d
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0577 }
            if (r6 == 0) goto L_0x055d
            r6 = 0
            r2.f25602e = r6     // Catch:{ Throwable -> 0x0577 }
            android.content.Context r5 = r2.f25599b     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r6 = "ip"
            java.lang.String r7 = "last_ip"
            java.lang.String r8 = ""
            java.lang.String r5 = com.loc.cl.b((android.content.Context) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0577 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0577 }
            if (r6 != 0) goto L_0x055d
            r2.g = r5     // Catch:{ Throwable -> 0x0577 }
        L_0x055d:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0577 }
            if (r6 != 0) goto L_0x0577
            r2.h = r5     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r4 = r4.replace(r3, r5)     // Catch:{ Throwable -> 0x0577 }
            r0.g = r4     // Catch:{ Throwable -> 0x0577 }
            java.util.Map r4 = r0.a()     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r5 = "host"
            r4.put(r5, r3)     // Catch:{ Throwable -> 0x0577 }
            r3 = 1
            r2.f25601d = r3     // Catch:{ Throwable -> 0x0577 }
        L_0x0577:
            com.loc.bz r2 = r1.o     // Catch:{ Throwable -> 0x072c }
            long r3 = com.loc.cn.b()     // Catch:{ Throwable -> 0x072c }
            boolean r5 = r2.f25622d     // Catch:{ Throwable -> 0x072c }
            com.loc.am r0 = com.loc.ah.a(r0, r5)     // Catch:{ Throwable -> 0x072c }
            long r5 = com.loc.cn.b()     // Catch:{ Throwable -> 0x072c }
            r7 = 0
            long r5 = r5 - r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Throwable -> 0x072c }
            int r3 = r3.intValue()     // Catch:{ Throwable -> 0x072c }
            r2.f25621c = r3     // Catch:{ Throwable -> 0x072c }
            android.content.Context r2 = r1.f25674a     // Catch:{ Throwable -> 0x072c }
            com.loc.bx r2 = com.loc.bx.a((android.content.Context) r2)     // Catch:{ Throwable -> 0x072c }
            java.lang.String r3 = r2.h     // Catch:{ Throwable -> 0x072c }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x072c }
            if (r3 != 0) goto L_0x05c2
            java.lang.String r3 = r2.g     // Catch:{ Throwable -> 0x072c }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x072c }
            if (r3 != 0) goto L_0x05b3
            java.lang.String r3 = r2.h     // Catch:{ Throwable -> 0x072c }
            java.lang.String r4 = r2.g     // Catch:{ Throwable -> 0x072c }
            boolean r3 = r3.equals(r4)     // Catch:{ Throwable -> 0x072c }
            if (r3 != 0) goto L_0x05c2
        L_0x05b3:
            java.lang.String r3 = r2.h     // Catch:{ Throwable -> 0x072c }
            r2.g = r3     // Catch:{ Throwable -> 0x072c }
            android.content.Context r3 = r2.f25599b     // Catch:{ Throwable -> 0x072c }
            java.lang.String r4 = "ip"
            java.lang.String r5 = "last_ip"
            java.lang.String r2 = r2.h     // Catch:{ Throwable -> 0x072c }
            com.loc.cl.a((android.content.Context) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Throwable -> 0x072c }
        L_0x05c2:
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x060e
            android.content.Context r2 = r1.f25674a
            com.loc.bx r2 = com.loc.bx.a((android.content.Context) r2)
            boolean r3 = r2.f25601d
            if (r3 == 0) goto L_0x05db
            android.content.Context r2 = r2.f25599b
            java.lang.String r3 = "pref"
            java.lang.String r4 = "dns_faile_count_total"
            r5 = 0
            com.loc.cl.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4, (long) r5)
        L_0x05db:
            com.loc.bz r2 = r1.o
            int r2 = r2.f25621c
            long r2 = (long) r2
            r4 = r17
            r4.a((long) r2)
            java.lang.String r2 = r0.f25474c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0602
            java.lang.StringBuilder r2 = r1.p
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "#csid:"
            r3.<init>(r5)
            java.lang.String r5 = r0.f25474c
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
        L_0x0602:
            java.lang.String r2 = r0.f25475d
            java.lang.StringBuilder r3 = r1.y
            java.lang.String r3 = r3.toString()
            r4.h(r3)
            goto L_0x0610
        L_0x060e:
            r4 = r17
        L_0x0610:
            r3 = r2
            if (r38 != 0) goto L_0x0716
            com.autonavi.aps.amapapi.model.AMapLocationServer r2 = r1.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r4, (com.loc.am) r0)
            if (r2 == 0) goto L_0x061a
            return r2
        L_0x061a:
            byte[] r0 = r0.f25472a
            byte[] r0 = com.loc.bt.a((byte[]) r0)
            if (r0 != 0) goto L_0x063c
            r2 = 5
            r4.setErrorCode(r2)
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r2 = "解密数据失败#0503"
            r0.append(r2)
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r0 = r0.toString()
            r4.setLocationDetail(r0)
            r0 = 2053(0x805, float:2.877E-42)
            com.loc.cj.a((java.lang.String) r3, (int) r0)
            return r4
        L_0x063c:
            com.loc.cb r2 = r1.g
            com.autonavi.aps.amapapi.model.AMapLocationServer r2 = r2.a(r4, r0)
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r2)
            if (r0 != 0) goto L_0x06a7
            java.lang.String r0 = r2.b()
            r1.L = r0
            java.lang.String r0 = r1.L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x065d
            r0 = 2062(0x80e, float:2.89E-42)
        L_0x0658:
            com.loc.cj.a((java.lang.String) r3, (int) r0)
            r3 = 6
            goto L_0x0660
        L_0x065d:
            r0 = 2061(0x80d, float:2.888E-42)
            goto L_0x0658
        L_0x0660:
            r2.setErrorCode(r3)
            java.lang.StringBuilder r0 = r1.p
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "location faile retype:"
            r3.<init>(r4)
            java.lang.String r4 = r2.d()
            r3.append(r4)
            java.lang.String r4 = " rdesc:"
            r3.append(r4)
            java.lang.String r4 = r1.L
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0683
            java.lang.String r4 = ""
            goto L_0x0685
        L_0x0683:
            java.lang.String r4 = r1.L
        L_0x0685:
            r3.append(r4)
            java.lang.String r4 = "#0601"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.StringBuilder r0 = r1.y
            java.lang.String r0 = r0.toString()
            r2.h(r0)
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r0 = r0.toString()
            r2.setLocationDetail(r0)
            return r2
        L_0x06a7:
            int r0 = r2.getErrorCode()
            if (r0 != 0) goto L_0x0702
            int r0 = r2.getLocationType()
            if (r0 != 0) goto L_0x0702
            java.lang.String r0 = "-5"
            java.lang.String r3 = r2.d()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x06fe
            java.lang.String r0 = "1"
            java.lang.String r3 = r2.d()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x06fe
            java.lang.String r0 = "2"
            java.lang.String r3 = r2.d()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x06fe
            java.lang.String r0 = "14"
            java.lang.String r3 = r2.d()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x06fe
            java.lang.String r0 = "24"
            java.lang.String r3 = r2.d()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x06fe
            java.lang.String r0 = "-1"
            java.lang.String r3 = r2.d()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x06fc
            goto L_0x06fe
        L_0x06fc:
            r3 = 6
            goto L_0x06ff
        L_0x06fe:
            r3 = 5
        L_0x06ff:
            r2.setLocationType(r3)
        L_0x0702:
            boolean r0 = r1.r
            r2.setOffset(r0)
            boolean r0 = r1.q
            r2.a((boolean) r0)
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r1.s
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.f(r0)
            goto L_0x0717
        L_0x0716:
            r2 = r4
        L_0x0717:
            java.lang.String r0 = "new"
            r2.e(r0)
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r0 = r0.toString()
            r2.setLocationDetail(r0)
            java.lang.String r0 = r2.a()
            r1.G = r0
            return r2
        L_0x072c:
            r0 = move-exception
            android.content.Context r2 = r1.f25674a
            com.loc.bx r2 = com.loc.bx.a((android.content.Context) r2)
            boolean r3 = r2.a()     // Catch:{ Throwable -> 0x0793 }
            if (r3 != 0) goto L_0x073a
            goto L_0x0793
        L_0x073a:
            boolean r3 = r2.f25601d     // Catch:{ Throwable -> 0x0793 }
            if (r3 == 0) goto L_0x076c
            java.lang.String[] r3 = r2.i     // Catch:{ Throwable -> 0x0793 }
            if (r3 == 0) goto L_0x076c
            java.lang.String[] r3 = r2.i     // Catch:{ Throwable -> 0x0793 }
            if (r3 == 0) goto L_0x076c
            int r4 = r3.length     // Catch:{ Throwable -> 0x076c }
            r5 = 1
            if (r4 > r5) goto L_0x074b
            goto L_0x076c
        L_0x074b:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x076c }
            r5 = 12
            r4.<init>(r5)     // Catch:{ Throwable -> 0x076c }
            java.util.List r5 = java.util.Arrays.asList(r3)     // Catch:{ Throwable -> 0x076c }
            r4.addAll(r5)     // Catch:{ Throwable -> 0x076c }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Throwable -> 0x076c }
            java.lang.Object r6 = r5.next()     // Catch:{ Throwable -> 0x076c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x076c }
            r5.remove()     // Catch:{ Throwable -> 0x076c }
            r4.add(r6)     // Catch:{ Throwable -> 0x076c }
            r4.toArray(r3)     // Catch:{ Throwable -> 0x076c }
        L_0x076c:
            int r3 = r2.j     // Catch:{ Throwable -> 0x0793 }
            r4 = 5
            if (r3 > r4) goto L_0x0793
            boolean r3 = r2.f25601d     // Catch:{ Throwable -> 0x0793 }
            if (r3 == 0) goto L_0x0793
            java.util.concurrent.ExecutorService r3 = r2.f25600c     // Catch:{ Throwable -> 0x0793 }
            if (r3 != 0) goto L_0x077f
            java.util.concurrent.ExecutorService r3 = com.loc.i.d()     // Catch:{ Throwable -> 0x0793 }
            r2.f25600c = r3     // Catch:{ Throwable -> 0x0793 }
        L_0x077f:
            java.util.concurrent.ExecutorService r3 = r2.f25600c     // Catch:{ Throwable -> 0x0793 }
            boolean r3 = r3.isShutdown()     // Catch:{ Throwable -> 0x0793 }
            if (r3 != 0) goto L_0x0793
            java.util.concurrent.ExecutorService r3 = r2.f25600c     // Catch:{ Throwable -> 0x0793 }
            com.loc.bx$a r4 = new com.loc.bx$a     // Catch:{ Throwable -> 0x0793 }
            com.loc.ca r5 = r2.f25603f     // Catch:{ Throwable -> 0x0793 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0793 }
            r3.submit(r4)     // Catch:{ Throwable -> 0x0793 }
        L_0x0793:
            java.lang.String r2 = "Aps"
            java.lang.String r3 = "getApsLoc req"
            com.loc.ce.a(r0, r2, r3)
            java.lang.String r2 = "/mobile/binary"
            boolean r3 = r0 instanceof com.loc.cx     // Catch:{ Throwable -> 0x07aa }
            if (r3 == 0) goto L_0x07aa
            com.loc.dh r3 = com.loc.ce.b()     // Catch:{ Throwable -> 0x07aa }
            r4 = r0
            com.loc.cx r4 = (com.loc.cx) r4     // Catch:{ Throwable -> 0x07aa }
            com.loc.i.a((com.loc.dh) r3, (java.lang.String) r2, (com.loc.cx) r4)     // Catch:{ Throwable -> 0x07aa }
        L_0x07aa:
            android.content.Context r2 = r1.f25674a
            boolean r2 = com.loc.cn.d((android.content.Context) r2)
            if (r2 != 0) goto L_0x07ba
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r2 = "网络异常，未连接到网络，请连接网络#0401"
        L_0x07b6:
            r0.append(r2)
            goto L_0x0805
        L_0x07ba:
            boolean r2 = r0 instanceof com.loc.cx
            if (r2 == 0) goto L_0x0800
            com.loc.cx r0 = (com.loc.cx) r0
            java.lang.String r2 = r0.a()
            java.lang.String r3 = "网络异常状态码"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x07db
            java.lang.StringBuilder r2 = r1.p
            java.lang.String r3 = "网络异常，状态码错误#0404"
            r2.append(r3)
            int r0 = r0.e()
            r2.append(r0)
            goto L_0x0805
        L_0x07db:
            int r0 = r0.e()
            r2 = 23
            if (r0 == r2) goto L_0x07fb
            long r2 = com.loc.cn.b()
            long r4 = r1.l
            long r2 = r2 - r4
            com.amap.api.location.AMapLocationClientOption r0 = r1.j
            long r4 = r0.getHttpTimeOut()
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 500(0x1f4, double:2.47E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0800
        L_0x07fb:
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r2 = "网络异常，连接超时#0402"
            goto L_0x07b6
        L_0x0800:
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r2 = "网络异常,请求异常#0403"
            goto L_0x07b6
        L_0x0805:
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r0 = r0.toString()
            r2 = 4
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = a((int) r2, (java.lang.String) r0)
            java.lang.StringBuilder r2 = r1.y
            java.lang.String r2 = r2.toString()
            r0.h(r2)
            return r0
        L_0x081a:
            r0 = move-exception
            r1 = r37
            goto L_0x081f
        L_0x081e:
            r0 = move-exception
        L_0x081f:
            java.lang.StringBuilder r2 = r1.p
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get parames error:"
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = "#0301"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.append(r0)
            r0 = 2031(0x7ef, float:2.846E-42)
            r2 = 0
            com.loc.cj.a((java.lang.String) r2, (int) r0)
            java.lang.StringBuilder r0 = r1.p
            java.lang.String r0 = r0.toString()
            r2 = 3
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = a((int) r2, (java.lang.String) r0)
            java.lang.StringBuilder r2 = r1.y
            java.lang.String r2 = r2.toString()
            r0.h(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cm.a(boolean, boolean):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    public final void h() {
        if (this.H != null) {
            br brVar = this.H;
            try {
                if (!cd.j()) {
                    brVar.b();
                } else if (!cd.H) {
                    if (brVar.f25572b) {
                        if (brVar.f25571a != null) {
                            ch.a(brVar.f25571a, "destroyCollect", new Object[0]);
                        }
                        brVar.f25572b = false;
                    }
                } else if (!brVar.f25572b) {
                    brVar.c();
                    if (brVar.f25571a != null) {
                        ch.a(brVar.f25571a, "startCollect", new Object[0]);
                        brVar.f25572b = true;
                    }
                }
            } catch (Throwable th) {
                ce.a(th, "APSCoManager", "startCollection");
            }
        }
    }

    public final void b() {
        if (this.C == null) {
            this.C = new bn(this.f25674a);
        }
        if (this.f25679f == null) {
            this.f25679f = new bl(this.f25674a);
        }
        j();
        this.f25676c.a(false);
        this.h = this.f25676c.a();
        this.f25677d.a(false, l());
        bu buVar = this.f25678e;
        Context context = this.f25674a;
        if (!buVar.f25587b) {
            try {
                buVar.a();
                buVar.a(context, (String) null);
            } catch (Throwable th) {
                ce.a(th, "Cache", "loadDB");
            }
            buVar.f25587b = true;
        }
        bl blVar = this.f25679f;
        try {
            if (blVar.f25537e == null) {
                blVar.f25537e = new ServiceConnection() {
                    public final void onServiceDisconnected(
/*
Method generation error in method: com.loc.bl.1.onServiceDisconnected(android.content.ComponentName):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.bl.1.onServiceDisconnected(android.content.ComponentName):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/

                    public final void onServiceConnected(
/*
Method generation error in method: com.loc.bl.1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.bl.1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                };
            }
            if (blVar.f25538f == null) {
                blVar.f25538f = new ServiceConnection() {
                    public final void onServiceConnected(
/*
Method generation error in method: com.loc.bl.2.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.bl.2.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/

                    public final void onServiceDisconnected(
/*
Method generation error in method: com.loc.bl.2.onServiceDisconnected(android.content.ComponentName):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.bl.2.onServiceDisconnected(android.content.ComponentName):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                };
            }
            if (blVar.g == null) {
                blVar.g = new ServiceConnection() {
                    public final void onServiceConnected(
/*
Method generation error in method: com.loc.bl.3.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.bl.3.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/

                    public final void onServiceDisconnected(
/*
Method generation error in method: com.loc.bl.3.onServiceDisconnected(android.content.ComponentName):void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.loc.bl.3.onServiceDisconnected(android.content.ComponentName):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                };
            }
        } catch (Throwable th2) {
            ce.a(th2, "ConnectionServiceManager", "init");
        }
        try {
            if (this.f25674a.checkCallingOrSelfPermission("android.permission.WRITE_SECURE_SETTINGS") == 0) {
                this.n = true;
            }
        } catch (Throwable unused) {
        }
        this.A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ac, code lost:
        if (r0 != null) goto L_0x01b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014a A[Catch:{ Throwable -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.autonavi.aps.amapapi.model.AMapLocationServer d() throws java.lang.Throwable {
        /*
            r13 = this;
            r13.c()
            android.content.Context r0 = r13.f25674a
            r1 = 1
            if (r0 != 0) goto L_0x001a
            java.lang.StringBuilder r0 = r13.p
            java.lang.String r2 = "context is null#0101"
            r0.append(r2)
            java.lang.StringBuilder r0 = r13.p
            java.lang.String r0 = r0.toString()
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = a((int) r1, (java.lang.String) r0)
            return r0
        L_0x001a:
            int r0 = r13.K
            int r0 = r0 + r1
            r13.K = r0
            int r0 = r13.K
            r2 = 3
            r3 = 2
            r4 = 0
            if (r0 != r1) goto L_0x0091
            com.loc.bs r0 = r13.f25676c
            if (r0 == 0) goto L_0x0091
            com.loc.bs r0 = r13.f25676c
            boolean r5 = r13.n
            android.content.Context r6 = r0.h
            android.net.wifi.WifiManager r0 = r0.f25581a
            if (r0 == 0) goto L_0x0091
            if (r6 == 0) goto L_0x0091
            if (r5 != 0) goto L_0x0039
            goto L_0x0091
        L_0x0039:
            int r0 = com.loc.cn.c()
            r5 = 17
            if (r0 <= r5) goto L_0x0091
            android.content.ContentResolver r0 = r6.getContentResolver()
            java.lang.String r5 = "android.provider.Settings$Global"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r0
            java.lang.String r7 = "wifi_scan_always_enabled"
            r6[r1] = r7
            java.lang.Class[] r7 = new java.lang.Class[r3]
            java.lang.Class<android.content.ContentResolver> r8 = android.content.ContentResolver.class
            r7[r4] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r1] = r8
            java.lang.String r8 = "getInt"
            java.lang.Object r6 = com.loc.ch.a((java.lang.String) r5, (java.lang.String) r8, (java.lang.Object[]) r6, (java.lang.Class<?>[]) r7)     // Catch:{ Throwable -> 0x0089 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x0089 }
            int r6 = r6.intValue()     // Catch:{ Throwable -> 0x0089 }
            if (r6 != 0) goto L_0x0091
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0089 }
            r6[r4] = r0     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r0 = "wifi_scan_always_enabled"
            r6[r1] = r0     // Catch:{ Throwable -> 0x0089 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0089 }
            r6[r3] = r0     // Catch:{ Throwable -> 0x0089 }
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x0089 }
            java.lang.Class<android.content.ContentResolver> r7 = android.content.ContentResolver.class
            r0[r4] = r7     // Catch:{ Throwable -> 0x0089 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r0[r1] = r7     // Catch:{ Throwable -> 0x0089 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0089 }
            r0[r3] = r7     // Catch:{ Throwable -> 0x0089 }
            java.lang.String r7 = "putInt"
            com.loc.ch.a((java.lang.String) r5, (java.lang.String) r7, (java.lang.Object[]) r6, (java.lang.Class<?>[]) r0)     // Catch:{ Throwable -> 0x0089 }
            goto L_0x0091
        L_0x0089:
            r0 = move-exception
            java.lang.String r5 = "WifiManagerWrapper"
            java.lang.String r6 = "enableWifiAlwaysScan"
            com.loc.ce.a(r0, r5, r6)
        L_0x0091:
            long r5 = r13.l
            boolean r0 = r13.N
            r7 = 0
            if (r0 != 0) goto L_0x009d
            r13.N = r1
        L_0x009b:
            r0 = 0
            goto L_0x00c4
        L_0x009d:
            long r9 = com.loc.cn.b()
            long r9 = r9 - r5
            r5 = 800(0x320, double:3.953E-321)
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)
            if (r0 == 0) goto L_0x00bc
            long r5 = com.loc.cn.a()
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            long r9 = r0.getTime()
            long r5 = r5 - r9
            goto L_0x00bd
        L_0x00bc:
            r5 = r7
        L_0x00bd:
            r9 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            r0 = 1
        L_0x00c4:
            if (r0 == 0) goto L_0x00e6
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r13.t
            if (r0 == 0) goto L_0x00e3
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            long r0 = r0.getTime()
            boolean r0 = com.loc.cd.b((long) r0)
            if (r0 == 0) goto L_0x00e3
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            r0.setLocationType(r3)
        L_0x00e3:
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            return r0
        L_0x00e6:
            com.loc.bn r0 = r13.C
            if (r0 == 0) goto L_0x0142
            boolean r0 = r13.D
            if (r0 == 0) goto L_0x013d
            com.loc.bn r0 = r13.C
            android.hardware.SensorManager r5 = r0.f25548a
            if (r5 == 0) goto L_0x0142
            boolean r5 = r0.f25552e
            if (r5 != 0) goto L_0x0142
            r0.f25552e = r1
            android.hardware.Sensor r5 = r0.f25549b     // Catch:{ Throwable -> 0x0108 }
            if (r5 == 0) goto L_0x0110
            android.hardware.SensorManager r5 = r0.f25548a     // Catch:{ Throwable -> 0x0108 }
            android.hardware.Sensor r6 = r0.f25549b     // Catch:{ Throwable -> 0x0108 }
            android.os.Handler r9 = r0.i     // Catch:{ Throwable -> 0x0108 }
            r5.registerListener(r0, r6, r2, r9)     // Catch:{ Throwable -> 0x0108 }
            goto L_0x0110
        L_0x0108:
            r5 = move-exception
            java.lang.String r6 = "AMapSensorManager"
            java.lang.String r9 = "registerListener mPressure"
            com.loc.ce.a(r5, r6, r9)
        L_0x0110:
            android.hardware.Sensor r5 = r0.f25550c     // Catch:{ Throwable -> 0x011e }
            if (r5 == 0) goto L_0x0126
            android.hardware.SensorManager r5 = r0.f25548a     // Catch:{ Throwable -> 0x011e }
            android.hardware.Sensor r6 = r0.f25550c     // Catch:{ Throwable -> 0x011e }
            android.os.Handler r9 = r0.i     // Catch:{ Throwable -> 0x011e }
            r5.registerListener(r0, r6, r2, r9)     // Catch:{ Throwable -> 0x011e }
            goto L_0x0126
        L_0x011e:
            r5 = move-exception
            java.lang.String r6 = "AMapSensorManager"
            java.lang.String r9 = "registerListener mRotationVector"
            com.loc.ce.a(r5, r6, r9)
        L_0x0126:
            android.hardware.Sensor r5 = r0.f25551d     // Catch:{ Throwable -> 0x0134 }
            if (r5 == 0) goto L_0x0142
            android.hardware.SensorManager r5 = r0.f25548a     // Catch:{ Throwable -> 0x0134 }
            android.hardware.Sensor r6 = r0.f25551d     // Catch:{ Throwable -> 0x0134 }
            android.os.Handler r9 = r0.i     // Catch:{ Throwable -> 0x0134 }
            r5.registerListener(r0, r6, r2, r9)     // Catch:{ Throwable -> 0x0134 }
            goto L_0x0142
        L_0x0134:
            r0 = move-exception
            java.lang.String r2 = "AMapSensorManager"
            java.lang.String r5 = "registerListener mAcceleroMeterVector"
            com.loc.ce.a(r0, r2, r5)
            goto L_0x0142
        L_0x013d:
            com.loc.bn r0 = r13.C
            r0.a()
        L_0x0142:
            com.amap.api.location.AMapLocationClientOption r0 = r13.j     // Catch:{ Throwable -> 0x0164 }
            boolean r0 = r0.isOnceLocationLatest()     // Catch:{ Throwable -> 0x0164 }
            if (r0 != 0) goto L_0x0155
            com.amap.api.location.AMapLocationClientOption r0 = r13.j     // Catch:{ Throwable -> 0x0164 }
            boolean r0 = r0.isOnceLocation()     // Catch:{ Throwable -> 0x0164 }
            if (r0 != 0) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            r0 = 0
            goto L_0x0156
        L_0x0155:
            r0 = 1
        L_0x0156:
            com.loc.bs r2 = r13.f25676c     // Catch:{ Throwable -> 0x0164 }
            r2.a((boolean) r0)     // Catch:{ Throwable -> 0x0164 }
            com.loc.bs r0 = r13.f25676c     // Catch:{ Throwable -> 0x0164 }
            java.util.ArrayList r0 = r0.a()     // Catch:{ Throwable -> 0x0164 }
            r13.h = r0     // Catch:{ Throwable -> 0x0164 }
            goto L_0x016c
        L_0x0164:
            r0 = move-exception
            java.lang.String r2 = "Aps"
            java.lang.String r5 = "getLocation getScanResultsParam"
            com.loc.ce.a(r0, r2, r5)
        L_0x016c:
            com.loc.bq r0 = r13.f25677d     // Catch:{ Throwable -> 0x0176 }
            boolean r2 = r13.l()     // Catch:{ Throwable -> 0x0176 }
            r0.a((boolean) r4, (boolean) r2)     // Catch:{ Throwable -> 0x0176 }
            goto L_0x017e
        L_0x0176:
            r0 = move-exception
            java.lang.String r2 = "Aps"
            java.lang.String r5 = "getLocation getCgiListParam"
            com.loc.ce.a(r0, r2, r5)
        L_0x017e:
            java.lang.String r0 = r13.k()
            r13.x = r0
            java.lang.String r0 = r13.x
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01d1
            com.loc.bl r0 = r13.f25679f
            boolean r1 = com.loc.cd.k
            if (r1 == 0) goto L_0x01af
            r0.a()
            r1 = 4
        L_0x0196:
            if (r1 <= 0) goto L_0x01a4
            boolean r2 = r0.f25535c
            if (r2 != 0) goto L_0x01a4
            r2 = 500(0x1f4, double:2.47E-321)
            android.os.SystemClock.sleep(r2)
            int r1 = r1 + -1
            goto L_0x0196
        L_0x01a4:
            boolean r1 = r0.f25535c
            if (r1 == 0) goto L_0x01af
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r0.c()
            if (r0 == 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            r0 = 0
        L_0x01b0:
            r13.k = r0
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            if (r0 == 0) goto L_0x01c4
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            java.lang.StringBuilder r1 = r13.p
            java.lang.String r1 = r1.toString()
            r0.setLocationDetail(r1)
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            return r0
        L_0x01c4:
            int r0 = r13.B
            java.lang.StringBuilder r1 = r13.p
            java.lang.String r1 = r1.toString()
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = a((int) r0, (java.lang.String) r1)
            return r0
        L_0x01d1:
            java.lang.StringBuilder r0 = r13.y
            java.lang.StringBuilder r0 = r13.a((java.lang.StringBuilder) r0)
            r13.y = r0
            com.loc.bs r0 = r13.f25676c
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x01eb
            r0 = 15
            java.lang.String r2 = "networkLocation has been mocked!#1502"
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = a((int) r0, (java.lang.String) r2)
            r0.setMock(r1)
            return r0
        L_0x01eb:
            long r5 = r13.l
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x01f3
        L_0x01f1:
            r7 = 1
            goto L_0x0202
        L_0x01f3:
            long r5 = com.loc.cn.b()
            long r7 = r13.l
            long r5 = r5 - r7
            r7 = 20000(0x4e20, double:9.8813E-320)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0201
            goto L_0x01f1
        L_0x0201:
            r7 = 0
        L_0x0202:
            com.loc.bu r5 = r13.f25678e
            com.loc.bq r6 = r13.f25677d
            com.autonavi.aps.amapapi.model.AMapLocationServer r8 = r13.k
            com.loc.bs r9 = r13.f25676c
            java.lang.StringBuilder r10 = r13.y
            java.lang.String r11 = r13.x
            android.content.Context r12 = r13.f25674a
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r5.a(r6, r7, r8, r9, r10, r11, r12)
            boolean r2 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)
            if (r2 == 0) goto L_0x021e
            r13.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)
            goto L_0x0264
        L_0x021e:
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.a((boolean) r4, (boolean) r1)
            r13.k = r0
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)
            if (r0 == 0) goto L_0x0264
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            java.lang.String r2 = "new"
            r0.e(r2)
            com.loc.bu r0 = r13.f25678e
            java.lang.StringBuilder r2 = r13.y
            java.lang.String r2 = r2.toString()
            r0.f25591f = r2
            com.loc.bu r0 = r13.f25678e
            com.loc.bq r2 = r13.f25677d
            com.loc.bp r2 = r2.a()
            r0.g = r2
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            r13.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)
            com.loc.br r0 = r13.H
            if (r0 == 0) goto L_0x0264
            com.loc.br r0 = r13.H
            com.loc.bq r2 = r13.f25677d
            java.util.ArrayList<android.net.wifi.ScanResult> r5 = r13.h
            com.autonavi.aps.amapapi.model.AMapLocationServer r6 = r13.k
            r0.a(r2, r5, r6, r3)     // Catch:{ Throwable -> 0x025c }
            goto L_0x0264
        L_0x025c:
            r0 = move-exception
            java.lang.String r2 = "APSCoManager"
            java.lang.String r3 = "correctOffLoc"
            com.loc.ce.a(r0, r2, r3)
        L_0x0264:
            com.loc.br r0 = r13.H
            if (r0 == 0) goto L_0x027c
            com.loc.br r0 = r13.H
            com.loc.bq r2 = r13.f25677d
            java.util.ArrayList<android.net.wifi.ScanResult> r3 = r13.h
            com.autonavi.aps.amapapi.model.AMapLocationServer r5 = r13.k
            r0.a(r2, r3, r5, r1)     // Catch:{ Throwable -> 0x0274 }
            goto L_0x027c
        L_0x0274:
            r0 = move-exception
            java.lang.String r1 = "APSCoManager"
            java.lang.String r2 = "trainingFps"
            com.loc.ce.a(r0, r1, r2)
        L_0x027c:
            com.loc.bu r5 = r13.f25678e
            java.lang.String r6 = r13.x
            java.lang.StringBuilder r7 = r13.y
            com.autonavi.aps.amapapi.model.AMapLocationServer r8 = r13.k
            android.content.Context r9 = r13.f25674a
            r10 = 1
            r5.a(r6, r7, r8, r9, r10)
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)
            if (r0 != 0) goto L_0x02a4
            com.loc.br r0 = r13.H
            if (r0 == 0) goto L_0x02a4
            com.loc.br r0 = r13.H
            com.loc.bq r1 = r13.f25677d
            java.util.ArrayList<android.net.wifi.ScanResult> r2 = r13.h
            com.autonavi.aps.amapapi.model.AMapLocationServer r3 = r13.k
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r0.a((com.loc.bq) r1, (java.util.List<android.net.wifi.ScanResult>) r2, (com.autonavi.aps.amapapi.model.AMapLocationServer) r3)
            r13.k = r0
        L_0x02a4:
            java.lang.StringBuilder r0 = r13.y
            java.lang.StringBuilder r1 = r13.y
            int r1 = r1.length()
            r0.delete(r4, r1)
            boolean r0 = r13.D
            if (r0 == 0) goto L_0x02d1
            com.loc.bn r0 = r13.C
            if (r0 == 0) goto L_0x02d1
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            com.loc.bn r1 = r13.C
            double r1 = r1.f25553f
            r0.setAltitude(r1)
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            com.loc.bn r1 = r13.C
            float r1 = r1.h
            r0.setBearing(r1)
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            com.loc.bn r1 = r13.C
            double r1 = r1.m
            float r1 = (float) r1
            goto L_0x02e0
        L_0x02d1:
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            r1 = 0
            r0.setAltitude(r1)
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            r1 = 0
            r0.setBearing(r1)
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
        L_0x02e0:
            r0.setSpeed(r1)
            com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r13.k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cm.d():com.autonavi.aps.amapapi.model.AMapLocationServer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0116, code lost:
        if (r6.isOpen() != false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012c A[SYNTHETIC, Splitter:B:79:0x012c] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x015c  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r13 = this;
            r0 = 0
            r13.G = r0
            r1 = 0
            r13.z = r1
            r13.A = r1
            com.loc.br r2 = r13.H
            if (r2 == 0) goto L_0x0011
            com.loc.br r2 = r13.H
            r2.b()
        L_0x0011:
            com.loc.bl r2 = r13.f25679f
            r3 = 1
            if (r2 == 0) goto L_0x00a9
            com.loc.bl r2 = r13.f25679f
            android.content.ServiceConnection r4 = r2.f25537e     // Catch:{ Throwable -> 0x0028 }
            if (r4 == 0) goto L_0x0030
            boolean r4 = r2.k     // Catch:{ Throwable -> 0x0028 }
            if (r4 == 0) goto L_0x0030
            android.content.Context r4 = r2.f25533a     // Catch:{ Throwable -> 0x0028 }
            android.content.ServiceConnection r5 = r2.f25537e     // Catch:{ Throwable -> 0x0028 }
            r4.unbindService(r5)     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r4 = move-exception
            java.lang.String r5 = "ConnectionServiceManager"
            java.lang.String r6 = "unbindService connService"
            com.loc.ce.a(r4, r5, r6)
        L_0x0030:
            android.content.ServiceConnection r4 = r2.f25538f     // Catch:{ Throwable -> 0x0040 }
            if (r4 == 0) goto L_0x0048
            boolean r4 = r2.l     // Catch:{ Throwable -> 0x0040 }
            if (r4 == 0) goto L_0x0048
            android.content.Context r4 = r2.f25533a     // Catch:{ Throwable -> 0x0040 }
            android.content.ServiceConnection r5 = r2.f25538f     // Catch:{ Throwable -> 0x0040 }
            r4.unbindService(r5)     // Catch:{ Throwable -> 0x0040 }
            goto L_0x0048
        L_0x0040:
            r4 = move-exception
            java.lang.String r5 = "ConnectionServiceManager"
            java.lang.String r6 = "unbindService pushService"
            com.loc.ce.a(r4, r5, r6)
        L_0x0048:
            android.content.ServiceConnection r4 = r2.g     // Catch:{ Throwable -> 0x0058 }
            if (r4 == 0) goto L_0x0060
            boolean r4 = r2.m     // Catch:{ Throwable -> 0x0058 }
            if (r4 == 0) goto L_0x0060
            android.content.Context r4 = r2.f25533a     // Catch:{ Throwable -> 0x0058 }
            android.content.ServiceConnection r5 = r2.g     // Catch:{ Throwable -> 0x0058 }
            r4.unbindService(r5)     // Catch:{ Throwable -> 0x0058 }
            goto L_0x0060
        L_0x0058:
            r4 = move-exception
            java.lang.String r5 = "ConnectionServiceManager"
            java.lang.String r6 = "unbindService otherService"
            com.loc.ce.a(r4, r5, r6)
        L_0x0060:
            java.util.List<android.content.Intent> r4 = r2.n
            if (r4 == 0) goto L_0x0084
            java.util.List<android.content.Intent> r4 = r2.n
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0084
            java.util.List<android.content.Intent> r4 = r2.n
            java.util.Iterator r4 = r4.iterator()
        L_0x0072:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0084
            java.lang.Object r5 = r4.next()
            android.content.Intent r5 = (android.content.Intent) r5
            android.content.Context r6 = r2.f25533a
            r6.stopService(r5)
            goto L_0x0072
        L_0x0084:
            r2.f25536d = r0
            r2.f25533a = r0
            r2.f25536d = r0
            r2.f25537e = r0
            r2.f25538f = r0
            r2.g = r0
            r2.f25534b = r3
            r2.f25535c = r1
            r2.h = r1
            r2.i = r1
            r2.j = r1
            r2.o = r1
            r2.k = r1
            r2.l = r1
            r2.m = r1
            java.util.List<android.content.Intent> r4 = r2.n
            r4.clear()
            r2.n = r0
        L_0x00a9:
            com.loc.bu r2 = r13.f25678e
            r4 = 0
            if (r2 == 0) goto L_0x014f
            com.loc.bu r2 = r13.f25678e
            android.content.Context r6 = r13.f25674a
            r2.a()     // Catch:{ Throwable -> 0x0147 }
            if (r6 == 0) goto L_0x0140
            java.lang.String r7 = "hmdb"
            android.database.sqlite.SQLiteDatabase r6 = r6.openOrCreateDatabase(r7, r1, r0)     // Catch:{ Throwable -> 0x0121, all -> 0x011e }
            java.lang.String r7 = "hist"
            boolean r7 = com.loc.cn.a((android.database.sqlite.SQLiteDatabase) r6, (java.lang.String) r7)     // Catch:{ Throwable -> 0x011c }
            if (r7 != 0) goto L_0x00d3
            if (r6 == 0) goto L_0x0140
            boolean r7 = r6.isOpen()     // Catch:{ Throwable -> 0x011c }
            if (r7 == 0) goto L_0x0140
            r6.close()     // Catch:{ Throwable -> 0x011c }
            goto L_0x0140
        L_0x00d3:
            java.lang.String r7 = "time<?"
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x011c }
            long r9 = com.loc.cn.a()     // Catch:{ Throwable -> 0x011c }
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r9 - r11
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x011c }
            r8[r1] = r9     // Catch:{ Throwable -> 0x011c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f9 }
            java.lang.String r10 = "hist"
            r9.<init>(r10)     // Catch:{ Throwable -> 0x00f9 }
            java.lang.String r10 = r2.f25588c     // Catch:{ Throwable -> 0x00f9 }
            r9.append(r10)     // Catch:{ Throwable -> 0x00f9 }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x00f9 }
            r6.delete(r9, r7, r8)     // Catch:{ Throwable -> 0x00f9 }
            goto L_0x0110
        L_0x00f9:
            r7 = move-exception
            java.lang.String r8 = "DB"
            java.lang.String r9 = "clearHist"
            com.loc.ce.a(r7, r8, r9)     // Catch:{ Throwable -> 0x011c }
            java.lang.String r7 = r7.getMessage()     // Catch:{ Throwable -> 0x011c }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x011c }
            if (r8 != 0) goto L_0x0110
            java.lang.String r8 = "no such table"
            r7.contains(r8)     // Catch:{ Throwable -> 0x011c }
        L_0x0110:
            if (r6 == 0) goto L_0x0140
            boolean r7 = r6.isOpen()     // Catch:{ Throwable -> 0x0147 }
            if (r7 == 0) goto L_0x0140
        L_0x0118:
            r6.close()     // Catch:{ Throwable -> 0x0147 }
            goto L_0x0140
        L_0x011c:
            r7 = move-exception
            goto L_0x0123
        L_0x011e:
            r2 = move-exception
            r6 = r0
            goto L_0x0134
        L_0x0121:
            r7 = move-exception
            r6 = r0
        L_0x0123:
            java.lang.String r8 = "DB"
            java.lang.String r9 = "clearHist p2"
            com.loc.ce.a(r7, r8, r9)     // Catch:{ all -> 0x0133 }
            if (r6 == 0) goto L_0x0140
            boolean r7 = r6.isOpen()     // Catch:{ Throwable -> 0x0147 }
            if (r7 == 0) goto L_0x0140
            goto L_0x0118
        L_0x0133:
            r2 = move-exception
        L_0x0134:
            if (r6 == 0) goto L_0x013f
            boolean r7 = r6.isOpen()     // Catch:{ Throwable -> 0x0147 }
            if (r7 == 0) goto L_0x013f
            r6.close()     // Catch:{ Throwable -> 0x0147 }
        L_0x013f:
            throw r2     // Catch:{ Throwable -> 0x0147 }
        L_0x0140:
            r2.f25587b = r1     // Catch:{ Throwable -> 0x0147 }
            r2.f25591f = r0     // Catch:{ Throwable -> 0x0147 }
            r2.h = r4     // Catch:{ Throwable -> 0x0147 }
            goto L_0x014f
        L_0x0147:
            r2 = move-exception
            java.lang.String r6 = "Cache"
            java.lang.String r7 = "destroy part"
            com.loc.ce.a(r2, r6, r7)
        L_0x014f:
            com.loc.bm r2 = r13.F
            if (r2 == 0) goto L_0x0158
            com.loc.bm r2 = r13.F
            r2.a()
        L_0x0158:
            com.loc.cb r2 = r13.g
            if (r2 == 0) goto L_0x015e
            r13.g = r0
        L_0x015e:
            java.util.Hashtable<java.lang.String, java.lang.Long> r2 = com.loc.cn.f25682a
            r2.clear()
            android.content.Context r2 = r13.f25674a     // Catch:{ Throwable -> 0x0178 }
            if (r2 == 0) goto L_0x0172
            com.loc.cm$a r2 = r13.i     // Catch:{ Throwable -> 0x0178 }
            if (r2 == 0) goto L_0x0172
            android.content.Context r2 = r13.f25674a     // Catch:{ Throwable -> 0x0178 }
            com.loc.cm$a r6 = r13.i     // Catch:{ Throwable -> 0x0178 }
            r2.unregisterReceiver(r6)     // Catch:{ Throwable -> 0x0178 }
        L_0x0172:
            r13.i = r0
            goto L_0x0181
        L_0x0175:
            r1 = move-exception
            goto L_0x0205
        L_0x0178:
            r2 = move-exception
            java.lang.String r6 = "Aps"
            java.lang.String r7 = "destroy"
            com.loc.ce.a(r2, r6, r7)     // Catch:{ all -> 0x0175 }
            goto L_0x0172
        L_0x0181:
            com.loc.bq r2 = r13.f25677d
            if (r2 == 0) goto L_0x01c9
            com.loc.bq r2 = r13.f25677d
            com.loc.bo r6 = r2.g
            java.util.HashMap<java.lang.Long, com.loc.bp> r7 = r6.f25555a
            r7.clear()
            r6.f25556b = r4
            r2.k = r4
            java.lang.Object r4 = r2.s
            monitor-enter(r4)
            r2.r = r3     // Catch:{ all -> 0x01c6 }
            monitor-exit(r4)     // Catch:{ all -> 0x01c6 }
            android.telephony.TelephonyManager r3 = r2.f25568f
            if (r3 == 0) goto L_0x01b0
            android.telephony.PhoneStateListener r3 = r2.m
            if (r3 == 0) goto L_0x01b0
            android.telephony.TelephonyManager r3 = r2.f25568f     // Catch:{ Throwable -> 0x01a8 }
            android.telephony.PhoneStateListener r4 = r2.m     // Catch:{ Throwable -> 0x01a8 }
            r3.listen(r4, r1)     // Catch:{ Throwable -> 0x01a8 }
            goto L_0x01b0
        L_0x01a8:
            r3 = move-exception
            java.lang.String r4 = "CgiManager"
            java.lang.String r5 = "destroy"
            com.loc.ce.a(r3, r4, r5)
        L_0x01b0:
            r2.m = r0
            android.os.HandlerThread r3 = r2.q
            if (r3 == 0) goto L_0x01bd
            android.os.HandlerThread r3 = r2.q
            r3.quit()
            r2.q = r0
        L_0x01bd:
            r3 = -113(0xffffffffffffff8f, float:NaN)
            r2.f25567e = r3
            r2.f25568f = r0
            r2.h = r0
            goto L_0x01c9
        L_0x01c6:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01c9:
            com.loc.bs r2 = r13.f25676c
            if (r2 == 0) goto L_0x01d7
            com.loc.bs r2 = r13.f25676c
            r2.b()
            java.util.ArrayList<android.net.wifi.ScanResult> r2 = r2.f25582b
            r2.clear()
        L_0x01d7:
            java.util.ArrayList<android.net.wifi.ScanResult> r2 = r13.h
            if (r2 == 0) goto L_0x01e0
            java.util.ArrayList<android.net.wifi.ScanResult> r2 = r13.h
            r2.clear()
        L_0x01e0:
            com.loc.bn r2 = r13.C
            if (r2 == 0) goto L_0x01fc
            com.loc.bn r2 = r13.C
            r2.a()     // Catch:{ Throwable -> 0x01f4 }
            r2.f25549b = r0     // Catch:{ Throwable -> 0x01f4 }
            r2.f25550c = r0     // Catch:{ Throwable -> 0x01f4 }
            r2.f25548a = r0     // Catch:{ Throwable -> 0x01f4 }
            r2.f25551d = r0     // Catch:{ Throwable -> 0x01f4 }
            r2.f25552e = r1     // Catch:{ Throwable -> 0x01f4 }
            goto L_0x01fc
        L_0x01f4:
            r1 = move-exception
            java.lang.String r2 = "AMapSensorManager"
            java.lang.String r3 = "destroy"
            com.loc.ce.a(r1, r2, r3)
        L_0x01fc:
            com.loc.bx.f25598a = r0
            r13.k = r0
            r13.f25674a = r0
            r13.y = r0
            return
        L_0x0205:
            r13.i = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cm.f():void");
    }

    public final void a() {
        if (bz.f25619a == null) {
            bz.f25619a = new bz();
        }
        this.o = bz.f25619a;
        i();
        if (this.f25675b == null) {
            this.f25675b = (ConnectivityManager) cn.a(this.f25674a, "connectivity");
        }
        if (this.m == null) {
            this.m = new cc();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0118, code lost:
        if (r12 < 30000) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012c, code lost:
        if ((r10 - r2.f25544c) > 30000) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.autonavi.aps.amapapi.model.AMapLocationServer a(com.autonavi.aps.amapapi.model.AMapLocationServer r21, java.lang.String... r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            com.loc.bm r2 = r0.F
            boolean r3 = r0.t
            r2.f25545d = r3
            com.loc.bm r2 = r0.F
            long r3 = com.loc.cn.b()
            long r5 = r2.f25547f
            long r3 = r3 - r5
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0024
            r2.f25542a = r1
            long r3 = com.loc.cn.b()
            r2.f25547f = r3
        L_0x0021:
            com.autonavi.aps.amapapi.model.AMapLocationServer r1 = r2.f25542a
            return r1
        L_0x0024:
            long r3 = com.loc.cn.b()
            r2.f25547f = r3
            com.autonavi.aps.amapapi.model.AMapLocationServer r3 = r2.f25542a
            boolean r3 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r3)
            if (r3 == 0) goto L_0x012f
            boolean r3 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r21)
            if (r3 != 0) goto L_0x003a
            goto L_0x012f
        L_0x003a:
            long r3 = r21.getTime()
            com.autonavi.aps.amapapi.model.AMapLocationServer r7 = r2.f25542a
            long r7 = r7.getTime()
            r9 = 1133903872(0x43960000, float:300.0)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0053
            float r3 = r21.getAccuracy()
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            return r1
        L_0x0053:
            java.lang.String r3 = r21.getProvider()
            java.lang.String r4 = "gps"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012f
            int r3 = r21.c()
            com.autonavi.aps.amapapi.model.AMapLocationServer r4 = r2.f25542a
            int r4 = r4.c()
            if (r3 != r4) goto L_0x012f
            java.lang.String r3 = r21.getBuildingId()
            com.autonavi.aps.amapapi.model.AMapLocationServer r4 = r2.f25542a
            java.lang.String r4 = r4.getBuildingId()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0085
            java.lang.String r3 = r21.getBuildingId()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x012f
        L_0x0085:
            int r3 = r21.getLocationType()
            r2.f25546e = r3
            com.autonavi.aps.amapapi.model.AMapLocationServer r3 = r2.f25542a
            float r3 = com.loc.cn.a((com.amap.api.location.AMapLocation) r1, (com.amap.api.location.AMapLocation) r3)
            com.autonavi.aps.amapapi.model.AMapLocationServer r4 = r2.f25542a
            float r4 = r4.getAccuracy()
            float r7 = r21.getAccuracy()
            float r8 = r7 - r4
            long r10 = com.loc.cn.b()
            long r12 = r2.f25543b
            long r12 = r10 - r12
            r14 = 1
            r15 = 0
            r16 = 1120403456(0x42c80000, float:100.0)
            r17 = 1133871104(0x43958000, float:299.0)
            int r18 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r18 > 0) goto L_0x00b7
            int r18 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r18 <= 0) goto L_0x00b7
            r18 = 1
            goto L_0x00b9
        L_0x00b7:
            r18 = 0
        L_0x00b9:
            int r19 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x00c2
            int r19 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r14 = 0
        L_0x00c3:
            r5 = 0
            if (r18 != 0) goto L_0x011b
            if (r14 == 0) goto L_0x00ca
            goto L_0x011b
        L_0x00ca:
            int r14 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x00da
            int r14 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x00da
        L_0x00d2:
            r2.f25543b = r10
            r2.f25542a = r1
            r2.f25544c = r5
            goto L_0x0021
        L_0x00da:
            int r14 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r14 > 0) goto L_0x00e0
            r2.f25544c = r5
        L_0x00e0:
            r5 = 1092616192(0x41200000, float:10.0)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0110
            double r5 = (double) r3
            r14 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x0110
            r3 = 1084227584(0x40a00000, float:5.0)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0110
            r3 = -1013579776(0xffffffffc3960000, float:-300.0)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0106
        L_0x00fc:
            com.autonavi.aps.amapapi.model.AMapLocationServer r1 = r2.f25542a
            com.autonavi.aps.amapapi.model.AMapLocationServer r1 = r2.a(r1)
        L_0x0102:
            r2.f25542a = r1
            goto L_0x0021
        L_0x0106:
            float r4 = r4 / r7
            r3 = 1073741824(0x40000000, float:2.0)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x00fc
            r2.f25543b = r10
            goto L_0x0102
        L_0x0110:
            int r3 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x012f
            r3 = 30000(0x7530, double:1.4822E-319)
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x012f
            goto L_0x00fc
        L_0x011b:
            long r3 = r2.f25544c
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0124
            r2.f25544c = r10
            goto L_0x00fc
        L_0x0124:
            long r3 = r2.f25544c
            long r3 = r10 - r3
            r7 = 30000(0x7530, double:1.4822E-319)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00fc
            goto L_0x00d2
        L_0x012f:
            long r3 = com.loc.cn.b()
            r2.f25543b = r3
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cm.a(com.autonavi.aps.amapapi.model.AMapLocationServer, java.lang.String[]):com.autonavi.aps.amapapi.model.AMapLocationServer");
    }
}
