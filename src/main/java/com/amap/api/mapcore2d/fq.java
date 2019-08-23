package com.amap.api.mapcore2d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public final class fq {

    /* renamed from: a  reason: collision with root package name */
    Context f6167a;

    /* renamed from: b  reason: collision with root package name */
    boolean f6168b;

    /* renamed from: c  reason: collision with root package name */
    String f6169c = null;

    /* renamed from: d  reason: collision with root package name */
    long f6170d = 0;

    /* renamed from: e  reason: collision with root package name */
    WifiInfo f6171e = null;

    /* renamed from: f  reason: collision with root package name */
    boolean f6172f = true;
    int g = 12;
    /* access modifiers changed from: private */
    public fx h;
    private fw i;
    private a j;
    private fz k;
    private ConnectivityManager l;
    private gb m;
    private StringBuilder n = new StringBuilder();
    private Inner_3dMap_locationOption o = null;
    private fi p = null;
    private String q = "00:00:00:00:00:00";

    class a extends BroadcastReceiver {
        private a() {
        }

        /* synthetic */ a(fq fqVar, byte b2) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if (!(context == null || intent == null)) {
                try {
                    String action = intent.getAction();
                    if (!TextUtils.isEmpty(action)) {
                        if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                            if (fq.this.h != null) {
                                fq.this.h.c();
                            }
                        } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED") && fq.this.h != null) {
                            fq.this.h.d();
                        }
                    }
                } catch (Throwable th) {
                    gc.a(th, "NetLocation", "onReceive");
                }
            }
        }
    }

    public fq(Context context) {
        try {
            this.f6167a = context.getApplicationContext();
            gf.b(this.f6167a);
            a(this.f6167a);
            this.o = new Inner_3dMap_locationOption();
            if (this.h == null) {
                this.h = new fx(this.f6167a, (WifiManager) gf.a(this.f6167a, "wifi"));
                this.h.a(this.f6168b);
            }
            if (this.i == null) {
                this.i = new fw(this.f6167a);
            }
            if (this.k == null) {
                this.k = fz.a(this.f6167a);
            }
            if (this.l == null) {
                this.l = (ConnectivityManager) gf.a(this.f6167a, "connectivity");
            }
            this.m = new gb();
            c();
        } catch (Throwable th) {
            gc.a(th, "NetLocation", "<init>");
        }
    }

    private static fi a(fi fiVar, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return fl.a().a(fiVar);
        }
        if (strArr[0].equals("shake")) {
            return fl.a().a(fiVar);
        }
        if (strArr[0].equals("fusion")) {
            fl.a();
            fiVar = fl.b(fiVar);
        }
        return fiVar;
    }

    private void a(Context context) {
        try {
            if (context.checkCallingOrSelfPermission("android.permission.WRITE_SECURE_SETTINGS") == 0) {
                this.f6168b = true;
            }
        } catch (Throwable unused) {
        }
    }

    private boolean a(long j2) {
        if (gf.b() - j2 < 800) {
            long j3 = 0;
            if (fs.a(this.p)) {
                j3 = gf.a() - this.p.getTime();
            }
            if (j3 <= 10000) {
                return true;
            }
        }
        return false;
    }

    private void c() {
        try {
            if (this.j == null) {
                this.j = new a(this, (byte) 0);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.f6167a.registerReceiver(this.j, intentFilter);
            this.h.b(false);
            this.i.f();
        } catch (Throwable th) {
            gc.a(th, "NetLocation", "initBroadcastListener");
        }
    }

    private fi d() throws Exception {
        String str;
        StringBuilder sb;
        fi fiVar = new fi("");
        if (this.h.g()) {
            fiVar.setErrorCode(15);
            return fiVar;
        }
        try {
            if (this.m == null) {
                this.m = new gb();
            }
            this.m.a(this.f6167a, this.o.isNeedAddress(), this.o.isOffset(), this.i, this.h, this.l, this.q, this.f6169c);
            fr frVar = new fr();
            byte[] bArr = null;
            String str2 = "";
            try {
                try {
                    ex a2 = this.k.a(this.k.a(this.f6167a, this.m.a(), gc.a()));
                    if (a2 != null) {
                        bArr = a2.f6094a;
                        str2 = a2.f6096c;
                    }
                    if (bArr == null || bArr.length == 0) {
                        fiVar.setErrorCode(4);
                        this.n.append("please check the network");
                        if (!TextUtils.isEmpty(str2)) {
                            this.n.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        fiVar.setLocationDetail(this.n.toString());
                        return fiVar;
                    }
                    String str3 = new String(bArr, "UTF-8");
                    if (str3.contains("\"status\":\"0\"")) {
                        return frVar.a(str3, this.f6167a, a2);
                    }
                    if (str3.contains("</body></html>")) {
                        fiVar.setErrorCode(5);
                        if (this.h == null || !this.h.a(this.l)) {
                            sb = this.n;
                            str = "request may be intercepted";
                        } else {
                            sb = this.n;
                            str = "make sure you are logged in to the network";
                        }
                        sb.append(str);
                        if (!TextUtils.isEmpty(str2)) {
                            this.n.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        fiVar.setLocationDetail(this.n.toString());
                        return fiVar;
                    }
                    byte[] a3 = fy.a(bArr);
                    if (a3 == null) {
                        fiVar.setErrorCode(5);
                        this.n.append("decrypt response data error");
                        if (!TextUtils.isEmpty(str2)) {
                            this.n.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        fiVar.setLocationDetail(this.n.toString());
                        return fiVar;
                    }
                    fi a4 = frVar.a(a3);
                    if (a4 == null) {
                        fi fiVar2 = new fi("");
                        fiVar2.setErrorCode(5);
                        this.n.append("location is null");
                        if (!TextUtils.isEmpty(str2)) {
                            this.n.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        fiVar2.setLocationDetail(this.n.toString());
                        return fiVar2;
                    }
                    this.f6169c = a4.a();
                    if (a4.getErrorCode() != 0) {
                        if (!TextUtils.isEmpty(str2)) {
                            a4.setLocationDetail(a4.getLocationDetail() + " #csid:" + str2);
                        }
                        return a4;
                    } else if (fs.a(a4)) {
                        JSONObject e2 = a4.e();
                        if (a4.getErrorCode() == 0 && a4.getLocationType() == 0) {
                            if ("-5".equals(a4.d()) || PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(a4.d()) || PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(a4.d()) || "14".equals(a4.d()) || "24".equals(a4.d()) || "-1".equals(a4.d())) {
                                a4.setLocationType(5);
                            } else {
                                a4.setLocationType(6);
                            }
                            this.n.append(a4.d());
                            if (!TextUtils.isEmpty(str2)) {
                                this.n.append(" #csid:".concat(String.valueOf(str2)));
                            }
                            a4.setLocationDetail(this.n.toString());
                        }
                        return a4;
                    } else {
                        String b2 = a4.b();
                        a4.setErrorCode(6);
                        StringBuilder sb2 = this.n;
                        StringBuilder sb3 = new StringBuilder("location faile retype:");
                        sb3.append(a4.d());
                        sb3.append(" rdesc:");
                        if (b2 == null) {
                            b2 = "null";
                        }
                        sb3.append(b2);
                        sb2.append(sb3.toString());
                        if (!TextUtils.isEmpty(str2)) {
                            this.n.append(" #csid:".concat(String.valueOf(str2)));
                        }
                        a4.setLocationDetail(this.n.toString());
                        return a4;
                    }
                } catch (Throwable th) {
                    gc.a(th, "NetLocation", "getApsLoc req");
                    fiVar.setErrorCode(4);
                    this.n.append("please check the network");
                    fiVar.setLocationDetail(this.n.toString());
                    return fiVar;
                }
            } catch (Throwable th2) {
                gc.a(th2, "NetLocation", "getApsLoc buildV4Dot2");
                fiVar.setErrorCode(3);
                StringBuilder sb4 = this.n;
                sb4.append("buildV4Dot2 error " + th2.getMessage());
                fiVar.setLocationDetail(this.n.toString());
                return fiVar;
            }
        } catch (Throwable th3) {
            gc.a(th3, "NetLocation", "getApsLoc");
            StringBuilder sb5 = this.n;
            sb5.append("get parames error:" + th3.getMessage());
            fiVar.setErrorCode(3);
            fiVar.setLocationDetail(this.n.toString());
            return fiVar;
        }
    }

    public final Inner_3dMap_location a() {
        if (this.n.length() > 0) {
            this.n.delete(0, this.n.length());
        }
        if (a(this.f6170d) && fs.a(this.p)) {
            return this.p;
        }
        this.f6170d = gf.b();
        if (this.f6167a == null) {
            this.n.append("context is null");
            Inner_3dMap_location inner_3dMap_location = new Inner_3dMap_location("");
            inner_3dMap_location.setErrorCode(1);
            inner_3dMap_location.setLocationDetail(this.n.toString());
            return inner_3dMap_location;
        }
        try {
            this.i.f();
        } catch (Throwable th) {
            gc.a(th, "NetLocation", "getLocation getCgiListParam");
        }
        try {
            this.h.b(true);
        } catch (Throwable th2) {
            gc.a(th2, "NetLocation", "getLocation getScanResultsParam");
        }
        try {
            this.p = d();
            this.p = a(this.p, new String[0]);
        } catch (Throwable th3) {
            gc.a(th3, "NetLocation", "getLocation getScanResultsParam");
        }
        return this.p;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption r5) {
        /*
            r4 = this;
            r4.o = r5
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption r5 = r4.o
            if (r5 != 0) goto L_0x000d
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption r5 = new com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption
            r5.<init>()
            r4.o = r5
        L_0x000d:
            com.amap.api.mapcore2d.fx r5 = r4.h     // Catch:{ Throwable -> 0x001d }
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption r0 = r4.o     // Catch:{ Throwable -> 0x001d }
            r0.isWifiActiveScan()     // Catch:{ Throwable -> 0x001d }
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption r0 = r4.o     // Catch:{ Throwable -> 0x001d }
            boolean r0 = r0.isWifiScan()     // Catch:{ Throwable -> 0x001d }
            r5.c(r0)     // Catch:{ Throwable -> 0x001d }
        L_0x001d:
            com.amap.api.mapcore2d.fz r5 = r4.k     // Catch:{ Throwable -> 0x0034 }
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption r0 = r4.o     // Catch:{ Throwable -> 0x0034 }
            long r0 = r0.getHttpTimeOut()     // Catch:{ Throwable -> 0x0034 }
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption r2 = r4.o     // Catch:{ Throwable -> 0x0034 }
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol r2 = r2.getLocationProtocol()     // Catch:{ Throwable -> 0x0034 }
            com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption$Inner_3dMap_Enum_LocationProtocol r3 = com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption.Inner_3dMap_Enum_LocationProtocol.HTTPS     // Catch:{ Throwable -> 0x0034 }
            boolean r2 = r2.equals(r3)     // Catch:{ Throwable -> 0x0034 }
            r5.a(r0, r2)     // Catch:{ Throwable -> 0x0034 }
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fq.a(com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption):void");
    }

    public final void b() {
        this.f6168b = false;
        this.f6169c = null;
        try {
            if (!(this.f6167a == null || this.j == null)) {
                this.f6167a.unregisterReceiver(this.j);
            }
            if (this.i != null) {
                this.i.g();
            }
            if (this.h != null) {
                this.h.h();
            }
        } catch (Throwable unused) {
        } finally {
            this.j = null;
        }
    }
}
