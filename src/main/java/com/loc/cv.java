package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import java.util.List;
import org.json.JSONObject;

public final class cv {

    /* renamed from: b  reason: collision with root package name */
    static bv f25719b;

    /* renamed from: e  reason: collision with root package name */
    static n f25720e;
    static long g;

    /* renamed from: a  reason: collision with root package name */
    String f25721a;

    /* renamed from: c  reason: collision with root package name */
    bv f25722c;

    /* renamed from: d  reason: collision with root package name */
    bv f25723d;

    /* renamed from: f  reason: collision with root package name */
    long f25724f;
    boolean h;
    private Context i;

    public cv(Context context) {
        this.i = context.getApplicationContext();
    }

    private void e() {
        if (f25719b == null || cn.b() - g > 180000) {
            bv f2 = f();
            g = cn.b();
            if (f2 != null && cn.a(f2.f25597d)) {
                f25719b = f2;
            }
        }
    }

    private bv f() {
        bv bvVar;
        Throwable th;
        String str;
        byte[] b2;
        byte[] d2;
        String str2 = null;
        if (this.i == null) {
            return null;
        }
        a();
        try {
            if (f25720e == null) {
                return null;
            }
            List<bv> b3 = f25720e.b("_id=1", bv.class);
            if (b3 == null || b3.size() <= 0) {
                bvVar = null;
            } else {
                bvVar = b3.get(0);
                try {
                    byte[] b4 = dd.b(bvVar.f25594a);
                    if (b4 != null && b4.length > 0) {
                        byte[] d3 = bt.d(b4, this.f25721a);
                        if (d3 != null && d3.length > 0) {
                            str = new String(d3, "UTF-8");
                            b2 = dd.b(bvVar.f25596c);
                            if (b2 != null && b2.length > 0) {
                                d2 = bt.d(b2, this.f25721a);
                                if (d2 != null && d2.length > 0) {
                                    str2 = new String(d2, "UTF-8");
                                }
                            }
                            bvVar.f25596c = str2;
                            str2 = str;
                        }
                    }
                    str = null;
                    b2 = dd.b(bvVar.f25596c);
                    d2 = bt.d(b2, this.f25721a);
                    str2 = new String(d2, "UTF-8");
                    bvVar.f25596c = str2;
                    str2 = str;
                } catch (Throwable th2) {
                    th = th2;
                    ce.a(th, "LastLocationManager", "readLastFix");
                    return bvVar;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                AMapLocation aMapLocation = new AMapLocation("");
                ce.a(aMapLocation, new JSONObject(str2));
                if (cn.b(aMapLocation)) {
                    bvVar.f25597d = aMapLocation;
                }
            }
            return bvVar;
        } catch (Throwable th3) {
            th = th3;
            bvVar = null;
            ce.a(th, "LastLocationManager", "readLastFix");
            return bvVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (com.loc.cn.a(f25719b.f25596c, r9) != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f A[Catch:{ Throwable -> 0x006a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.amap.api.location.AMapLocation a(com.amap.api.location.AMapLocation r8, java.lang.String r9, long r10) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return r8
        L_0x0003:
            int r0 = r8.getErrorCode()
            if (r0 == 0) goto L_0x0072
            int r0 = r8.getLocationType()
            r1 = 1
            if (r0 == r1) goto L_0x0072
            int r0 = r8.getErrorCode()
            r2 = 7
            if (r0 != r2) goto L_0x0018
            goto L_0x0072
        L_0x0018:
            r7.e()     // Catch:{ Throwable -> 0x006a }
            com.loc.bv r0 = f25719b     // Catch:{ Throwable -> 0x006a }
            if (r0 == 0) goto L_0x0069
            com.loc.bv r0 = f25719b     // Catch:{ Throwable -> 0x006a }
            com.amap.api.location.AMapLocation r0 = r0.f25597d     // Catch:{ Throwable -> 0x006a }
            if (r0 != 0) goto L_0x0026
            goto L_0x0069
        L_0x0026:
            r0 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x006a }
            if (r2 == 0) goto L_0x0042
            long r2 = com.loc.cn.b()     // Catch:{ Throwable -> 0x006a }
            com.loc.bv r9 = f25719b     // Catch:{ Throwable -> 0x006a }
            long r4 = r9.f25595b     // Catch:{ Throwable -> 0x006a }
            r9 = 0
            long r2 = r2 - r4
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x004d
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x004d
            goto L_0x004c
        L_0x0042:
            com.loc.bv r10 = f25719b     // Catch:{ Throwable -> 0x006a }
            java.lang.String r10 = r10.f25596c     // Catch:{ Throwable -> 0x006a }
            boolean r9 = com.loc.cn.a((java.lang.String) r10, (java.lang.String) r9)     // Catch:{ Throwable -> 0x006a }
            if (r9 == 0) goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            if (r0 == 0) goto L_0x0072
            com.loc.bv r9 = f25719b     // Catch:{ Throwable -> 0x006a }
            com.amap.api.location.AMapLocation r9 = r9.f25597d     // Catch:{ Throwable -> 0x006a }
            r10 = 9
            r9.setLocationType(r10)     // Catch:{ Throwable -> 0x0064 }
            r9.setFixLastLocation(r1)     // Catch:{ Throwable -> 0x0064 }
            java.lang.String r8 = r8.getLocationDetail()     // Catch:{ Throwable -> 0x0064 }
            r9.setLocationDetail(r8)     // Catch:{ Throwable -> 0x0064 }
            r8 = r9
            goto L_0x0072
        L_0x0064:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x006b
        L_0x0069:
            return r8
        L_0x006a:
            r9 = move-exception
        L_0x006b:
            java.lang.String r10 = "LastLocationManager"
            java.lang.String r11 = "fixLastLocation"
            com.loc.ce.a(r9, r10, r11)
        L_0x0072:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cv.a(com.amap.api.location.AMapLocation, java.lang.String, long):com.amap.api.location.AMapLocation");
    }

    public final void a() {
        if (!this.h) {
            try {
                if (this.f25721a == null) {
                    this.f25721a = bt.a("MD5", dc.u(this.i));
                }
                if (f25720e == null) {
                    f25720e = new n(this.i, n.a(bw.class), cn.e());
                }
            } catch (Throwable th) {
                ce.a(th, "LastLocationManager", "<init>:DBOperation");
            }
            this.h = true;
        }
    }

    public final boolean a(AMapLocation aMapLocation, String str) {
        if (this.i != null && aMapLocation != null && cn.a(aMapLocation) && aMapLocation.getLocationType() != 2 && !aMapLocation.isMock() && !aMapLocation.isFixLastLocation()) {
            bv bvVar = new bv();
            bvVar.f25597d = aMapLocation;
            if (aMapLocation.getLocationType() == 1) {
                bvVar.f25596c = null;
            } else {
                bvVar.f25596c = str;
            }
            try {
                f25719b = bvVar;
                g = cn.b();
                this.f25722c = bvVar;
                if ((this.f25723d == null || cn.a(this.f25723d.f25597d, bvVar.f25597d) > 500.0f) && cn.b() - this.f25724f > 30000) {
                    return true;
                }
            } catch (Throwable th) {
                ce.a(th, "LastLocationManager", "setLastFix");
            }
        }
        return false;
    }

    public final AMapLocation b() {
        e();
        if (f25719b != null && cn.a(f25719b.f25597d)) {
            return f25719b.f25597d;
        }
        return null;
    }

    public final void c() {
        try {
            d();
            this.f25724f = 0;
            this.h = false;
            this.f25722c = null;
            this.f25723d = null;
        } catch (Throwable th) {
            ce.a(th, "LastLocationManager", "destroy");
        }
    }

    public final void d() {
        String str;
        try {
            a();
            if (!(this.f25722c == null || !cn.a(this.f25722c.f25597d) || f25720e == null || this.f25722c == this.f25723d)) {
                if (this.f25722c.f25595b == 0) {
                    String str2 = this.f25722c.f25597d.toStr();
                    String str3 = this.f25722c.f25596c;
                    this.f25723d = this.f25722c;
                    String str4 = null;
                    if (!TextUtils.isEmpty(str2)) {
                        str = dd.b(bt.c(str2.getBytes("UTF-8"), this.f25721a));
                        if (!TextUtils.isEmpty(str3)) {
                            str4 = dd.b(bt.c(str3.getBytes("UTF-8"), this.f25721a));
                        }
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bv bvVar = new bv();
                        bvVar.f25594a = str;
                        bvVar.f25595b = cn.b();
                        bvVar.f25596c = str4;
                        f25720e.a((Object) bvVar, "_id=1");
                        this.f25724f = cn.b();
                        if (f25719b != null) {
                            f25719b.f25595b = cn.b();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            ce.a(th, "LastLocationManager", "saveLastFix");
        }
    }
}
