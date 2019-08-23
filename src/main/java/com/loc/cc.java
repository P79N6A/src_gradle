package com.loc;

import android.annotation.SuppressLint;
import android.net.wifi.ScanResult;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;

@SuppressLint({"NewApi"})
public final class cc {
    public static String J;
    public static String L;
    public String A;
    public String B;
    public ArrayList<bp> C = new ArrayList<>();
    public String D = null;
    public String E = null;
    public ArrayList<ScanResult> F = new ArrayList<>();
    public String G = null;
    public String H = null;
    public byte[] I = null;
    public String K = null;
    public String M = null;
    private byte[] N = null;
    private int O = 0;

    /* renamed from: a  reason: collision with root package name */
    public String f25628a = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;

    /* renamed from: b  reason: collision with root package name */
    public short f25629b;

    /* renamed from: c  reason: collision with root package name */
    public String f25630c;

    /* renamed from: d  reason: collision with root package name */
    public String f25631d;

    /* renamed from: e  reason: collision with root package name */
    public String f25632e;

    /* renamed from: f  reason: collision with root package name */
    public String f25633f;
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
        if ("lac".equals(str)) {
            return split[0];
        }
        if ("cellid".equals(str)) {
            return split[1];
        }
        if ("signal".equals(str)) {
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
            com.loc.ce.a(r0, r1, r7)
            java.lang.String r7 = "00:00:00:00:00:00"
            byte[] r2 = r6.a(r7)
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cc.a(java.lang.String):byte[]");
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

    /* JADX WARNING: Removed duplicated region for block: B:195:0x03b1 A[Catch:{ Throwable -> 0x03c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03b4 A[Catch:{ Throwable -> 0x03c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03dc A[Catch:{ Throwable -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03df A[Catch:{ Throwable -> 0x03f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0681  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0706  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x070b  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x07b9 A[Catch:{ Throwable -> 0x07cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07bc A[Catch:{ Throwable -> 0x07cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07bf A[Catch:{ Throwable -> 0x07cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07dd A[Catch:{ Throwable -> 0x07fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07ee A[SYNTHETIC, Splitter:B:364:0x07ee] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x081e  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x082c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] a() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = r1.f25628a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = ""
            r1.f25628a = r0
        L_0x000e:
            java.lang.String r0 = r1.f25630c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = ""
            r1.f25630c = r0
        L_0x001a:
            java.lang.String r0 = r1.f25631d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = ""
            r1.f25631d = r0
        L_0x0026:
            java.lang.String r0 = r1.f25632e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = ""
            r1.f25632e = r0
        L_0x0032:
            java.lang.String r0 = r1.f25633f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = ""
            r1.f25633f = r0
        L_0x003e:
            java.lang.String r0 = r1.g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = ""
            r1.g = r0
        L_0x004a:
            java.lang.String r0 = r1.h
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = ""
            r1.h = r0
        L_0x0056:
            java.lang.String r0 = r1.i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = ""
            r1.i = r0
        L_0x0062:
            java.lang.String r0 = r1.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006f
        L_0x006a:
            java.lang.String r0 = "0"
            r1.j = r0
            goto L_0x0084
        L_0x006f:
            java.lang.String r0 = "0"
            java.lang.String r2 = r1.j
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "2"
            java.lang.String r2 = r1.j
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0084
            goto L_0x006a
        L_0x0084:
            java.lang.String r0 = r1.k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0091
        L_0x008c:
            java.lang.String r0 = "0"
            r1.k = r0
            goto L_0x00a6
        L_0x0091:
            java.lang.String r0 = "0"
            java.lang.String r2 = r1.k
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "1"
            java.lang.String r2 = r1.k
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00a6
            goto L_0x008c
        L_0x00a6:
            java.lang.String r0 = r1.l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = ""
            r1.l = r0
        L_0x00b2:
            java.lang.String r0 = r1.m
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = ""
            r1.m = r0
        L_0x00be:
            java.lang.String r0 = r1.n
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = ""
            r1.n = r0
        L_0x00ca:
            java.lang.String r0 = r1.o
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = ""
            r1.o = r0
        L_0x00d6:
            java.lang.String r0 = r1.p
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = ""
            r1.p = r0
        L_0x00e2:
            java.lang.String r0 = r1.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = ""
            r1.q = r0
        L_0x00ee:
            java.lang.String r0 = r1.r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = ""
            r1.r = r0
        L_0x00fa:
            java.lang.String r0 = r1.s
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = ""
            r1.s = r0
        L_0x0106:
            java.lang.String r0 = r1.t
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = ""
            r1.t = r0
        L_0x0112:
            java.lang.String r0 = r1.u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = ""
            r1.u = r0
        L_0x011e:
            java.lang.String r0 = r1.v
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = ""
            r1.v = r0
        L_0x012a:
            java.lang.String r0 = r1.w
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = ""
            r1.w = r0
        L_0x0136:
            java.lang.String r0 = r1.x
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = ""
            r1.x = r0
        L_0x0142:
            java.lang.String r0 = r1.y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x014f
        L_0x014a:
            java.lang.String r0 = "0"
            r1.y = r0
            goto L_0x0164
        L_0x014f:
            java.lang.String r0 = "1"
            java.lang.String r2 = r1.y
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = "2"
            java.lang.String r2 = r1.y
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0164
            goto L_0x014a
        L_0x0164:
            int r0 = r1.z
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L_0x0171
            r4 = 15
            if (r0 <= r4) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r0 = 1
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            if (r0 != 0) goto L_0x0176
            r1.z = r3
        L_0x0176:
            java.lang.String r0 = r1.A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = ""
            r1.A = r0
        L_0x0182:
            java.lang.String r0 = r1.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x018e
            java.lang.String r0 = ""
            r1.B = r0
        L_0x018e:
            java.lang.String r0 = r1.E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x019a
            java.lang.String r0 = ""
            r1.E = r0
        L_0x019a:
            java.lang.String r0 = r1.G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = ""
            r1.G = r0
        L_0x01a6:
            java.lang.String r0 = r1.H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = ""
            r1.H = r0
        L_0x01b2:
            java.lang.String r0 = J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = ""
            J = r0
        L_0x01be:
            byte[] r0 = r1.I
            if (r0 != 0) goto L_0x01c6
            byte[] r0 = new byte[r3]
            r1.I = r0
        L_0x01c6:
            r4 = 2
            byte[] r5 = new byte[r4]
            r6 = 4
            byte[] r7 = new byte[r6]
            byte[] r0 = r1.I
            r8 = 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x01d7
            byte[] r0 = r1.I
            int r0 = r0.length
            int r0 = r0 + r2
            int r8 = r8 + r0
        L_0x01d7:
            byte[] r0 = r1.N
            if (r0 == 0) goto L_0x01e3
            int r0 = r1.O
            if (r8 <= r0) goto L_0x01e0
            goto L_0x01e3
        L_0x01e0:
            byte[] r0 = r1.N
            goto L_0x01e9
        L_0x01e3:
            byte[] r0 = new byte[r8]
            r1.N = r0
            r1.O = r8
        L_0x01e9:
            r8 = r0
            java.lang.String r0 = r1.f25628a
            byte r0 = java.lang.Byte.parseByte(r0)
            r8[r3] = r0
            short r0 = r1.f25629b
            r9 = 0
            byte[] r0 = com.loc.cn.a((int) r0, (byte[]) r9)
            int r10 = r0.length
            java.lang.System.arraycopy(r0, r3, r8, r2, r10)
            int r0 = r0.length
            int r10 = r0 + 1
            java.lang.String r0 = r1.f25630c     // Catch:{ Throwable -> 0x0215 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0215 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0215 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0215 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0215 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0215 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0215 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0215 }
            int r10 = r10 + r0
            goto L_0x0220
        L_0x0215:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot2"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0220:
            java.lang.String r0 = r1.f25631d     // Catch:{ Throwable -> 0x0235 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0235 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0235 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0235 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0235 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0235 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0235 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0235 }
            int r10 = r10 + r0
            goto L_0x0240
        L_0x0235:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot21"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0240:
            java.lang.String r0 = r1.o     // Catch:{ Throwable -> 0x0255 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0255 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0255 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0255 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0255 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0255 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0255 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0255 }
            int r10 = r10 + r0
            goto L_0x0260
        L_0x0255:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot22"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0260:
            java.lang.String r0 = r1.f25632e     // Catch:{ Throwable -> 0x0275 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0275 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0275 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0275 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0275 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0275 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0275 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0275 }
            int r10 = r10 + r0
            goto L_0x0280
        L_0x0275:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot23"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0280:
            java.lang.String r0 = r1.f25633f     // Catch:{ Throwable -> 0x0295 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0295 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0295 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0295 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0295 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0295 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0295 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0295 }
            int r10 = r10 + r0
            goto L_0x02a0
        L_0x0295:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot24"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x02a0:
            java.lang.String r0 = r1.g     // Catch:{ Throwable -> 0x02b5 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x02b5 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x02b5 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x02b5 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x02b5 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x02b5 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x02b5 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x02b5 }
            int r10 = r10 + r0
            goto L_0x02c0
        L_0x02b5:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot25"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x02c0:
            java.lang.String r0 = r1.u     // Catch:{ Throwable -> 0x02d5 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x02d5 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x02d5 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x02d5 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x02d5 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x02d5 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x02d5 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x02d5 }
            int r10 = r10 + r0
            goto L_0x02e0
        L_0x02d5:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot26"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x02e0:
            java.lang.String r0 = r1.h     // Catch:{ Throwable -> 0x02f5 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x02f5 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x02f5 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x02f5 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x02f5 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x02f5 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x02f5 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x02f5 }
            int r10 = r10 + r0
            goto L_0x0300
        L_0x02f5:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot27"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0300:
            java.lang.String r0 = r1.p     // Catch:{ Throwable -> 0x0315 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0315 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0315 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0315 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0315 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0315 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0315 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0315 }
            int r10 = r10 + r0
            goto L_0x0320
        L_0x0315:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot28"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0320:
            java.lang.String r0 = r1.q     // Catch:{ Throwable -> 0x0335 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0335 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0335 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0335 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0335 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0335 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0335 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0335 }
            int r10 = r10 + r0
            goto L_0x0340
        L_0x0335:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot29"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0340:
            java.lang.String r0 = r1.t     // Catch:{ Throwable -> 0x035e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x035e }
            if (r0 == 0) goto L_0x034b
            r8[r10] = r3     // Catch:{ Throwable -> 0x035e }
            goto L_0x0368
        L_0x034b:
            java.lang.String r0 = r1.t     // Catch:{ Throwable -> 0x035e }
            byte[] r0 = r1.a(r0)     // Catch:{ Throwable -> 0x035e }
            int r11 = r0.length     // Catch:{ Throwable -> 0x035e }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x035e }
            r8[r10] = r11     // Catch:{ Throwable -> 0x035e }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x035e }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x035e }
            int r0 = r0.length     // Catch:{ Throwable -> 0x035e }
            int r10 = r10 + r0
            goto L_0x0369
        L_0x035e:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot219"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
        L_0x0368:
            int r10 = r10 + r2
        L_0x0369:
            java.lang.String r0 = r1.v     // Catch:{ Throwable -> 0x037e }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x037e }
            int r11 = r0.length     // Catch:{ Throwable -> 0x037e }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x037e }
            r8[r10] = r11     // Catch:{ Throwable -> 0x037e }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x037e }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x037e }
            int r0 = r0.length     // Catch:{ Throwable -> 0x037e }
            int r10 = r10 + r0
            goto L_0x0389
        L_0x037e:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot211"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x0389:
            java.lang.String r0 = r1.w     // Catch:{ Throwable -> 0x039e }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x039e }
            int r11 = r0.length     // Catch:{ Throwable -> 0x039e }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x039e }
            r8[r10] = r11     // Catch:{ Throwable -> 0x039e }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x039e }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x039e }
            int r0 = r0.length     // Catch:{ Throwable -> 0x039e }
            int r10 = r10 + r0
            goto L_0x03a9
        L_0x039e:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot212"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x03a9:
            java.lang.String r0 = J     // Catch:{ Throwable -> 0x03c9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x03c9 }
            if (r0 == 0) goto L_0x03b4
            r8[r10] = r3     // Catch:{ Throwable -> 0x03c9 }
            goto L_0x03d3
        L_0x03b4:
            java.lang.String r0 = J     // Catch:{ Throwable -> 0x03c9 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x03c9 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x03c9 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x03c9 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x03c9 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x03c9 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x03c9 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x03c9 }
            int r10 = r10 + r0
            goto L_0x03d4
        L_0x03c9:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot213"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
        L_0x03d3:
            int r10 = r10 + r2
        L_0x03d4:
            java.lang.String r0 = L     // Catch:{ Throwable -> 0x03f4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x03f4 }
            if (r0 == 0) goto L_0x03df
            r8[r10] = r3     // Catch:{ Throwable -> 0x03f4 }
            goto L_0x03fe
        L_0x03df:
            java.lang.String r0 = L     // Catch:{ Throwable -> 0x03f4 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x03f4 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x03f4 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x03f4 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x03f4 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x03f4 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x03f4 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x03f4 }
            int r10 = r10 + r0
            goto L_0x03ff
        L_0x03f4:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot214"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
        L_0x03fe:
            int r10 = r10 + r2
        L_0x03ff:
            java.lang.String r0 = r1.x     // Catch:{ Throwable -> 0x0414 }
            java.lang.String r11 = "GBK"
            byte[] r0 = r0.getBytes(r11)     // Catch:{ Throwable -> 0x0414 }
            int r11 = r0.length     // Catch:{ Throwable -> 0x0414 }
            byte r11 = (byte) r11     // Catch:{ Throwable -> 0x0414 }
            r8[r10] = r11     // Catch:{ Throwable -> 0x0414 }
            int r10 = r10 + 1
            int r11 = r0.length     // Catch:{ Throwable -> 0x0414 }
            java.lang.System.arraycopy(r0, r3, r8, r10, r11)     // Catch:{ Throwable -> 0x0414 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0414 }
            int r10 = r10 + r0
            goto L_0x041f
        L_0x0414:
            r0 = move-exception
            java.lang.String r11 = "Req"
            java.lang.String r12 = "buildV4Dot213"
            com.loc.ce.a(r0, r11, r12)
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x041f:
            java.lang.String r0 = r1.y
            byte r0 = java.lang.Byte.parseByte(r0)
            r8[r10] = r0
            int r10 = r10 + r2
            java.lang.String r0 = r1.j
            byte r0 = java.lang.Byte.parseByte(r0)
            r8[r10] = r0
            int r10 = r10 + r2
            int r0 = r1.z
            r11 = 3
            r0 = r0 & r11
            int r12 = r1.z
            byte r12 = (byte) r12
            r8[r10] = r12
            int r10 = r10 + r2
            r12 = -128(0xffffffffffffff80, float:NaN)
            r13 = 127(0x7f, float:1.78E-43)
            if (r0 == r2) goto L_0x0443
            if (r0 != r4) goto L_0x0557
        L_0x0443:
            java.lang.String r14 = "mcc"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.b((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            int r10 = r10 + r14
            if (r0 != r2) goto L_0x0486
            java.lang.String r14 = "mnc"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.b((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            int r10 = r10 + r14
            java.lang.String r14 = "lac"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.b((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            int r10 = r10 + r14
            java.lang.String r14 = "cellid"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.c((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
        L_0x0484:
            int r10 = r10 + r14
            goto L_0x04d8
        L_0x0486:
            if (r0 != r4) goto L_0x04d8
            java.lang.String r14 = "sid"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.b((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            int r10 = r10 + r14
            java.lang.String r14 = "nid"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.b((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            int r10 = r10 + r14
            java.lang.String r14 = "bid"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.b((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            int r10 = r10 + r14
            java.lang.String r14 = "lon"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.c((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            int r10 = r10 + r14
            java.lang.String r14 = "lat"
            java.lang.String r14 = r1.b(r14)
            byte[] r14 = com.loc.cn.c((java.lang.String) r14)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r14 = r14.length
            goto L_0x0484
        L_0x04d8:
            java.lang.String r14 = "signal"
            java.lang.String r14 = r1.b(r14)
            int r14 = java.lang.Integer.parseInt(r14)
            if (r14 <= r13) goto L_0x04e6
        L_0x04e4:
            r14 = 0
            goto L_0x04e9
        L_0x04e6:
            if (r14 >= r12) goto L_0x04e9
            goto L_0x04e4
        L_0x04e9:
            byte r14 = (byte) r14
            r8[r10] = r14
            int r10 = r10 + r2
            byte[] r14 = com.loc.cn.a((int) r3, (byte[]) r5)
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r10, r15)
            int r10 = r10 + r4
            if (r0 != r2) goto L_0x0552
            java.lang.String r0 = r1.B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0505
            r8[r10] = r3
        L_0x0502:
            int r10 = r10 + 1
            goto L_0x0557
        L_0x0505:
            java.lang.String r0 = r1.B
            java.lang.String r14 = "\\*"
            java.lang.String[] r0 = r0.split(r14)
            int r0 = r0.length
            byte r14 = (byte) r0
            r8[r10] = r14
            int r10 = r10 + 1
            r14 = r10
            r10 = 0
        L_0x0515:
            if (r10 >= r0) goto L_0x0550
            java.lang.String r15 = "lac"
            java.lang.String r15 = r1.a(r15, r10)
            byte[] r15 = com.loc.cn.b((java.lang.String) r15)
            int r9 = r15.length
            java.lang.System.arraycopy(r15, r3, r8, r14, r9)
            int r9 = r15.length
            int r14 = r14 + r9
            java.lang.String r9 = "cellid"
            java.lang.String r9 = r1.a(r9, r10)
            byte[] r9 = com.loc.cn.c((java.lang.String) r9)
            int r15 = r9.length
            java.lang.System.arraycopy(r9, r3, r8, r14, r15)
            int r9 = r9.length
            int r14 = r14 + r9
            java.lang.String r9 = "signal"
            java.lang.String r9 = r1.a(r9, r10)
            int r9 = java.lang.Integer.parseInt(r9)
            if (r9 <= r13) goto L_0x0545
        L_0x0543:
            r9 = 0
            goto L_0x0548
        L_0x0545:
            if (r9 >= r12) goto L_0x0548
            goto L_0x0543
        L_0x0548:
            byte r9 = (byte) r9
            r8[r14] = r9
            int r14 = r14 + r2
            int r10 = r10 + 1
            r9 = 0
            goto L_0x0515
        L_0x0550:
            r10 = r14
            goto L_0x0557
        L_0x0552:
            if (r0 != r4) goto L_0x0557
            r8[r10] = r3
            goto L_0x0502
        L_0x0557:
            java.lang.String r0 = r1.D
            r9 = 8
            if (r0 == 0) goto L_0x0579
            int r14 = r1.z
            r14 = r14 & r9
            if (r14 != r9) goto L_0x0579
            java.lang.String r14 = "GBK"
            byte[] r0 = r0.getBytes(r14)     // Catch:{ Exception -> 0x0579 }
            int r14 = r0.length     // Catch:{ Exception -> 0x0579 }
            r15 = 60
            int r14 = java.lang.Math.min(r14, r15)     // Catch:{ Exception -> 0x0579 }
            byte r15 = (byte) r14     // Catch:{ Exception -> 0x0579 }
            r8[r10] = r15     // Catch:{ Exception -> 0x0579 }
            int r10 = r10 + 1
            java.lang.System.arraycopy(r0, r3, r8, r10, r14)     // Catch:{ Exception -> 0x0579 }
            int r10 = r10 + r14
            goto L_0x057c
        L_0x0579:
            r8[r10] = r3
            int r10 = r10 + r2
        L_0x057c:
            java.util.ArrayList<com.loc.bp> r0 = r1.C
            int r14 = r0.size()
            int r15 = r1.z
            r15 = r15 & r6
            if (r15 != r6) goto L_0x0675
            if (r14 <= 0) goto L_0x0675
            java.lang.Object r15 = r0.get(r3)
            com.loc.bp r15 = (com.loc.bp) r15
            boolean r15 = r15.o
            if (r15 != 0) goto L_0x0595
            int r14 = r14 + -1
        L_0x0595:
            byte r15 = (byte) r14
            r8[r10] = r15
            int r10 = r10 + r2
            r15 = r10
            r10 = 0
        L_0x059b:
            if (r10 >= r14) goto L_0x0679
            java.lang.Object r16 = r0.get(r10)
            r9 = r16
            com.loc.bp r9 = (com.loc.bp) r9
            boolean r12 = r9.o
            if (r12 == 0) goto L_0x066b
            int r12 = r9.k
            if (r12 == r2) goto L_0x0610
            int r12 = r9.k
            if (r12 == r11) goto L_0x0610
            int r12 = r9.k
            if (r12 != r6) goto L_0x05b6
            goto L_0x0610
        L_0x05b6:
            int r12 = r9.k
            if (r12 != r4) goto L_0x064e
            int r12 = r9.k
            byte r12 = (byte) r12
            boolean r6 = r9.n
            if (r6 == 0) goto L_0x05c4
            r6 = r12 | 8
            byte r12 = (byte) r6
        L_0x05c4:
            r8[r15] = r12
            int r15 = r15 + 1
            int r6 = r9.f25557a
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.g
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.h
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.i
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.f25562f
            byte[] r6 = com.loc.cn.b((int) r6, (byte[]) r7)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.f25561e
            byte[] r6 = com.loc.cn.b((int) r6, (byte[]) r7)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            goto L_0x064d
        L_0x0610:
            int r6 = r9.k
            byte r6 = (byte) r6
            boolean r12 = r9.n
            if (r12 == 0) goto L_0x061a
            r6 = r6 | 8
            byte r6 = (byte) r6
        L_0x061a:
            r8[r15] = r6
            int r15 = r15 + 1
            int r6 = r9.f25557a
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.f25558b
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.f25559c
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
            int r15 = r15 + r6
            int r6 = r9.f25560d
            byte[] r6 = com.loc.cn.b((int) r6, (byte[]) r7)
            int r12 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r12)
            int r6 = r6.length
        L_0x064d:
            int r15 = r15 + r6
        L_0x064e:
            int r6 = r9.j
            r12 = 99
            if (r6 <= r13) goto L_0x0655
            goto L_0x065b
        L_0x0655:
            r11 = -128(0xffffffffffffff80, float:NaN)
            if (r6 >= r11) goto L_0x065a
            goto L_0x065b
        L_0x065a:
            r12 = r6
        L_0x065b:
            byte r6 = (byte) r12
            r8[r15] = r6
            int r15 = r15 + r2
            short r6 = r9.l
            byte[] r6 = com.loc.cn.a((int) r6, (byte[]) r5)
            int r9 = r6.length
            java.lang.System.arraycopy(r6, r3, r8, r15, r9)
            int r6 = r6.length
            int r15 = r15 + r6
        L_0x066b:
            int r10 = r10 + 1
            r6 = 4
            r9 = 8
            r11 = 3
            r12 = -128(0xffffffffffffff80, float:NaN)
            goto L_0x059b
        L_0x0675:
            r8[r10] = r3
            int r15 = r10 + 1
        L_0x0679:
            java.lang.String r0 = r1.E
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0686
            r8[r15] = r3
        L_0x0683:
            int r15 = r15 + r2
            goto L_0x06f8
        L_0x0686:
            r8[r15] = r2
            int r15 = r15 + r2
            java.lang.String r0 = r1.E     // Catch:{ Throwable -> 0x06d8 }
            java.lang.String r6 = ","
            java.lang.String[] r6 = r0.split(r6)     // Catch:{ Throwable -> 0x06d8 }
            r0 = r6[r3]     // Catch:{ Throwable -> 0x06d8 }
            byte[] r0 = r1.a(r0)     // Catch:{ Throwable -> 0x06d8 }
            int r7 = r0.length     // Catch:{ Throwable -> 0x06d8 }
            java.lang.System.arraycopy(r0, r3, r8, r15, r7)     // Catch:{ Throwable -> 0x06d8 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x06d8 }
            int r15 = r15 + r0
            r0 = r6[r4]     // Catch:{ Throwable -> 0x06b2 }
            java.lang.String r7 = "GBK"
            byte[] r0 = r0.getBytes(r7)     // Catch:{ Throwable -> 0x06b2 }
            int r7 = r0.length     // Catch:{ Throwable -> 0x06b2 }
            byte r7 = (byte) r7     // Catch:{ Throwable -> 0x06b2 }
            r8[r15] = r7     // Catch:{ Throwable -> 0x06b2 }
            int r15 = r15 + 1
            int r7 = r0.length     // Catch:{ Throwable -> 0x06b2 }
            java.lang.System.arraycopy(r0, r3, r8, r15, r7)     // Catch:{ Throwable -> 0x06b2 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x06b2 }
            int r15 = r15 + r0
            goto L_0x06be
        L_0x06b2:
            r0 = move-exception
            java.lang.String r7 = "Req"
            java.lang.String r9 = "buildV4Dot214"
            com.loc.ce.a(r0, r7, r9)     // Catch:{ Throwable -> 0x06d8 }
            r8[r15] = r3     // Catch:{ Throwable -> 0x06d8 }
            int r15 = r15 + 1
        L_0x06be:
            r0 = r6[r2]     // Catch:{ Throwable -> 0x06d8 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x06d8 }
            if (r0 <= r13) goto L_0x06c8
        L_0x06c6:
            r0 = 0
            goto L_0x06cd
        L_0x06c8:
            r6 = -128(0xffffffffffffff80, float:NaN)
            if (r0 >= r6) goto L_0x06cd
            goto L_0x06c6
        L_0x06cd:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x06d8 }
            byte r0 = java.lang.Byte.parseByte(r0)     // Catch:{ Throwable -> 0x06d8 }
            r8[r15] = r0     // Catch:{ Throwable -> 0x06d8 }
            goto L_0x0683
        L_0x06d8:
            r0 = move-exception
            java.lang.String r6 = "Req"
            java.lang.String r7 = "buildV4Dot216"
            com.loc.ce.a(r0, r6, r7)
            java.lang.String r0 = "00:00:00:00:00:00"
            byte[] r0 = r1.a(r0)
            int r6 = r0.length
            java.lang.System.arraycopy(r0, r3, r8, r15, r6)
            int r0 = r0.length
            int r15 = r15 + r0
            r8[r15] = r3
            int r15 = r15 + r2
            java.lang.String r0 = "0"
            byte r0 = java.lang.Byte.parseByte(r0)
            r8[r15] = r0
            goto L_0x0683
        L_0x06f8:
            java.util.ArrayList<android.net.wifi.ScanResult> r0 = r1.F
            int r6 = r0.size()
            r7 = 25
            int r6 = java.lang.Math.min(r6, r7)
            if (r6 != 0) goto L_0x070b
            r8[r15] = r3
            int r15 = r15 + r2
            goto L_0x07a9
        L_0x070b:
            byte r7 = (byte) r6
            r8[r15] = r7
            int r15 = r15 + r2
            int r7 = com.loc.cn.c()
            r9 = 17
            if (r7 < r9) goto L_0x0719
            r7 = 1
            goto L_0x071a
        L_0x0719:
            r7 = 0
        L_0x071a:
            r9 = 0
            if (r7 == 0) goto L_0x0725
            long r9 = com.loc.cn.b()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
        L_0x0725:
            r11 = 0
        L_0x0726:
            if (r11 >= r6) goto L_0x0799
            java.lang.Object r12 = r0.get(r11)
            android.net.wifi.ScanResult r12 = (android.net.wifi.ScanResult) r12
            java.lang.String r14 = r12.BSSID
            byte[] r14 = r1.a(r14)
            int r4 = r14.length
            java.lang.System.arraycopy(r14, r3, r8, r15, r4)
            int r4 = r14.length
            int r15 = r15 + r4
            java.lang.String r4 = r12.SSID     // Catch:{ Exception -> 0x074f }
            java.lang.String r14 = "GBK"
            byte[] r4 = r4.getBytes(r14)     // Catch:{ Exception -> 0x074f }
            int r14 = r4.length     // Catch:{ Exception -> 0x074f }
            byte r14 = (byte) r14     // Catch:{ Exception -> 0x074f }
            r8[r15] = r14     // Catch:{ Exception -> 0x074f }
            int r15 = r15 + 1
            int r14 = r4.length     // Catch:{ Exception -> 0x074f }
            java.lang.System.arraycopy(r4, r3, r8, r15, r14)     // Catch:{ Exception -> 0x074f }
            int r4 = r4.length     // Catch:{ Exception -> 0x074f }
            int r15 = r15 + r4
            goto L_0x0752
        L_0x074f:
            r8[r15] = r3
            int r15 = r15 + r2
        L_0x0752:
            int r4 = r12.level
            if (r4 <= r13) goto L_0x075a
            r4 = 0
            r14 = -128(0xffffffffffffff80, float:NaN)
            goto L_0x075f
        L_0x075a:
            r14 = -128(0xffffffffffffff80, float:NaN)
            if (r4 >= r14) goto L_0x075f
            r4 = 0
        L_0x075f:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            byte r4 = java.lang.Byte.parseByte(r4)
            r8[r15] = r4
            int r15 = r15 + r2
            if (r7 == 0) goto L_0x077c
            long r13 = r12.timestamp
            long r13 = r9 - r13
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 / r17
            r17 = 1
            long r13 = r13 + r17
            int r4 = (int) r13
            if (r4 >= 0) goto L_0x077d
        L_0x077c:
            r4 = 0
        L_0x077d:
            byte[] r4 = com.loc.cn.a((int) r4, (byte[]) r5)
            int r13 = r4.length
            java.lang.System.arraycopy(r4, r3, r8, r15, r13)
            int r4 = r4.length
            int r15 = r15 + r4
            int r4 = r12.frequency
            byte[] r4 = com.loc.cn.a((int) r4, (byte[]) r5)
            int r12 = r4.length
            java.lang.System.arraycopy(r4, r3, r8, r15, r12)
            int r4 = r4.length
            int r15 = r15 + r4
            int r11 = r11 + 1
            r4 = 2
            r13 = 127(0x7f, float:1.78E-43)
            goto L_0x0726
        L_0x0799:
            java.lang.String r0 = r1.G
            int r0 = java.lang.Integer.parseInt(r0)
            byte[] r0 = com.loc.cn.a((int) r0, (byte[]) r5)
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r3, r8, r15, r4)
            int r0 = r0.length
            int r15 = r15 + r0
        L_0x07a9:
            r8[r15] = r3
            int r15 = r15 + r2
            java.lang.String r0 = r1.H     // Catch:{ Throwable -> 0x07cc }
            java.lang.String r4 = "GBK"
            byte[] r9 = r0.getBytes(r4)     // Catch:{ Throwable -> 0x07cc }
            int r0 = r9.length     // Catch:{ Throwable -> 0x07cc }
            r4 = 127(0x7f, float:1.78E-43)
            if (r0 <= r4) goto L_0x07ba
            r9 = 0
        L_0x07ba:
            if (r9 != 0) goto L_0x07bf
            r8[r15] = r3     // Catch:{ Throwable -> 0x07cc }
            goto L_0x07ce
        L_0x07bf:
            int r0 = r9.length     // Catch:{ Throwable -> 0x07cc }
            byte r0 = (byte) r0     // Catch:{ Throwable -> 0x07cc }
            r8[r15] = r0     // Catch:{ Throwable -> 0x07cc }
            int r15 = r15 + 1
            int r0 = r9.length     // Catch:{ Throwable -> 0x07cc }
            java.lang.System.arraycopy(r9, r3, r8, r15, r0)     // Catch:{ Throwable -> 0x07cc }
            int r0 = r9.length     // Catch:{ Throwable -> 0x07cc }
            int r15 = r15 + r0
            goto L_0x07cf
        L_0x07cc:
            r8[r15] = r3
        L_0x07ce:
            int r15 = r15 + r2
        L_0x07cf:
            r2 = 2
            byte[] r0 = new byte[r2]
            r0 = {0, 0} // fill-array
            java.lang.String r2 = r1.K     // Catch:{ Throwable -> 0x07fe }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x07fe }
            if (r2 != 0) goto L_0x07e7
            java.lang.String r0 = r1.K     // Catch:{ Throwable -> 0x07fe }
            int r0 = r0.length()     // Catch:{ Throwable -> 0x07fe }
            byte[] r0 = com.loc.cn.a((int) r0, (byte[]) r5)     // Catch:{ Throwable -> 0x07fe }
        L_0x07e7:
            r4 = 2
            java.lang.System.arraycopy(r0, r3, r8, r15, r4)     // Catch:{ Throwable -> 0x07fe }
            int r15 = r15 + r4
            if (r2 != 0) goto L_0x07fc
            java.lang.String r0 = r1.K     // Catch:{ Throwable -> 0x07fc }
            java.lang.String r2 = "GBK"
            byte[] r0 = r0.getBytes(r2)     // Catch:{ Throwable -> 0x07fc }
            int r2 = r0.length     // Catch:{ Throwable -> 0x07fc }
            java.lang.System.arraycopy(r0, r3, r8, r15, r2)     // Catch:{ Throwable -> 0x07fc }
            int r0 = r0.length     // Catch:{ Throwable -> 0x07fc }
            int r15 = r15 + r0
        L_0x07fc:
            r2 = 2
            goto L_0x0800
        L_0x07fe:
            r2 = 2
            int r15 = r15 + r2
        L_0x0800:
            byte[] r0 = new byte[r2]
            r0 = {0, 0} // fill-array
            byte[] r0 = com.loc.cn.a((int) r3, (byte[]) r5)     // Catch:{ Throwable -> 0x080c }
            java.lang.System.arraycopy(r0, r3, r8, r15, r2)     // Catch:{ Throwable -> 0x080c }
        L_0x080c:
            int r15 = r15 + r2
            byte[] r0 = new byte[r2]
            r0 = {0, 0} // fill-array
            java.lang.System.arraycopy(r0, r3, r8, r15, r2)     // Catch:{ Throwable -> 0x0815 }
        L_0x0815:
            int r15 = r15 + r2
            byte[] r0 = r1.I
            if (r0 == 0) goto L_0x081e
            byte[] r0 = r1.I
            int r0 = r0.length
            goto L_0x081f
        L_0x081e:
            r0 = 0
        L_0x081f:
            r2 = 0
            byte[] r2 = com.loc.cn.a((int) r0, (byte[]) r2)
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r3, r8, r15, r4)
            int r2 = r2.length
            int r15 = r15 + r2
            if (r0 <= 0) goto L_0x0838
            byte[] r0 = r1.I
            byte[] r2 = r1.I
            int r2 = r2.length
            java.lang.System.arraycopy(r0, r3, r8, r15, r2)
            byte[] r0 = r1.I
            int r0 = r0.length
            int r15 = r15 + r0
        L_0x0838:
            byte[] r0 = new byte[r15]
            java.lang.System.arraycopy(r8, r3, r0, r3, r15)
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32
            r2.<init>()
            r2.update(r0)
            long r4 = r2.getValue()
            byte[] r2 = com.loc.cn.a((long) r4)
            int r4 = r15 + 8
            byte[] r4 = new byte[r4]
            java.lang.System.arraycopy(r0, r3, r4, r3, r15)
            r5 = 8
            java.lang.System.arraycopy(r2, r3, r4, r15, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cc.a():byte[]");
    }
}
