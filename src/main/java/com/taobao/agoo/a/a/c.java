package com.taobao.agoo.a.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.d;

public class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public String f79122a;

    /* renamed from: b  reason: collision with root package name */
    public String f79123b;

    /* renamed from: c  reason: collision with root package name */
    public String f79124c;

    /* renamed from: d  reason: collision with root package name */
    public String f79125d = "221";

    /* renamed from: f  reason: collision with root package name */
    public String f79126f;
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

    public byte[] a() {
        try {
            String jSONObject = new d.a().a("cmd", this.f79121e).a("appKey", this.f79122a).a("utdid", this.f79123b).a("appVersion", this.f79124c).a("sdkVersion", this.f79125d).a("ttid", this.f79126f).a("packageName", this.g).a("notifyEnable", this.h).a("romInfo", this.i).a("c0", this.j).a("c1", this.k).a("c2", this.l).a("c3", this.m).a("c4", this.n).a("c5", this.o).a("c6", this.p).a().toString();
            ALog.i("RegisterDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.e("RegisterDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        if (r6 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            java.lang.String r3 = com.taobao.accs.utl.UtilityImpl.l(r8)     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            java.lang.String r4 = r8.getPackageName()     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            com.taobao.accs.client.GlobalClientInfo r5 = com.taobao.accs.client.GlobalClientInfo.getInstance(r8)     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            android.content.pm.PackageInfo r5 = r5.getPackageInfo()     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            java.lang.String r5 = r5.versionName     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            if (r6 != 0) goto L_0x0073
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            if (r6 != 0) goto L_0x0073
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            if (r6 == 0) goto L_0x0028
            goto L_0x0073
        L_0x0028:
            com.taobao.agoo.a.a.c r6 = new com.taobao.agoo.a.a.c     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            r6.<init>()     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            java.lang.String r7 = "register"
            r6.f79121e = r7     // Catch:{ Throwable -> 0x0071 }
            r6.f79122a = r9     // Catch:{ Throwable -> 0x0071 }
            r6.f79123b = r3     // Catch:{ Throwable -> 0x0071 }
            r6.f79124c = r5     // Catch:{ Throwable -> 0x0071 }
            r6.f79126f = r10     // Catch:{ Throwable -> 0x0071 }
            r6.g = r4     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r9 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x0071 }
            r6.j = r9     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x0071 }
            r6.k = r9     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r9 = com.taobao.accs.utl.a.d(r8)     // Catch:{ Throwable -> 0x0071 }
            r6.h = r9     // Catch:{ Throwable -> 0x0071 }
            com.taobao.accs.utl.c r9 = new com.taobao.accs.utl.c     // Catch:{ Throwable -> 0x0071 }
            r9.<init>()     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r9 = r9.a()     // Catch:{ Throwable -> 0x0071 }
            r6.i = r9     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r9 = "phone"
            java.lang.Object r8 = r8.getSystemService(r9)     // Catch:{ Throwable -> 0x0071 }
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8     // Catch:{ Throwable -> 0x0071 }
            if (r8 == 0) goto L_0x0063
            java.lang.String r9 = r8.getDeviceId()     // Catch:{ Throwable -> 0x0071 }
            goto L_0x0064
        L_0x0063:
            r9 = r2
        L_0x0064:
            r6.l = r9     // Catch:{ Throwable -> 0x0071 }
            if (r8 == 0) goto L_0x006d
            java.lang.String r8 = r8.getSubscriberId()     // Catch:{ Throwable -> 0x0071 }
            goto L_0x006e
        L_0x006d:
            r8 = r2
        L_0x006e:
            r6.m = r8     // Catch:{ Throwable -> 0x0071 }
            goto L_0x00aa
        L_0x0071:
            r8 = move-exception
            goto L_0x0099
        L_0x0073:
            java.lang.String r8 = "RegisterDO"
            java.lang.String r10 = "buildRegister param null"
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            java.lang.String r6 = "appKey"
            r4[r0] = r6     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            r4[r1] = r9     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            r9 = 2
            java.lang.String r6 = "utdid"
            r4[r9] = r6     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            r9 = 3
            r4[r9] = r3     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            r9 = 4
            java.lang.String r3 = "appVersion"
            r4[r9] = r3     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            r9 = 5
            r4[r9] = r5     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            com.taobao.accs.utl.ALog.e(r8, r10, r4)     // Catch:{ Throwable -> 0x0097, all -> 0x0094 }
            return r2
        L_0x0094:
            r8 = move-exception
            r6 = r2
            goto L_0x00b0
        L_0x0097:
            r8 = move-exception
            r6 = r2
        L_0x0099:
            java.lang.String r9 = "RegisterDO"
            java.lang.String r10 = "buildRegister"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00af }
            java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00af }
            r1[r0] = r8     // Catch:{ all -> 0x00af }
            com.taobao.accs.utl.ALog.w(r9, r10, r1)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x00ae
        L_0x00aa:
            byte[] r2 = r6.a()
        L_0x00ae:
            return r2
        L_0x00af:
            r8 = move-exception
        L_0x00b0:
            if (r6 == 0) goto L_0x00b5
            r6.a()
        L_0x00b5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.agoo.a.a.c.a(android.content.Context, java.lang.String, java.lang.String):byte[]");
    }
}
