package com.loc;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public final class cp {
    static boolean o;
    Socket A = null;
    boolean B = false;
    c C = null;
    String D = "jsonp1";
    private final int E = 5000;

    /* renamed from: a  reason: collision with root package name */
    boolean f25689a;

    /* renamed from: b  reason: collision with root package name */
    boolean f25690b;

    /* renamed from: c  reason: collision with root package name */
    String f25691c;

    /* renamed from: d  reason: collision with root package name */
    b f25692d;

    /* renamed from: e  reason: collision with root package name */
    long f25693e;

    /* renamed from: f  reason: collision with root package name */
    long f25694f;
    AMapLocationServer g;
    AMapLocation h;
    long i;
    int j;
    public a k;
    Context l;
    cv m;
    cm n;
    HashMap<Messenger, Long> p = new HashMap<>();
    cj q = null;
    long r = 0;
    long s = 0;
    String t = null;
    boolean u = true;
    String v = "";
    AMapLocationClientOption w = null;
    AMapLocationClientOption x = new AMapLocationClientOption();
    ServerSocket y = null;
    boolean z = false;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:49|50|51|52) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:273:0x04d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00b5 */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x020f A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x021b A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0243 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0277 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x02a1 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x02b7 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:168:0x02e6 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0041 A[Catch:{ Throwable -> 0x005f }] */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x0405 A[Catch:{ Throwable -> 0x043e, Throwable -> 0x049c }] */
        /* JADX WARNING: Removed duplicated region for block: B:213:0x040f A[Catch:{ Throwable -> 0x043e, Throwable -> 0x049c }] */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x041b A[Catch:{ Throwable -> 0x043e, Throwable -> 0x049c }] */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x042a A[Catch:{ Throwable -> 0x043e, Throwable -> 0x049c }] */
        /* JADX WARNING: Removed duplicated region for block: B:233:0x045b A[Catch:{ Throwable -> 0x043e, Throwable -> 0x049c }] */
        /* JADX WARNING: Removed duplicated region for block: B:234:0x045f A[Catch:{ Throwable -> 0x043e, Throwable -> 0x049c }] */
        /* JADX WARNING: Removed duplicated region for block: B:236:0x0463 A[Catch:{ Throwable -> 0x043e, Throwable -> 0x049c }] */
        /* JADX WARNING: Removed duplicated region for block: B:253:0x04a5 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0079 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x016a A[Catch:{ Throwable -> 0x0205, Throwable -> 0x050d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r23) {
            /*
                r22 = this;
                r1 = r22
                r2 = r23
                r3 = 1
                r4 = 0
                r5 = 0
                android.os.Bundle r6 = r23.getData()     // Catch:{ Throwable -> 0x0064 }
                android.os.Messenger r13 = r2.replyTo     // Catch:{ Throwable -> 0x0061 }
                if (r6 == 0) goto L_0x006e
                boolean r0 = r6.isEmpty()     // Catch:{ Throwable -> 0x005f }
                if (r0 != 0) goto L_0x006e
                java.lang.String r0 = "c"
                java.lang.String r0 = r6.getString(r0)     // Catch:{ Throwable -> 0x005f }
                com.loc.cp r7 = com.loc.cp.this     // Catch:{ Throwable -> 0x005f }
                java.lang.String r8 = r7.t     // Catch:{ Throwable -> 0x005f }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x005f }
                if (r8 == 0) goto L_0x002d
                android.content.Context r8 = r7.l     // Catch:{ Throwable -> 0x005f }
                java.lang.String r8 = com.loc.ce.a((android.content.Context) r8)     // Catch:{ Throwable -> 0x005f }
                r7.t = r8     // Catch:{ Throwable -> 0x005f }
            L_0x002d:
                boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x005f }
                if (r8 != 0) goto L_0x003e
                java.lang.String r7 = r7.t     // Catch:{ Throwable -> 0x005f }
                boolean r0 = r0.equals(r7)     // Catch:{ Throwable -> 0x005f }
                if (r0 != 0) goto L_0x003c
                goto L_0x003e
            L_0x003c:
                r0 = 1
                goto L_0x003f
            L_0x003e:
                r0 = 0
            L_0x003f:
                if (r0 != 0) goto L_0x006e
                int r0 = r2.what     // Catch:{ Throwable -> 0x005f }
                if (r0 != r3) goto L_0x005e
                r0 = 2102(0x836, float:2.946E-42)
                com.loc.cj.a((java.lang.String) r5, (int) r0)     // Catch:{ Throwable -> 0x005f }
                java.lang.String r0 = "invalid handlder scode!!!#1002"
                r7 = 10
                com.autonavi.aps.amapapi.model.AMapLocationServer r9 = com.loc.cp.a((int) r7, (java.lang.String) r0)     // Catch:{ Throwable -> 0x005f }
                com.loc.cp r7 = com.loc.cp.this     // Catch:{ Throwable -> 0x005f }
                java.lang.String r10 = r9.l()     // Catch:{ Throwable -> 0x005f }
                r11 = 0
                r8 = r13
                r7.a(r8, r9, r10, r11)     // Catch:{ Throwable -> 0x005f }
            L_0x005e:
                return
            L_0x005f:
                r0 = move-exception
                goto L_0x0067
            L_0x0061:
                r0 = move-exception
                r13 = r5
                goto L_0x0067
            L_0x0064:
                r0 = move-exception
                r6 = r5
                r13 = r6
            L_0x0067:
                java.lang.String r7 = "ApsServiceCore"
                java.lang.String r8 = "ActionHandler handlerMessage"
                com.loc.ce.a(r0, r7, r8)     // Catch:{ Throwable -> 0x050d }
            L_0x006e:
                int r0 = r2.what     // Catch:{ Throwable -> 0x050d }
                r7 = 6
                r14 = 2
                r8 = 5
                r9 = 0
                r15 = 4
                switch(r0) {
                    case 0: goto L_0x04a5;
                    case 1: goto L_0x02e6;
                    case 2: goto L_0x02b7;
                    case 3: goto L_0x02a1;
                    case 4: goto L_0x0277;
                    case 5: goto L_0x0243;
                    case 6: goto L_0x0079;
                    case 7: goto L_0x021b;
                    case 8: goto L_0x0079;
                    case 9: goto L_0x020f;
                    case 10: goto L_0x016a;
                    case 11: goto L_0x0084;
                    case 12: goto L_0x007b;
                    default: goto L_0x0079;
                }     // Catch:{ Throwable -> 0x050d }
            L_0x0079:
                goto L_0x0509
            L_0x007b:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                java.util.HashMap<android.os.Messenger, java.lang.Long> r0 = r0.p     // Catch:{ Throwable -> 0x050d }
                r0.remove(r13)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x0084:
                com.loc.cp r3 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                java.util.HashMap<android.os.Messenger, java.lang.Long> r0 = r3.p     // Catch:{ Throwable -> 0x0160 }
                r0.clear()     // Catch:{ Throwable -> 0x0160 }
                r3.p = r5     // Catch:{ Throwable -> 0x0160 }
                com.loc.cm r0 = r3.n     // Catch:{ Throwable -> 0x0160 }
                if (r0 == 0) goto L_0x0096
                android.content.Context r0 = r3.l     // Catch:{ Throwable -> 0x0160 }
                com.loc.cm.b((android.content.Context) r0)     // Catch:{ Throwable -> 0x0160 }
            L_0x0096:
                com.loc.cp$a r0 = r3.k     // Catch:{ Throwable -> 0x0160 }
                if (r0 == 0) goto L_0x009f
                com.loc.cp$a r0 = r3.k     // Catch:{ Throwable -> 0x0160 }
                r0.removeCallbacksAndMessages(r5)     // Catch:{ Throwable -> 0x0160 }
            L_0x009f:
                com.loc.cp$b r0 = r3.f25692d     // Catch:{ Throwable -> 0x0160 }
                if (r0 == 0) goto L_0x00be
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0160 }
                r6 = 18
                if (r0 < r6) goto L_0x00bb
                com.loc.cp$b r0 = r3.f25692d     // Catch:{ Throwable -> 0x00b5 }
                java.lang.Class<android.os.HandlerThread> r6 = android.os.HandlerThread.class
                java.lang.String r7 = "quitSafely"
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x00b5 }
                com.loc.ch.a((java.lang.Object) r0, (java.lang.Class<?>) r6, (java.lang.String) r7, (java.lang.Object[]) r8)     // Catch:{ Throwable -> 0x00b5 }
                goto L_0x00be
            L_0x00b5:
                com.loc.cp$b r0 = r3.f25692d     // Catch:{ Throwable -> 0x0160 }
            L_0x00b7:
                r0.quit()     // Catch:{ Throwable -> 0x0160 }
                goto L_0x00be
            L_0x00bb:
                com.loc.cp$b r0 = r3.f25692d     // Catch:{ Throwable -> 0x0160 }
                goto L_0x00b7
            L_0x00be:
                r3.f25692d = r5     // Catch:{ Throwable -> 0x0160 }
                r3.k = r5     // Catch:{ Throwable -> 0x0160 }
                com.loc.cv r0 = r3.m     // Catch:{ Throwable -> 0x0160 }
                if (r0 == 0) goto L_0x00cd
                com.loc.cv r0 = r3.m     // Catch:{ Throwable -> 0x0160 }
                r0.c()     // Catch:{ Throwable -> 0x0160 }
                r3.m = r5     // Catch:{ Throwable -> 0x0160 }
            L_0x00cd:
                r3.a()     // Catch:{ Throwable -> 0x0160 }
                r3.f25689a = r4     // Catch:{ Throwable -> 0x0160 }
                r3.f25690b = r4     // Catch:{ Throwable -> 0x0160 }
                com.loc.cm r0 = r3.n     // Catch:{ Throwable -> 0x0160 }
                r0.f()     // Catch:{ Throwable -> 0x0160 }
                android.content.Context r0 = r3.l     // Catch:{ Throwable -> 0x0160 }
                com.loc.cj.a((android.content.Context) r0)     // Catch:{ Throwable -> 0x0160 }
                com.loc.cj r0 = r3.q     // Catch:{ Throwable -> 0x0160 }
                if (r0 == 0) goto L_0x0150
                long r4 = r3.r     // Catch:{ Throwable -> 0x0160 }
                int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r0 == 0) goto L_0x0150
                long r4 = r3.s     // Catch:{ Throwable -> 0x0160 }
                int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r0 == 0) goto L_0x0150
                long r4 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0160 }
                long r6 = r3.r     // Catch:{ Throwable -> 0x0160 }
                r0 = 0
                long r4 = r4 - r6
                com.loc.cj r0 = r3.q     // Catch:{ Throwable -> 0x0160 }
                android.content.Context r6 = r3.l     // Catch:{ Throwable -> 0x0160 }
                int r0 = r0.b(r6)     // Catch:{ Throwable -> 0x0160 }
                com.loc.cj r6 = r3.q     // Catch:{ Throwable -> 0x0160 }
                android.content.Context r7 = r3.l     // Catch:{ Throwable -> 0x0160 }
                int r6 = r6.c(r7)     // Catch:{ Throwable -> 0x0160 }
                android.content.Context r7 = r3.l     // Catch:{ Throwable -> 0x0160 }
                long r8 = r3.s     // Catch:{ Throwable -> 0x0160 }
                r10 = -1
                if (r0 == r10) goto L_0x0149
                if (r6 != r10) goto L_0x0110
                goto L_0x0149
            L_0x0110:
                java.lang.String r10 = "O012"
                if (r7 == 0) goto L_0x0149
                boolean r11 = com.loc.cd.d()     // Catch:{ Throwable -> 0x0138 }
                if (r11 != 0) goto L_0x011b
                goto L_0x0149
            L_0x011b:
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0138 }
                r11.<init>()     // Catch:{ Throwable -> 0x0138 }
                java.lang.String r12 = "param_int_first"
                r11.put(r12, r0)     // Catch:{ Throwable -> 0x0138 }
                java.lang.String r0 = "param_int_second"
                r11.put(r0, r6)     // Catch:{ Throwable -> 0x0138 }
                java.lang.String r0 = "param_long_first"
                r11.put(r0, r8)     // Catch:{ Throwable -> 0x0138 }
                java.lang.String r0 = "param_long_second"
                r11.put(r0, r4)     // Catch:{ Throwable -> 0x0138 }
                com.loc.cj.a((android.content.Context) r7, (java.lang.String) r10, (org.json.JSONObject) r11)     // Catch:{ Throwable -> 0x0138 }
                goto L_0x0149
            L_0x0138:
                r0 = move-exception
                java.lang.String r4 = "ReportUtil"
                java.lang.String r5 = "applyStatisticsEx"
                com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x0141 }
                goto L_0x0149
            L_0x0141:
                r0 = move-exception
                java.lang.String r4 = "ReportUtil"
                java.lang.String r5 = "reportServiceAliveTime"
                com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x0160 }
            L_0x0149:
                com.loc.cj r0 = r3.q     // Catch:{ Throwable -> 0x0160 }
                android.content.Context r3 = r3.l     // Catch:{ Throwable -> 0x0160 }
                r0.d(r3)     // Catch:{ Throwable -> 0x0160 }
            L_0x0150:
                com.loc.i.b()     // Catch:{ Throwable -> 0x0160 }
                boolean r0 = com.loc.cp.o     // Catch:{ Throwable -> 0x0160 }
                if (r0 == 0) goto L_0x0509
                int r0 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0160 }
                com.loc.cq.a(r0)     // Catch:{ Throwable -> 0x0160 }
                goto L_0x0509
            L_0x0160:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "threadDestroy"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x016a:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                if (r6 == 0) goto L_0x0509
                boolean r5 = r6.isEmpty()     // Catch:{ Throwable -> 0x0205 }
                if (r5 == 0) goto L_0x017b
                goto L_0x0509
            L_0x017b:
                boolean r5 = com.loc.cd.z     // Catch:{ Throwable -> 0x0205 }
                if (r5 != 0) goto L_0x0181
                goto L_0x0509
            L_0x0181:
                java.lang.String r5 = "lat"
                double r8 = r6.getDouble(r5)     // Catch:{ Throwable -> 0x0205 }
                java.lang.String r5 = "lon"
                double r10 = r6.getDouble(r5)     // Catch:{ Throwable -> 0x0205 }
                r0.b((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x0205 }
                com.amap.api.location.AMapLocation r5 = r0.h     // Catch:{ Throwable -> 0x0205 }
                r12 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r5 == 0) goto L_0x01e9
                double[] r5 = new double[r15]     // Catch:{ Throwable -> 0x0205 }
                r5[r4] = r8     // Catch:{ Throwable -> 0x0205 }
                r5[r3] = r10     // Catch:{ Throwable -> 0x0205 }
                com.amap.api.location.AMapLocation r3 = r0.h     // Catch:{ Throwable -> 0x0205 }
                double r3 = r3.getLatitude()     // Catch:{ Throwable -> 0x0205 }
                r5[r14] = r3     // Catch:{ Throwable -> 0x0205 }
                com.amap.api.location.AMapLocation r3 = r0.h     // Catch:{ Throwable -> 0x0205 }
                double r3 = r3.getLongitude()     // Catch:{ Throwable -> 0x0205 }
                r14 = 3
                r5[r14] = r3     // Catch:{ Throwable -> 0x0205 }
                float r3 = com.loc.cn.a((double[]) r5)     // Catch:{ Throwable -> 0x0205 }
                int r4 = com.loc.cd.i()     // Catch:{ Throwable -> 0x0205 }
                int r4 = r4 * 3
                float r4 = (float) r4     // Catch:{ Throwable -> 0x0205 }
                int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r4 >= 0) goto L_0x01eb
                android.os.Bundle r4 = new android.os.Bundle     // Catch:{ Throwable -> 0x0205 }
                r4.<init>()     // Catch:{ Throwable -> 0x0205 }
                java.lang.Class<com.amap.api.location.AMapLocation> r5 = com.amap.api.location.AMapLocation.class
                java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Throwable -> 0x0205 }
                r4.setClassLoader(r5)     // Catch:{ Throwable -> 0x0205 }
                java.lang.String r5 = "I_MAX_GEO_DIS"
                int r15 = com.loc.cd.i()     // Catch:{ Throwable -> 0x0205 }
                int r15 = r15 * 3
                r4.putInt(r5, r15)     // Catch:{ Throwable -> 0x0205 }
                java.lang.String r5 = "I_MIN_GEO_DIS"
                int r14 = com.loc.cd.i()     // Catch:{ Throwable -> 0x0205 }
                r4.putInt(r5, r14)     // Catch:{ Throwable -> 0x0205 }
                java.lang.String r5 = "loc"
                com.amap.api.location.AMapLocation r14 = r0.h     // Catch:{ Throwable -> 0x0205 }
                r4.putParcelable(r5, r14)     // Catch:{ Throwable -> 0x0205 }
                com.loc.cp.a(r13, r7, r4)     // Catch:{ Throwable -> 0x0205 }
                goto L_0x01eb
            L_0x01e9:
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x01eb:
                int r4 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                if (r4 == 0) goto L_0x01f8
                int r4 = com.loc.cd.i()     // Catch:{ Throwable -> 0x0205 }
                float r4 = (float) r4     // Catch:{ Throwable -> 0x0205 }
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 <= 0) goto L_0x0509
            L_0x01f8:
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x0205 }
                com.loc.cm r3 = r0.n     // Catch:{ Throwable -> 0x0205 }
                com.autonavi.aps.amapapi.model.AMapLocationServer r3 = r3.a((double) r8, (double) r10)     // Catch:{ Throwable -> 0x0205 }
                r0.h = r3     // Catch:{ Throwable -> 0x0205 }
                goto L_0x0509
            L_0x0205:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "doLocationGeo"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x020f:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                com.loc.cp.a((com.loc.cp) r0, (android.os.Messenger) r13)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x021b:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                android.content.Context r3 = r0.l     // Catch:{ Throwable -> 0x0239 }
                long r4 = r0.f25693e     // Catch:{ Throwable -> 0x0239 }
                boolean r3 = com.loc.cd.a((android.content.Context) r3, (long) r4)     // Catch:{ Throwable -> 0x0239 }
                if (r3 == 0) goto L_0x0509
                long r3 = com.loc.cn.a()     // Catch:{ Throwable -> 0x0239 }
                r0.f25693e = r3     // Catch:{ Throwable -> 0x0239 }
                com.loc.cm r0 = r0.n     // Catch:{ Throwable -> 0x0239 }
                r0.e()     // Catch:{ Throwable -> 0x0239 }
                goto L_0x0509
            L_0x0239:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "doNGps"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x0243:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                boolean r3 = com.loc.cd.j     // Catch:{ Throwable -> 0x026d }
                if (r3 == 0) goto L_0x0254
                com.loc.cm r3 = r0.n     // Catch:{ Throwable -> 0x026d }
            L_0x0250:
                r3.e()     // Catch:{ Throwable -> 0x026d }
                goto L_0x025f
            L_0x0254:
                android.content.Context r3 = r0.l     // Catch:{ Throwable -> 0x026d }
                boolean r3 = com.loc.cn.e((android.content.Context) r3)     // Catch:{ Throwable -> 0x026d }
                if (r3 != 0) goto L_0x025f
                com.loc.cm r3 = r0.n     // Catch:{ Throwable -> 0x026d }
                goto L_0x0250
            L_0x025f:
                com.loc.cp$a r0 = r0.k     // Catch:{ Throwable -> 0x026d }
                int r3 = com.loc.cd.a()     // Catch:{ Throwable -> 0x026d }
                int r3 = r3 * 1000
                long r3 = (long) r3     // Catch:{ Throwable -> 0x026d }
                r0.sendEmptyMessageDelayed(r8, r3)     // Catch:{ Throwable -> 0x026d }
                goto L_0x0509
            L_0x026d:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "doOffFusion"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x0277:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                int r4 = r0.j     // Catch:{ Throwable -> 0x0297 }
                int r5 = com.loc.cd.h     // Catch:{ Throwable -> 0x0297 }
                if (r4 >= r5) goto L_0x0509
                int r4 = r0.j     // Catch:{ Throwable -> 0x0297 }
                int r4 = r4 + r3
                r0.j = r4     // Catch:{ Throwable -> 0x0297 }
                com.loc.cm r3 = r0.n     // Catch:{ Throwable -> 0x0297 }
                r3.e()     // Catch:{ Throwable -> 0x0297 }
                com.loc.cp$a r0 = r0.k     // Catch:{ Throwable -> 0x0297 }
                r3 = 2000(0x7d0, double:9.88E-321)
                r0.sendEmptyMessageDelayed(r15, r3)     // Catch:{ Throwable -> 0x0297 }
                goto L_0x0509
            L_0x0297:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "doGpsFusion"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x02a1:
                if (r6 == 0) goto L_0x02b6
                boolean r0 = r6.isEmpty()     // Catch:{ Throwable -> 0x050d }
                if (r0 == 0) goto L_0x02aa
                goto L_0x02b6
            L_0x02aa:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r5)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a()     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x02b6:
                return
            L_0x02b7:
                if (r6 == 0) goto L_0x02e5
                boolean r0 = r6.isEmpty()     // Catch:{ Throwable -> 0x050d }
                if (r0 == 0) goto L_0x02c0
                goto L_0x02e5
            L_0x02c0:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r5)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                boolean r4 = r0.B     // Catch:{ Throwable -> 0x02db }
                if (r4 != 0) goto L_0x0509
                com.loc.cp$c r4 = new com.loc.cp$c     // Catch:{ Throwable -> 0x02db }
                r4.<init>()     // Catch:{ Throwable -> 0x02db }
                r0.C = r4     // Catch:{ Throwable -> 0x02db }
                com.loc.cp$c r4 = r0.C     // Catch:{ Throwable -> 0x02db }
                r4.start()     // Catch:{ Throwable -> 0x02db }
                r0.B = r3     // Catch:{ Throwable -> 0x02db }
                goto L_0x0509
            L_0x02db:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "startSocket"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x02e5:
                return
            L_0x02e6:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r11 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                if (r6 == 0) goto L_0x0509
                boolean r0 = r6.isEmpty()     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x02f7
                goto L_0x0509
            L_0x02f7:
                com.amap.api.location.AMapLocationClientOption r6 = r11.b((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x049c }
                java.util.HashMap<android.os.Messenger, java.lang.Long> r0 = r11.p     // Catch:{ Throwable -> 0x049c }
                boolean r0 = r0.containsKey(r13)     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x0324
                boolean r0 = r6.isOnceLocation()     // Catch:{ Throwable -> 0x049c }
                if (r0 != 0) goto L_0x0324
                java.util.HashMap<android.os.Messenger, java.lang.Long> r0 = r11.p     // Catch:{ Throwable -> 0x049c }
                java.lang.Object r0 = r0.get(r13)     // Catch:{ Throwable -> 0x049c }
                java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Throwable -> 0x049c }
                long r16 = r0.longValue()     // Catch:{ Throwable -> 0x049c }
                long r18 = com.loc.cn.b()     // Catch:{ Throwable -> 0x049c }
                r0 = 0
                long r18 = r18 - r16
                r16 = 800(0x320, double:3.953E-321)
                int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r0 >= 0) goto L_0x0324
                goto L_0x0509
            L_0x0324:
                boolean r0 = r11.u     // Catch:{ Throwable -> 0x049c }
                r12 = 9
                if (r0 != 0) goto L_0x035c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
                java.lang.String r3 = "init error : "
                r0.<init>(r3)     // Catch:{ Throwable -> 0x049c }
                java.lang.String r3 = r11.v     // Catch:{ Throwable -> 0x049c }
                r0.append(r3)     // Catch:{ Throwable -> 0x049c }
                java.lang.String r3 = "#0901"
                r0.append(r3)     // Catch:{ Throwable -> 0x049c }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = com.loc.cp.a((int) r12, (java.lang.String) r0)     // Catch:{ Throwable -> 0x049c }
                r11.g = r0     // Catch:{ Throwable -> 0x049c }
                com.autonavi.aps.amapapi.model.AMapLocationServer r9 = r11.g     // Catch:{ Throwable -> 0x049c }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r11.g     // Catch:{ Throwable -> 0x049c }
                java.lang.String r10 = r0.l()     // Catch:{ Throwable -> 0x049c }
                r3 = 0
                r7 = r11
                r8 = r13
                r11 = r3
                r7.a(r8, r9, r10, r11)     // Catch:{ Throwable -> 0x049c }
                r0 = 2091(0x82b, float:2.93E-42)
                com.loc.cj.a((java.lang.String) r5, (int) r0)     // Catch:{ Throwable -> 0x049c }
                goto L_0x0509
            L_0x035c:
                long r16 = com.loc.cn.b()     // Catch:{ Throwable -> 0x049c }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r11.g     // Catch:{ Throwable -> 0x049c }
                boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x0386
                long r9 = r11.f25694f     // Catch:{ Throwable -> 0x049c }
                r0 = 0
                long r16 = r16 - r9
                r9 = 600(0x258, double:2.964E-321)
                int r0 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
                if (r0 >= 0) goto L_0x0386
                com.autonavi.aps.amapapi.model.AMapLocationServer r9 = r11.g     // Catch:{ Throwable -> 0x049c }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r11.g     // Catch:{ Throwable -> 0x049c }
                java.lang.String r10 = r0.l()     // Catch:{ Throwable -> 0x049c }
                r5 = 0
                r7 = r11
                r8 = r13
                r3 = r11
                r11 = r5
                r7.a(r8, r9, r10, r11)     // Catch:{ Throwable -> 0x049c }
                goto L_0x0454
            L_0x0386:
                r3 = r11
                com.loc.ci r11 = new com.loc.ci     // Catch:{ Throwable -> 0x049c }
                r11.<init>()     // Catch:{ Throwable -> 0x049c }
                long r9 = com.loc.cn.b()     // Catch:{ Throwable -> 0x049c }
                r11.f25657a = r9     // Catch:{ Throwable -> 0x049c }
                r9 = 8
                com.loc.cm r0 = r3.n     // Catch:{ Throwable -> 0x03cb }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r0.d()     // Catch:{ Throwable -> 0x03cb }
                r3.g = r0     // Catch:{ Throwable -> 0x03cb }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x03cb }
                int r0 = r0.getLocationType()     // Catch:{ Throwable -> 0x03cb }
                if (r0 == r7) goto L_0x03b0
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x03cb }
                int r0 = r0.getLocationType()     // Catch:{ Throwable -> 0x03cb }
                if (r0 != r8) goto L_0x03ad
                goto L_0x03b0
            L_0x03ad:
                r20 = 0
                goto L_0x03b8
            L_0x03b0:
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x03cb }
                long r7 = r0.k()     // Catch:{ Throwable -> 0x03cb }
                r20 = r7
            L_0x03b8:
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x03c9 }
                r11.f25659c = r0     // Catch:{ Throwable -> 0x03c9 }
                com.loc.cm r0 = r3.n     // Catch:{ Throwable -> 0x03c9 }
                com.autonavi.aps.amapapi.model.AMapLocationServer r7 = r3.g     // Catch:{ Throwable -> 0x03c9 }
                java.lang.String[] r8 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x03c9 }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r0.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r7, (java.lang.String[]) r8)     // Catch:{ Throwable -> 0x03c9 }
                r3.g = r0     // Catch:{ Throwable -> 0x03c9 }
                goto L_0x03f7
            L_0x03c9:
                r0 = move-exception
                goto L_0x03ce
            L_0x03cb:
                r0 = move-exception
                r20 = 0
            L_0x03ce:
                r7 = 2081(0x821, float:2.916E-42)
                com.loc.cj.a((java.lang.String) r5, (int) r7)     // Catch:{ Throwable -> 0x049c }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
                java.lang.String r8 = "loc error : "
                r7.<init>(r8)     // Catch:{ Throwable -> 0x049c }
                java.lang.String r8 = r0.getMessage()     // Catch:{ Throwable -> 0x049c }
                r7.append(r8)     // Catch:{ Throwable -> 0x049c }
                java.lang.String r8 = "#0801"
                r7.append(r8)     // Catch:{ Throwable -> 0x049c }
                java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x049c }
                com.autonavi.aps.amapapi.model.AMapLocationServer r7 = com.loc.cp.a((int) r9, (java.lang.String) r7)     // Catch:{ Throwable -> 0x049c }
                r3.g = r7     // Catch:{ Throwable -> 0x049c }
                java.lang.String r7 = "ApsServiceCore"
                java.lang.String r8 = "run part2"
                com.loc.ce.a(r0, r7, r8)     // Catch:{ Throwable -> 0x049c }
            L_0x03f7:
                long r7 = com.loc.cn.b()     // Catch:{ Throwable -> 0x049c }
                r11.f25658b = r7     // Catch:{ Throwable -> 0x049c }
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                boolean r0 = com.loc.cn.a((com.autonavi.aps.amapapi.model.AMapLocationServer) r0)     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x040b
                long r7 = com.loc.cn.b()     // Catch:{ Throwable -> 0x049c }
                r3.f25694f = r7     // Catch:{ Throwable -> 0x049c }
            L_0x040b:
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                if (r0 != 0) goto L_0x0417
                java.lang.String r0 = "loc is null#0801"
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = com.loc.cp.a((int) r9, (java.lang.String) r0)     // Catch:{ Throwable -> 0x049c }
                r3.g = r0     // Catch:{ Throwable -> 0x049c }
            L_0x0417:
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x0421
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                java.lang.String r5 = r0.l()     // Catch:{ Throwable -> 0x049c }
            L_0x0421:
                r10 = r5
                com.autonavi.aps.amapapi.model.AMapLocationServer r5 = r3.g     // Catch:{ Throwable -> 0x049c }
                boolean r0 = r6.isLocationCacheEnable()     // Catch:{ Throwable -> 0x043e }
                if (r0 == 0) goto L_0x043b
                com.loc.cv r0 = r3.m     // Catch:{ Throwable -> 0x043e }
                if (r0 == 0) goto L_0x043b
                com.loc.cv r0 = r3.m     // Catch:{ Throwable -> 0x043e }
                com.autonavi.aps.amapapi.model.AMapLocationServer r7 = r3.g     // Catch:{ Throwable -> 0x043e }
                long r8 = r6.getLastLocationLifeCycle()     // Catch:{ Throwable -> 0x043e }
                com.amap.api.location.AMapLocation r0 = r0.a(r7, r10, r8)     // Catch:{ Throwable -> 0x043e }
                goto L_0x043c
            L_0x043b:
                r0 = r5
            L_0x043c:
                r9 = r0
                goto L_0x0447
            L_0x043e:
                r0 = move-exception
                java.lang.String r6 = "ApsServiceCore"
                java.lang.String r7 = "fixLastLocation"
                com.loc.ce.a(r0, r6, r7)     // Catch:{ Throwable -> 0x049c }
                r9 = r5
            L_0x0447:
                r7 = r3
                r8 = r13
                r5 = r11
                r11 = r20
                r7.a(r8, r9, r10, r11)     // Catch:{ Throwable -> 0x049c }
                android.content.Context r0 = r3.l     // Catch:{ Throwable -> 0x049c }
                com.loc.cj.a((android.content.Context) r0, (com.loc.ci) r5)     // Catch:{ Throwable -> 0x049c }
            L_0x0454:
                r3.b((android.os.Messenger) r13)     // Catch:{ Throwable -> 0x049c }
                boolean r0 = com.loc.cd.E     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x045f
                com.loc.cd.E = r4     // Catch:{ Throwable -> 0x049c }
                r0 = 1
                goto L_0x0461
            L_0x045f:
                boolean r0 = com.loc.cd.E     // Catch:{ Throwable -> 0x049c }
            L_0x0461:
                if (r0 == 0) goto L_0x0466
                r3.a((android.os.Messenger) r13)     // Catch:{ Throwable -> 0x049c }
            L_0x0466:
                long r4 = r3.i     // Catch:{ Throwable -> 0x049c }
                boolean r0 = com.loc.cd.a((long) r4)     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x0497
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                if (r0 == 0) goto L_0x0497
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                int r0 = r0.getLocationType()     // Catch:{ Throwable -> 0x049c }
                if (r0 == r14) goto L_0x048c
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                int r0 = r0.getLocationType()     // Catch:{ Throwable -> 0x049c }
                if (r0 == r15) goto L_0x048c
                com.autonavi.aps.amapapi.model.AMapLocationServer r0 = r3.g     // Catch:{ Throwable -> 0x049c }
                int r0 = r0.getLocationType()     // Catch:{ Throwable -> 0x049c }
                r4 = 9
                if (r0 != r4) goto L_0x0497
            L_0x048c:
                long r4 = com.loc.cn.b()     // Catch:{ Throwable -> 0x049c }
                r3.i = r4     // Catch:{ Throwable -> 0x049c }
                com.loc.cm r0 = r3.n     // Catch:{ Throwable -> 0x049c }
                r0.e()     // Catch:{ Throwable -> 0x049c }
            L_0x0497:
                r3.c()     // Catch:{ Throwable -> 0x049c }
                goto L_0x0509
            L_0x049c:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "doLocation"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
                goto L_0x0509
            L_0x04a5:
                com.loc.cp r0 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                r0.a((android.os.Bundle) r6)     // Catch:{ Throwable -> 0x050d }
                com.loc.cp r3 = com.loc.cp.this     // Catch:{ Throwable -> 0x050d }
                if (r6 == 0) goto L_0x0509
                boolean r0 = r6.isEmpty()     // Catch:{ Throwable -> 0x0501 }
                if (r0 == 0) goto L_0x04b5
                goto L_0x0509
            L_0x04b5:
                boolean r0 = r3.f25690b     // Catch:{ Throwable -> 0x0501 }
                if (r0 == 0) goto L_0x04ba
                goto L_0x0509
            L_0x04ba:
                r4 = 1
                r3.f25690b = r4     // Catch:{ Throwable -> 0x0501 }
                r3.b((android.os.Messenger) r13)     // Catch:{ Throwable -> 0x0501 }
                android.content.Context r0 = r3.l     // Catch:{ Throwable -> 0x0501 }
                com.loc.cd.e(r0)     // Catch:{ Throwable -> 0x0501 }
                com.loc.cm r0 = r3.n     // Catch:{ Throwable -> 0x04d9 }
                com.loc.bl r4 = r0.f25679f     // Catch:{ Throwable -> 0x04d1 }
                if (r4 == 0) goto L_0x04d9
                com.loc.bl r0 = r0.f25679f     // Catch:{ Throwable -> 0x04d1 }
                r0.a()     // Catch:{ Throwable -> 0x04d1 }
                goto L_0x04d9
            L_0x04d1:
                r0 = move-exception
                java.lang.String r4 = "Aps"
                java.lang.String r5 = "bindAMapService"
                com.loc.ce.a(r0, r4, r5)     // Catch:{ Throwable -> 0x04d9 }
            L_0x04d9:
                r3.a((android.os.Messenger) r13)     // Catch:{ Throwable -> 0x0501 }
                long r4 = r3.i     // Catch:{ Throwable -> 0x0501 }
                boolean r0 = com.loc.cd.a((long) r4)     // Catch:{ Throwable -> 0x0501 }
                if (r0 == 0) goto L_0x04fd
                java.lang.String r0 = "1"
                java.lang.String r4 = "isCacheLoc"
                java.lang.String r4 = r6.getString(r4)     // Catch:{ Throwable -> 0x0501 }
                boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x0501 }
                if (r0 == 0) goto L_0x04fd
                long r4 = com.loc.cn.b()     // Catch:{ Throwable -> 0x0501 }
                r3.i = r4     // Catch:{ Throwable -> 0x0501 }
                com.loc.cm r0 = r3.n     // Catch:{ Throwable -> 0x0501 }
                r0.e()     // Catch:{ Throwable -> 0x0501 }
            L_0x04fd:
                r3.c()     // Catch:{ Throwable -> 0x0501 }
                goto L_0x0509
            L_0x0501:
                r0 = move-exception
                java.lang.String r3 = "ApsServiceCore"
                java.lang.String r4 = "doInitAuth"
                com.loc.ce.a(r0, r3, r4)     // Catch:{ Throwable -> 0x050d }
            L_0x0509:
                super.handleMessage(r23)     // Catch:{ Throwable -> 0x050d }
                return
            L_0x050d:
                r0 = move-exception
                java.lang.String r2 = "actionHandler"
                java.lang.String r3 = "handleMessage"
                com.loc.ce.a(r0, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.cp.a.handleMessage(android.os.Message):void");
        }
    }

    class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        public final void run() {
            try {
                super.run();
            } catch (Throwable th) {
                ce.a(th, "APSManager$ActionThread", "run");
            }
        }

        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            try {
                cp.this.m = new cv(cp.this.l);
            } catch (Throwable th) {
                ce.a(th, "APSManager$ActionThread", "onLooperPrepared");
                return;
            }
            cp.this.n = new cm();
            super.onLooperPrepared();
        }
    }

    class c extends Thread {
        c() {
        }

        public final void run() {
            Socket socket;
            BufferedReader bufferedReader;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            try {
                if (!cp.this.z) {
                    cp.this.z = true;
                    cp.this.y = new ServerSocket(43689);
                }
                while (cp.this.z && cp.this.y != null) {
                    cp.this.A = cp.this.y.accept();
                    cp cpVar = cp.this;
                    socket = cp.this.A;
                    if (socket != null) {
                        int i = ce.f25649f;
                        String str6 = null;
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                            try {
                                cpVar.a(bufferedReader);
                                String b2 = cpVar.b();
                                ce.f25649f = i;
                                try {
                                    cpVar.a(b2);
                                    try {
                                        bufferedReader.close();
                                        socket.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        str4 = "ApsServiceCore";
                                        str5 = "invokeSocketLocation part3";
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = "ApsServiceCore";
                                    str5 = "invokeSocketLocation part3";
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    str3 = cpVar.D + "&&" + cpVar.D + "({'package':'" + cpVar.f25691c + "','error_code':1,'error':'params error'})";
                                } catch (Throwable th4) {
                                    th = th4;
                                    ce.f25649f = i;
                                    try {
                                        cpVar.a(str6);
                                        try {
                                            bufferedReader.close();
                                            socket.close();
                                        } catch (Throwable th5) {
                                            th = th5;
                                            str = "ApsServiceCore";
                                            str2 = "invokeSocketLocation part3";
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        str = "ApsServiceCore";
                                        str2 = "invokeSocketLocation part3";
                                    }
                                    throw th;
                                }
                                try {
                                    ce.a(th, "ApsServiceCore", "invokeSocketLocation");
                                    ce.f25649f = i;
                                    try {
                                        cpVar.a(str3);
                                        try {
                                            bufferedReader.close();
                                            socket.close();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            str4 = "ApsServiceCore";
                                            str5 = "invokeSocketLocation part3";
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        str4 = "ApsServiceCore";
                                        str5 = "invokeSocketLocation part3";
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    str6 = str3;
                                    ce.f25649f = i;
                                    cpVar.a(str6);
                                    bufferedReader.close();
                                    socket.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            bufferedReader = null;
                            ce.f25649f = i;
                            cpVar.a(str6);
                            bufferedReader.close();
                            socket.close();
                            throw th;
                        }
                    }
                }
            } catch (Throwable th11) {
                ce.a(th11, "ApsServiceCore", "run");
            }
            super.run();
            return;
            try {
                ce.a(th, str4, str5);
            } catch (Throwable th12) {
                ce.a(th12, "ApsServiceCore", "invokeSocketLocation part4");
            }
            ce.a(th, str, str2);
            throw th;
            throw th;
            throw th;
            throw th;
        }
    }

    public cp(Context context) {
        this.l = context;
    }

    static AMapLocationServer a(int i2, String str) {
        try {
            AMapLocationServer aMapLocationServer = new AMapLocationServer("");
            aMapLocationServer.setErrorCode(i2);
            aMapLocationServer.setLocationDetail(str);
            return aMapLocationServer;
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "newInstanceAMapLoc");
            return null;
        }
    }

    static void a(Messenger messenger, int i2, Bundle bundle) {
        if (messenger != null) {
            try {
                Message obtain = Message.obtain();
                obtain.setData(bundle);
                obtain.what = i2;
                messenger.send(obtain);
            } catch (Throwable th) {
                ce.a(th, "ApsServiceCore", "sendMessage");
            }
        }
    }

    private void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (this.n != null) {
                this.n.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption != null) {
                o = aMapLocationClientOption.isKillProcess();
                if (!(this.w == null || (aMapLocationClientOption.isOffset() == this.w.isOffset() && aMapLocationClientOption.isNeedAddress() == this.w.isNeedAddress() && aMapLocationClientOption.isLocationCacheEnable() == this.w.isLocationCacheEnable() && this.w.getGeoLanguage() == aMapLocationClientOption.getGeoLanguage()))) {
                    this.f25694f = 0;
                    this.h = null;
                }
                this.w = aMapLocationClientOption;
            }
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "setExtra");
        }
    }

    public final void a() {
        try {
            if (this.A != null) {
                this.A.close();
            }
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "doStopScocket 1");
        }
        try {
            if (this.y != null) {
                this.y.close();
            }
        } catch (Throwable th2) {
            ce.a(th2, "ApsServiceCore", "doStopScocket 2");
        }
        try {
            if (this.C != null) {
                this.C.interrupt();
            }
        } catch (Throwable unused) {
        }
        this.C = null;
        this.y = null;
        this.z = false;
        this.B = false;
    }

    /* access modifiers changed from: package-private */
    public void a(Messenger messenger, AMapLocation aMapLocation, String str, long j2) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putParcelable("loc", aMapLocation);
        bundle.putString("nb", str);
        bundle.putLong("netUseTime", j2);
        this.p.put(messenger, Long.valueOf(cn.b()));
        a(messenger, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    public void a(BufferedReader bufferedReader) throws Exception {
        String readLine = bufferedReader.readLine();
        int i2 = 30000;
        if (readLine != null && readLine.length() > 0) {
            String[] split = readLine.split(" ");
            if (split != null && split.length > 1) {
                String[] split2 = split[1].split("\\?");
                if (split2 != null && split2.length > 1) {
                    String[] split3 = split2[1].split("&");
                    if (split3 != null && split3.length > 0) {
                        int i3 = 30000;
                        for (String split4 : split3) {
                            String[] split5 = split4.split("=");
                            if (split5 != null && split5.length > 1) {
                                if ("to".equals(split5[0])) {
                                    i3 = cn.g(split5[1]);
                                }
                                if ("callback".equals(split5[0])) {
                                    this.D = split5[1];
                                }
                            }
                        }
                        i2 = i3;
                    }
                }
            }
        }
        ce.f25649f = i2;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) throws UnsupportedEncodingException, IOException {
        PrintStream printStream = new PrintStream(this.A.getOutputStream(), true, "UTF-8");
        printStream.println("HTTP/1.0 200 OK");
        printStream.println("Content-Length:" + str.getBytes("UTF-8").length);
        printStream.println();
        printStream.println(str);
        printStream.close();
    }

    /* access modifiers changed from: package-private */
    public AMapLocationClientOption b(Bundle bundle) {
        AMapLocationClientOption a2 = ce.a(bundle.getBundle("optBundle"));
        a(a2);
        try {
            String string = bundle.getString("d");
            if (!TextUtils.isEmpty(string)) {
                dc.a(string);
            }
        } catch (Throwable th) {
            ce.a(th, "APSManager", "parseBundle");
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        StringBuilder sb;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        if (cn.e(this.l)) {
            sb = new StringBuilder();
            sb.append(this.D);
            sb.append("&&");
            sb.append(this.D);
            sb.append("({'package':'");
            sb.append(this.f25691c);
            str = "','error_code':36,'error':'app is background'})";
        } else {
            if (this.g == null || currentTimeMillis - this.g.getTime() > 5000) {
                try {
                    this.g = this.n.d();
                } catch (Throwable th) {
                    ce.a(th, "ApsServiceCore", "getSocketLocResult");
                }
            }
            if (this.g == null) {
                sb = new StringBuilder();
                sb.append(this.D);
                sb.append("&&");
                sb.append(this.D);
                sb.append("({'package':'");
                sb.append(this.f25691c);
                str = "','error_code':8,'error':'unknown error'})";
            } else if (this.g.getErrorCode() != 0) {
                sb = new StringBuilder();
                sb.append(this.D);
                sb.append("&&");
                sb.append(this.D);
                sb.append("({'package':'");
                sb.append(this.f25691c);
                sb.append("','error_code':");
                sb.append(this.g.getErrorCode());
                sb.append(",'error':'");
                sb.append(this.g.getErrorInfo());
                str = "'})";
            } else {
                sb = new StringBuilder();
                sb.append(this.D);
                sb.append("&&");
                sb.append(this.D);
                sb.append("({'package':'");
                sb.append(this.f25691c);
                sb.append("','error_code':0,'error':'','location':{'y':");
                sb.append(this.g.getLatitude());
                sb.append(",'precision':");
                sb.append(this.g.getAccuracy());
                sb.append(",'x':");
                sb.append(this.g.getLongitude());
                str = "},'version_code':'4.2.0','version':'4.2.0'})";
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        try {
            if (this.n != null) {
                this.n.h();
            }
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "startColl");
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Messenger messenger) {
        try {
            cm.b(this.l);
            if (cd.q) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("ngpsAble", cd.v);
                a(messenger, 7, bundle);
                cd.q = false;
            }
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "initAuth");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        try {
            if (!this.f25689a) {
                Context context = this.l;
                try {
                    if (di.b(context)) {
                        ce.f25644a = "http://abroad.apilocate.amap.com/mobile/binary";
                    } else {
                        if (ce.j == null) {
                            ce.j = new HashMap<>(16);
                        }
                        ce.j.clear();
                        ce.j.put("a9a9d23668a1a7ea93de9b21d67e436a", "F13160D440C7D0229DA95450F66AF92154AC84DF088F8CA3100B2E8131D57F3DC67124D4C466056E7A3DFBE035E1B9A4B9DA4DB68AE65A43EDFD92F5C60EF0C9");
                        ce.j.put("fe643c382e5c3b3962141f1a2e815a78", "FB923EE67A8B4032DAA517DD8CD7A26FF7C25B0C3663F92A0B61251C4FFFA858DF169D61321C3E7919CB67DF8EFEC827");
                        ce.j.put("b2e8bd171989cb2c3c13bd89b4c1067a", "239CE372F804D4BE4EAFFD183668379BDF274440E6F246AB16BBE6F5D1D30DEACFBBF0C942485727FF12288228760A9E");
                        ce.j.put("9a571aa113ad987d626c0457828962e6", "D2FF99A88BEB04683D89470D4FA72B1749DA456AB0D0F1A476477CE5A6874F53A9106423D905F9D808C0FCE8E7F1E04AC642F01FE41D0C7D933971F45CBA72B7");
                        ce.j.put("668319f11506def6208d6afe320dfd52", "53E53D46011A6BBAEA4FAE5442E659E0577CDD336F930C28635C322FB3F51C3C63F7FBAC9EAE448DFA2E5E5D716C4807");
                        ce.j.put("256b0f26bb2a9506be6cfdb84028ae08", "AF2228680EDC323FBA035362EB7E1E38A0C33E1CF6F6FB805EE553A230CBA754CD9552EB9B546542CBE619E8293151BE");
                        String a2 = bt.a(cy.f(context));
                        ce.i = a2;
                        if (a2 != null) {
                            try {
                                if (a2.length() != 0) {
                                    if (ce.j != null) {
                                        if (ce.j.containsKey(a2)) {
                                            String str = ce.j.get(a2);
                                            String str2 = null;
                                            if (str != null && str.length() > 0) {
                                                str2 = new String(bt.d(ce.a(str), a2), "utf-8");
                                            }
                                            if (str2 != null && str2.length() > 0 && str2.contains("http:")) {
                                                ce.f25645b = str2;
                                                ce.f25644a = str2;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                ce.a(th, "CoreUtil", "checkUrl");
                            }
                        }
                    }
                } catch (Throwable th2) {
                    ce.a(th2, "CoreUtil", "checkUrl");
                }
                if (bundle != null) {
                    this.x = ce.a(bundle.getBundle("optBundle"));
                }
                this.f25689a = true;
                this.n.a(this.l);
                this.n.a();
                a(this.x);
                this.n.b();
            }
        } catch (Throwable th3) {
            this.u = false;
            this.v = th3.getMessage();
            ce.a(th3, "ApsServiceCore", "init");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Messenger messenger) {
        try {
            if (cd.d(this.l)) {
                a(messenger, 100, null);
            }
            this.k.removeMessages(4);
            if (cd.g) {
                this.k.sendEmptyMessage(4);
            }
            this.k.removeMessages(5);
            if (cd.i && cd.a() > 2) {
                this.k.sendEmptyMessage(5);
            }
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "checkConfig");
        }
    }

    static /* synthetic */ void a(cp cpVar, Messenger messenger) {
        try {
            cpVar.b(messenger);
            cd.e(cpVar.l);
            try {
                cm cmVar = cpVar.n;
                if (cmVar.f25679f != null) {
                    cmVar.f25679f.b();
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            ce.a(th, "ApsServiceCore", "doCallOtherSer");
        }
    }
}
