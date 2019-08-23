package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.d;
import com.taobao.accs.utl.f;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

public class Message {

    /* renamed from: a  reason: collision with root package name */
    public static int f78926a = 5;

    /* renamed from: b  reason: collision with root package name */
    static long f78927b = 1;
    String A = null;
    String B = null;
    String C = null;
    Integer D = null;
    String E = null;
    String F = null;
    public String G = null;
    public String H = null;
    String I = null;
    String J = null;
    String K = null;
    String L = null;
    String M = null;
    byte[] N;
    public String O;
    int P;
    public long Q = 0;
    public int R = 0;
    public int S = 40000;
    public long T;
    long U;
    public String V = null;
    transient NetPerformanceMonitor W;
    String X = null;
    a Y;

    /* renamed from: c  reason: collision with root package name */
    public boolean f78928c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78929d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78930e;

    /* renamed from: f  reason: collision with root package name */
    public URL f78931f;
    byte g;
    byte h;
    short i;
    short j;
    short k;
    byte l;
    byte m;
    String n;
    String o;
    int p = -1;
    public String q;
    Map<Integer, String> r;
    String s;
    public Integer t;
    Integer u = 0;
    String v = null;
    public String w = null;
    Integer x = null;
    String y = null;
    String z = null;

    public enum ReqType {
        DATA,
        ACK,
        REQ,
        RES;

        public static ReqType valueOf(int i) {
            switch (i) {
                case 0:
                    return DATA;
                case 1:
                    return ACK;
                case 2:
                    return REQ;
                case 3:
                    return RES;
                default:
                    return DATA;
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f78932a;

        /* renamed from: b  reason: collision with root package name */
        private String f78933b;

        public int a() {
            return this.f78932a;
        }

        public String b() {
            return this.f78933b;
        }

        public int hashCode() {
            return this.f78933b.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f78932a == aVar.a() || this.f78933b.equals(aVar.b())) {
                return true;
            }
            return false;
        }

        public a(int i, String str) {
            this.f78932a = i;
            this.f78933b = str;
        }
    }

    public static class b {
        public static int a(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                default:
                    return 1;
            }
        }

        public static String b(int i) {
            switch (i) {
                case 0:
                    return "NO_ACK";
                case 1:
                    return "NEED_ACK";
                default:
                    return "INVALID";
            }
        }
    }

    public static class c {
        public static int a(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    return 0;
            }
        }

        public static String b(int i) {
            switch (i) {
                case 0:
                    return "CONTROL";
                case 1:
                    return "DATA";
                case 2:
                    return "PING";
                case 3:
                    return "HANDSHAKE";
                default:
                    return "INVALID";
            }
        }
    }

    public int a() {
        return this.p;
    }

    public String b() {
        return this.q;
    }

    public a d() {
        return this.Y;
    }

    public NetPerformanceMonitor e() {
        return this.W;
    }

    public byte[] a(Context context, int i2) {
        byte[] bArr;
        try {
            i();
        } catch (JSONException e2) {
            ALog.e(j(), "build1", e2, new Object[0]);
        } catch (UnsupportedEncodingException e3) {
            ALog.e(j(), "build2", e3, new Object[0]);
        }
        String str = this.N != null ? new String(this.N) : "";
        h();
        if (!this.f78928c) {
            StringBuilder sb = new StringBuilder();
            sb.append(UtilityImpl.l(context));
            sb.append("|");
            sb.append(this.s);
            sb.append("|");
            sb.append(this.H == null ? "" : this.H);
            sb.append("|");
            sb.append(this.G == null ? "" : this.G);
            this.o = sb.toString();
        }
        try {
            bArr = (this.q).getBytes("utf-8");
            this.m = (byte) this.o.getBytes("utf-8").length;
            this.l = (byte) this.n.getBytes("utf-8").length;
        } catch (Exception e4) {
            ALog.e(j(), "build3", e4, new Object[0]);
            bArr = (this.q).getBytes();
            this.m = (byte) this.o.getBytes().length;
            this.l = (byte) this.n.getBytes().length;
        }
        short a2 = a(this.r);
        this.j = (short) (this.l + 3 + 1 + this.m + 1 + bArr.length + (this.N == null ? 0 : this.N.length) + a2 + 2);
        this.i = (short) (this.j + 2);
        f fVar = new f(this.i + 2 + 4);
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d(j(), "Build Message", "dataId", new String(bArr));
        }
        try {
            fVar.a((byte) (this.g | 32));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j2 = j();
                ALog.d(j2, "\tversion:2 compress:" + this.g, new Object[0]);
            }
            if (i2 == 0) {
                fVar.a(Byte.MIN_VALUE);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(j(), "\tflag: 0x80", new Object[0]);
                }
            } else {
                fVar.a((byte) 64);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d(j(), "\tflag: 0x40", new Object[0]);
                }
            }
            fVar.a(this.i);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j3 = j();
                ALog.d(j3, "\ttotalLength:" + this.i, new Object[0]);
            }
            fVar.a(this.j);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j4 = j();
                ALog.d(j4, "\tdataLength:" + this.j, new Object[0]);
            }
            fVar.a(this.k);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j5 = j();
                ALog.d(j5, "\tflags:" + Integer.toHexString(this.k), new Object[0]);
            }
            fVar.a(this.l);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j6 = j();
                ALog.d(j6, "\ttargetLength:" + this.l, new Object[0]);
            }
            fVar.write(this.n.getBytes("utf-8"));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j7 = j();
                ALog.d(j7, "\ttarget:" + this.n, new Object[0]);
            }
            fVar.a(this.m);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j8 = j();
                ALog.d(j8, "\tsourceLength:" + this.m, new Object[0]);
            }
            fVar.write(this.o.getBytes("utf-8"));
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j9 = j();
                ALog.d(j9, "\tsource:" + this.o, new Object[0]);
            }
            fVar.a((byte) bArr.length);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j10 = j();
                ALog.d(j10, "\tdataIdLength:" + bArr.length, new Object[0]);
            }
            fVar.write(bArr);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j11 = j();
                ALog.d(j11, "\tdataId:" + new String(bArr), new Object[0]);
            }
            fVar.a(a2);
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j12 = j();
                ALog.d(j12, "\textHeader len:" + a2, new Object[0]);
            }
            if (this.r != null) {
                for (Integer intValue : this.r.keySet()) {
                    int intValue2 = intValue.intValue();
                    String str2 = this.r.get(Integer.valueOf(intValue2));
                    if (!TextUtils.isEmpty(str2)) {
                        fVar.a((short) ((((short) intValue2) << 10) | ((short) (str2.getBytes("utf-8").length & 1023))));
                        fVar.write(str2.getBytes("utf-8"));
                        if (ALog.isPrintLog(ALog.Level.D)) {
                            String j13 = j();
                            ALog.d(j13, "\textHeader key:" + intValue2 + " value:" + str2, new Object[0]);
                        }
                    }
                }
            }
            if (this.N != null) {
                fVar.write(this.N);
            }
            if (ALog.isPrintLog(ALog.Level.D)) {
                String j14 = j();
                ALog.d(j14, "\toriData:" + str, new Object[0]);
            }
            fVar.flush();
        } catch (IOException e5) {
            ALog.e(j(), "build4", e5, new Object[0]);
        }
        byte[] byteArray = fVar.toByteArray();
        try {
            fVar.close();
        } catch (IOException e6) {
            ALog.e(j(), "build5", e6, new Object[0]);
        }
        return byteArray;
    }

    /* access modifiers changed from: package-private */
    public short a(Map<Integer, String> map) {
        short s2 = 0;
        if (map != null) {
            try {
                for (Integer intValue : map.keySet()) {
                    String str = map.get(Integer.valueOf(intValue.intValue()));
                    if (!TextUtils.isEmpty(str)) {
                        s2 = (short) (s2 + ((short) (str.getBytes("utf-8").length & 1023)) + 2);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return s2;
    }

    public static Message a(boolean z2, int i2) {
        Message message = new Message();
        message.p = 2;
        message.t = 201;
        message.f78929d = z2;
        message.Q = (long) i2;
        return message;
    }

    public static Message a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.P = 1;
        message.a(1, ReqType.DATA, 1);
        message.s = str;
        message.H = str2;
        message.n = "3|dm|";
        message.t = 5;
        message.s = str;
        message.H = str2;
        message.D = 221;
        message.O = "ctrl_bindservice";
        return message;
    }

    public static Message a(String str, String str2, String str3, int i2) {
        Message message = new Message();
        try {
            message.f78931f = new URL(str3);
        } catch (MalformedURLException unused) {
        }
        message.n = "4|sal|st";
        message.a(1, ReqType.DATA, 0);
        message.t = 100;
        message.N = ("0|" + i2 + "|" + str + "|" + com.taobao.accs.utl.a.b(GlobalClientInfo.getContext()) + "|" + str2).getBytes();
        return message;
    }

    public static Message a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.P = 1;
        message.a(1, ReqType.DATA, 1);
        message.s = str;
        message.n = "3|dm|";
        message.t = 4;
        message.D = 221;
        message.O = "ctrl_unbinduser";
        return message;
    }

    private static void a(com.taobao.accs.net.b bVar, Message message, ACCSManager.AccsRequest accsRequest) {
        if (accsRequest.host == null) {
            try {
                message.f78931f = new URL(bVar.b((String) null));
            } catch (MalformedURLException e2) {
                ALog.e("Msg", "setUnit", e2, new Object[0]);
            }
        } else {
            message.f78931f = accsRequest.host;
        }
    }

    private static void a(com.taobao.accs.net.b bVar, Message message) {
        try {
            message.f78931f = new URL(bVar.b((String) null));
        } catch (Exception e2) {
            ALog.e("Msg", "setControlHost", e2, new Object[0]);
        }
    }

    private static void a(Message message, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str6) || str4 != null) {
            message.r = new HashMap();
            if (str5 != null && UtilityImpl.a(str5) <= 1023) {
                message.r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_BUSINESS.ordinal()), str5);
            }
            if (str != null && UtilityImpl.a(str) <= 1023) {
                message.r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_SID.ordinal()), str);
            }
            if (str2 != null && UtilityImpl.a(str2) <= 1023) {
                message.r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_USERID.ordinal()), str2);
            }
            if (str6 != null && UtilityImpl.a(str6) <= 1023) {
                message.r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_TAG.ordinal()), str6);
            }
            if (str4 != null && UtilityImpl.a(str4) <= 1023) {
                message.r.put(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_COOKIE.ordinal()), str4);
            }
            if (str3 != null && UtilityImpl.a(str3) <= 1023) {
                message.r.put(19, str3);
            }
        }
    }

    private void a(int i2, ReqType reqType, int i3) {
        this.p = i2;
        if (i2 != 2) {
            this.k = (short) (((((i2 & 1) << 4) | (reqType.ordinal() << 2)) | i3) << 11);
        }
    }

    private void a(short s2, boolean z2) {
        this.p = 1;
        this.k = s2;
        this.k = (short) (this.k & -16385);
        this.k = (short) (this.k | 8192);
        this.k = (short) (this.k & -2049);
        this.k = (short) (this.k & -65);
        if (z2) {
            this.k = (short) (this.k | 32);
        }
    }

    public boolean c() {
        return "3|dm|".equals(this.n);
    }

    public String f() {
        if (this.s == null) {
            return "";
        }
        return this.s;
    }

    private String j() {
        return "Msg_" + this.X;
    }

    public boolean g() {
        boolean z2;
        if ((System.currentTimeMillis() - this.T) + this.Q >= ((long) this.S)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            String j2 = j();
            ALog.e(j2, "delay time:" + this.Q + " beforeSendTime:" + (System.currentTimeMillis() - this.T) + " timeout" + this.S, new Object[0]);
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0040 A[SYNTHETIC, Splitter:B:27:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0045 A[Catch:{ Exception -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004c A[SYNTHETIC, Splitter:B:37:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0051 A[Catch:{ Exception -> 0x0055 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r6 = this;
            r0 = 0
            byte[] r1 = r6.N     // Catch:{ Throwable -> 0x0049, all -> 0x003a }
            if (r1 != 0) goto L_0x0006
            return
        L_0x0006:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0049, all -> 0x003a }
            r1.<init>()     // Catch:{ Throwable -> 0x0049, all -> 0x003a }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ Throwable -> 0x004a, all -> 0x0035 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x004a, all -> 0x0035 }
            byte[] r0 = r6.N     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            r2.write(r0)     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            r2.finish()     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            byte[] r0 = r1.toByteArray()     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            if (r0 == 0) goto L_0x0029
            int r3 = r0.length     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            byte[] r4 = r6.N     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            int r4 = r4.length     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            if (r3 >= r4) goto L_0x0029
            r6.N = r0     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
            r0 = 1
            r6.g = r0     // Catch:{ Throwable -> 0x0033, all -> 0x0031 }
        L_0x0029:
            r2.close()     // Catch:{ Exception -> 0x0030 }
            r1.close()     // Catch:{ Exception -> 0x0030 }
            return
        L_0x0030:
            return
        L_0x0031:
            r0 = move-exception
            goto L_0x003e
        L_0x0033:
            r0 = r2
            goto L_0x004a
        L_0x0035:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x003e
        L_0x003a:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            throw r0
        L_0x0049:
            r1 = r0
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Exception -> 0x0055 }
        L_0x004f:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            return
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.Message.h():void");
    }

    private Message() {
        synchronized (Message.class) {
            this.T = System.currentTimeMillis();
            this.q = String.valueOf(this.T) + ClassUtils.PACKAGE_SEPARATOR + String.valueOf(f78927b);
            long j2 = f78927b;
            f78927b = 1 + j2;
            this.Y = new a((int) j2, this.q);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() throws JSONException, UnsupportedEncodingException {
        Integer num;
        if (this.t != null && this.t.intValue() != 100 && this.t.intValue() != 102) {
            d.a aVar = new d.a();
            if (this.t.intValue() == 100) {
                num = null;
            } else {
                num = this.t;
            }
            this.N = aVar.a("command", num).a("appKey", this.v).a("osType", this.x).a("sign", this.w).a("sdkVersion", this.D).a("appVersion", this.C).a("ttid", this.E).a("model", this.I).a("brand", this.J).a("imei", this.K).a("imsi", this.L).a("os", this.y).a("exts", this.B).a().toString().getBytes("utf-8");
        }
    }

    public void a(long j2) {
        this.U = j2;
    }

    public static Message a(String str, int i2) {
        Message message = new Message();
        message.a(1, ReqType.ACK, 0);
        message.t = Integer.valueOf(i2);
        message.s = str;
        return message;
    }

    public static Message a(com.taobao.accs.net.b bVar, Intent intent) {
        Message message;
        try {
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("serviceId");
            intent.getStringExtra("userInfo");
            intent.getStringExtra("appKey");
            intent.getStringExtra("sid");
            intent.getStringExtra("anti_brush_cookie");
            message = a(stringExtra, stringExtra2);
            try {
                message.X = bVar.m;
                a(bVar, message);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            message = null;
            ALog.e("Msg", "buildBindService", e, new Object[0]);
            return message;
        }
        return message;
    }

    public static Message b(com.taobao.accs.net.b bVar, Intent intent) {
        Message message;
        try {
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("serviceId");
            intent.getStringExtra("userInfo");
            intent.getStringExtra("appKey");
            intent.getStringExtra("sid");
            intent.getStringExtra("anti_brush_cookie");
            message = b(stringExtra, stringExtra2);
            try {
                message.X = bVar.m;
                a(bVar, message);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            message = null;
            ALog.e("Msg", "buildUnbindService", e, new Object[0]);
            return message;
        }
        return message;
    }

    public static Message c(com.taobao.accs.net.b bVar, Intent intent) {
        Message message;
        try {
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("userInfo");
            intent.getStringExtra("appKey");
            intent.getStringExtra("sid");
            intent.getStringExtra("anti_brush_cookie");
            message = c(stringExtra, stringExtra2);
            if (message != null) {
                try {
                    message.X = bVar.m;
                    a(bVar, message);
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            message = null;
            ALog.e("Msg", "buildBindUser", e, new Object[0]);
            return message;
        }
        return message;
    }

    public static Message d(com.taobao.accs.net.b bVar, Intent intent) {
        Message message;
        try {
            String stringExtra = intent.getStringExtra("packageName");
            intent.getStringExtra("userInfo");
            intent.getStringExtra("appKey");
            intent.getStringExtra("sid");
            intent.getStringExtra("anti_brush_cookie");
            message = a(stringExtra);
            try {
                message.X = bVar.m;
                a(bVar, message);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            message = null;
            ALog.e("Msg", "buildUnbindUser", e, new Object[0]);
            return message;
        }
        return message;
    }

    public static Message b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.P = 1;
        message.a(1, ReqType.DATA, 1);
        message.s = str;
        message.H = str2;
        message.n = "3|dm|";
        message.t = 6;
        message.s = str;
        message.H = str2;
        message.D = 221;
        message.O = "ctrl_unbindservice";
        return message;
    }

    public static Message c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Message message = new Message();
        message.P = 1;
        message.a(1, ReqType.DATA, 1);
        message.s = str;
        message.G = str2;
        message.n = "3|dm|";
        message.t = 3;
        message.s = str;
        message.G = str2;
        message.D = 221;
        message.O = "ctrl_binduser";
        return message;
    }

    public static Message a(com.taobao.accs.net.b bVar, String str) {
        Message message;
        try {
            ALog.e("Msg", "buildUnbindApp" + UtilityImpl.a((Throwable) new Exception()), new Object[0]);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            message = new Message();
            try {
                message.P = 1;
                message.a(1, ReqType.DATA, 1);
                message.s = str;
                message.n = "3|dm|";
                message.t = 2;
                message.s = str;
                message.D = 221;
                message.O = "ctrl_unbindapp";
                a(bVar, message);
            } catch (Exception e2) {
                e = e2;
            }
            return message;
        } catch (Exception e3) {
            e = e3;
            message = null;
            ALog.e("Msg", "buildUnbindApp", e.getMessage());
            return message;
        }
    }

    public static Message a(com.taobao.accs.net.b bVar, Context context, Intent intent) {
        Message message;
        try {
            String stringExtra = intent.getStringExtra("packageName");
            intent.getStringExtra("userInfo");
            String stringExtra2 = intent.getStringExtra("appKey");
            String stringExtra3 = intent.getStringExtra("ttid");
            intent.getStringExtra("sid");
            intent.getStringExtra("anti_brush_cookie");
            Context context2 = context;
            message = a(context2, bVar.m, stringExtra2, intent.getStringExtra("app_sercet"), stringExtra, stringExtra3, intent.getStringExtra("appVersion"));
            try {
                a(bVar, message);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            message = null;
            ALog.e("Msg", "buildBindApp", e.getMessage());
            return message;
        }
        return message;
    }

    public static Message a(com.taobao.accs.net.b bVar, Context context, String str, ACCSManager.AccsRequest accsRequest) {
        return a(bVar, context, str, accsRequest, true);
    }

    public static Message a(com.taobao.accs.net.b bVar, Context context, String str, ACCSManager.AccsRequest accsRequest, boolean z2) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.P = 1;
        message.a(1, ReqType.DATA, 1);
        message.t = 100;
        message.s = str;
        message.H = accsRequest.serviceId;
        message.G = accsRequest.userId;
        message.N = accsRequest.data;
        if (TextUtils.isEmpty(accsRequest.targetServiceName)) {
            str2 = accsRequest.serviceId;
        } else {
            str2 = accsRequest.targetServiceName;
        }
        StringBuilder sb = new StringBuilder("2|");
        sb.append(str2);
        sb.append("|");
        if (accsRequest.target == null) {
            str3 = "";
        } else {
            str3 = accsRequest.target;
        }
        sb.append(str3);
        message.n = sb.toString();
        message.O = accsRequest.dataId;
        message.V = accsRequest.businessId;
        if (accsRequest.timeout > 0) {
            message.S = accsRequest.timeout;
        }
        if (z2) {
            a(bVar, message, accsRequest);
        } else {
            message.f78931f = accsRequest.host;
        }
        String userId = GlobalClientInfo.getInstance(context).getUserId(bVar.m);
        Message message2 = message;
        a(message2, GlobalClientInfo.getInstance(context).getSid(bVar.m), userId, bVar.i.getStoreId(), GlobalClientInfo.f78905c, accsRequest.businessId, accsRequest.tag);
        message.W = new NetPerformanceMonitor();
        message.W.setMsgType(0);
        message.W.setDataId(accsRequest.dataId);
        message.W.setServiceId(accsRequest.serviceId);
        message.W.setHost(message.f78931f.toString());
        message.X = bVar.m;
        return message;
    }

    public static Message a(com.taobao.accs.net.b bVar, Context context, String str, String str2, ACCSManager.AccsRequest accsRequest, boolean z2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Message message = new Message();
        message.P = 1;
        message.a(1, ReqType.REQ, 1);
        message.t = 100;
        message.s = str;
        message.H = accsRequest.serviceId;
        message.G = accsRequest.userId;
        message.N = accsRequest.data;
        if (TextUtils.isEmpty(accsRequest.targetServiceName)) {
            str3 = accsRequest.serviceId;
        } else {
            str3 = accsRequest.targetServiceName;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str3);
        sb.append("|");
        if (accsRequest.target == null) {
            str4 = "";
        } else {
            str4 = accsRequest.target;
        }
        sb.append(str4);
        message.n = sb.toString();
        message.O = accsRequest.dataId;
        message.V = accsRequest.businessId;
        message.X = bVar.m;
        if (accsRequest.timeout > 0) {
            message.S = accsRequest.timeout;
        }
        if (z2) {
            a(bVar, message, accsRequest);
        } else {
            message.f78931f = accsRequest.host;
        }
        String userId = GlobalClientInfo.getInstance(context).getUserId(bVar.m);
        Message message2 = message;
        a(message2, GlobalClientInfo.getInstance(context).getSid(bVar.m), userId, bVar.i.getStoreId(), GlobalClientInfo.f78905c, accsRequest.businessId, accsRequest.tag);
        message.W = new NetPerformanceMonitor();
        message.W.setDataId(accsRequest.dataId);
        message.W.setServiceId(accsRequest.serviceId);
        message.W.setHost(message.f78931f.toString());
        message.X = bVar.m;
        return message;
    }

    public static Message a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String str8 = null;
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        Message message = new Message();
        message.P = 1;
        message.a(1, ReqType.DATA, 1);
        message.x = 1;
        message.y = Build.VERSION.SDK_INT;
        message.s = str4;
        message.n = "3|dm|";
        message.t = 1;
        message.v = str2;
        message.w = UtilityImpl.a(context, str2, str3, UtilityImpl.l(context), str);
        message.D = 221;
        message.C = str6;
        message.s = str4;
        message.E = str5;
        message.I = Build.MODEL;
        message.J = Build.BRAND;
        message.O = "ctrl_bindapp";
        message.X = str;
        message.B = new d.a().a("notifyEnable", UtilityImpl.r(context)).a("romInfo", new com.taobao.accs.utl.c().a()).a().toString();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str7 = telephonyManager.getDeviceId();
            } else {
                str7 = null;
            }
            message.K = str7;
            if (telephonyManager != null) {
                str8 = telephonyManager.getSubscriberId();
            }
            message.L = str8;
        } catch (Throwable th) {
            ALog.w("Msg", "buildBindApp imei", th.getMessage());
        }
        return message;
    }

    public static Message a(com.taobao.accs.net.b bVar, String str, String str2, String str3, boolean z2, short s2, String str4, Map<Integer, String> map) {
        URL url;
        Message message = new Message();
        message.P = 1;
        message.a(s2, z2);
        message.o = str;
        message.n = str2;
        message.q = str3;
        message.f78928c = true;
        message.r = map;
        try {
            if (TextUtils.isEmpty(str4)) {
                message.f78931f = new URL(bVar.b((String) null));
            } else {
                message.f78931f = new URL(str4);
            }
            message.X = bVar.m;
            if (message.f78931f == null) {
                try {
                    url = new URL(bVar.b((String) null));
                    message.f78931f = url;
                } catch (MalformedURLException unused) {
                }
            }
        } catch (Throwable th) {
            if (message.f78931f == null) {
                try {
                    message.f78931f = new URL(bVar.b((String) null));
                } catch (MalformedURLException unused2) {
                }
            }
            throw th;
        }
        return message;
    }
}
