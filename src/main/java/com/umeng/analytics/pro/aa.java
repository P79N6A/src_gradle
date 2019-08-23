package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;

public class aa {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f80332a = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private final int f80333b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final int f80334c;

    /* renamed from: d  reason: collision with root package name */
    private String f80335d = "1.0";

    /* renamed from: e  reason: collision with root package name */
    private String f80336e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f80337f;
    private byte[] g;
    private byte[] h;
    private int i;
    private int j;
    private int k;
    private byte[] l;
    private byte[] m;
    private boolean n;

    public String a() {
        return bt.a(this.f80337f);
    }

    private byte[] d() {
        return a(this.f80332a, (int) (System.currentTimeMillis() / 1000));
    }

    private byte[] e() {
        return bt.b((bt.a(this.f80337f) + this.i + this.j + this.k + bt.a(this.g)).getBytes());
    }

    public void b() {
        if (this.f80337f == null) {
            this.f80337f = d();
        }
        if (this.n) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.f80337f, 1, bArr, 0, 16);
                this.l = bt.a(this.l, bArr);
            } catch (Exception unused) {
            }
        }
        this.g = a(this.f80337f, this.j);
        this.h = e();
    }

    public byte[] c() {
        bq bqVar = new bq();
        bqVar.a(this.f80335d);
        bqVar.b(this.f80336e);
        bqVar.c(bt.a(this.f80337f));
        bqVar.a(this.i);
        bqVar.c(this.j);
        bqVar.d(this.k);
        bqVar.a(this.l);
        bqVar.e(this.n ? 1 : 0);
        bqVar.d(bt.a(this.g));
        bqVar.e(bt.a(this.h));
        try {
            return new cp().a(bqVar);
        } catch (Exception unused) {
            return null;
        }
    }

    public String toString() {
        return String.format("version : %s\n", new Object[]{this.f80335d}) + String.format("address : %s\n", new Object[]{this.f80336e}) + String.format("signature : %s\n", new Object[]{bt.a(this.f80337f)}) + String.format("serial : %s\n", new Object[]{Integer.valueOf(this.i)}) + String.format("timestamp : %d\n", new Object[]{Integer.valueOf(this.j)}) + String.format("length : %d\n", new Object[]{Integer.valueOf(this.k)}) + String.format("guid : %s\n", new Object[]{bt.a(this.g)}) + String.format("checksum : %s ", new Object[]{bt.a(this.h)}) + String.format("codex : %d", new Object[]{Integer.valueOf(this.n ? 1 : 0)});
    }

    public void a(int i2) {
        this.i = i2;
    }

    public static String a(Context context) {
        SharedPreferences a2 = ba.a(context);
        if (a2 == null) {
            return null;
        }
        return a2.getString("signature", null);
    }

    public void a(String str) {
        this.f80337f = bt.a(str);
    }

    public void a(boolean z) {
        this.n = z;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0065 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007a A[Catch:{ Throwable -> 0x0096 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f80336e
            com.umeng.analytics.pro.af r1 = com.umeng.analytics.pro.af.a((android.content.Context) r9)
            com.umeng.analytics.pro.af$a r1 = r1.b()
            r2 = 0
            java.lang.String r1 = r1.g(r2)
            byte[] r2 = r8.f80337f
            java.lang.String r2 = com.umeng.analytics.pro.bt.a((byte[]) r2)
            r3 = 16
            byte[] r4 = new byte[r3]
            byte[] r5 = r8.f80337f
            r6 = 2
            r7 = 0
            java.lang.System.arraycopy(r5, r6, r4, r7, r3)
            byte[] r3 = com.umeng.analytics.pro.bt.b((byte[]) r4)
            java.lang.String r3 = com.umeng.analytics.pro.bt.a((byte[]) r3)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0065 }
            r4.<init>()     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "appkey"
            r4.put(r5, r0)     // Catch:{ Throwable -> 0x0065 }
            if (r1 == 0) goto L_0x0039
            java.lang.String r5 = "umid"
            r4.put(r5, r1)     // Catch:{ Throwable -> 0x0065 }
        L_0x0039:
            java.lang.String r5 = "signature"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r2 = "checksum"
            r4.put(r2, r3)     // Catch:{ Throwable -> 0x0065 }
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x0065 }
            java.io.File r3 = r9.getFilesDir()     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = ".umeng"
            r2.<init>(r3, r5)     // Catch:{ Throwable -> 0x0065 }
            boolean r3 = r2.exists()     // Catch:{ Throwable -> 0x0065 }
            if (r3 != 0) goto L_0x0057
            r2.mkdir()     // Catch:{ Throwable -> 0x0065 }
        L_0x0057:
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "exchangeIdentity.json"
            r3.<init>(r2, r5)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r2 = r4.toString()     // Catch:{ Throwable -> 0x0065 }
            com.umeng.analytics.pro.bw.a((java.io.File) r3, (java.lang.String) r2)     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0096 }
            r2.<init>()     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r3 = "appkey"
            r2.put(r3, r0)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r0 = "channel"
            java.lang.String r3 = com.umeng.analytics.AnalyticsConfig.getChannel(r9)     // Catch:{ Throwable -> 0x0096 }
            r2.put(r0, r3)     // Catch:{ Throwable -> 0x0096 }
            if (r1 == 0) goto L_0x0083
            java.lang.String r0 = "umid"
            java.lang.String r1 = com.umeng.analytics.pro.bw.b((java.lang.String) r1)     // Catch:{ Throwable -> 0x0096 }
            r2.put(r0, r1)     // Catch:{ Throwable -> 0x0096 }
        L_0x0083:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0096 }
            java.io.File r9 = r9.getFilesDir()     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r1 = "exid.dat"
            r0.<init>(r9, r1)     // Catch:{ Throwable -> 0x0096 }
            java.lang.String r9 = r2.toString()     // Catch:{ Throwable -> 0x0096 }
            com.umeng.analytics.pro.bw.a((java.io.File) r0, (java.lang.String) r9)     // Catch:{ Throwable -> 0x0096 }
            return
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.aa.b(android.content.Context):void");
    }

    private byte[] a(byte[] bArr, int i2) {
        byte[] b2 = bt.b(this.m);
        byte[] b3 = bt.b(this.l);
        int length = b2.length;
        byte[] bArr2 = new byte[(length * 2)];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr2[i4] = b3[i3];
            bArr2[i4 + 1] = b2[i3];
        }
        for (int i5 = 0; i5 < 2; i5++) {
            bArr2[i5] = bArr[i5];
            bArr2[(bArr2.length - i5) - 1] = bArr[(bArr.length - i5) - 1];
        }
        byte[] bArr3 = {(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) (i2 >>> 24)};
        for (int i6 = 0; i6 < bArr2.length; i6++) {
            bArr2[i6] = (byte) (bArr2[i6] ^ bArr3[i6 % 4]);
        }
        return bArr2;
    }

    private aa(byte[] bArr, String str, byte[] bArr2) throws Exception {
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.f80336e = str;
        this.k = bArr.length;
        this.l = bu.a(bArr);
        this.j = (int) (System.currentTimeMillis() / 1000);
        this.m = bArr2;
    }

    public static aa a(Context context, String str, byte[] bArr) {
        try {
            String q = bv.q(context);
            String c2 = bv.c(context);
            SharedPreferences a2 = ba.a(context);
            String string = a2.getString("signature", null);
            int i2 = a2.getInt("serial", 1);
            aa aaVar = new aa(bArr, str, (c2 + q).getBytes());
            aaVar.a(string);
            aaVar.a(i2);
            aaVar.b();
            a2.edit().putInt("serial", i2 + 1).putString("signature", aaVar.a()).commit();
            aaVar.b(context);
            return aaVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static aa b(Context context, String str, byte[] bArr) {
        try {
            String q = bv.q(context);
            String c2 = bv.c(context);
            SharedPreferences a2 = ba.a(context);
            String string = a2.getString("signature", null);
            int i2 = a2.getInt("serial", 1);
            aa aaVar = new aa(bArr, str, (c2 + q).getBytes());
            aaVar.a(true);
            aaVar.a(string);
            aaVar.a(i2);
            aaVar.b();
            a2.edit().putInt("serial", i2 + 1).putString("signature", aaVar.a()).commit();
            aaVar.b(context);
            return aaVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
