package com.loc;

import android.content.Context;
import android.net.wifi.ScanResult;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

public final class br {

    /* renamed from: a  reason: collision with root package name */
    Object f25571a;

    /* renamed from: b  reason: collision with root package name */
    boolean f25572b;

    /* renamed from: c  reason: collision with root package name */
    boolean f25573c;

    /* renamed from: d  reason: collision with root package name */
    private String f25574d = "com.amap.opensdk.co.CoManager";

    /* renamed from: e  reason: collision with root package name */
    private Context f25575e;

    /* renamed from: f  reason: collision with root package name */
    private int f25576f = -1;
    private boolean g;

    public br(Context context) {
        this.f25575e = context;
    }

    private static String a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sv", "4.2.0");
            jSONObject.put("als", "S128DF1572465B890OE3F7A13167KLEI");
            jSONObject.put("pn", cy.c(context));
            jSONObject.put("ak", cy.f(context));
            jSONObject.put("ud", dc.h(context));
            jSONObject.put(ActVideoSetting.ACT_URL, dc.b(context));
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void a(String str, String str2, String str3) {
        if (!str2.endsWith(File.separator)) {
            str2 = str2 + File.separator;
        }
        cn.e(str2);
        cn.b(str, str2 + str3);
    }

    private static ScanResult[] a(List<ScanResult> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    ScanResult[] scanResultArr = new ScanResult[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        scanResultArr[i] = list.get(i);
                    }
                    return scanResultArr;
                }
            } catch (Throwable th) {
                ce.a(th, "APSCoManager", "buildScanResults");
            }
        }
        return null;
    }

    public final AMapLocationServer a(bq bqVar, List<ScanResult> list, AMapLocationServer aMapLocationServer) {
        String e2;
        try {
            if (!d()) {
                return aMapLocationServer;
            }
            if (aMapLocationServer != null && aMapLocationServer.getErrorCode() == 7) {
                return aMapLocationServer;
            }
            c();
            if (this.f25571a != null) {
                this.f25573c = true;
                Object a2 = a(bqVar);
                Object a3 = a(list);
                Object a4 = ch.a(this.f25571a, "getOfflineLoc", new Class[]{String.class, ScanResult[].class, Boolean.TYPE}, new Object[]{a2, a3, Boolean.FALSE});
                if (a4 != null) {
                    JSONObject jSONObject = new JSONObject((String) a4);
                    AMapLocationServer aMapLocationServer2 = new AMapLocationServer("lbs");
                    aMapLocationServer2.b(jSONObject);
                    if (cn.a(aMapLocationServer2)) {
                        StringBuffer stringBuffer = new StringBuffer();
                        if (aMapLocationServer2.e().equals("file")) {
                            e2 = "基站离线定位";
                        } else if (aMapLocationServer2.e().equals("wifioff")) {
                            e2 = "WIFI离线定位";
                        } else {
                            stringBuffer.append("离线定位，");
                            e2 = aMapLocationServer2.e();
                        }
                        stringBuffer.append(e2);
                        stringBuffer.append("，在线定位失败原因:" + aMapLocationServer.getErrorInfo());
                        aMapLocationServer2.setLocationDetail(stringBuffer.toString());
                        aMapLocationServer2.setLocationType(8);
                    }
                    return aMapLocationServer2;
                }
            }
            return aMapLocationServer;
        } catch (Throwable th) {
            ce.a(th, "APSCoManager", "getOffLoc");
        }
    }

    public final String a() {
        String str = null;
        try {
            if (!cd.j()) {
                b();
                return null;
            }
            if (this.f25571a != null) {
                str = (String) ch.a(this.f25571a, "getCollectVersion", new Object[0]);
            }
            return str;
        } catch (Throwable th) {
            ce.a(th, "APSCoManager", "getCollectionVersion");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(bq bqVar, List<ScanResult> list, AMapLocationServer aMapLocationServer, int i) {
        try {
            if (d() && cn.a(aMapLocationServer)) {
                c();
                if (this.f25571a != null) {
                    Object a2 = a(bqVar);
                    Object a3 = a(list);
                    if (i == 1) {
                        ch.a(this.f25571a, "trainingFps", new Class[]{String.class, ScanResult[].class}, new Object[]{a2, a3});
                    } else if (i == 2) {
                        ch.a(this.f25571a, "correctOfflineLocation", new Class[]{String.class, ScanResult[].class, Double.TYPE, Double.TYPE}, new Object[]{a2, a3, Double.valueOf(aMapLocationServer.getLatitude()), Double.valueOf(aMapLocationServer.getLongitude())});
                    }
                    this.f25573c = true;
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("action-");
            sb.append(1 == i ? "training" : "correct");
            ce.a(th, "APSCoManager", sb.toString());
        }
    }

    public final void b() {
        try {
            if (this.f25571a != null) {
                ch.a(this.f25571a, "destroy", new Object[0]);
            }
            this.f25572b = false;
            this.f25573c = false;
            this.f25571a = null;
        } catch (Throwable th) {
            ce.a(th, "APSCoManager", "destroy");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0120 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f25571a     // Catch:{ Throwable -> 0x0148 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0120
            boolean r0 = r10.g     // Catch:{ Throwable -> 0x0148 }
            if (r0 != 0) goto L_0x0120
            boolean r0 = com.loc.cd.l()     // Catch:{ Throwable -> 0x0148 }
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = "co"
            java.lang.String r3 = "1.0.0"
            com.loc.dh r0 = com.loc.ce.a((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0148 }
            android.content.Context r3 = r10.f25575e     // Catch:{ Throwable -> 0x0148 }
            boolean r3 = com.loc.cj.a((android.content.Context) r3, (com.loc.dh) r0)     // Catch:{ Throwable -> 0x0148 }
            r10.g = r3     // Catch:{ Throwable -> 0x0148 }
            boolean r3 = r10.g     // Catch:{ Throwable -> 0x0148 }
            if (r3 == 0) goto L_0x011e
            android.content.Context r4 = r10.f25575e     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r6 = r10.f25574d     // Catch:{ Throwable -> 0x0120 }
            r7 = 0
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x0120 }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r8[r1] = r3     // Catch:{ Throwable -> 0x0120 }
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0120 }
            android.content.Context r3 = r10.f25575e     // Catch:{ Throwable -> 0x0120 }
            r9[r1] = r3     // Catch:{ Throwable -> 0x0120 }
            r5 = r0
            java.lang.Object r3 = com.loc.t.a(r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0120 }
            r10.f25571a = r3     // Catch:{ Throwable -> 0x0120 }
            android.content.Context r3 = r10.f25575e     // Catch:{ Throwable -> 0x0057 }
            if (r3 != 0) goto L_0x0041
            goto L_0x005f
        L_0x0041:
            android.content.Context r3 = r10.f25575e     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r3 = a((android.content.Context) r3)     // Catch:{ Throwable -> 0x0057 }
            java.lang.Object r4 = r10.f25571a     // Catch:{ Throwable -> 0x0057 }
            if (r4 == 0) goto L_0x005f
            java.lang.Object r4 = r10.f25571a     // Catch:{ Throwable -> 0x0057 }
            java.lang.String r5 = "init"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0057 }
            r6[r1] = r3     // Catch:{ Throwable -> 0x0057 }
            com.loc.ch.a(r4, r5, r6)     // Catch:{ Throwable -> 0x0057 }
            goto L_0x005f
        L_0x0057:
            r3 = move-exception
            java.lang.String r4 = "APSCoManager"
            java.lang.String r5 = "setConfig"
            com.loc.ce.a(r3, r4, r5)     // Catch:{ Throwable -> 0x0120 }
        L_0x005f:
            android.content.Context r3 = r10.f25575e     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r0 = com.loc.t.a((android.content.Context) r3, (com.loc.dh) r0)     // Catch:{ Throwable -> 0x0120 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0120 }
            if (r3 != 0) goto L_0x0120
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0120 }
            r3.<init>()     // Catch:{ Throwable -> 0x0120 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0120 }
            r4.<init>()     // Catch:{ Throwable -> 0x0120 }
            android.content.Context r5 = r10.f25575e     // Catch:{ Throwable -> 0x0120 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Throwable -> 0x0120 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Throwable -> 0x0120 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Throwable -> 0x0120 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r5 = "loc_cozip"
            r4.append(r5)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r5 = java.io.File.separator     // Catch:{ Throwable -> 0x0120 }
            int r5 = r0.lastIndexOf(r5)     // Catch:{ Throwable -> 0x0120 }
            int r5 = r5 + r2
            java.lang.String r6 = "."
            int r6 = r0.lastIndexOf(r6)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r5 = r0.substring(r5, r6)     // Catch:{ Throwable -> 0x0120 }
            boolean r6 = com.loc.cn.c((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0120 }
            android.content.Context r7 = r10.f25575e     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r8 = "pref"
            java.lang.String r9 = "ok4"
            boolean r7 = com.loc.cl.b((android.content.Context) r7, (java.lang.String) r8, (java.lang.String) r9, (boolean) r1)     // Catch:{ Throwable -> 0x0120 }
            if (r6 == 0) goto L_0x00b7
            if (r7 == 0) goto L_0x00c3
        L_0x00b7:
            android.content.Context r6 = r10.f25575e     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r7 = "pref"
            java.lang.String r8 = "ok4"
            com.loc.cl.a((android.content.Context) r6, (java.lang.String) r7, (java.lang.String) r8, (boolean) r1)     // Catch:{ Throwable -> 0x0120 }
            a((java.lang.String) r0, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0120 }
        L_0x00c3:
            android.content.Context r6 = r10.f25575e     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r6 = com.loc.di.a((android.content.Context) r6)     // Catch:{ Throwable -> 0x0120 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0120 }
            if (r7 != 0) goto L_0x0120
            r3.append(r4)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Throwable -> 0x0120 }
            r3.append(r7)     // Catch:{ Throwable -> 0x0120 }
            r3.append(r5)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Throwable -> 0x0120 }
            r3.append(r7)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r7 = "libs"
            r3.append(r7)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Throwable -> 0x0120 }
            r3.append(r7)     // Catch:{ Throwable -> 0x0120 }
            r3.append(r6)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Throwable -> 0x0120 }
            r3.append(r6)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r6 = "libapssdk.so"
            r3.append(r6)     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0120 }
            java.io.File r6 = new java.io.File     // Catch:{ Throwable -> 0x0120 }
            r6.<init>(r3)     // Catch:{ Throwable -> 0x0120 }
            boolean r7 = r6.exists()     // Catch:{ Throwable -> 0x0120 }
            if (r7 != 0) goto L_0x0108
            a((java.lang.String) r0, (java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0120 }
        L_0x0108:
            boolean r0 = r6.exists()     // Catch:{ Throwable -> 0x0120 }
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r10.f25571a     // Catch:{ Throwable -> 0x0120 }
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r10.f25571a     // Catch:{ Throwable -> 0x0120 }
            java.lang.String r4 = "loadSo"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0120 }
            r5[r1] = r3     // Catch:{ Throwable -> 0x0120 }
            com.loc.ch.a(r0, r4, r5)     // Catch:{ Throwable -> 0x0120 }
            goto L_0x0120
        L_0x011e:
            r10.g = r2     // Catch:{ Throwable -> 0x0148 }
        L_0x0120:
            int r0 = com.loc.cd.k()     // Catch:{ Throwable -> 0x013f }
            int r3 = r10.f25576f     // Catch:{ Throwable -> 0x013f }
            if (r3 != r0) goto L_0x0129
            return
        L_0x0129:
            r10.f25576f = r0     // Catch:{ Throwable -> 0x013f }
            java.lang.Object r3 = r10.f25571a     // Catch:{ Throwable -> 0x013f }
            if (r3 == 0) goto L_0x013e
            java.lang.Object r3 = r10.f25571a     // Catch:{ Throwable -> 0x013f }
            java.lang.String r4 = "setCloudConfigVersion"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x013f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x013f }
            r2[r1] = r0     // Catch:{ Throwable -> 0x013f }
            com.loc.ch.a(r3, r4, r2)     // Catch:{ Throwable -> 0x013f }
        L_0x013e:
            return
        L_0x013f:
            r0 = move-exception
            java.lang.String r1 = "APSCoManager"
            java.lang.String r2 = "setCloudVersion"
            com.loc.ce.a(r0, r1, r2)     // Catch:{ Throwable -> 0x0148 }
            return
        L_0x0148:
            r0 = move-exception
            java.lang.String r1 = "APSCoManager"
            java.lang.String r2 = "initOffLocation"
            com.loc.ce.a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.c():void");
    }

    private boolean d() {
        if (!cd.j()) {
            b();
            return false;
        } else if (cd.I) {
            return true;
        } else {
            if (this.f25573c) {
                try {
                    if (this.f25571a != null) {
                        ch.a(this.f25571a, "destroyOfflineLoc", new Object[0]);
                    }
                } catch (Throwable th) {
                    ce.a(th, "APSCoManager", "destroyOffline");
                }
                this.f25573c = false;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023 A[Catch:{ Throwable -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e A[Catch:{ Throwable -> 0x003d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(com.loc.bq r4) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x003d }
            r1.<init>()     // Catch:{ Throwable -> 0x003d }
            if (r4 == 0) goto L_0x0045
            com.loc.bp r2 = r4.a()     // Catch:{ Throwable -> 0x003d }
            boolean r3 = r4.o     // Catch:{ Throwable -> 0x003d }
            if (r3 != 0) goto L_0x0020
            java.util.ArrayList<com.loc.bp> r4 = r4.f25566d     // Catch:{ Throwable -> 0x003d }
            int r3 = r4.size()     // Catch:{ Throwable -> 0x003d }
            if (r3 <= 0) goto L_0x0020
            r3 = 0
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Throwable -> 0x003d }
            com.loc.bp r4 = (com.loc.bp) r4     // Catch:{ Throwable -> 0x003d }
            goto L_0x0021
        L_0x0020:
            r4 = r0
        L_0x0021:
            if (r2 == 0) goto L_0x002c
            java.lang.String r3 = "mainCgi"
            org.json.JSONObject r2 = r2.a()     // Catch:{ Throwable -> 0x003d }
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x003d }
        L_0x002c:
            if (r4 == 0) goto L_0x0037
            java.lang.String r2 = "mainCgi2"
            org.json.JSONObject r4 = r4.a()     // Catch:{ Throwable -> 0x003d }
            r1.put(r2, r4)     // Catch:{ Throwable -> 0x003d }
        L_0x0037:
            java.lang.String r4 = r1.toString()     // Catch:{ Throwable -> 0x003d }
            r0 = r4
            goto L_0x0045
        L_0x003d:
            r4 = move-exception
            java.lang.String r1 = "APSCoManager"
            java.lang.String r2 = "buildCgiJsonStr"
            com.loc.ce.a(r4, r1, r2)
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.br.a(com.loc.bq):java.lang.String");
    }
}
