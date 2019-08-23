package com.amap.api.mapcore2d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"NewApi"})
public final class fw {

    /* renamed from: b  reason: collision with root package name */
    static ArrayList<fv> f6190b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    static long f6191d = 0;

    /* renamed from: e  reason: collision with root package name */
    static CellLocation f6192e;
    private static ArrayList<fv> k = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    int f6193a;

    /* renamed from: c  reason: collision with root package name */
    TelephonyManager f6194c;

    /* renamed from: f  reason: collision with root package name */
    String f6195f;
    boolean g;
    StringBuilder h;
    private Context i;
    private String j;
    private int l = -113;
    private fu m;
    private Object n;
    private int o;

    public fw(Context context) {
        this.i = context;
        if (this.f6194c == null) {
            this.f6194c = (TelephonyManager) gf.a(this.i, "phone");
        }
        i();
        this.m = new fu();
    }

    private CellLocation a(Object obj, String str, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            Object a2 = gd.a(obj, str, objArr);
            CellLocation cellLocation = a2 != null ? (CellLocation) a2 : null;
            if (a(cellLocation)) {
                return cellLocation;
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"NewApi"})
    private CellLocation a(List<CellInfo> list) {
        fv fvVar;
        GsmCellLocation gsmCellLocation;
        fv a2;
        CdmaCellLocation cdmaCellLocation = null;
        if (list != null && !list.isEmpty()) {
            ArrayList<fv> arrayList = k;
            fu fuVar = this.m;
            int size = list.size();
            if (size != 0) {
                if (arrayList != null) {
                    arrayList.clear();
                }
                fvVar = null;
                for (int i2 = 0; i2 < size; i2++) {
                    CellInfo cellInfo = list.get(i2);
                    if (cellInfo != null) {
                        try {
                            boolean isRegistered = cellInfo.isRegistered();
                            if (cellInfo instanceof CellInfoCdma) {
                                CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                                if (a(cellInfoCdma.getCellIdentity())) {
                                    a2 = a(cellInfoCdma, isRegistered);
                                    try {
                                        a2.l = (short) ((int) Math.min(65535, fuVar.a(a2)));
                                    } catch (Throwable unused) {
                                    }
                                }
                            } else if (cellInfo instanceof CellInfoGsm) {
                                CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                                if (a(cellInfoGsm.getCellIdentity())) {
                                    a2 = a(cellInfoGsm, isRegistered);
                                    a2.l = (short) ((int) Math.min(65535, fuVar.a(a2)));
                                }
                            } else if (cellInfo instanceof CellInfoWcdma) {
                                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                                if (a(cellInfoWcdma.getCellIdentity())) {
                                    a2 = a(cellInfoWcdma, isRegistered);
                                    a2.l = (short) ((int) Math.min(65535, fuVar.a(a2)));
                                }
                            } else if (cellInfo instanceof CellInfoLte) {
                                CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                                if (a(cellInfoLte.getCellIdentity())) {
                                    a2 = a(cellInfoLte, isRegistered);
                                    a2.l = (short) ((int) Math.min(65535, fuVar.a(a2)));
                                }
                            }
                            arrayList.add(a2);
                            fvVar = a2;
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } else {
                fvVar = null;
            }
            if (arrayList == null || arrayList.size() <= 0) {
                gsmCellLocation = null;
            } else {
                this.f6193a |= 4;
                fuVar.a((ArrayList) arrayList);
                fv fvVar2 = arrayList.get(arrayList.size() - 1);
                if (fvVar2 == null || fvVar2.k != 2) {
                    gsmCellLocation = new GsmCellLocation();
                    gsmCellLocation.setLacAndCid(fvVar.f6186c, fvVar.f6187d);
                } else {
                    CdmaCellLocation cdmaCellLocation2 = new CdmaCellLocation();
                    cdmaCellLocation2.setCellLocationData(fvVar2.i, fvVar2.f6188e, fvVar2.f6189f, fvVar2.g, fvVar2.h);
                    gsmCellLocation = null;
                    cdmaCellLocation = cdmaCellLocation2;
                }
            }
            if (cdmaCellLocation == null) {
                return gsmCellLocation;
            }
        }
        return cdmaCellLocation;
    }

    private static fv a(int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        fv fvVar = new fv(i2, z);
        fvVar.f6184a = i3;
        fvVar.f6185b = i4;
        fvVar.f6186c = i5;
        fvVar.f6187d = i6;
        fvVar.j = i7;
        return fvVar;
    }

    @SuppressLint({"NewApi"})
    private fv a(CellInfoCdma cellInfoCdma, boolean z) {
        int i2;
        int i3;
        int i4;
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        String[] a2 = gf.a(this.f6194c);
        try {
            i4 = Integer.parseInt(a2[0]);
            try {
                i2 = Integer.parseInt(a2[1]);
                i3 = i4;
            } catch (Throwable unused) {
                i3 = i4;
                i2 = 0;
                fv a3 = a(2, z, i3, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
                a3.g = cellIdentity.getSystemId();
                a3.h = cellIdentity.getNetworkId();
                a3.i = cellIdentity.getBasestationId();
                a3.f6188e = cellIdentity.getLatitude();
                a3.f6189f = cellIdentity.getLongitude();
                return a3;
            }
        } catch (Throwable unused2) {
            i4 = 0;
            i3 = i4;
            i2 = 0;
            fv a32 = a(2, z, i3, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
            a32.g = cellIdentity.getSystemId();
            a32.h = cellIdentity.getNetworkId();
            a32.i = cellIdentity.getBasestationId();
            a32.f6188e = cellIdentity.getLatitude();
            a32.f6189f = cellIdentity.getLongitude();
            return a32;
        }
        fv a322 = a(2, z, i3, i2, 0, 0, cellInfoCdma.getCellSignalStrength().getCdmaDbm());
        a322.g = cellIdentity.getSystemId();
        a322.h = cellIdentity.getNetworkId();
        a322.i = cellIdentity.getBasestationId();
        a322.f6188e = cellIdentity.getLatitude();
        a322.f6189f = cellIdentity.getLongitude();
        return a322;
    }

    @SuppressLint({"NewApi"})
    private static fv a(CellInfoGsm cellInfoGsm, boolean z) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        return a(1, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoGsm.getCellSignalStrength().getDbm());
    }

    @SuppressLint({"NewApi"})
    private static fv a(CellInfoLte cellInfoLte, boolean z) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        return a(3, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getTac(), cellIdentity.getCi(), cellInfoLte.getCellSignalStrength().getDbm());
    }

    @SuppressLint({"NewApi"})
    private static fv a(CellInfoWcdma cellInfoWcdma, boolean z) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        return a(4, z, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), cellInfoWcdma.getCellSignalStrength().getDbm());
    }

    private static fv a(NeighboringCellInfo neighboringCellInfo, String[] strArr) {
        try {
            fv fvVar = new fv(1, false);
            fvVar.f6184a = Integer.parseInt(strArr[0]);
            fvVar.f6185b = Integer.parseInt(strArr[1]);
            fvVar.f6186c = gd.b(neighboringCellInfo, "getLac", new Object[0]);
            fvVar.f6187d = neighboringCellInfo.getCid();
            fvVar.j = gf.a(neighboringCellInfo.getRssi());
            return fvVar;
        } catch (Throwable th) {
            gc.a(th, "CgiManager", "getGsm");
            return null;
        }
    }

    public static ArrayList<fv> a() {
        return f6190b;
    }

    private void a(CellLocation cellLocation, String[] strArr) {
        if (!(cellLocation == null || this.f6194c == null)) {
            f6190b.clear();
            if (a(cellLocation)) {
                this.f6193a = 1;
                f6190b.add(c(cellLocation, strArr));
                List<NeighboringCellInfo> neighboringCellInfo = this.f6194c.getNeighboringCellInfo();
                if (neighboringCellInfo != null && !neighboringCellInfo.isEmpty()) {
                    for (NeighboringCellInfo neighboringCellInfo2 : neighboringCellInfo) {
                        if (neighboringCellInfo2 != null && a(neighboringCellInfo2.getLac(), neighboringCellInfo2.getCid())) {
                            fv a2 = a(neighboringCellInfo2, strArr);
                            if (a2 != null && !f6190b.contains(a2)) {
                                f6190b.add(a2);
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean a(int i2) {
        return i2 > 0 && i2 <= 15;
    }

    private static boolean a(int i2, int i3) {
        return (i2 == -1 || i2 == 0 || i2 > 65535 || i3 == -1 || i3 == 0 || i3 == 65535 || i3 >= 268435455) ? false : true;
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityCdma cellIdentityCdma) {
        return cellIdentityCdma != null && cellIdentityCdma.getSystemId() > 0 && cellIdentityCdma.getNetworkId() >= 0 && cellIdentityCdma.getBasestationId() >= 0;
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityGsm cellIdentityGsm) {
        return cellIdentityGsm != null && b(cellIdentityGsm.getLac()) && c(cellIdentityGsm.getCid());
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte != null && b(cellIdentityLte.getTac()) && c(cellIdentityLte.getCi());
    }

    @SuppressLint({"NewApi"})
    private static boolean a(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma != null && b(cellIdentityWcdma.getLac()) && c(cellIdentityWcdma.getCid());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.telephony.CellLocation r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            int r2 = r4.b((android.telephony.CellLocation) r5)
            switch(r2) {
                case 1: goto L_0x0033;
                case 2: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x004b
        L_0x000d:
            java.lang.String r2 = "getSystemId"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x002d }
            int r2 = com.amap.api.mapcore2d.gd.b(r5, r2, r3)     // Catch:{ Throwable -> 0x002d }
            if (r2 <= 0) goto L_0x002b
            java.lang.String r2 = "getNetworkId"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x002d }
            int r2 = com.amap.api.mapcore2d.gd.b(r5, r2, r3)     // Catch:{ Throwable -> 0x002d }
            if (r2 < 0) goto L_0x002b
            java.lang.String r2 = "getBaseStationId"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x002d }
            int r5 = com.amap.api.mapcore2d.gd.b(r5, r2, r3)     // Catch:{ Throwable -> 0x002d }
            if (r5 >= 0) goto L_0x004b
        L_0x002b:
            r1 = 0
            goto L_0x004b
        L_0x002d:
            r5 = move-exception
            java.lang.String r2 = "CgiManager"
            java.lang.String r3 = "cgiUseful Cgi.iCdmaT"
            goto L_0x0048
        L_0x0033:
            android.telephony.gsm.GsmCellLocation r5 = (android.telephony.gsm.GsmCellLocation) r5     // Catch:{ Throwable -> 0x0043 }
            int r2 = r5.getLac()     // Catch:{ Throwable -> 0x0043 }
            int r5 = r5.getCid()     // Catch:{ Throwable -> 0x0043 }
            boolean r5 = a((int) r2, (int) r5)     // Catch:{ Throwable -> 0x0043 }
            r1 = r5
            goto L_0x004b
        L_0x0043:
            r5 = move-exception
            java.lang.String r2 = "CgiManager"
            java.lang.String r3 = "cgiUseful Cgi.iGsmT"
        L_0x0048:
            com.amap.api.mapcore2d.gc.a(r5, r2, r3)
        L_0x004b:
            if (r1 != 0) goto L_0x004f
            r4.f6193a = r0
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fw.a(android.telephony.CellLocation):boolean");
    }

    private int b(CellLocation cellLocation) {
        if (this.g || cellLocation == null) {
            return 0;
        }
        if (cellLocation instanceof GsmCellLocation) {
            return 1;
        }
        try {
            Class.forName("android.telephony.cdma.CdmaCellLocation");
            return 2;
        } catch (Throwable th) {
            gc.a(th, "Utils", "getCellLocT");
            return 0;
        }
    }

    public static ArrayList<fv> b() {
        return k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.telephony.CellLocation r5, java.lang.String[] r6) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.ArrayList<com.amap.api.mapcore2d.fv> r0 = f6190b
            r0.clear()
            int r0 = com.amap.api.mapcore2d.gf.c()
            r1 = 5
            if (r0 >= r1) goto L_0x0010
            return
        L_0x0010:
            java.lang.Object r0 = r4.n     // Catch:{ Throwable -> 0x00c4 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.Class r0 = r5.getClass()     // Catch:{ Throwable -> 0x003c }
            java.lang.String r3 = "mGsmCellLoc"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ Throwable -> 0x003c }
            boolean r3 = r0.isAccessible()     // Catch:{ Throwable -> 0x003c }
            if (r3 != 0) goto L_0x0029
            r0.setAccessible(r1)     // Catch:{ Throwable -> 0x003c }
        L_0x0029:
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Throwable -> 0x003c }
            android.telephony.gsm.GsmCellLocation r0 = (android.telephony.gsm.GsmCellLocation) r0     // Catch:{ Throwable -> 0x003c }
            if (r0 == 0) goto L_0x003c
            boolean r3 = r4.a((android.telephony.CellLocation) r0)     // Catch:{ Throwable -> 0x003c }
            if (r3 == 0) goto L_0x003c
            r4.a((android.telephony.CellLocation) r0, (java.lang.String[]) r6)     // Catch:{ Throwable -> 0x003c }
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            return
        L_0x0040:
            boolean r0 = r4.a((android.telephony.CellLocation) r5)     // Catch:{ Throwable -> 0x00c4 }
            if (r0 != 0) goto L_0x0047
            return
        L_0x0047:
            r0 = 2
            r4.f6193a = r0     // Catch:{ Throwable -> 0x00c4 }
            com.amap.api.mapcore2d.fv r3 = new com.amap.api.mapcore2d.fv     // Catch:{ Throwable -> 0x00c4 }
            r3.<init>(r0, r1)     // Catch:{ Throwable -> 0x00c4 }
            r0 = r6[r2]     // Catch:{ Throwable -> 0x00c4 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x00c4 }
            r3.f6184a = r0     // Catch:{ Throwable -> 0x00c4 }
            r6 = r6[r1]     // Catch:{ Throwable -> 0x00c4 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Throwable -> 0x00c4 }
            r3.f6185b = r6     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r6 = "getSystemId"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x00c4 }
            int r6 = com.amap.api.mapcore2d.gd.b(r5, r6, r0)     // Catch:{ Throwable -> 0x00c4 }
            r3.g = r6     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r6 = "getNetworkId"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x00c4 }
            int r6 = com.amap.api.mapcore2d.gd.b(r5, r6, r0)     // Catch:{ Throwable -> 0x00c4 }
            r3.h = r6     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r6 = "getBaseStationId"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x00c4 }
            int r6 = com.amap.api.mapcore2d.gd.b(r5, r6, r0)     // Catch:{ Throwable -> 0x00c4 }
            r3.i = r6     // Catch:{ Throwable -> 0x00c4 }
            int r6 = r4.l     // Catch:{ Throwable -> 0x00c4 }
            r3.j = r6     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r6 = "getBaseStationLatitude"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x00c4 }
            int r6 = com.amap.api.mapcore2d.gd.b(r5, r6, r0)     // Catch:{ Throwable -> 0x00c4 }
            r3.f6188e = r6     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r6 = "getBaseStationLongitude"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x00c4 }
            int r5 = com.amap.api.mapcore2d.gd.b(r5, r6, r0)     // Catch:{ Throwable -> 0x00c4 }
            r3.f6189f = r5     // Catch:{ Throwable -> 0x00c4 }
            int r5 = r3.f6188e     // Catch:{ Throwable -> 0x00c4 }
            if (r5 < 0) goto L_0x00b2
            int r5 = r3.f6189f     // Catch:{ Throwable -> 0x00c4 }
            if (r5 < 0) goto L_0x00b2
            int r5 = r3.f6188e     // Catch:{ Throwable -> 0x00c4 }
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L_0x00b2
            int r5 = r3.f6189f     // Catch:{ Throwable -> 0x00c4 }
            if (r5 == r6) goto L_0x00b2
            int r5 = r3.f6188e     // Catch:{ Throwable -> 0x00c4 }
            int r6 = r3.f6189f     // Catch:{ Throwable -> 0x00c4 }
            if (r5 != r6) goto L_0x00b6
            int r5 = r3.f6188e     // Catch:{ Throwable -> 0x00c4 }
            if (r5 <= 0) goto L_0x00b6
        L_0x00b2:
            r3.f6188e = r2     // Catch:{ Throwable -> 0x00c4 }
            r3.f6189f = r2     // Catch:{ Throwable -> 0x00c4 }
        L_0x00b6:
            java.util.ArrayList<com.amap.api.mapcore2d.fv> r5 = f6190b     // Catch:{ Throwable -> 0x00c4 }
            boolean r5 = r5.contains(r3)     // Catch:{ Throwable -> 0x00c4 }
            if (r5 != 0) goto L_0x00c3
            java.util.ArrayList<com.amap.api.mapcore2d.fv> r5 = f6190b     // Catch:{ Throwable -> 0x00c4 }
            r5.add(r3)     // Catch:{ Throwable -> 0x00c4 }
        L_0x00c3:
            return
        L_0x00c4:
            r5 = move-exception
            java.lang.String r6 = "CgiManager"
            java.lang.String r0 = "hdlCdmaLocChange"
            com.amap.api.mapcore2d.gc.a(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fw.b(android.telephony.CellLocation, java.lang.String[]):void");
    }

    private static boolean b(int i2) {
        return (i2 == -1 || i2 == 0 || i2 > 65535) ? false : true;
    }

    private fv c(CellLocation cellLocation, String[] strArr) {
        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
        fv fvVar = new fv(1, true);
        fvVar.f6184a = Integer.parseInt(strArr[0]);
        fvVar.f6185b = Integer.parseInt(strArr[1]);
        fvVar.f6186c = gsmCellLocation.getLac();
        fvVar.f6187d = gsmCellLocation.getCid();
        fvVar.j = this.l;
        return fvVar;
    }

    private static boolean c(int i2) {
        return (i2 == -1 || i2 == 0 || i2 == 65535 || i2 >= 268435455) ? false : true;
    }

    private void i() {
        if (this.f6194c != null) {
            try {
                this.f6193a = b(this.f6194c.getCellLocation());
            } catch (SecurityException e2) {
                this.f6195f = e2.getMessage();
            } catch (Throwable th) {
                this.f6195f = null;
                gc.a(th, "CgiManager", "CgiManager");
                this.f6193a = 0;
            }
            try {
                this.o = s();
                switch (this.o) {
                    case 1:
                        this.n = gf.a(this.i, "phone_msim");
                        return;
                    case 2:
                        this.n = gf.a(this.i, "phone2");
                        return;
                    default:
                        this.n = gf.a(this.i, "phone2");
                        break;
                }
            } catch (Throwable unused) {
            }
        }
    }

    private CellLocation j() {
        if (this.f6194c != null) {
            try {
                CellLocation cellLocation = this.f6194c.getCellLocation();
                this.f6195f = null;
                if (a(cellLocation)) {
                    f6192e = cellLocation;
                    return cellLocation;
                }
            } catch (SecurityException e2) {
                this.f6195f = e2.getMessage();
            } catch (Throwable th) {
                this.f6195f = null;
                gc.a(th, "CgiManager", "getCellLocation");
            }
        }
        return null;
    }

    private boolean k() {
        return !this.g && gf.b() - f6191d >= 10000;
    }

    private void l() {
        r();
    }

    private void m() {
        switch (this.f6193a) {
            case 1:
                if (f6190b.isEmpty()) {
                    this.f6193a = 0;
                    return;
                }
                return;
            case 2:
                if (f6190b.isEmpty()) {
                    this.f6193a = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void n() {
        if (!this.g && this.f6194c != null) {
            CellLocation o2 = o();
            if (!a(o2)) {
                o2 = p();
            }
            if (!a(o2)) {
                o2 = null;
            }
            f6192e = o2;
        }
        if (a(f6192e)) {
            String[] a2 = gf.a(this.f6194c);
            switch (b(f6192e)) {
                case 1:
                    a(f6192e, a2);
                    break;
                case 2:
                    b(f6192e, a2);
                    break;
            }
        } else {
            f6190b.clear();
            k.clear();
        }
        if (this.f6194c != null) {
            this.j = this.f6194c.getNetworkOperator();
            if (!TextUtils.isEmpty(this.j)) {
                this.f6193a |= 8;
            }
        }
    }

    @SuppressLint({"NewApi"})
    private CellLocation o() {
        TelephonyManager telephonyManager = this.f6194c;
        CellLocation cellLocation = null;
        if (telephonyManager == null) {
            return null;
        }
        CellLocation j2 = j();
        if (a(j2)) {
            return j2;
        }
        if (gf.c() >= 18) {
            try {
                cellLocation = a(telephonyManager.getAllCellInfo());
            } catch (SecurityException e2) {
                this.f6195f = e2.getMessage();
            }
        }
        if (cellLocation != null) {
            return cellLocation;
        }
        CellLocation a2 = a(telephonyManager, "getCellLocationExt", 1);
        if (a2 != null) {
            return a2;
        }
        CellLocation a3 = a(telephonyManager, "getCellLocationGemini", 1);
        if (a3 != null) {
        }
        return a3;
    }

    private CellLocation p() {
        Object obj = this.n;
        CellLocation cellLocation = null;
        if (obj == null) {
            return null;
        }
        try {
            Class<?> q = q();
            if (q.isInstance(obj)) {
                Object cast = q.cast(obj);
                CellLocation a2 = a(cast, "getCellLocation", new Object[0]);
                if (a2 != null) {
                    return a2;
                }
                try {
                    CellLocation a3 = a(cast, "getCellLocation", 1);
                    if (a3 != null) {
                        return a3;
                    }
                    try {
                        a2 = a(cast, "getCellLocationGemini", 1);
                        if (a2 != null) {
                            return a2;
                        }
                        cellLocation = a(cast, "getAllCellInfo", 1);
                        if (cellLocation != null) {
                            return cellLocation;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cellLocation = a3;
                        gc.a(th, "CgiManager", "getSim2Cgi");
                        return cellLocation;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cellLocation = a2;
                    gc.a(th, "CgiManager", "getSim2Cgi");
                    return cellLocation;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            gc.a(th, "CgiManager", "getSim2Cgi");
            return cellLocation;
        }
        return cellLocation;
    }

    private Class<?> q() {
        String str;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        switch (this.o) {
            case 0:
                str = "android.telephony.TelephonyManager";
                break;
            case 1:
                str = "android.telephony.MSimTelephonyManager";
                break;
            case 2:
                str = "android.telephony.TelephonyManager2";
                break;
            default:
                str = null;
                break;
        }
        try {
            return systemClassLoader.loadClass(str);
        } catch (Throwable th) {
            gc.a(th, "CgiManager", "getSim2TmClass");
            return null;
        }
    }

    private void r() {
        this.f6195f = null;
        f6192e = null;
        this.f6193a = 0;
        f6190b.clear();
    }

    private int s() {
        try {
            Class.forName("android.telephony.MSimTelephonyManager");
            this.o = 1;
        } catch (Throwable unused) {
        }
        if (this.o == 0) {
            try {
                Class.forName("android.telephony.TelephonyManager2");
                this.o = 2;
            } catch (Throwable unused2) {
            }
        }
        return this.o;
    }

    public final int c() {
        return this.f6193a;
    }

    public final int d() {
        return this.f6193a & 3;
    }

    public final TelephonyManager e() {
        return this.f6194c;
    }

    public final void f() {
        try {
            this.g = gf.a(this.i);
            if (k()) {
                n();
                f6191d = gf.b();
            }
            if (this.g) {
                l();
            } else {
                m();
            }
        } catch (SecurityException e2) {
            this.f6195f = e2.getMessage();
        } catch (Throwable th) {
            gc.a(th, "CgiManager", "refresh");
        }
    }

    public final void g() {
        this.m.a();
        this.l = -113;
        this.f6194c = null;
        this.n = null;
    }

    public final String h() {
        return this.j;
    }
}
