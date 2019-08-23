package com.amap.api.mapcore2d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;

@SuppressLint({"NewApi"})
public final class gb {
    public static String K;
    public String A;
    public String B;
    public ArrayList<fv> C = new ArrayList<>();
    public String D = null;
    public String E = null;
    public ArrayList<ScanResult> F = new ArrayList<>();
    public ArrayList<ft> G = new ArrayList<>();
    public String H = null;
    public String I = null;
    public byte[] J = null;
    public String L = null;
    private byte[] M = null;
    private int N = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f6214a = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;

    /* renamed from: b  reason: collision with root package name */
    public short f6215b;

    /* renamed from: c  reason: collision with root package name */
    public String f6216c;

    /* renamed from: d  reason: collision with root package name */
    public String f6217d;

    /* renamed from: e  reason: collision with root package name */
    public String f6218e;

    /* renamed from: f  reason: collision with root package name */
    public String f6219f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public int z;

    private String a(String str, int i2) {
        String[] split = this.B.split("\\*")[i2].split(",");
        if (str.equals("lac")) {
            return split[0];
        }
        if (str.equals("cellid")) {
            return split[1];
        }
        if (str.equals("signal")) {
            return split[2];
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[Catch:{ Throwable -> 0x0010 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r7.split(r0)
            r1 = 6
            byte[] r2 = new byte[r1]
            r3 = 0
            if (r0 == 0) goto L_0x0012
            int r4 = r0.length     // Catch:{ Throwable -> 0x0010 }
            if (r4 == r1) goto L_0x001e
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            goto L_0x0041
        L_0x0012:
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x0010 }
            r4 = 0
        L_0x0015:
            if (r4 >= r1) goto L_0x001e
            java.lang.String r5 = "0"
            r0[r4] = r5     // Catch:{ Throwable -> 0x0010 }
            int r4 = r4 + 1
            goto L_0x0015
        L_0x001e:
            r1 = 0
        L_0x001f:
            int r4 = r0.length     // Catch:{ Throwable -> 0x0010 }
            if (r1 >= r4) goto L_0x0056
            r4 = r0[r1]     // Catch:{ Throwable -> 0x0010 }
            int r4 = r4.length()     // Catch:{ Throwable -> 0x0010 }
            r5 = 2
            if (r4 <= r5) goto L_0x0033
            r4 = r0[r1]     // Catch:{ Throwable -> 0x0010 }
            java.lang.String r4 = r4.substring(r3, r5)     // Catch:{ Throwable -> 0x0010 }
            r0[r1] = r4     // Catch:{ Throwable -> 0x0010 }
        L_0x0033:
            r4 = r0[r1]     // Catch:{ Throwable -> 0x0010 }
            r5 = 16
            int r4 = java.lang.Integer.parseInt(r4, r5)     // Catch:{ Throwable -> 0x0010 }
            byte r4 = (byte) r4     // Catch:{ Throwable -> 0x0010 }
            r2[r1] = r4     // Catch:{ Throwable -> 0x0010 }
            int r1 = r1 + 1
            goto L_0x001f
        L_0x0041:
            java.lang.String r1 = "Req"
            java.lang.String r2 = "getMacBa "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r2.concat(r7)
            com.amap.api.mapcore2d.gc.a(r0, r1, r7)
            java.lang.String r7 = "00:00:00:00:00:00"
            byte[] r2 = r6.a(r7)
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.gb.a(java.lang.String):byte[]");
    }

    private String b(String str) {
        String str2 = this.A;
        if (!str2.contains(str + ">")) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        String str3 = this.A;
        int indexOf = str3.indexOf(str + ">");
        return this.A.substring(indexOf + str.length() + 1, this.A.indexOf("</".concat(String.valueOf(str))));
    }

    private void b() {
        if (TextUtils.isEmpty(this.f6214a)) {
            this.f6214a = "";
        }
        if (TextUtils.isEmpty(this.f6216c)) {
            this.f6216c = "";
        }
        if (TextUtils.isEmpty(this.f6217d)) {
            this.f6217d = "";
        }
        if (TextUtils.isEmpty(this.f6218e)) {
            this.f6218e = "";
        }
        if (TextUtils.isEmpty(this.f6219f)) {
            this.f6219f = "";
        }
        if (TextUtils.isEmpty(this.g)) {
            this.g = "";
        }
        if (TextUtils.isEmpty(this.h)) {
            this.h = "";
        }
        if (TextUtils.isEmpty(this.i)) {
            this.i = "";
        }
        if (TextUtils.isEmpty(this.j) || (!this.j.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE) && !this.j.equals(PushConstants.PUSH_TYPE_UPLOAD_LOG))) {
            this.j = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (TextUtils.isEmpty(this.k) || (!this.k.equals(PushConstants.PUSH_TYPE_NOTIFY) && !this.k.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE))) {
            this.k = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (TextUtils.isEmpty(this.l)) {
            this.l = "";
        }
        if (TextUtils.isEmpty(this.m)) {
            this.m = "";
        }
        if (TextUtils.isEmpty(this.n)) {
            this.n = "";
        }
        if (TextUtils.isEmpty(this.o)) {
            this.o = "";
        }
        if (TextUtils.isEmpty(this.p)) {
            this.p = "";
        }
        if (TextUtils.isEmpty(this.q)) {
            this.q = "";
        }
        if (TextUtils.isEmpty(this.r)) {
            this.r = "";
        }
        if (TextUtils.isEmpty(this.s)) {
            this.s = "";
        }
        if (TextUtils.isEmpty(this.t)) {
            this.t = "";
        }
        if (TextUtils.isEmpty(this.u)) {
            this.u = "";
        }
        if (TextUtils.isEmpty(this.v)) {
            this.v = "";
        }
        if (TextUtils.isEmpty(this.w)) {
            this.w = "";
        }
        if (TextUtils.isEmpty(this.x)) {
            this.x = "";
        }
        if (TextUtils.isEmpty(this.y) || (!this.y.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE) && !this.y.equals(PushConstants.PUSH_TYPE_UPLOAD_LOG))) {
            this.y = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (!fw.a(this.z)) {
            this.z = 0;
        }
        if (TextUtils.isEmpty(this.A)) {
            this.A = "";
        }
        if (TextUtils.isEmpty(this.B)) {
            this.B = "";
        }
        if (TextUtils.isEmpty(this.E)) {
            this.E = "";
        }
        if (TextUtils.isEmpty(this.H)) {
            this.H = "";
        }
        if (TextUtils.isEmpty(this.I)) {
            this.I = "";
        }
        if (TextUtils.isEmpty(K)) {
            K = "";
        }
        if (this.J == null) {
            this.J = new byte[0];
        }
    }

    public final void a(Context context, boolean z2, boolean z3, fw fwVar, fx fxVar, ConnectivityManager connectivityManager, String str, String str2) {
        String str3;
        NetworkInfo networkInfo;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        String str9 = PushConstants.PUSH_TYPE_NOTIFY;
        String f2 = cp.f(context);
        int f3 = gf.f();
        this.L = str2;
        String str10 = "api_serverSDK_130905";
        String str11 = "S128DF1572465B890OE3F7A13167KLEI";
        if (!z3) {
            str10 = "UC_nlp_20131029";
            str11 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int c2 = fwVar.c();
        String str12 = "";
        int d2 = fwVar.d();
        TelephonyManager e2 = fwVar.e();
        String str13 = "";
        ArrayList<fv> a2 = fw.a();
        String str14 = "";
        ArrayList<fv> b2 = fw.b();
        int i3 = f3;
        ArrayList<ScanResult> a3 = fxVar.a();
        String str15 = f2;
        if (d2 == 2) {
            str9 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        String str16 = str9;
        if (e2 != null) {
            if (TextUtils.isEmpty(gc.f6222c)) {
                try {
                    gc.f6222c = ct.q(context);
                } catch (Throwable th) {
                    str3 = PushConstants.PUSH_TYPE_NOTIFY;
                    gc.a(th, "APS", "getApsReq part4");
                }
            }
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
            if (TextUtils.isEmpty(gc.f6222c)) {
                gc.f6222c = "888888888888888";
            }
            if (TextUtils.isEmpty(gc.f6223d)) {
                try {
                    gc.f6223d = e2.getSubscriberId();
                } catch (Throwable th2) {
                    gc.a(th2, "APS", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(gc.f6223d)) {
                gc.f6223d = "888888888888888";
            }
        } else {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th3) {
            gc.a(th3, "APS", "getApsReq part");
            networkInfo = null;
        }
        WifiInfo f4 = fxVar.f();
        boolean a4 = fx.a(f4);
        int a5 = gf.a(networkInfo);
        String str17 = PushConstants.PUSH_TYPE_NOTIFY;
        if (a5 != -1) {
            str5 = gf.b(e2);
            str4 = (!a4 || !fxVar.e()) ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_UPLOAD_LOG;
        } else {
            str5 = str12;
            str4 = str13;
        }
        String str18 = str4;
        if (!a2.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            switch (d2) {
                case 1:
                    str7 = str5;
                    fv fvVar = a2.get(0);
                    str6 = PushConstants.PUSH_TYPE_NOTIFY;
                    sb3.delete(0, sb3.length());
                    sb3.append("<mcc>");
                    sb3.append(fvVar.f6184a);
                    sb3.append("</mcc>");
                    sb3.append("<mnc>");
                    sb3.append(fvVar.f6185b);
                    sb3.append("</mnc>");
                    sb3.append("<lac>");
                    sb3.append(fvVar.f6186c);
                    sb3.append("</lac>");
                    sb3.append("<cellid>");
                    sb3.append(fvVar.f6187d);
                    sb3.append("</cellid>");
                    sb3.append("<signal>");
                    sb3.append(fvVar.j);
                    sb3.append("</signal>");
                    str8 = sb3.toString();
                    int i4 = 1;
                    while (i4 < a2.size()) {
                        fv fvVar2 = a2.get(i4);
                        String str19 = str8;
                        sb.append(fvVar2.f6186c);
                        sb.append(",");
                        sb.append(fvVar2.f6187d);
                        sb.append(",");
                        sb.append(fvVar2.j);
                        if (i4 < a2.size() - 1) {
                            sb.append("*");
                        }
                        i4++;
                        str8 = str19;
                    }
                    String str20 = str8;
                    break;
                case 2:
                    fv fvVar3 = a2.get(0);
                    str7 = str5;
                    sb3.delete(0, sb3.length());
                    sb3.append("<mcc>");
                    sb3.append(fvVar3.f6184a);
                    sb3.append("</mcc>");
                    sb3.append("<sid>");
                    sb3.append(fvVar3.g);
                    sb3.append("</sid>");
                    sb3.append("<nid>");
                    sb3.append(fvVar3.h);
                    sb3.append("</nid>");
                    sb3.append("<bid>");
                    sb3.append(fvVar3.i);
                    sb3.append("</bid>");
                    if (fvVar3.f6189f > 0 && fvVar3.f6188e > 0) {
                        sb3.append("<lon>");
                        sb3.append(fvVar3.f6189f);
                        sb3.append("</lon>");
                        sb3.append("<lat>");
                        sb3.append(fvVar3.f6188e);
                        sb3.append("</lat>");
                    }
                    sb3.append("<signal>");
                    sb3.append(fvVar3.j);
                    sb3.append("</signal>");
                    str8 = sb3.toString();
                    str6 = PushConstants.PUSH_TYPE_NOTIFY;
                    break;
                default:
                    str7 = str5;
                    str6 = PushConstants.PUSH_TYPE_NOTIFY;
                    str8 = str14;
                    break;
            }
            sb3.delete(0, sb3.length());
        } else {
            str7 = str5;
            str6 = PushConstants.PUSH_TYPE_NOTIFY;
            str8 = str14;
        }
        if ((c2 & 4) != 4 || b2.isEmpty()) {
            this.C.clear();
        } else {
            this.C.clear();
            this.C.addAll(b2);
        }
        if (fxVar.e()) {
            if (a4) {
                sb2.append(fxVar.f().getBSSID());
                sb2.append(",");
                int rssi = fxVar.f().getRssi();
                if (rssi < -128 || rssi > 127) {
                    rssi = 0;
                }
                sb2.append(rssi);
                sb2.append(",");
                String ssid = f4.getSSID();
                try {
                    i2 = f4.getSSID().getBytes("UTF-8").length;
                } catch (Exception unused) {
                    i2 = 32;
                }
                if (i2 >= 32) {
                    ssid = "unkwn";
                }
                sb2.append(ssid.replace("*", ClassUtils.PACKAGE_SEPARATOR));
            }
            if (!(a3 == null || this.F == null)) {
                this.F.clear();
                this.F.addAll(a3);
            }
        } else {
            fxVar.b();
            if (this.F != null) {
                this.F.clear();
            }
        }
        this.f6215b = !z2 ? (short) 2 : 0;
        this.f6216c = str10;
        this.f6217d = str11;
        this.f6219f = gf.d();
        this.g = "android" + gf.e();
        this.h = gf.b(context);
        this.i = str16;
        this.j = PushConstants.PUSH_TYPE_NOTIFY;
        this.k = PushConstants.PUSH_TYPE_NOTIFY;
        this.l = str6;
        this.m = str17;
        this.n = str3;
        this.o = str15;
        this.p = gc.f6222c;
        this.q = gc.f6223d;
        this.s = String.valueOf(i3);
        this.t = str;
        this.v = "3.4.0";
        this.w = null;
        this.u = "";
        this.x = str7;
        this.y = str18;
        this.z = c2;
        this.A = str8;
        this.B = sb.toString();
        this.D = fwVar.h();
        this.H = fx.i();
        this.E = sb2.toString();
        try {
            if (TextUtils.isEmpty(K)) {
                K = ct.f(context);
            }
        } catch (Throwable unused2) {
        }
        sb.delete(0, sb.length());
        sb2.delete(0, sb2.length());
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0610 A[Catch:{ Throwable -> 0x0626 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0613 A[Catch:{ Throwable -> 0x0626 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0618 A[Catch:{ Throwable -> 0x0626 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0639 A[Catch:{ Throwable -> 0x065c }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x064b A[SYNTHETIC, Splitter:B:240:0x064b] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x067c  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0733  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01f2 A[Catch:{ Throwable -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f5 A[Catch:{ Throwable -> 0x020a }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a() {
        /*
            r18 = this;
            r1 = r18
            r18.b()
            r2 = 2
            byte[] r3 = new byte[r2]
            r4 = 4
            byte[] r5 = new byte[r4]
            byte[] r0 = r1.J
            r6 = 4096(0x1000, float:5.74E-42)
            r7 = 1
            if (r0 == 0) goto L_0x0017
            byte[] r0 = r1.J
            int r0 = r0.length
            int r0 = r0 + r7
            int r6 = r6 + r0
        L_0x0017:
            byte[] r0 = r1.M
            if (r0 == 0) goto L_0x0023
            int r0 = r1.N
            if (r6 <= r0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            byte[] r0 = r1.M
            goto L_0x0029
        L_0x0023:
            byte[] r0 = new byte[r6]
            r1.M = r0
            r1.N = r6
        L_0x0029:
            r6 = r0
            java.lang.String r0 = r1.f6214a
            byte r0 = java.lang.Byte.parseByte(r0)
            r8 = 0
            r6[r8] = r0
            short r0 = r1.f6215b
            r9 = 0
            byte[] r0 = com.amap.api.mapcore2d.gf.a((int) r0, (byte[]) r9)
            int r10 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r7, r10)
            int r0 = r0.length
            int r10 = r0 + 1
            java.lang.String r0 = r1.f6216c     // Catch:{ Throwable -> 0x0056 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0056 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0056 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0056 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x0056 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0056 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x0056 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0056 }
            int r10 = r10 + r0
            goto L_0x0061
        L_0x0056:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot2"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0061:
            java.lang.String r0 = r1.f6217d     // Catch:{ Throwable -> 0x0076 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0076 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0076 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0076 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x0076 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0076 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x0076 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0076 }
            int r10 = r10 + r0
            goto L_0x0081
        L_0x0076:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot21"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0081:
            java.lang.String r0 = r1.o     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0096 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0096 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0096 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x0096 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0096 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x0096 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0096 }
            int r10 = r10 + r0
            goto L_0x00a1
        L_0x0096:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot22"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x00a1:
            java.lang.String r0 = r1.f6218e     // Catch:{ Throwable -> 0x00b6 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x00b6 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x00b6 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x00b6 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x00b6 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x00b6 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x00b6 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x00b6 }
            int r10 = r10 + r0
            goto L_0x00c1
        L_0x00b6:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot23"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x00c1:
            java.lang.String r0 = r1.f6219f     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x00d6 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x00d6 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x00d6 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x00d6 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x00d6 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x00d6 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x00d6 }
            int r10 = r10 + r0
            goto L_0x00e1
        L_0x00d6:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot24"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x00e1:
            java.lang.String r0 = r1.g     // Catch:{ Throwable -> 0x00f6 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x00f6 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x00f6 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x00f6 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x00f6 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x00f6 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x00f6 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x00f6 }
            int r10 = r10 + r0
            goto L_0x0101
        L_0x00f6:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot25"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0101:
            java.lang.String r0 = r1.u     // Catch:{ Throwable -> 0x0116 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0116 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0116 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0116 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x0116 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0116 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x0116 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0116 }
            int r10 = r10 + r0
            goto L_0x0121
        L_0x0116:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot26"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0121:
            java.lang.String r0 = r1.h     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0136 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0136 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0136 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x0136 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0136 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x0136 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0136 }
            int r10 = r10 + r0
            goto L_0x0141
        L_0x0136:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot27"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0141:
            java.lang.String r0 = r1.p     // Catch:{ Throwable -> 0x0156 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0156 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0156 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0156 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x0156 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0156 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x0156 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0156 }
            int r10 = r10 + r0
            goto L_0x0161
        L_0x0156:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot28"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0161:
            java.lang.String r0 = r1.q     // Catch:{ Throwable -> 0x0176 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0176 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0176 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0176 }
            r6[r10] = r11     // Catch:{ Throwable -> 0x0176 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0176 }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x0176 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0176 }
            int r10 = r10 + r0
            goto L_0x0181
        L_0x0176:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot29"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0181:
            java.lang.String r0 = r1.t     // Catch:{ Throwable -> 0x019f }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x019f }
            if (r0 == 0) goto L_0x018c
            r6[r10] = r8     // Catch:{ Throwable -> 0x019f }
            goto L_0x01a9
        L_0x018c:
            java.lang.String r0 = r1.t     // Catch:{ Throwable -> 0x019f }
            byte[] r0 = r1.a(r0)     // Catch:{ Throwable -> 0x019f }
            int r11 = r0.length     // Catch:{ Throwable -> 0x019f }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x019f }
            r6[r10] = r11     // Catch:{ Throwable -> 0x019f }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x019f }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x019f }
            int r0 = r0.length     // Catch:{ Throwable -> 0x019f }
            int r10 = r10 + r0
            goto L_0x01aa
        L_0x019f:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot219"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
        L_0x01a9:
            int r10 = r10 + r7
        L_0x01aa:
            java.lang.String r0 = r1.v     // Catch:{ Throwable -> 0x01bf }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x01bf }
            int r11 = r0.length     // Catch:{ Throwable -> 0x01bf }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x01bf }
            r6[r10] = r11     // Catch:{ Throwable -> 0x01bf }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x01bf }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x01bf }
            int r0 = r0.length     // Catch:{ Throwable -> 0x01bf }
            int r10 = r10 + r0
            goto L_0x01ca
        L_0x01bf:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot211"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x01ca:
            java.lang.String r0 = r1.w     // Catch:{ Throwable -> 0x01df }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x01df }
            int r11 = r0.length     // Catch:{ Throwable -> 0x01df }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x01df }
            r6[r10] = r11     // Catch:{ Throwable -> 0x01df }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x01df }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x01df }
            int r0 = r0.length     // Catch:{ Throwable -> 0x01df }
            int r10 = r10 + r0
            goto L_0x01ea
        L_0x01df:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot212"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x01ea:
            java.lang.String r0 = K     // Catch:{ Throwable -> 0x020a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x020a }
            if (r0 == 0) goto L_0x01f5
            r6[r10] = r8     // Catch:{ Throwable -> 0x020a }
            goto L_0x0214
        L_0x01f5:
            java.lang.String r0 = K     // Catch:{ Throwable -> 0x020a }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x020a }
            int r11 = r0.length     // Catch:{ Throwable -> 0x020a }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x020a }
            r6[r10] = r11     // Catch:{ Throwable -> 0x020a }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x020a }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x020a }
            int r0 = r0.length     // Catch:{ Throwable -> 0x020a }
            int r10 = r10 + r0
            goto L_0x0215
        L_0x020a:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot212"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
        L_0x0214:
            int r10 = r10 + r7
        L_0x0215:
            java.lang.String r0 = r1.x     // Catch:{ Throwable -> 0x022a }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x022a }
            int r11 = r0.length     // Catch:{ Throwable -> 0x022a }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x022a }
            r6[r10] = r11     // Catch:{ Throwable -> 0x022a }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x022a }
            java.lang.System.arraycopy(r0, r8, r6, r10, r11)     // Catch:{ Throwable -> 0x022a }
            int r0 = r0.length     // Catch:{ Throwable -> 0x022a }
            int r10 = r10 + r0
            goto L_0x0235
        L_0x022a:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot213"
            com.amap.api.mapcore2d.gc.a(r0, r11, r12)
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x0235:
            java.lang.String r0 = r1.y
            byte r0 = java.lang.Byte.parseByte(r0)
            r6[r10] = r0
            int r10 = r10 + r7
            java.lang.String r0 = r1.j
            byte r0 = java.lang.Byte.parseByte(r0)
            r6[r10] = r0
            int r10 = r10 + r7
            int r0 = r1.z
            r11 = 3
            r0 = r0 & r11
            int r12 = r1.z
            byte r12 = (byte) r12
            r6[r10] = r12
            int r10 = r10 + r7
            r12 = -128(0xffffffffffffff80, float:NaN)
            r13 = 127(0x7f, float:1.78E-43)
            if (r0 != r7) goto L_0x030f
            java.lang.String r0 = "mcc"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.b((java.lang.String) r0)
            int r14 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r14)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "mnc"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.b((java.lang.String) r0)
            int r14 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r14)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "lac"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.b((java.lang.String) r0)
            int r14 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r14)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "cellid"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.c((java.lang.String) r0)
            int r14 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r14)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "signal"
            java.lang.String r0 = r1.b(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 <= r13) goto L_0x02a5
        L_0x02a3:
            r0 = 0
            goto L_0x02a8
        L_0x02a5:
            if (r0 >= r12) goto L_0x02a8
            goto L_0x02a3
        L_0x02a8:
            byte r0 = (byte) r0
            r6[r10] = r0
            int r10 = r10 + r7
            byte[] r0 = com.amap.api.mapcore2d.gf.a((int) r8, (byte[]) r3)
            int r14 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r14)
            int r10 = r10 + r2
            java.lang.String r0 = r1.B
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02c2
            r6[r10] = r8
        L_0x02bf:
            int r10 = r10 + r7
            goto L_0x0393
        L_0x02c2:
            java.lang.String r0 = r1.B
            java.lang.String r14 = "\\*"
            java.lang.String[] r0 = r0.split(r14)
            int r0 = r0.length
            byte r14 = (byte) r0
            r6[r10] = r14
            int r10 = r10 + r7
            r14 = r10
            r10 = 0
        L_0x02d1:
            if (r10 >= r0) goto L_0x030c
            java.lang.String r15 = "lac"
            java.lang.String r15 = r1.a(r15, r10)
            byte[] r15 = com.amap.api.mapcore2d.gf.b((java.lang.String) r15)
            int r9 = r15.length
            java.lang.System.arraycopy(r15, r8, r6, r14, r9)
            int r9 = r15.length
            int r14 = r14 + r9
            java.lang.String r9 = "cellid"
            java.lang.String r9 = r1.a(r9, r10)
            byte[] r9 = com.amap.api.mapcore2d.gf.c((java.lang.String) r9)
            int r15 = r9.length
            java.lang.System.arraycopy(r9, r8, r6, r14, r15)
            int r9 = r9.length
            int r14 = r14 + r9
            java.lang.String r9 = "signal"
            java.lang.String r9 = r1.a(r9, r10)
            int r9 = java.lang.Integer.parseInt(r9)
            if (r9 <= r13) goto L_0x0301
        L_0x02ff:
            r9 = 0
            goto L_0x0304
        L_0x0301:
            if (r9 >= r12) goto L_0x0304
            goto L_0x02ff
        L_0x0304:
            byte r9 = (byte) r9
            r6[r14] = r9
            int r14 = r14 + r7
            int r10 = r10 + 1
            r9 = 0
            goto L_0x02d1
        L_0x030c:
            r10 = r14
            goto L_0x0393
        L_0x030f:
            if (r0 != r2) goto L_0x0393
            java.lang.String r0 = "mcc"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.b((java.lang.String) r0)
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "sid"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.b((java.lang.String) r0)
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "nid"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.b((java.lang.String) r0)
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "bid"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.b((java.lang.String) r0)
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "lon"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.c((java.lang.String) r0)
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "lat"
            java.lang.String r0 = r1.b(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.c((java.lang.String) r0)
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)
            int r0 = r0.length
            int r10 = r10 + r0
            java.lang.String r0 = "signal"
            java.lang.String r0 = r1.b(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 <= r13) goto L_0x037f
        L_0x037d:
            r0 = 0
            goto L_0x0382
        L_0x037f:
            if (r0 >= r12) goto L_0x0382
            goto L_0x037d
        L_0x0382:
            byte r0 = (byte) r0
            r6[r10] = r0
            int r10 = r10 + r7
            byte[] r0 = com.amap.api.mapcore2d.gf.a((int) r8, (byte[]) r3)
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)
            int r10 = r10 + r2
            r6[r10] = r8
            goto L_0x02bf
        L_0x0393:
            java.lang.String r0 = r1.D
            if (r0 == 0) goto L_0x03b5
            int r9 = r1.z
            r14 = 8
            r9 = r9 & r14
            if (r9 != r14) goto L_0x03b5
            java.lang.String r9 = "GBK"
            byte[] r0 = r0.getBytes(r9)     // Catch:{ Exception -> 0x03b5 }
            int r9 = r0.length     // Catch:{ Exception -> 0x03b5 }
            r14 = 60
            int r9 = java.lang.Math.min(r9, r14)     // Catch:{ Exception -> 0x03b5 }
            byte r14 = (byte) r9     // Catch:{ Exception -> 0x03b5 }
            r6[r10] = r14     // Catch:{ Exception -> 0x03b5 }
            int r10 = r10 + 1
            java.lang.System.arraycopy(r0, r8, r6, r10, r9)     // Catch:{ Exception -> 0x03b5 }
            int r10 = r10 + r9
            goto L_0x03b8
        L_0x03b5:
            r6[r10] = r8
            int r10 = r10 + r7
        L_0x03b8:
            java.util.ArrayList<com.amap.api.mapcore2d.fv> r0 = r1.C
            int r9 = r0.size()
            int r14 = r1.z
            r14 = r14 & r4
            if (r14 != r4) goto L_0x04ca
            if (r9 <= 0) goto L_0x04ca
            java.lang.Object r14 = r0.get(r8)
            com.amap.api.mapcore2d.fv r14 = (com.amap.api.mapcore2d.fv) r14
            boolean r14 = r14.o
            if (r14 != 0) goto L_0x03d1
            int r9 = r9 + -1
        L_0x03d1:
            byte r14 = (byte) r9
            r6[r10] = r14
            int r10 = r10 + r7
            r14 = r10
            r10 = 0
        L_0x03d7:
            if (r10 >= r9) goto L_0x04ce
            java.lang.Object r15 = r0.get(r10)
            com.amap.api.mapcore2d.fv r15 = (com.amap.api.mapcore2d.fv) r15
            boolean r12 = r15.o
            if (r12 == 0) goto L_0x04c3
            int r12 = r15.k
            r16 = 99
            if (r12 == r7) goto L_0x0469
            int r12 = r15.k
            if (r12 == r11) goto L_0x0469
            int r12 = r15.k
            if (r12 != r4) goto L_0x03f3
            goto L_0x0469
        L_0x03f3:
            int r12 = r15.k
            if (r12 != r2) goto L_0x04c3
            int r12 = r15.k
            byte r12 = (byte) r12
            boolean r11 = r15.n
            if (r11 == 0) goto L_0x0401
            r11 = r12 | 8
            byte r12 = (byte) r11
        L_0x0401:
            r6[r14] = r12
            int r14 = r14 + 1
            int r11 = r15.f6184a
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.g
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.h
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.i
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.f6189f
            byte[] r11 = com.amap.api.mapcore2d.gf.b((int) r11, (byte[]) r5)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.f6188e
            byte[] r11 = com.amap.api.mapcore2d.gf.b((int) r11, (byte[]) r5)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.j
            if (r11 <= r13) goto L_0x0454
        L_0x0451:
            r11 = 99
            goto L_0x0459
        L_0x0454:
            r12 = -128(0xffffffffffffff80, float:NaN)
            if (r11 >= r12) goto L_0x0459
            goto L_0x0451
        L_0x0459:
            byte r11 = (byte) r11
            r6[r14] = r11
            int r14 = r14 + r7
            short r11 = r15.l
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            goto L_0x04c2
        L_0x0469:
            int r11 = r15.k
            byte r11 = (byte) r11
            boolean r12 = r15.n
            if (r12 == 0) goto L_0x0473
            r11 = r11 | 8
            byte r11 = (byte) r11
        L_0x0473:
            r6[r14] = r11
            int r14 = r14 + 1
            int r11 = r15.f6184a
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.f6185b
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.f6186c
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.f6187d
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r5)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
            int r14 = r14 + r11
            int r11 = r15.j
            if (r11 <= r13) goto L_0x04ae
        L_0x04ab:
            r11 = 99
            goto L_0x04b3
        L_0x04ae:
            r12 = -128(0xffffffffffffff80, float:NaN)
            if (r11 >= r12) goto L_0x04b3
            goto L_0x04ab
        L_0x04b3:
            byte r11 = (byte) r11
            r6[r14] = r11
            int r14 = r14 + r7
            short r11 = r15.l
            byte[] r11 = com.amap.api.mapcore2d.gf.a((int) r11, (byte[]) r3)
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r8, r6, r14, r12)
            int r11 = r11.length
        L_0x04c2:
            int r14 = r14 + r11
        L_0x04c3:
            int r10 = r10 + 1
            r11 = 3
            r12 = -128(0xffffffffffffff80, float:NaN)
            goto L_0x03d7
        L_0x04ca:
            r6[r10] = r8
            int r14 = r10 + 1
        L_0x04ce:
            java.lang.String r0 = r1.E
            int r0 = r0.length()
            if (r0 != 0) goto L_0x04db
            r6[r14] = r8
        L_0x04d8:
            int r14 = r14 + r7
            goto L_0x054d
        L_0x04db:
            r6[r14] = r7
            int r14 = r14 + r7
            java.lang.String r0 = r1.E     // Catch:{ Throwable -> 0x052d }
            java.lang.String r5 = ","
            java.lang.String[] r5 = r0.split(r5)     // Catch:{ Throwable -> 0x052d }
            r0 = r5[r8]     // Catch:{ Throwable -> 0x052d }
            byte[] r0 = r1.a(r0)     // Catch:{ Throwable -> 0x052d }
            int r9 = r0.length     // Catch:{ Throwable -> 0x052d }
            java.lang.System.arraycopy(r0, r8, r6, r14, r9)     // Catch:{ Throwable -> 0x052d }
            int r0 = r0.length     // Catch:{ Throwable -> 0x052d }
            int r14 = r14 + r0
            r0 = r5[r2]     // Catch:{ Throwable -> 0x0507 }
            java.lang.String r9 = "GBK"
            byte[] r0 = r0.getBytes(r9)     // Catch:{ Throwable -> 0x0507 }
            int r9 = r0.length     // Catch:{ Throwable -> 0x0507 }
            byte r9 = (byte) r9     // Catch:{ Throwable -> 0x0507 }
            r6[r14] = r9     // Catch:{ Throwable -> 0x0507 }
            int r14 = r14 + 1
            int r9 = r0.length     // Catch:{ Throwable -> 0x0507 }
            java.lang.System.arraycopy(r0, r8, r6, r14, r9)     // Catch:{ Throwable -> 0x0507 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0507 }
            int r14 = r14 + r0
            goto L_0x0513
        L_0x0507:
            r0 = move-exception
            java.lang.String r9 = "Req"
            java.lang.String r10 = "buildV4Dot214"
            com.amap.api.mapcore2d.gc.a(r0, r9, r10)     // Catch:{ Throwable -> 0x052d }
            r6[r14] = r8     // Catch:{ Throwable -> 0x052d }
            int r14 = r14 + 1
        L_0x0513:
            r0 = r5[r7]     // Catch:{ Throwable -> 0x052d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x052d }
            if (r0 <= r13) goto L_0x051d
        L_0x051b:
            r0 = 0
            goto L_0x0522
        L_0x051d:
            r5 = -128(0xffffffffffffff80, float:NaN)
            if (r0 >= r5) goto L_0x0522
            goto L_0x051b
        L_0x0522:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x052d }
            byte r0 = java.lang.Byte.parseByte(r0)     // Catch:{ Throwable -> 0x052d }
            r6[r14] = r0     // Catch:{ Throwable -> 0x052d }
            goto L_0x04d8
        L_0x052d:
            r0 = move-exception
            java.lang.String r5 = "Req"
            java.lang.String r9 = "buildV4Dot216"
            com.amap.api.mapcore2d.gc.a(r0, r5, r9)
            java.lang.String r0 = "00:00:00:00:00:00"
            byte[] r0 = r1.a(r0)
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r14, r5)
            int r0 = r0.length
            int r14 = r14 + r0
            r6[r14] = r8
            int r14 = r14 + r7
            java.lang.String r0 = "0"
            byte r0 = java.lang.Byte.parseByte(r0)
            r6[r14] = r0
            goto L_0x04d8
        L_0x054d:
            java.util.ArrayList<android.net.wifi.ScanResult> r0 = r1.F
            int r5 = r0.size()
            r9 = 25
            int r5 = java.lang.Math.min(r5, r9)
            if (r5 != 0) goto L_0x0561
            r6[r14] = r8
            int r14 = r14 + r7
            r7 = 0
            goto L_0x0601
        L_0x0561:
            byte r9 = (byte) r5
            r6[r14] = r9
            int r14 = r14 + r7
            int r9 = com.amap.api.mapcore2d.gf.c()
            r10 = 17
            if (r9 < r10) goto L_0x056f
            r9 = 1
            goto L_0x0570
        L_0x056f:
            r9 = 0
        L_0x0570:
            r10 = 0
            if (r9 == 0) goto L_0x057c
            long r10 = com.amap.api.mapcore2d.gf.b()
            r16 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r16
        L_0x057c:
            r12 = 0
        L_0x057d:
            if (r12 >= r5) goto L_0x05f0
            java.lang.Object r15 = r0.get(r12)
            android.net.wifi.ScanResult r15 = (android.net.wifi.ScanResult) r15
            java.lang.String r4 = r15.BSSID
            byte[] r4 = r1.a(r4)
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r8, r6, r14, r2)
            int r2 = r4.length
            int r14 = r14 + r2
            java.lang.String r2 = r15.SSID     // Catch:{ Exception -> 0x05a6 }
            java.lang.String r4 = "GBK"
            byte[] r2 = r2.getBytes(r4)     // Catch:{ Exception -> 0x05a6 }
            int r4 = r2.length     // Catch:{ Exception -> 0x05a6 }
            byte r4 = (byte) r4     // Catch:{ Exception -> 0x05a6 }
            r6[r14] = r4     // Catch:{ Exception -> 0x05a6 }
            int r14 = r14 + 1
            int r4 = r2.length     // Catch:{ Exception -> 0x05a6 }
            java.lang.System.arraycopy(r2, r8, r6, r14, r4)     // Catch:{ Exception -> 0x05a6 }
            int r2 = r2.length     // Catch:{ Exception -> 0x05a6 }
            int r14 = r14 + r2
            goto L_0x05a9
        L_0x05a6:
            r6[r14] = r8
            int r14 = r14 + r7
        L_0x05a9:
            int r2 = r15.level
            if (r2 <= r13) goto L_0x05af
        L_0x05ad:
            r2 = 0
            goto L_0x05b4
        L_0x05af:
            r4 = -128(0xffffffffffffff80, float:NaN)
            if (r2 >= r4) goto L_0x05b4
            goto L_0x05ad
        L_0x05b4:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            byte r2 = java.lang.Byte.parseByte(r2)
            r6[r14] = r2
            int r14 = r14 + r7
            if (r9 == 0) goto L_0x05d1
            long r7 = r15.timestamp
            long r7 = r10 - r7
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 / r16
            r16 = 1
            long r7 = r7 + r16
            int r8 = (int) r7
            if (r8 >= 0) goto L_0x05d2
        L_0x05d1:
            r8 = 0
        L_0x05d2:
            byte[] r2 = com.amap.api.mapcore2d.gf.a((int) r8, (byte[]) r3)
            int r4 = r2.length
            r7 = 0
            java.lang.System.arraycopy(r2, r7, r6, r14, r4)
            int r2 = r2.length
            int r14 = r14 + r2
            int r2 = r15.frequency
            byte[] r2 = com.amap.api.mapcore2d.gf.a((int) r2, (byte[]) r3)
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r7, r6, r14, r4)
            int r2 = r2.length
            int r14 = r14 + r2
            int r12 = r12 + 1
            r2 = 2
            r4 = 4
            r7 = 1
            r8 = 0
            goto L_0x057d
        L_0x05f0:
            r7 = 0
            java.lang.String r0 = r1.H
            int r0 = java.lang.Integer.parseInt(r0)
            byte[] r0 = com.amap.api.mapcore2d.gf.a((int) r0, (byte[]) r3)
            int r2 = r0.length
            java.lang.System.arraycopy(r0, r7, r6, r14, r2)
            int r0 = r0.length
            int r14 = r14 + r0
        L_0x0601:
            r6[r14] = r7
            r2 = 1
            int r14 = r14 + r2
            java.lang.String r0 = r1.I     // Catch:{ Throwable -> 0x0626 }
            java.lang.String r2 = "GBK"
            byte[] r9 = r0.getBytes(r2)     // Catch:{ Throwable -> 0x0626 }
            int r0 = r9.length     // Catch:{ Throwable -> 0x0626 }
            if (r0 <= r13) goto L_0x0611
            r9 = 0
        L_0x0611:
            if (r9 != 0) goto L_0x0618
            r2 = 0
            r6[r14] = r2     // Catch:{ Throwable -> 0x0626 }
            r2 = 1
            goto L_0x062a
        L_0x0618:
            int r0 = r9.length     // Catch:{ Throwable -> 0x0626 }
            byte r0 = (byte) r0     // Catch:{ Throwable -> 0x0626 }
            r6[r14] = r0     // Catch:{ Throwable -> 0x0626 }
            int r14 = r14 + 1
            int r0 = r9.length     // Catch:{ Throwable -> 0x0626 }
            r2 = 0
            java.lang.System.arraycopy(r9, r2, r6, r14, r0)     // Catch:{ Throwable -> 0x0626 }
            int r0 = r9.length     // Catch:{ Throwable -> 0x0626 }
            int r14 = r14 + r0
            goto L_0x062b
        L_0x0626:
            r2 = 0
            r6[r14] = r2
            r2 = 1
        L_0x062a:
            int r14 = r14 + r2
        L_0x062b:
            r2 = 2
            byte[] r0 = new byte[r2]
            r0 = {0, 0} // fill-array
            java.lang.String r2 = r1.L     // Catch:{ Throwable -> 0x065c }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x065c }
            if (r2 != 0) goto L_0x0643
            java.lang.String r0 = r1.L     // Catch:{ Throwable -> 0x065c }
            int r0 = r0.length()     // Catch:{ Throwable -> 0x065c }
            byte[] r0 = com.amap.api.mapcore2d.gf.a((int) r0, (byte[]) r3)     // Catch:{ Throwable -> 0x065c }
        L_0x0643:
            r4 = 0
            r5 = 2
            java.lang.System.arraycopy(r0, r4, r6, r14, r5)     // Catch:{ Throwable -> 0x065c }
            int r14 = r14 + r5
            if (r2 != 0) goto L_0x065a
            java.lang.String r0 = r1.L     // Catch:{ Throwable -> 0x065a }
            java.lang.String r2 = "GBK"
            byte[] r0 = r0.getBytes(r2)     // Catch:{ Throwable -> 0x065a }
            int r2 = r0.length     // Catch:{ Throwable -> 0x065a }
            r4 = 0
            java.lang.System.arraycopy(r0, r4, r6, r14, r2)     // Catch:{ Throwable -> 0x065a }
            int r0 = r0.length     // Catch:{ Throwable -> 0x065a }
            int r14 = r14 + r0
        L_0x065a:
            r2 = 2
            goto L_0x065e
        L_0x065c:
            r2 = 2
            int r14 = r14 + r2
        L_0x065e:
            java.util.ArrayList<com.amap.api.mapcore2d.ft> r0 = r1.G
            int r4 = r0.size()
            r5 = 65536(0x10000, float:9.18355E-41)
            int r4 = java.lang.Math.min(r4, r5)
            byte[] r5 = new byte[r2]
            r5 = {0, 0} // fill-array
            if (r4 != 0) goto L_0x067c
            r5 = 0
            byte[] r0 = com.amap.api.mapcore2d.gf.a((int) r5, (byte[]) r3)     // Catch:{ Throwable -> 0x0679 }
            java.lang.System.arraycopy(r0, r5, r6, r14, r2)     // Catch:{ Throwable -> 0x0679 }
        L_0x0679:
            int r14 = r14 + r2
            goto L_0x071b
        L_0x067c:
            r5 = 0
            byte[] r3 = com.amap.api.mapcore2d.gf.a((int) r4, (byte[]) r3)     // Catch:{ Throwable -> 0x0684 }
            java.lang.System.arraycopy(r3, r5, r6, r14, r2)     // Catch:{ Throwable -> 0x0684 }
        L_0x0684:
            int r14 = r14 + r2
            r2 = 0
        L_0x0686:
            if (r2 >= r4) goto L_0x071b
            java.lang.Object r3 = r0.get(r2)
            com.amap.api.mapcore2d.ft r3 = (com.amap.api.mapcore2d.ft) r3
            byte[] r5 = r3.f6178c     // Catch:{ Throwable -> 0x0698 }
            int r7 = r5.length     // Catch:{ Throwable -> 0x0698 }
            r8 = 0
            java.lang.System.arraycopy(r5, r8, r6, r14, r7)     // Catch:{ Throwable -> 0x0698 }
            int r5 = r5.length     // Catch:{ Throwable -> 0x0698 }
            int r14 = r14 + r5
            goto L_0x069a
        L_0x0698:
            int r14 = r14 + 6
        L_0x069a:
            java.lang.String r5 = r3.f6176a     // Catch:{ Throwable -> 0x06ae }
            java.lang.String r7 = "GBK"
            byte[] r5 = r5.getBytes(r7)     // Catch:{ Throwable -> 0x06ae }
            int r7 = r5.length     // Catch:{ Throwable -> 0x06ae }
            r8 = 32
            if (r7 <= r8) goto L_0x06a9
        L_0x06a7:
            r7 = 0
            goto L_0x06ab
        L_0x06a9:
            int r8 = r5.length     // Catch:{ Throwable -> 0x06ae }
            goto L_0x06a7
        L_0x06ab:
            java.lang.System.arraycopy(r5, r7, r6, r14, r8)     // Catch:{ Throwable -> 0x06ae }
        L_0x06ae:
            int r14 = r14 + 32
            r5 = 4
            byte[] r7 = new byte[r5]     // Catch:{ Throwable -> 0x06c3 }
            r7 = {0, 0, 0, 0} // fill-array     // Catch:{ Throwable -> 0x06c3 }
            java.lang.String r5 = r3.f6179d     // Catch:{ Throwable -> 0x06c3 }
            java.lang.String r7 = "GBK"
            byte[] r5 = r5.getBytes(r7)     // Catch:{ Throwable -> 0x06c3 }
            int r7 = r5.length     // Catch:{ Throwable -> 0x06c3 }
            r8 = 0
            java.lang.System.arraycopy(r5, r8, r6, r14, r7)     // Catch:{ Throwable -> 0x06c3 }
        L_0x06c3:
            int r14 = r14 + 4
            r5 = 4
            byte[] r7 = new byte[r5]     // Catch:{ Throwable -> 0x06d8 }
            r7 = {0, 0, 0, 0} // fill-array     // Catch:{ Throwable -> 0x06d8 }
            java.lang.String r5 = r3.f6180e     // Catch:{ Throwable -> 0x06d8 }
            java.lang.String r7 = "GBK"
            byte[] r5 = r5.getBytes(r7)     // Catch:{ Throwable -> 0x06d8 }
            int r7 = r5.length     // Catch:{ Throwable -> 0x06d8 }
            r8 = 0
            java.lang.System.arraycopy(r5, r8, r6, r14, r7)     // Catch:{ Throwable -> 0x06d8 }
        L_0x06d8:
            int r14 = r14 + 4
            int r5 = r3.g     // Catch:{ Throwable -> 0x06f3 }
            if (r5 <= r13) goto L_0x06e4
            r5 = 0
            r3.g = r5     // Catch:{ Throwable -> 0x06f3 }
            r8 = -128(0xffffffffffffff80, float:NaN)
            goto L_0x06ed
        L_0x06e4:
            r5 = 0
            int r7 = r3.g     // Catch:{ Throwable -> 0x06f3 }
            r8 = -128(0xffffffffffffff80, float:NaN)
            if (r7 >= r8) goto L_0x06ed
            r3.g = r5     // Catch:{ Throwable -> 0x06f5 }
        L_0x06ed:
            int r5 = r3.g     // Catch:{ Throwable -> 0x06f5 }
            byte r5 = (byte) r5     // Catch:{ Throwable -> 0x06f5 }
            r6[r14] = r5     // Catch:{ Throwable -> 0x06f5 }
            goto L_0x06f5
        L_0x06f3:
            r8 = -128(0xffffffffffffff80, float:NaN)
        L_0x06f5:
            int r14 = r14 + 1
            r5 = 4
            byte[] r7 = new byte[r5]     // Catch:{ Throwable -> 0x0705 }
            int r5 = r3.f6181f     // Catch:{ Throwable -> 0x0705 }
            byte[] r5 = com.amap.api.mapcore2d.gf.b((int) r5, (byte[]) r7)     // Catch:{ Throwable -> 0x0705 }
            int r7 = r5.length     // Catch:{ Throwable -> 0x0705 }
            r9 = 0
            java.lang.System.arraycopy(r5, r9, r6, r14, r7)     // Catch:{ Throwable -> 0x0705 }
        L_0x0705:
            int r14 = r14 + 4
            r5 = 4
            byte[] r7 = new byte[r5]     // Catch:{ Throwable -> 0x0715 }
            int r3 = r3.i     // Catch:{ Throwable -> 0x0715 }
            byte[] r3 = com.amap.api.mapcore2d.gf.b((int) r3, (byte[]) r7)     // Catch:{ Throwable -> 0x0715 }
            int r7 = r3.length     // Catch:{ Throwable -> 0x0715 }
            r9 = 0
            java.lang.System.arraycopy(r3, r9, r6, r14, r7)     // Catch:{ Throwable -> 0x0715 }
        L_0x0715:
            int r14 = r14 + 4
            int r2 = r2 + 1
            goto L_0x0686
        L_0x071b:
            byte[] r0 = r1.J
            if (r0 == 0) goto L_0x0724
            byte[] r0 = r1.J
            int r8 = r0.length
            r2 = 0
            goto L_0x0726
        L_0x0724:
            r2 = 0
            r8 = 0
        L_0x0726:
            byte[] r0 = com.amap.api.mapcore2d.gf.a((int) r8, (byte[]) r2)
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r6, r14, r2)
            int r0 = r0.length
            int r14 = r14 + r0
            if (r8 <= 0) goto L_0x073f
            byte[] r0 = r1.J
            byte[] r2 = r1.J
            int r2 = r2.length
            java.lang.System.arraycopy(r0, r3, r6, r14, r2)
            byte[] r0 = r1.J
            int r0 = r0.length
            int r14 = r14 + r0
        L_0x073f:
            byte[] r0 = new byte[r14]
            java.lang.System.arraycopy(r6, r3, r0, r3, r14)
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32
            r2.<init>()
            r2.update(r0)
            long r4 = r2.getValue()
            byte[] r2 = com.amap.api.mapcore2d.gf.a((long) r4)
            int r4 = r2.length
            int r4 = r4 + r14
            byte[] r4 = new byte[r4]
            java.lang.System.arraycopy(r0, r3, r4, r3, r14)
            int r0 = r2.length
            java.lang.System.arraycopy(r2, r3, r4, r14, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.gb.a():byte[]");
    }
}
